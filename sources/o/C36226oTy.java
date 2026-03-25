package o;

import com.okinc.kline.features.settings.main.data.model.SettingEntryPoint;
import com.okinc.kline.features.settings.sub.data.datasource.ChartPreferencesType;
import com.okinc.kline.features.settings.sub.data.datasource.ChartStyleType;
import com.okinc.kline.features.settings.sub.data.datasource.OthersType;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oTy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36226oTy {
    public final C36225oTx KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C36226oTy(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C36225oTx c36225oTx) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c36225oTx, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = c36225oTx;
    }

    public final Triple<java.util.List<ChartStyleType>, java.util.List<ChartPreferencesType>, java.util.List<OthersType>> AEQbTJ(@NotNull SettingEntryPoint settingEntryPoint) {
        Intrinsics.checkNotNullParameter(settingEntryPoint, "");
        return this.KWHzl.KWHzl(settingEntryPoint);
    }
}
