package o;

import com.okinc.im.config.page.IMPageType;
import com.okinc.im.usecase.pageconfig.ObservePluginsEnabledUseCase$invoke$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFM {
    public final oFJ KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public oFM(@NotNull oFJ ofj, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(ofj, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = ofj;
        this.copydefault = coroutineDispatcher;
    }

    public final Flow<java.lang.Boolean> KWHzl(IMPageType iMPageType) {
        return FlowKt.flowOn(FlowKt.flow(new ObservePluginsEnabledUseCase$invoke$1(this, iMPageType, null)), this.copydefault);
    }
}
