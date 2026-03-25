package o;

import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: renamed from: o.arX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7845arX {
    public static final android.graphics.Rect KWHzl = new android.graphics.Rect();
    public final android.graphics.Path[] EZpvd = new android.graphics.Path[4];
    public final RectF[] OLrzqt = new RectF[4];
    public final android.graphics.Paint copydefault;

    public C7845arX() {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.copydefault = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    public void AEQbTJ(int i) {
        this.copydefault.setColor(i);
    }

    public void KWHzl(float f, float f2, float f3, float f4) {
        OLrzqt(0, f);
        OLrzqt(1, f2);
        OLrzqt(2, f3);
        OLrzqt(3, f4);
    }

    public final void OLrzqt(int i, float f) {
        if (f > 0.0f) {
            android.graphics.Path[] pathArr = this.EZpvd;
            android.graphics.Path path = pathArr[i];
            if (path == null) {
                pathArr[i] = new android.graphics.Path();
                this.OLrzqt[i] = new RectF();
            } else {
                path.reset();
            }
            float f2 = f * 2.0f;
            boolean z = i % 2 == 0;
            boolean z2 = i / 2 == 0;
            this.OLrzqt[i].set(0.0f, 0.0f, f2, f2);
            float f3 = i * 90;
            float f4 = z2 ? f3 - 180.0f : 270.0f - f3;
            this.EZpvd[i].moveTo(z ? 0.0f : f2, z2 ? 0.0f : f2);
            this.EZpvd[i].arcTo(this.OLrzqt[i], f4, 90.0f);
            this.EZpvd[i].close();
        }
    }

    public void KWHzl(android.graphics.Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        canvas.getClipBounds(KWHzl);
        canvas.save();
        canvas.translate(r2.left, r2.top);
        for (int i = 0; i < 4; i++) {
            android.graphics.Path path = this.EZpvd[i];
            if (path != null) {
                int i2 = i % 2 == 0 ? 0 : (int) (width - this.OLrzqt[i].right);
                int i3 = i / 2 == 0 ? 0 : (int) (height - this.OLrzqt[i].bottom);
                canvas.save();
                canvas.translate(i2, i3);
                canvas.drawPath(path, this.copydefault);
                canvas.restore();
            }
        }
        canvas.restore();
    }
}
