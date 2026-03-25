package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
public final class sIV {
    public static final boolean copydefault(java.lang.String str) {
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
}
