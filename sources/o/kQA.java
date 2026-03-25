package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.LiquidityListItem;
import com.okinc.business.dexlogic.bean.intent.SaveIntentData;
import com.okinc.business.trade.features.home.ui.cefi.data.PricingTokensRequest;
import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensRequest;
import com.okinc.business.trade.features.home.ui.cefi.data.ValidateTokensResponse;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface kQA {
    java.lang.Object AEQbTJ(@NotNull ValidateTokensRequest validateTokensRequest, @NotNull Continuation<? super AbstractC43419rot<ValidateTokensResponse, OKServerException>> continuation);

    AbstractC58185ywX<ResponseData<SaveIntentData>> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.String str4, int i, int i2);

    java.lang.Object copydefault(@NotNull PricingTokensRequest pricingTokensRequest, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<DexMultiTokenInfoBean>, OKServerException>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull Continuation<? super AbstractC43419rot<DexMultiTokenInfoBean, OKServerException>> continuation);

    AbstractC58185ywX<ResponseData<java.util.List<LiquidityListItem>>> copydefault(@NotNull java.lang.String str);
}
