package com.milon.hibernate.entity;

import jakarta.persistence.*;

@Entity
public class Student {
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    private String name;
    private String city;
	
    @OneToOne
    @JoinColumn(name = "course_id")
    private Course course;

	public Student() {
		super();
	}

	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", course=" + course + "]";
	}


}
