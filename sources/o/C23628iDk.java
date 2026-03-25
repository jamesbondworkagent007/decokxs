package o;

import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iDk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C23628iDk {
    public static final java.lang.String EZpvd(@NotNull TransactionConfig transactionConfig, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(str, "");
        return C33069mpW.copydefault(EZpvd(transactionConfig), C56423yEv.EZpvd(C56390yDp.OLrzqt("token", str)));
    }

    public static final int EZpvd(@NotNull TransactionConfig transactionConfig) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        if (transactionConfig.AuCTelauCTel()) {
            java.lang.Integer numFJNWhG = transactionConfig.fJNWhG();
            if (numFJNWhG != null && numFJNWhG.intValue() == 0) {
                return C25493ixk.FragmentManager.fVjYLc;
            }
            if (numFJNWhG != null && numFJNWhG.intValue() == 1) {
                return C25493ixk.FragmentManager.hNurIN;
            }
            if (numFJNWhG != null) {
                numFJNWhG.intValue();
            }
            return C25493ixk.FragmentManager.QfJbVf;
        }
        InvestOrder investOrderAhwBna = transactionConfig.AhwBna();
        return (investOrderAhwBna == null || !Intrinsics.EZpvd(investOrderAhwBna.getRedeemNeedUnbond(), java.lang.Boolean.TRUE)) ? transactionConfig.AxsJAY() ? transactionConfig.gHZMYf() ? C25493ixk.FragmentManager.DCJXGO : C25493ixk.FragmentManager.DCUTEI : transactionConfig.getFieldNames() ? C25493ixk.FragmentManager.OqFWZa : C25493ixk.FragmentManager.zuWLRA : C25493ixk.FragmentManager.gkZNMa;
    }
}
