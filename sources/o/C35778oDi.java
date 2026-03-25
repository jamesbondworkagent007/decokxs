package o;

import com.okinc.im.usecase.group.CreateGroupUseCase$execute$2;
import com.okinc.okimcore.model.utility.PrepareGroupCreation;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oDi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35778oDi {
    public final sIR AEQbTJ;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public C35778oDi(@NotNull sIR sir, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = sir;
        this.KWHzl = coroutineDispatcher;
    }

    public final java.lang.Object KWHzl(@NotNull PrepareGroupCreation prepareGroupCreation, @NotNull Continuation<? super AbstractC44396sOg> continuation) {
        return BuildersKt.withContext(this.KWHzl, new CreateGroupUseCase$execute$2(this, prepareGroupCreation, null), continuation);
    }
}
