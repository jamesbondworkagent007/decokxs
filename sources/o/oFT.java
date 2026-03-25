package o;

import com.okinc.im.config.page.IMPageType;
import com.okinc.im.usecase.pageconfig.ObserveVoiceRecordingEnabledUseCase$invoke$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFT {
    public final oFJ AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public oFT(@NotNull oFJ ofj, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(ofj, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = ofj;
        this.OLrzqt = coroutineDispatcher;
    }

    public final Flow<java.lang.Boolean> OLrzqt(IMPageType iMPageType) {
        return FlowKt.flowOn(FlowKt.flow(new ObserveVoiceRecordingEnabledUseCase$invoke$1(this, iMPageType, null)), this.OLrzqt);
    }
}
