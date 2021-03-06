import java.util.Comparator;

public class NotenDatumVergleicher implements Comparator<Note> {

    // compareTo
    public int compare(Note notePre, Note notePost) {
        return notePre.getDatum().compareTo(notePost.getDatum());
    }
}
