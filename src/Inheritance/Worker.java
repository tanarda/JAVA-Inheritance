package Inheritance;

public class Worker {
	private String name;
	private String surName;
	private int id;

	public Worker(String name, String surName, int id) {
		this.name = name;
		this.surName = surName;
		this.id = id;
	}

	public void showInfo() {
		System.out.println("Bilgileri Göster..");
		System.out.println("Name : " + name);
		System.out.println("surName : " + surName);
		System.out.println("Id : " + id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getsurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
