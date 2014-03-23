package org.groept.cloudMigration.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Teacher {

    @Id
    private ObjectId id;
    private String username;
    private String area;
    private int age;

    public Teacher() {
    }

    public Teacher(String username, String area,int age) {
        this.id = new ObjectId();
        this.username = username;
        this.area = area;
        this.age=age;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

  

    public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*@Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", area='" + area + '\'' +
                ", age='" + age + '\'' +
                '}';
    }*/
}
