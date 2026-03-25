package o;

import android.widget.ImageView;

/* JADX INFO: renamed from: o.mAo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C31697mAo {
    public static int OLrzqt(int i) {
        return (i & 65280) >> 8;
    }

    public static void OLrzqt(float f, float f2, float f3) {
        if (f >= f2) {
            throw new java.lang.IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        }
        if (f2 >= f3) {
            throw new java.lang.IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    public static boolean copydefault(android.widget.ImageView imageView) {
        return imageView.getDrawable() != null;
    }

    /* JADX INFO: renamed from: o.mAo$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            KWHzl = iArr;
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
        }
    }

    public static boolean KWHzl(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (AnonymousClass5.KWHzl[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new java.lang.IllegalStateException("Matrix scale type is not supported");
    }
}
