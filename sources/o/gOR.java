package o;

import com.okinc.business.dex.trade.common.reminder.BusinessType;
import com.okinc.business.dex.trade.common.reminder.data.ReminderListConfig;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.PreCheckBean;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gOR {
    public static final gOR copydefault = new gOR();

    private gOR() {
    }

    public final ReminderListConfig copydefault(@NotNull PreCheckBean preCheckBean, @NotNull DefiChainInfo defiChainInfo, V6BaseQuoteResponse v6BaseQuoteResponse, java.lang.Throwable th, @NotNull SlippageMode slippageMode, java.lang.String str, java.lang.String str2, java.lang.String str3, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, @NotNull InterfaceC19780gPa interfaceC19780gPa, @NotNull gOT got, java.lang.Throwable th2) {
        Intrinsics.checkNotNullParameter(preCheckBean, "");
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        Intrinsics.checkNotNullParameter(interfaceC19780gPa, "");
        Intrinsics.checkNotNullParameter(got, "");
        gOL gol = gOL.EZpvd;
        return gol.KWHzl(gol.KWHzl(preCheckBean), BusinessType.SwapMarket, defiChainInfo, v6BaseQuoteResponse, th, th2, slippageMode, str, str2, str3, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, i, i2, i3, z, z2, false, z3, interfaceC19780gPa, got, false);
    }
}
