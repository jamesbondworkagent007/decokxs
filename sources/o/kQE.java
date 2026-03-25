package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.LiquidityListItem;
import com.okinc.business.dexlogic.bean.SaveIntentOrderData;
import com.okinc.business.dexlogic.bean.intent.SaveIntentData;
import com.okinc.business.trade.features.home.advanced.repository.AdvancedPlaceOrderRepositoryImpl$fetchPricingTokens$2;
import com.okinc.business.trade.features.home.advanced.repository.AdvancedPlaceOrderRepositoryImpl$getTokenInfo$2;
import com.okinc.business.trade.features.home.advanced.repository.AdvancedPlaceOrderRepositoryImpl$validateMarketTokens$2;
import com.okinc.business.trade.features.home.ui.cefi.data.PricingTokensRequest;
import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensRequest;
import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensResponse;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kQE implements kQA {
    public final InterfaceC23234huQ KWHzl;

    @yCM
    public kQE(@NotNull InterfaceC23234huQ interfaceC23234huQ) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        this.KWHzl = interfaceC23234huQ;
    }

    @Override // o.kQA
    public java.lang.Object copydefault(@NotNull PricingTokensRequest pricingTokensRequest, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DexMultiTokenInfoBean>, OKServerException>> continuation) {
        return kAB.EZpvd(new AdvancedPlaceOrderRepositoryImpl$fetchPricingTokens$2(this, pricingTokensRequest, null), continuation);
    }

    @Override // o.kQA
    public java.lang.Object AEQbTJ(@NotNull ValidateTokensRequest validateTokensRequest, @NotNull Continuation<? super AbstractC43419rot<ValidateTokensResponse, OKServerException>> continuation) {
        return kAB.EZpvd(new AdvancedPlaceOrderRepositoryImpl$validateMarketTokens$2(this, validateTokensRequest, null), continuation);
    }

    @Override // o.kQA
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull Continuation<? super AbstractC43419rot<DexMultiTokenInfoBean, OKServerException>> continuation) {
        return kAB.EZpvd(new AdvancedPlaceOrderRepositoryImpl$getTokenInfo$2(this, str, str2, str3, str4, str5, null), continuation);
    }

    @Override // o.kQA
    public AbstractC58185ywX<ResponseData<java.util.List<LiquidityListItem>>> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33024moe.KWHzl((AbstractC58185ywX) this.KWHzl.AEQbTJ(str));
    }

    @Override // o.kQA
    public AbstractC58185ywX<ResponseData<SaveIntentData>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C33024moe.KWHzl((AbstractC58185ywX) this.KWHzl.copydefault(new SaveIntentOrderData(str2, str, str3, str4, i, java.lang.Integer.valueOf(i2))));
    }
}
