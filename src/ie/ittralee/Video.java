package ie.ittralee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by t00185369 on 10/12/2015.
 */
public class Video{
    private String videoTitle;
    private String videoDescription;
    private String videoCategory;
    private int videoLevel;

    public void Video(String videoT, String videoD, String videoC, int videoL ){

        List<Video> playlistvideo = new ArrayList<Video>();
        videoTitle = videoT;
        videoDescription = videoD;
        videoCategory = videoC;
        videoLevel = videoL;
    }

    public String getVideoTitle(){
        return videoTitle;
    }

    public String getVideoDescription(){
        return videoDescription;
    }

    public String getVideoCategory(){
        return videoCategory;
    }

    public 	int getVideoLevel(){
        return videoLevel;
    }
}
