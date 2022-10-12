package AssignmentClassAndObject;

public class Pationt 
{

	String patientName;
	double height;
	double weight;
	public Pationt() {
		// TODO Auto-generated constructor stub
	}
	
	public Pationt(String patientName, double height, double weight) {
		super();
		this.patientName = patientName;
		this.height = height;
		this.weight = weight;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
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
	public Double computeBMI()
	{
		return weight/(height*height);
		
	}
}
