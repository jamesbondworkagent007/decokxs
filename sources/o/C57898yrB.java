package o;

/* JADX INFO: renamed from: o.yrB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C57898yrB extends AbstractC57947yry {
    public int AEQbTJ = 0;
    public int KWHzl = 0;
    public android.graphics.Path copydefault = new android.graphics.Path();

    @Override // android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (this.AEQbTJ != iWidth || this.KWHzl != iHeight) {
            this.copydefault.reset();
            float f = (iWidth * 30) / 225;
            float f2 = f * 0.70710677f;
            float f3 = f / 0.70710677f;
            float f4 = iWidth;
            float f5 = f4 / 2.0f;
            float f6 = iHeight;
            this.copydefault.moveTo(f5, f6);
            float f7 = f6 / 2.0f;
            this.copydefault.lineTo(0.0f, f7);
            float f8 = f7 - f2;
            this.copydefault.lineTo(f2, f8);
            float f9 = f / 2.0f;
            float f10 = f5 - f9;
            float f11 = (f6 - f3) - f9;
            this.copydefault.lineTo(f10, f11);
            this.copydefault.lineTo(f10, 0.0f);
            float f12 = f5 + f9;
            this.copydefault.lineTo(f12, 0.0f);
            this.copydefault.lineTo(f12, f11);
            this.copydefault.lineTo(f4 - f2, f8);
            this.copydefault.lineTo(f4, f7);
            this.copydefault.close();
            this.AEQbTJ = iWidth;
            this.KWHzl = iHeight;
        }
        canvas.drawPath(this.copydefault, this.values);
    }
}
