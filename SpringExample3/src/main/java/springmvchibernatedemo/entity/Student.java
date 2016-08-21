package springmvchibernatedemo.entity;

public class Student {
	 private String id;  
     private String name;  
     private Batch batch;  

     public String getId() {  
          return id;  
     }  
     public void setId(String id) {  
          this.id = id;  
     }  
     public String getName() {  
          return name;  
     }  
     public void setName(String name) {  
          this.name = name;  
     }  
     public Batch getBatch() {  
          return batch;  
     }  
     public void setBatch(Batch batch) {  
          this.batch = batch;  
     }  
}
