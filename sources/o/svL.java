package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes10.dex */
public final class svL {
    public static final boolean KWHzl(java.lang.String str) {
        java.lang.String host;
        java.lang.String path;
        try {
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
                return false;
            }
            android.net.Uri uri = android.net.Uri.parse(str);
            if (uri.getScheme() == null) {
                return false;
            }
            if ((Intrinsics.EZpvd((java.lang.Object) uri.getScheme(), (java.lang.Object) "http") || Intrinsics.EZpvd((java.lang.Object) uri.getScheme(), (java.lang.Object) "https")) && (host = uri.getHost()) != null && host.length() > 0 && (path = uri.getPath()) != null) {
                return path.length() > 0;
            }
            return false;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public static final android.net.Uri OLrzqt(android.net.Uri uri, android.content.Context context) {
        java.lang.String strKWHzl = KWHzl(uri);
        java.io.File filesDir = context.getFilesDir();
        if (filesDir == null) {
            return null;
        }
        return android.net.Uri.fromFile(new java.io.File(filesDir, strKWHzl));
    }

    public static final java.lang.String KWHzl(android.net.Uri uri) {
        java.lang.String lastPathSegment;
        if (uri != null && (lastPathSegment = uri.getLastPathSegment()) != null) {
            return lastPathSegment;
        }
        return "file_" + java.lang.System.currentTimeMillis();
    }
}
