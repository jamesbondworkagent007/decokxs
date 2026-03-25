package o;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.unify_trade.biz.LossInsuranceDisplayData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wPX extends LinearLayoutCompat {
    public final int KWHzl;
    public final uRR OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wPX(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wPX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:32) call: o.wPX.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ wPX(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wPX(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        uRR urrCopydefault = uRR.copydefault(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(urrCopydefault, "");
        this.OLrzqt = urrCopydefault;
        int iDpInt$default = C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
        this.copydefault = iDpInt$default;
        int iDpInt$default2 = C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null);
        this.KWHzl = iDpInt$default2;
        setOrientation(0);
        setGravity(16);
        setMinimumHeight(C55298xhM.dpInt$default(36, (android.content.Context) null, 1, (java.lang.Object) null));
        setPaddingRelative(iDpInt$default2, iDpInt$default, iDpInt$default2, iDpInt$default);
        setBackground(C33070mpX.KWHzl(C49511upt.TaskDescription.OLrzqt));
    }

    public final void setData(@NotNull LossInsuranceDisplayData lossInsuranceDisplayData) {
        Intrinsics.checkNotNullParameter(lossInsuranceDisplayData, "");
        setVisibility((wPW.AEQbTJ(lossInsuranceDisplayData.getStatus()) && Intrinsics.EZpvd(lossInsuranceDisplayData.getEligible(), java.lang.Boolean.TRUE)) ? 0 : 8);
        android.widget.TextView textView = this.OLrzqt.copydefault;
        xMR xmr = xMR.copydefault;
        java.lang.String amount = lossInsuranceDisplayData.getAmount();
        if (amount == null) {
            amount = "--";
        }
        textView.setText(xmr.copydefault(amount) + " USDT");
        this.OLrzqt.OLrzqt.setText(copydefault(lossInsuranceDisplayData.getStatus()));
        setOnClickListener(new StateListAnimator(this, 1000L, this, lossInsuranceDisplayData));
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [74=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r2.equals("denied") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return o.C33070mpX.AYXKKw(o.C55688xof.Application.ReturnThis);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r2.equals("not_applicable") == false) goto L29;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String copydefault(java.lang.String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1335395429:
                    break;
                case -1258492403:
                    if (str.equals("compensated")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.RequiresPermissionWrite);
                    }
                    break;
                case -1179159893:
                    if (str.equals("issued")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.setSplitBackgroundDrawable);
                    }
                    break;
                case -358554572:
                    if (str.equals("compensating")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.RestrictToScope);
                    }
                    break;
                case 3599293:
                    if (str.equals("used")) {
                        return C33070mpX.AYXKKw(C55688xof.Application.min);
                    }
                    break;
                case 531647627:
                    break;
            }
        }
        return "";
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ wPX AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ LossInsuranceDisplayData copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, wPX wpx, LossInsuranceDisplayData lossInsuranceDisplayData) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = wpx;
            this.copydefault = lossInsuranceDisplayData;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context context = this.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                AppCompatActivity appCompatActivityCopydefault = C49955uyM.copydefault(context);
                if (appCompatActivityCopydefault != null) {
                    C53877wtl.Companion.EZpvd(this.copydefault).show(appCompatActivityCopydefault.getSupportFragmentManager(), C56524yIo.AEQbTJ(C53877wtl.class).valueOf());
                }
            }
        }
    }
}
