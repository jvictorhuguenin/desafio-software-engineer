package core;

import infrastructure.DataInterface;
import infrastructure.DataInterfaceFactory;
import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
  private static final Integer TOTAL_OF_CLASSES_PER_SEMESTER = 60;
  private final DataInterface dataInterface;

  private List<Student> students = new ArrayList<>();

  public SchoolClass(DataInterface dataInterface) {
    this.dataInterface = DataInterfaceFactory.getDataInterface("SHEET");
  }

  private void setStudentsList(){
    this.students = Student.getStudentsByDataRows(dataInterface.getRows());
  }

  public List<Student> getStudents(){
    if (students.isEmpty()){
      setStudentsList();
    }
    for (Student student : students) {
      student.updateStatus(TOTAL_OF_CLASSES_PER_SEMESTER);
    }
    return students;
  }
}
