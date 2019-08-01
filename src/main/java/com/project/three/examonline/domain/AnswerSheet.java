package com.project.three.examonline.domain;

/**
 * 用于表示答题卡
 */
public class AnswerSheet {
	//fields
	private Integer id;
	private Integer studentId;
	private Integer examId;
	private Integer teacherId;
	private String score;
	private String answer;

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "AnswerSheet{" +
				"id=" + id +
				", studentId=" + studentId +
				", examId=" + examId +
				", teacherId=" + teacherId +
				", score='" + score + '\'' +
				", answer='" + answer + '\'' +
				'}';
	}

	public Integer getExamId() {
		return examId;
	}

	public void setExamId(Integer examId) {
		this.examId = examId;
	}

	/**
	 * id:数据库id
	 * studentId:答题人(学生)的数据库id
	 * examId:对应试卷的Id
	 * teacherId:阅卷人(老师)的数据库id
	 * score:成绩/得分,null表示未打分
	 * answer:答题内容
	 */
	
	//constructors
	public AnswerSheet() {
		super();
	}
	public AnswerSheet(Integer id, Integer studentId, Integer testPaperId, Integer teacherId, String score,
			String content) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.examId = testPaperId;
		this.teacherId = teacherId;
		this.score = score;
		this.answer = content;
	}
	
	//methods

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}
}
