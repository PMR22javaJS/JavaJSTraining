import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@DevelopedBy(name="XYZ",version=1.0)
class PickleJar{
	
	private String content;
	
	public void openJar() {
		System.out.println("opening the jar..........");
	}
	
	@DontForget(message="Close it tightly")
	public void closeJar() {
		System.out.println("closing the jar.......");
	}
	
	public void refillJar() {
		System.out.println("refilling the jar.........");
	}
}


public class AnnotationTest {
	public static void main(String[] args) {
		
		//wait, wait, wait, notify, notify
		// hashCode, equals, toString, finalize, clone
		//getClass
		PickleJar pickleJar=new PickleJar();
	
		//every object of an "Object" class
		//got a method called as getClass()
		//that returns the object of class Class
		
		Class theMirror=pickleJar.getClass();
		Annotation annos[]=theMirror.getAnnotations();
		
		for(Annotation annotation:annos) {
			if(annotation instanceof DevelopedBy) {
				DevelopedBy devBy=(DevelopedBy)annotation;
				if(devBy.name().equals("XYZ")) {
					System.out.println("Yes, developed by XYZ");
					
					if(devBy.version()==1.0) {
						System.out.println("YES, version is 1.0");
						
						pickleJar.openJar();
						pickleJar.refillJar();
						
						Method methodAnnos[]=theMirror.getMethods();
						
						for(Method method:methodAnnos) {
							
							Annotation methodAn[]=method.getAnnotations();
							
							for(Annotation methAn:methodAn) {
								
								if(methAn  instanceof DontForget) {
									DontForget dontForget=(DontForget) methAn;
									
									if(dontForget.message().equals("Close it tightly")) {
										pickleJar.closeJar();
									}
									else {
										System.out.println("Jar left open.........");
									}
								}
							}
						}
						
						
					}
					else {
						System.out.println("NO, version in not 1.0");
					}
				}
				else {
					System.out.println("NO, not developed by XYZ");
				}
			}
		}
		
//		pickleJar.openJar();
//		pickleJar.closeJar();
//		pickleJar.refillJar();
	}
}
