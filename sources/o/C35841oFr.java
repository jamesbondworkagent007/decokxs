package o;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oFr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35841oFr {
    public final C35846oFw OLrzqt;

    @yCM
    public C35841oFr(@NotNull C35846oFw c35846oFw) {
        Intrinsics.checkNotNullParameter(c35846oFw, "");
        this.OLrzqt = c35846oFw;
    }

    public final OKMessage OLrzqt(@NotNull SendMessageRequestParam.Sticker sticker, @NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(sticker, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        return OKMessage.Companion.AEQbTJ(oKConversation.getTargetId(), oKConversation.getConversationType(), this.OLrzqt.OLrzqt(sticker));
    }
}
