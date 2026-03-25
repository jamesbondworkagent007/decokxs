package jp.wasabeef.glide.transformations;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import o.OG;
import o.yCW;

/* JADX INFO: loaded from: classes13.dex */
public class RoundedCornersTransformation extends yCW {
    public CornerType EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public int copydefault;

    public enum CornerType {
        ALL,
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        OTHER_TOP_LEFT,
        OTHER_TOP_RIGHT,
        OTHER_BOTTOM_LEFT,
        OTHER_BOTTOM_RIGHT,
        DIAGONAL_FROM_TOP_LEFT,
        DIAGONAL_FROM_TOP_RIGHT
    }

    public RoundedCornersTransformation(int i, int i2) {
        this(i, i2, CornerType.ALL);
    }

    public RoundedCornersTransformation(int i, int i2, CornerType cornerType) {
        this.copydefault = i;
        this.KWHzl = i * 2;
        this.OLrzqt = i2;
        this.EZpvd = cornerType;
    }

    @Override // o.yCW
    public Bitmap AEQbTJ(@NonNull Context context, @NonNull OG og, @NonNull Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap bitmapCopydefault = og.copydefault(width, height, Bitmap.Config.ARGB_8888);
        bitmapCopydefault.setHasAlpha(true);
        Canvas canvas = new Canvas(bitmapCopydefault);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        values(canvas, paint, width, height);
        return bitmapCopydefault;
    }

