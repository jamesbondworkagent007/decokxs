package o;

import com.google.common.annotations.VisibleForTesting;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ntW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35341ntW {
    public static final C35341ntW EZpvd = new C35341ntW();

    private C35341ntW() {
    }

    public final boolean KWHzl(OKConversation oKConversation) {
        return (oKConversation != null ? oKConversation.getConversationType() : null) == OKConversationType.PRIVATE;
    }

    public final boolean OLrzqt(OKConversation oKConversation) {
        return (oKConversation != null ? oKConversation.getConversationType() : null) == OKConversationType.GROUP;
    }

    @VisibleForTesting
    public final boolean EZpvd(@NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        return oKConversation.getConversationType() == OKConversationType.PRIVATE || (oKConversation.getConversationType() == OKConversationType.GROUP && oKConversation.getInGroupStatus() == InGroupStatus.IN_GROUP);
    }

    public final boolean EZpvd(@NotNull OKConversation oKConversation, GroupInfo groupInfo) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        return KWHzl(oKConversation) || (EZpvd(oKConversation) && groupInfo != null && groupInfo.isAllowShowGroupInfo());
    }
}
