package o;

import com.okinc.okimcore.model.im.OKConversation;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o.sGF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oCE {
    public final sGF KWHzl;

    @yCM
    public oCE(@NotNull sGF sgf) {
        Intrinsics.checkNotNullParameter(sgf, "");
        this.KWHzl = sgf;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.sGF.Activity.getConversation$default(o.sGF, java.lang.String, com.okinc.okimcore.model.im.CacheStrategy, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super OKConversation> continuation) {
        return sGF.Activity.getConversation$default(this.KWHzl, str, null, continuation, 2, null);
    }
}
