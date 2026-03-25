package o;

import com.okinc.business.invest_biz.data.bean.InvestRedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionInfo;
import com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iyi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25544iyi {
    public static final boolean KWHzl(InvestSubscriptionInfo investSubscriptionInfo) {
        java.lang.Integer mode;
        return (investSubscriptionInfo == null || (mode = investSubscriptionInfo.getMode()) == null || mode.intValue() != 1) ? false : true;
    }

    public static final boolean OLrzqt(InvestRedeemInitialInfo investRedeemInitialInfo) {
        java.lang.Integer mode;
        return (investRedeemInitialInfo == null || (mode = investRedeemInitialInfo.getMode()) == null || mode.intValue() != 2) ? false : true;
    }

    public static final boolean EZpvd(InvestRedeemInitialInfo investRedeemInitialInfo) {
        java.lang.Integer mode;
        return (investRedeemInitialInfo == null || (mode = investRedeemInitialInfo.getMode()) == null || mode.intValue() != 3) ? false : true;
    }

    public static /* synthetic */ int getLossEntryTextViewColor$default(InvestTransactionLossInfo investTransactionLossInfo, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = C52761wXj.Activity.fdOvFl;
        }
        return copydefault(investTransactionLossInfo, i);
    }

    public static final int copydefault(@NotNull InvestTransactionLossInfo investTransactionLossInfo, int i) {
        Intrinsics.checkNotNullParameter(investTransactionLossInfo, "");
        java.lang.String lossRate = investTransactionLossInfo.getLossRate();
        if (lossRate != null && C33129mqd.AEQbTJ(lossRate, "0.03")) {
            return C52761wXj.Activity.gdmIOq;
        }
        java.lang.String lossRate2 = investTransactionLossInfo.getLossRate();
        return (lossRate2 == null || !C33129mqd.AEQbTJ(lossRate2, "0.05")) ? i : C52761wXj.Activity.DQzvGN;
    }
}
