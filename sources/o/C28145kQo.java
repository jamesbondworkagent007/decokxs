package o;

import com.okinc.business.dex.tee.domain.model.NumLimitData;
import com.okinc.business.dex.trade.common.reminder.SaUiReminder;
import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.gLQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kQo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28145kQo implements gOT {
    public final C28165kRh AEQbTJ;
    public final C19703gMe EZpvd;
    public final C19700gMb KWHzl;
    public final C28139kQi OLrzqt;

    /* JADX INFO: renamed from: o.kQo$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AdvancedOrderType.values().length];
            try {
                iArr[AdvancedOrderType.MARKET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AdvancedOrderType.LIMIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX INFO: renamed from: o.kQo$StateListAnimator */
    public interface StateListAnimator {
        C28145kQo EZpvd(@NotNull C28139kQi c28139kQi);
    }

    public C28145kQo(@NotNull C19700gMb c19700gMb, @NotNull C28165kRh c28165kRh, @NotNull C19703gMe c19703gMe, @NotNull C28139kQi c28139kQi) {
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(c28165kRh, "");
        Intrinsics.checkNotNullParameter(c19703gMe, "");
        Intrinsics.checkNotNullParameter(c28139kQi, "");
        this.KWHzl = c19700gMb;
        this.AEQbTJ = c28165kRh;
        this.EZpvd = c19703gMe;
        this.OLrzqt = c28139kQi;
    }

    @Override // o.gOT
    public gLQ KWHzl(java.lang.String str) {
        boolean zCopydefault;
        if (str == null) {
            return null;
        }
        int i = Application.AEQbTJ[this.OLrzqt.DbNXlk().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            zCopydefault = this.AEQbTJ.AEQbTJ(str);
        } else if (C28140kQj.copydefault(this.OLrzqt) > 0) {
            zCopydefault = this.AEQbTJ.OLrzqt(str);
        } else {
            zCopydefault = this.AEQbTJ.copydefault(str);
        }
        return this.EZpvd.AEQbTJ(str, zCopydefault, this.OLrzqt.DbNXlk() == AdvancedOrderType.LIMIT);
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
        if (tradeReminderType == TradeReminderType.SAOrderLimitExceeded) {
            android.app.Application applicationOLrzqt = C32979mnm.EZpvd.OLrzqt();
            int i = C23274hvD.Fragment.onVolumeChanged;
            NumLimitData numLimitDataAhwBna = this.OLrzqt.AhwBna();
            return new SaUiReminder(null, C33069mpW.KWHzl(applicationOLrzqt, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("numLimit", java.lang.String.valueOf(numLimitDataAhwBna != null ? numLimitDataAhwBna.getNumLimit() : 0)))), null, 5, null);
        }
        if (glq == null) {
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
            return this.KWHzl.EZpvd();
        } catch (java.lang.Exception unused) {
            return Long.MAX_VALUE;
        }
    }

    @Override // o.gOT
    public boolean KWHzl() {
        try {
            return this.KWHzl.gEmmrt();
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
