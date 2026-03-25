package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import com.okinc.tradingbot.impl.market_place.bot_copy.itembinder.BotWinLossRateData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vkL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51293vkL extends ConstraintLayout {
    public AbstractC48570uWh AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51293vkL(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C51293vkL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:16) call: o.vkL.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C51293vkL(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51293vkL(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AEQbTJ();
    }

    private final void AEQbTJ() {
        setBackground(C33070mpX.KWHzl(C52761wXj.TaskDescription.fFgQHt));
        setPaddingRelative(C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(20, (android.content.Context) null, 1, (java.lang.Object) null));
        AbstractC48570uWh abstractC48570uWh = (AbstractC48570uWh) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.OijiEz, this, true);
        this.AEQbTJ = abstractC48570uWh;
        if (abstractC48570uWh == null) {
            Intrinsics.gEmmrt("");
            abstractC48570uWh = null;
        }
        abstractC48570uWh.values.setTextColor(C33512mxp.getRiseUpColor$default(C33512mxp.AEQbTJ, 0.0f, 1, null));
    }

    public final void OLrzqt(@NotNull BotWinLossRateData botWinLossRateData) {
        Intrinsics.checkNotNullParameter(botWinLossRateData, "");
        AbstractC48570uWh abstractC48570uWh = this.AEQbTJ;
        AbstractC48570uWh abstractC48570uWh2 = null;
        if (abstractC48570uWh == null) {
            Intrinsics.gEmmrt("");
            abstractC48570uWh = null;
        }
        abstractC48570uWh.DbNXlk.setText(botWinLossRateData.KWHzl());
        AbstractC48570uWh abstractC48570uWh3 = this.AEQbTJ;
        if (abstractC48570uWh3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48570uWh3 = null;
        }
        abstractC48570uWh3.AhwBna.setText(botWinLossRateData.OLrzqt());
        AbstractC48570uWh abstractC48570uWh4 = this.AEQbTJ;
        if (abstractC48570uWh4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48570uWh4 = null;
        }
        abstractC48570uWh4.values.setText(botWinLossRateData.AEQbTJ());
        AbstractC48570uWh abstractC48570uWh5 = this.AEQbTJ;
        if (abstractC48570uWh5 == null) {
            Intrinsics.gEmmrt("");
            abstractC48570uWh5 = null;
        }
        abstractC48570uWh5.EZpvd.setText(botWinLossRateData.EZpvd());
        AbstractC48570uWh abstractC48570uWh6 = this.AEQbTJ;
        if (abstractC48570uWh6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48570uWh2 = abstractC48570uWh6;
        }
        abstractC48570uWh2.valueOf.setProfitRatio(botWinLossRateData.copydefault());
    }
}
