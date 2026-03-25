package o;

import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.ThirdSignalDetail;
import com.okinc.unify_trade.bot.util.signalBot.SignalBotAdvancedData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xuG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55981xuG {
    public SignalBotReq copydefault = new SignalBotReq((java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, false, (ThirdSignalDetail) null, false, (java.util.ArrayList) null, (java.lang.String) null, (AutoVipProfitInfo) null, 32767, (DefaultConstructorMarker) null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull SignalBotReq signalBotReq) {
        Intrinsics.checkNotNullParameter(signalBotReq, "");
        this.copydefault = signalBotReq;
    }

    public final SignalBotAdvancedData copydefault() {
        java.lang.String subOrdType = this.copydefault.getSubOrdType();
        if (subOrdType == null) {
            subOrdType = "";
        }
        return new SignalBotAdvancedData(subOrdType, this.copydefault.getRatio(), this.copydefault.getSignalOrderAmtParam(), this.copydefault.getSignalBotOrderStopParam(), this.copydefault.getAllowMultipleEntry());
    }
}
