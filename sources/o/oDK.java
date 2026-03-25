package o;

import com.okinc.im.usecase.group.invite.GetExistingInviteUseCase$execute$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDK {
    public final CoroutineDispatcher EZpvd;
    public final sIR KWHzl;

    @yCM
    public oDK(@NotNull sIR sir, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = sir;
        this.EZpvd = coroutineDispatcher;
    }

    public final java.lang.Object AEQbTJ(long j, @NotNull Continuation<? super AbstractC44398sOi> continuation) {
        return BuildersKt.withContext(this.EZpvd, new GetExistingInviteUseCase$execute$2(this, j, null), continuation);
    }
}
