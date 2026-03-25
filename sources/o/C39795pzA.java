package o;

import androidx.databinding.DataBindingUtil;
import com.okinc.kline.data.KlineSpotAverageBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C32392mcI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pzA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C39795pzA extends android.widget.FrameLayout {
    public AbstractC32394mcK KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C39795pzA(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:20) call: o.pzA.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C39795pzA(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39795pzA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = (AbstractC32394mcK) DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C32392mcI.StateListAnimator.KWHzl, this, true);
        setupRtlLayout();
    }

    public final void setData(@NotNull KlineSpotAverageBean klineSpotAverageBean) {
        Intrinsics.checkNotNullParameter(klineSpotAverageBean, "");
        this.KWHzl.AhwBna.setText(C33070mpX.AYXKKw(C32392mcI.Dialog.fsSxsn));
        this.KWHzl.valueOf.setText(C33070mpX.AYXKKw(C32392mcI.Dialog.fLIjIY));
        this.KWHzl.AYXKKw.setText(C33070mpX.AYXKKw(C32392mcI.Dialog.fXHmeK));
        this.KWHzl.values.setText(C33070mpX.AYXKKw(C32392mcI.Dialog.KWHzl));
        if (klineSpotAverageBean.isOpenAvgPx()) {
            this.KWHzl.djBIcL.setText(klineSpotAverageBean.getSpotUpl() + " " + klineSpotAverageBean.getQuoteUnit());
            this.KWHzl.AkhnZx.setText(klineSpotAverageBean.getSpotUplRatio());
            this.KWHzl.KWHzl.setText(klineSpotAverageBean.getFormatOpenAvgPx());
        } else {
            this.KWHzl.KWHzl.setText(klineSpotAverageBean.getFormatAccAvgPx());
            this.KWHzl.djBIcL.setText(klineSpotAverageBean.getTotalPnl() + " " + klineSpotAverageBean.getQuoteUnit());
            this.KWHzl.AkhnZx.setText(klineSpotAverageBean.getTotalPnlRatio());
        }
        this.KWHzl.gEmmrt.setText(klineSpotAverageBean.getSpotBal() + " " + klineSpotAverageBean.ccy);
        this.KWHzl.djBIcL.setTextColor(StringsKt__StringsKt.contains$default((java.lang.CharSequence) klineSpotAverageBean.getTotalPnl(), (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null) ? C36246oUr.copydefault().giSNqX() : C36246oUr.copydefault().iZzfmt());
        this.KWHzl.AkhnZx.setTextColor(StringsKt__StringsKt.contains$default((java.lang.CharSequence) klineSpotAverageBean.getTotalPnlRatio(), (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null) ? C36246oUr.copydefault().giSNqX() : C36246oUr.copydefault().iZzfmt());
    }

    public final void setupRtlLayout() {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        if (C55296xhK.OLrzqt(context)) {
            this.KWHzl.AEQbTJ.setLayoutDirection(1);
            this.KWHzl.EZpvd.setLayoutDirection(1);
            this.KWHzl.OLrzqt.setLayoutDirection(1);
            this.KWHzl.copydefault.setLayoutDirection(1);
        }
    }
}
