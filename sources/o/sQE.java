package o;

import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMConversationStatus;
import com.okinc.okimcore.model.remote.UpdateConversationReq;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sQE {
    public static final boolean AEQbTJ(@NotNull UpdateConversationReq updateConversationReq) {
        Intrinsics.checkNotNullParameter(updateConversationReq, "");
        java.lang.Integer status = updateConversationReq.getStatus();
        return status != null && status.intValue() == InHouseIMConversationStatus.CONVERSATION_REMOVED.getStatus();
    }
}
