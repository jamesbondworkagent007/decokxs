package o;

import android.graphics.RectF;
import com.immomo.mls.fun.ud.view.UDTabLayout;
import o.C7978aty;

/* JADX INFO: renamed from: o.arm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7860arm implements C7978aty.ActionBar {
    public android.content.Context AEQbTJ;
    public int AhwBna;
    public int EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public android.graphics.Paint copydefault;
    public int djBIcL;

    public C7860arm(android.content.Context context) {
        this(0);
        this.AEQbTJ = context;
        this.AhwBna = OLrzqt(6.0f);
        this.KWHzl = OLrzqt(4.0f);
        this.djBIcL = OLrzqt(2.0f);
    }

    public void AEQbTJ(int i) {
        this.EZpvd = i;
        android.graphics.Paint paint = this.copydefault;
        if (paint != null) {
            paint.setColor(i);
        }
    }

    public C7860arm(int i) {
        this.EZpvd = UDTabLayout.EZpvd;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.copydefault = paint;
        paint.setColor(this.EZpvd);
        this.OLrzqt = i;
    }

    @Override // o.C7978aty.ActionBar
    public void KWHzl(android.graphics.Canvas canvas, int i, int i2, int i3, int i4, float f) {
        int i5 = this.AhwBna;
        float fAbs = java.lang.Math.abs(f - 0.5f);
        RectF rectF = new RectF(((i + i3) / 2) - (this.AhwBna / 2), r7 - this.KWHzl, i5 + ((int) ((0.5f - fAbs) * r1 * 2.0f)) + r4, i4 - this.OLrzqt);
        float f2 = this.djBIcL;
        canvas.drawRoundRect(rectF, f2, f2, this.copydefault);
    }

    public final int OLrzqt(float f) {
        return java.lang.Math.round(android.util.TypedValue.applyDimension(1, f, this.AEQbTJ.getResources().getDisplayMetrics()));
    }
}
