package o;

import com.okinc.kline.features.settings.main.data.model.SettingEntryPoint;
import com.okinc.kline.features.settings.sub.data.datasource.ChartPreferencesType;
import com.okinc.kline.features.settings.sub.data.datasource.ChartStyleType;
import com.okinc.kline.features.settings.sub.data.datasource.OthersType;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oTx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36225oTx {
    public final oTA OLrzqt;

    @yCM
    public C36225oTx(@NotNull oTA ota) {
        Intrinsics.checkNotNullParameter(ota, "");
        this.OLrzqt = ota;
    }

    public final Triple<java.util.List<ChartStyleType>, java.util.List<ChartPreferencesType>, java.util.List<OthersType>> KWHzl(@NotNull SettingEntryPoint settingEntryPoint) {
        Intrinsics.checkNotNullParameter(settingEntryPoint, "");
        return this.OLrzqt.KWHzl(settingEntryPoint).copydefault();
    }
}
