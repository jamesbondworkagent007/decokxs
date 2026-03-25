package o;

import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.data.model.AdvancedFilterData;
import com.okinc.business.market.data.model.CategoryModuleData;
import com.okinc.business.market.data.model.DefaultChainFilter;
import com.okinc.business.market.data.model.QuickFilterConfigData;
import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import com.okinc.business.market.features.home.domain.HomeTab;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kau, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28447kau {
    public final jUH KWHzl;

    @yCM
    public C28447kau(@NotNull jUH juh) {
        Intrinsics.checkNotNullParameter(juh, "");
        this.KWHzl = juh;
    }

    public final HomeTab EZpvd(@NotNull CategoryModuleData categoryModuleData, @NotNull AdvancedFilterData advancedFilterData, @NotNull QuickFilterConfigData quickFilterConfigData, @NotNull java.lang.String str, @NotNull DefaultChainFilter defaultChainFilter) {
        Intrinsics.checkNotNullParameter(categoryModuleData, "");
        Intrinsics.checkNotNullParameter(advancedFilterData, "");
        Intrinsics.checkNotNullParameter(quickFilterConfigData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(defaultChainFilter, "");
        java.lang.String strKWHzl = categoryModuleData.KWHzl();
        java.lang.String strOLrzqt = categoryModuleData.OLrzqt();
        java.util.List listEZpvd = C56402yEa.EZpvd(advancedFilterData.KWHzl());
        TimeIntervalType timeIntervalTypeEZpvd = advancedFilterData.EZpvd();
        boolean zCopydefault = advancedFilterData.copydefault();
        java.lang.String strAEQbTJ = advancedFilterData.AEQbTJ();
        java.lang.String strAYXKKw = advancedFilterData.AYXKKw();
        TimeIntervalType timeIntervalTypeGEmmrt = advancedFilterData.gEmmrt();
        boolean zAhwBna = advancedFilterData.AhwBna();
        boolean zDjBIcL = advancedFilterData.djBIcL();
        TimeIntervalType timeIntervalTypeValueOf = advancedFilterData.valueOf();
        TimeIntervalType timeIntervalTypeFetchVPNInfo = advancedFilterData.fetchVPNInfo();
        return new HomeTab(strKWHzl, strOLrzqt, new AdvancedFilter(timeIntervalTypeEZpvd, null, null, timeIntervalTypeValueOf, null, null, advancedFilterData.AkhnZx(), advancedFilterData.values(), null, timeIntervalTypeFetchVPNInfo, null, null, null, null, null, null, null, null, null, strAYXKKw, null, null, null, null, 0, zDjBIcL, strAEQbTJ, null, zCopydefault, null, timeIntervalTypeGEmmrt, zAhwBna, listEZpvd, false, 704118070, 2, null), defaultChainFilter, this.KWHzl.EZpvd(quickFilterConfigData), str);
    }
}
