package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		FixedZarplata Petrov = new FixedZarplata("������ =  ", 5000);
		HourZarplata Stepanov = new HourZarplata("������ =  ", 158, 35.2);

		Petrov.zarplata();
		Stepanov.zarplata();
	}

}
