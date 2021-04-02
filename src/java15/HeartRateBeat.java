package java15;

public class HeartRateBeat extends HeartRates {
	String gender;
	double height,weight;


	public HeartRateBeat(String firstname, String lastname, int birthyear,
			String gender,double weight,double height) {
		super(firstname, lastname, birthyear);
		this.gender=gender;
		this.height=height;
		this.weight=weight;
	}

	@Override
	public void Calculate() {
		super.Calculate();
		System.out.println("Your Gender is: "+ gender);
		System.out.println("Your Height is: "+ height);
		System.out.println("Your Weight is: "+ weight);
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
	






