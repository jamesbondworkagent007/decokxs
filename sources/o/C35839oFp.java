package o;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oFp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35839oFp {
    public final C35835oFl copydefault;

    @yCM
    public C35839oFp(@NotNull C35835oFl c35835oFl) {
        Intrinsics.checkNotNullParameter(c35835oFl, "");
        this.copydefault = c35835oFl;
    }

    public final OKMessage EZpvd(@NotNull SendMessageRequestParam.File file, @NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        return OKMessage.Companion.AEQbTJ(oKConversation.getTargetId(), oKConversation.getConversationType(), this.copydefault.AEQbTJ(file));
    }
}
