package o;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface sFQ {
    void AEQbTJ(@NotNull OKConversation oKConversation);

    void EZpvd(@NotNull java.lang.String str, boolean z);

    void KWHzl(@NotNull java.lang.String str, boolean z);

    void OLrzqt(@NotNull java.lang.String str, boolean z);

    OKConversation copydefault(@NotNull OKConversation oKConversation);

    OKConversation copydefault(@NotNull java.lang.String str);

    java.lang.Object copydefault(@NotNull OKMessage oKMessage, java.lang.String str, @NotNull Continuation<? super C44461sQr> continuation);

    void copydefault(@NotNull java.lang.String str, boolean z);
}
