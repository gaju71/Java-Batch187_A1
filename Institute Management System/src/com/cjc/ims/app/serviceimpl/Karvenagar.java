package com.cjc.ims.app.serviceimpl;

import com.cjc.ims.app.model.*;
import java.util.*;
import com.cjc.ims.app.servicei.Cjc;

public class Karvenagar implements Cjc{
	List<Course> clist=new ArrayList<>();
	List<Faculty> flist=new ArrayList<>();
	List<Batch> blist=new ArrayList<>();
	List<Student> slist=new ArrayList<>();
	
	Scanner sc=new Scanner(System.in);
	
	public void addCourse() {
	 Course c=new Course();
	 System.out.println("Enter course Id");
	        c.setCid(sc.nextInt());
	        System.out.println("Enter course Name");
	        c.setCname(sc.next());
	       clist.add(c);
	       for(Course co:clist) {
	       System.out.println(co.getCid());
	       System.out.println(co.getCname());
	       }
	}
	        public void viewCourse() {
	        	
	        Iterator <Course> itr=clist.iterator();
	        	        	       
	        while(itr.hasNext()) 
	        	
	        {
	        	Course co=itr.next();
	        	System.out.println(co);
	        }
	        }
	        	
	
	    	public void addFaculty() {
	    		 Faculty f=new Faculty();
	    		 System.out.println("Enter Faculty Id");
	    		        f.setFid(sc.nextInt());
	    		        System.out.println("Enter Faculty Name");
	    		        f.setFname(sc.next());
	    		        f.setCourse(clist.get(0));
	    		        
	    		       flist.add(f);
	    		       for(Faculty fa:flist) {
	    		       System.out.println(fa.getFid());
	    		       System.out.println(fa.getFname());
	    		       System.out.println(fa.getCourse());
	    		       }
	    		}
	    		        public void viewFaculty() {
	    		        	
	    		        Iterator <Faculty> itr=flist.iterator();
	    		        	        	       
	    		        while(itr.hasNext()) 
	    		        	
	    		        {
	    		        	Faculty fa=itr.next();
	    		        	System.out.println(fa);
	    		        }
	    		        }
	    
	    		        
	    		    	public void addBatch() {
	    		    		 Batch b=new Batch();
	    		    		 System.out.println("Enter Batch Id");
	    		    		        b.setBid(sc.nextInt());
	    		    		        System.out.println("Enter course Name");
	    		    		        b.setBname(sc.next());
	    		    		        b.setFaculty(flist.get(0));
	    		    		        
	    		    		       blist.add(b);
	    		    		       for(Batch ba:blist) {
	    		    		       System.out.println(ba.getBid());
	    		    		       System.out.println(ba.getBname());
	    		    		       System.out.println(ba.getFaculty());
	    		    		       
	    		    		       }
	    		    		}
	    		    		      public void viewBatch() {
	    		    		        	
	    		    		        Iterator <Batch> itr=blist.iterator();
	    		    		        	        	       
	    		    		        while(itr.hasNext()) 
	    		    		        	
	    		    		        {
	    		    		        	Batch ba=itr.next();
	    		    		        	System.out.println(ba);
	    		    		        }
	    		    		        }
	    		    		        	
	    		    		        
	    		    		    	public void addStudent() {
	    		    		    		 Student s=new Student();
	    		    		    		 System.out.println("Enter Student Id");
	    		    		    		        s.setSid(sc.nextInt());
	    		    		    		        System.out.println("Enter course Name");
	    		    		    		        s.setSname(sc.next());
	    		    		    		        s.setBatch(blist.get(0));
	    		    		    		        
	    		    		    		       slist.add(s);
	    		    		    		       
	    		    		    		       for(Student st:slist) {
	    		    		    		       System.out.println(st.getSid());
	    		    		    		       System.out.println(st.getSname());
	    		    		    		       System.out.println(st.getBatch());
	    		    		    		       }
	    		    		    		       
	    		    		    	}
	    		    		    		    public void viewStudent() {
	    		    		    		        	
	    		    		    		     Iterator <Student> itr=slist.iterator();
	    		    		    		        	        	       
	    		    		    		      while(itr.hasNext()) 
	    		    		    		        	
	    		    		    		      {
	    		    		    		      	Student st=itr.next();
	    		    		    		      	System.out.println(st);
	    		    		    		      }
	    		    		    		      }
	    		    		    		        	
	        	
	        
}
