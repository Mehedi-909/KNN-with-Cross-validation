package knn;

public class Patient{
	double[] attribute;
	String className;
	double distance;
	double internalDistance;
	int decision1,decision2;
	public Patient(int a,int b) {
		this.attribute = new double[16];
		this.distance = 0;
		this.internalDistance=0;
		decision1=a;
		decision2=b;
	} 	
}
