package o;

import com.okinc.im.usecase.group.invite.AcceptGroupInviteUseCase$execute$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDE {
    public final CoroutineDispatcher KWHzl;
    public final sIR OLrzqt;

    @yCM
    public oDE(@NotNull sIR sir, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = sir;
        this.KWHzl = coroutineDispatcher;
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC44395sOf> continuation) {
        return BuildersKt.withContext(this.KWHzl, new AcceptGroupInviteUseCase$execute$2(this, str, null), continuation);
    }
}
