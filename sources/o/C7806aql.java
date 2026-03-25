package o;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: renamed from: o.aql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7806aql extends android.graphics.drawable.Drawable implements InterfaceC7409ajL {
    public float AuCTel;
    public int fARcdN;
    public int getFieldNames;
    public int[] getNewProxyInstance;
    public final android.graphics.Path AkhnZx = new android.graphics.Path();
    public final RectF DbNXlk = new RectF();
    public final android.graphics.Paint values = new android.graphics.Paint(1);
    public boolean ejfBZ = false;
    public boolean uzCIH = false;
    public boolean fJNWhG = true;
    public final float[] fIwbmz = new float[8];
    public final float[] iwGUEr = new float[8];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(boolean z) {
        this.fJNWhG = z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7409ajL
    public float[] getRadii() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7409ajL
    public float getStrokeWidth() {
        return this.AuCTel;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas canvas) {
        if (this.fJNWhG) {
            return;
        }
        copydefault(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.values.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@androidx.annotation.Nullable ColorFilter colorFilter) {
        this.values.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(android.graphics.Rect rect) {
        this.getFieldNames = rect.width();
        int iHeight = rect.height();
        this.fARcdN = iHeight;
        AEQbTJ(this.getFieldNames, iHeight);
    }

    public final boolean copydefault() {
        if (this.AuCTel <= 0.0f) {
            return false;
        }
        this.values.setStyle(Paint.Style.FILL);
        return true;
    }

    public void AEQbTJ(int i, int i2) {
        if (this.AuCTel <= 0.0f) {
            this.AkhnZx.reset();
            return;
        }
        this.AkhnZx.reset();
        float f = i;
        float f2 = i2;
        this.DbNXlk.set(0.0f, 0.0f, f, f2);
        this.AkhnZx.addRoundRect(this.DbNXlk, this.fIwbmz, Path.Direction.CW);
        float f3 = this.AuCTel;
        if (f3 > i / 2 || f3 > i2 / 2) {
            return;
        }
        this.DbNXlk.set(f3, f3, f - f3, f2 - f3);
        float[] fArr = this.iwGUEr;
        float[] fArr2 = this.fIwbmz;
        float f4 = fArr2[0];
        float f5 = this.AuCTel;
        float f6 = f4 - f5;
        if (f6 <= 0.0f) {
            f6 = 0.0f;
        }
        fArr[1] = f6;
        fArr[0] = f6;
        float f7 = fArr2[2] - f5;
        if (f7 <= 0.0f) {
            f7 = 0.0f;
        }
        fArr[3] = f7;
        fArr[2] = f7;
        float f8 = fArr2[4] - f5;
        if (f8 <= 0.0f) {
            f8 = 0.0f;
        }
        fArr[5] = f8;
        fArr[4] = f8;
        float f9 = fArr2[6] - f5;
        float f10 = f9 > 0.0f ? f9 : 0.0f;
        fArr[7] = f10;
        fArr[6] = f10;
        this.AkhnZx.addRoundRect(this.DbNXlk, fArr, Path.Direction.CCW);
    }

    @Override // o.InterfaceC7409ajL
    public void setStrokeWidth(float f) {
        this.AuCTel = f;
        copydefault();
        AEQbTJ(this.getFieldNames, this.fARcdN);
        invalidateSelf();
    }

    @Override // o.InterfaceC7409ajL
    public void setStrokeColor(int i) {
        this.values.setColor(i);
        invalidateSelf();
    }

    public void EZpvd(int[] iArr) {
        this.getNewProxyInstance = iArr;
        invalidateSelf();
    }

    @Override // o.InterfaceC7409ajL
    public void setCornerRadius(float f) {
        OLrzqt(f, f, f, f);
    }

    public void OLrzqt(float f, float f2, float f3, float f4) {
        int i;
        this.ejfBZ = (f == 0.0f && f2 == 0.0f && f3 == 0.0f && f4 == 0.0f) ? false : true;
        float[] fArr = this.fIwbmz;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[5] = f4;
        fArr[4] = f4;
        fArr[7] = f3;
        fArr[6] = f3;
        int i2 = this.getFieldNames;
        if (i2 != 0 && (i = this.fARcdN) != 0) {
            AEQbTJ(i2, i);
        }
        invalidateSelf();
    }

    @Override // o.InterfaceC7409ajL
    public void setRadius(int i, float f) {
        this.ejfBZ = f != 0.0f;
        OLrzqt(i, f);
    }

    @Override // o.InterfaceC7409ajL
    public void setMaskRadius(int i, float f) {
        this.ejfBZ = false;
        OLrzqt(i, f);
    }

    public final void OLrzqt(int i, float f) {
        int i2;
        if ((i & 15) == 15 || i == 0) {
            float[] fArr = this.fIwbmz;
            fArr[5] = f;
            fArr[4] = f;
            fArr[7] = f;
            fArr[6] = f;
            fArr[3] = f;
            fArr[2] = f;
            fArr[1] = f;
            fArr[0] = f;
        } else {
            if ((i & 1) == 1) {
                float[] fArr2 = this.fIwbmz;
                fArr2[1] = f;
                fArr2[0] = f;
            }
            if ((i & 2) == 2) {
                float[] fArr3 = this.fIwbmz;
                fArr3[3] = f;
                fArr3[2] = f;
            }
            if ((i & 4) == 4) {
                float[] fArr4 = this.fIwbmz;
                fArr4[7] = f;
                fArr4[6] = f;
            }
            if ((i & 8) == 8) {
                float[] fArr5 = this.fIwbmz;
                fArr5[5] = f;
                fArr5[4] = f;
            }
        }
        int i3 = this.getFieldNames;
        if (i3 != 0 && (i2 = this.fARcdN) != 0) {
            AEQbTJ(i3, i2);
        }
        invalidateSelf();
    }

    public int AEQbTJ() {
        return this.values.getColor();
    }

    @Override // o.InterfaceC7409ajL
    public float getCornerRadiusWithDirection(int i) {
        if ((i & 1) == 1) {
            return this.fIwbmz[0];
        }
        if ((i & 2) == 2) {
            return this.fIwbmz[2];
        }
        if ((i & 4) == 4) {
            return this.fIwbmz[6];
        }
        if ((i & 8) == 8) {
            return this.fIwbmz[4];
        }
        return this.fIwbmz[0];
    }

    public float OLrzqt(int i) {
        return this.fIwbmz[i * 2];
    }

    public void copydefault(android.graphics.Canvas canvas) {
        if (this.AuCTel <= 0.0f || this.AkhnZx.isEmpty()) {
            return;
        }
        if (this.getNewProxyInstance != null) {
            this.values.setShader(new LinearGradient(0.0f, 0.0f, this.getFieldNames, 0.0f, this.getNewProxyInstance, (float[]) null, Shader.TileMode.CLAMP));
        }
        canvas.drawPath(this.AkhnZx, this.values);
    }
}
