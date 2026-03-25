package o;

import com.okinc.business.market.data.model.RangeFilterConfigData;
import com.okinc.business.market.features.filter.domain.RangeFilterConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jUG {
    @yCM
    public jUG() {
    }

    public final RangeFilterConfig OLrzqt(@NotNull RangeFilterConfigData rangeFilterConfigData) {
        Intrinsics.checkNotNullParameter(rangeFilterConfigData, "");
        return new RangeFilterConfig(rangeFilterConfigData.AEQbTJ(), rangeFilterConfigData.EZpvd(), rangeFilterConfigData.copydefault(), rangeFilterConfigData.KWHzl());
    }
}
