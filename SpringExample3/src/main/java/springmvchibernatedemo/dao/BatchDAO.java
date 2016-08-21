package springmvchibernatedemo.dao;

import java.util.List;

import springmvchibernatedemo.entity.Batch;

public class BatchDAO  {

	 @SuppressWarnings("unchecked")  
     public List<Batch> getBatchList() {  
          String query = "select b from Batch b";  
          return null;
     }  

}
