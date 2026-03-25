package o;

import com.okinc.im.usecase.group.members.CheckManageGroupMemberUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDP {
    public final CoroutineDispatcher AEQbTJ;
    public final sFU EZpvd;

    @yCM
    public oDP(@NotNull sFU sfu, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sfu, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = sfu;
        this.AEQbTJ = coroutineDispatcher;
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new CheckManageGroupMemberUseCase$invoke$2(this, str, str2, null), continuation);
    }
}
