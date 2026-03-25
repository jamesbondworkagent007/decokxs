package o;

import android.graphics.RectF;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class wXK extends android.view.View implements InterfaceC52777wXz, InterfaceC55066xct {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final android.graphics.Paint AEQbTJ;
    public final android.view.animation.Interpolator AYXKKw;
    public float AhwBna;
    public float AkhnZx;
    public int AuCTel;
    public RelativeLayout.LayoutParams DbNXlk;
    public android.view.animation.Interpolator EZpvd;
    public float KWHzl;
    public float OLrzqt;
    public float djBIcL;
    public final RectF ejfBZ;
    public int fARcdN;
    public final C55065xcs fIwbmz;
    public int fetchVPNInfo;
    public float gEmmrt;
    public int isConnected;
    public int valueOf;
    public android.graphics.Path values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wXK(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wXK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final float AEQbTJ() {
        return this.KWHzl * this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final float djBIcL() {
        return this.AhwBna * this.gEmmrt;
    }

    @Override // o.InterfaceC52777wXz
    public void AEQbTJ(int i) {
    }

    @Override // o.InterfaceC52777wXz
    public android.view.View EZpvd() {
        return this;
    }

    @Override // o.InterfaceC52777wXz
    public void EZpvd(int i) {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:33) call: o.wXK.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wXK(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wXK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.AYXKKw = new android.view.animation.DecelerateInterpolator();
        this.isConnected = ContextCompat.getColor(context, C52761wXj.Activity.QwvEab);
        this.AuCTel = ContextCompat.getColor(context, C52761wXj.Activity.Dmq);
        this.AEQbTJ = new android.graphics.Paint(1);
        this.ejfBZ = new RectF();
        this.KWHzl = C55298xhM.EZpvd(2.0f, context);
        this.OLrzqt = 1.0f;
        this.AhwBna = C55298xhM.EZpvd(2.0f, context);
        this.gEmmrt = 2.0f;
        this.djBIcL = C55298xhM.EZpvd(2.0f, context);
        C55065xcs c55065xcs = new C55065xcs(this, 0, 2, null);
        this.fIwbmz = c55065xcs;
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55065xcs, attributeSet, i, 0, 4, null);
        copydefault();
    }

    public static /* synthetic */ void setSelectedItem$default(wXK wxk, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        wxk.setSelectedItem(i);
    }

    public final void setSelectedItem(int i) {
        gEmmrt(i);
        requestLayout();
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        this.fIwbmz.setOKDSSize(i);
        copydefault();
        requestLayout();
    }

    @Override // o.InterfaceC52777wXz
    public void setCount(int i) {
        this.fetchVPNInfo = i;
        gEmmrt(this.fARcdN);
        setVisibility(i > 1 ? 0 : 8);
        requestLayout();
    }

    @Override // o.InterfaceC52777wXz
    public RelativeLayout.LayoutParams OLrzqt() {
        if (this.DbNXlk == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(12);
            layoutParams.addRule(14);
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            layoutParams.bottomMargin = C55298xhM.OLrzqt(12, context);
            this.DbNXlk = layoutParams;
        }
        RelativeLayout.LayoutParams layoutParams2 = this.DbNXlk;
        Intrinsics.copydefault(layoutParams2);
        return layoutParams2;
    }

    @Override // o.InterfaceC52777wXz
    public void copydefault(int i, float f, int i2) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C55296xhK.OLrzqt(context)) {
            i = (this.fetchVPNInfo - 1) - i;
        }
        this.fARcdN = i;
        this.AkhnZx = 0.0f;
        invalidate();
    }

    @Override // o.InterfaceC52777wXz
    public void setCount(int i, int i2) {
        this.fetchVPNInfo = i;
        setVisibility(i > 1 ? 0 : 8);
        requestLayout();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(KWHzl(i), OLrzqt(i2));
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        if (this.fetchVPNInfo == 0) {
            return;
        }
        float height = (getHeight() / 2.0f) + 0.5f;
        int i = this.valueOf;
        if (i == 0) {
            AEQbTJ(canvas, height);
            return;
        }
        if (i == 1) {
            KWHzl(canvas, height);
            return;
        }
        if (i == 2) {
            EZpvd(canvas, height);
        } else if (i == 3) {
            copydefault(canvas, height);
        } else {
            if (i != 4) {
                return;
            }
            OLrzqt(canvas, height);
        }
    }

    private final int KWHzl(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE && mode != 0) {
            if (mode != 1073741824) {
                return 0;
            }
            return size;
        }
        return (int) ((AEQbTJ() * 2 * this.fetchVPNInfo) + ((r2 - 1) * this.djBIcL) + djBIcL() + getPaddingLeft() + getPaddingRight());
    }

    private final int OLrzqt(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            return (int) ((C56548yJl.copydefault(djBIcL(), AEQbTJ()) * 2) + getPaddingTop() + getPaddingBottom());
        }
        if (mode != 1073741824) {
            return 0;
        }
        return size;
    }

    private final void gEmmrt(int i) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C55296xhK.OLrzqt(context)) {
            i = (this.fetchVPNInfo - 1) - i;
        }
        this.fARcdN = i;
    }

    public final void OLrzqt(android.graphics.Canvas canvas, float f) {
        AYXKKw(canvas, f);
        float fCopydefault = copydefault(this.fARcdN);
        int i = this.fARcdN;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        float fCopydefault2 = copydefault((i + (C55296xhK.OLrzqt(context) ? -1 : 1)) % this.fetchVPNInfo);
        float fDjBIcL = djBIcL();
        float f2 = fCopydefault - fDjBIcL;
        float f3 = fCopydefault + fDjBIcL;
        float fKWHzl = KWHzl();
        float fKWHzl2 = KWHzl();
        RectF rectF = this.ejfBZ;
        float f4 = this.AhwBna;
        rectF.set(f2 + (((fCopydefault2 - fDjBIcL) - f2) * fKWHzl), f - f4, f3 + (((fCopydefault2 + fDjBIcL) - f3) * fKWHzl2), f + f4);
        this.AEQbTJ.setColor(this.AuCTel);
        RectF rectF2 = this.ejfBZ;
        float f5 = this.AhwBna;
        canvas.drawRoundRect(rectF2, f5, f5, this.AEQbTJ);
    }

    public final void KWHzl(android.graphics.Canvas canvas, float f) {
        float fCopydefault;
        float fValueOf;
        AYXKKw(canvas, f);
        float fCopydefault2 = copydefault(this.fARcdN);
        float fDjBIcL = djBIcL();
        float f2 = fCopydefault2 - fDjBIcL;
        float fKWHzl = KWHzl();
        float f3 = 2;
        float fCopydefault3 = this.djBIcL + (C56548yJl.copydefault(AEQbTJ(), fDjBIcL) * f3);
        int i = this.fARcdN;
        if ((i + 1) % this.fetchVPNInfo == 0) {
            float f4 = fCopydefault3 * (-i);
            fCopydefault = f2 + C56548yJl.copydefault(f4 * fKWHzl * f3, f4);
            fValueOf = C56548yJl.valueOf(f4 * (fKWHzl - 0.5f) * 2.0f, 0.0f);
        } else {
            fCopydefault = f2 + C56548yJl.copydefault((fKWHzl - 0.5f) * fCopydefault3 * 2.0f, 0.0f);
            fValueOf = C56548yJl.valueOf(fKWHzl * fCopydefault3 * f3, fCopydefault3);
        }
        RectF rectF = this.ejfBZ;
        float f5 = this.AhwBna;
        rectF.set(fCopydefault, f - f5, fCopydefault2 + fDjBIcL + fValueOf, f + f5);
        this.AEQbTJ.setColor(this.AuCTel);
        RectF rectF2 = this.ejfBZ;
        float f6 = this.AhwBna;
        canvas.drawRoundRect(rectF2, f6, f6, this.AEQbTJ);
    }

    public final void EZpvd(android.graphics.Canvas canvas, float f) {
        AYXKKw(canvas, f);
        if (this.values == null) {
            this.values = new android.graphics.Path();
        }
        if (this.EZpvd == null) {
            this.EZpvd = new android.view.animation.AccelerateInterpolator();
        }
        float fCopydefault = copydefault(this.fARcdN);
        float fCopydefault2 = copydefault((this.fARcdN + 1) % this.fetchVPNInfo) - fCopydefault;
        android.view.animation.Interpolator interpolator = this.EZpvd;
        Intrinsics.copydefault(interpolator);
        float interpolation = (interpolator.getInterpolation(this.AkhnZx) * fCopydefault2) + fCopydefault;
        float fKWHzl = fCopydefault + (fCopydefault2 * KWHzl());
        float fDjBIcL = djBIcL();
        float f2 = this.AhwBna * 0.57f;
        float f3 = this.gEmmrt * f2;
        float fKWHzl2 = ((f3 - fDjBIcL) * KWHzl()) + fDjBIcL;
        android.view.animation.Interpolator interpolator2 = this.EZpvd;
        Intrinsics.copydefault(interpolator2);
        float interpolation2 = f3 + ((fDjBIcL - f3) * interpolator2.getInterpolation(this.AkhnZx));
        float fKWHzl3 = (this.AhwBna - f2) * KWHzl();
        float f4 = this.AhwBna;
        android.view.animation.Interpolator interpolator3 = this.EZpvd;
        Intrinsics.copydefault(interpolator3);
        float interpolation3 = (f4 - f2) * interpolator3.getInterpolation(this.AkhnZx);
        this.AEQbTJ.setColor(this.AuCTel);
        RectF rectF = this.ejfBZ;
        float f5 = this.AhwBna;
        rectF.set(interpolation - fKWHzl2, (f - f5) + fKWHzl3, interpolation + fKWHzl2, (f5 + f) - fKWHzl3);
        canvas.drawRoundRect(this.ejfBZ, fKWHzl2, fKWHzl2, this.AEQbTJ);
        float f6 = (f - f2) - interpolation3;
        float f7 = f2 + f + interpolation3;
        this.ejfBZ.set(fKWHzl - interpolation2, f6, fKWHzl + interpolation2, f7);
        canvas.drawRoundRect(this.ejfBZ, interpolation2, interpolation2, this.AEQbTJ);
        android.graphics.Path path = this.values;
        if (path != null) {
            path.reset();
            path.moveTo(fKWHzl, f);
            path.lineTo(fKWHzl, f6);
            float f8 = ((interpolation - fKWHzl) / 2.0f) + fKWHzl;
            path.quadTo(f8, f, interpolation, (f - this.AhwBna) + fKWHzl3);
            path.lineTo(interpolation, (this.AhwBna + f) - fKWHzl3);
            path.quadTo(f8, f, fKWHzl, f7);
            path.close();
        }
        android.graphics.Path path2 = this.values;
        Intrinsics.copydefault(path2);
        canvas.drawPath(path2, this.AEQbTJ);
    }

    public final void copydefault(android.graphics.Canvas canvas, float f) {
        float fKWHzl = KWHzl();
        float fDjBIcL = djBIcL();
        float fAEQbTJ = AEQbTJ();
        float f2 = fDjBIcL - fAEQbTJ;
        float f3 = f2 * fKWHzl;
        int i = (this.fARcdN + 1) % this.fetchVPNInfo;
        int i2 = 0;
        boolean z = i == 0;
        this.AEQbTJ.setColor(this.isConnected);
        int i3 = this.fetchVPNInfo;
        while (i2 < i3) {
            float fCopydefault = copydefault(i2);
            if (z) {
                fCopydefault += f3;
            }
            float f4 = fCopydefault - fAEQbTJ;
            float f5 = this.KWHzl;
            float f6 = f - f5;
            float f7 = fCopydefault + fAEQbTJ;
            float f8 = f + f5;
            float f9 = fAEQbTJ;
            if (this.fARcdN + 1 <= i2) {
                this.ejfBZ.set(f4 + f2, f6, f7 + f2, f8);
            } else {
                this.ejfBZ.set(f4, f6, f7, f8);
            }
            RectF rectF = this.ejfBZ;
            float f10 = this.KWHzl;
            canvas.drawRoundRect(rectF, f10, f10, this.AEQbTJ);
            i2++;
            fAEQbTJ = f9;
        }
        this.AEQbTJ.setColor(this.AuCTel);
        if (fKWHzl < 0.99f) {
            float fCopydefault2 = copydefault(this.fARcdN) - fDjBIcL;
            if (z) {
                fCopydefault2 += f3;
            }
            RectF rectF2 = this.ejfBZ;
            float f11 = this.AhwBna;
            rectF2.set(fCopydefault2, f - f11, (((2 * fDjBIcL) + fCopydefault2) + f2) - f3, f + f11);
            RectF rectF3 = this.ejfBZ;
            float f12 = this.AhwBna;
            canvas.drawRoundRect(rectF3, f12, f12, this.AEQbTJ);
        }
        if (fKWHzl > 0.1f) {
            float fCopydefault3 = copydefault(i);
            if (z) {
                f2 = f3;
            }
            float f13 = fCopydefault3 + fDjBIcL + f2;
            RectF rectF4 = this.ejfBZ;
            float f14 = this.AhwBna;
            rectF4.set((f13 - (fDjBIcL * 2)) - f3, f - f14, f13, f + f14);
            RectF rectF5 = this.ejfBZ;
            float f15 = this.AhwBna;
            canvas.drawRoundRect(rectF5, f15, f15, this.AEQbTJ);
        }
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, float f) {
        AYXKKw(canvas, f);
        float fKWHzl = KWHzl();
        float fCopydefault = copydefault(this.fARcdN);
        int i = this.fARcdN;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        float fCopydefault2 = copydefault((i + (C55296xhK.OLrzqt(context) ? -1 : 1)) % this.fetchVPNInfo);
        float fAEQbTJ = AEQbTJ();
        float f2 = this.AhwBna;
        float f3 = this.gEmmrt * f2;
        float f4 = (f3 - fAEQbTJ) * fKWHzl;
        float f5 = f3 - f4;
        float f6 = fAEQbTJ + f4;
        float f7 = (f2 - this.KWHzl) * fKWHzl;
        this.AEQbTJ.setColor(this.AuCTel);
        if (fKWHzl < 0.99f) {
            this.ejfBZ.set(fCopydefault - f5, (f - f2) + f7, fCopydefault + f5, (f2 + f) - f7);
            canvas.drawRoundRect(this.ejfBZ, f5, f5, this.AEQbTJ);
        }
        if (fKWHzl > 0.1f) {
            float f8 = this.KWHzl;
            this.ejfBZ.set(fCopydefault2 - f6, (f - f8) - f7, fCopydefault2 + f6, f + f8 + f7);
            canvas.drawRoundRect(this.ejfBZ, f6, f6, this.AEQbTJ);
        }
    }

    public final void AYXKKw(android.graphics.Canvas canvas, float f) {
        this.AEQbTJ.setColor(this.isConnected);
        int i = this.fetchVPNInfo;
        if (i < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            float fCopydefault = copydefault(i2);
            float fAEQbTJ = AEQbTJ();
            float f2 = this.KWHzl;
            this.ejfBZ.set(fCopydefault - fAEQbTJ, f - f2, fCopydefault + fAEQbTJ, f2 + f);
            RectF rectF = this.ejfBZ;
            float f3 = this.KWHzl;
            canvas.drawRoundRect(rectF, f3, f3, this.AEQbTJ);
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    private final float copydefault(int i) {
        float fAEQbTJ;
        float f;
        float paddingLeft = getPaddingLeft();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == this.fARcdN) {
                fAEQbTJ = 2 * djBIcL();
                f = this.djBIcL;
            } else {
                fAEQbTJ = 2 * AEQbTJ();
                f = this.djBIcL;
            }
            paddingLeft += fAEQbTJ + f;
        }
        return paddingLeft + (i == this.fARcdN ? djBIcL() : AEQbTJ());
    }

    public final void copydefault() {
        if (this.fIwbmz.copydefault() == -5) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.KWHzl = C55298xhM.EZpvd(2.0f, context);
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            this.AhwBna = C55298xhM.EZpvd(2.0f, context2);
            return;
        }
        if (this.fIwbmz.copydefault() == -3) {
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            this.KWHzl = C55298xhM.EZpvd(4.0f, context3);
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            this.AhwBna = C55298xhM.EZpvd(4.0f, context4);
        }
    }

    public final float KWHzl() {
        return this.AYXKKw.getInterpolation(this.AkhnZx);
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wXK.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
