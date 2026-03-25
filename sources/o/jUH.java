package o;

import com.okinc.business.market.data.model.QuickFilterConfigData;
import com.okinc.business.market.data.model.RangeFilterConfigData;
import com.okinc.business.market.features.filter.domain.QuickFilterConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jUH {
    public final jUG AEQbTJ;

    @yCM
    public jUH(@NotNull jUG jug) {
        Intrinsics.checkNotNullParameter(jug, "");
        this.AEQbTJ = jug;
    }

    public final QuickFilterConfig EZpvd(@NotNull QuickFilterConfigData quickFilterConfigData) {
        Intrinsics.checkNotNullParameter(quickFilterConfigData, "");
        java.util.List<RangeFilterConfigData> listKWHzl = quickFilterConfigData.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        java.util.Iterator<T> it = listKWHzl.iterator();
        while (it.hasNext()) {
            arrayList.add(this.AEQbTJ.OLrzqt((RangeFilterConfigData) it.next()));
        }
        java.util.List<RangeFilterConfigData> listCopydefault = quickFilterConfigData.copydefault();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        java.util.Iterator<T> it2 = listCopydefault.iterator();
        while (it2.hasNext()) {
            arrayList2.add(this.AEQbTJ.OLrzqt((RangeFilterConfigData) it2.next()));
        }
        java.util.List<RangeFilterConfigData> listOLrzqt = quickFilterConfigData.OLrzqt();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        java.util.Iterator<T> it3 = listOLrzqt.iterator();
        while (it3.hasNext()) {
            arrayList3.add(this.AEQbTJ.OLrzqt((RangeFilterConfigData) it3.next()));
        }
        java.util.List<RangeFilterConfigData> listEZpvd = quickFilterConfigData.EZpvd();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        java.util.Iterator<T> it4 = listEZpvd.iterator();
        while (it4.hasNext()) {
            arrayList4.add(this.AEQbTJ.OLrzqt((RangeFilterConfigData) it4.next()));
        }
        return new QuickFilterConfig(arrayList, arrayList2, arrayList3, arrayList4);
    }
}
