package o;

import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oUh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36236oUh {
    public static final C36236oUh EZpvd = new C36236oUh();

    private C36236oUh() {
    }

    public final boolean isConnected() {
        if (pDX.AEQbTJ.copydefault()) {
            return C39216poC.copydefault.KWHzl();
        }
        return false;
    }

    public final boolean values() {
        pDX pdx = pDX.AEQbTJ;
        return (pdx.djBIcL() ? gEmmrt() : false) || (pdx.djBIcL() ? copydefault() : false);
    }

    public final void KWHzl(boolean z) {
        SPUtils.put("more_setting_tips", java.lang.Boolean.valueOf(z));
    }

    public final boolean wlaJM() {
        return SPUtils.getBoolean("chart_history_order", true);
    }

    public final boolean uzCIH() {
        return SPUtils.getBoolean("chart_current_order", true);
    }

    public final boolean fARcdN() {
        return SPUtils.getBoolean("chart_spot_average", true);
    }

    public final boolean ejfBZ() {
        return SPUtils.getBoolean("chart_cost_line", true);
    }

    public final boolean fIwbmz() {
        return SPUtils.getBoolean("cost_be", false);
    }

    public final boolean AubY() {
        return SPUtils.getBoolean("cost_liq", false);
    }

    public final boolean AuCTelauCTel() {
        return SPUtils.getBoolean("chart_axis", true);
    }

    public final boolean getNewProxyInstance() {
        return SPUtils.getBoolean("chart_countdown", true);
    }

    public final boolean zLjUOn() {
        return SPUtils.getBoolean("chart_price_warning", true);
    }

    public final boolean hDKMBd() {
        return iwGUEr() || getFieldNames();
    }

    public final boolean iwGUEr() {
        if (C34703nhO.AEQbTJ()) {
            return SPUtils.getBoolean("tr_kline_upcoming_events", true);
        }
        return SPUtils.getBoolean("kline_upcoming_events", pDX.AEQbTJ.EZpvd()) && !C36246oUr.copydefault().zLjUOn().isCeFiMCapMode();
    }

    public final boolean getFieldNames() {
        if (C34703nhO.AEQbTJ()) {
            return SPUtils.getBoolean("tr_kline_past_events", true);
        }
        return SPUtils.getBoolean("kline_past_events", false) && !C36246oUr.copydefault().zLjUOn().isCeFiMCapMode();
    }

    public final void copydefault(boolean z) {
        SPUtils.put("kline_upcoming_events", java.lang.Boolean.valueOf(z));
    }

    public final void OLrzqt(boolean z) {
        SPUtils.put("kline_past_events", java.lang.Boolean.valueOf(z));
    }

    public final int KWHzl() {
        java.lang.Integer num = SPUtils.getInt("chart_height", 25);
        Intrinsics.checkNotNullExpressionValue(num, "");
        return num.intValue();
    }

    public final void OLrzqt(int i) {
        SPUtils.put("chart_height", java.lang.Integer.valueOf(i));
    }

    public final boolean fetchVPNInfo() {
        return SPUtils.getBoolean("kline_layout_style_default", true);
    }

    public final void EZpvd(boolean z) {
        SPUtils.put("kline_layout_style_default", java.lang.Boolean.valueOf(z));
    }

    public final int OLrzqt() {
        java.lang.Integer num = SPUtils.getInt("kline_abstract_type", 1);
        Intrinsics.checkNotNullExpressionValue(num, "");
        return num.intValue();
    }

    public final java.lang.String EZpvd() {
        java.lang.String string = SPUtils.getString("kline_theme_type", "kline_dark");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final boolean AwvSrB() {
        return SPUtils.getBoolean("trade_button_left", true);
    }

    public final int AEQbTJ() {
        java.lang.Integer num = SPUtils.getInt("chart_position", 1);
        Intrinsics.checkNotNullExpressionValue(num, "");
        return num.intValue();
    }

    public final boolean AkhnZx() {
        boolean z = SPUtils.getBoolean("kline_flash_news_on", true);
        pUU.KWHzl("KlineSpHelper", "current is news display news: " + z);
        return z;
    }

    public final boolean DbNXlk() {
        return SPUtils.getBoolean("key_screen_on", false);
    }

    public final boolean gHZMYf() {
        return SPUtils.getBoolean("kline_drawing_data", true);
    }

    public final boolean AuCTel() {
        return SPUtils.getBoolean("kline_drawing_data_clear", true);
    }

    public final void EZpvd(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put("market_last_event_time_" + str, java.lang.Long.valueOf(j));
    }

    public final boolean fJNWhG() {
        return SPUtils.getBoolean("chart_quick_order", true);
    }

    public final void AEQbTJ(boolean z) {
        SPUtils.put("kline_token_trade_risk_tips", java.lang.Boolean.valueOf(z));
    }

    public final boolean zsXlph() {
        return SPUtils.getBoolean("kline_token_trade_risk_tips", true);
    }

    public final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return SPUtils.getBoolean(str, true);
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put(str, java.lang.Boolean.FALSE);
    }

    public final boolean AhwBna() {
        return SPUtils.getBoolean("kline_double_click", true);
    }

    public final boolean valueOf() {
        return SPUtils.getBoolean("kline_order_cancel_confirm", true);
    }

    public final void copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put("kline_time_anchor_" + str, java.lang.Boolean.valueOf(z));
    }

    public final boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return SPUtils.getBoolean("kline_time_anchor_" + str, false);
    }

    public final void EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put("kline_time_anchor_pairs_" + str, java.lang.Boolean.valueOf(z));
    }

    public final boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return SPUtils.getBoolean("kline_time_anchor_pairs_" + str, false);
    }

    public final boolean gEmmrt() {
        return SPUtils.getBoolean("kline_setting_time_anchor_tips", true);
    }

    public final boolean copydefault() {
        return SPUtils.getBoolean("kline_setting_pairs_time_anchor_tips", true);
    }

    public final void AYXKKw() {
        SPUtils.put("kline_setting_time_anchor_tips", java.lang.Boolean.FALSE);
    }

    public final void djBIcL() {
        SPUtils.put("kline_setting_pairs_time_anchor_tips", java.lang.Boolean.FALSE);
    }
}
