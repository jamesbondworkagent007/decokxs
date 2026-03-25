package o;

import com.okinc.im.usecase.conversation.draft.SaveDraftMessageModelUseCase$execute$2;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCU {
    public final sGF EZpvd;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public oCU(@NotNull sGF sgf, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sgf, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = sgf;
        this.OLrzqt = coroutineDispatcher;
    }

    public final java.lang.Object EZpvd(java.lang.String str, DraftMessageModel draftMessageModel, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.OLrzqt, new SaveDraftMessageModelUseCase$execute$2(str, draftMessageModel, this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
