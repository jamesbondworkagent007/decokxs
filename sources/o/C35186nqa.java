package o;

import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nqa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35186nqa {
    public static final C35186nqa AEQbTJ = new C35186nqa();
    public static java.util.Map<java.lang.String, C35201nqp> KWHzl = new LinkedHashMap();
    public static final java.util.Map<java.lang.String, java.util.Map<java.lang.String, C35201nqp>> copydefault = new LinkedHashMap();
    public static final androidx.collection.LruCache<java.lang.String, SoftReference<C35201nqp>> EZpvd = new androidx.collection.LruCache<>(50);
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, C35201nqp>> AEQbTJ() {
        return copydefault;
    }

    private C35186nqa() {
    }

    public final C35201nqp EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        C35201nqp c35201nqp;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.util.Map<java.lang.String, C35201nqp> map = copydefault.get(str);
        if (map != null && (c35201nqp = map.get(str2)) != null) {
            return c35201nqp;
        }
        SoftReference<C35201nqp> softReference = EZpvd.get(str2);
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Map<java.lang.String, C35201nqp> map = copydefault.get(str);
        if (map != null) {
            for (Map.Entry<java.lang.String, C35201nqp> entry : map.entrySet()) {
                android.graphics.Bitmap bitmapEZpvd = entry.getValue().EZpvd();
                android.graphics.Bitmap bitmapOLrzqt = entry.getValue().OLrzqt();
                androidx.collection.LruCache<java.lang.String, SoftReference<C35201nqp>> lruCache = EZpvd;
                java.lang.String key = entry.getKey();
                C35201nqp value = entry.getValue();
                android.graphics.Bitmap bitmapEZpvd2 = entry.getValue().EZpvd();
                android.graphics.Bitmap bitmap = bitmapEZpvd2 == null ? bitmapEZpvd : bitmapEZpvd2;
                android.graphics.Bitmap bitmapOLrzqt2 = entry.getValue().OLrzqt();
                lruCache.put(key, new SoftReference<>(value.EZpvd((222 & 1) != 0 ? value.AEQbTJ : bitmap, (222 & 2) != 0 ? value.djBIcL : null, (222 & 4) != 0 ? value.KWHzl : null, (222 & 8) != 0 ? value.gEmmrt : null, (222 & 16) != 0 ? value.AYXKKw : null, (222 & 32) != 0 ? value.copydefault : bitmapOLrzqt2 == null ? bitmapOLrzqt : bitmapOLrzqt2, (222 & 64) != 0 ? value.EZpvd : 0, (222 & 128) != 0 ? value.OLrzqt : null)));
            }
        }
        if (map != null) {
            map.clear();
        }
    }
}
