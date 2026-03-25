package o;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wXT implements NL<wXL, BitmapDrawable> {
    public android.content.Context OLrzqt;
    public final OG copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Lo/NM;)Z */
    @Override // o.NL
    public boolean copydefault(@NotNull wXL wxl, @NotNull NM nm) {
        Intrinsics.checkNotNullParameter(wxl, "");
        Intrinsics.checkNotNullParameter(nm, "");
        return true;
    }

    public wXT(@NotNull android.content.Context context, @NotNull OG og) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(og, "");
        this.OLrzqt = context;
        this.copydefault = og;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;IILo/NM;)Lo/OC; */
    @Override // o.NL
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public OC<BitmapDrawable> copydefault(@NotNull wXL wxl, int i, int i2, @NotNull NM nm) {
        Intrinsics.checkNotNullParameter(wxl, "");
        Intrinsics.checkNotNullParameter(nm, "");
        android.graphics.Bitmap bitmapCopydefault = this.copydefault.copydefault(i, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.copydefault(bitmapCopydefault);
        OLrzqt(bitmapCopydefault, wxl, i, i2);
        Intrinsics.checkNotNullExpressionValue(bitmapCopydefault, "");
        return C5418Qy.copydefault(this.OLrzqt.getResources(), C5398Qe.copydefault(bitmapCopydefault, this.copydefault));
    }

    public final android.graphics.Bitmap OLrzqt(android.graphics.Bitmap bitmap, wXL wxl, int i, int i2) {
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmap);
        KWHzl(canvas, wxl, i, i2);
        copydefault(canvas, wxl, i, i2);
        return bitmap;
    }

    public final void KWHzl(android.graphics.Canvas canvas, wXL wxl, int i, int i2) {
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, i, i2);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(wxl.AEQbTJ());
        canvas.drawRect(rectF, paint);
    }

    public final void copydefault(android.graphics.Canvas canvas, wXL wxl, int i, int i2) {
        int iMin = java.lang.Math.min(i, i2);
        int[] iArrOLrzqt = wxl.OLrzqt();
        double d = iMin;
        double dSqrt = d / java.lang.Math.sqrt(iArrOLrzqt.length);
        android.graphics.Paint paint = new android.graphics.Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(wxl.EZpvd());
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setStyle(style);
        paint2.setColor(wxl.KWHzl());
        int length = iArrOLrzqt.length;
        int i3 = 0;
        while (i3 < length) {
            double d2 = ((double) i3) * dSqrt;
            double d3 = d2 % d;
            double dFloor = java.lang.Math.floor(d2 / d) * dSqrt;
            double d4 = d;
            RectF rectF = new RectF((float) d3, (float) dFloor, (float) (d3 + dSqrt), (float) (dFloor + dSqrt));
            int i4 = iArrOLrzqt[i3];
            if (i4 == 2) {
                canvas.drawRect(rectF, paint2);
            } else if (i4 == 1) {
                canvas.drawRect(rectF, paint);
            }
            i3++;
            d = d4;
        }
    }
}
