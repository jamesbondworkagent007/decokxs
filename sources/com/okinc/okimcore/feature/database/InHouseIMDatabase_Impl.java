package com.okinc.okimcore.feature.database;

import androidx.annotation.NonNull;
import androidx.room.InvalidationTracker;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.okimcore.feature.contact.repository.local.inhouseim.InHouseIMContactDao;
import com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationDao;
import com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationSimpleInfoDao;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupInfoDao;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupMemberDao;
import com.okinc.okimcore.feature.group.repository.local.InHouseIMGroupSettingDao;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageDao;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageHandlingDao;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageTagsDao;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.phoneentities.PhoneRelationEntityDao;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.reactionemoji.EmojiReactionDao;
import com.okinc.okimcore.stickers.local.StickerPacksDao;
import com.okinc.okimcore.stickers.local.StickersDao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.C44183sGj;
import o.C44240sIm;
import o.C44242sIo;
import o.C44246sIs;
import o.C44247sIt;
import o.C44248sIu;
import o.C44249sIv;
import o.C44250sIw;
import o.C44251sIx;
import o.C44253sIz;
import o.C44273sJs;
import o.C44279sJy;
import o.C44339sMd;
import o.C44344sMi;
import o.C44361sMz;
import o.C44495sRy;
import o.sGT;
import o.sHQ;
import o.sJF;
import o.sKW;
import o.sLV;
import o.sRB;

/* JADX INFO: loaded from: classes24.dex */
public final class InHouseIMDatabase_Impl extends InHouseIMDatabase {
    public volatile EmojiReactionDao AEQbTJ;
    public volatile InHouseIMMessageHandlingDao AYXKKw;
    public volatile InHouseIMMessageTagsDao AhwBna;
    public volatile StickersDao AkhnZx;
    public volatile PhoneRelationEntityDao DbNXlk;
    public volatile InHouseIMContactDao EZpvd;
    public volatile InHouseIMConversationSimpleInfoDao KWHzl;
    public volatile InHouseIMConversationDao OLrzqt;
    public volatile InHouseIMGroupInfoDao copydefault;
    public volatile InHouseIMGroupMemberDao djBIcL;
    public volatile InHouseIMGroupSettingDao gEmmrt;
    public volatile InHouseIMMessageDao valueOf;
    public volatile StickerPacksDao values;

