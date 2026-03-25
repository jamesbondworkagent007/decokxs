package o;

import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.localization.util.format.DisplaySign;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gWH extends android.widget.FrameLayout {
    public final long AEQbTJ;
    public final android.os.Handler EZpvd;
    public java.util.List<StateListAnimator> KWHzl;
    public boolean OLrzqt;
    public int copydefault;
    public final long gEmmrt;
    public final android.widget.ViewFlipper valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gWH(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gWH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:36) call: o.gWH.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ gWH(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gWH(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.widget.ViewFlipper viewFlipper = new android.widget.ViewFlipper(context);
        viewFlipper.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.valueOf = viewFlipper;
        this.EZpvd = new android.os.Handler(android.os.Looper.getMainLooper());
        this.KWHzl = yDY.AhwBna();
        this.gEmmrt = 5000L;
        this.AEQbTJ = 500L;
        addView(viewFlipper);
        setupAnimations();
    }

    public final void setupAnimations() {
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(this.AEQbTJ);
        android.view.animation.TranslateAnimation translateAnimation2 = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
        translateAnimation2.setDuration(this.AEQbTJ);
        this.valueOf.setInAnimation(translateAnimation);
        this.valueOf.setOutAnimation(translateAnimation2);
    }

    public final void setData(@NotNull java.util.List<StateListAnimator> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
        this.copydefault = 0;
        this.valueOf.removeAllViews();
        if (list.isEmpty()) {
            OLrzqt();
            return;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.valueOf.addView(KWHzl((StateListAnimator) it.next()));
        }
        AEQbTJ();
    }

    public final android.view.View KWHzl(StateListAnimator stateListAnimator) {
        int iLossAlternativeColor$default;
        C21547hDk c21547hDkEZpvd = C21547hDk.EZpvd(android.view.LayoutInflater.from(getContext()), this.valueOf, false);
        Intrinsics.checkNotNullExpressionValue(c21547hDkEZpvd, "");
        AppCompatImageView appCompatImageView = c21547hDkEZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        java.lang.String strCopydefault = stateListAnimator.copydefault();
        java.lang.String strAEQbTJ = stateListAnimator.AEQbTJ();
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        C25386ivj.KWHzl(appCompatImageView, null, strCopydefault, strAEQbTJ, 8.0f);
        AppCompatTextView appCompatTextView = c21547hDkEZpvd.copydefault;
        java.lang.String strAEQbTJ2 = stateListAnimator.AEQbTJ();
        if (strAEQbTJ2 == null) {
            strAEQbTJ2 = "";
        }
        appCompatTextView.setText(strAEQbTJ2);
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        java.lang.String strOLrzqt = stateListAnimator.OLrzqt();
        DisplaySign displaySign = DisplaySign.EXCEPT_ZERO;
        java.lang.String scientificCurrency$default = C23272hvB.formatScientificCurrency$default(c23272hvB, strOLrzqt, true, null, false, false, false, false, displaySign, false, false, 446, null);
        java.lang.String str = scientificCurrency$default + " (" + kLY.formatPercentage$default(stateListAnimator.KWHzl(), displaySign, false, null, null, 14, null) + ") • " + C33070mpX.AYXKKw(C23274hvD.Fragment.DpxfQh);
        if (C23313hvq.EZpvd(stateListAnimator.OLrzqt(), 0)) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iLossAlternativeColor$default = C33508mxl.profitAlternativeColor$default(context, 0.0f, 1, null);
        } else {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iLossAlternativeColor$default = C33508mxl.lossAlternativeColor$default(context2, 0.0f, 1, null);
        }
        c21547hDkEZpvd.AEQbTJ.setText(C24324ibg.addSpanWithColor$default(C24324ibg.Companion.KWHzl(str), scientificCurrency$default, iLossAlternativeColor$default, 0, 4, null).AEQbTJ());
        android.widget.LinearLayout root = c21547hDkEZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public final void AEQbTJ() {
        if (this.KWHzl.isEmpty() || this.OLrzqt) {
            return;
        }
        this.OLrzqt = true;
        KWHzl();
    }

    public final void OLrzqt() {
        this.OLrzqt = false;
        this.EZpvd.removeCallbacksAndMessages(null);
    }

    public final void KWHzl() {
        this.EZpvd.postDelayed(new java.lang.Runnable() { // from class: o.gWF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                gWH.copydefault(this.OLrzqt);
            }
        }, this.gEmmrt);
    }

    public static final void copydefault(gWH gwh) {
        if (gwh.OLrzqt && (!gwh.KWHzl.isEmpty())) {
            gwh.copydefault = (gwh.copydefault + 1) % gwh.KWHzl.size();
            gwh.valueOf.showNext();
            gwh.KWHzl();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!(!this.KWHzl.isEmpty()) || this.OLrzqt) {
            return;
        }
        AEQbTJ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OLrzqt();
    }

    public static final class StateListAnimator {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                str2 = stateListAnimator.AEQbTJ;
            }
            if ((i & 4) != 0) {
                str3 = stateListAnimator.EZpvd;
            }
            if ((i & 8) != 0) {
                str4 = stateListAnimator.copydefault;
            }
            return stateListAnimator.AEQbTJ(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new StateListAnimator(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stateListAnimator.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) stateListAnimator.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.KWHzl;
            int iHashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.AEQbTJ;
            return (((((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TraderGainItem(walletLogoUrl=" + this.KWHzl + ", name=" + this.AEQbTJ + ", amount=" + this.EZpvd + ", percentage=" + this.copydefault + ")";
        }

        public StateListAnimator(java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.KWHzl = str;
            this.AEQbTJ = str2;
            this.EZpvd = str3;
            this.copydefault = str4;
        }
    }
}
