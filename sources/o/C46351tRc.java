package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.planet.domain.remote.dto.UnreadMsgListResp;
import com.okinc.planet.domain.usecase.PlanetGetUnreadMsgListUserCase$invoke$2;
import com.okinc.planet_api.model.PlanetNotificationCategory;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tRc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46351tRc {
    public final CoroutineDispatcher KWHzl;
    public final tQP copydefault;

    public C46351tRc(@NotNull tQP tqp, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(tqp, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = tqp;
        this.KWHzl = coroutineDispatcher;
    }

    public java.lang.Object KWHzl(@NotNull PlanetNotificationCategory planetNotificationCategory, int i, java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<UnreadMsgListResp, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new PlanetGetUnreadMsgListUserCase$invoke$2(planetNotificationCategory, this, str, i, null), continuation);
    }
}
