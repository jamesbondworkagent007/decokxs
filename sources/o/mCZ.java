package o;

import com.okinc.crcore.coreapi.net.requestbean.ExchangeQuoteRequestBean;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyPairsBean;
import com.okinc.crcore.shared.net.responsebean.CurrencySuggestionPairsBean;
import com.okinc.crcore.shared.net.responsebean.ExchangeQuoteBean;
import com.okinc.crcore.shared.net.responsebean.IndicativePriceDataBean;
import com.okinc.crcore.shared.net.responsebean.QuickChangeOrderDetailBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface mCZ {
    java.lang.Object AEQbTJ(java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ConvertCurrencyBean>, OKServerException>> continuation);

    java.lang.Object EZpvd(java.lang.String str, java.lang.Integer num, @NotNull java.lang.String str2, java.lang.Integer num2, java.lang.Boolean bool, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ConvertCurrencyBean>, OKServerException>> continuation);

    java.lang.Object EZpvd(java.lang.String str, java.lang.Integer num, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super AbstractC43419rot<ConvertCurrencyPairsBean, OKServerException>> continuation);

    java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<IndicativePriceDataBean, OKServerException>> continuation);

    java.lang.Object EZpvd(java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<QuickChangeOrderDetailBean, OKServerException>> continuation);

    java.lang.Object OLrzqt(@NotNull ExchangeQuoteRequestBean exchangeQuoteRequestBean, @NotNull Continuation<? super AbstractC43419rot<ExchangeQuoteBean, OKServerException>> continuation);

    java.lang.Object copydefault(java.lang.String str, java.lang.Integer num, java.lang.String str2, java.lang.Integer num2, @NotNull java.lang.String str3, java.lang.Integer num3, java.lang.Boolean bool, @NotNull Continuation<? super AbstractC43419rot<CurrencySuggestionPairsBean, OKServerException>> continuation);
}
