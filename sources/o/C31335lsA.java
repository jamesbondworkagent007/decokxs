package o;

import com.okinc.business.web3pay.lib.core.model.ConvertOrderType;
import com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.ConvertInfoApiModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lsA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31335lsA {
    public static final C31336lsB OLrzqt(@NotNull ConvertInfoApiModel convertInfoApiModel) {
        Intrinsics.checkNotNullParameter(convertInfoApiModel, "");
        return new C31336lsB(convertInfoApiModel.getTokenSymbol(), convertInfoApiModel.getTokenAmount(), convertInfoApiModel.getTokenDecimal(), ConvertOrderType.Companion.copydefault(convertInfoApiModel.getConvertOrderType()), convertInfoApiModel.getTokenCoinTypeNo(), convertInfoApiModel.getCurrencyAmount());
    }
}
