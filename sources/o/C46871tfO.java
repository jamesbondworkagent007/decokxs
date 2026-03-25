package o;

import androidx.camera.video.AudioStats;
import com.okinc.fiat.api.bean.FiatCryptoCoinBean;
import com.okinc.okpaymentapi.data.remote.model.experience.BuySellCurrency;
import com.okinc.okpaymentapi.data.remote.model.experience.CurrencyToken;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tfO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46871tfO {
    public static final kotlin.Pair<java.lang.Double, java.lang.String> copydefault = new kotlin.Pair<>(java.lang.Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE), "--");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final kotlin.Pair<java.lang.Double, java.lang.String> EZpvd() {
        return copydefault;
    }

    public static final FiatCryptoCoinBean copydefault(@NotNull CurrencyToken currencyToken) {
        Intrinsics.checkNotNullParameter(currencyToken, "");
        FiatCryptoCoinBean fiatCryptoCoinBean = new FiatCryptoCoinBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (kotlin.Pair) null, false, (java.util.List) null, (java.lang.String) null, 524287, (DefaultConstructorMarker) null);
        fiatCryptoCoinBean.setValuation(currencyToken.getValuation());
        fiatCryptoCoinBean.setAvailableBalance(currencyToken.getAvailableBalance());
        fiatCryptoCoinBean.setCurrency(currencyToken.getCurrency());
        fiatCryptoCoinBean.setScale(currencyToken.getScale());
        fiatCryptoCoinBean.setSymbol(currencyToken.getSymbol());
        fiatCryptoCoinBean.setIcon(currencyToken.getIcon());
        fiatCryptoCoinBean.setTradeRange(currencyToken.getTradeRange());
        fiatCryptoCoinBean.setPriceScale(currencyToken.getPriceScale());
        fiatCryptoCoinBean.setNightIcon(currencyToken.getNightIcon());
        fiatCryptoCoinBean.setCurrencyId(currencyToken.getCurrencyId());
        fiatCryptoCoinBean.setCurrencyName(currencyToken.getCurrencyName());
        fiatCryptoCoinBean.setChannelAvailable(java.lang.Boolean.valueOf(currencyToken.getChannelAvailable()));
        fiatCryptoCoinBean.setCountryNames(currencyToken.getCountryNames());
        fiatCryptoCoinBean.setUsdRate(java.lang.String.valueOf(currencyToken.getUsdRate()));
        fiatCryptoCoinBean.setTickerPrice(currencyToken.getPrice());
        fiatCryptoCoinBean.setPriceLimit(currencyToken.getPercentage());
        fiatCryptoCoinBean.setQuickAmountList(currencyToken.getQuickAmountList());
        fiatCryptoCoinBean.setEarnRate(currencyToken.getEarnRate());
        return fiatCryptoCoinBean;
    }

    public static final FiatCryptoCoinBean OLrzqt(@NotNull BuySellCurrency buySellCurrency) {
        Intrinsics.checkNotNullParameter(buySellCurrency, "");
        FiatCryptoCoinBean fiatCryptoCoinBean = new FiatCryptoCoinBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (kotlin.Pair) null, false, (java.util.List) null, (java.lang.String) null, 524287, (DefaultConstructorMarker) null);
        fiatCryptoCoinBean.setValuation(buySellCurrency.getValuation());
        fiatCryptoCoinBean.setAvailableBalance(buySellCurrency.getAvailableBalance());
        fiatCryptoCoinBean.setCurrency(buySellCurrency.getCurrency());
        fiatCryptoCoinBean.setScale(buySellCurrency.getScale());
        fiatCryptoCoinBean.setSymbol(buySellCurrency.getSymbol());
        fiatCryptoCoinBean.setIcon(buySellCurrency.getIcon());
        fiatCryptoCoinBean.setTradeRange(buySellCurrency.getTradeRange());
        fiatCryptoCoinBean.setPriceScale(buySellCurrency.getPriceScale());
        fiatCryptoCoinBean.setNightIcon(buySellCurrency.getNightIcon());
        fiatCryptoCoinBean.setCurrencyId(buySellCurrency.getCurrencyId());
        fiatCryptoCoinBean.setCurrencyName(buySellCurrency.getCurrencyName());
        fiatCryptoCoinBean.setChannelAvailable(java.lang.Boolean.valueOf(buySellCurrency.getChannelAvailable()));
        fiatCryptoCoinBean.setCountryNames(buySellCurrency.getCountryNames());
        fiatCryptoCoinBean.setUsdRate(java.lang.String.valueOf(buySellCurrency.getUsdRate()));
        fiatCryptoCoinBean.setQuickAmountList(buySellCurrency.getQuickAmountList());
        return fiatCryptoCoinBean;
    }
}
