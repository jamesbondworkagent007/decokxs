package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.business.defi.api.bean.CurrencyPrependSign;
import java.math.BigDecimal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dre, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14766dre extends ConstraintLayout {
    public final float AEQbTJ;
    public java.lang.String AhwBna;
    public final AbstractC16930etH EZpvd;
    public boolean KWHzl;
    public View.OnLayoutChangeListener OLrzqt;
    public boolean copydefault;
    public java.lang.String gEmmrt;
    public final float valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14766dre(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14766dre(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: o.dre.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C14766dre(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14766dre(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = true;
        this.AEQbTJ = 2.0f;
        this.valueOf = 0.5f;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C13754dXa.TaskDescription.HJWChPRAkuRW, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC16930etH) viewDataBindingInflate;
        this.OLrzqt = new View.OnLayoutChangeListener() { // from class: o.drh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                C14766dre.KWHzl(this.OLrzqt, view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        copydefault();
    }

    public static final void KWHzl(C14766dre c14766dre, android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (c14766dre.getWidth() != 0) {
            c14766dre.setData(c14766dre.AhwBna, c14766dre.gEmmrt, c14766dre.KWHzl);
            c14766dre.EZpvd();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        copydefault();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        EZpvd();
        super.onDetachedFromWindow();
    }

    public final void copydefault() {
        View.OnLayoutChangeListener onLayoutChangeListener;
        if (this.copydefault || (onLayoutChangeListener = this.OLrzqt) == null) {
            return;
        }
        addOnLayoutChangeListener(onLayoutChangeListener);
        this.copydefault = true;
    }

    public final void EZpvd() {
        if (this.copydefault) {
            View.OnLayoutChangeListener onLayoutChangeListener = this.OLrzqt;
            if (onLayoutChangeListener != null) {
                removeOnLayoutChangeListener(onLayoutChangeListener);
            }
            this.copydefault = false;
        }
    }

    public final void setData(final java.lang.String str, final java.lang.String str2, final boolean z) {
        this.AhwBna = str;
        this.gEmmrt = str2;
        this.KWHzl = z;
        this.EZpvd.getRoot().post(new java.lang.Runnable() { // from class: o.drg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C14766dre.setData$lambda$3(this.AEQbTJ, str, z, str2);
            }
        });
    }

    public static final void setData$lambda$3(C14766dre c14766dre, java.lang.String str, boolean z, java.lang.String str2) {
        int pnlTextColor$default;
        java.lang.String strKWHzl;
        int pnlTextColor$default2;
        java.lang.String strKWHzl2;
        if (c14766dre.getWidth() == 0) {
            return;
        }
        if (str == null || str.length() == 0) {
            android.content.Context context = c14766dre.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            pnlTextColor$default = C14773drl.getPnlTextColor$default("", context, null, 2, null);
            strKWHzl = "--";
        } else {
            android.content.Context context2 = c14766dre.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            pnlTextColor$default = C14773drl.getPnlTextColor$default(str, context2, null, 2, null);
            strKWHzl = C54873xYm.formatSpecificNum$default(C33129mqd.copydefault(str), CurrencyPrependSign.CURRENCY_SIGN_NONE, null, 2, null);
        }
        c14766dre.EZpvd.EZpvd.setTextColor(pnlTextColor$default);
        if (z) {
            strKWHzl = C13821dZn.EZpvd.KWHzl(strKWHzl);
        }
        if (str2 == null || str2.length() == 0) {
            android.content.Context context3 = c14766dre.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            pnlTextColor$default2 = C14773drl.getPnlTextColor$default("", context3, null, 2, null);
            strKWHzl2 = "--";
        } else {
            android.content.Context context4 = c14766dre.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            pnlTextColor$default2 = C14773drl.getPnlTextColor$default("-" + str2, context4, null, 2, null);
            strKWHzl2 = C54873xYm.formatSpecificNum$default(C33129mqd.copydefault(str2), CurrencyPrependSign.CURRENCY_SIGN_NONE, null, 2, null);
        }
        c14766dre.EZpvd.copydefault.setTextColor(pnlTextColor$default2);
        if (z) {
            strKWHzl2 = C13821dZn.EZpvd.KWHzl(strKWHzl2);
        }
        c14766dre.KWHzl(strKWHzl + strKWHzl2);
        c14766dre.EZpvd.EZpvd.setText(strKWHzl);
        c14766dre.EZpvd.copydefault.setText(strKWHzl2);
    }

    public final void KWHzl(java.lang.String str) {
        BigDecimal bigDecimalAEQbTJ = C54862xYb.AEQbTJ(java.lang.Integer.valueOf(getWidth()), java.lang.Integer.valueOf(C55298xhM.dp2px$default(55.0f, null, 1, null)));
        float f = 20.5f;
        float fMeasureText = 0.0f;
        while (true) {
            if (fMeasureText != 0.0f && (!C33129mqd.AEQbTJ(java.lang.Float.valueOf(fMeasureText), bigDecimalAEQbTJ) || !C33129mqd.AEQbTJ(java.lang.Float.valueOf(f), java.lang.Float.valueOf(this.AEQbTJ)))) {
                return;
            }
            f -= this.valueOf;
            this.EZpvd.EZpvd.setTextSize(2, f);
            this.EZpvd.copydefault.setTextSize(2, f);
            fMeasureText = this.EZpvd.EZpvd.getPaint().measureText(str);
        }
    }
}
