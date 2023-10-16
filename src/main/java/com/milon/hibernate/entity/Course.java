package com.milon.hibernate.entity;

import jakarta.persistence.*;

@Entity
public class Course {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "course_name")
	private String courseName;
	private String duration;
	
    @OneToOne(cascade = CascadeType.ALL,mappedBy = "course")
    @JoinColumn(name = "student_id")
	private Student student;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(String courseName, String duration) {
		super();
		this.courseName = courseName;
		this.duration = duration;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", duration=" + duration + ", student=" + student
				+ "]";
	}

	
}
