package o;

import com.okinc.im.config.serviceprovider.SendMessageRequestParam;
import com.okinc.okimcore.model.exception.NotAllowToSendLinkException;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oFt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35843oFt {
    public final oFC KWHzl;

    @yCM
    public C35843oFt(@NotNull oFC ofc) {
        Intrinsics.checkNotNullParameter(ofc, "");
        this.KWHzl = ofc;
    }

    public final OKMessage EZpvd(@NotNull SendMessageRequestParam.Text text, @NotNull OKConversation oKConversation, GroupInfo groupInfo) throws NotAllowToSendLinkException {
        Intrinsics.checkNotNullParameter(text, "");
        Intrinsics.checkNotNullParameter(oKConversation, "");
        java.lang.String strCopydefault = text.copydefault();
        java.lang.String targetId = oKConversation.getTargetId();
        OKConversationType conversationType = oKConversation.getConversationType();
        boolean z = conversationType == OKConversationType.GROUP;
        oBG obg = oBG.copydefault;
        if (obg.OLrzqt(strCopydefault) && z && groupInfo != null && obg.EZpvd(groupInfo)) {
            throw new NotAllowToSendLinkException(conversationType);
        }
        return OKMessage.Companion.AEQbTJ(targetId, conversationType, this.KWHzl.KWHzl(text));
    }
}