    /* JADX DEBUG: Method merged with bridge method: createOpenDelegate()Landroidx/room/RoomOpenDelegateMarker; */
    @Override // androidx.room.RoomDatabase
    /* JADX INFO: renamed from: values, reason: merged with bridge method [inline-methods] */
    public RoomOpenDelegate createOpenDelegate() {
        return new RoomOpenDelegate(36, "a0d91aa954fbce06c073713fadf28b5f", "d033fb9013c1df7b17ac272240eb82cd") { // from class: com.okinc.okimcore.feature.database.InHouseIMDatabase_Impl.1
            @Override // androidx.room.RoomOpenDelegate
            public void onCreate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPostMigrate(@NonNull SQLiteConnection sQLiteConnection) {
            }

            @Override // androidx.room.RoomOpenDelegate
            public void createAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `conversation_simple_info` (`channelId` TEXT NOT NULL, `lastMsgTime` TEXT NOT NULL, `pinnedStatus` INTEGER NOT NULL, `isFlagged` INTEGER NOT NULL DEFAULT 0, `inGroupStatus` TEXT, `lastReadMsgSeq` TEXT, `startMsgSeq` TEXT, `endMsgSeq` TEXT, `updateTime` TEXT, PRIMARY KEY(`channelId`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `conversation` (`channelId` TEXT NOT NULL, `channelType` INTEGER, `groupAtType` INTEGER NOT NULL, `inGroupStatus` INTEGER, `groupStatus` INTEGER, `pinnedStatus` INTEGER NOT NULL, `isFlagged` INTEGER NOT NULL DEFAULT 0, `muteStatus` INTEGER, `role` INTEGER NOT NULL, `unreadCount` INTEGER NOT NULL DEFAULT 0, `unreadMentionedCount` INTEGER NOT NULL DEFAULT 0, `unreadMentionedType` INTEGER, `startMsgSeq` INTEGER, `lastReadMsgSeq` INTEGER, `extra` TEXT, `lastUserMessageId` TEXT, `lastUserMessageSendTime` INTEGER NOT NULL DEFAULT 0, `draftMessage` TEXT, `updateTime` TEXT, `conversationStatus` INTEGER, `relatedId` TEXT, `avatar` TEXT, `nickname` TEXT, `enNickname` TEXT, `bizGroupName` TEXT, `tags` TEXT, `groupType` INTEGER, `conversationIcons` TEXT, `entityInfoExtra` TEXT, PRIMARY KEY(`channelId`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `contacts` (`contactUid` TEXT NOT NULL, `channelId` TEXT, `relationType` TEXT NOT NULL, `remarkName` TEXT, `nickname` TEXT, `enNickname` TEXT, `avatar` TEXT, `userUid` TEXT NOT NULL, `tags` TEXT, `blacklisted` INTEGER, `relationSourceType` TEXT, `relationPermission` TEXT, `phoneHash` TEXT, `customNote` TEXT, `orbitBackgroundImage` TEXT, `orbitStatus` INTEGER, PRIMARY KEY(`contactUid`))");
                SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_contacts_channelId` ON `contacts` (`channelId`)");
                SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_contacts_remarkName` ON `contacts` (`remarkName`)");
                SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_contacts_nickname` ON `contacts` (`nickname`)");
                SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_contacts_enNickname` ON `contacts` (`enNickname`)");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `message` (`messageId` TEXT NOT NULL, `channelId` TEXT NOT NULL, `senderUid` TEXT NOT NULL, `seq` INTEGER NOT NULL, `senderPlatformType` INTEGER NOT NULL, `contentType` INTEGER NOT NULL, `channelType` INTEGER NOT NULL, `isRead` INTEGER, `isVisible` INTEGER, `sendTime` INTEGER NOT NULL, `shouldIncludeInUnreadCount` INTEGER, `extra` TEXT, `status` INTEGER, `sentStatus` INTEGER NOT NULL DEFAULT 0, `receiveTime` INTEGER, `isRecalled` INTEGER NOT NULL DEFAULT 0, `isMentionMe` INTEGER NOT NULL DEFAULT 0, `isReceiveReadReceipt` INTEGER, `textContent` TEXT, `atUserList` TEXT, `atType` INTEGER, `urlList` TEXT, `siteMeta` TEXT, `messageTextWithoutTagContent` TEXT, `fileId` TEXT, `urlPathCn` TEXT, `urlPathDefault` TEXT, `mediaThumbnail` TEXT, `mediaWidth` INTEGER, `mediaHeight` INTEGER, `mediaDuration` INTEGER, `mediaSize` INTEGER, `localUri` TEXT, `fileName` TEXT, `fileExtension` TEXT, `callType` INTEGER, `callStatus` INTEGER, `callDuration` INTEGER, `callerUid` TEXT, `replySeq` INTEGER, `quotedMessage` TEXT, `customMessage` TEXT, `systemMessage` TEXT, `shareMessage` TEXT, `streamPlaceholderMessage` TEXT, `stickerId` TEXT, `stickerPath` TEXT, `readReceiptSequence` INTEGER, `recallMessage` TEXT, `invitationId` TEXT, `groupInvitationGroupId` TEXT, `groupInviterUid` TEXT, `groupInviteExpireTime` INTEGER, `groupInviteName` TEXT, `groupInviteAvatar` TEXT, `senderNickname` TEXT, `senderAvatar` TEXT, `senderEnNickName` TEXT, `lookupSeq` INTEGER, `frontendOption` TEXT, `reactionUpdateTime` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`messageId`), FOREIGN KEY(`channelId`) REFERENCES `conversation`(`channelId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_message_channelId_seq` ON `message` (`channelId`, `seq`)");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `message_tag` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `messageId` TEXT NOT NULL, `atUserId` TEXT NOT NULL, FOREIGN KEY(`messageId`) REFERENCES `message`(`messageId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_message_tag_messageId` ON `message_tag` (`messageId`)");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `group_member` (`member_id` TEXT NOT NULL, `group_id` TEXT NOT NULL, `invite_id` TEXT NOT NULL, `role` INTEGER NOT NULL, `name` TEXT NOT NULL, `nick_name` TEXT NOT NULL, `member_avatar` TEXT NOT NULL, `status` INTEGER NOT NULL, `create_time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `v1` TEXT NOT NULL, `v2` TEXT NOT NULL, `v3` TEXT NOT NULL, `officialTagInfo` TEXT, `paidGroupMemberStatus_paymentRequiredStatus` TEXT, `paidGroupMemberStatus_lastPaymentDatetime` INTEGER, `paidGroupMemberStatus_nextPaymentDatetime` INTEGER, `paidGroupMemberStatus_paidGroupBillingStatus` TEXT, `paidGroupMemberStatus_billingCyclePaymentStatus` TEXT, PRIMARY KEY(`member_id`, `group_id`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `in_house_im_group` (`group_id` TEXT NOT NULL, `group_master_id` TEXT NOT NULL, `group_name` TEXT NOT NULL, `biz_group_name` TEXT, `group_avatar` TEXT NOT NULL, `group_notice` TEXT NOT NULL, `noticeEditTime` INTEGER NOT NULL, `group_desc` TEXT NOT NULL, `is_store` INTEGER NOT NULL, `is_verify` INTEGER NOT NULL, `is_asset` INTEGER NOT NULL, `is_pay` INTEGER NOT NULL, `asset_currency_id` INTEGER, `asset_currency_symbol` TEXT, `asset_amount` REAL, `pay_currency_id` INTEGER, `pay_currency_symbol` TEXT, `pay_amount` REAL, `status` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `create_time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `group_count` INTEGER NOT NULL, `v1` TEXT NOT NULL, `v2` TEXT NOT NULL, `v3` TEXT NOT NULL, `allowMentionOthers` INTEGER, `isCanTransferOwnership` INTEGER, `type` INTEGER, `userGroupPermission` TEXT, `groupVoiceCallConfig` TEXT, `allowMembersToAddMembers` INTEGER, `allowSharingInvitationQrCode` INTEGER, `requireAdminApprovalToJoin` INTEGER, `pendingJoinRequests` INTEGER, `maxMemberCount` INTEGER, `public_group_type` TEXT, `paidGroupInfo_outstandingAmount` TEXT, `paidGroupInfo_billingModel_enabled` TEXT, `paidGroupInfo_billingModel_currencyId` INTEGER, `paidGroupInfo_billingModel_currencyCode` TEXT, `paidGroupInfo_billingModel_currencySign` TEXT, `paidGroupInfo_billingModel_amount` TEXT, `paidGroupInfo_billingModel_billingType` TEXT, `paidGroupInfo_paidGroupMemberStatus_paymentRequiredStatus` TEXT, `paidGroupInfo_paidGroupMemberStatus_lastPaymentDatetime` INTEGER, `paidGroupInfo_paidGroupMemberStatus_nextPaymentDatetime` INTEGER, `paidGroupInfo_paidGroupMemberStatus_paidGroupBillingStatus` TEXT, `paidGroupInfo_paidGroupMemberStatus_billingCyclePaymentStatus` TEXT, `campaign_activityId` INTEGER, `campaign_urlSlug` TEXT, `campaign_urlSubPath` TEXT, `campaign_campaignStartTime` TEXT, `campaign_campaignEndTime` TEXT, `campaign_registrationStartTime` TEXT, `campaign_minAppVersion` TEXT, `superGroupConfig_showSuperGroupUpgradeStatus` INTEGER, `superGroupConfig_orbiterPlusExpiryTimestamp` INTEGER, `superGroupConfig_capacity` INTEGER, PRIMARY KEY(`group_id`))");
                SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_in_house_im_group_group_name` ON `in_house_im_group` (`group_name`)");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `group_setting` (`group_id` TEXT NOT NULL, `group_nick_name` TEXT, `user_nick_name` TEXT, `role` INTEGER NOT NULL, `is_no_disturb` INTEGER NOT NULL, `is_top` INTEGER NOT NULL, PRIMARY KEY(`group_id`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `reference_message` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `channelId` TEXT NOT NULL, `sequence` INTEGER NOT NULL, `content` TEXT, `type` INTEGER NOT NULL, `priority` INTEGER NOT NULL, `referenceSequence` INTEGER NOT NULL, `replaceMessage` TEXT, `replaceMessageType` INTEGER, `visibility` INTEGER, `strategyUids` TEXT, `isCurrentUserInStrategy` INTEGER NOT NULL)");
                SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_reference_message_channelId_sequence` ON `reference_message` (`channelId`, `sequence`)");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `phone_relations` (`hash` TEXT NOT NULL, `rowId` TEXT NOT NULL, `countryCode` TEXT, `isSynced` INTEGER NOT NULL, `phoneRelationId` TEXT NOT NULL, `okxRelationId` TEXT, `name` TEXT, `rawNumber` TEXT NOT NULL, `nationalNumber` TEXT NOT NULL, PRIMARY KEY(`hash`))");
                SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_phone_relations_rowId_isSynced_okxRelationId_rawNumber` ON `phone_relations` (`rowId`, `isSynced`, `okxRelationId`, `rawNumber`)");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `im_sticker` (`stickerId` TEXT NOT NULL, `packId` TEXT NOT NULL, `position` INTEGER NOT NULL, `path` TEXT NOT NULL, PRIMARY KEY(`stickerId`, `packId`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `im_sticker_packs` (`packId` TEXT NOT NULL, `title` TEXT NOT NULL, `pathDay` TEXT, `pathNight` TEXT, `position` INTEGER NOT NULL, PRIMARY KEY(`packId`))");
                SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `emoji_reaction` (`emojiReactionId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `messageId` TEXT NOT NULL, `emoji` TEXT NOT NULL, `reactorReactionTime` INTEGER NOT NULL, `reactorUserId` TEXT NOT NULL, `isCurrentUserReaction` INTEGER NOT NULL, FOREIGN KEY(`messageId`) REFERENCES `message`(`messageId`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                SQLite.execSQL(sQLiteConnection, "CREATE INDEX IF NOT EXISTS `index_emoji_reaction_messageId` ON `emoji_reaction` (`messageId`)");
                SQLite.execSQL(sQLiteConnection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_emoji_reaction_messageId_emoji_reactorUserId_reactorReactionTime` ON `emoji_reaction` (`messageId`, `emoji`, `reactorUserId`, `reactorReactionTime`)");
                SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
                SQLite.execSQL(sQLiteConnection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a0d91aa954fbce06c073713fadf28b5f')");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void dropAllTables(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `conversation_simple_info`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `conversation`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `contacts`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `message`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `message_tag`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `group_member`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `in_house_im_group`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `group_setting`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `reference_message`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `phone_relations`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `im_sticker`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `im_sticker_packs`");
                SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `emoji_reaction`");
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onOpen(@NonNull SQLiteConnection sQLiteConnection) {
                SQLite.execSQL(sQLiteConnection, "PRAGMA foreign_keys = ON");
                InHouseIMDatabase_Impl.this.internalInitInvalidationTracker(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public void onPreMigrate(@NonNull SQLiteConnection sQLiteConnection) {
                DBUtil.dropFtsSyncTriggers(sQLiteConnection);
            }

            @Override // androidx.room.RoomOpenDelegate
            public RoomOpenDelegate.ValidationResult onValidateSchema(@NonNull SQLiteConnection sQLiteConnection) {
                HashMap map = new HashMap(9);
                map.put(RemoteMessageConst.Notification.CHANNEL_ID, new TableInfo.Column(RemoteMessageConst.Notification.CHANNEL_ID, "TEXT", true, 1, null, 1));
                map.put("lastMsgTime", new TableInfo.Column("lastMsgTime", "TEXT", true, 0, null, 1));
                map.put("pinnedStatus", new TableInfo.Column("pinnedStatus", "INTEGER", true, 0, null, 1));
                map.put("isFlagged", new TableInfo.Column("isFlagged", "INTEGER", true, 0, "0", 1));
                map.put("inGroupStatus", new TableInfo.Column("inGroupStatus", "TEXT", false, 0, null, 1));
                map.put("lastReadMsgSeq", new TableInfo.Column("lastReadMsgSeq", "TEXT", false, 0, null, 1));
                map.put("startMsgSeq", new TableInfo.Column("startMsgSeq", "TEXT", false, 0, null, 1));
                map.put("endMsgSeq", new TableInfo.Column("endMsgSeq", "TEXT", false, 0, null, 1));
                map.put("updateTime", new TableInfo.Column("updateTime", "TEXT", false, 0, null, 1));
                TableInfo tableInfo = new TableInfo("conversation_simple_info", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(sQLiteConnection, "conversation_simple_info");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenDelegate.ValidationResult(false, "conversation_simple_info(com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationSimpleInfoEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                HashMap map2 = new HashMap(29);
                map2.put(RemoteMessageConst.Notification.CHANNEL_ID, new TableInfo.Column(RemoteMessageConst.Notification.CHANNEL_ID, "TEXT", true, 1, null, 1));
                map2.put("channelType", new TableInfo.Column("channelType", "INTEGER", false, 0, null, 1));
                map2.put("groupAtType", new TableInfo.Column("groupAtType", "INTEGER", true, 0, null, 1));
                map2.put("inGroupStatus", new TableInfo.Column("inGroupStatus", "INTEGER", false, 0, null, 1));
                map2.put("groupStatus", new TableInfo.Column("groupStatus", "INTEGER", false, 0, null, 1));
                map2.put("pinnedStatus", new TableInfo.Column("pinnedStatus", "INTEGER", true, 0, null, 1));
                map2.put("isFlagged", new TableInfo.Column("isFlagged", "INTEGER", true, 0, "0", 1));
                map2.put("muteStatus", new TableInfo.Column("muteStatus", "INTEGER", false, 0, null, 1));
                map2.put("role", new TableInfo.Column("role", "INTEGER", true, 0, null, 1));
                map2.put("unreadCount", new TableInfo.Column("unreadCount", "INTEGER", true, 0, "0", 1));
                map2.put("unreadMentionedCount", new TableInfo.Column("unreadMentionedCount", "INTEGER", true, 0, "0", 1));
                map2.put("unreadMentionedType", new TableInfo.Column("unreadMentionedType", "INTEGER", false, 0, null, 1));
                map2.put("startMsgSeq", new TableInfo.Column("startMsgSeq", "INTEGER", false, 0, null, 1));
                map2.put("lastReadMsgSeq", new TableInfo.Column("lastReadMsgSeq", "INTEGER", false, 0, null, 1));
                map2.put(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, new TableInfo.Column(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, "TEXT", false, 0, null, 1));
                map2.put("lastUserMessageId", new TableInfo.Column("lastUserMessageId", "TEXT", false, 0, null, 1));
                map2.put("lastUserMessageSendTime", new TableInfo.Column("lastUserMessageSendTime", "INTEGER", true, 0, "0", 1));
                map2.put("draftMessage", new TableInfo.Column("draftMessage", "TEXT", false, 0, null, 1));
                map2.put("updateTime", new TableInfo.Column("updateTime", "TEXT", false, 0, null, 1));
                map2.put("conversationStatus", new TableInfo.Column("conversationStatus", "INTEGER", false, 0, null, 1));
                map2.put("relatedId", new TableInfo.Column("relatedId", "TEXT", false, 0, null, 1));
                map2.put("avatar", new TableInfo.Column("avatar", "TEXT", false, 0, null, 1));
                map2.put("nickname", new TableInfo.Column("nickname", "TEXT", false, 0, null, 1));
                map2.put("enNickname", new TableInfo.Column("enNickname", "TEXT", false, 0, null, 1));
                map2.put("bizGroupName", new TableInfo.Column("bizGroupName", "TEXT", false, 0, null, 1));
                map2.put("tags", new TableInfo.Column("tags", "TEXT", false, 0, null, 1));
                map2.put("groupType", new TableInfo.Column("groupType", "INTEGER", false, 0, null, 1));
                map2.put("conversationIcons", new TableInfo.Column("conversationIcons", "TEXT", false, 0, null, 1));
                map2.put("entityInfoExtra", new TableInfo.Column("entityInfoExtra", "TEXT", false, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("conversation", map2, new HashSet(0), new HashSet(0));
                TableInfo tableInfo4 = TableInfo.read(sQLiteConnection, "conversation");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenDelegate.ValidationResult(false, "conversation(com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                HashMap map3 = new HashMap(16);
                map3.put("contactUid", new TableInfo.Column("contactUid", "TEXT", true, 1, null, 1));
                map3.put(RemoteMessageConst.Notification.CHANNEL_ID, new TableInfo.Column(RemoteMessageConst.Notification.CHANNEL_ID, "TEXT", false, 0, null, 1));
                map3.put("relationType", new TableInfo.Column("relationType", "TEXT", true, 0, null, 1));
                map3.put("remarkName", new TableInfo.Column("remarkName", "TEXT", false, 0, null, 1));
                map3.put("nickname", new TableInfo.Column("nickname", "TEXT", false, 0, null, 1));
                map3.put("enNickname", new TableInfo.Column("enNickname", "TEXT", false, 0, null, 1));
                map3.put("avatar", new TableInfo.Column("avatar", "TEXT", false, 0, null, 1));
                map3.put("userUid", new TableInfo.Column("userUid", "TEXT", true, 0, null, 1));
                map3.put("tags", new TableInfo.Column("tags", "TEXT", false, 0, null, 1));
                map3.put("blacklisted", new TableInfo.Column("blacklisted", "INTEGER", false, 0, null, 1));
                map3.put("relationSourceType", new TableInfo.Column("relationSourceType", "TEXT", false, 0, null, 1));
                map3.put("relationPermission", new TableInfo.Column("relationPermission", "TEXT", false, 0, null, 1));
                map3.put("phoneHash", new TableInfo.Column("phoneHash", "TEXT", false, 0, null, 1));
                map3.put("customNote", new TableInfo.Column("customNote", "TEXT", false, 0, null, 1));
                map3.put("orbitBackgroundImage", new TableInfo.Column("orbitBackgroundImage", "TEXT", false, 0, null, 1));
                map3.put("orbitStatus", new TableInfo.Column("orbitStatus", "INTEGER", false, 0, null, 1));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(4);
                hashSet2.add(new TableInfo.Index("index_contacts_channelId", false, Arrays.asList(RemoteMessageConst.Notification.CHANNEL_ID), Arrays.asList("ASC")));
                hashSet2.add(new TableInfo.Index("index_contacts_remarkName", false, Arrays.asList("remarkName"), Arrays.asList("ASC")));
                hashSet2.add(new TableInfo.Index("index_contacts_nickname", false, Arrays.asList("nickname"), Arrays.asList("ASC")));
                hashSet2.add(new TableInfo.Index("index_contacts_enNickname", false, Arrays.asList("enNickname"), Arrays.asList("ASC")));
                TableInfo tableInfo5 = new TableInfo("contacts", map3, hashSet, hashSet2);
                TableInfo tableInfo6 = TableInfo.read(sQLiteConnection, "contacts");
                if (!tableInfo5.equals(tableInfo6)) {
                    return new RoomOpenDelegate.ValidationResult(false, "contacts(com.okinc.okimcore.model.room.inhouseim.InHouseIMContactInfoEntity).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
                }
                HashMap map4 = new HashMap(61);
                map4.put("messageId", new TableInfo.Column("messageId", "TEXT", true, 1, null, 1));
                map4.put(RemoteMessageConst.Notification.CHANNEL_ID, new TableInfo.Column(RemoteMessageConst.Notification.CHANNEL_ID, "TEXT", true, 0, null, 1));
                map4.put("senderUid", new TableInfo.Column("senderUid", "TEXT", true, 0, null, 1));
                map4.put("seq", new TableInfo.Column("seq", "INTEGER", true, 0, null, 1));
                map4.put("senderPlatformType", new TableInfo.Column("senderPlatformType", "INTEGER", true, 0, null, 1));
                map4.put("contentType", new TableInfo.Column("contentType", "INTEGER", true, 0, null, 1));
                map4.put("channelType", new TableInfo.Column("channelType", "INTEGER", true, 0, null, 1));
                map4.put("isRead", new TableInfo.Column("isRead", "INTEGER", false, 0, null, 1));
                map4.put("isVisible", new TableInfo.Column("isVisible", "INTEGER", false, 0, null, 1));
                map4.put(RemoteMessageConst.SEND_TIME, new TableInfo.Column(RemoteMessageConst.SEND_TIME, "INTEGER", true, 0, null, 1));
                map4.put("shouldIncludeInUnreadCount", new TableInfo.Column("shouldIncludeInUnreadCount", "INTEGER", false, 0, null, 1));
                map4.put(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, new TableInfo.Column(MTAnalysisConstants.ACCOUNT_EXTRA_ATTR, "TEXT", false, 0, null, 1));
                map4.put("status", new TableInfo.Column("status", "INTEGER", false, 0, null, 1));
                map4.put("sentStatus", new TableInfo.Column("sentStatus", "INTEGER", true, 0, "0", 1));
                map4.put("receiveTime", new TableInfo.Column("receiveTime", "INTEGER", false, 0, null, 1));
                map4.put("isRecalled", new TableInfo.Column("isRecalled", "INTEGER", true, 0, "0", 1));
                map4.put("isMentionMe", new TableInfo.Column("isMentionMe", "INTEGER", true, 0, "0", 1));
                map4.put("isReceiveReadReceipt", new TableInfo.Column("isReceiveReadReceipt", "INTEGER", false, 0, null, 1));
                map4.put("textContent", new TableInfo.Column("textContent", "TEXT", false, 0, null, 1));
                map4.put("atUserList", new TableInfo.Column("atUserList", "TEXT", false, 0, null, 1));
                map4.put("atType", new TableInfo.Column("atType", "INTEGER", false, 0, null, 1));
                map4.put("urlList", new TableInfo.Column("urlList", "TEXT", false, 0, null, 1));
                map4.put("siteMeta", new TableInfo.Column("siteMeta", "TEXT", false, 0, null, 1));
                map4.put("messageTextWithoutTagContent", new TableInfo.Column("messageTextWithoutTagContent", "TEXT", false, 0, null, 1));
                map4.put("fileId", new TableInfo.Column("fileId", "TEXT", false, 0, null, 1));
                map4.put("urlPathCn", new TableInfo.Column("urlPathCn", "TEXT", false, 0, null, 1));
                map4.put("urlPathDefault", new TableInfo.Column("urlPathDefault", "TEXT", false, 0, null, 1));
                map4.put("mediaThumbnail", new TableInfo.Column("mediaThumbnail", "TEXT", false, 0, null, 1));
                map4.put("mediaWidth", new TableInfo.Column("mediaWidth", "INTEGER", false, 0, null, 1));
                map4.put("mediaHeight", new TableInfo.Column("mediaHeight", "INTEGER", false, 0, null, 1));
                map4.put("mediaDuration", new TableInfo.Column("mediaDuration", "INTEGER", false, 0, null, 1));
                map4.put("mediaSize", new TableInfo.Column("mediaSize", "INTEGER", false, 0, null, 1));
                map4.put("localUri", new TableInfo.Column("localUri", "TEXT", false, 0, null, 1));
                map4.put("fileName", new TableInfo.Column("fileName", "TEXT", false, 0, null, 1));
                map4.put("fileExtension", new TableInfo.Column("fileExtension", "TEXT", false, 0, null, 1));
                map4.put("callType", new TableInfo.Column("callType", "INTEGER", false, 0, null, 1));
                map4.put("callStatus", new TableInfo.Column("callStatus", "INTEGER", false, 0, null, 1));
                map4.put("callDuration", new TableInfo.Column("callDuration", "INTEGER", false, 0, null, 1));
                map4.put("callerUid", new TableInfo.Column("callerUid", "TEXT", false, 0, null, 1));
                map4.put("replySeq", new TableInfo.Column("replySeq", "INTEGER", false, 0, null, 1));
                map4.put("quotedMessage", new TableInfo.Column("quotedMessage", "TEXT", false, 0, null, 1));
                map4.put("customMessage", new TableInfo.Column("customMessage", "TEXT", false, 0, null, 1));
                map4.put("systemMessage", new TableInfo.Column("systemMessage", "TEXT", false, 0, null, 1));
                map4.put("shareMessage", new TableInfo.Column("shareMessage", "TEXT", false, 0, null, 1));
                map4.put("streamPlaceholderMessage", new TableInfo.Column("streamPlaceholderMessage", "TEXT", false, 0, null, 1));
                map4.put("stickerId", new TableInfo.Column("stickerId", "TEXT", false, 0, null, 1));
                map4.put("stickerPath", new TableInfo.Column("stickerPath", "TEXT", false, 0, null, 1));
                map4.put("readReceiptSequence", new TableInfo.Column("readReceiptSequence", "INTEGER", false, 0, null, 1));
                map4.put("recallMessage", new TableInfo.Column("recallMessage", "TEXT", false, 0, null, 1));
                map4.put("invitationId", new TableInfo.Column("invitationId", "TEXT", false, 0, null, 1));
                map4.put("groupInvitationGroupId", new TableInfo.Column("groupInvitationGroupId", "TEXT", false, 0, null, 1));
                map4.put("groupInviterUid", new TableInfo.Column("groupInviterUid", "TEXT", false, 0, null, 1));
                map4.put("groupInviteExpireTime", new TableInfo.Column("groupInviteExpireTime", "INTEGER", false, 0, null, 1));
                map4.put("groupInviteName", new TableInfo.Column("groupInviteName", "TEXT", false, 0, null, 1));
                map4.put("groupInviteAvatar", new TableInfo.Column("groupInviteAvatar", "TEXT", false, 0, null, 1));
                map4.put("senderNickname", new TableInfo.Column("senderNickname", "TEXT", false, 0, null, 1));
                map4.put("senderAvatar", new TableInfo.Column("senderAvatar", "TEXT", false, 0, null, 1));
                map4.put("senderEnNickName", new TableInfo.Column("senderEnNickName", "TEXT", false, 0, null, 1));
                map4.put("lookupSeq", new TableInfo.Column("lookupSeq", "INTEGER", false, 0, null, 1));
                map4.put("frontendOption", new TableInfo.Column("frontendOption", "TEXT", false, 0, null, 1));
                map4.put("reactionUpdateTime", new TableInfo.Column("reactionUpdateTime", "INTEGER", true, 0, "0", 1));
                HashSet hashSet3 = new HashSet(1);
                hashSet3.add(new TableInfo.ForeignKey("conversation", "CASCADE", "NO ACTION", Arrays.asList(RemoteMessageConst.Notification.CHANNEL_ID), Arrays.asList(RemoteMessageConst.Notification.CHANNEL_ID)));
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new TableInfo.Index("index_message_channelId_seq", false, Arrays.asList(RemoteMessageConst.Notification.CHANNEL_ID, "seq"), Arrays.asList("ASC", "ASC")));
                TableInfo tableInfo7 = new TableInfo("message", map4, hashSet3, hashSet4);
                TableInfo tableInfo8 = TableInfo.read(sQLiteConnection, "message");
                if (!tableInfo7.equals(tableInfo8)) {
                    return new RoomOpenDelegate.ValidationResult(false, "message(com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
                }
                HashMap map5 = new HashMap(3);
                map5.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map5.put("messageId", new TableInfo.Column("messageId", "TEXT", true, 0, null, 1));
                map5.put("atUserId", new TableInfo.Column("atUserId", "TEXT", true, 0, null, 1));
                HashSet hashSet5 = new HashSet(1);
                hashSet5.add(new TableInfo.ForeignKey("message", "CASCADE", "NO ACTION", Arrays.asList("messageId"), Arrays.asList("messageId")));
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new TableInfo.Index("index_message_tag_messageId", false, Arrays.asList("messageId"), Arrays.asList("ASC")));
                TableInfo tableInfo9 = new TableInfo("message_tag", map5, hashSet5, hashSet6);
                TableInfo tableInfo10 = TableInfo.read(sQLiteConnection, "message_tag");
                if (!tableInfo9.equals(tableInfo10)) {
                    return new RoomOpenDelegate.ValidationResult(false, "message_tag(com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageTagsEntity).\n Expected:\n" + tableInfo9 + "\n Found:\n" + tableInfo10);
                }
                HashMap map6 = new HashMap(19);
                map6.put("member_id", new TableInfo.Column("member_id", "TEXT", true, 1, null, 1));
                map6.put("group_id", new TableInfo.Column("group_id", "TEXT", true, 2, null, 1));
                map6.put("invite_id", new TableInfo.Column("invite_id", "TEXT", true, 0, null, 1));
                map6.put("role", new TableInfo.Column("role", "INTEGER", true, 0, null, 1));
                map6.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
                map6.put("nick_name", new TableInfo.Column("nick_name", "TEXT", true, 0, null, 1));
                map6.put("member_avatar", new TableInfo.Column("member_avatar", "TEXT", true, 0, null, 1));
                map6.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, 1));
                map6.put("create_time", new TableInfo.Column("create_time", "INTEGER", true, 0, null, 1));
                map6.put("update_time", new TableInfo.Column("update_time", "INTEGER", true, 0, null, 1));
                map6.put("v1", new TableInfo.Column("v1", "TEXT", true, 0, null, 1));
                map6.put("v2", new TableInfo.Column("v2", "TEXT", true, 0, null, 1));
                map6.put("v3", new TableInfo.Column("v3", "TEXT", true, 0, null, 1));
                map6.put("officialTagInfo", new TableInfo.Column("officialTagInfo", "TEXT", false, 0, null, 1));
                map6.put("paidGroupMemberStatus_paymentRequiredStatus", new TableInfo.Column("paidGroupMemberStatus_paymentRequiredStatus", "TEXT", false, 0, null, 1));
                map6.put("paidGroupMemberStatus_lastPaymentDatetime", new TableInfo.Column("paidGroupMemberStatus_lastPaymentDatetime", "INTEGER", false, 0, null, 1));
                map6.put("paidGroupMemberStatus_nextPaymentDatetime", new TableInfo.Column("paidGroupMemberStatus_nextPaymentDatetime", "INTEGER", false, 0, null, 1));
                map6.put("paidGroupMemberStatus_paidGroupBillingStatus", new TableInfo.Column("paidGroupMemberStatus_paidGroupBillingStatus", "TEXT", false, 0, null, 1));
                map6.put("paidGroupMemberStatus_billingCyclePaymentStatus", new TableInfo.Column("paidGroupMemberStatus_billingCyclePaymentStatus", "TEXT", false, 0, null, 1));
                TableInfo tableInfo11 = new TableInfo("group_member", map6, new HashSet(0), new HashSet(0));
                TableInfo tableInfo12 = TableInfo.read(sQLiteConnection, "group_member");
                if (!tableInfo11.equals(tableInfo12)) {
                    return new RoomOpenDelegate.ValidationResult(false, "group_member(com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupMemberEntity).\n Expected:\n" + tableInfo11 + "\n Found:\n" + tableInfo12);
                }
                HashMap map7 = new HashMap(59);
                map7.put("group_id", new TableInfo.Column("group_id", "TEXT", true, 1, null, 1));
                map7.put("group_master_id", new TableInfo.Column("group_master_id", "TEXT", true, 0, null, 1));
                map7.put("group_name", new TableInfo.Column("group_name", "TEXT", true, 0, null, 1));
                map7.put("biz_group_name", new TableInfo.Column("biz_group_name", "TEXT", false, 0, null, 1));
                map7.put("group_avatar", new TableInfo.Column("group_avatar", "TEXT", true, 0, null, 1));
                map7.put("group_notice", new TableInfo.Column("group_notice", "TEXT", true, 0, null, 1));
                map7.put("noticeEditTime", new TableInfo.Column("noticeEditTime", "INTEGER", true, 0, null, 1));
                map7.put("group_desc", new TableInfo.Column("group_desc", "TEXT", true, 0, null, 1));
                map7.put("is_store", new TableInfo.Column("is_store", "INTEGER", true, 0, null, 1));
                map7.put("is_verify", new TableInfo.Column("is_verify", "INTEGER", true, 0, null, 1));
                map7.put("is_asset", new TableInfo.Column("is_asset", "INTEGER", true, 0, null, 1));
                map7.put("is_pay", new TableInfo.Column("is_pay", "INTEGER", true, 0, null, 1));
                map7.put("asset_currency_id", new TableInfo.Column("asset_currency_id", "INTEGER", false, 0, null, 1));
                map7.put("asset_currency_symbol", new TableInfo.Column("asset_currency_symbol", "TEXT", false, 0, null, 1));
                map7.put("asset_amount", new TableInfo.Column("asset_amount", "REAL", false, 0, null, 1));
                map7.put("pay_currency_id", new TableInfo.Column("pay_currency_id", "INTEGER", false, 0, null, 1));
                map7.put("pay_currency_symbol", new TableInfo.Column("pay_currency_symbol", "TEXT", false, 0, null, 1));
                map7.put("pay_amount", new TableInfo.Column("pay_amount", "REAL", false, 0, null, 1));
                map7.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, 1));
                map7.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, 1));
                map7.put("create_time", new TableInfo.Column("create_time", "INTEGER", true, 0, null, 1));
                map7.put("update_time", new TableInfo.Column("update_time", "INTEGER", true, 0, null, 1));
                map7.put("group_count", new TableInfo.Column("group_count", "INTEGER", true, 0, null, 1));
                map7.put("v1", new TableInfo.Column("v1", "TEXT", true, 0, null, 1));
                map7.put("v2", new TableInfo.Column("v2", "TEXT", true, 0, null, 1));
                map7.put("v3", new TableInfo.Column("v3", "TEXT", true, 0, null, 1));
                map7.put("allowMentionOthers", new TableInfo.Column("allowMentionOthers", "INTEGER", false, 0, null, 1));
                map7.put("isCanTransferOwnership", new TableInfo.Column("isCanTransferOwnership", "INTEGER", false, 0, null, 1));
                map7.put("type", new TableInfo.Column("type", "INTEGER", false, 0, null, 1));
                map7.put("userGroupPermission", new TableInfo.Column("userGroupPermission", "TEXT", false, 0, null, 1));
                map7.put("groupVoiceCallConfig", new TableInfo.Column("groupVoiceCallConfig", "TEXT", false, 0, null, 1));
                map7.put("allowMembersToAddMembers", new TableInfo.Column("allowMembersToAddMembers", "INTEGER", false, 0, null, 1));
                map7.put("allowSharingInvitationQrCode", new TableInfo.Column("allowSharingInvitationQrCode", "INTEGER", false, 0, null, 1));
                map7.put("requireAdminApprovalToJoin", new TableInfo.Column("requireAdminApprovalToJoin", "INTEGER", false, 0, null, 1));
                map7.put("pendingJoinRequests", new TableInfo.Column("pendingJoinRequests", "INTEGER", false, 0, null, 1));
                map7.put("maxMemberCount", new TableInfo.Column("maxMemberCount", "INTEGER", false, 0, null, 1));
                map7.put("public_group_type", new TableInfo.Column("public_group_type", "TEXT", false, 0, null, 1));
                map7.put("paidGroupInfo_outstandingAmount", new TableInfo.Column("paidGroupInfo_outstandingAmount", "TEXT", false, 0, null, 1));
                map7.put("paidGroupInfo_billingModel_enabled", new TableInfo.Column("paidGroupInfo_billingModel_enabled", "TEXT", false, 0, null, 1));
                map7.put("paidGroupInfo_billingModel_currencyId", new TableInfo.Column("paidGroupInfo_billingModel_currencyId", "INTEGER", false, 0, null, 1));
                map7.put("paidGroupInfo_billingModel_currencyCode", new TableInfo.Column("paidGroupInfo_billingModel_currencyCode", "TEXT", false, 0, null, 1));
                map7.put("paidGroupInfo_billingModel_currencySign", new TableInfo.Column("paidGroupInfo_billingModel_currencySign", "TEXT", false, 0, null, 1));
                map7.put("paidGroupInfo_billingModel_amount", new TableInfo.Column("paidGroupInfo_billingModel_amount", "TEXT", false, 0, null, 1));
                map7.put("paidGroupInfo_billingModel_billingType", new TableInfo.Column("paidGroupInfo_billingModel_billingType", "TEXT", false, 0, null, 1));
                map7.put("paidGroupInfo_paidGroupMemberStatus_paymentRequiredStatus", new TableInfo.Column("paidGroupInfo_paidGroupMemberStatus_paymentRequiredStatus", "TEXT", false, 0, null, 1));
                map7.put("paidGroupInfo_paidGroupMemberStatus_lastPaymentDatetime", new TableInfo.Column("paidGroupInfo_paidGroupMemberStatus_lastPaymentDatetime", "INTEGER", false, 0, null, 1));
                map7.put("paidGroupInfo_paidGroupMemberStatus_nextPaymentDatetime", new TableInfo.Column("paidGroupInfo_paidGroupMemberStatus_nextPaymentDatetime", "INTEGER", false, 0, null, 1));
                map7.put("paidGroupInfo_paidGroupMemberStatus_paidGroupBillingStatus", new TableInfo.Column("paidGroupInfo_paidGroupMemberStatus_paidGroupBillingStatus", "TEXT", false, 0, null, 1));
                map7.put("paidGroupInfo_paidGroupMemberStatus_billingCyclePaymentStatus", new TableInfo.Column("paidGroupInfo_paidGroupMemberStatus_billingCyclePaymentStatus", "TEXT", false, 0, null, 1));
                map7.put("campaign_activityId", new TableInfo.Column("campaign_activityId", "INTEGER", false, 0, null, 1));
                map7.put("campaign_urlSlug", new TableInfo.Column("campaign_urlSlug", "TEXT", false, 0, null, 1));
                map7.put("campaign_urlSubPath", new TableInfo.Column("campaign_urlSubPath", "TEXT", false, 0, null, 1));
                map7.put("campaign_campaignStartTime", new TableInfo.Column("campaign_campaignStartTime", "TEXT", false, 0, null, 1));
                map7.put("campaign_campaignEndTime", new TableInfo.Column("campaign_campaignEndTime", "TEXT", false, 0, null, 1));
                map7.put("campaign_registrationStartTime", new TableInfo.Column("campaign_registrationStartTime", "TEXT", false, 0, null, 1));
                map7.put("campaign_minAppVersion", new TableInfo.Column("campaign_minAppVersion", "TEXT", false, 0, null, 1));
                map7.put("superGroupConfig_showSuperGroupUpgradeStatus", new TableInfo.Column("superGroupConfig_showSuperGroupUpgradeStatus", "INTEGER", false, 0, null, 1));
                map7.put("superGroupConfig_orbiterPlusExpiryTimestamp", new TableInfo.Column("superGroupConfig_orbiterPlusExpiryTimestamp", "INTEGER", false, 0, null, 1));
                map7.put("superGroupConfig_capacity", new TableInfo.Column("superGroupConfig_capacity", "INTEGER", false, 0, null, 1));
                HashSet hashSet7 = new HashSet(0);
                HashSet hashSet8 = new HashSet(1);
                hashSet8.add(new TableInfo.Index("index_in_house_im_group_group_name", true, Arrays.asList("group_name"), Arrays.asList("ASC")));
                TableInfo tableInfo13 = new TableInfo("in_house_im_group", map7, hashSet7, hashSet8);
                TableInfo tableInfo14 = TableInfo.read(sQLiteConnection, "in_house_im_group");
                if (!tableInfo13.equals(tableInfo14)) {
                    return new RoomOpenDelegate.ValidationResult(false, "in_house_im_group(com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupEntity).\n Expected:\n" + tableInfo13 + "\n Found:\n" + tableInfo14);
                }
                HashMap map8 = new HashMap(6);
                map8.put("group_id", new TableInfo.Column("group_id", "TEXT", true, 1, null, 1));
                map8.put("group_nick_name", new TableInfo.Column("group_nick_name", "TEXT", false, 0, null, 1));
                map8.put("user_nick_name", new TableInfo.Column("user_nick_name", "TEXT", false, 0, null, 1));
                map8.put("role", new TableInfo.Column("role", "INTEGER", true, 0, null, 1));
                map8.put("is_no_disturb", new TableInfo.Column("is_no_disturb", "INTEGER", true, 0, null, 1));
                map8.put("is_top", new TableInfo.Column("is_top", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo15 = new TableInfo("group_setting", map8, new HashSet(0), new HashSet(0));
                TableInfo tableInfo16 = TableInfo.read(sQLiteConnection, "group_setting");
                if (!tableInfo15.equals(tableInfo16)) {
                    return new RoomOpenDelegate.ValidationResult(false, "group_setting(com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupSettingEntity).\n Expected:\n" + tableInfo15 + "\n Found:\n" + tableInfo16);
                }
                HashMap map9 = new HashMap(12);
                map9.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
                map9.put(RemoteMessageConst.Notification.CHANNEL_ID, new TableInfo.Column(RemoteMessageConst.Notification.CHANNEL_ID, "TEXT", true, 0, null, 1));
                map9.put(MTPushConstants.Operation.KEY_SEQUENCE, new TableInfo.Column(MTPushConstants.Operation.KEY_SEQUENCE, "INTEGER", true, 0, null, 1));
                map9.put("content", new TableInfo.Column("content", "TEXT", false, 0, null, 1));
                map9.put("type", new TableInfo.Column("type", "INTEGER", true, 0, null, 1));
                map9.put(RemoteMessageConst.Notification.PRIORITY, new TableInfo.Column(RemoteMessageConst.Notification.PRIORITY, "INTEGER", true, 0, null, 1));
                map9.put("referenceSequence", new TableInfo.Column("referenceSequence", "INTEGER", true, 0, null, 1));
                map9.put("replaceMessage", new TableInfo.Column("replaceMessage", "TEXT", false, 0, null, 1));
                map9.put("replaceMessageType", new TableInfo.Column("replaceMessageType", "INTEGER", false, 0, null, 1));
                map9.put("visibility", new TableInfo.Column("visibility", "INTEGER", false, 0, null, 1));
                map9.put("strategyUids", new TableInfo.Column("strategyUids", "TEXT", false, 0, null, 1));
                map9.put("isCurrentUserInStrategy", new TableInfo.Column("isCurrentUserInStrategy", "INTEGER", true, 0, null, 1));
                HashSet hashSet9 = new HashSet(0);
                HashSet hashSet10 = new HashSet(1);
                hashSet10.add(new TableInfo.Index("index_reference_message_channelId_sequence", false, Arrays.asList(RemoteMessageConst.Notification.CHANNEL_ID, MTPushConstants.Operation.KEY_SEQUENCE), Arrays.asList("ASC", "ASC")));
                TableInfo tableInfo17 = new TableInfo("reference_message", map9, hashSet9, hashSet10);
                TableInfo tableInfo18 = TableInfo.read(sQLiteConnection, "reference_message");
                if (!tableInfo17.equals(tableInfo18)) {
                    return new RoomOpenDelegate.ValidationResult(false, "reference_message(com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageHandling).\n Expected:\n" + tableInfo17 + "\n Found:\n" + tableInfo18);
                }
                HashMap map10 = new HashMap(9);
                map10.put("hash", new TableInfo.Column("hash", "TEXT", true, 1, null, 1));
                map10.put("rowId", new TableInfo.Column("rowId", "TEXT", true, 0, null, 1));
                map10.put("countryCode", new TableInfo.Column("countryCode", "TEXT", false, 0, null, 1));
                map10.put("isSynced", new TableInfo.Column("isSynced", "INTEGER", true, 0, null, 1));
                map10.put("phoneRelationId", new TableInfo.Column("phoneRelationId", "TEXT", true, 0, null, 1));
                map10.put("okxRelationId", new TableInfo.Column("okxRelationId", "TEXT", false, 0, null, 1));
                map10.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, 1));
                map10.put("rawNumber", new TableInfo.Column("rawNumber", "TEXT", true, 0, null, 1));
                map10.put("nationalNumber", new TableInfo.Column("nationalNumber", "TEXT", true, 0, null, 1));
                HashSet hashSet11 = new HashSet(0);
                HashSet hashSet12 = new HashSet(1);
                hashSet12.add(new TableInfo.Index("index_phone_relations_rowId_isSynced_okxRelationId_rawNumber", false, Arrays.asList("rowId", "isSynced", "okxRelationId", "rawNumber"), Arrays.asList("ASC", "ASC", "ASC", "ASC")));
                TableInfo tableInfo19 = new TableInfo("phone_relations", map10, hashSet11, hashSet12);
                TableInfo tableInfo20 = TableInfo.read(sQLiteConnection, "phone_relations");
                if (!tableInfo19.equals(tableInfo20)) {
                    return new RoomOpenDelegate.ValidationResult(false, "phone_relations(com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity).\n Expected:\n" + tableInfo19 + "\n Found:\n" + tableInfo20);
                }
                HashMap map11 = new HashMap(4);
                map11.put("stickerId", new TableInfo.Column("stickerId", "TEXT", true, 1, null, 1));
                map11.put("packId", new TableInfo.Column("packId", "TEXT", true, 2, null, 1));
                map11.put("position", new TableInfo.Column("position", "INTEGER", true, 0, null, 1));
                map11.put("path", new TableInfo.Column("path", "TEXT", true, 0, null, 1));
                TableInfo tableInfo21 = new TableInfo("im_sticker", map11, new HashSet(0), new HashSet(0));
                TableInfo tableInfo22 = TableInfo.read(sQLiteConnection, "im_sticker");
                if (!tableInfo21.equals(tableInfo22)) {
                    return new RoomOpenDelegate.ValidationResult(false, "im_sticker(com.okinc.okimcore.stickers.local.StickerEntity).\n Expected:\n" + tableInfo21 + "\n Found:\n" + tableInfo22);
                }
                HashMap map12 = new HashMap(5);
                map12.put("packId", new TableInfo.Column("packId", "TEXT", true, 1, null, 1));
                map12.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, 1));
                map12.put("pathDay", new TableInfo.Column("pathDay", "TEXT", false, 0, null, 1));
                map12.put("pathNight", new TableInfo.Column("pathNight", "TEXT", false, 0, null, 1));
                map12.put("position", new TableInfo.Column("position", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo23 = new TableInfo("im_sticker_packs", map12, new HashSet(0), new HashSet(0));
                TableInfo tableInfo24 = TableInfo.read(sQLiteConnection, "im_sticker_packs");
                if (!tableInfo23.equals(tableInfo24)) {
                    return new RoomOpenDelegate.ValidationResult(false, "im_sticker_packs(com.okinc.okimcore.stickers.local.StickerPackEntity).\n Expected:\n" + tableInfo23 + "\n Found:\n" + tableInfo24);
                }
                HashMap map13 = new HashMap(6);
                map13.put("emojiReactionId", new TableInfo.Column("emojiReactionId", "INTEGER", true, 1, null, 1));
                map13.put("messageId", new TableInfo.Column("messageId", "TEXT", true, 0, null, 1));
                map13.put("emoji", new TableInfo.Column("emoji", "TEXT", true, 0, null, 1));
                map13.put("reactorReactionTime", new TableInfo.Column("reactorReactionTime", "INTEGER", true, 0, null, 1));
                map13.put("reactorUserId", new TableInfo.Column("reactorUserId", "TEXT", true, 0, null, 1));
                map13.put("isCurrentUserReaction", new TableInfo.Column("isCurrentUserReaction", "INTEGER", true, 0, null, 1));
                HashSet hashSet13 = new HashSet(1);
                hashSet13.add(new TableInfo.ForeignKey("message", "CASCADE", "NO ACTION", Arrays.asList("messageId"), Arrays.asList("messageId")));
                HashSet hashSet14 = new HashSet(2);
                hashSet14.add(new TableInfo.Index("index_emoji_reaction_messageId", false, Arrays.asList("messageId"), Arrays.asList("ASC")));
                hashSet14.add(new TableInfo.Index("index_emoji_reaction_messageId_emoji_reactorUserId_reactorReactionTime", true, Arrays.asList("messageId", "emoji", "reactorUserId", "reactorReactionTime"), Arrays.asList("ASC", "ASC", "ASC", "ASC")));
                TableInfo tableInfo25 = new TableInfo("emoji_reaction", map13, hashSet13, hashSet14);
                TableInfo tableInfo26 = TableInfo.read(sQLiteConnection, "emoji_reaction");
                if (!tableInfo25.equals(tableInfo26)) {
                    return new RoomOpenDelegate.ValidationResult(false, "emoji_reaction(com.okinc.okimcore.model.room.inhouseim.EmojiReactionEntity).\n Expected:\n" + tableInfo25 + "\n Found:\n" + tableInfo26);
                }
                return new RoomOpenDelegate.ValidationResult(true, null);
            }
        };
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "conversation_simple_info", "conversation", "contacts", "message", "message_tag", "group_member", "in_house_im_group", "group_setting", "reference_message", "phone_relations", "im_sticker", "im_sticker_packs", "emoji_reaction");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.performClear(true, "conversation_simple_info", "conversation", "contacts", "message", "message_tag", "group_member", "in_house_im_group", "group_setting", "reference_message", "phone_relations", "im_sticker", "im_sticker_packs", "emoji_reaction");
    }

    @Override // androidx.room.RoomDatabase
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(InHouseIMConversationSimpleInfoDao.class, sHQ.KWHzl());
        map.put(InHouseIMConversationDao.class, sGT.copydefault());
        map.put(InHouseIMContactDao.class, C44183sGj.EZpvd());
        map.put(InHouseIMMessageDao.class, sKW.EZpvd());
        map.put(InHouseIMMessageTagsDao.class, C44339sMd.OLrzqt());
        map.put(InHouseIMGroupMemberDao.class, C44279sJy.AEQbTJ());
        map.put(InHouseIMGroupInfoDao.class, C44273sJs.EZpvd());
        map.put(InHouseIMGroupSettingDao.class, sJF.KWHzl());
        map.put(InHouseIMMessageHandlingDao.class, sLV.AEQbTJ());
        map.put(PhoneRelationEntityDao.class, C44344sMi.copydefault());
        map.put(StickerPacksDao.class, C44495sRy.KWHzl());
        map.put(StickersDao.class, sRB.EZpvd());
        map.put(EmojiReactionDao.class, C44361sMz.KWHzl());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        HashSet hashSet = new HashSet();
        hashSet.add(C44240sIm.class);
        return hashSet;
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C44242sIo(map.get(C44240sIm.class)));
        arrayList.add(new C44248sIu());
        arrayList.add(new C44250sIw());
        arrayList.add(new C44249sIv());
        arrayList.add(new C44246sIs());
        arrayList.add(new C44247sIt());
        arrayList.add(new C44251sIx());
        arrayList.add(new C44253sIz());
        return arrayList;
    }

    @Override // com.okinc.okimcore.feature.database.InHouseIMDatabase
    public InHouseIMConversationSimpleInfoDao OLrzqt() {
        InHouseIMConversationSimpleInfoDao inHouseIMConversationSimpleInfoDao;
        if (this.KWHzl != null) {
            return this.KWHzl;
        }
        synchronized (this) {
            if (this.KWHzl == null) {
                this.KWHzl = new sHQ(this);
            }
            inHouseIMConversationSimpleInfoDao = this.KWHzl;
        }
        return inHouseIMConversationSimpleInfoDao;
    }

    @Override // com.okinc.okimcore.feature.database.InHouseIMDatabase
    public InHouseIMConversationDao AEQbTJ() {
        InHouseIMConversationDao inHouseIMConversationDao;
        if (this.OLrzqt != null) {
            return this.OLrzqt;
        }
        synchronized (this) {
            if (this.OLrzqt == null) {
                this.OLrzqt = new sGT(this);
            }
            inHouseIMConversationDao = this.OLrzqt;
        }
        return inHouseIMConversationDao;
    }

    @Override // com.okinc.okimcore.feature.database.InHouseIMDatabase
    public InHouseIMContactDao copydefault() {
        InHouseIMContactDao inHouseIMContactDao;
        if (this.EZpvd != null) {
            return this.EZpvd;
        }
        synchronized (this) {
            if (this.EZpvd == null) {
                this.EZpvd = new C44183sGj(this);
            }
            inHouseIMContactDao = this.EZpvd;
        }
        return inHouseIMContactDao;
    }

    @Override // com.okinc.okimcore.feature.database.InHouseIMDatabase
    public InHouseIMMessageDao gEmmrt() {
        InHouseIMMessageDao inHouseIMMessageDao;
        if (this.valueOf != null) {
            return this.valueOf;
        }
        synchronized (this) {
            if (this.valueOf == null) {
                this.valueOf = new sKW(this);
            }
            inHouseIMMessageDao = this.valueOf;
        }
        return inHouseIMMessageDao;
    }

    @Override // com.okinc.okimcore.feature.database.InHouseIMDatabase
    public InHouseIMMessageTagsDao valueOf() {
        InHouseIMMessageTagsDao inHouseIMMessageTagsDao;
        if (this.AhwBna != null) {
            return this.AhwBna;
        }
        synchronized (this) {
            if (this.AhwBna == null) {
                this.AhwBna = new C44339sMd(this);
            }
            inHouseIMMessageTagsDao = this.AhwBna;
        }
        return inHouseIMMessageTagsDao;
    }

    @Override // com.okinc.okimcore.feature.database.InHouseIMDatabase
    public InHouseIMGroupMemberDao djBIcL() {
        InHouseIMGroupMemberDao inHouseIMGroupMemberDao;
        if (this.djBIcL != null) {
            return this.djBIcL;
        }
        synchronized (this) {
            if (this.djBIcL == null) {
                this.djBIcL = new C44279sJy(this);
            }
            inHouseIMGroupMemberDao = this.djBIcL;
        }
        return inHouseIMGroupMemberDao;
    }

    @Override // com.okinc.okimcore.feature.database.InHouseIMDatabase
    public InHouseIMGroupInfoDao EZpvd() {
        InHouseIMGroupInfoDao inHouseIMGroupInfoDao;
        if (this.copydefault != null) {
            return this.copydefault;
        }
        synchronized (this) {
            if (this.copydefault == null) {
                this.copydefault = new C44273sJs(this);
            }
            inHouseIMGroupInfoDao = this.copydefault;
        }
        return inHouseIMGroupInfoDao;
    }

    @Override // com.okinc.okimcore.feature.database.InHouseIMDatabase
    public InHouseIMGroupSettingDao AYXKKw() {
        InHouseIMGroupSettingDao inHouseIMGroupSettingDao;
        if (this.gEmmrt != null) {
            return this.gEmmrt;
        }
        synchronized (this) {
            if (this.gEmmrt == null) {
                this.gEmmrt = new sJF(this);
            }
            inHouseIMGroupSettingDao = this.gEmmrt;
        }
        return inHouseIMGroupSettingDao;
    }

    @Override // com.okinc.okimcore.feature.database.InHouseIMDatabase
    public InHouseIMMessageHandlingDao AhwBna() {
        InHouseIMMessageHandlingDao inHouseIMMessageHandlingDao;
        if (this.AYXKKw != null) {
            return this.AYXKKw;
        }
        synchronized (this) {
            if (this.AYXKKw == null) {
                this.AYXKKw = new sLV(this);
            }
            inHouseIMMessageHandlingDao = this.AYXKKw;
        }
        return inHouseIMMessageHandlingDao;
    }

    @Override // com.okinc.okimcore.feature.database.InHouseIMDatabase
    public PhoneRelationEntityDao DbNXlk() {
        PhoneRelationEntityDao phoneRelationEntityDao;
        if (this.DbNXlk != null) {
            return this.DbNXlk;
        }
        synchronized (this) {
            if (this.DbNXlk == null) {
                this.DbNXlk = new C44344sMi(this);
            }
            phoneRelationEntityDao = this.DbNXlk;
        }
        return phoneRelationEntityDao;
    }

    @Override // com.okinc.okimcore.feature.database.InHouseIMDatabase
    public StickerPacksDao fetchVPNInfo() {
        StickerPacksDao stickerPacksDao;
        if (this.values != null) {
            return this.values;
        }
        synchronized (this) {
            if (this.values == null) {
                this.values = new C44495sRy(this);
            }
            stickerPacksDao = this.values;
        }
        return stickerPacksDao;
    }

    @Override // com.okinc.okimcore.feature.database.InHouseIMDatabase
    public StickersDao isConnected() {
        StickersDao stickersDao;
        if (this.AkhnZx != null) {
            return this.AkhnZx;
        }
        synchronized (this) {
            if (this.AkhnZx == null) {
                this.AkhnZx = new sRB(this);
            }
            stickersDao = this.AkhnZx;
        }
        return stickersDao;
    }

    @Override // com.okinc.okimcore.feature.database.InHouseIMDatabase
    public EmojiReactionDao KWHzl() {
        EmojiReactionDao emojiReactionDao;
        if (this.AEQbTJ != null) {
            return this.AEQbTJ;
        }
        synchronized (this) {
            if (this.AEQbTJ == null) {
                this.AEQbTJ = new C44361sMz(this);
            }
            emojiReactionDao = this.AEQbTJ;
        }
        return emojiReactionDao;
    }
}
