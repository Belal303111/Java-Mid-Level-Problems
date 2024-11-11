import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}

        //Test code
   //=======================
    //    for(int i=0;i<testCases;i++)
    //    for(int j=i+1;j<testCases;j++)
    //    {
    //        if(studentList.get(i).getCgpa()<studentList.get(j).getCgpa())
    //        {
    //             Student temp = studentList.get(i);
    //            studentList.set(i,studentList.get(j));
    //            studentList.set(j,temp);
    //        }
    //       else if(studentList.get(i).getCgpa()==studentList.get(j).getCgpa())
    //        {
    //     int x=studentList.get(i).getFname().compareTo(studentList.get(j).getFname());
    //            if(x<0)
    //            {
    //             Student temp = studentList.get(i);
    //            studentList.set(i,studentList.get(j));
    //            studentList.set(j,temp);
    //            }      
    //       else if(x==0)
    //         {
    //             if(studentList.get(i).getId()>studentList.get(j).getId())
    //             {
    //            Student temp = studentList.get(i);
    //            studentList.set(i,studentList.get(j));
    //            studentList.set(j,temp);
    //             }
    //         }   
    //        }
    //    }
    //===================================

    studentList.sort(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getFname).thenComparing(Student::getId));
    
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