    /* JADX INFO: renamed from: jp.wasabeef.glide.transformations.RoundedCornersTransformation$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] AEQbTJ;

        static {
            int[] iArr = new int[CornerType.values().length];
            AEQbTJ = iArr;
            try {
                iArr[CornerType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[CornerType.TOP_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[CornerType.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AEQbTJ[CornerType.BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AEQbTJ[CornerType.BOTTOM_RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AEQbTJ[CornerType.TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AEQbTJ[CornerType.BOTTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AEQbTJ[CornerType.LEFT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AEQbTJ[CornerType.RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AEQbTJ[CornerType.OTHER_TOP_LEFT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AEQbTJ[CornerType.OTHER_TOP_RIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AEQbTJ[CornerType.OTHER_BOTTOM_LEFT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AEQbTJ[CornerType.OTHER_BOTTOM_RIGHT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AEQbTJ[CornerType.DIAGONAL_FROM_TOP_LEFT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                AEQbTJ[CornerType.DIAGONAL_FROM_TOP_RIGHT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public final void values(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.OLrzqt;
        float f4 = f - f3;
        float f5 = f2 - f3;
        switch (AnonymousClass3.AEQbTJ[this.EZpvd.ordinal()]) {
            case 1:
                float f6 = this.OLrzqt;
                RectF rectF = new RectF(f6, f6, f4, f5);
                float f7 = this.copydefault;
                canvas.drawRoundRect(rectF, f7, f7, paint);
                break;
            case 2:
                AkhnZx(canvas, paint, f4, f5);
                break;
            case 3:
                fetchVPNInfo(canvas, paint, f4, f5);
                break;
            case 4:
                KWHzl(canvas, paint, f4, f5);
                break;
            case 5:
                EZpvd(canvas, paint, f4, f5);
                break;
            case 6:
                DbNXlk(canvas, paint, f4, f5);
                break;
            case 7:
                AEQbTJ(canvas, paint, f4, f5);
                break;
            case 8:
                AYXKKw(canvas, paint, f4, f5);
                break;
            case 9:
                isConnected(canvas, paint, f4, f5);
                break;
            case 10:
                valueOf(canvas, paint, f4, f5);
                break;
            case 11:
                gEmmrt(canvas, paint, f4, f5);
                break;
            case 12:
                djBIcL(canvas, paint, f4, f5);
                break;
            case 13:
                AhwBna(canvas, paint, f4, f5);
                break;
            case 14:
                OLrzqt(canvas, paint, f4, f5);
                break;
            case 15:
                copydefault(canvas, paint, f4, f5);
                break;
            default:
                float f8 = this.OLrzqt;
                RectF rectF2 = new RectF(f8, f8, f4, f5);
                float f9 = this.copydefault;
                canvas.drawRoundRect(rectF2, f9, f9, paint);
                break;
        }
    }

    public final void AkhnZx(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.OLrzqt;
        float f3 = i;
        float f4 = i + this.KWHzl;
        RectF rectF = new RectF(f3, f3, f4, f4);
        float f5 = this.copydefault;
        canvas.drawRoundRect(rectF, f5, f5, paint);
        int i2 = this.OLrzqt;
        float f6 = i2;
        float f7 = i2 + this.copydefault;
        canvas.drawRect(new RectF(f6, f7, f7, f2), paint);
        canvas.drawRect(new RectF(this.copydefault + r0, this.OLrzqt, f, f2), paint);
    }

    public final void fetchVPNInfo(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.KWHzl;
        RectF rectF = new RectF(f - i, this.OLrzqt, f, r2 + i);
        float f3 = this.copydefault;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        float f4 = this.OLrzqt;
        canvas.drawRect(new RectF(f4, f4, f - this.copydefault, f2), paint);
        canvas.drawRect(new RectF(f - this.copydefault, this.OLrzqt + r0, f, f2), paint);
    }

    public final void KWHzl(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF(this.OLrzqt, f2 - this.KWHzl, r0 + r2, f2);
        float f3 = this.copydefault;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        float f4 = this.OLrzqt;
        canvas.drawRect(new RectF(f4, f4, r0 + this.KWHzl, f2 - this.copydefault), paint);
        canvas.drawRect(new RectF(this.copydefault + r0, this.OLrzqt, f, f2), paint);
    }

    public final void EZpvd(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.KWHzl;
        RectF rectF = new RectF(f - f3, f2 - f3, f, f2);
        float f4 = this.copydefault;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        float f5 = this.OLrzqt;
        canvas.drawRect(new RectF(f5, f5, f - this.copydefault, f2), paint);
        float f6 = this.copydefault;
        canvas.drawRect(new RectF(f - f6, this.OLrzqt, f, f2 - f6), paint);
    }

    public final void DbNXlk(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.OLrzqt;
        RectF rectF = new RectF(f3, f3, f, r0 + this.KWHzl);
        float f4 = this.copydefault;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        canvas.drawRect(new RectF(this.OLrzqt, r0 + this.copydefault, f, f2), paint);
    }

    public final void AEQbTJ(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF(this.OLrzqt, f2 - this.KWHzl, f, f2);
        float f3 = this.copydefault;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        float f4 = this.OLrzqt;
        canvas.drawRect(new RectF(f4, f4, f, f2 - this.copydefault), paint);
    }

    public final void AYXKKw(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.OLrzqt;
        RectF rectF = new RectF(f3, f3, r0 + this.KWHzl, f2);
        float f4 = this.copydefault;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        canvas.drawRect(new RectF(this.copydefault + r0, this.OLrzqt, f, f2), paint);
    }

    public final void isConnected(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF(f - this.KWHzl, this.OLrzqt, f, f2);
        float f3 = this.copydefault;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        float f4 = this.OLrzqt;
        canvas.drawRect(new RectF(f4, f4, f - this.copydefault, f2), paint);
    }

    public final void valueOf(Canvas canvas, Paint paint, float f, float f2) {
        RectF rectF = new RectF(this.OLrzqt, f2 - this.KWHzl, f, f2);
        float f3 = this.copydefault;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        RectF rectF2 = new RectF(f - this.KWHzl, this.OLrzqt, f, f2);
        float f4 = this.copydefault;
        canvas.drawRoundRect(rectF2, f4, f4, paint);
        float f5 = this.OLrzqt;
        float f6 = this.copydefault;
        canvas.drawRect(new RectF(f5, f5, f - f6, f2 - f6), paint);
    }

    public final void gEmmrt(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.OLrzqt;
        RectF rectF = new RectF(f3, f3, r0 + this.KWHzl, f2);
        float f4 = this.copydefault;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        RectF rectF2 = new RectF(this.OLrzqt, f2 - this.KWHzl, f, f2);
        float f5 = this.copydefault;
        canvas.drawRoundRect(rectF2, f5, f5, paint);
        canvas.drawRect(new RectF(r0 + r1, this.OLrzqt, f, f2 - this.copydefault), paint);
    }

    public final void djBIcL(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.OLrzqt;
        RectF rectF = new RectF(f3, f3, f, r0 + this.KWHzl);
        float f4 = this.copydefault;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        RectF rectF2 = new RectF(f - this.KWHzl, this.OLrzqt, f, f2);
        float f5 = this.copydefault;
        canvas.drawRoundRect(rectF2, f5, f5, paint);
        canvas.drawRect(new RectF(this.OLrzqt, r0 + r2, f - this.copydefault, f2), paint);
    }

    public final void AhwBna(Canvas canvas, Paint paint, float f, float f2) {
        float f3 = this.OLrzqt;
        RectF rectF = new RectF(f3, f3, f, r0 + this.KWHzl);
        float f4 = this.copydefault;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        float f5 = this.OLrzqt;
        RectF rectF2 = new RectF(f5, f5, r0 + this.KWHzl, f2);
        float f6 = this.copydefault;
        canvas.drawRoundRect(rectF2, f6, f6, paint);
        float f7 = this.OLrzqt + this.copydefault;
        canvas.drawRect(new RectF(f7, f7, f, f2), paint);
    }

    public final void OLrzqt(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.OLrzqt;
        float f3 = i;
        float f4 = i + this.KWHzl;
        RectF rectF = new RectF(f3, f3, f4, f4);
        float f5 = this.copydefault;
        canvas.drawRoundRect(rectF, f5, f5, paint);
        float f6 = this.KWHzl;
        RectF rectF2 = new RectF(f - f6, f2 - f6, f, f2);
        float f7 = this.copydefault;
        canvas.drawRoundRect(rectF2, f7, f7, paint);
        canvas.drawRect(new RectF(this.OLrzqt, r0 + this.copydefault, f - this.KWHzl, f2), paint);
        canvas.drawRect(new RectF(this.KWHzl + r0, this.OLrzqt, f, f2 - this.copydefault), paint);
    }

    public final void copydefault(Canvas canvas, Paint paint, float f, float f2) {
        int i = this.KWHzl;
        RectF rectF = new RectF(f - i, this.OLrzqt, f, r2 + i);
        float f3 = this.copydefault;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        RectF rectF2 = new RectF(this.OLrzqt, f2 - this.KWHzl, r0 + r2, f2);
        float f4 = this.copydefault;
        canvas.drawRoundRect(rectF2, f4, f4, paint);
        float f5 = this.OLrzqt;
        float f6 = this.copydefault;
        canvas.drawRect(new RectF(f5, f5, f - f6, f2 - f6), paint);
        float f7 = this.OLrzqt + this.copydefault;
        canvas.drawRect(new RectF(f7, f7, f, f2), paint);
    }

    @Override // o.yCW
    public String AEQbTJ() {
        return "RoundedTransformation(radius=" + this.copydefault + ", margin=" + this.OLrzqt + ", diameter=" + this.KWHzl + ", cornerType=" + this.EZpvd.name() + ")";
    }
}
