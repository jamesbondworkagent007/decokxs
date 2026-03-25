package o;

import com.okinc.okimcore.model.im.inhouseim.ReceiveMessageOptionType;
import com.okinc.okimcore.model.im.inhouseim.ws.GroupStatus;
import com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType;
import com.okinc.okimcore.model.room.inhouseim.ConversationIcon;
import com.okinc.okimcore.model.room.inhouseim.EntityInfo;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMServerConversationEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMServerConversationResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sQR {
    public static final InHouseIMServerConversationEntity AEQbTJ(@NotNull InHouseIMServerConversationResponse inHouseIMServerConversationResponse) {
        Intrinsics.checkNotNullParameter(inHouseIMServerConversationResponse, "");
        java.lang.String channelId = inHouseIMServerConversationResponse.getChannelId();
        InHouseIMChannelType channelType = inHouseIMServerConversationResponse.getChannelType();
        java.lang.Integer numValueOf = channelType != null ? java.lang.Integer.valueOf(channelType.getApiValue()) : null;
        java.lang.String extra = inHouseIMServerConversationResponse.getExtra();
        int groupAtType = inHouseIMServerConversationResponse.getGroupAtType();
        InGroupStatus inGroupStatus = inHouseIMServerConversationResponse.getInGroupStatus();
        java.lang.Integer numValueOf2 = inGroupStatus != null ? java.lang.Integer.valueOf(inGroupStatus.getApiValue()) : null;
        GroupStatus groupStatus = inHouseIMServerConversationResponse.getGroupStatus();
        java.lang.Integer numValueOf3 = groupStatus != null ? java.lang.Integer.valueOf(groupStatus.getApiValue()) : null;
        long jValueOf = C33129mqd.valueOf(inHouseIMServerConversationResponse.getLastReadMsgSeq());
        int pinnedStatus = inHouseIMServerConversationResponse.getPinnedStatus();
        int iIsFlagged = inHouseIMServerConversationResponse.isFlagged();
        ReceiveMessageOptionType receiveMsgOption = inHouseIMServerConversationResponse.getReceiveMsgOption();
        java.lang.Integer numValueOf4 = receiveMsgOption != null ? java.lang.Integer.valueOf(receiveMsgOption.getApiValue()) : null;
        int role = inHouseIMServerConversationResponse.getRole();
        long jValueOf2 = C33129mqd.valueOf(inHouseIMServerConversationResponse.getStartMsgSeq());
        java.lang.String updateTime = inHouseIMServerConversationResponse.getUpdateTime();
        EntityInfo entityInfo = inHouseIMServerConversationResponse.getEntityInfo();
        java.lang.String relatedId = entityInfo != null ? entityInfo.getRelatedId() : null;
        EntityInfo entityInfo2 = inHouseIMServerConversationResponse.getEntityInfo();
        java.lang.String enNickname = entityInfo2 != null ? entityInfo2.getEnNickname() : null;
        EntityInfo entityInfo3 = inHouseIMServerConversationResponse.getEntityInfo();
        java.lang.String nickname = entityInfo3 != null ? entityInfo3.getNickname() : null;
        EntityInfo entityInfo4 = inHouseIMServerConversationResponse.getEntityInfo();
        java.lang.String bizGroupName = entityInfo4 != null ? entityInfo4.getBizGroupName() : null;
        java.lang.Integer numAEQbTJ = AEQbTJ(inHouseIMServerConversationResponse.getEntityInfo());
        EntityInfo entityInfo5 = inHouseIMServerConversationResponse.getEntityInfo();
        java.lang.String avatar = entityInfo5 != null ? entityInfo5.getAvatar() : null;
        EntityInfo entityInfo6 = inHouseIMServerConversationResponse.getEntityInfo();
        java.util.List<java.lang.Integer> tags = entityInfo6 != null ? entityInfo6.getTags() : null;
        EntityInfo entityInfo7 = inHouseIMServerConversationResponse.getEntityInfo();
        java.util.List<ConversationIcon> icons = entityInfo7 != null ? entityInfo7.getIcons() : null;
        int unreadCount = inHouseIMServerConversationResponse.getUnreadCount();
        java.lang.Integer conversationStatus = inHouseIMServerConversationResponse.getConversationStatus();
        EntityInfo entityInfo8 = inHouseIMServerConversationResponse.getEntityInfo();
        return new InHouseIMServerConversationEntity(channelId, numValueOf, avatar, tags, extra, groupAtType, numValueOf2, numValueOf3, java.lang.Long.valueOf(jValueOf), pinnedStatus, iIsFlagged, numValueOf4, role, java.lang.Long.valueOf(jValueOf2), updateTime, relatedId, enNickname, nickname, bizGroupName, numAEQbTJ, java.lang.Integer.valueOf(unreadCount), conversationStatus, icons, entityInfo8 != null ? entityInfo8.getExtra() : null);
    }

    public static final java.lang.Integer AEQbTJ(EntityInfo entityInfo) {
        if (C44179sGf.AEQbTJ.AEQbTJ(entityInfo != null ? entityInfo.getGroupType() : null, entityInfo != null ? entityInfo.getGroupSubType() : null)) {
            if (entityInfo != null) {
                return entityInfo.getGroupSubType();
            }
            return null;
        }
        if (entityInfo != null) {
            return entityInfo.getGroupType();
        }
        return null;
    }
}
