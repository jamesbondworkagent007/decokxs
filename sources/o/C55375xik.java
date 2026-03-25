package o;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C55375xik extends android.widget.FrameLayout {
    public int AEQbTJ;
    public float AYXKKw;
    public boolean AhwBna;
    public boolean AkhnZx;
    public boolean EZpvd;
    public boolean KWHzl;
    public float OLrzqt;
    public float copydefault;
    public float djBIcL;
    public float fetchVPNInfo;
    public boolean gEmmrt;
    public boolean valueOf;
    public float values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55375xik(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55375xik(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return 0;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInvalidateShadowOnSizeChanged(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.xik.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55375xik(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55375xik(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = true;
        OLrzqt(context, attributeSet);
    }

    public final void setShadowColor(int i) {
        this.AEQbTJ = i;
        copydefault();
    }

    public final void setShadowSpread(float f) {
        this.copydefault = f;
        copydefault();
    }

    public final void setShadowSpreadX(float f) {
        this.AYXKKw = f;
        copydefault();
    }

    public final void setShadowSpreadY(float f) {
        this.djBIcL = f;
        copydefault();
    }

    public final void setCornerRadius(float f) {
        this.OLrzqt = f;
        copydefault();
    }

    public final void setXOffset(float f) {
        this.values = f;
        copydefault();
    }

    public final void setYOffset(float f) {
        this.fetchVPNInfo = f;
        copydefault();
    }

    public final void setShowLeftShadow(boolean z) {
        this.AhwBna = z;
        copydefault();
    }

    public final void setShowRightShadow(boolean z) {
        this.gEmmrt = z;
        copydefault();
    }

    public final void setShowTopShadow(boolean z) {
        this.AkhnZx = z;
        copydefault();
    }

    public final void setShowBottomShadow(boolean z) {
        this.valueOf = z;
        copydefault();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        if (getBackground() == null || this.KWHzl || this.EZpvd) {
            this.EZpvd = false;
            setBackgroundCompat(i, i2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.EZpvd) {
            this.EZpvd = false;
            setBackgroundCompat(i3 - i, i4 - i2);
        }
    }

    public final void copydefault() {
        this.EZpvd = true;
        setShadowPadding();
        requestLayout();
        invalidate();
    }

    public final void OLrzqt(android.content.Context context, android.util.AttributeSet attributeSet) {
        copydefault(context, attributeSet);
        setShadowPadding();
    }

    public final void copydefault(android.content.Context context, android.util.AttributeSet attributeSet) {
        int[] iArr = C52761wXj.PictureInPictureParams.addSocket;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        android.content.res.TypedArray typedArrayOLrzqt = OLrzqt(context, attributeSet, iArr);
        setShowLeftShadow(typedArrayOLrzqt.getBoolean(C52761wXj.PictureInPictureParams.getDefaultCipherSuites, true));
        setShowRightShadow(typedArrayOLrzqt.getBoolean(C52761wXj.PictureInPictureParams.UPzgla, true));
        setShowBottomShadow(typedArrayOLrzqt.getBoolean(C52761wXj.PictureInPictureParams.getSupportedCipherSuites, true));
        setShowTopShadow(typedArrayOLrzqt.getBoolean(C52761wXj.PictureInPictureParams.OFnBcz, true));
        setCornerRadius(typedArrayOLrzqt.getDimension(C52761wXj.PictureInPictureParams.sendSocketRequest, 0.0f));
        setShadowSpread(typedArrayOLrzqt.getDimension(C52761wXj.PictureInPictureParams.STbtMW, 0.0f));
        setXOffset(typedArrayOLrzqt.getDimension(C52761wXj.PictureInPictureParams.createSocket, 0.0f));
        setYOffset(typedArrayOLrzqt.getDimension(C52761wXj.PictureInPictureParams.zqaRxl, 0.0f));
        setShadowColor(typedArrayOLrzqt.getColor(C52761wXj.PictureInPictureParams.closeSocket, ContextCompat.getColor(context, C52761wXj.Activity.apHBvG)));
        typedArrayOLrzqt.recycle();
    }

    public final void setShadowPadding() {
        float fAbs;
        int iAbs;
        float f = this.AYXKKw;
        if (f > 0.0f) {
            fAbs = java.lang.Math.abs(this.values);
        } else {
            f = this.copydefault;
            fAbs = java.lang.Math.abs(this.values);
        }
        int i = (int) (f + fAbs);
        float f2 = this.djBIcL;
        if (f2 > 0.0f) {
            iAbs = (int) (f2 + java.lang.Math.abs(this.fetchVPNInfo));
        } else {
            iAbs = (int) (this.copydefault + java.lang.Math.abs(this.fetchVPNInfo));
        }
        int i2 = this.AhwBna ? i : 0;
        int i3 = this.AkhnZx ? iAbs : 0;
        if (!this.gEmmrt) {
            i = 0;
        }
        if (!this.valueOf) {
            iAbs = 0;
        }
        setPaddingRelative(i2, i3, i, iAbs);
    }

    public final void setBackgroundCompat(int i, int i2) {
        android.graphics.Bitmap bitmapKWHzl = KWHzl(i, i2, 0);
        if (bitmapKWHzl == null) {
            return;
        }
        setBackground(new BitmapDrawable(getResources(), bitmapKWHzl));
    }

    public final android.content.res.TypedArray OLrzqt(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        return typedArrayObtainStyledAttributes;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.graphics.Bitmap KWHzl(int i, int i2, int i3) {
        RectF rectF;
        RectF rectF2;
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        float f = this.AYXKKw;
        if (f > 0.0f) {
            float f2 = this.djBIcL;
            if (f2 > 0.0f) {
                rectF = new RectF(f, f2, i - f, i2 - f2);
            } else {
                if (f > 0.0f) {
                    float f3 = this.copydefault;
                    rectF2 = new RectF(f, f3, i - f, i2 - f3);
                } else {
                    float f4 = this.djBIcL;
                    if (f4 > 0.0f) {
                        float f5 = this.copydefault;
                        rectF2 = new RectF(f5, f4, i - f5, i2 - f4);
                    } else {
                        float f6 = this.copydefault;
                        rectF = new RectF(f6, f6, i - f6, i2 - f6);
                    }
                }
                rectF = rectF2;
            }
        }
        float f7 = this.fetchVPNInfo;
        if (f7 > 0.0f) {
            rectF.top += f7;
            rectF.bottom -= f7;
        } else if (f7 < 0.0f) {
            rectF.top += java.lang.Math.abs(f7);
            rectF.bottom -= java.lang.Math.abs(this.fetchVPNInfo);
        }
        float f8 = this.values;
        if (f8 > 0.0f) {
            rectF.left += f8;
            rectF.right -= f8;
        } else if (f8 < 0.0f) {
            rectF.left += java.lang.Math.abs(f8);
            rectF.right -= java.lang.Math.abs(this.values);
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setAntiAlias(true);
        paint.setColor(i3);
        paint.setStyle(Paint.Style.FILL);
        if (!isInEditMode()) {
            float fMax = java.lang.Float.max(this.AYXKKw, this.djBIcL);
            if (fMax <= 0.0f) {
                fMax = this.copydefault;
            }
            paint.setShadowLayer(fMax, this.values, this.fetchVPNInfo, this.AEQbTJ);
        }
        float f9 = this.OLrzqt;
        canvas.drawRoundRect(rectF, f9, f9, paint);
        return bitmapCreateBitmap;
    }
}
