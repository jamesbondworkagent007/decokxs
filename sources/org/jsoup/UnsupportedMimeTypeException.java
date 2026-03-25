package org.jsoup;

import java.io.IOException;

/* JADX INFO: loaded from: classes24.dex */
public class UnsupportedMimeTypeException extends IOException {
    private String mimeType;
    private String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getMimeType() {
        return this.mimeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getUrl() {
        return this.url;
    }

    public UnsupportedMimeTypeException(String str, String str2, String str3) {
        super(str);
        this.mimeType = str2;
        this.url = str3;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + ". Mimetype=" + this.mimeType + ", URL=" + this.url;
    }
}
