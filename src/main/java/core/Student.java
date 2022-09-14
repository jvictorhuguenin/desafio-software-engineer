package core;

public class User {
  private final Integer id;

  private final String name;

  private final Integer absenceCount;

  private final Integer p1Note;

  private final Integer p2Note;

  private final Integer p3Note;

  // Can be null at the first moment.
  private String status;

  // Can be null at the first moment.
  private Integer neededScoreForApproval;

  public User(Integer id, String name, Integer absenceCount, Integer p1Note, Integer p2Note, Integer p3Note) {
    this.id = id;
    this.name = name;
    this.absenceCount = absenceCount;
    this.p1Note = p1Note;
    this.p2Note = p2Note;
    this.p3Note = p3Note;
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

  public Integer getP1Note() {
    return p1Note;
  }

  public Integer getP2Note() {
    return p2Note;
  }

  public Integer getP3Note() {
    return p3Note;
  }
}
