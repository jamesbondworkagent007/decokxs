package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.planet.domain.remote.dto.MineCommentsResp;
import com.okinc.planet.domain.usecase.PlanetGetMineCommentsUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tQW {
    public final CoroutineDispatcher EZpvd;
    public final tQP copydefault;

    public tQW(@NotNull tQP tqp, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(tqp, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = tqp;
        this.EZpvd = coroutineDispatcher;
    }

    public java.lang.Object EZpvd(java.lang.String str, int i, @NotNull Continuation<? super AbstractC43419rot<MineCommentsResp, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new PlanetGetMineCommentsUseCase$invoke$2(this, str, i, null), continuation);
    }
}
