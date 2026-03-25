package o;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: o.aqn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7808aqn extends C7806aql implements InterfaceC7410ajM, Drawable.Callback {
    public final android.graphics.Paint AEQbTJ;
    public boolean AYXKKw;
    public C7928atA AhwBna;
    public boolean EZpvd;
    public android.graphics.drawable.Drawable KWHzl;
    public int OLrzqt = 0;
    public final float[] copydefault;
    public final RectF djBIcL;
    public int gEmmrt;
    public final android.graphics.Path isConnected;
    public int[] valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7410ajM
    public int getBgColor() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC7410ajM
    public void setAddShadow(int i, C7350aiF c7350aiF, float f, float f2) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC7410ajM
    public void setBgDrawable(android.graphics.drawable.Drawable drawable) {
        this.KWHzl = drawable;
    }

    @Override // o.InterfaceC7410ajM
    public void setDrawRadiusBackground(boolean z) {
    }

    @Override // o.InterfaceC7410ajM
    public void setRadiusColor(int i) {
    }

    public C7808aqn() {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.AEQbTJ = paint;
        this.isConnected = new android.graphics.Path();
        this.djBIcL = new RectF();
        this.AYXKKw = false;
        this.EZpvd = false;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.OLrzqt);
        this.copydefault = new float[8];
    }

    @Override // o.InterfaceC7410ajM
    public void setBgColor(int i) {
        this.OLrzqt = i;
        this.AEQbTJ.setColor(i);
        this.AEQbTJ.setShader(null);
        this.AYXKKw = false;
        this.valueOf = null;
        this.gEmmrt = 0;
        invalidateSelf();
    }

    @Override // o.InterfaceC7410ajM
    public void setGradientColor(int i, int i2, int i3) {
        if (this.valueOf == null) {
            this.valueOf = new int[2];
        }
        int[] iArr = this.valueOf;
        if (iArr.length == 2 && iArr[0] == i && iArr[1] == i2 && this.gEmmrt == i3) {
            return;
        }
        iArr[0] = i;
        iArr[1] = i2;
        this.gEmmrt = i3;
        this.AYXKKw = true;
        android.graphics.Rect bounds = getBounds();
        if (bounds.width() == 0 || bounds.height() == 0) {
            return;
        }
        OLrzqt();
        invalidateSelf();
    }

    @Override // o.C7806aql, android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas canvas) {
        canvas.save();
        if (getLayoutDirection() == 1) {
            canvas.scale(-1.0f, 1.0f, this.getFieldNames / 2.0f, this.fARcdN / 2.0f);
        }
        if (this.ejfBZ) {
            canvas.drawPath(this.isConnected, this.AEQbTJ);
        } else {
            canvas.drawRect(this.djBIcL, this.AEQbTJ);
        }
        super.draw(canvas);
        canvas.restore();
        if (this.EZpvd) {
            this.AhwBna.draw(canvas);
        }
        android.graphics.drawable.Drawable drawable = this.KWHzl;
        if (drawable != null) {
            drawable.setBounds(0, 0, getBounds().width(), getBounds().height());
            this.KWHzl.draw(canvas);
        }
    }

    @Override // o.C7806aql, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        super.setAlpha(i);
        this.OLrzqt = Color.argb(i, Color.red(this.OLrzqt), Color.green(this.OLrzqt), Color.blue(this.OLrzqt));
    }

    @Override // o.C7806aql
    public void AEQbTJ(int i, int i2) {
        C7928atA c7928atA;
        super.AEQbTJ(i, i2);
        this.isConnected.reset();
        if (i == 0 || i2 == 0) {
            this.djBIcL.set(0.0f, 0.0f, i, i2);
            return;
        }
        this.djBIcL.set(0.0f, 0.0f, i, i2);
        OLrzqt();
        if (this.ejfBZ) {
            int i3 = 0;
            while (true) {
                float[] fArr = this.fIwbmz;
                if (i3 >= fArr.length) {
                    break;
                }
                float f = fArr[i3];
                float[] fArr2 = this.copydefault;
                if (f <= 0.0f) {
                    f = 0.0f;
                }
                fArr2[i3] = f;
                i3++;
            }
            this.isConnected.addRoundRect(this.djBIcL, this.copydefault, Path.Direction.CW);
        }
        if (!this.EZpvd || (c7928atA = this.AhwBna) == null) {
            return;
        }
        c7928atA.KWHzl(i, i2);
        this.AhwBna.KWHzl(java.lang.Math.max(i, i2) >> 1);
        this.AhwBna.copydefault(java.lang.Math.min(i, i2) >> 2);
        this.AhwBna.copydefault(this.isConnected);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt() {
        LinearGradient linearGradient;
        LinearGradient linearGradient2;
        if (!this.AYXKKw) {
            return;
        }
        this.AYXKKw = false;
        android.graphics.Rect bounds = getBounds();
        int iCenterX = bounds.centerX();
        int iCenterY = bounds.centerY();
        int i = this.gEmmrt;
        if (i == 1) {
            float f = bounds.left;
            float f2 = this.AuCTel;
            float f3 = iCenterY;
            linearGradient = new LinearGradient(f + f2, f3, bounds.right - f2, f3, this.valueOf, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            if (i != 2) {
                if (i == 3) {
                    float f4 = iCenterX;
                    float f5 = bounds.top;
                    float f6 = this.AuCTel;
                    linearGradient2 = new LinearGradient(f4, f5 + f6, f4, bounds.bottom - f6, this.valueOf, (float[]) null, Shader.TileMode.CLAMP);
                } else if (i != 4) {
                    linearGradient2 = null;
                } else {
                    float f7 = iCenterX;
                    float f8 = bounds.bottom;
                    float f9 = this.AuCTel;
                    linearGradient2 = new LinearGradient(f7, f8 - f9, f7, bounds.top + f9, this.valueOf, (float[]) null, Shader.TileMode.CLAMP);
                }
                if (linearGradient2 == null) {
                    this.AEQbTJ.setColor(ViewCompat.MEASURED_STATE_MASK);
                    this.AEQbTJ.setShader(linearGradient2);
                    return;
                }
                return;
            }
            float f10 = bounds.right;
            float f11 = this.AuCTel;
            float f12 = iCenterY;
            linearGradient = new LinearGradient(f10 - f11, f12, bounds.left + f11, f12, this.valueOf, (float[]) null, Shader.TileMode.CLAMP);
        }
        linearGradient2 = linearGradient;
        if (linearGradient2 == null) {
        }
    }

    @Override // o.InterfaceC7407ajJ
    public void setDrawRipple(boolean z) {
        if (this.EZpvd == z) {
            return;
        }
        this.EZpvd = z;
        if (this.AhwBna == null) {
            KWHzl();
        }
    }

    public void EZpvd(android.view.MotionEvent motionEvent) {
        C7928atA c7928atA;
        if (!this.EZpvd || (c7928atA = this.AhwBna) == null) {
            return;
        }
        c7928atA.KWHzl(motionEvent);
    }

    public final void KWHzl() {
        C7928atA c7928atA = new C7928atA();
        this.AhwBna = c7928atA;
        c7928atA.copydefault(false);
        this.AhwBna.EZpvd(801950924);
        this.AhwBna.copydefault(1875692748);
        this.AhwBna.djBIcL(8);
        this.AhwBna.setCallback(this);
        this.AhwBna.EZpvd(1.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable drawable, @androidx.annotation.NonNull java.lang.Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@androidx.annotation.NonNull android.graphics.drawable.Drawable drawable, @androidx.annotation.NonNull java.lang.Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // o.C7806aql, android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        super.onLayoutDirectionChanged(i);
        C7928atA c7928atA = this.AhwBna;
        if (c7928atA != null) {
            c7928atA.setLayoutDirection(i);
        }
        android.graphics.drawable.Drawable drawable = this.KWHzl;
        if (drawable == null) {
            return true;
        }
        drawable.setLayoutDirection(i);
        return true;
    }
}
