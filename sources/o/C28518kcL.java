package o;

import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.filter.domain.QuickFilterConfig;
import com.okinc.business.market.features.filter.domain.RangeFilterConfig;
import com.okinc.business.market.features.filter.ui.params.FilterConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kcL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28518kcL {
    public static final FilterConfig KWHzl(QuickFilterConfig quickFilterConfig) {
        java.util.List<RangeFilterConfig> listEZpvd = quickFilterConfig.EZpvd();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        java.util.Iterator<T> it = listEZpvd.iterator();
        while (it.hasNext()) {
            arrayList.add(AEQbTJ((RangeFilterConfig) it.next()));
        }
        java.util.List<RangeFilterConfig> listOLrzqt = quickFilterConfig.OLrzqt();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        java.util.Iterator<T> it2 = listOLrzqt.iterator();
        while (it2.hasNext()) {
            arrayList2.add(AEQbTJ((RangeFilterConfig) it2.next()));
        }
        java.util.List<RangeFilterConfig> listAEQbTJ = quickFilterConfig.AEQbTJ();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listAEQbTJ, 10));
        java.util.Iterator<T> it3 = listAEQbTJ.iterator();
        while (it3.hasNext()) {
            arrayList3.add(AEQbTJ((RangeFilterConfig) it3.next()));
        }
        java.util.List<RangeFilterConfig> listCopydefault = quickFilterConfig.copydefault();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        java.util.Iterator<T> it4 = listCopydefault.iterator();
        while (it4.hasNext()) {
            arrayList4.add(AEQbTJ((RangeFilterConfig) it4.next()));
        }
        return new FilterConfig(arrayList, arrayList2, arrayList3, arrayList4);
    }

    public static final PriceRangeFilter AEQbTJ(RangeFilterConfig rangeFilterConfig) {
        return new PriceRangeFilter(rangeFilterConfig.KWHzl(), rangeFilterConfig.OLrzqt(), rangeFilterConfig.EZpvd(), rangeFilterConfig.AEQbTJ(), (java.lang.String) null, (java.lang.String) null, false, WalletImportError.ERROR_CODE_AA_EXIST, (DefaultConstructorMarker) null);
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "watchlist")) {
            return "watch_list";
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "dapp_home")) {
            return "market_dapps";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1964972026) {
            if (iHashCode != -1290089759) {
                if (iHashCode == 1459599685 && str.equals("Trending")) {
                    return "market_trending";
                }
            } else if (str.equals("Top searches")) {
                return "market_hot_search";
            }
        } else if (str.equals("Newest")) {
            return "market_newest";
        }
        return "unknown";
    }
}
