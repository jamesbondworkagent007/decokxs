package o;

import android.graphics.RectF;
import android.widget.ImageView;

/* JADX INFO: renamed from: o.rjB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C43110rjB {

    /* JADX INFO: renamed from: o.rjB$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            try {
                iArr[ImageView.ScaleType.MATRIX.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            OLrzqt = iArr;
        }
    }

    public static final kotlin.Pair<RectF, java.lang.String> EZpvd(android.view.View view) {
        RectF rectF;
        if (view instanceof android.widget.ImageView) {
            android.widget.ImageView imageView = (android.widget.ImageView) view;
            if (imageView.getDrawable() != null) {
                android.graphics.drawable.Drawable drawable = imageView.getDrawable();
                float fCopydefault = C56548yJl.copydefault(imageView.getWidth(), 1.0f);
                float fCopydefault2 = C56548yJl.copydefault(imageView.getHeight(), 1.0f);
                float fCopydefault3 = C56548yJl.copydefault(drawable.getIntrinsicWidth(), 1.0f);
                float fCopydefault4 = C56548yJl.copydefault(drawable.getIntrinsicHeight(), 1.0f);
                ImageView.ScaleType scaleType = imageView.getScaleType();
                int i = scaleType == null ? -1 : Application.OLrzqt[scaleType.ordinal()];
                if (i == 1) {
                    rectF = new RectF(0.0f, 0.0f, fCopydefault3, fCopydefault4);
                    imageView.getImageMatrix().mapRect(rectF);
                } else if (i != 2) {
                    if (i == 3 || i == 4) {
                        if (fCopydefault3 / fCopydefault4 > fCopydefault / fCopydefault2) {
                            float f = fCopydefault4 * (fCopydefault / fCopydefault3);
                            float f2 = (fCopydefault2 - f) / 2.0f;
                            rectF = new RectF(0.0f, f2, fCopydefault, f + f2);
                        } else {
                            float f3 = fCopydefault3 * (fCopydefault2 / fCopydefault4);
                            float f4 = (fCopydefault - f3) / 2.0f;
                            rectF = new RectF(f4, 0.0f, f3 + f4, fCopydefault2);
                        }
                    } else if (i == 5) {
                        rectF = new RectF(0.0f, 0.0f, fCopydefault, fCopydefault2);
                    } else if (fCopydefault3 / fCopydefault4 > fCopydefault / fCopydefault2) {
                        float f5 = fCopydefault4 * (fCopydefault / fCopydefault3);
                        float f6 = (fCopydefault2 - f5) / 2.0f;
                        rectF = new RectF(0.0f, f6, fCopydefault, f5 + f6);
                    } else {
                        float f7 = fCopydefault3 * (fCopydefault2 / fCopydefault4);
                        float f8 = (fCopydefault - f7) / 2.0f;
                        rectF = new RectF(f8, 0.0f, f7 + f8, fCopydefault2);
                    }
                } else if (fCopydefault3 / fCopydefault4 < fCopydefault / fCopydefault2) {
                    float f9 = fCopydefault4 * (fCopydefault / fCopydefault3);
                    float f10 = (fCopydefault2 - f9) / 2.0f;
                    rectF = new RectF(0.0f, f10, fCopydefault, f9 + f10);
                } else {
                    float f11 = fCopydefault3 * (fCopydefault2 / fCopydefault4);
                    float f12 = (fCopydefault - f11) / 2.0f;
                    rectF = new RectF(f12, 0.0f, f11 + f12, fCopydefault2);
                }
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                float f13 = rectF.left;
                float f14 = iArr[0];
                float f15 = rectF.top;
                float f16 = iArr[1];
                return new kotlin.Pair<>(new RectF(f13 + f14, f15 + f16, rectF.right + f14, rectF.bottom + f16), imageView.getScaleType().name());
            }
        }
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        return new kotlin.Pair<>(new RectF(iArr2[0], iArr2[1], r1 + view.getWidth(), iArr2[1] + view.getHeight()), "");
    }
}
