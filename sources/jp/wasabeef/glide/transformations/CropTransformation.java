package jp.wasabeef.glide.transformations;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import o.OG;
import o.yCW;

/* JADX INFO: loaded from: classes24.dex */
public class CropTransformation extends yCW {
    public int EZpvd;
    public int KWHzl;
    public CropType copydefault;

    public enum CropType {
        TOP,
        CENTER,
        BOTTOM
    }

    @Override // o.yCW
    public Bitmap AEQbTJ(@NonNull Context context, @NonNull OG og, @NonNull Bitmap bitmap, int i, int i2) {
        int width = this.EZpvd;
        if (width == 0) {
            width = bitmap.getWidth();
        }
        this.EZpvd = width;
        int height = this.KWHzl;
        if (height == 0) {
            height = bitmap.getHeight();
        }
        this.KWHzl = height;
        Bitmap bitmapCopydefault = og.copydefault(this.EZpvd, this.KWHzl, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapCopydefault.setHasAlpha(true);
        float fMax = Math.max(this.EZpvd / bitmap.getWidth(), this.KWHzl / bitmap.getHeight());
        float width2 = bitmap.getWidth() * fMax;
        float height2 = fMax * bitmap.getHeight();
        float f = (this.EZpvd - width2) / 2.0f;
        float fEZpvd = EZpvd(height2);
        new Canvas(bitmapCopydefault).drawBitmap(bitmap, (Rect) null, new RectF(f, fEZpvd, width2 + f, height2 + fEZpvd), (Paint) null);
        return bitmapCopydefault;
    }

    @Override // o.yCW
    public String AEQbTJ() {
        return "CropTransformation(width=" + this.EZpvd + ", height=" + this.KWHzl + ", cropType=" + this.copydefault + ")";
    }

    /* JADX INFO: renamed from: jp.wasabeef.glide.transformations.CropTransformation$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] EZpvd;

        static {
            int[] iArr = new int[CropType.values().length];
            EZpvd = iArr;
            try {
                iArr[CropType.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EZpvd[CropType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EZpvd[CropType.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final float EZpvd(float f) {
        int i = AnonymousClass4.EZpvd[this.copydefault.ordinal()];
        if (i == 2) {
            return (this.KWHzl - f) / 2.0f;
        }
        if (i != 3) {
            return 0.0f;
        }
        return this.KWHzl - f;
    }
}
