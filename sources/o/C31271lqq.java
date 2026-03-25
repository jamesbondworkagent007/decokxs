package o;

import com.okinc.business.web3pay.lib.core.model.ConvertOrderType;
import com.okinc.business.web3pay.lib.core.network.ws.ConvertInfoWS;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31271lqq {
    public static final C31336lsB KWHzl(@NotNull ConvertInfoWS convertInfoWS) {
        Intrinsics.checkNotNullParameter(convertInfoWS, "");
        return new C31336lsB(convertInfoWS.getTokenSymbol(), convertInfoWS.getTokenAmount(), convertInfoWS.getTokenDecimal(), ConvertOrderType.Companion.copydefault(convertInfoWS.getConvertOrderType()), convertInfoWS.getTokenCoinTypeNo(), convertInfoWS.getCurrencyAmount());
    }
}
