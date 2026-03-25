package o;

import com.okinc.core.util.SPUtils;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: loaded from: classes12.dex */
public final class xVB {
    public static final xVB OLrzqt = new xVB();

    private xVB() {
    }

    public final java.lang.String OLrzqt() {
        return "trade_impl_trade_receive_save_key-" + C54589xNz.EZpvd.EZpvd();
    }

    public final void KWHzl(java.lang.String str) {
        pUU.KWHzl("OKTTradeReceiveStorage", "save quote ccy " + str + " result: " + SPUtils.put(OLrzqt(), str, "trade_impl_trade_receive_file_name"));
    }

    public final java.lang.String EZpvd(java.util.List<java.lang.String> list, boolean z) {
        if (list == null || list.isEmpty() || !z) {
            return null;
        }
        java.lang.String string = SPUtils.getString(OLrzqt(), null, "trade_impl_trade_receive_file_name");
        if (string == null || string.length() == 0) {
            string = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(list);
            pUU.KWHzl("OKTTradeReceiveStorage", "no cahce, return first ccy: " + string);
        } else if (list.contains(string)) {
            pUU.KWHzl("OKTTradeReceiveStorage", "use cache, return cacheCcy : " + string);
        } else {
            string = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(list);
            pUU.KWHzl("OKTTradeReceiveStorage", "cache not match, return first ccy: " + string);
            KWHzl(string);
        }
        pUU.KWHzl("OKTTradeReceiveStorage", "getCurrentTradeReceiveQuoteCcyStorage quoteCcy: " + string);
        return string;
    }
}
