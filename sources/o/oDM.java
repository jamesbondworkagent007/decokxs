package o;

import com.okinc.im.usecase.group.invite.RevokePastInvitesUseCase$execute$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDM {
    public final sIR EZpvd;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public oDM(@NotNull sIR sir, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = sir;
        this.KWHzl = coroutineDispatcher;
    }

    public final java.lang.Object copydefault(long j, @NotNull Continuation<? super sOQ> continuation) {
        return BuildersKt.withContext(this.KWHzl, new RevokePastInvitesUseCase$execute$2(this, j, null), continuation);
    }
}
