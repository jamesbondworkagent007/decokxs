package o;

import com.okinc.crcore.coreapi.net.responsebean.EarnOption;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class lyK {
    public static final lyK copydefault = new lyK();

    private lyK() {
    }

    public final kotlin.Pair<ConvertCurrencyBean, ConvertCurrencyBean> OLrzqt() {
        ConvertCurrencyBean convertCurrencyBean = new ConvertCurrencyBean((java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, 0, (java.lang.String) null, (EarnOption) null, 262143, (DefaultConstructorMarker) null);
        convertCurrencyBean.setCcy("USDT");
        convertCurrencyBean.setIcon("https://static.okx.com/cdn/oksupport/asset/currency/icon/usdt20230419113051.png");
        convertCurrencyBean.setTransferable(false);
        ConvertCurrencyBean convertCurrencyBean2 = new ConvertCurrencyBean((java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, false, 0, (java.lang.String) null, (EarnOption) null, 262143, (DefaultConstructorMarker) null);
        convertCurrencyBean2.setTransferable(false);
        convertCurrencyBean2.setCcy("BTC");
        convertCurrencyBean2.setIcon("https://static.okx.com/cdn/oksupport/asset/currency/icon/btc20230419112752.png");
        return new kotlin.Pair<>(convertCurrencyBean, convertCurrencyBean2);
    }
}
