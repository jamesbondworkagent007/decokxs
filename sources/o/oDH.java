package o;

import com.okinc.im.usecase.group.invite.CreateGroupInviteUseCase$execute$2;
import com.okinc.okimcore.model.remote.CreateGroupInviteRequest;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDH {
    public final CoroutineDispatcher EZpvd;
    public final sIR OLrzqt;

    @yCM
    public oDH(@NotNull sIR sir, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = sir;
        this.EZpvd = coroutineDispatcher;
    }

    public final java.lang.Object EZpvd(@NotNull CreateGroupInviteRequest createGroupInviteRequest, @NotNull Continuation<? super AbstractC44393sOd> continuation) {
        return BuildersKt.withContext(this.EZpvd, new CreateGroupInviteUseCase$execute$2(this, createGroupInviteRequest, null), continuation);
    }
}
