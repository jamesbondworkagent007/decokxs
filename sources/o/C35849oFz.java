package o;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oFz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35849oFz {
    public final C35836oFm copydefault;

    @yCM
    public C35849oFz(@NotNull C35836oFm c35836oFm) {
        Intrinsics.checkNotNullParameter(c35836oFm, "");
        this.copydefault = c35836oFm;
    }

    public final OKMessage KWHzl(@NotNull SendMessageRequestParam.Voice voice, @NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(voice, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        return OKMessage.Companion.AEQbTJ(oKConversation.getTargetId(), oKConversation.getConversationType(), this.copydefault.OLrzqt(voice));
    }
}
