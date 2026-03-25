package o;

import okhttp3.Headers;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes8.dex */
public class mMQ {
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public Headers AhwBna;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public Headers djBIcL;
    public HttpUrl gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(java.lang.String str) {
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String OLrzqt() {
        return this.copydefault;
    }

    public mMQ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, HttpUrl httpUrl, Headers headers, Headers headers2, java.lang.String str5) {
        this.AEQbTJ = str;
        this.KWHzl = str2;
        this.EZpvd = str3;
        this.AYXKKw = str4;
        this.gEmmrt = httpUrl;
        this.AhwBna = headers;
        this.djBIcL = headers2;
        this.OLrzqt = str5;
    }
}
