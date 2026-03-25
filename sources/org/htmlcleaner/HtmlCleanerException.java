package org.htmlcleaner;

/* JADX INFO: loaded from: classes13.dex */
public class HtmlCleanerException extends RuntimeException {
    public HtmlCleanerException() {
        this("HtmlCleaner expression occureed!");
    }

    public HtmlCleanerException(Throwable th) {
        super(th);
    }

    public HtmlCleanerException(String str) {
        super(str);
    }

    public HtmlCleanerException(String str, Throwable th) {
        super(str, th);
    }
}
