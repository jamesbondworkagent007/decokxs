package o;

import com.okinc.business.web3pay.lib.core.model.GasPayType;
import com.okinc.business.web3pay.lib.core.model.PaymasterNameType;
import com.okinc.business.web3pay.lib.features.gas.model.OnChainGasInfo;
import com.okinc.business.web3pay.lib.features.gas.model.OnChainGasResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lrm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31320lrm {
    public static final OnChainGasInfo AEQbTJ(@NotNull OnChainGasResponse onChainGasResponse) {
        Intrinsics.checkNotNullParameter(onChainGasResponse, "");
        GasPayType gasPayTypeCopydefault = GasPayType.Companion.copydefault(onChainGasResponse.getGasPayType());
        if (gasPayTypeCopydefault == null) {
            gasPayTypeCopydefault = GasPayType.NOT_FREE;
        }
        GasPayType gasPayType = gasPayTypeCopydefault;
        java.lang.String feeTokenAddress = onChainGasResponse.getFeeTokenAddress();
        java.lang.String feeTokenSymbol = onChainGasResponse.getFeeTokenSymbol();
        int feeTokenDecimal = onChainGasResponse.getFeeTokenDecimal();
        java.lang.String minDeposit = onChainGasResponse.getMinDeposit();
        if (minDeposit == null || minDeposit.length() == 0) {
            minDeposit = "0";
        }
        java.lang.String str = minDeposit;
        java.lang.String feeTokenCoinTypeNo = onChainGasResponse.getFeeTokenCoinTypeNo();
        java.lang.String nativeTokenCoinTypeNo = onChainGasResponse.getNativeTokenCoinTypeNo();
        int transactionOperations = onChainGasResponse.getTransactionOperations();
        int nativeTokenDecimal = onChainGasResponse.getNativeTokenDecimal();
        C31269lqo c31269lqo = C31269lqo.OLrzqt;
        return new OnChainGasInfo(gasPayType, feeTokenAddress, feeTokenSymbol, feeTokenDecimal, feeTokenCoinTypeNo, str, nativeTokenCoinTypeNo, nativeTokenDecimal, transactionOperations, c31269lqo.copydefault(onChainGasResponse.getTransactionOperations()) || c31269lqo.EZpvd(onChainGasResponse.getTransactionOperations()) || c31269lqo.KWHzl(onChainGasResponse.getTransactionOperations()), c31269lqo.copydefault(onChainGasResponse.getTransactionOperations()), onChainGasResponse.getTransactionOperations() != 0, PaymasterNameType.Companion.OLrzqt(onChainGasResponse.getPaymasterName()), onChainGasResponse.getGasLimit(), onChainGasResponse.getGasPrice());
    }
}
