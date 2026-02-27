import java.io.*;
interface Metadata {
    void displayMetadata();
}
abstract class Media {
    String title;

    Media(String title) {
        this.title = title;
    }

    abstract void process();
}

class ImageMedia extends Media implements Metadata {

    ImageMedia(String title) {
        super(title);
    }

    void process() {
        System.out.println("Processing Image: " + title);
    }

    public void displayMetadata() {
        System.out.println("Media Title: " + title);
    }
}

public class Main {

    public static void main(String[] args) throws Exception {

        ImageMedia img = new ImageMedia("Photo.jpg");

        img.process();
        img.displayMetadata();
        FileWriter fw = new FileWriter("media.txt");
        fw.write("Media File: Photo.jpg");
        fw.close();

        System.out.println("Metadata written to file");

    }
}