package ua.lviv.lgs;

public abstract class Worker {
	private String name;

	public Worker(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
