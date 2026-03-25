package o;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xio, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55379xio extends AppCompatImageView {
    public int AEQbTJ;
    public int AYXKKw;
    public int AhwBna;
    public final android.graphics.Paint AkhnZx;
    public final float[] AuCTel;
    public boolean DbNXlk;
    public final RectF EZpvd;
    public final float[] KWHzl;
    public int OLrzqt;
    public int copydefault;
    public int djBIcL;
    public float ejfBZ;
    public android.graphics.Path fARcdN;
    public final android.graphics.Path fIwbmz;
    public RectF fJNWhG;
    public boolean fetchVPNInfo;
    public int gEmmrt;
    public int getFieldNames;
    public int hDKMBd;
    public int isConnected;
    public int uzCIH;
    public int valueOf;
    public Xfermode values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55379xio(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55379xio(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt() {
        if (this.DbNXlk) {
            return;
        }
        this.gEmmrt = 0;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.xio.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55379xio(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55379xio(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = -1;
        this.djBIcL = -1;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.ICustomTabsCallbackStubProxy, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == C52761wXj.PictureInPictureParams.newSession) {
                this.fetchVPNInfo = typedArrayObtainStyledAttributes.getBoolean(index, this.fetchVPNInfo);
            } else if (index == C52761wXj.PictureInPictureParams.mayLaunchUrl) {
                this.DbNXlk = typedArrayObtainStyledAttributes.getBoolean(index, this.DbNXlk);
            } else if (index == C52761wXj.PictureInPictureParams.ICustomTabsService) {
                this.copydefault = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.copydefault);
            } else if (index == C52761wXj.PictureInPictureParams.getInterfaceDescriptor) {
                this.OLrzqt = typedArrayObtainStyledAttributes.getColor(index, this.OLrzqt);
            } else if (index == C52761wXj.PictureInPictureParams.postMessage) {
                this.gEmmrt = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.gEmmrt);
            } else if (index == C52761wXj.PictureInPictureParams.extraCommand) {
                this.djBIcL = typedArrayObtainStyledAttributes.getColor(index, this.djBIcL);
            } else if (index == C52761wXj.PictureInPictureParams.newSessionWithExtras) {
                this.AYXKKw = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.AYXKKw);
            } else if (index == C52761wXj.PictureInPictureParams.requestPostMessageChannelWithExtras) {
                this.hDKMBd = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.hDKMBd);
            } else if (index == C52761wXj.PictureInPictureParams.validateRelationship) {
                this.uzCIH = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.uzCIH);
            } else if (index == C52761wXj.PictureInPictureParams.onTransact) {
                this.AEQbTJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.AEQbTJ);
            } else if (index == C52761wXj.PictureInPictureParams.setDefaultImpl) {
                this.valueOf = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.valueOf);
            } else if (index == C52761wXj.PictureInPictureParams.updateVisuals) {
                this.isConnected = typedArrayObtainStyledAttributes.getColor(index, this.isConnected);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        this.KWHzl = new float[8];
        this.AuCTel = new float[8];
        this.EZpvd = new RectF();
        this.fJNWhG = new RectF();
        this.AkhnZx = new android.graphics.Paint();
        this.fIwbmz = new android.graphics.Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.values = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.values = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.fARcdN = new android.graphics.Path();
        }
        EZpvd();
        OLrzqt();
    }

    public final void setCoverSrc(boolean z) {
        this.fetchVPNInfo = z;
        AEQbTJ();
        invalidate();
    }

    public final void setCircle(boolean z) {
        this.DbNXlk = z;
        OLrzqt();
        AEQbTJ();
        invalidate();
    }

    public final void setBorderWidth(int i) {
        this.copydefault = i;
        AEQbTJ(false);
    }

    public final void setBorderColor(@androidx.annotation.ColorInt int i) {
        this.OLrzqt = i;
        invalidate();
    }

    public final void setInnerBorderWidth(int i) {
        this.gEmmrt = i;
        OLrzqt();
        invalidate();
    }

    public final void setInnerBorderColor(@androidx.annotation.ColorInt int i) {
        this.djBIcL = i;
        invalidate();
    }

    public final void setCornerRadius(int i) {
        this.AYXKKw = i;
        AEQbTJ(false);
    }

    public final void setTopLeftCornerRadius(int i) {
        this.hDKMBd = i;
        AEQbTJ(true);
    }

    public final void setTopRightCornerRadius(int i) {
        this.uzCIH = i;
        AEQbTJ(true);
    }

    public final void setBottomLeftCornerRadius(int i) {
        this.AEQbTJ = i;
        AEQbTJ(true);
    }

    public final void setBottomRightCornerRadius(int i) {
        this.valueOf = i;
        AEQbTJ(true);
    }

    public final void setMaskColor(@androidx.annotation.ColorInt int i) {
        this.isConnected = i;
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.getFieldNames = i;
        this.AhwBna = i2;
        copydefault();
        AEQbTJ();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        canvas.saveLayer(this.fJNWhG, null, 31);
        if (!this.fetchVPNInfo) {
            int i = this.getFieldNames;
            int i2 = this.copydefault * 2;
            int i3 = this.gEmmrt * 2;
            float f = ((i - i2) - i3) * 1.0f;
            float f2 = i;
            float f3 = ((r7 - i2) - i3) * 1.0f;
            float f4 = this.AhwBna;
            canvas.scale(f / f2, f3 / f4, f2 / 2.0f, f4 / 2.0f);
        }
        super.onDraw(canvas);
        this.AkhnZx.reset();
        this.fIwbmz.reset();
        if (this.DbNXlk) {
            this.fIwbmz.addCircle(this.getFieldNames / 2.0f, this.AhwBna / 2.0f, this.ejfBZ, Path.Direction.CCW);
        } else {
            this.fIwbmz.addRoundRect(this.fJNWhG, this.AuCTel, Path.Direction.CCW);
        }
        android.graphics.Paint paint = this.AkhnZx;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(this.values);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.fIwbmz, this.AkhnZx);
        } else {
            android.graphics.Path path = this.fARcdN;
            Intrinsics.copydefault(path);
            path.addRect(this.fJNWhG, Path.Direction.CCW);
            android.graphics.Path path2 = this.fARcdN;
            Intrinsics.copydefault(path2);
            path2.op(this.fIwbmz, Path.Op.DIFFERENCE);
            android.graphics.Path path3 = this.fARcdN;
            Intrinsics.copydefault(path3);
            canvas.drawPath(path3, this.AkhnZx);
        }
        this.AkhnZx.setXfermode(null);
        int i4 = this.isConnected;
        if (i4 != 0) {
            this.AkhnZx.setColor(i4);
            canvas.drawPath(this.fIwbmz, this.AkhnZx);
        }
        canvas.restore();
        OLrzqt(canvas);
    }

    public final void OLrzqt(android.graphics.Canvas canvas) {
        if (!this.DbNXlk) {
            int i = this.copydefault;
            if (i > 0) {
                OLrzqt(canvas, i, this.OLrzqt, this.EZpvd, this.KWHzl);
                return;
            }
            return;
        }
        int i2 = this.copydefault;
        if (i2 > 0) {
            KWHzl(canvas, i2, this.OLrzqt, this.ejfBZ - (i2 / 2.0f));
        }
        int i3 = this.gEmmrt;
        if (i3 > 0) {
            KWHzl(canvas, i3, this.djBIcL, (this.ejfBZ - this.copydefault) - (i3 / 2.0f));
        }
    }

    public final void KWHzl(android.graphics.Canvas canvas, int i, int i2, float f) {
        copydefault(i, i2);
        this.fIwbmz.addCircle(this.getFieldNames / 2.0f, this.AhwBna / 2.0f, f, Path.Direction.CCW);
        canvas.drawPath(this.fIwbmz, this.AkhnZx);
    }

    public final void OLrzqt(android.graphics.Canvas canvas, int i, int i2, RectF rectF, float[] fArr) {
        copydefault(i, i2);
        this.fIwbmz.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.fIwbmz, this.AkhnZx);
    }

    public final void copydefault(int i, int i2) {
        this.fIwbmz.reset();
        android.graphics.Paint paint = this.AkhnZx;
        paint.setStrokeWidth(i);
        paint.setColor(i2);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void copydefault() {
        if (this.DbNXlk) {
            return;
        }
        float f = this.copydefault / 2.0f;
        this.EZpvd.set(f, f, this.getFieldNames - f, this.AhwBna - f);
    }

    public final void AEQbTJ() {
        if (this.DbNXlk) {
            float fMin = java.lang.Math.min(this.getFieldNames, this.AhwBna) / 2.0f;
            this.ejfBZ = fMin;
            float f = this.getFieldNames / 2.0f;
            float f2 = this.AhwBna / 2.0f;
            this.fJNWhG.set(f - fMin, f2 - fMin, f + fMin, f2 + fMin);
            return;
        }
        this.fJNWhG.set(0.0f, 0.0f, this.getFieldNames, this.AhwBna);
        if (this.fetchVPNInfo) {
            this.fJNWhG = this.EZpvd;
        }
    }

    public final void EZpvd() {
        if (this.DbNXlk) {
            return;
        }
        if (this.AYXKKw > 0) {
            int length = this.KWHzl.length;
            for (int i = 0; i < length; i++) {
                float[] fArr = this.KWHzl;
                float f = this.AYXKKw;
                fArr[i] = f;
                this.AuCTel[i] = f - (this.copydefault / 2.0f);
            }
            return;
        }
        float[] fArr2 = this.KWHzl;
        float f2 = this.hDKMBd;
        fArr2[1] = f2;
        fArr2[0] = f2;
        float f3 = this.uzCIH;
        fArr2[3] = f3;
        fArr2[2] = f3;
        float f4 = this.valueOf;
        fArr2[5] = f4;
        fArr2[4] = f4;
        float f5 = this.AEQbTJ;
        fArr2[7] = f5;
        fArr2[6] = f5;
        float[] fArr3 = this.AuCTel;
        float f6 = this.copydefault / 2.0f;
        float f7 = f2 - f6;
        fArr3[1] = f7;
        fArr3[0] = f7;
        float f8 = f3 - f6;
        fArr3[3] = f8;
        fArr3[2] = f8;
        float f9 = f4 - f6;
        fArr3[5] = f9;
        fArr3[4] = f9;
        float f10 = f5 - f6;
        fArr3[7] = f10;
        fArr3[6] = f10;
    }

    public final void AEQbTJ(boolean z) {
        if (z) {
            this.AYXKKw = 0;
        }
        EZpvd();
        copydefault();
        invalidate();
    }
}
