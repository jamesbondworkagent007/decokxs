package o;

import com.okinc.im.usecase.conversation.draft.GetDraftMessageModelUseCase$execute$2;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCN {
    public final CoroutineDispatcher AEQbTJ;
    public final oCE copydefault;

    @yCM
    public oCN(@NotNull oCE oce, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(oce, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = oce;
        this.AEQbTJ = coroutineDispatcher;
    }

    public final java.lang.Object OLrzqt(java.lang.String str, @NotNull Continuation<? super DraftMessageModel> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new GetDraftMessageModelUseCase$execute$2(str, this, null), continuation);
    }
}
