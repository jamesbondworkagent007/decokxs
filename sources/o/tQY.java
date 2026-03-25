package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.planet.domain.remote.dto.MineLikesResp;
import com.okinc.planet.domain.usecase.PlanetGetMineLikesUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tQY {
    public final CoroutineDispatcher AEQbTJ;
    public final tQP OLrzqt;

    public tQY(@NotNull tQP tqp, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(tqp, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = tqp;
        this.AEQbTJ = coroutineDispatcher;
    }

    public java.lang.Object KWHzl(java.lang.String str, int i, @NotNull Continuation<? super AbstractC43419rot<MineLikesResp, OKServerException>> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new PlanetGetMineLikesUseCase$invoke$2(this, str, i, null), continuation);
    }
}
