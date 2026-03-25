package o;

import com.okinc.okimcore.feature.message.repository.local.inhouseim.reactionemoji.EmojiReactionDao;
import com.okinc.okimcore.model.room.inhouseim.EmojiReactionEntity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sMF {
    public final sIC AEQbTJ;

    @yCM
    public sMF(@NotNull sIC sic) {
        Intrinsics.checkNotNullParameter(sic, "");
        this.AEQbTJ = sic;
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.util.List<EmojiReactionEntity>> continuation) {
        return EZpvd().getReactionsForMessage(str, continuation);
    }

    public final java.lang.Object copydefault(@NotNull java.util.List<EmojiReactionEntity> list, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objInsertAll = EZpvd().insertAll(list, continuation);
        return objInsertAll == C56442yFn.copydefault() ? objInsertAll : Unit.INSTANCE;
    }

    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objDeleteAllForMessage = EZpvd().deleteAllForMessage(str, continuation);
        return objDeleteAllForMessage == C56442yFn.copydefault() ? objDeleteAllForMessage : Unit.INSTANCE;
    }

    public final EmojiReactionDao EZpvd() {
        return this.AEQbTJ.copydefault().copydefault();
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<EmojiReactionEntity> list, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        return EZpvd().updateReactionsInTransaction(str, list, continuation);
    }
}
