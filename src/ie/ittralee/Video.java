package ie.ittralee;

import java.io.File;

/**
 * Created by Yann_2 on 14/12/2015.
 */
public class Video extends Media {

    private File videoFile;

    public Video(String title, String desc, Category mediaCategory, int level, int ratings, File videoFile) {
        super(title, desc, mediaCategory, level, ratings);
        this.videoFile=videoFile;
    }

    public File getVideoFile(){
        return videoFile;
    }
}
