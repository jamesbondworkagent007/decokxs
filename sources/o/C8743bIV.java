package o;

import com.okinc.business.defi.biz.net.bean.CeDefiEvmGasLimit;
import com.okinc.business.defi.biz.net.bean.CeDefiEvmGasPrice;
import com.okinc.business.defi.biz.net.bean.CeDefiGasResp;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bIV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8743bIV extends AbstractC8744bIW {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8743bIV(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull C8742bIU c8742bIU) {
        super(abstractC8564bFB, c8742bIU);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(c8742bIU, "");
    }

    @Override // o.AbstractC8426bCW
    public java.lang.String AEQbTJ() {
        if (!fJNWhG()) {
            CeDefiGasResp ceDefiGasRespAEQbTJ = fetchVPNInfo().AEQbTJ();
            if (ceDefiGasRespAEQbTJ.getGasLimit() != null && ceDefiGasRespAEQbTJ.getGasPrice() != null) {
                CeDefiEvmGasLimit gasLimit = ceDefiGasRespAEQbTJ.getGasLimit();
                BigDecimal bigDecimalKWHzl = C54862xYb.KWHzl(C54862xYb.KWHzl(C54862xYb.KWHzl(C54862xYb.KWHzl(gasLimit.getCallGasLimit(), gasLimit.getVerificationGasLimit()), gasLimit.getPreVerificationGas()), gasLimit.getPaymasterVerificationGasLimit()), gasLimit.getPaymasterPostOpGasLimit());
                CeDefiEvmGasPrice gasPrice = ceDefiGasRespAEQbTJ.getGasPrice();
                BigDecimal bigDecimalOLrzqt = C54862xYb.OLrzqt(gasLimit.getL1GasLimit(), gasPrice.getL1GasPrice());
                java.lang.String strAddS$default = C33129mqd.addS$default(gasPrice.getBaseFee(), gasPrice.getMaxPriorityFeePerGas(), null, null, null, 14, null);
                RoundingMode roundingMode = RoundingMode.UP;
                java.lang.String strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.OLrzqt(C54862xYb.KWHzl(bigDecimalKWHzl, C54862xYb.KWHzl(bigDecimalOLrzqt, strAddS$default, 0, roundingMode)), ceDefiGasRespAEQbTJ.getGasPrice().getMaxFeePerGas()), false, null, null, 7, null);
                return Intrinsics.EZpvd((java.lang.Object) ceDefiGasRespAEQbTJ.getFeeTokenCoinTypeNo(), (java.lang.Object) ceDefiGasRespAEQbTJ.getNativeTokenCoinTypeNo()) ? strConvertToString$default : C54862xYb.convertToString$default(C54862xYb.KWHzl((java.lang.Object) C54868xYh.EZpvd(C54862xYb.convertToString$default(C54862xYb.divB$default(C54862xYb.OLrzqt(C54868xYh.KWHzl(strConvertToString$default, ceDefiGasRespAEQbTJ.getNativeTokenDecimal()), ceDefiGasRespAEQbTJ.getNativeTokenPrice()), ceDefiGasRespAEQbTJ.getFeeTokenPrice(), 0, null, 6, null), false, null, null, 7, null), ceDefiGasRespAEQbTJ.getFeeTokenDecimal()), (java.lang.Object) 1, 0, roundingMode), false, null, null, 7, null);
            }
        }
        return "0";
    }
}
