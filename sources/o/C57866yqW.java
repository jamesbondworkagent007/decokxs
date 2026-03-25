package o;

import android.graphics.Bitmap;
import android.graphics.Region;

/* JADX INFO: renamed from: o.yqW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C57866yqW extends AbstractC57947yry {
    public android.graphics.Bitmap AEQbTJ;
    public int AhwBna;
    public java.util.List<android.graphics.Path> AkhnZx;
    public boolean KWHzl;
    public java.util.List<java.lang.Integer> copydefault;
    public java.util.List<android.graphics.Path> djBIcL;
    public java.util.List<java.lang.String> fetchVPNInfo;
    public int gEmmrt;
    public static final Region OLrzqt = new Region();
    public static final Region EZpvd = new Region(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    public int isConnected = 1;
    public int valueOf = 1;
    public int AYXKKw = 0;
    public int DbNXlk = 0;

    public boolean EZpvd() {
        java.lang.Integer num;
        java.lang.Integer numValueOf;
        java.lang.Integer numValueOf2;
        int i;
        java.util.List<android.graphics.Path> list = this.djBIcL;
        java.lang.Integer numValueOf3 = null;
        if (list != null) {
            numValueOf = null;
            java.lang.Integer numValueOf4 = null;
            numValueOf2 = null;
            for (android.graphics.Path path : list) {
                Region region = OLrzqt;
                region.setPath(path, EZpvd);
                android.graphics.Rect bounds = region.getBounds();
                numValueOf2 = java.lang.Integer.valueOf(java.lang.Math.min(numValueOf2 == null ? bounds.top : numValueOf2.intValue(), bounds.top));
                numValueOf4 = java.lang.Integer.valueOf(java.lang.Math.min(numValueOf4 == null ? bounds.left : numValueOf4.intValue(), bounds.left));
                numValueOf3 = java.lang.Integer.valueOf(java.lang.Math.max(numValueOf3 == null ? bounds.right : numValueOf3.intValue(), bounds.right));
                numValueOf = java.lang.Integer.valueOf(java.lang.Math.max(numValueOf == null ? bounds.bottom : numValueOf.intValue(), bounds.bottom));
            }
            num = numValueOf3;
            numValueOf3 = numValueOf4;
        } else {
            num = null;
            numValueOf = null;
            numValueOf2 = null;
        }
        this.AYXKKw = numValueOf3 == null ? 0 : numValueOf3.intValue();
        this.DbNXlk = numValueOf2 == null ? 0 : numValueOf2.intValue();
        this.isConnected = num == null ? 0 : num.intValue() - this.AYXKKw;
        int iIntValue = numValueOf == null ? 0 : numValueOf.intValue() - this.DbNXlk;
        this.valueOf = iIntValue;
        if (this.gEmmrt == 0) {
            this.gEmmrt = this.isConnected;
        }
        if (this.AhwBna == 0) {
            this.AhwBna = iIntValue;
        }
        android.graphics.Rect bounds2 = getBounds();
        int i2 = this.isConnected;
        if (i2 != 0 && (i = this.valueOf) != 0) {
            int i3 = bounds2.left;
            int i4 = bounds2.top;
            super.setBounds(i3, i4, i2 + i3, i + i4);
            return true;
        }
        if (this.gEmmrt == 0) {
            this.gEmmrt = 1;
        }
        if (this.AhwBna == 0) {
            this.AhwBna = 1;
        }
        this.valueOf = 1;
        this.isConnected = 1;
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        java.util.List<android.graphics.Path> list = this.AkhnZx;
        if (list != null && list.size() > 0 && (i5 != this.isConnected || i6 != this.valueOf)) {
            int i7 = this.AYXKKw;
            int i8 = this.DbNXlk;
            float f = i5;
            float f2 = i6;
            this.djBIcL = C57864yqU.KWHzl((f * 1.0f) / this.gEmmrt, (f2 * 1.0f) / this.AhwBna, this.AkhnZx, this.fetchVPNInfo);
            if (EZpvd()) {
                return;
            }
            this.isConnected = i5;
            this.valueOf = i6;
            this.AYXKKw = (int) (((i7 * 1.0f) * f) / this.gEmmrt);
            this.DbNXlk = (int) (((i8 * 1.0f) * f2) / this.AhwBna);
            super.setBounds(i, i2, i3, i4);
            return;
        }
        super.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(@androidx.annotation.NonNull android.graphics.Rect rect) {
        setBounds(rect.left, rect.top, rect.right, rect.bottom);
    }

    public boolean EZpvd(java.lang.String... strArr) {
        this.AhwBna = 0;
        this.gEmmrt = 0;
        this.fetchVPNInfo = new java.util.ArrayList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.AkhnZx = arrayList;
        this.djBIcL = arrayList;
        for (java.lang.String str : strArr) {
            this.fetchVPNInfo.add(str);
            this.AkhnZx.add(C57864yqU.copydefault(str));
        }
        return EZpvd();
    }

    public void EZpvd(int i, int i2, int i3, int i4) {
        this.AYXKKw = i;
        this.DbNXlk = i2;
        this.isConnected = i3;
        this.gEmmrt = i3;
        this.valueOf = i4;
        this.AhwBna = i4;
        android.graphics.Rect bounds = getBounds();
        int i5 = bounds.left;
        int i6 = bounds.top;
        super.setBounds(i5, i6, i3 + i5, i4 + i6);
    }

    public void OLrzqt(int... iArr) {
        this.copydefault = new java.util.ArrayList();
        for (int i : iArr) {
            this.copydefault.add(java.lang.Integer.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas canvas) {
        android.graphics.Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (this.values.getAlpha() == 255) {
            canvas.save();
            canvas.translate(bounds.left - this.AYXKKw, bounds.top - this.DbNXlk);
            if (this.djBIcL != null) {
                for (int i = 0; i < this.djBIcL.size(); i++) {
                    java.util.List<java.lang.Integer> list = this.copydefault;
                    if (list != null && i < list.size()) {
                        this.values.setColor(this.copydefault.get(i).intValue());
                    }
                    canvas.drawPath(this.djBIcL.get(i), this.values);
                }
                this.values.setAlpha(255);
            }
            canvas.restore();
            return;
        }
        copydefault(iWidth, iHeight);
        if (this.KWHzl) {
            this.AEQbTJ.eraseColor(0);
            OLrzqt(new android.graphics.Canvas(this.AEQbTJ));
            this.KWHzl = false;
        }
        canvas.drawBitmap(this.AEQbTJ, bounds.left, bounds.top, this.values);
    }

    public final void OLrzqt(android.graphics.Canvas canvas) {
        canvas.translate(-this.AYXKKw, -this.DbNXlk);
        if (this.djBIcL != null) {
            for (int i = 0; i < this.djBIcL.size(); i++) {
                java.util.List<java.lang.Integer> list = this.copydefault;
                if (list != null && i < list.size()) {
                    this.values.setColor(this.copydefault.get(i).intValue());
                }
                canvas.drawPath(this.djBIcL.get(i), this.values);
            }
        }
    }

    public final void copydefault(int i, int i2) {
        android.graphics.Bitmap bitmap = this.AEQbTJ;
        if (bitmap != null && i == bitmap.getWidth() && i2 == this.AEQbTJ.getHeight()) {
            return;
        }
        this.AEQbTJ = android.graphics.Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        this.KWHzl = true;
    }
}
