package o;

import android.graphics.Bitmap;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public final class SI {
    public static volatile android.os.Handler OLrzqt;
    public static final char[] copydefault = "0123456789abcdef".toCharArray();
    public static final char[] KWHzl = new char[64];

    public static int KWHzl(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static boolean KWHzl(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    private SI() {
    }

    public static java.lang.String AEQbTJ(@androidx.annotation.NonNull byte[] bArr) {
        java.lang.String strEZpvd;
        char[] cArr = KWHzl;
        synchronized (cArr) {
            strEZpvd = EZpvd(bArr, cArr);
        }
        return strEZpvd;
    }

    public static java.lang.String EZpvd(@androidx.annotation.NonNull byte[] bArr, @androidx.annotation.NonNull char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = copydefault;
            cArr[i2] = cArr2[(b & UnsignedBytes.MAX_VALUE) >>> 4];
            cArr[i2 + 1] = cArr2[b & Ascii.SI];
        }
        return new java.lang.String(cArr);
    }

    public static int KWHzl(@androidx.annotation.NonNull android.graphics.Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            throw new java.lang.IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (java.lang.NullPointerException unused) {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
    }

    public static int EZpvd(int i, int i2, @androidx.annotation.Nullable Bitmap.Config config) {
        return i * i2 * copydefault(config);
    }

    public static int copydefault(@androidx.annotation.Nullable Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = AnonymousClass2.copydefault[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    /* JADX INFO: renamed from: o.SI$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] copydefault;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            copydefault = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                copydefault[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                copydefault[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                copydefault[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                copydefault[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    public static boolean OLrzqt(int i, int i2) {
        return KWHzl(i) && KWHzl(i2);
    }

    public static void copydefault(java.lang.Runnable runnable) {
        AEQbTJ().post(runnable);
    }

    public static void KWHzl(java.lang.Runnable runnable) {
        AEQbTJ().removeCallbacks(runnable);
    }

    public static android.os.Handler AEQbTJ() {
        if (OLrzqt == null) {
            synchronized (SI.class) {
                if (OLrzqt == null) {
                    OLrzqt = new android.os.Handler(android.os.Looper.getMainLooper());
                }
            }
        }
        return OLrzqt;
    }

    public static void copydefault() {
        if (!OLrzqt()) {
            throw new java.lang.IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static void KWHzl() {
        if (!EZpvd()) {
            throw new java.lang.IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static boolean OLrzqt() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    public static boolean EZpvd() {
        return !OLrzqt();
    }

    public static <T> Queue<T> copydefault(int i) {
        return new ArrayDeque(i);
    }

    public static <T> java.util.List<T> AEQbTJ(@androidx.annotation.NonNull java.util.Collection<T> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
        for (T t : collection) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static boolean AEQbTJ(@androidx.annotation.Nullable java.lang.Object obj, @androidx.annotation.Nullable java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static boolean KWHzl(@androidx.annotation.Nullable java.lang.Object obj, @androidx.annotation.Nullable java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj instanceof InterfaceC5383Pp) {
            return ((InterfaceC5383Pp) obj).EZpvd(obj2);
        }
        return obj.equals(obj2);
    }

    public static int EZpvd(int i) {
        return KWHzl(i, 17);
    }

    public static int OLrzqt(float f) {
        return EZpvd(f, 17);
    }

    public static int EZpvd(float f, int i) {
        return KWHzl(java.lang.Float.floatToIntBits(f), i);
    }

    public static int OLrzqt(@androidx.annotation.Nullable java.lang.Object obj, int i) {
        return KWHzl(obj == null ? 0 : obj.hashCode(), i);
    }

    public static int OLrzqt(boolean z, int i) {
        return KWHzl(z ? 1 : 0, i);
    }
}
