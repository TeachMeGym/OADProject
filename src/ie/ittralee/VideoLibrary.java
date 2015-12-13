package ie.ittralee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by t00185369 on 10/12/2015.
 */

public class VideoLibrary{
    private static ArrayList<Video> videoLibrary;

    public void VideoLibrary(){
        videoLibrary = new ArrayList<Video>();
    }

    public static void setLibrary(){
        videoLibrary = new ArrayList<Video>();
    }

    public static void addVideo(String videoId, VideoSpec spec){
        Video video = new Video (videoId, spec);
        videoLibrary.add(video);
    }

    public static List search(VideoSpec searchSpec) {
        List matchingVideos = new LinkedList();

        for (Video video : videoLibrary) {
            if (video.getSpec().matches(searchSpec)) {
                matchingVideos.add(video);
            }

        }
        return matchingVideos;
    }

    public  static List<Video> getVideos(){
        return videoLibrary;
    }
}


