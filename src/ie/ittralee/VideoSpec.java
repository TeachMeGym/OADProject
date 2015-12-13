/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.ittralee;

/**
 *
 * @author 
 * 
 */
public class VideoSpec {
    private final String videoTitle;
    private final String videoDescription; 
    private final Category category;
    private final int exerciseLevel;
   
    public VideoSpec(String title, String desc, Category category, int level){
        this.videoTitle = title;
        this.videoDescription =desc;
        this.category = category;
        this.exerciseLevel=level;       
    }
    
    public String getVideoTitle(){
        return videoTitle;
    }
    

     public String getVideoDescription(){
        return videoDescription;
    }
    
     public Category getCategory(){
         return category;
     }
     
      public int getExerciseLevel(){
        return exerciseLevel;
    }
     
     public boolean matches(VideoSpec otherSpec){

         if((otherSpec.getVideoTitle() != null) && (!otherSpec.getVideoTitle().equals("")) &&
                 (!videoTitle.toLowerCase().equals(otherSpec.videoTitle.toLowerCase())))
             return false;

         if((otherSpec.getVideoDescription() != null) && (!otherSpec.getVideoDescription().equals("")) &&
                 (!videoDescription.toLowerCase().equals(otherSpec.videoDescription.toLowerCase())))
             return false;

         if((otherSpec.getCategory() != null) && (category!=otherSpec.category))
             return false;

         if((otherSpec.getExerciseLevel() != 0) && (exerciseLevel!=otherSpec.getExerciseLevel()))
             return false;

         return true;
     }
}




