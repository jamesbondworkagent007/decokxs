package o;

import com.okinc.crcore.coreapi.net.requestbean.ExchangeQuoteRequestBean;
import com.okinc.crcore.coreapi.repository.CRAssetRepository$currencyPairSuggestion$2;
import com.okinc.crcore.coreapi.repository.CRAssetRepository$getConvertCurrencyPairs$2;
import com.okinc.crcore.coreapi.repository.CRAssetRepository$getConvertFromList$2;
import com.okinc.crcore.coreapi.repository.CRAssetRepository$getConvertToList$2;
import com.okinc.crcore.coreapi.repository.CRAssetRepository$getExchangeQuote$2;
import com.okinc.crcore.coreapi.repository.CRAssetRepository$getIndicativeQuote$2;
import com.okinc.crcore.coreapi.repository.CRAssetRepository$getOkxUserTxHistoryById$2;
import com.okinc.crcore.coreapi.repository.CRAssetRepository$loadQuickChangeOrderDetail$2;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyPairsBean;
import com.okinc.crcore.shared.net.responsebean.CurrencySuggestionPairsBean;
import com.okinc.crcore.shared.net.responsebean.ExchangeQuoteBean;
import com.okinc.crcore.shared.net.responsebean.IndicativePriceDataBean;
import com.okinc.crcore.shared.net.responsebean.MarketHistoryBean;
import com.okinc.crcore.shared.net.responsebean.QuickChangeOrderDetailBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mBm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31722mBm implements mCZ {
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC31766mDc KWHzl;

    @yCM
    public C31722mBm(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC31766mDc interfaceC31766mDc) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC31766mDc, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = interfaceC31766mDc;
    }

    public java.lang.Object AEQbTJ(long j, @NotNull Continuation<? super AbstractC43419rot<MarketHistoryBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRAssetRepository$getOkxUserTxHistoryById$2(this, j, null), continuation);
    }

    @Override // o.mCZ
    public java.lang.Object AEQbTJ(java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ConvertCurrencyBean>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRAssetRepository$getConvertToList$2(this, str, num, str2, str3, null), continuation);
    }

    @Override // o.mCZ
    public java.lang.Object EZpvd(java.lang.String str, java.lang.Integer num, @NotNull java.lang.String str2, java.lang.Integer num2, java.lang.Boolean bool, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ConvertCurrencyBean>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRAssetRepository$getConvertFromList$2(this, str, num, str2, num2, bool, null), continuation);
    }

    @Override // o.mCZ
    public java.lang.Object EZpvd(java.lang.String str, java.lang.Integer num, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<ConvertCurrencyPairsBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRAssetRepository$getConvertCurrencyPairs$2(this, str, num, str2, str3, null), continuation);
    }

    @Override // o.mCZ
    public java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<IndicativePriceDataBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRAssetRepository$getIndicativeQuote$2(this, str, str2, null), continuation);
    }

    @Override // o.mCZ
    public java.lang.Object copydefault(java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.Integer num2, @NotNull java.lang.String str3, java.lang.Integer num3, java.lang.Boolean bool, @NotNull Continuation<? super AbstractC43419rot<CurrencySuggestionPairsBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRAssetRepository$currencyPairSuggestion$2(this, str, num, str2, num2, str3, num3, bool, null), continuation);
    }

    @Override // o.mCZ
    public java.lang.Object EZpvd(java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<QuickChangeOrderDetailBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRAssetRepository$loadQuickChangeOrderDetail$2(this, str, null), continuation);
    }

    @Override // o.mCZ
    public java.lang.Object OLrzqt(@NotNull ExchangeQuoteRequestBean exchangeQuoteRequestBean, @NotNull Continuation<? super AbstractC43419rot<ExchangeQuoteBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CRAssetRepository$getExchangeQuote$2(this, exchangeQuoteRequestBean, null), continuation);
    }
}
