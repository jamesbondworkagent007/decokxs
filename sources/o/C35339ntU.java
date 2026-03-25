package o;

import com.okinc.im.bean.SearchResultData;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import com.okinc.okimcore.model.im.OKTextMessage;
import com.okinc.okimcore.model.im.OKUserInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ntU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35339ntU {
    public static final java.lang.String OLrzqt(@NotNull SearchResultData.ChatAndContact chatAndContact) {
        Intrinsics.checkNotNullParameter(chatAndContact, "");
        PhoneRelationEntity phoneRelation = chatAndContact.getPhoneRelation();
        RelationInfo relation = chatAndContact.getRelation();
        if (phoneRelation != null) {
            java.lang.String name = phoneRelation.getName();
            return name == null ? "" : name;
        }
        if (relation == null) {
            OKConversation conversation = chatAndContact.getConversation();
            java.lang.String conversationTitle = conversation != null ? conversation.getConversationTitle() : null;
            return conversationTitle == null ? "" : conversationTitle;
        }
        return C44157sFk.getDisplayName$default(relation, null, 1, null);
    }

    public static final java.lang.String EZpvd(@NotNull SearchResultData.ChatAndContact chatAndContact) {
        Intrinsics.checkNotNullParameter(chatAndContact, "");
        PhoneRelationEntity phoneRelation = chatAndContact.getPhoneRelation();
        RelationInfo relation = chatAndContact.getRelation();
        if (phoneRelation != null) {
            return phoneRelation.getNationalNumber();
        }
        if (relation != null) {
            return relation.getNickName();
        }
        return null;
    }

    public static final java.lang.String EZpvd(@NotNull SearchResultData.Message message) {
        Intrinsics.checkNotNullParameter(message, "");
        if (message.getPhoneRelation() != null) {
            return message.getPhoneRelation().getName();
        }
        return message.getConversation().getConversationTitle();
    }

    public static final java.lang.String copydefault(@NotNull SearchResultData.Message message) {
        OKTextMessage oKTextMessageObtain;
        OKMessageContent content;
        OKUserInfo userInfo;
        Intrinsics.checkNotNullParameter(message, "");
        OKMessage message2 = message.getMessage();
        OKMessageContent content2 = message2 != null ? message2.getContent() : null;
        if (content2 instanceof OKTextMessage) {
            oKTextMessageObtain = (OKTextMessage) content2;
        } else {
            oKTextMessageObtain = content2 instanceof OKReferenceMessage ? OKTextMessage.CREATOR.obtain(((OKReferenceMessage) content2).getContent()) : null;
        }
        OKMessage message3 = message.getMessage();
        java.lang.String name = (message3 == null || (content = message3.getContent()) == null || (userInfo = content.getUserInfo()) == null) ? null : userInfo.getName();
        if (message.getConversation().getConversationType() != OKConversationType.GROUP) {
            return java.lang.String.valueOf(oKTextMessageObtain != null ? oKTextMessageObtain.getAliasedContent() : null);
        }
        return name + ": " + (oKTextMessageObtain != null ? oKTextMessageObtain.getAliasedContent() : null);
    }
}
