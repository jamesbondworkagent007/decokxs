package o;

import com.okinc.kline.features.settings.main.data.datasource.ChartDisplayType;
import com.okinc.kline.features.settings.main.data.datasource.ChartHeightType;
import com.okinc.kline.features.settings.main.data.datasource.TopDisplayType;
import com.okinc.kline.features.settings.main.data.datasource.TradingDisplayType;
import com.okinc.kline.features.settings.main.data.model.SettingEntryPoint;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oSQ {
    public final oSL AEQbTJ;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public oSQ(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull oSL osl) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(osl, "");
        this.KWHzl = coroutineDispatcher;
        this.AEQbTJ = osl;
    }

    public final oSM<java.util.List<TopDisplayType>, java.util.List<TradingDisplayType>, java.util.List<ChartDisplayType>, java.util.List<ChartHeightType>> AEQbTJ(@NotNull SettingEntryPoint settingEntryPoint) {
        Intrinsics.checkNotNullParameter(settingEntryPoint, "");
        return this.AEQbTJ.KWHzl(settingEntryPoint);
    }
}
