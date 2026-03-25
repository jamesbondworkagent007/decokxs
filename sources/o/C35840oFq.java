package o;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oFq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35840oFq {
    public final C35838oFo AEQbTJ;

    @yCM
    public C35840oFq(@NotNull C35838oFo c35838oFo) {
        Intrinsics.checkNotNullParameter(c35838oFo, "");
        this.AEQbTJ = c35838oFo;
    }

    public final OKMessage copydefault(@NotNull SendMessageRequestParam.ImageOrGif imageOrGif, @NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(imageOrGif, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        return OKMessage.Companion.AEQbTJ(oKConversation.getTargetId(), oKConversation.getConversationType(), this.AEQbTJ.EZpvd(imageOrGif));
    }
}
