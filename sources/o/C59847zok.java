package o;

import java.nio.charset.UnsupportedCharsetException;

/* JADX INFO: renamed from: o.zok, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C59847zok {
    public static java.nio.charset.Charset KWHzl(java.lang.String str) throws java.io.UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        try {
            return java.nio.charset.Charset.forName(str);
        } catch (UnsupportedCharsetException unused) {
            throw new java.io.UnsupportedEncodingException(str);
        }
    }
}
