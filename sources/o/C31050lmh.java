package o;

import com.okinc.business.dex.tee.common.viewmodel.TradeAutoSellViewModel;
import com.okinc.business.dex.trade.common.reminder.SaUiReminder;
import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC30510lcX;
import o.gLQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lmh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31050lmh implements gOT {
    public final TradeAutoSellViewModel AEQbTJ;
    public final C19700gMb EZpvd;

    @Override // o.gOT
    public TradeReminderType OLrzqt(gLQ glq) {
        return null;
    }

    public C31050lmh(@NotNull TradeAutoSellViewModel tradeAutoSellViewModel, @NotNull C19700gMb c19700gMb) {
        Intrinsics.checkNotNullParameter(tradeAutoSellViewModel, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        this.AEQbTJ = tradeAutoSellViewModel;
        this.EZpvd = c19700gMb;
    }

    @Override // o.gOT
    public gLQ KWHzl(java.lang.String str) {
        if (this.AEQbTJ.EZpvd().getValue() instanceof AbstractC30510lcX.StateListAnimator) {
            AbstractC30510lcX value = this.AEQbTJ.EZpvd().getValue();
            Intrinsics.copydefault(value, "");
            return ((AbstractC30510lcX.StateListAnimator) value).copydefault();
        }
        return gLQ.TaskDescription.copydefault;
    }

    @Override // o.gOT
    public TradeReminderType EZpvd(gLQ glq) {
        if (this.AEQbTJ.EZpvd().getValue() instanceof AbstractC30510lcX.StateListAnimator) {
            AbstractC30510lcX value = this.AEQbTJ.EZpvd().getValue();
            Intrinsics.copydefault(value, "");
            if (((AbstractC30510lcX.StateListAnimator) value).copydefault() instanceof gLQ.Application) {
                return TradeReminderType.SAExpiringSoon;
            }
        }
        return null;
    }

    @Override // o.gOT
    public TradeReminderType AEQbTJ(gLQ glq, java.lang.String str) {
        if (!(this.AEQbTJ.EZpvd().getValue() instanceof AbstractC30510lcX.StateListAnimator)) {
            return null;
        }
        if ((glq != null ? glq.EZpvd(C32979mnm.EZpvd.OLrzqt()) : null) == null || glq.AEQbTJ()) {
            return null;
        }
        return TradeReminderType.SAException;
    }

    @Override // o.gOT
    public SaUiReminder EZpvd(@NotNull TradeReminderType tradeReminderType, gLQ glq) {
        Intrinsics.checkNotNullParameter(tradeReminderType, "");
        if ((tradeReminderType != TradeReminderType.SAException && tradeReminderType != TradeReminderType.SAExpiringSoon) || glq == null) {
            return null;
        }
        C32979mnm c32979mnm = C32979mnm.EZpvd;
        java.lang.String strEZpvd = glq.EZpvd(c32979mnm.OLrzqt());
        gLQ.Fragment fragmentKWHzl = glq.KWHzl();
        return new SaUiReminder(null, strEZpvd, fragmentKWHzl != null ? fragmentKWHzl.AEQbTJ(c32979mnm.OLrzqt()) : null);
    }

    @Override // o.gOT
    public long OLrzqt() {
        return this.EZpvd.EZpvd();
    }

    @Override // o.gOT
    public boolean KWHzl() {
        try {
            return this.EZpvd.gEmmrt();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
