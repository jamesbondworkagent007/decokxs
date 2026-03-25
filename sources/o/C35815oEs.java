package o;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35815oEs {
    public static final ActionBar Companion = new ActionBar(null);

    @yCM
    public C35815oEs() {
    }

    /* JADX INFO: renamed from: o.oEs$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEs.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void KWHzl(@NotNull OKConversation oKConversation, GroupInfo groupInfo, @NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        Intrinsics.checkNotNullParameter(oKMessage, "");
        java.lang.String targetId = oKConversation.getTargetId();
        boolean zKWHzl = (oKConversation.getConversationType() != OKConversationType.GROUP || groupInfo == null) ? false : oBG.copydefault.KWHzl(groupInfo);
        OKMessageContent content = oKMessage.getContent();
        boolean z = (content != null ? content.getMentionedInfo() : null) != null;
        pUU.KWHzl("PostSendMessageUseCase", "[" + targetId + "] canMentionedRobot:" + zKWHzl);
        pUU.KWHzl("PostSendMessageUseCase", "[" + targetId + "] hadMentionedInfo:" + z);
        if (z) {
            C36411oaU.AEQbTJ.AEQbTJ(zKWHzl, oKMessage);
        }
    }
}
