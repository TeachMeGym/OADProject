package ie.ittralee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by t00185369 on 10/12/2015.
 */
public class VideoLibrary{
    private static ArrayList<Video> videoLibrary;

    public static void videoLibrary(){
        List<Video> videoLibrary = new ArrayList<Video>();
    }

    public void addVideo(Video video){

        videoLibrary.add(video);
    }

    public  static List<Video> getVideos(){
        return videoLibrary;
    }

}


