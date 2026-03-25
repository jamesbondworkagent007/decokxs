package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.koL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C29154koL extends ConstraintLayout {
    public PnLDetailsUiModel KWHzl;
    public java.lang.String OLrzqt;
    public final hEE copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29154koL(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29154koL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:17) call: o.koL.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C29154koL(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29154koL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        hEE heeAEQbTJ = hEE.AEQbTJ(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(heeAEQbTJ, "");
        this.copydefault = heeAEQbTJ;
        heeAEQbTJ.gEmmrt.setText("");
        heeAEQbTJ.AYXKKw.setText("");
        heeAEQbTJ.EZpvd.setText("");
    }

    public static /* synthetic */ void setData$default(C29154koL c29154koL, boolean z, java.lang.String str, PnLDetailsUiModel pnLDetailsUiModel, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = c29154koL.OLrzqt;
        }
        if ((i & 4) != 0) {
            pnLDetailsUiModel = c29154koL.KWHzl;
        }
        c29154koL.setData(z, str, pnLDetailsUiModel, function0);
    }

    public final void setData(boolean z, java.lang.String str, PnLDetailsUiModel pnLDetailsUiModel, @NotNull Function0<Unit> function0) {
        java.lang.CharSequence charSequence;
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = str;
        this.KWHzl = pnLDetailsUiModel;
        if (str == null || str.length() == 0) {
            this.copydefault.gEmmrt.setText("");
            this.copydefault.AYXKKw.setText("");
            this.copydefault.EZpvd.setText("");
        } else {
            java.lang.String scientificCurrency$default = "*****";
            if (pnLDetailsUiModel == null) {
                android.widget.TextView textView = this.copydefault.gEmmrt;
                if (z) {
                    charSequence = "";
                } else {
                    charSequence = "";
                    scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, RoundingMode.DOWN, false, false, false, false, DisplaySign.AUTO, false, false, 444, null);
                }
                textView.setText(scientificCurrency$default);
                this.copydefault.AYXKKw.setText(charSequence);
                this.copydefault.EZpvd.setText(charSequence);
            } else if (z) {
                this.copydefault.gEmmrt.setText("*****");
                this.copydefault.AYXKKw.setText("*****");
                this.copydefault.EZpvd.setText("*****");
                android.widget.TextView textView2 = this.copydefault.EZpvd;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                textView2.setTextColor(C25382ivf.KWHzl(context, C52761wXj.Activity.QwvEab));
            } else {
                android.widget.TextView textView3 = this.copydefault.gEmmrt;
                C23272hvB c23272hvB = C23272hvB.KWHzl;
                RoundingMode roundingMode = RoundingMode.DOWN;
                textView3.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, str, true, roundingMode, false, false, false, false, DisplaySign.AUTO, false, false, 444, null));
                android.widget.TextView textView4 = this.copydefault.AYXKKw;
                java.lang.String strAkhnZx = pnLDetailsUiModel.AkhnZx();
                DisplaySign displaySign = DisplaySign.EXCEPT_ZERO;
                textView4.setText(C23272hvB.formatScientificCurrency$default(c23272hvB, strAkhnZx, true, roundingMode, false, false, false, false, displaySign, false, false, 444, null));
                android.widget.TextView textView5 = this.copydefault.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(textView5, "");
                kLY.KWHzl(textView5, pnLDetailsUiModel.AkhnZx(), java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl));
                if (pnLDetailsUiModel.isConnected().length() > 0) {
                    android.widget.TextView textView6 = this.copydefault.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(textView6, "");
                    kLY.formatPercentage$default(textView6, pnLDetailsUiModel.isConnected(), displaySign, null, null, null, 28, null);
                }
            }
        }
        ConstraintLayout root = this.copydefault.getRoot();
        root.setOnClickListener(new Application(root, 1000L, function0));
    }

    /* JADX INFO: renamed from: o.koL$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function0 function0) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.invoke();
            }
        }
    }
}
