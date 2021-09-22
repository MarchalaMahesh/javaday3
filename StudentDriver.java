package javaday3;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1 = new Student("dfgh",1,"jgh",6543);
		Student s2 = new Student("fghj",2,"oiuhg",5678);
		Student s3 = new Student("fds",3,"dfv",5432);
		
		s1.setName("mahesh");
		s1.setId(1);
		s1.setBranch("ece");
		s1.setPhn(98533476);
		
		System.out.println("student1 details......");
		System.out.println("student name :"+s1.getName());
		System.out.println("student id :"+s1.getId());
		System.out.println("student branch :"+s1.getBranch());
		System.out.println("student phone number :"+s1.getPhn());
		
		System.out.println(".....................................................");
		s2.setName("jhg");
		s2.setId(2);
		s2.setBranch("cse");
		s2.setPhn(1234567);
		
		System.out.println("student2 details......");
		System.out.println("student name :"+s2.getName());
		System.out.println("student id :"+s2.getId());
		System.out.println("student branch :"+s2.getBranch());
		System.out.println("student phone number :"+s2.getPhn());
		
		System.out.println(".....................................................");
		s3.setName("oiu");
		s3.setId(3);
		s3.setBranch("eee");
		s3.setPhn(56789);
		
		System.out.println("student3 details......");
		System.out.println("student name :"+s3.getName());
		System.out.println("student id :"+s3.getId());
		System.out.println("student branch :"+s3.getBranch());
		System.out.println("student phone number :"+s3.getPhn());
		
			
		
	}

}
