package o;

import android.graphics.Paint;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nsI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C35274nsI extends android.view.View {
    public final android.graphics.Path AEQbTJ;
    public final int EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final android.graphics.Paint copydefault;
    public final float valueOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35274nsI(@NotNull android.content.Context context, int i) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = i;
        int i2 = i / 2;
        this.KWHzl = i2;
        this.EZpvd = i2;
        float f = i / 15.0f;
        this.valueOf = f;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        this.copydefault = paint;
        this.AEQbTJ = new android.graphics.Path();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.OLrzqt;
        setMeasuredDimension(i3, i3 / 2);
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        this.AEQbTJ.reset();
        android.graphics.Path path = this.AEQbTJ;
        float f = this.valueOf;
        float f2 = 2;
        path.moveTo(f, f / f2);
        this.AEQbTJ.lineTo(this.KWHzl, this.EZpvd - (this.valueOf / f2));
        android.graphics.Path path2 = this.AEQbTJ;
        float f3 = this.OLrzqt;
        float f4 = this.valueOf;
        path2.lineTo(f3 - f4, f4 / f2);
        canvas.drawPath(this.AEQbTJ, this.copydefault);
    }
}
