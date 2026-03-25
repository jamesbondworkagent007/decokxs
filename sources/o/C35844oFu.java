package o;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oFu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35844oFu {
    public final C35845oFv copydefault;

    @yCM
    public C35844oFu(@NotNull C35845oFv c35845oFv) {
        Intrinsics.checkNotNullParameter(c35845oFv, "");
        this.copydefault = c35845oFv;
    }

    public final OKMessage copydefault(@NotNull SendMessageRequestParam.Video video, @NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(video, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        return OKMessage.Companion.AEQbTJ(oKConversation.getTargetId(), oKConversation.getConversationType(), this.copydefault.OLrzqt(video));
    }
}
