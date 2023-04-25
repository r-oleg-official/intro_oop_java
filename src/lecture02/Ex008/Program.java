package lecture02.Ex008;

import lecture02.Ex008.Applications.Notepad;
import lecture02.Ex008.Format.Doc;
import lecture02.Ex008.Format.Md;
import lecture02.Ex008.Format.Txt;

public class Program {
    public static void main(String[] args) {

        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText("text1");
        notes.currentDocument().addAllText("text2");
        notes.currentDocument().addAllText("text3");
        notes.SaveAs("file1", new Txt());
        notes.SaveAs("file2", new Md());
        notes.SaveAs("file3", new Doc());
    }
}
