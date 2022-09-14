package core;

import java.util.ArrayList;
import java.util.List;

public class Student {
  private final Integer id;

  private final String name;

  private final Integer absenceCount;

  private final Integer p1Score;

  private final Integer p2Score;

  private final Integer p3Score;

  // Can be null at the first moment.
  private String status;

  // Can be null at the first moment.
  private Integer neededScoreForApproval = 0;

  public Student(Integer id, String name, Integer absenceCount, Integer p1Note, Integer p2Note, Integer p3Note) {
    this.id = id;
    this.name = name;
    this.absenceCount = absenceCount;
    this.p1Score = p1Note;
    this.p2Score = p2Note;
    this.p3Score = p3Note;
  }

  public String updateStatus(int totalOfClasses){
    if (absenceCount > totalOfClasses/4){
      this.status = "Reprovado por Falta";
      return status;
    }

    final int mean = (int) Math.round((p1Score + p2Score + p3Score)/3.0);
    if (mean < 50){
      this.status = "Reprovado por nota";
    } else if (mean < 70){
      this.status = "Exame Final";
      this.neededScoreForApproval = 100 - mean;
    }else{
      this.status = "Aprovado";
    }
    return status;
  }

  public static List<Student> getStudentsByDataRows(List<List<Object>> rowsData){
    List<Student> resultList = new ArrayList<>();
    for (int i = 0; i < rowsData.size(); i++) {
      List<Object> currentRow = rowsData.get(i);

      if (currentRow.size() < 6){
        throw new RuntimeException("There is missing data for the students in the row " + i);
      }
      resultList.add(fromRow(currentRow));
    }
    return resultList;
  }

  private static Student fromRow(List<Object> row){
    return new Student(
        Integer.getInteger(row.get(0).toString()),
        row.get(1).toString(),
        Integer.getInteger(row.get(2).toString()),
        Integer.getInteger(row.get(3).toString()),
        Integer.getInteger(row.get(4).toString()),
        Integer.getInteger(row.get(5).toString())
    );
  }

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Integer getAbsenceCount() {
    return absenceCount;
  }

  public Integer getP1Score() {
    return p1Score;
  }

  public Integer getP2Score() {
    return p2Score;
  }

  public Integer getP3Score() {
    return p3Score;
  }

  public String getStatus() {
    return status;
  }

  public Integer getNeededScoreForApproval() {
    return neededScoreForApproval;
  }
}
