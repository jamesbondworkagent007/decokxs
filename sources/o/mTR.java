package o;

import com.okinc.core.util.SPUtils;

/* JADX INFO: loaded from: classes18.dex */
public final class mTR {
    public static final mTR EZpvd = new mTR();

    private mTR() {
    }

    public final boolean AYXKKw() {
        return SPUtils.getBoolean("key_kline_market_is_column_chart", true, "dex_market");
    }

    public final boolean KWHzl() {
        return SPUtils.getBoolean("key_kline_market_show_price_line", true, "dex_market");
    }

    public final boolean EZpvd() {
        return SPUtils.getBoolean("chart_spot_average", true);
    }

    public final boolean AEQbTJ() {
        return SPUtils.getBoolean("chart_history_order", true);
    }

    public final void KWHzl(boolean z) {
        SPUtils.put("chart_history_order", java.lang.Boolean.valueOf(z));
    }

    public final boolean OLrzqt() {
        return SPUtils.getBoolean("key_kline_market_show_current_order", true, "dex_market");
    }

    public final boolean copydefault() {
        return SPUtils.getBoolean("key_kline_market_show_cost_line", true, "dex_market");
    }
}
