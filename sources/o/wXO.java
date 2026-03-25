package o;

import android.graphics.BlurMaskFilter;
import android.graphics.RectF;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.content.ContextCompat;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC52764wXm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wXO extends android.view.View implements InterfaceC55066xct, InterfaceC52777wXz {
    public float AYXKKw;
    public float AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public int AuCTel;
    public int DbNXlk;
    public final InterfaceC56387yDm EZpvd;
    public float KWHzl;
    public final android.graphics.Paint OLrzqt;
    public int copydefault;
    public float djBIcL;
    public final C55065xcs ejfBZ;
    public RelativeLayout.LayoutParams fARcdN;
    public RelativeLayout.LayoutParams fIwbmz;
    public int fJNWhG;
    public int fetchVPNInfo;
    public float gEmmrt;
    public final RectF isConnected;
    public float valueOf;
    public int values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wXO(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wXO(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final float AYXKKw() {
        return this.djBIcL * this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final float AhwBna() {
        return this.KWHzl * this.gEmmrt;
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
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:33) call: o.wXO.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wXO(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wXO(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.values = ContextCompat.getColor(context, C52761wXj.Activity.QwvEab);
        this.DbNXlk = ContextCompat.getColor(context, C52761wXj.Activity.Dmq);
        this.copydefault = ContextCompat.getColor(context, C52761wXj.Activity.HJWChPfrwjPh);
        this.OLrzqt = new android.graphics.Paint(1);
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.wXN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wXO.EZpvd(this.AEQbTJ, context);
            }
        });
        this.isConnected = new RectF();
        this.KWHzl = C55298xhM.EZpvd(2.0f, context);
        this.gEmmrt = 1.0f;
        this.djBIcL = C55298xhM.EZpvd(2.0f, context);
        this.valueOf = 2.0f;
        this.AhwBna = C55298xhM.EZpvd(2.0f, context);
        this.AYXKKw = C55298xhM.EZpvd(1.0f, context);
        C55065xcs c55065xcs = new C55065xcs(this, 0, 2, null);
        this.ejfBZ = c55065xcs;
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.wXP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wXO.KWHzl();
            }
        });
        InterfaceC52764wXm.Application.loadFromAttributes$default(c55065xcs, attributeSet, i, 0, 4, null);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.OeawrH, i, 0);
        this.fJNWhG = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.RidNCX, 0);
        AEQbTJ();
        if (typedArrayObtainStyledAttributes.hasValue(C52761wXj.PictureInPictureParams.OWSZPf)) {
            this.values = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.OWSZPf, this.values);
        }
        if (typedArrayObtainStyledAttributes.hasValue(C52761wXj.PictureInPictureParams.OAUGar)) {
            this.DbNXlk = typedArrayObtainStyledAttributes.getColor(C52761wXj.PictureInPictureParams.OAUGar, this.DbNXlk);
        }
        typedArrayObtainStyledAttributes.recycle();
        djBIcL();
    }

    public static final android.graphics.Paint EZpvd(wXO wxo, android.content.Context context) {
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(wxo.copydefault);
        paint.setMaskFilter(new BlurMaskFilter(C55298xhM.OLrzqt(8.0f, context), BlurMaskFilter.Blur.NORMAL));
        return paint;
    }

    private final android.graphics.Paint gEmmrt() {
        return (android.graphics.Paint) this.EZpvd.getValue();
    }

    public static final CopyOnWriteArrayList KWHzl() {
        return new CopyOnWriteArrayList();
    }

    private final CopyOnWriteArrayList<wXA> valueOf() {
        return (CopyOnWriteArrayList) this.AkhnZx.getValue();
    }

    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        this.ejfBZ.setOKDSSize(i);
        djBIcL();
        requestLayout();
    }

    @Override // o.InterfaceC52777wXz
    public void setCount(int i) {
        this.fetchVPNInfo = i;
        AhwBna(this.AuCTel);
        setVisibility(i > 1 ? 0 : 8);
        java.util.Iterator<T> it = valueOf().iterator();
        while (it.hasNext()) {
            ((wXA) it.next()).OLrzqt(getVisibility());
        }
        requestLayout();
    }

    @Override // o.InterfaceC52777wXz
    public void setCount(int i, int i2) {
        setCount(i);
    }

    public void AEQbTJ(@NotNull wXA wxa) {
        Intrinsics.checkNotNullParameter(wxa, "");
        valueOf().add(wxa);
    }

    public final void setStyle(int i) {
        this.fJNWhG = i;
        djBIcL();
        AEQbTJ();
        requestLayout();
    }

    public final void setNormalColor(@androidx.annotation.ColorInt int i) {
        this.values = i;
        invalidate();
    }

    public final void setSelectedColor(@androidx.annotation.ColorInt int i) {
        this.DbNXlk = i;
        invalidate();
    }

    public final void setColors(@androidx.annotation.ColorInt int i, @androidx.annotation.ColorInt int i2) {
        this.values = i;
        this.DbNXlk = i2;
        invalidate();
    }

    public static /* synthetic */ void setSelectedItem$default(wXO wxo, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        wxo.setSelectedItem(i);
    }

    public final void setSelectedItem(int i) {
        AhwBna(i);
        requestLayout();
    }

    @Override // o.InterfaceC52777wXz
    public RelativeLayout.LayoutParams OLrzqt() {
        if (this.fJNWhG != 1) {
            if (this.fIwbmz == null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12);
                layoutParams.addRule(14);
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                layoutParams.bottomMargin = C55298xhM.OLrzqt(12, context);
                this.fIwbmz = layoutParams;
            }
            return this.fIwbmz;
        }
        if (this.fARcdN == null) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(10);
            layoutParams2.addRule(20);
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iOLrzqt = C55298xhM.OLrzqt(8, context2);
            setPadding(iOLrzqt, iOLrzqt, iOLrzqt, iOLrzqt);
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            layoutParams2.topMargin = C55298xhM.OLrzqt(8, context3);
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            layoutParams2.setMarginStart(C55298xhM.OLrzqt(32, context4));
            this.fARcdN = layoutParams2;
        }
        return this.fARcdN;
    }

    @Override // o.InterfaceC52777wXz
    public void copydefault(int i, float f, int i2) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C55296xhK.OLrzqt(context)) {
            i = (this.fetchVPNInfo - 1) - i;
        }
        this.AuCTel = i;
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(copydefault(i), OLrzqt(i2));
    }

    @Override // android.view.View
    public void onDraw(@NotNull android.graphics.Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "");
        super.onDraw(canvas);
        if (this.fetchVPNInfo == 0) {
            return;
        }
        float height = (getHeight() / 2.0f) + 0.5f;
        int i = this.fJNWhG;
        if (i == 0) {
            KWHzl(canvas, height, this.AuCTel);
        } else {
            if (i != 1) {
                return;
            }
            AEQbTJ(canvas, height, this.AuCTel);
        }
    }

    public final int copydefault(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE && mode != 0) {
            if (mode != 1073741824) {
                return 0;
            }
            return size;
        }
        return (int) ((AhwBna() * 2 * this.fetchVPNInfo) + ((r2 - 1) * this.AhwBna) + AYXKKw() + getPaddingLeft() + getPaddingRight());
    }

    public final int OLrzqt(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            return (int) ((C56548yJl.copydefault(AYXKKw(), AhwBna()) * 2) + getPaddingTop() + getPaddingBottom());
        }
        if (mode != 1073741824) {
            return 0;
        }
        return size;
    }

    public final void AhwBna(int i) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C55296xhK.OLrzqt(context)) {
            i = (this.fetchVPNInfo - 1) - i;
        }
        this.AuCTel = i;
    }

    public final void KWHzl(android.graphics.Canvas canvas, float f, int i) {
        OLrzqt(canvas, f, i);
        this.OLrzqt.setColor(this.DbNXlk);
        float fKWHzl = KWHzl(i);
        float f2 = this.djBIcL;
        float f3 = this.valueOf * f2;
        this.isConnected.set(fKWHzl - f3, f - f2, fKWHzl + f3, f + f2);
        canvas.drawRoundRect(this.isConnected, f3, f3, this.OLrzqt);
    }

    public final void OLrzqt(android.graphics.Canvas canvas, float f, int i) {
        this.OLrzqt.setColor(this.values);
        int i2 = this.fetchVPNInfo;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 != i) {
                float fKWHzl = KWHzl(i3);
                this.isConnected.set(fKWHzl - AhwBna(), f - this.KWHzl, fKWHzl + AhwBna(), this.KWHzl + f);
                RectF rectF = this.isConnected;
                float f2 = this.KWHzl;
                canvas.drawRoundRect(rectF, f2, f2, this.OLrzqt);
            }
        }
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, float f, int i) {
        float fKWHzl = KWHzl(i);
        float f2 = this.djBIcL;
        float f3 = this.valueOf * f2;
        this.isConnected.set(fKWHzl - f3, f - f2, fKWHzl + f3, f2 + f);
        if (C33492mxV.OLrzqt()) {
            RectF rectF = this.isConnected;
            float f4 = this.AYXKKw;
            canvas.drawRoundRect(rectF, f4, f4, gEmmrt());
        }
        this.OLrzqt.setColor(this.DbNXlk);
        RectF rectF2 = this.isConnected;
        float f5 = this.AYXKKw;
        canvas.drawRoundRect(rectF2, f5, f5, this.OLrzqt);
        copydefault(canvas, f, i);
    }

    public final void copydefault(android.graphics.Canvas canvas, float f, int i) {
        this.OLrzqt.setColor(this.values);
        int i2 = this.fetchVPNInfo;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 != i) {
                float fKWHzl = KWHzl(i3);
                this.isConnected.set(fKWHzl - AhwBna(), f - this.KWHzl, fKWHzl + AhwBna(), this.KWHzl + f);
                RectF rectF = this.isConnected;
                float f2 = this.AYXKKw;
                canvas.drawRoundRect(rectF, f2, f2, this.OLrzqt);
            }
        }
    }

    public final float KWHzl(int i) {
        float fAhwBna;
        float f;
        float paddingLeft = getPaddingLeft();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == this.AuCTel) {
                fAhwBna = 2 * AYXKKw();
                f = this.AhwBna;
            } else {
                fAhwBna = 2 * AhwBna();
                f = this.AhwBna;
            }
            paddingLeft += fAhwBna + f;
        }
        return paddingLeft + (i == this.AuCTel ? AYXKKw() : AhwBna());
    }

    public final void djBIcL() {
        int i = this.fJNWhG;
        if (i == 0) {
            if (this.ejfBZ.copydefault() == -5) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                this.KWHzl = C55298xhM.EZpvd(2.0f, context);
                this.gEmmrt = 1.0f;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                this.djBIcL = C55298xhM.EZpvd(2.0f, context2);
                this.valueOf = 2.0f;
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                this.AhwBna = C55298xhM.EZpvd(2.0f, context3);
                return;
            }
            if (this.ejfBZ.copydefault() == -3) {
                android.content.Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                this.KWHzl = C55298xhM.EZpvd(4.0f, context4);
                this.gEmmrt = 1.0f;
                android.content.Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                this.djBIcL = C55298xhM.EZpvd(4.0f, context5);
                this.valueOf = 2.0f;
                android.content.Context context6 = getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "");
                this.AhwBna = C55298xhM.EZpvd(4.0f, context6);
                return;
            }
            return;
        }
        if (i == 1 && this.ejfBZ.copydefault() == -5) {
            android.content.Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "");
            float fEZpvd = C55298xhM.EZpvd(3.0f, context7);
            this.KWHzl = fEZpvd;
            this.gEmmrt = 1.0f;
            this.djBIcL = fEZpvd;
            this.valueOf = 1.0f;
            android.content.Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "");
            this.AYXKKw = C55298xhM.EZpvd(1.0f, context8);
            android.content.Context context9 = getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "");
            this.AhwBna = C55298xhM.EZpvd(2.0f, context9);
        }
    }

    public final void AEQbTJ() {
        int i = this.fJNWhG;
        if (i == 0) {
            this.values = ContextCompat.getColor(getContext(), C52761wXj.Activity.GcnicV);
            this.DbNXlk = ContextCompat.getColor(getContext(), C52761wXj.Activity.RFmUsE);
        } else {
            if (i != 1) {
                return;
            }
            this.values = ContextCompat.getColor(getContext(), C52761wXj.Activity.GcnicV);
            this.DbNXlk = ContextCompat.getColor(getContext(), C52761wXj.Activity.RFmUsE);
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wXO.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
