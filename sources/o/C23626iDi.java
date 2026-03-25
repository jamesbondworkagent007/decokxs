package o;

import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.InterfaceC9737bbI;
import o.InterfaceC9857bdW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iDi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23626iDi {
    public static final kotlin.Pair<java.lang.String, java.lang.Boolean> copydefault(@NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull InterfaceC23916iOb interfaceC23916iOb) {
        InterfaceC9731bbC tokenWithContractAddressAndChainId$default;
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        if (investTokenWithAmount.isBaseToken()) {
            tokenWithContractAddressAndChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(interfaceC23916iOb.copydefault(), investTokenWithAmount.getChainId(), false, 2, null);
        } else {
            tokenWithContractAddressAndChainId$default = InterfaceC9737bbI.Application.getTokenWithContractAddressAndChainId$default(interfaceC23916iOb.copydefault(), investTokenWithAmount.getTokenAddress(), investTokenWithAmount.getChainId(), false, 4, null);
        }
        if (tokenWithContractAddressAndChainId$default == null) {
            java.lang.String coinAmount = investTokenWithAmount.getCoinAmount();
            if (coinAmount == null || coinAmount.length() == 0) {
                coinAmount = "0";
            }
            return new kotlin.Pair<>(coinAmount, java.lang.Boolean.TRUE);
        }
        return new kotlin.Pair<>(InterfaceC9857bdW.TaskDescription.localizeCryptoAmount$default(interfaceC23916iOb, new BigDecimal(investTokenWithAmount.getCoinAmount()), 0, tokenWithContractAddressAndChainId$default.AkhnZx(), null, null, null, null, false, 250, null), java.lang.Boolean.FALSE);
    }

    public static final java.lang.String EZpvd(@NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull InterfaceC23916iOb interfaceC23916iOb) {
        InterfaceC9731bbC tokenWithContractAddressAndChainId$default;
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        if (investTokenWithAmount.isBaseToken()) {
            tokenWithContractAddressAndChainId$default = InterfaceC9737bbI.Application.getChainMetaWithRealChainId$default(interfaceC23916iOb.copydefault(), investTokenWithAmount.getChainId(), false, 2, null);
        } else {
            tokenWithContractAddressAndChainId$default = InterfaceC9737bbI.Application.getTokenWithContractAddressAndChainId$default(interfaceC23916iOb.copydefault(), investTokenWithAmount.getTokenAddress(), investTokenWithAmount.getChainId(), false, 4, null);
        }
        if (tokenWithContractAddressAndChainId$default == null) {
            C27492jwH c27492jwH = C27492jwH.OLrzqt;
            java.lang.String coinAmount = investTokenWithAmount.getCoinAmount();
            if (coinAmount == null || coinAmount.length() == 0) {
                coinAmount = "0";
            }
            return StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) C27492jwH.limitFmtNoZeroWithKMBMoreThanMillion$default(c27492jwH, coinAmount, 6, 2, false, false, 24, null)).toString();
        }
        return StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) InterfaceC9857bdW.TaskDescription.localizeCryptoAmount$default(interfaceC23916iOb, C33129mqd.copydefault(StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) investTokenWithAmount.getCoinAmount()).toString()), 0, tokenWithContractAddressAndChainId$default.AkhnZx(), null, null, null, null, false, 250, null)).toString();
    }
}
