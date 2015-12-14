package ie.ittralee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by t00185369 on 10/12/2015.
 */

public class MediaLibrary {
    private static ArrayList<Media> mediaLibrary;

    public void MediaLibrary(){
        mediaLibrary = new ArrayList<Media>();
    }

    public static void setLibrary(){
        mediaLibrary = new ArrayList<Media>();
    }

    public static void addVideo(Media newMedia){
        mediaLibrary.add(newMedia);
    }

    public static List search(Media searchSpec) {
        List matchingVideos = new LinkedList();

        for (Media media : mediaLibrary) {
            if (media.matches(searchSpec)) {
                matchingVideos.add(media);
            }

        }
        return matchingVideos;
    }

    public  static List<Media> getVideos(){
        return mediaLibrary;
    }
}


