package o;

import com.okinc.business.web3pay.lib.core.model.GasPayType;
import com.okinc.business.web3pay.lib.features.gas.model.UpdateAccountGasInfoApiModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lrt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31327lrt {
    public static final C31325lrr AEQbTJ(@NotNull UpdateAccountGasInfoApiModel updateAccountGasInfoApiModel) {
        Intrinsics.checkNotNullParameter(updateAccountGasInfoApiModel, "");
        return new C31325lrr(GasPayType.Companion.copydefault(updateAccountGasInfoApiModel.getGasPayType()), updateAccountGasInfoApiModel.getFeeTokenAddress(), updateAccountGasInfoApiModel.getFeeTokenSymbol(), updateAccountGasInfoApiModel.getPaymasterName(), updateAccountGasInfoApiModel.getFeeTokenCoinTypeNo(), updateAccountGasInfoApiModel.getFeeTokenDecimal(), updateAccountGasInfoApiModel.getNativeTokenCoinTypeNo(), updateAccountGasInfoApiModel.getNativeTokenDecimal(), updateAccountGasInfoApiModel.getGasLimit(), updateAccountGasInfoApiModel.getGasPrice());
    }
}
