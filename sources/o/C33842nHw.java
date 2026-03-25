package o;

import com.okinc.im.imui.conversationlist.usecase.MarkAllConversationsAsReadUseCase$execute$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nHw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33842nHw {
    public final C35837oFn AEQbTJ;
    public final oCD EZpvd;
    public final CoroutineDispatcher OLrzqt;
    public final sNF copydefault;

    public C33842nHw(@NotNull sNF snf, @NotNull C35837oFn c35837oFn, @NotNull oCD ocd, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(snf, "");
        Intrinsics.checkNotNullParameter(c35837oFn, "");
        Intrinsics.checkNotNullParameter(ocd, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = snf;
        this.AEQbTJ = c35837oFn;
        this.EZpvd = ocd;
        this.OLrzqt = coroutineDispatcher;
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new MarkAllConversationsAsReadUseCase$execute$2(this, null), continuation);
    }
}
