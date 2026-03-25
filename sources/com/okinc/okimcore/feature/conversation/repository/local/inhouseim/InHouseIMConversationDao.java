package com.okinc.okimcore.feature.conversation.repository.local.inhouseim;

import com.okinc.okimcore.common.database.BaseDao;
import com.okinc.okimcore.model.im.inhouseim.ReceiveMessageOptionType;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType;
import com.okinc.okimcore.model.room.inhouseim.ConversationStatus;
import com.okinc.okimcore.model.room.inhouseim.ConversationUnreadUpdateEntity;
import com.okinc.okimcore.model.room.inhouseim.DraftMessageModel;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationListData;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMServerConversationEntity;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import o.C44179sGf;
import o.sQU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface InHouseIMConversationDao extends BaseDao {
    public static final Application Companion = Application.copydefault;
    public static final String SQL_CONVERSATION_LIST_QUERY = "SELECT c1.channelId as conv_channelId, c1.channelType as conv_channelType, c1.lastUserMessageSendTime, c1.unreadCount, c1.pinnedStatus, c1.isFlagged, c1.muteStatus, c1.draftMessage, c1.unreadMentionedCount, c1.unreadMentionedType, c1.inGroupStatus, c1.groupStatus, c1.groupType, c1.role, c1.extra as conv_extra, c1.conversationStatus, c1.lastReadMsgSeq, c1.startMsgSeq, c1.relatedId, c1.enNickname, c1.nickname, c1.bizGroupName, c1.avatar, c1.tags, c1.conversationIcons, c1.entityInfoExtra, c2.remarkName, p.name AS phoneName, m.*";
    public static final String SQL_LIMIT = " LIMIT :limit ";
    public static final String SQL_SEARCH_CONTACTS = "SELECT A.*, B.contactUid AS okx_relation_contactUid,B.channelId AS okx_relation_channelId,B.relationType AS okx_relation_relationType,B.remarkName AS okx_relation_remarkName,B.nickname AS okx_relation_nickname,B.enNickname AS okx_relation_enNickname,B.avatar AS okx_relation_avatar,B.userUid AS okx_relation_userUid,B.tags AS okx_relation_tags,B.blacklisted AS okx_relation_blacklisted,B.relationSourceType AS okx_relation_relationSourceType,B.relationPermission AS okx_relation_relationPermission,B.phoneHash AS okx_relation_phoneHash, C.hash AS phone_relation_hash,C.rowId AS phone_relation_rowId,C.countryCode AS phone_relation_countryCode,C.isSynced AS phone_relation_isSynced,C.phoneRelationId AS phone_relation_phoneRelationId,C.okxRelationId AS phone_relation_okxRelationId,C.name AS phone_relation_name,C.rawNumber AS phone_relation_rawNumber,C.nationalNumber AS phone_relation_nationalNumber  FROM contacts B     LEFT JOIN phone_relations C ON C.okxRelationId = B.contactUid     LEFT JOIN conversation A ON A.channelId = B.channelId     WHERE (        (B.channelId IS NULL OR A.channelId NOT IN (:filteredChannelIds))         AND B.relationType NOT IN ('STRANGER', 'UNKNOWN')         AND (C.nationalNumber LIKE '%' || :keyword || '%' OR B.remarkName LIKE '%' || :keyword || '%' OR C.name LIKE '%' || :keyword || '%' OR B.nickname LIKE '%' || :keyword || '%'   OR (CASE WHEN :isChinese = 0 THEN B.enNickname LIKE '%' || :keyword || '%' ELSE 0 END = 1)  OR (CASE WHEN :isOfficial = 1 THEN B.contactUid LIKE '%' || :keyword || '%' ELSE 0 END = 1)))  GROUP BY B.contactUid ";
    public static final String SQL_SEARCH_CONVERSATIONS = "SELECT A.*, B.contactUid AS okx_relation_contactUid,B.channelId AS okx_relation_channelId,B.relationType AS okx_relation_relationType,B.remarkName AS okx_relation_remarkName,B.nickname AS okx_relation_nickname,B.enNickname AS okx_relation_enNickname,B.avatar AS okx_relation_avatar,B.userUid AS okx_relation_userUid,B.tags AS okx_relation_tags,B.blacklisted AS okx_relation_blacklisted,B.relationSourceType AS okx_relation_relationSourceType,B.relationPermission AS okx_relation_relationPermission,B.phoneHash AS okx_relation_phoneHash, C.hash AS phone_relation_hash,C.rowId AS phone_relation_rowId,C.countryCode AS phone_relation_countryCode,C.isSynced AS phone_relation_isSynced,C.phoneRelationId AS phone_relation_phoneRelationId,C.okxRelationId AS phone_relation_okxRelationId,C.name AS phone_relation_name,C.rawNumber AS phone_relation_rawNumber,C.nationalNumber AS phone_relation_nationalNumber  FROM conversation A     LEFT JOIN contacts B ON A.channelId = B.channelId     LEFT JOIN phone_relations C ON C.okxRelationId = B.contactUid     WHERE         A.lastUserMessageId IS NOT NULL AND        ((:includeGroup = 1 AND A.channelType = '0'        AND (A.groupType IS NULL OR A.groupType NOT IN (:displayFilteredGroupTypeList))        AND (A.conversationStatus IS NULL OR A.conversationStatus != :nonDisplayConversationStatus)        AND(            A.enNickname LIKE '%' || :keyword || '%'            OR A.nickname LIKE '%' || :keyword || '%'            OR A.bizGroupName LIKE '%' || :keyword || '%'        )        ) OR (        A.channelType = 1        AND (A.conversationStatus IS NULL OR A.conversationStatus != :nonDisplayConversationStatus)        AND (C.nationalNumber LIKE '%' || :keyword || '%' OR B.remarkName LIKE '%' || :keyword || '%' OR C.name LIKE '%' || :keyword || '%' OR B.nickname LIKE '%' || :keyword || '%' OR A.enNickname LIKE '%' || :keyword || '%' OR A.nickname LIKE '%' || :keyword || '%'  OR (CASE WHEN :isChinese = 0 THEN B.enNickname LIKE '%' || :keyword || '%' ELSE 0 END = 1)  OR (CASE WHEN :isOfficial = 1 THEN B.contactUid LIKE '%' || :keyword || '%' ELSE 0 END = 1))))  GROUP BY A.channelId  ORDER BY MAX(A.lastUserMessageSendTime) DESC ";
    public static final String SQL_SEARCH_GROUPS_ONLY = "SELECT * FROM conversation WHERE lastUserMessageId IS NOT NULL AND channelType = 0 AND (groupType IS NULL OR groupType NOT IN (:displayFilteredGroupTypeList)) AND (conversationStatus IS NULL OR conversationStatus != :nonDisplayConversationStatus) AND (    enNickname LIKE '%' || :keyword || '%'     OR nickname LIKE '%' || :keyword || '%'     OR bizGroupName LIKE '%' || :keyword || '%' ) ORDER BY lastUserMessageSendTime DESC ";

    Object deleteConversations(@NotNull Set<String> set, @NotNull Continuation<? super Unit> continuation);

    Object deleteLiveStreamingConversations(@NotNull List<Integer> list, @NotNull Continuation<? super Unit> continuation);

    Object getAllChannelIdsForSync(@NotNull List<Integer> list, @NotNull Continuation<? super List<String>> continuation);

    Object getAllChannelsWithUnreadCount(@NotNull List<Integer> list, int i, @NotNull Continuation<? super List<String>> continuation);

    Flow<List<InHouseIMConversationListData>> getAllConversationsFlow(@NotNull List<Integer> list, int i);

    Object getAllOKAssistantChannelIds(int i, @NotNull Continuation<? super List<String>> continuation);

    Flow<List<String>> getAllRelatedIdsFlow(int i);

    Object getConversation(@NotNull String str, @NotNull Continuation<? super InHouseIMConversationListData> continuation);

    Object getConversationByContactId(@NotNull String str, @NotNull Continuation<? super InHouseIMConversationListData> continuation);

    Flow<Integer> getConversationCountWithoutNotificationFlow(@NotNull List<Integer> list, int i, int i2);

    Object getConversationEntity(@NotNull String str, @NotNull Continuation<? super InHouseIMConversationEntity> continuation);

    Object getConversationEntityBlocking(@NotNull String str, @NotNull Continuation<? super InHouseIMConversationEntity> continuation);

    Flow<Integer> getConversationTotalCountFlow();

    Flow<Integer> getConversationTotalUnreadCountFlow(int i, @NotNull List<Integer> list, int i2, @NotNull List<Integer> list2);

    Object getConversationUnreadCount(@NotNull String str, @NotNull Continuation<? super Integer> continuation);

    Flow<Integer> getConversationUnreadCountFlow(@NotNull String str);

    Flow<List<InHouseIMConversationListData>> getConversationsByPageFlow(int i, @NotNull List<Integer> list, int i2, boolean z, Boolean bool);

    Object getConversationsCount(@NotNull List<Integer> list, int i, @NotNull Continuation<? super Integer> continuation);

    @Override // com.okinc.okimcore.common.database.BaseDao
    String getDaoName();

    Flow<Integer> getFlaggedConversationsWithUnreadCountFlow(int i, @NotNull List<Integer> list, int i2);

    Object getMultipleConversationEntity(@NotNull List<String> list, @NotNull Continuation<? super List<InHouseIMConversationEntity>> continuation);

    Flow<InHouseIMConversationListData> getSingleConversationsFlow(@NotNull String str);

    Flow<Integer> getSystemNotificationTotalUnreadCount(int i);

    Flow<Integer> getTotalNumberOfConversationsWithFlaggedCountFlow(@NotNull List<Integer> list, int i);

    Flow<Integer> getTotalNumberOfConversationsWithUnreadCountFlow(int i, @NotNull List<Integer> list, int i2);

    Object getTotalUnreadCount(int i, @NotNull List<Integer> list, int i2, @NotNull Continuation<? super Integer> continuation);

    Flow<Integer> getTotalUnreadCountByChannelTypeFlow(int i, @NotNull List<Integer> list, int i2, @NotNull List<Integer> list2);

    Flow<Integer> getTotalUnreadCountFlow(int i, @NotNull List<Integer> list, int i2);

    Flow<Integer> getUnreadCountByRelationIdFlow(@NotNull String str);

    Object insertOrReplace(@NotNull InHouseIMConversationEntity[] inHouseIMConversationEntityArr, @NotNull Continuation<? super Unit> continuation);

    Object insertOrReplaceList(@NotNull List<InHouseIMServerConversationEntity> list, @NotNull Continuation<? super List<Long>> continuation);

    Object resetUnreadCount(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    Object searchContacts(@NotNull String str, @NotNull List<String> list, boolean z, boolean z2, @NotNull Continuation<? super List<sQU>> continuation);

    Object searchContactsWithLimit(@NotNull String str, @NotNull List<String> list, boolean z, boolean z2, int i, @NotNull Continuation<? super List<sQU>> continuation);

    Object searchConversations(@NotNull String str, boolean z, boolean z2, boolean z3, @NotNull List<Integer> list, int i, @NotNull Continuation<? super List<sQU>> continuation);

    Object searchConversationsWithLimit(@NotNull String str, int i, boolean z, boolean z2, boolean z3, @NotNull List<Integer> list, int i2, @NotNull Continuation<? super List<sQU>> continuation);

    Object searchGroups(@NotNull String str, @NotNull List<Integer> list, int i, @NotNull Continuation<? super List<InHouseIMConversationEntity>> continuation);

    Object searchGroupsWithLimit(@NotNull String str, int i, @NotNull List<Integer> list, int i2, @NotNull Continuation<? super List<InHouseIMConversationEntity>> continuation);

    Object updateConversationsUnread(@NotNull List<ConversationUnreadUpdateEntity> list, @NotNull Continuation<? super Unit> continuation);

    Object updateDraftMessageModel(@NotNull String str, DraftMessageModel draftMessageModel, @NotNull Continuation<? super Unit> continuation);

    Object updateEntityInfo(@NotNull String str, String str2, String str3, String str4, String str5, List<Integer> list, String str6, Integer num, @NotNull Continuation<? super Unit> continuation);

    Object updateInGroupStatus(@NotNull String str, int i, @NotNull Continuation<? super Unit> continuation);

    Object updateIsFlagged(@NotNull String str, int i, @NotNull Continuation<? super Unit> continuation);

    Object updateIsNoDisturb(@NotNull String str, int i, @NotNull Continuation<? super Unit> continuation);

    Object updateIsTop(@NotNull String str, int i, @NotNull Continuation<? super Unit> continuation);

    Object updateLocalLastUserMsg(@NotNull String str, long j, @NotNull String str2, @NotNull Continuation<? super Unit> continuation);

    public static final class Application {
        public static final /* synthetic */ Application copydefault = new Application();

        private Application() {
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static String copydefault(@NotNull InHouseIMConversationDao inHouseIMConversationDao) {
            return "InHouseIMConversationDao";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flow getAllConversationsFlow$default(InHouseIMConversationDao inHouseIMConversationDao, List list, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllConversationsFlow");
            }
            if ((i2 & 1) != 0) {
                list = C44179sGf.AEQbTJ.KWHzl();
            }
            if ((i2 & 2) != 0) {
                i = ConversationStatus.FOREVER_HIDDEN.getValue();
            }
            return inHouseIMConversationDao.getAllConversationsFlow(list, i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flow getConversationsByPageFlow$default(InHouseIMConversationDao inHouseIMConversationDao, int i, List list, int i2, boolean z, Boolean bool, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConversationsByPageFlow");
            }
            if ((i3 & 2) != 0) {
                list = C44179sGf.AEQbTJ.KWHzl();
            }
            List list2 = list;
            if ((i3 & 4) != 0) {
                i2 = ConversationStatus.FOREVER_HIDDEN.getValue();
            }
            int i4 = i2;
            if ((i3 & 8) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i3 & 16) != 0) {
                bool = Boolean.FALSE;
            }
            return inHouseIMConversationDao.getConversationsByPageFlow(i, list2, i4, z2, bool);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object getConversationsCount$default(InHouseIMConversationDao inHouseIMConversationDao, List list, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConversationsCount");
            }
            if ((i2 & 1) != 0) {
                list = C44179sGf.AEQbTJ.KWHzl();
            }
            if ((i2 & 2) != 0) {
                i = ConversationStatus.FOREVER_HIDDEN.getValue();
            }
            return inHouseIMConversationDao.getConversationsCount(list, i, continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flow getConversationCountWithoutNotificationFlow$default(InHouseIMConversationDao inHouseIMConversationDao, List list, int i, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConversationCountWithoutNotificationFlow");
            }
            if ((i3 & 1) != 0) {
                list = C44179sGf.AEQbTJ.KWHzl();
            }
            if ((i3 & 2) != 0) {
                i = InHouseIMChannelType.SystemNotification.getApiValue();
            }
            if ((i3 & 4) != 0) {
                i2 = ConversationStatus.FOREVER_HIDDEN.getValue();
            }
            return inHouseIMConversationDao.getConversationCountWithoutNotificationFlow(list, i, i2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object getAllChannelIdsForSync$default(InHouseIMConversationDao inHouseIMConversationDao, List list, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllChannelIdsForSync");
            }
            if ((i & 1) != 0) {
                list = C44179sGf.AEQbTJ.AEQbTJ();
            }
            return inHouseIMConversationDao.getAllChannelIdsForSync(list, continuation);
        }

        public static /* synthetic */ Flow getAllRelatedIdsFlow$default(InHouseIMConversationDao inHouseIMConversationDao, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllRelatedIdsFlow");
            }
            if ((i2 & 1) != 0) {
                i = InHouseIMChannelType.Individual.getApiValue();
            }
            return inHouseIMConversationDao.getAllRelatedIdsFlow(i);
        }

        public static /* synthetic */ Object getAllOKAssistantChannelIds$default(InHouseIMConversationDao inHouseIMConversationDao, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllOKAssistantChannelIds");
            }
            if ((i2 & 1) != 0) {
                i = GroupTagType.OK_ASSISTANT.getValue();
            }
            return inHouseIMConversationDao.getAllOKAssistantChannelIds(i, continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flow getTotalUnreadCountFlow$default(InHouseIMConversationDao inHouseIMConversationDao, int i, List list, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTotalUnreadCountFlow");
            }
            if ((i3 & 2) != 0) {
                list = C44179sGf.AEQbTJ.KWHzl();
            }
            if ((i3 & 4) != 0) {
                i2 = ConversationStatus.FOREVER_HIDDEN.getValue();
            }
            return inHouseIMConversationDao.getTotalUnreadCountFlow(i, list, i2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flow getTotalNumberOfConversationsWithUnreadCountFlow$default(InHouseIMConversationDao inHouseIMConversationDao, int i, List list, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTotalNumberOfConversationsWithUnreadCountFlow");
            }
            if ((i3 & 1) != 0) {
                i = ReceiveMessageOptionType.RECEIVE.getApiValue();
            }
            if ((i3 & 2) != 0) {
                list = C44179sGf.AEQbTJ.KWHzl();
            }
            if ((i3 & 4) != 0) {
                i2 = ConversationStatus.FOREVER_HIDDEN.getValue();
            }
            return inHouseIMConversationDao.getTotalNumberOfConversationsWithUnreadCountFlow(i, list, i2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flow getTotalNumberOfConversationsWithFlaggedCountFlow$default(InHouseIMConversationDao inHouseIMConversationDao, List list, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTotalNumberOfConversationsWithFlaggedCountFlow");
            }
            if ((i2 & 1) != 0) {
                list = C44179sGf.AEQbTJ.KWHzl();
            }
            if ((i2 & 2) != 0) {
                i = ConversationStatus.FOREVER_HIDDEN.getValue();
            }
            return inHouseIMConversationDao.getTotalNumberOfConversationsWithFlaggedCountFlow(list, i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flow getFlaggedConversationsWithUnreadCountFlow$default(InHouseIMConversationDao inHouseIMConversationDao, int i, List list, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFlaggedConversationsWithUnreadCountFlow");
            }
            if ((i3 & 1) != 0) {
                i = ReceiveMessageOptionType.RECEIVE.getApiValue();
            }
            if ((i3 & 2) != 0) {
                list = C44179sGf.AEQbTJ.KWHzl();
            }
            if ((i3 & 4) != 0) {
                i2 = ConversationStatus.FOREVER_HIDDEN.getValue();
            }
            return inHouseIMConversationDao.getFlaggedConversationsWithUnreadCountFlow(i, list, i2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object getTotalUnreadCount$default(InHouseIMConversationDao inHouseIMConversationDao, int i, List list, int i2, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTotalUnreadCount");
            }
            if ((i3 & 2) != 0) {
                list = C44179sGf.AEQbTJ.KWHzl();
            }
            if ((i3 & 4) != 0) {
                i2 = ConversationStatus.FOREVER_HIDDEN.getValue();
            }
            return inHouseIMConversationDao.getTotalUnreadCount(i, list, i2, continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flow getConversationTotalUnreadCountFlow$default(InHouseIMConversationDao inHouseIMConversationDao, int i, List list, int i2, List list2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConversationTotalUnreadCountFlow");
            }
            if ((i3 & 1) != 0) {
                i = ReceiveMessageOptionType.RECEIVE_SILENTLY.getApiValue();
            }
            if ((i3 & 2) != 0) {
                list = C44179sGf.AEQbTJ.KWHzl();
            }
            if ((i3 & 4) != 0) {
                i2 = ConversationStatus.FOREVER_HIDDEN.getValue();
            }
            if ((i3 & 8) != 0) {
                list2 = C44179sGf.AEQbTJ.copydefault();
            }
            return inHouseIMConversationDao.getConversationTotalUnreadCountFlow(i, list, i2, list2);
        }

        public static /* synthetic */ Flow getSystemNotificationTotalUnreadCount$default(InHouseIMConversationDao inHouseIMConversationDao, int i, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSystemNotificationTotalUnreadCount");
            }
            if ((i2 & 1) != 0) {
                i = InHouseIMChannelType.SystemNotification.getApiValue();
            }
            return inHouseIMConversationDao.getSystemNotificationTotalUnreadCount(i);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flow getTotalUnreadCountByChannelTypeFlow$default(InHouseIMConversationDao inHouseIMConversationDao, int i, List list, int i2, List list2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTotalUnreadCountByChannelTypeFlow");
            }
            if ((i3 & 2) != 0) {
                list = C44179sGf.AEQbTJ.KWHzl();
            }
            if ((i3 & 4) != 0) {
                i2 = ConversationStatus.FOREVER_HIDDEN.getValue();
            }
            return inHouseIMConversationDao.getTotalUnreadCountByChannelTypeFlow(i, list, i2, list2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object getAllChannelsWithUnreadCount$default(InHouseIMConversationDao inHouseIMConversationDao, List list, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllChannelsWithUnreadCount");
            }
            if ((i2 & 1) != 0) {
                list = C44179sGf.AEQbTJ.KWHzl();
            }
            if ((i2 & 2) != 0) {
                i = ConversationStatus.FOREVER_HIDDEN.getValue();
            }
            return inHouseIMConversationDao.getAllChannelsWithUnreadCount(list, i, continuation);
        }

        public static /* synthetic */ Object updateEntityInfo$default(InHouseIMConversationDao inHouseIMConversationDao, String str, String str2, String str3, String str4, String str5, List list, String str6, Integer num, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return inHouseIMConversationDao.updateEntityInfo(str, str2, str3, (i & 8) != 0 ? null : str4, str5, list, str6, num, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateEntityInfo");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object deleteLiveStreamingConversations$default(InHouseIMConversationDao inHouseIMConversationDao, List list, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteLiveStreamingConversations");
            }
            if ((i & 1) != 0) {
                list = C44179sGf.AEQbTJ.OLrzqt();
            }
            return inHouseIMConversationDao.deleteLiveStreamingConversations(list, continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object searchConversationsWithLimit$default(InHouseIMConversationDao inHouseIMConversationDao, String str, int i, boolean z, boolean z2, boolean z3, List list, int i2, Continuation continuation, int i3, Object obj) {
            if (obj == null) {
                return inHouseIMConversationDao.searchConversationsWithLimit(str, i, z, z2, (i3 & 16) != 0 ? true : z3, (i3 & 32) != 0 ? C44179sGf.AEQbTJ.EZpvd() : list, (i3 & 64) != 0 ? ConversationStatus.FOREVER_HIDDEN.getValue() : i2, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchConversationsWithLimit");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object searchConversations$default(InHouseIMConversationDao inHouseIMConversationDao, String str, boolean z, boolean z2, boolean z3, List list, int i, Continuation continuation, int i2, Object obj) {
            if (obj == null) {
                return inHouseIMConversationDao.searchConversations(str, z, z2, (i2 & 8) != 0 ? true : z3, (i2 & 16) != 0 ? C44179sGf.AEQbTJ.EZpvd() : list, (i2 & 32) != 0 ? ConversationStatus.FOREVER_HIDDEN.getValue() : i, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchConversations");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object searchGroupsWithLimit$default(InHouseIMConversationDao inHouseIMConversationDao, String str, int i, List list, int i2, Continuation continuation, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchGroupsWithLimit");
            }
            if ((i3 & 4) != 0) {
                list = C44179sGf.AEQbTJ.EZpvd();
            }
            List list2 = list;
            if ((i3 & 8) != 0) {
                i2 = ConversationStatus.FOREVER_HIDDEN.getValue();
            }
            return inHouseIMConversationDao.searchGroupsWithLimit(str, i, list2, i2, continuation);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object searchGroups$default(InHouseIMConversationDao inHouseIMConversationDao, String str, List list, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchGroups");
            }
            if ((i2 & 2) != 0) {
                list = C44179sGf.AEQbTJ.EZpvd();
            }
            if ((i2 & 4) != 0) {
                i = ConversationStatus.FOREVER_HIDDEN.getValue();
            }
            return inHouseIMConversationDao.searchGroups(str, list, i, continuation);
        }
    }
}
