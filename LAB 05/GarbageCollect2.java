public class GarbageCollect2{  
	protected void finalize(){
		System.out.println("Object is garbage collected and destroyed");
	}  
	public static void main(String args[]){  
		GarbageCollect2 s1=new GarbageCollect2();  
		GarbageCollect2 s2=new GarbageCollect2();  
		s1=null;  
		s2=null;  
		System.gc();  
	}  
}  
