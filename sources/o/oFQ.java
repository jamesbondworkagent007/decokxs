package o;

import com.okinc.im.config.page.IMPageType;
import com.okinc.im.usecase.pageconfig.ObserveStickerEnabledUseCase$invoke$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFQ {
    public final CoroutineDispatcher EZpvd;
    public final oFJ OLrzqt;

    @yCM
    public oFQ(@NotNull oFJ ofj, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(ofj, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = ofj;
        this.EZpvd = coroutineDispatcher;
    }

    public final Flow<java.lang.Boolean> AEQbTJ(IMPageType iMPageType) {
        return FlowKt.flowOn(FlowKt.flow(new ObserveStickerEnabledUseCase$invoke$1(this, iMPageType, null)), this.EZpvd);
    }
}
