package o;

import com.okinc.kline.features.settings.main.data.datasource.ChartDisplayType;
import com.okinc.kline.features.settings.main.data.datasource.ChartHeightType;
import com.okinc.kline.features.settings.main.data.datasource.TopDisplayType;
import com.okinc.kline.features.settings.main.data.datasource.TradingDisplayType;
import com.okinc.kline.features.settings.main.data.model.SettingEntryPoint;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oSL {
    public final oSE KWHzl;

    @yCM
    public oSL(@NotNull oSE ose) {
        Intrinsics.checkNotNullParameter(ose, "");
        this.KWHzl = ose;
    }

    public final oSM<java.util.List<TopDisplayType>, java.util.List<TradingDisplayType>, java.util.List<ChartDisplayType>, java.util.List<ChartHeightType>> KWHzl(@NotNull SettingEntryPoint settingEntryPoint) {
        Intrinsics.checkNotNullParameter(settingEntryPoint, "");
        return this.KWHzl.OLrzqt(settingEntryPoint).AEQbTJ();
    }
}
