package o;

import org.apache.http.conn.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: o.zmb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@java.lang.Deprecated
public final class C59732zmb {
    public static C59636zkl EZpvd() {
        C59636zkl c59636zkl = new C59636zkl();
        c59636zkl.EZpvd(new C59635zkk("http", 80, C59628zkd.KWHzl()));
        c59636zkl.EZpvd(new C59635zkk("https", 443, SSLSocketFactory.getSocketFactory()));
        return c59636zkl;
    }
}
