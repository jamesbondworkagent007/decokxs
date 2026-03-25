package o;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sKa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC44282sKa {
    java.lang.Object KWHzl(@NotNull OKConversation oKConversation, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object KWHzl(@NotNull OKMessage oKMessage, java.lang.String str, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object OLrzqt(@NotNull OKConversation oKConversation, @NotNull Continuation<? super Unit> continuation);
}
