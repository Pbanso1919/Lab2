// write a program to check whether java is installed on your computer
class javainstall{
	public static void main(String args[]){
		// java Version:1.8.0_71
		System.out.println("Java Version:" +System.getProperty("Java.Version"));
		// Java Runtime Version:1.8.0_71-b15
		System.out.println("Java Runtime Version"+System.getProperty("java.runtime.version"));
		//java Home:/opt/jdk/jdk1.8.0_71/jre
		System.out.println("Java Home:"+System.getProperty("java.Home"));
		//Java Vendor oracle corporation
		System.out.println("java Vendor:"+System.getproperty("java.vendor"));
		//java Vendor URL:http://java.oracle.com/
		System.out.println("Java Vendor URL:"+ System.getProperty("java.vendor.url"));
		//java Class path:
		System.out.println("Java Class path:"+System.getProperty("java class path"));
	}
}