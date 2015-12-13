package ie.ittralee;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by t00185369 on 10/12/2015.
 */

public class Playlist{
    private List videos;
    
    private String playlistName;
    private String playlistDescription;
    private String playlistCategory;
    private int playlistLevel;
    private ArrayList<Video> playlistVideos;

    public Playlist(String playlistName,String playlistDescription, String playlistCategory, int playlistLevel){
        this.playlistName =playlistName;
        this.playlistDescription = playlistDescription;
        this.playlistCategory = playlistCategory;
        this.playlistLevel = playlistLevel;
        videos = new ArrayList();
    }
    
    public void addVideo(String videoId, VideoSpec spec){
        Video video = new Video (videoId, spec);
        videos.add(video);
    }
    
    public Video getVideo(String videoId){

        for (Iterator i = videos.iterator(); i.hasNext(); ) {
            Video video = (Video)i.next();
            if (video.getVideoId().equals(videoId)) {
                return video;
            }
        }
        return null;
    }

    public List search(VideoSpec searchSpec) {
        List matchingVideos = new LinkedList();

        for (Iterator i = videos.iterator(); i.hasNext(); ) {
            Video video = (Video) i.next();
            if (video.getSpec().matches(searchSpec)) {
                matchingVideos.add(video);
            }
            return matchingVideos;
        }
        return null;
    }
}
