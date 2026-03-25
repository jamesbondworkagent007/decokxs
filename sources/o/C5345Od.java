package o;

import com.google.android.exoplayer2.util.MimeTypes;

/* JADX INFO: renamed from: o.Od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5345Od {
    public static boolean AEQbTJ(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    private C5345Od() {
    }

    public static boolean AEQbTJ(android.net.Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean copydefault(android.net.Uri uri) {
        return uri.getPathSegments().contains(MimeTypes.BASE_TYPE_VIDEO);
    }

    public static boolean OLrzqt(android.net.Uri uri) {
        return AEQbTJ(uri) && copydefault(uri);
    }

    public static boolean KWHzl(android.net.Uri uri) {
        return AEQbTJ(uri) && !copydefault(uri);
    }
}
