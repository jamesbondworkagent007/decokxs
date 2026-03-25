package org.jdom2.input;

import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.xml.sax.SAXParseException;

/* JADX INFO: loaded from: classes24.dex */
public class JDOMParseException extends JDOMException {
    private static final long serialVersionUID = 200;
    private final Document partialDocument;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Document getPartialDocument() {
        return this.partialDocument;
    }

    public JDOMParseException(String str, Throwable th) {
        this(str, th, null);
    }

    public JDOMParseException(String str, Throwable th, Document document) {
        super(str, th);
        this.partialDocument = document;
    }

    public String getPublicId() {
        if (getCause() instanceof SAXParseException) {
            return ((SAXParseException) getCause()).getPublicId();
        }
        return null;
    }

    public String getSystemId() {
        if (getCause() instanceof SAXParseException) {
            return ((SAXParseException) getCause()).getSystemId();
        }
        return null;
    }

    public int getLineNumber() {
        if (getCause() instanceof SAXParseException) {
            return ((SAXParseException) getCause()).getLineNumber();
        }
        return -1;
    }

    public int getColumnNumber() {
        if (getCause() instanceof SAXParseException) {
            return ((SAXParseException) getCause()).getColumnNumber();
        }
        return -1;
    }
}
