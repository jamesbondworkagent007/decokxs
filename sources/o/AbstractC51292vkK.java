package o;

import com.okinc.tradingbot.impl.market_place.bot_copy.bean.CopyBotReqParam;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingQueryConfig;
import com.okinc.unify_trade.biz.BotLeverConfig;
import com.okinc.unify_trade.biz.LiquidatePriceResponse;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vkK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC51292vkK extends android.widget.LinearLayout {
    public abstract boolean AEQbTJ();

    public boolean AYXKKw() {
        return true;
    }

    public abstract CopyBotReqParam EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull LiquidatePriceResponse liquidatePriceResponse) {
        Intrinsics.checkNotNullParameter(liquidatePriceResponse, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    public abstract void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3);

    public abstract void EZpvd(boolean z, @NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return "";
    }

    public void KWHzl(AutoEarnStakingQueryConfig autoEarnStakingQueryConfig) {
    }

    public void KWHzl(java.lang.String str, java.lang.String str2) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String OLrzqt() {
        return "";
    }

    public void OLrzqt(StrategyConfigInfo strategyConfigInfo) {
    }

    public void OLrzqt(java.lang.String str, java.lang.String str2) {
    }

    public void copydefault() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull BotLeverConfig botLeverConfig, @NotNull java.lang.String str4, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(botLeverConfig, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(function1, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setActualPlusMarginAmtAvaValue(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    public abstract void setAmtChangeListener(@NotNull Function1<? super java.lang.String, Unit> function1);

    public abstract void setBalance(@NotNull java.lang.String str);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setBalanceTitle(@NotNull java.lang.String str, boolean z, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    public void setBotLossInsuranceTag(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setExtraAmtChangeListener(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
    }

    public abstract void setMinInvest(@NotNull java.lang.String str);

    public void setOnCheckedChangeListener(Function2<? super android.widget.CompoundButton, ? super java.lang.Boolean, Unit> function2) {
    }

    public abstract void setQuoteContent(@NotNull java.lang.String str);

    public abstract void setQuotePercentListener(@NotNull Function1<? super java.lang.String, Unit> function1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setTotalInvest(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC51292vkK(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC51292vkK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC51292vkK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.vkK */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setBalanceTitle$default(AbstractC51292vkK abstractC51292vkK, java.lang.String str, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBalanceTitle");
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        abstractC51292vkK.setBalanceTitle(str, z, function0);
    }

    public static /* synthetic */ void refreshValidView$default(AbstractC51292vkK abstractC51292vkK, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshValidView");
        }
        if ((i & 2) != 0) {
            str = "";
        }
        abstractC51292vkK.EZpvd(z, str);
    }
}
