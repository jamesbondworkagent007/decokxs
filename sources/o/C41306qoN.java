package o;

import com.okinc.core.util.SPUtils;
import com.okinc.market.quotation.ui.model.SortBy;
import com.okinc.market.quotation.ui.model.SortOrder;
import com.okinc.market.quotation.ui.model.dex.DexPeriodEnum;
import com.okinc.market.quotation.ui.model.dex.DexSortByEnum;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qoN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41306qoN {
    public static final C41306qoN copydefault = new C41306qoN();

    private C41306qoN() {
    }

    public final void copydefault(int i) {
        SPUtils.put("market.discover_root_tab_position", java.lang.Integer.valueOf(i));
    }

    public final int DbNXlk() {
        java.lang.Integer num = SPUtils.getInt("market.discover_root_tab_position", 0);
        Intrinsics.checkNotNullExpressionValue(num, "");
        return num.intValue();
    }

    public final void KWHzl(int i) {
        SPUtils.put("market.discover_markets_tab_position", java.lang.Integer.valueOf(i));
    }

    public final int djBIcL() {
        java.lang.Integer num = SPUtils.getInt("market.discover_markets_tab_position", 0);
        Intrinsics.checkNotNullExpressionValue(num, "");
        return num.intValue();
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        SPUtils.put("market.discover_markets_favorites_last_group_name", str);
    }

    public final java.lang.String AhwBna() {
        java.lang.String string = SPUtils.getString("market.discover_markets_favorites_last_group_name", "ALL");
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final void OLrzqt(boolean z) {
        SPUtils.put("market.discover_dex_tab_red_dot_displayed", java.lang.Boolean.valueOf(z));
    }

    public final boolean KWHzl() {
        return SPUtils.getBoolean("market.discover_dex_tab_red_dot_displayed", false);
    }

    public final void KWHzl(@NotNull DexPeriodEnum dexPeriodEnum) {
        Intrinsics.checkNotNullParameter(dexPeriodEnum, "");
        SPUtils.put("market.discover_dex_last_selected_period", dexPeriodEnum.name());
    }

    public final boolean valueOf() {
        return SPUtils.getBoolean("market.discover_futures_tab_stock_category_red_dot_displayed", false);
    }

    public final void KWHzl(boolean z) {
        SPUtils.put("market.discover_futures_tab_stock_category_red_dot_displayed", java.lang.Boolean.valueOf(z));
    }

    public final boolean AYXKKw() {
        return SPUtils.getBoolean("market.discover_spot_tab_stock_category_red_dot_displayed", false);
    }

    public final void AEQbTJ(boolean z) {
        SPUtils.put("market.discover_spot_tab_stock_category_red_dot_displayed", java.lang.Boolean.valueOf(z));
    }

    public final DexPeriodEnum EZpvd() {
        java.lang.String string = SPUtils.getString("market.discover_dex_last_selected_period", "ONE_DAY");
        DexPeriodEnum.StateListAnimator stateListAnimator = DexPeriodEnum.Companion;
        Intrinsics.copydefault((java.lang.Object) string);
        return stateListAnimator.KWHzl(string);
    }

    public final void AEQbTJ(@NotNull kotlin.Pair<? extends DexSortByEnum, ? extends SortOrder> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        SPUtils.put("market_dex_sort_by", pair.getFirst().name());
        SPUtils.put("market_dex_sort_order", pair.getSecond().name());
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> copydefault() {
        return C56390yDp.OLrzqt(SPUtils.getString("market_dex_sort_by", null), SPUtils.getString("market_dex_sort_order", null));
    }

    public final void EZpvd(@NotNull kotlin.Pair<? extends SortBy, ? extends SortOrder> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        SPUtils.put("market_futures_sort_by", pair.getFirst().name());
        SPUtils.put("market_futures_sort_order", pair.getSecond().name());
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> AEQbTJ() {
        return C56390yDp.OLrzqt(SPUtils.getString("market_futures_sort_by", null), SPUtils.getString("market_futures_sort_order", null));
    }

    public final void copydefault(@NotNull kotlin.Pair<? extends SortBy, ? extends SortOrder> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        SPUtils.put("market_spot_sort_by", pair.getFirst().name());
        SPUtils.put("market_spot_sort_order", pair.getSecond().name());
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> gEmmrt() {
        return C56390yDp.OLrzqt(SPUtils.getString("market_spot_sort_by", null), SPUtils.getString("market_spot_sort_order", null));
    }

    public final void KWHzl(@NotNull kotlin.Pair<? extends SortBy, ? extends SortOrder> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        SPUtils.put("market_fav_sort_by", pair.getFirst().name());
        SPUtils.put("market_fav_sort_order", pair.getSecond().name());
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> OLrzqt() {
        return C56390yDp.OLrzqt(SPUtils.getString("market_fav_sort_by", null), SPUtils.getString("market_fav_sort_order", null));
    }
}
