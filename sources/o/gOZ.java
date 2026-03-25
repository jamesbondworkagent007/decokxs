package o;

import com.okinc.business.dex.trade.common.reminder.SaUiReminder;
import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.gLQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gOZ implements gOT {
    public final DefiChainInfo AEQbTJ;
    public final C19703gMe EZpvd;
    public final MutableStateFlow<gLQ> KWHzl;
    public final C19700gMb copydefault;

    public gOZ(@NotNull C19703gMe c19703gMe, @NotNull DefiChainInfo defiChainInfo, @NotNull MutableStateFlow<gLQ> mutableStateFlow, @NotNull C19700gMb c19700gMb) {
        Intrinsics.checkNotNullParameter(c19703gMe, "");
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
        Intrinsics.checkNotNullParameter(mutableStateFlow, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        this.EZpvd = c19703gMe;
        this.AEQbTJ = defiChainInfo;
        this.KWHzl = mutableStateFlow;
        this.copydefault = c19700gMb;
    }

    @Override // o.gOT
    public gLQ KWHzl(java.lang.String str) {
        if (str == null) {
            return gLQ.TaskDescription.copydefault;
        }
        gLQ glqAEQbTJ = this.EZpvd.AEQbTJ(str, this.AEQbTJ.getSupportLimitSwap(), true);
        if (glqAEQbTJ == null) {
            glqAEQbTJ = gLQ.TaskDescription.copydefault;
        }
        this.KWHzl.tryEmit(glqAEQbTJ);
        return glqAEQbTJ;
    }

    @Override // o.gOT
    public TradeReminderType EZpvd(gLQ glq) {
        if (glq instanceof gLQ.Application) {
            return TradeReminderType.SAExpiringSoon;
        }
        return null;
    }

    @Override // o.gOT
    public TradeReminderType AEQbTJ(gLQ glq, java.lang.String str) {
        if (glq instanceof gLQ.PendingIntent) {
            return TradeReminderType.SANeedUpgrade;
        }
        if ((glq != null ? glq.EZpvd(C32979mnm.EZpvd.OLrzqt()) : null) == null || glq.AEQbTJ()) {
            return null;
        }
        return TradeReminderType.SAException;
    }

    @Override // o.gOT
    public SaUiReminder EZpvd(@NotNull TradeReminderType tradeReminderType, gLQ glq) {
        Intrinsics.checkNotNullParameter(tradeReminderType, "");
        if (tradeReminderType == TradeReminderType.SAOrderLimitExceeded || glq == null) {
            return null;
        }
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        java.lang.String strEZpvd = glq.EZpvd(c32979mnm.OLrzqt());
        gLQ.Fragment fragmentKWHzl = glq.KWHzl();
        return new SaUiReminder(null, strEZpvd, fragmentKWHzl != null ? fragmentKWHzl.AEQbTJ(c32979mnm.OLrzqt()) : null);
    }

    @Override // o.gOT
    public TradeReminderType OLrzqt(gLQ glq) {
        if (glq instanceof gLQ.LoaderManager) {
            return TradeReminderType.SALimitUnsupportChain;
        }
        return null;
    }

    @Override // o.gOT
    public long OLrzqt() {
        try {
            return this.copydefault.EZpvd();
        } catch (java.lang.Exception unused) {
            return Long.MAX_VALUE;
        }
    }

    @Override // o.gOT
    public boolean KWHzl() {
        try {
            return this.copydefault.gEmmrt();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
