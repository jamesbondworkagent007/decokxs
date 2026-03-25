package o;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import o.AbstractC57948yrz;
import o.C57923yra;

/* JADX INFO: renamed from: o.yrz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC57948yrz<T extends AbstractC57948yrz> extends AbstractC57946yrx {
    public AbstractC57947yry AubY;
    public int AwvSrB;
    public int AxsJAY;
    public AbstractC57947yry DTwDnp;
    public int ORxRYg;
    public android.widget.ImageView OcIXYQ;
    public boolean QKVWgx;
    public InterfaceC57931yri QOLQEE;
    public boolean QVAiDq;
    public android.widget.TextView QfsBiF;
    public int gHZMYf;
    public int sSMYrx;
    public android.widget.ImageView zuBGHE;
    public static final int zLjUOn = C57923yra.Activity.OLrzqt;
    public static final int uzCIH = C57923yra.Activity.copydefault;
    public static final int getNewProxyInstance = C57923yra.Activity.EZpvd;

    public T EZpvd() {
        return this;
    }

    public AbstractC57948yrz(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AwvSrB = 500;
        this.ORxRYg = 20;
        this.sSMYrx = 20;
        this.AxsJAY = 0;
        this.AuCTelauCTel = C57940yrr.KWHzl;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.AxsJAY == 0) {
            this.ORxRYg = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            this.sSMYrx = paddingBottom;
            if (this.ORxRYg == 0 || paddingBottom == 0) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int iOLrzqt = this.ORxRYg;
                if (iOLrzqt == 0) {
                    iOLrzqt = InterpolatorC57905yrI.OLrzqt(20.0f);
                }
                this.ORxRYg = iOLrzqt;
                int iOLrzqt2 = this.sSMYrx;
                if (iOLrzqt2 == 0) {
                    iOLrzqt2 = InterpolatorC57905yrI.OLrzqt(20.0f);
                }
                this.sSMYrx = iOLrzqt2;
                setPadding(paddingLeft, this.ORxRYg, paddingRight, iOLrzqt2);
            }
            setClipToPadding(false);
        }
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            int size = View.MeasureSpec.getSize(i2);
            int i3 = this.AxsJAY;
            if (size < i3) {
                int i4 = (size - i3) / 2;
                setPadding(getPaddingLeft(), i4, getPaddingRight(), i4);
            } else {
                setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
            }
        } else {
            setPadding(getPaddingLeft(), this.ORxRYg, getPaddingRight(), this.sSMYrx);
        }
        super.onMeasure(i, i2);
        if (this.AxsJAY == 0) {
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                int measuredHeight = getChildAt(i5).getMeasuredHeight();
                if (this.AxsJAY < measuredHeight) {
                    this.AxsJAY = measuredHeight;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        android.widget.ImageView imageView = this.zuBGHE;
        android.widget.ImageView imageView2 = this.OcIXYQ;
        imageView.animate().cancel();
        imageView2.animate().cancel();
        java.lang.Object drawable = this.OcIXYQ.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        }
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void EZpvd(@androidx.annotation.NonNull InterfaceC57931yri interfaceC57931yri, int i, int i2) {
        this.QOLQEE = interfaceC57931yri;
        interfaceC57931yri.AEQbTJ(this, this.gHZMYf);
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void KWHzl(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl, int i, int i2) {
        android.widget.ImageView imageView = this.OcIXYQ;
        if (imageView.getVisibility() != 0) {
            imageView.setVisibility(0);
            java.lang.Object drawable = this.OcIXYQ.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
            } else {
                imageView.animate().rotation(36000.0f).setDuration(100000L);
            }
        }
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void OLrzqt(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl, int i, int i2) {
        KWHzl(interfaceC57934yrl, i, i2);
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public int EZpvd(@androidx.annotation.NonNull InterfaceC57934yrl interfaceC57934yrl, boolean z) {
        android.widget.ImageView imageView = this.OcIXYQ;
        java.lang.Object drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            Animatable animatable = (Animatable) drawable;
            if (animatable.isRunning()) {
                animatable.stop();
            }
        } else {
            imageView.animate().rotation(0.0f).setDuration(0L);
        }
        imageView.setVisibility(8);
        return this.AwvSrB;
    }

    @Override // o.AbstractC57946yrx, o.InterfaceC57935yrm
    public void setPrimaryColors(@androidx.annotation.ColorInt int... iArr) {
        if (iArr.length > 0) {
            if (!(getBackground() instanceof BitmapDrawable) && !this.QVAiDq) {
                EZpvd(iArr[0]);
                this.QVAiDq = false;
            }
            if (this.QKVWgx) {
                return;
            }
            if (iArr.length > 1) {
                AEQbTJ(iArr[1]);
            } else {
                AEQbTJ(iArr[0] == -1 ? -10066330 : -1);
            }
            this.QKVWgx = false;
        }
    }

    public T EZpvd(@androidx.annotation.ColorInt int i) {
        this.QVAiDq = true;
        this.gHZMYf = i;
        InterfaceC57931yri interfaceC57931yri = this.QOLQEE;
        if (interfaceC57931yri != null) {
            interfaceC57931yri.AEQbTJ(this, i);
        }
        return (T) EZpvd();
    }

    public T AEQbTJ(@androidx.annotation.ColorInt int i) {
        this.QKVWgx = true;
        this.QfsBiF.setTextColor(i);
        AbstractC57947yry abstractC57947yry = this.AubY;
        if (abstractC57947yry != null) {
            abstractC57947yry.copydefault(i);
            this.zuBGHE.invalidateDrawable(this.AubY);
        }
        AbstractC57947yry abstractC57947yry2 = this.DTwDnp;
        if (abstractC57947yry2 != null) {
            abstractC57947yry2.copydefault(i);
            this.OcIXYQ.invalidateDrawable(this.DTwDnp);
        }
        return (T) EZpvd();
    }
}
