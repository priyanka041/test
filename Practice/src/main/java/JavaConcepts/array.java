package JavaConcepts;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int i[]= new int [4];
	i[0] = 10;
	i[1] = 20;
	i[2]= 30;
	i[3]= 40;
	System.out.println(i[2]);
	System.out.println(i.length);
	/*for(int a= i.length-1; a>=0; a--) {
		System.out.println(i[a]);
	}*/
String s[]= new String[3];
s[0]= "Hello";
s[1]= "Priyanka";
s[2]= "Welcome";

for (int j=0; j<=s.length-1; j++) {
System.out.println(s[j]);

/*for (int k= s.length-1; k>=0; k--) {
	System.out.println(s[k]);*/
}
Object ob[]= new Object[5];
ob[0]= 10;
ob[1] = "Priyanka";
ob[2] = 'F';
ob[3] = 17.73;
ob[4] = "Noida";
/*for (int b=ob.length-1; b>=0; b--) {
	System.out.println(ob[b]);*/

/*for(int x= 0; x<=ob.length-1; x++) {
	System.out.println(ob[x]);*/
	
	for(int v= ob.length-1; v>=0; v--) {
		System.out.println(ob[v]);
	}
}
	}

	

