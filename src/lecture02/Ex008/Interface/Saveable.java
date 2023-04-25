package lecture02.Ex008.Interface;

import lecture02.Ex008.Document.TextDocument;
import lecture02.Ex008.Format.TextFormat;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
