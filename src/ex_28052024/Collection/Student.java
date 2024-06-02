package ex_28052024.Collection;

import java.util.Comparator;

class SortByIdAsc implements Comparator <Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getId(), o2.getId());
	}
	
	
}

class SortByIdDesc implements Comparator <Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getId(), o1.getId());	}
	
}


class SortByNameAsc implements Comparator <Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

class SortByNameDesc implements Comparator <Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getName().compareTo(o1.getName());
	}
	
}


public class Student implements Comparable <Student>{
	
	private Integer id;
	private String name;
	
	
	public Student(Integer id, String name) {
		
		this.id = id;
		this.name = name;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}




//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		return Integer.compare(this.id, o.id);
//	}
	
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return CharSequence.compare(this.name, o.name);
	}
	
	
	
	
	

}
