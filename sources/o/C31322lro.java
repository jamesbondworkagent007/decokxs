package o;

import com.okinc.business.web3pay.lib.core.model.GasPayType;
import com.okinc.business.web3pay.lib.core.model.PaymasterNameType;
import com.okinc.business.web3pay.lib.features.gas.model.ConvertFeeInfo;
import com.okinc.business.web3pay.lib.features.gas.model.GetConvertGasResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lro, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31322lro {
    public static final ConvertFeeInfo AEQbTJ(@NotNull GetConvertGasResponse getConvertGasResponse) {
        Intrinsics.checkNotNullParameter(getConvertGasResponse, "");
        ConvertFeeInfo.Gas gas = new ConvertFeeInfo.Gas(GasPayType.Companion.copydefault(getConvertGasResponse.getGasPayType()), getConvertGasResponse.getFeeTokenAddress(), getConvertGasResponse.getFeeTokenSymbol(), getConvertGasResponse.getFeeTokenDecimal(), getConvertGasResponse.getFeeTokenCoinTypeNo(), getConvertGasResponse.getNativeTokenCoinTypeNo(), getConvertGasResponse.getNativeTokenDecimal(), PaymasterNameType.Companion.OLrzqt(getConvertGasResponse.getPaymasterName()), C31269lqo.OLrzqt.copydefault(getConvertGasResponse.getTransactionOperations()), getConvertGasResponse.getFeeTokenBalance(), getConvertGasResponse.getGasLimit(), getConvertGasResponse.getGasPrice());
        GetConvertGasResponse.TransactionFee transactionFee = getConvertGasResponse.getTransactionFee();
        return new ConvertFeeInfo(gas, transactionFee != null ? new ConvertFeeInfo.TransactionFee(transactionFee.getFeeTokenCoinTypeNo(), transactionFee.getFeeTokenSymbol(), transactionFee.getFeeTokenAmount(), transactionFee.getFeeTokenDecimal()) : null);
    }
}
