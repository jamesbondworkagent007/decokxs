package o;

import com.okinc.okimcore.model.im.OKConversation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nGE {
    public final java.lang.String AEQbTJ;
    public OKConversation EZpvd;
    public android.content.Context KWHzl;
    public android.text.Spannable OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKConversation AEQbTJ() {
        return this.EZpvd;
    }

    public abstract java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.text.Spannable KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(android.text.Spannable spannable) {
        this.OLrzqt = spannable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        this.EZpvd = oKConversation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.content.Context copydefault() {
        return this.KWHzl;
    }

    public nGE(@NotNull android.content.Context context, @NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        this.KWHzl = context;
        this.EZpvd = oKConversation;
        this.AEQbTJ = getClass().getSimpleName();
        this.copydefault = ":";
    }
}
