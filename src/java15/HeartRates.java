package java15;


public class HeartRates {
private String firstname;
private String lastname;
private int birthyear;


public HeartRates(String firstname, String lastname,int birthyear) {
	this.firstname=firstname;
	this.lastname=lastname;
	this.birthyear=birthyear;


}
public void Calculate() {
  
	System.out.println("Your first name is:" +firstname);
	System.out.println("Your last name is:" +lastname);
	System.out.println("Your age is:" +(2020- birthyear));
}
/**
 * @return the firstname
 */
public String getFirstname() {
	return firstname;
}
/**
 * @param firstname the firstname to set
 */
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
/**
 * @return the lastname
 */
public String getLastname() {
	return lastname;
}
/**
 * @param lastname the lastname to set
 */
public void setLastname(String lastname) {
	this.lastname = lastname;
}
/**
 * @return the birthyear
 */
public double getBirthyear() {
	return birthyear;
}
/**
 * @param birthyear the birthyear to set
 */
public void setBirthyear(int birthyear) {
	this.birthyear = birthyear;
}
/**
 * @return the age
 */

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}


}






