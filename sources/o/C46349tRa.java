package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.planet.domain.remote.dto.LinkAnalysisResp;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tRa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46349tRa {
    public final tQV KWHzl;

    public C46349tRa(@NotNull tQV tqv) {
        Intrinsics.checkNotNullParameter(tqv, "");
        this.KWHzl = tqv;
    }

    public final java.lang.Object copydefault(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super AbstractC43419rot<LinkAnalysisResp, OKServerException>> continuation) {
        return this.KWHzl.EZpvd(list, continuation);
    }
}
