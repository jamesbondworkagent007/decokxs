package o;

import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import com.okinc.business.invest_biz.data.models.RedeemDetailsAndGasFee;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.DetailItemType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iCO extends iCU {
    @Override // o.iCU
    public iXC AEQbTJ(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, iXB ixb) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(redeemInitialInfo, "");
        return super.AEQbTJ(transactionConfig, redeemInitialInfo, ixb);
    }

    @Override // o.iCU
    public iXC KWHzl(@NotNull TransactionConfig transactionConfig, @NotNull InitialInfoModel.RedeemInitialInfo redeemInitialInfo, @NotNull iXB ixb, @NotNull RedeemDetailsAndGasFee redeemDetailsAndGasFee) {
        Intrinsics.checkNotNullParameter(transactionConfig, "");
        Intrinsics.checkNotNullParameter(redeemInitialInfo, "");
        Intrinsics.checkNotNullParameter(ixb, "");
        Intrinsics.checkNotNullParameter(redeemDetailsAndGasFee, "");
        return super.KWHzl(transactionConfig, redeemInitialInfo, ixb, redeemDetailsAndGasFee);
    }

    @Override // o.iCU, o.iCX
    public java.util.Set<DetailItemType> KWHzl(TransactionConfig transactionConfig) {
        InvestOrder investOrderAhwBna;
        if (transactionConfig != null && (investOrderAhwBna = transactionConfig.AhwBna()) != null && Intrinsics.EZpvd(investOrderAhwBna.getRedeemNeedUnbond(), java.lang.Boolean.TRUE)) {
            return yEE.AhwBna(DetailItemType.EST_UNBOND_TIME, DetailItemType.TRANSACTION_PATH, DetailItemType.NETWORK_SLIPPAGE);
        }
        return yEE.AhwBna(DetailItemType.TRANSACTION_PATH, DetailItemType.NETWORK_SLIPPAGE, DetailItemType.NETWORK_FEE);
    }
}
