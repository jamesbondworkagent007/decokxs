package o;

import android.graphics.BitmapFactory;

/* JADX INFO: renamed from: o.mpv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33094mpv {
    public static int AEQbTJ(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }
}
