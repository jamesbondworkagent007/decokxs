package o;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.share.ShareTarget;
import com.okinc.okimcore.model.share.ShareTargetType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sRa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44471sRa {
    public static final ShareTarget copydefault(@NotNull RelationInfo relationInfo, @NotNull ShareTargetType shareTargetType) {
        Intrinsics.checkNotNullParameter(relationInfo, "");
        Intrinsics.checkNotNullParameter(shareTargetType, "");
        return new ShareTarget(shareTargetType, null, relationInfo.getContactsId(), C44157sFk.getDisplayName$default(relationInfo, null, 1, null), relationInfo.getAvatar(), relationInfo.getPhoneRawNumber(), relationInfo.getOfficialTags(), null);
    }

    public static final ShareTarget copydefault(@NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        return new ShareTarget(ShareTargetType.Conversation, oKConversation.getTargetId(), oKConversation.getContactId(), oKConversation.getConversationTitle(), oKConversation.getPortraitUrl(), null, oKConversation.getOfficialTagInfo(), oKConversation.getConversationType());
    }
}
