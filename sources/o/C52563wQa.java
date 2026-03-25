package o;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.LossInsuranceDisplayData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wQa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52563wQa extends LinearLayoutCompat {
    public final uRU AEQbTJ;
    public final int KWHzl;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52563wQa(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52563wQa(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:27) call: o.wQa.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52563wQa(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52563wQa(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        uRU uruKWHzl = uRU.KWHzl(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(uruKWHzl, "");
        this.AEQbTJ = uruKWHzl;
        int iDpInt$default = C55298xhM.dpInt$default(2, (android.content.Context) null, 1, (java.lang.Object) null);
        this.KWHzl = iDpInt$default;
        int iDpInt$default2 = C55298xhM.dpInt$default(4, (android.content.Context) null, 1, (java.lang.Object) null);
        this.copydefault = iDpInt$default2;
        setOrientation(0);
        setGravity(16);
        setPaddingRelative(iDpInt$default2, iDpInt$default, iDpInt$default2, iDpInt$default);
        setBackground(C33070mpX.KWHzl(C32113mPz.TaskDescription.AEQbTJ));
        setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.dpErvT)));
    }

    public final void setData(@NotNull LossInsuranceDisplayData lossInsuranceDisplayData) {
        Intrinsics.checkNotNullParameter(lossInsuranceDisplayData, "");
        setVisibility((wPW.AEQbTJ(lossInsuranceDisplayData.getStatus()) && Intrinsics.EZpvd(lossInsuranceDisplayData.getEligible(), java.lang.Boolean.TRUE)) ? 0 : 8);
        android.widget.TextView textView = this.AEQbTJ.OLrzqt;
        int i = C55688xof.Application.StyleRes;
        xMR xmr = xMR.copydefault;
        java.lang.String amount = lossInsuranceDisplayData.getAmount();
        if (amount == null) {
            amount = "--";
        }
        textView.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, xmr.copydefault(amount)))));
        setOnClickListener(new Activity(this, 1000L, lossInsuranceDisplayData, this));
    }

    /* JADX INFO: renamed from: o.wQa$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ LossInsuranceDisplayData KWHzl;
        public final /* synthetic */ C52563wQa OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, LossInsuranceDisplayData lossInsuranceDisplayData, C52563wQa c52563wQa) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = lossInsuranceDisplayData;
            this.OLrzqt = c52563wQa;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (this.KWHzl.isShowExplainDialog()) {
                    android.content.Context context = this.OLrzqt.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    AppCompatActivity appCompatActivityCopydefault = C49955uyM.copydefault(context);
                    if (appCompatActivityCopydefault != null) {
                        C53877wtl.Companion.EZpvd(this.KWHzl).show(appCompatActivityCopydefault.getSupportFragmentManager(), C56524yIo.AEQbTJ(C53877wtl.class).valueOf());
                    }
                }
            }
        }
    }
}
