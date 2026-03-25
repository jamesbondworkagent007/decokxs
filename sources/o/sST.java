package o;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKGIFMessage;
import com.okinc.okimcore.model.im.OKImageMessage;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKSightMessage;
import com.okinc.okimcore.model.other.IllegalType;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.utils.MessageLegalityValidator$hadIllegalityMessage$1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class sST {
    public static final sST EZpvd = new sST();

    private sST() {
    }

    public final AbstractC58185ywX<java.lang.Boolean> copydefault(@NotNull final java.lang.String str, @NotNull final OKConversationType oKConversationType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(oKConversationType, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C44525sTa.copydefault.EZpvd(new MessageLegalityValidator$hadIllegalityMessage$1(oKConversationType, str, null));
        final Function1 function1 = new Function1() { // from class: o.sSW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sST.AEQbTJ(str, oKConversationType, (OKConversation) obj);
            }
        };
        AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58229yxO() { // from class: o.sSZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return sST.copydefault(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.lang.Boolean copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.Boolean) function1.invoke(obj);
    }

    public static final java.lang.Boolean AEQbTJ(java.lang.String str, OKConversationType oKConversationType, OKConversation oKConversation) {
        boolean zOLrzqt;
        Intrinsics.checkNotNullParameter(oKConversation, "");
        OKMessageContent latestMessage = oKConversation.getLatestMessage();
        if (latestMessage != null) {
            zOLrzqt = EZpvd.OLrzqt(OKMessage.Companion.AEQbTJ(str, oKConversationType, latestMessage));
        } else {
            zOLrzqt = false;
        }
        return java.lang.Boolean.valueOf(zOLrzqt);
    }

    public final boolean OLrzqt(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        boolean zEZpvd = EZpvd(oKMessage);
        pUU.OLrzqt("MessageLegalityValidator", "isIllegalityReceivedMessage->msg:" + KWHzl(oKMessage) + " result:" + zEZpvd);
        return zEZpvd;
    }

    public final boolean EZpvd(@NotNull OKMessage oKMessage) {
        java.lang.String senderUserId;
        RelationInfo relationInfoKWHzl;
        Intrinsics.checkNotNullParameter(oKMessage, "");
        if (oKMessage.getConversationType() != OKConversationType.PRIVATE || oKMessage.getMessageDirection() != OKMessage.MessageDirection.RECEIVE || (senderUserId = oKMessage.getSenderUserId()) == null || (relationInfoKWHzl = sDZ.AEQbTJ.valueOf().KWHzl(senderUserId)) == null) {
            return false;
        }
        return EZpvd(oKMessage, relationInfoKWHzl);
    }

    public final boolean EZpvd(@NotNull OKMessage oKMessage, @NotNull RelationInfo relationInfo) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
        boolean z = false;
        if (copydefault(oKMessage)) {
            OKMessageContent content = oKMessage.getContent();
            boolean zAEQbTJ = content != null ? C44170sFx.AEQbTJ(content) : false;
            boolean zEZpvd = C44170sFx.EZpvd(relationInfo.getOfficialTags());
            boolean zIsBothFriend = relationInfo.isBothFriend();
            if (!zAEQbTJ && !zIsBothFriend && !zEZpvd) {
                z = true;
            }
            pUU.OLrzqt("MessageLegalityValidator", "isMediaMessage->msg:" + KWHzl(oKMessage) + " result:" + z + " isC2C:" + zAEQbTJ + " isBothFriend:" + zIsBothFriend + " isSenderOfficial:" + zEZpvd);
            return z;
        }
        OKMessageContent content2 = oKMessage.getContent();
        if (content2 != null && (strKWHzl = C44170sFx.KWHzl(content2)) != null) {
            if (OLrzqt(oKMessage, relationInfo) && C44170sFx.OLrzqt(strKWHzl) != IllegalType.Legality) {
                z = true;
            }
            pUU.OLrzqt("MessageLegalityValidator", "isTextMessage->msg:" + KWHzl(oKMessage) + " result:" + z);
        }
        return z;
    }

    public final boolean copydefault(@NotNull OKMessage oKMessage) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        OKMessageContent content = oKMessage.getContent();
        if (content == null) {
            return false;
        }
        return (content instanceof OKImageMessage) || (content instanceof OKSightMessage) || (content instanceof OKGIFMessage);
    }

    public final boolean OLrzqt(@NotNull OKMessage oKMessage, @NotNull RelationInfo relationInfo) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(relationInfo, "");
        OKMessageContent content = oKMessage.getContent();
        boolean z = false;
        boolean zAEQbTJ = content != null ? C44170sFx.AEQbTJ(content) : false;
        boolean zIsBothFriend = relationInfo.isBothFriend();
        C44124sEe.imLogCurrentUser$default("getCurrentUserContactInfo, isStrangerPrivateChatScene", null, 2, null);
        RelationInfo relationInfoCopydefault = sDZ.AEQbTJ.valueOf().copydefault();
        boolean zKWHzl = C44170sFx.KWHzl(relationInfoCopydefault != null ? relationInfoCopydefault.getOfficialTags() : null);
        boolean zEZpvd = C44170sFx.EZpvd(relationInfo.getOfficialTags());
        if (!zAEQbTJ && !zIsBothFriend && !zKWHzl && !zEZpvd) {
            z = true;
        }
        pUU.OLrzqt("MessageLegalityValidator", "isStrangerPrivateChatScene->msg:" + KWHzl(oKMessage) + " result:" + z + " isC2C:" + zAEQbTJ + " isBothFriend:" + zIsBothFriend + " isCurrentMerchant:" + zKWHzl + " isSenderOfficial:" + zEZpvd);
        return z;
    }

    public final java.lang.String KWHzl(OKMessage oKMessage) {
        java.lang.String strKWHzl;
        OKMessageContent content = oKMessage.getContent();
        if (content != null && (strKWHzl = C44170sFx.KWHzl(content)) != null) {
            return strKWHzl;
        }
        java.lang.String simpleName = content != null ? content.getClass().getSimpleName() : null;
        return (simpleName == null || simpleName.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) simpleName)) ? "Null" : simpleName;
    }
}
