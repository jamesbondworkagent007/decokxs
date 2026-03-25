package o;

import com.okinc.im.usecase.conversation.draft.GetTextDraftUseCase$execute$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCP {
    public final oCE AEQbTJ;
    public final CoroutineDispatcher OLrzqt;

    @yCM
    public oCP(@NotNull oCE oce, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(oce, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = oce;
        this.OLrzqt = coroutineDispatcher;
    }

    public final java.lang.Object copydefault(java.lang.String str, @NotNull Continuation<? super java.lang.String> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new GetTextDraftUseCase$execute$2(str, this, null), continuation);
    }
}
