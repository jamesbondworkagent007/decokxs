package o;

import com.okinc.core.util.SPUtils;

/* JADX INFO: renamed from: o.hSk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C21952hSk {
    public static final C21952hSk copydefault = new C21952hSk();

    private C21952hSk() {
    }

    public final boolean AhwBna() {
        return SPUtils.getBoolean("key_kline_market_is_column_chart", true, "dex_market");
    }

    public final boolean gEmmrt() {
        return SPUtils.getBoolean("key_kline_market_show_price_line", true, "dex_market");
    }

    public final boolean AEQbTJ() {
        return SPUtils.getBoolean("key_kline_market_show_avg_line", true, "dex_market");
    }

    public final boolean KWHzl() {
        return SPUtils.getBoolean("kline_dex_avg_extend_line", true, "dex_market");
    }

    public final boolean valueOf() {
        return SPUtils.getBoolean("kline_dex_avg_show_pnl_amt", true, "dex_market");
    }

    public final boolean copydefault() {
        return SPUtils.getBoolean("kline_dex_avg_show_right", true, "dex_market");
    }

    public final boolean AYXKKw() {
        return SPUtils.getBoolean("chart_history_order", true);
    }

    public final void OLrzqt(boolean z) {
        SPUtils.put("chart_history_order", java.lang.Boolean.valueOf(z));
    }

    public final boolean OLrzqt() {
        return SPUtils.getBoolean("key_kline_market_show_current_order", true, "dex_market");
    }

    public final boolean EZpvd() {
        return SPUtils.getBoolean("key_kline_market_show_cost_line", true, "dex_market");
    }
}
