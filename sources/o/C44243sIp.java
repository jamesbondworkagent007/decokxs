package o;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.sIp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44243sIp {
    public static final Migration fIwbmz = new ClipData();
    public static final Migration ejfBZ = new BroadcastReceiver();
    public static final Migration getNewProxyInstance = new ContentResolver();
    public static final Migration hDKMBd = new Context();
    public static final Migration uzCIH = new DialogInterface();
    public static final Migration getFieldNames = new ContextWrapper();
    public static final Migration EZpvd = new Activity();
    public static final Migration AEQbTJ = new StateListAnimator();
    public static final Migration copydefault = new ActionBar();
    public static final Migration OLrzqt = new Application();
    public static final Migration KWHzl = new TaskDescription();
    public static final Migration valueOf = new FragmentManager();
    public static final Migration djBIcL = new Dialog();
    public static final Migration gEmmrt = new PendingIntent();
    public static final Migration AhwBna = new Fragment();
    public static final Migration AYXKKw = new LoaderManager();
    public static final Migration fetchVPNInfo = new PictureInPictureParams();
    public static final Migration DbNXlk = new VoiceInteractor();
    public static final Migration values = new AssistContent();
    public static final Migration isConnected = new SharedElementCallback();
    public static final Migration AkhnZx = new TaskStackBuilder();
    public static final Migration fARcdN = new ComponentCallbacks();
    public static final Migration AuCTel = new ComponentName();
    public static final Migration fJNWhG = new ComponentCallbacks2();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration AEQbTJ() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration AYXKKw() {
        return AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration AhwBna() {
        return valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration AkhnZx() {
        return isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration AuCTel() {
        return AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration DbNXlk() {
        return AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration EZpvd() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration KWHzl() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration OLrzqt() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration copydefault() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration djBIcL() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration ejfBZ() {
        return ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration fARcdN() {
        return fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration fIwbmz() {
        return fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration fJNWhG() {
        return fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration fetchVPNInfo() {
        return fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration gEmmrt() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration getFieldNames() {
        return uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration getNewProxyInstance() {
        return hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration hDKMBd() {
        return getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration isConnected() {
        return DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration iwGUEr() {
        return getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration valueOf() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Migration values() {
        return values;
    }

    /* JADX INFO: renamed from: o.sIp$ClipData */
    public static final class ClipData extends Migration {
        public ClipData() {
            super(4, 5);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE inhouseim_messages ADD COLUMN clientMessageId TEXT");
            supportSQLiteDatabase.execSQL("DROP INDEX IF EXISTS `index_inhouseim_messages_seqInLong_channelId_isRead_isVisible_isRecall_isMentionMe_isReceiveReadReceipt`");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_inhouseim_messages_seqInLong_channelId_isRead_isVisible_isRecall_isMentionMe_isReceiveReadReceipt_clientMessageId` ON `inhouseim_messages` (`seqInLong`, `channelId`, `isRead`, `isVisible`, `isRecall`, `isMentionMe`, `isReceiveReadReceipt`, `clientMessageId`)");
        }
    }

    /* JADX INFO: renamed from: o.sIp$BroadcastReceiver */
    public static final class BroadcastReceiver extends Migration {
        public BroadcastReceiver() {
            super(5, 6);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE contacts ADD COLUMN relationPermission TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE inhouseim_messages ADD COLUMN isMentionAll INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("ALTER TABLE conversations ADD COLUMN totalMentionedAll INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* JADX INFO: renamed from: o.sIp$ContentResolver */
    public static final class ContentResolver extends Migration {
        public ContentResolver() {
            super(6, 7);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.delete("inhouseim_messages", null, null);
        }
    }

    /* JADX INFO: renamed from: o.sIp$Context */
    public static final class Context extends Migration {
        public Context() {
            super(7, 8);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `inhouseim_messages_tags` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `channelId` TEXT NOT NULL, `seq` TEXT NOT NULL, `atUserId` TEXT NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_inhouseim_messages_tags_channelId_seq_atUserId` ON `inhouseim_messages_tags` (`channelId`, `seq`, `atUserId`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `group_member` (`member_id` TEXT NOT NULL, `group_id` TEXT NOT NULL, `invite_id` TEXT NOT NULL, `role` INTEGER NOT NULL, `name` TEXT NOT NULL, `nick_name` TEXT NOT NULL, `member_avatar` TEXT NOT NULL, `status` INTEGER NOT NULL, `create_time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `v1` TEXT NOT NULL, `v2` TEXT NOT NULL, `v3` TEXT NOT NULL, `officialTagInfo` TEXT, PRIMARY KEY(`member_id`, `group_id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `in_house_im_group` (`group_id` TEXT NOT NULL, `group_master_id` TEXT NOT NULL, `group_name` TEXT NOT NULL, `group_avatar` TEXT NOT NULL, `group_notice` TEXT NOT NULL, `group_desc` TEXT NOT NULL, `is_store` INTEGER NOT NULL, `is_verify` INTEGER NOT NULL, `is_asset` INTEGER NOT NULL, `is_pay` INTEGER NOT NULL, `asset_currency_id` INTEGER, `asset_currency_symbol` TEXT, `asset_amount` REAL, `pay_currency_id` INTEGER, `pay_currency_symbol` TEXT, `pay_amount` REAL, `status` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `create_time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `group_count` INTEGER NOT NULL, `v1` TEXT NOT NULL, `v2` TEXT NOT NULL, `v3` TEXT NOT NULL, `allowMentionOthers` INTEGER, `isCanTransferOwnership` INTEGER, `type` INTEGER, `userGroupPermission` TEXT, PRIMARY KEY(`group_id`))");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_in_house_im_group_group_name` ON `in_house_im_group` (`group_name`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `group_setting` (`group_id` TEXT NOT NULL, `group_nick_name` TEXT, `user_nick_name` TEXT, `role` INTEGER NOT NULL, `is_no_disturb` INTEGER NOT NULL, `is_top` INTEGER NOT NULL, `v1` TEXT NOT NULL, `v2` TEXT NOT NULL, `v3` TEXT NOT NULL, PRIMARY KEY(`group_id`))");
            supportSQLiteDatabase.execSQL("ALTER TABLE conversations ADD COLUMN `nickname` TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE conversations ADD COLUMN `enNickname` TEXT");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_conversations_nickname` ON `conversations` (`nickname`)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_conversations_enNickname` ON `conversations` (`enNickname`)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_conversations_channelType` ON `conversations` (`channelType`)");
            supportSQLiteDatabase.execSQL("ALTER TABLE inhouseim_messages ADD COLUMN messageTextWithoutTagContent TEXT");
            supportSQLiteDatabase.execSQL("DROP INDEX IF EXISTS `index_inhouseim_messages_seqInLong_channelId_isRead_isVisible_isRecall_isMentionMe_isReceiveReadReceipt_clientMessageId`");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_inhouseim_messages_seqInLong_channelId_isRead_isVisible_isRecall_isMentionMe_isReceiveReadReceipt_clientMessageId_messageTextWithoutTagContent_contentType` ON `inhouseim_messages` (`seqInLong`, `channelId`, `isRead`, `isVisible`, `isRecall`, `isMentionMe`, `isReceiveReadReceipt`, `clientMessageId`, `messageTextWithoutTagContent`, `contentType`)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_contacts_channelId` ON `contacts` (`channelId`)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_contacts_remarkName` ON `contacts` (`remarkName`)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_contacts_nickname` ON `contacts` (`nickname`)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_contacts_enNickname` ON `contacts` (`enNickname`)");
            supportSQLiteDatabase.delete("conversation_simple_info", null, null);
            supportSQLiteDatabase.delete("conversations", null, null);
            supportSQLiteDatabase.delete("contacts", null, null);
            supportSQLiteDatabase.delete("inhouseim_messages", null, null);
            supportSQLiteDatabase.delete("inhouseim_messages_tags", null, null);
            supportSQLiteDatabase.delete("group_member", null, null);
            supportSQLiteDatabase.delete("in_house_im_group", null, null);
            supportSQLiteDatabase.delete("group_setting", null, null);
        }
    }

    /* JADX INFO: renamed from: o.sIp$DialogInterface */
    public static final class DialogInterface extends Migration {
        public DialogInterface() {
            super(8, 9);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `contacts_temp` (`contactUid` TEXT NOT NULL, `channelId` TEXT, `relationType` TEXT NOT NULL, `remarkName` TEXT, `nickname` TEXT, `enNickname` TEXT, `avatar` TEXT, `userUid` TEXT NOT NULL, `tags` TEXT, `blacklisted` INTEGER, `relationSourceType` TEXT, `relationPermission` TEXT, PRIMARY KEY(`contactUid`))");
            supportSQLiteDatabase.execSQL("INSERT INTO `contacts_temp` (`contactUid`, `channelId`, `relationType`, `remarkName`, `nickname`, `enNickname`, `avatar`, `userUid`, `tags`, `blacklisted`, `relationSourceType`, `relationPermission`) SELECT `contactUid`, `channelId`, `relationType`, `remarkName`, `nickname`, `enNickname`, `avatar`, `userUid`, `tags`, `blacklisted`, `relationSourceType`, `relationPermission` FROM `contacts`");
            supportSQLiteDatabase.execSQL("DROP TABLE `contacts`");
            supportSQLiteDatabase.execSQL("ALTER TABLE `contacts_temp` RENAME TO `contacts`");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_contacts_channelId` ON `contacts` (`channelId`)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_contacts_remarkName` ON `contacts` (`remarkName`)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_contacts_nickname` ON `contacts` (`nickname`)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_contacts_enNickname` ON `contacts` (`enNickname`)");
        }
    }

    /* JADX INFO: renamed from: o.sIp$ContextWrapper */
    public static final class ContextWrapper extends Migration {
        public ContextWrapper() {
            super(9, 10);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE conversations ADD COLUMN `draftReferenceMessageSeq` TEXT NOT NULL DEFAULT ''");
            supportSQLiteDatabase.execSQL("ALTER TABLE inhouseim_messages ADD COLUMN replySeq INTEGER");
            supportSQLiteDatabase.execSQL("ALTER TABLE inhouseim_messages ADD COLUMN replyMessageJson TEXT");
            supportSQLiteDatabase.execSQL("DROP INDEX IF EXISTS `index_inhouseim_messages_seqInLong_channelId_isRead_isVisible_isRecall_isMentionMe_isReceiveReadReceipt_clientMessageId_messageTextWithoutTagContent_contentType`");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_inhouseim_messages_seqInLong_channelId_isRead_isVisible_isRecall_isMentionMe_isReceiveReadReceipt_clientMessageId_messageTextWithoutTagContent_contentType_replySeq` ON `inhouseim_messages` (`seqInLong`, `channelId`, `isRead`, `isVisible`, `isRecall`, `isMentionMe`, `isReceiveReadReceipt`, `clientMessageId`, `messageTextWithoutTagContent`, `contentType`, `replySeq`)");
            supportSQLiteDatabase.delete("inhouseim_messages", null, null);
            supportSQLiteDatabase.delete("conversations", null, null);
            supportSQLiteDatabase.delete("conversation_simple_info", null, null);
        }
    }

    /* JADX INFO: renamed from: o.sIp$Activity */
    public static final class Activity extends Migration {
        public Activity() {
            super(10, 11);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE conversations ADD COLUMN groupType INTEGER");
            supportSQLiteDatabase.delete("conversation_simple_info", null, null);
        }
    }

    /* JADX INFO: renamed from: o.sIp$StateListAnimator */
    public static final class StateListAnimator extends Migration {
        public StateListAnimator() {
            super(11, 12);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE inhouseim_messages ADD COLUMN chainId TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE inhouseim_messages ADD COLUMN serviceName TEXT");
            supportSQLiteDatabase.execSQL("DROP INDEX IF EXISTS `index_inhouseim_messages_seqInLong_channelId_isRead_isVisible_isRecall_isMentionMe_isReceiveReadReceipt_clientMessageId_messageTextWithoutTagContent_contentType_replySeq`");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_inhouseim_messages_seqInLong_channelId_isRead_isVisible_isRecall_isMentionMe_isReceiveReadReceipt_clientMessageId_messageTextWithoutTagContent_contentType_replySeq_chainId_serviceName` ON `inhouseim_messages` (`seqInLong`, `channelId`, `isRead`, `isVisible`, `isRecall`, `isMentionMe`, `isReceiveReadReceipt`, `clientMessageId`, `messageTextWithoutTagContent`, `contentType`, `replySeq`, `chainId`, `serviceName`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `message_handling` (`channelId` TEXT NOT NULL, `seq` INTEGER NOT NULL, `type` INTEGER NOT NULL, `priority` INTEGER NOT NULL, `contentJson` TEXT, `chainId` TEXT NOT NULL, `serviceName` TEXT NOT NULL, `refSeq` INTEGER NOT NULL, `frontendOption` TEXT, `handlingId` INTEGER PRIMARY KEY AUTOINCREMENT)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_message_handling_channelId_seq_serviceName_chainId` ON `message_handling` (`channelId`, `seq`, `serviceName`, `chainId`)");
        }
    }

    /* JADX INFO: renamed from: o.sIp$ActionBar */
    public static final class ActionBar extends Migration {
        public ActionBar() {
            super(12, 13);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            boolean z;
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            android.database.Cursor cursorQuery = supportSQLiteDatabase.query("PRAGMA table_info(in_house_im_group)");
            boolean z2 = false;
            java.lang.Iterable iterableAhwBna = C56548yJl.AhwBna(0, cursorQuery.getCount());
            if ((iterableAhwBna instanceof java.util.Collection) && ((java.util.Collection) iterableAhwBna).isEmpty()) {
                z = false;
            } else {
                java.util.Iterator it = iterableAhwBna.iterator();
                while (it.hasNext()) {
                    if (cursorQuery.moveToPosition(((AbstractC56415yEn) it).nextInt()) && Intrinsics.EZpvd((java.lang.Object) cursorQuery.getString(1), (java.lang.Object) "allowMembersToAddMembers")) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            cursorQuery.close();
            pUU.KWHzl("IM_MIGRATION_12_13", "allowMembersToAddMembersColumnExist: " + z);
            if (!z) {
                supportSQLiteDatabase.execSQL("ALTER TABLE in_house_im_group ADD COLUMN allowMembersToAddMembers INTEGER");
            }
            android.database.Cursor cursorQuery2 = supportSQLiteDatabase.query("PRAGMA table_info(in_house_im_group)");
            java.lang.Iterable iterableAhwBna2 = C56548yJl.AhwBna(0, cursorQuery2.getCount());
            if (!(iterableAhwBna2 instanceof java.util.Collection) || !((java.util.Collection) iterableAhwBna2).isEmpty()) {
                java.util.Iterator it2 = iterableAhwBna2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (cursorQuery2.moveToPosition(((AbstractC56415yEn) it2).nextInt()) && Intrinsics.EZpvd((java.lang.Object) cursorQuery2.getString(1), (java.lang.Object) "allowSharingInvitationQrCode")) {
                        z2 = true;
                        break;
                    }
                }
            }
            cursorQuery2.close();
            pUU.KWHzl("IM_MIGRATION_12_13", "allowSharingInvitationQrCodeColumnExist: " + z2);
            if (z2) {
                return;
            }
            supportSQLiteDatabase.execSQL("ALTER TABLE in_house_im_group ADD COLUMN allowSharingInvitationQrCode INTEGER");
        }
    }

    /* JADX INFO: renamed from: o.sIp$Application */
    public static final class Application extends Migration {
        public Application() {
            super(13, 14);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE `contacts` ADD COLUMN `phoneHash` TEXT");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `phone_relations` (`hash` TEXT NOT NULL, `rowId` TEXT NOT NULL, `countryCode` TEXT, `isSynced` INTEGER NOT NULL, `phoneRelationId` TEXT NOT NULL, `okxRelationId` TEXT, `name` TEXT, `rawNumber` TEXT NOT NULL, `nationalNumber` TEXT NOT NULL, PRIMARY KEY(`hash`))");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_phone_relations_rowId_isSynced` ON `phone_relations` (`rowId`, `isSynced`)");
        }
    }

    /* JADX INFO: renamed from: o.sIp$TaskDescription */
    public static final class TaskDescription extends Migration {
        public TaskDescription() {
            super(14, 15);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("DROP INDEX IF EXISTS `index_phone_relations_rowId_isSynced`");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_phone_relations_rowId_isSynced_okxRelationId_rawNumber` ON `phone_relations` (`rowId`, `isSynced`, `okxRelationId`, `rawNumber`)");
        }
    }

    /* JADX INFO: renamed from: o.sIp$FragmentManager */
    public static final class FragmentManager extends Migration {
        public FragmentManager() {
            super(15, 16);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE inhouseim_messages ADD COLUMN includeInUnreadCount INTEGER");
        }
    }

    /* JADX INFO: renamed from: o.sIp$Dialog */
    public static final class Dialog extends Migration {
        public Dialog() {
            super(16, 17);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE conversations ADD COLUMN conversationStatus INTEGER");
        }
    }

    /* JADX INFO: renamed from: o.sIp$PendingIntent */
    public static final class PendingIntent extends Migration {
        public PendingIntent() {
            super(17, 18);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("UPDATE `phone_relations` SET `isSynced` = 0");
            new sSB(new C44518sSu()).KWHzl();
        }
    }

    /* JADX INFO: renamed from: o.sIp$Fragment */
    public static final class Fragment extends Migration {
        public Fragment() {
            super(19, 20);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE in_house_im_group ADD COLUMN requireAdminApprovalToJoin INTEGER");
            supportSQLiteDatabase.execSQL("ALTER TABLE in_house_im_group ADD COLUMN pendingJoinRequests INTEGER");
            supportSQLiteDatabase.execSQL("ALTER TABLE in_house_im_group ADD COLUMN maxMemberCount INTEGER");
        }
    }

    /* JADX INFO: renamed from: o.sIp$LoaderManager */
    public static final class LoaderManager extends Migration {
        public LoaderManager() {
            super(20, 21);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `im_messages` (\n    clientMessageId TEXT PRIMARY KEY NOT NULL,\n    channelId TEXT NOT NULL,\n    senderUid TEXT NOT NULL,\n    seq TEXT NOT NULL,\n    seqInLong INTEGER NOT NULL,\n    senderPlatformType TEXT NOT NULL,\n    messageContentType TEXT NOT NULL,\n    contentType TEXT NOT NULL,\n    channelType TEXT NOT NULL,\n    isRead INTEGER,\n    isReceiveReadReceipt INTEGER,\n    isMentionMe INTEGER NOT NULL DEFAULT 0,\n    isMentionAll INTEGER NOT NULL DEFAULT 0,\n    isRecall INTEGER NOT NULL DEFAULT 0,\n    isVisible INTEGER,\n    extra TEXT,\n    messageTextWithoutTagContent TEXT,\n    sendTime INTEGER NOT NULL,\n    receiveTime INTEGER,\n    sourceJson TEXT NOT NULL,\n    sendStatus INTEGER NOT NULL DEFAULT 0,\n    replySeq INTEGER,\n    replyMessageJson TEXT,\n    serviceName TEXT,\n    chainId TEXT,\n    includeInUnreadCount INTEGER\n)");
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO im_messages (\n    clientMessageId, channelId, senderUid, seq, seqInLong,\n    senderPlatformType, messageContentType, contentType, channelType,\n    isRead, isReceiveReadReceipt, isMentionMe, isMentionAll, isRecall,\n    isVisible, extra, messageTextWithoutTagContent, sendTime, receiveTime,\n    sourceJson, sendStatus, replySeq, replyMessageJson, serviceName,\n    chainId, includeInUnreadCount\n)\nSELECT \n    lower(hex(randomblob(4)) || '-' || hex(randomblob(2)) || '-' || hex(randomblob(2)) || '-' || hex(randomblob(2)) || '-' || hex(randomblob(6))) \n    as clientMessageId,          \n    channelId, senderUid, seq, seqInLong,\n    senderPlatformType, messageContentType, contentType, channelType,\n    isRead, isReceiveReadReceipt, isMentionMe, isMentionAll, isRecall,\n    isVisible, extra, messageTextWithoutTagContent, sendTime, receiveTime,\n    sourceJson, sendStatus, replySeq, replyMessageJson, serviceName,\n    chainId, includeInUnreadCount\nFROM inhouseim_messages");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS index_im_messages_seqInLong_channelId_isRead_isVisible_isMentionMe_clientMessageId_contentType_replySeq_chainId_serviceName \nON im_messages (seqInLong, channelId, isRead, isVisible, isMentionMe, clientMessageId, contentType, replySeq, chainId, serviceName)");
            supportSQLiteDatabase.execSQL("DROP TABLE inhouseim_messages");
        }
    }

    /* JADX INFO: renamed from: o.sIp$PictureInPictureParams */
    public static final class PictureInPictureParams extends Migration {
        public PictureInPictureParams() {
            super(21, 22);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `im_sticker` (`stickerId` TEXT NOT NULL, `packId` TEXT NOT NULL, `position` INTEGER NOT NULL, `path` TEXT NOT NULL, PRIMARY KEY(`stickerId`, `packId`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `im_sticker_packs` (`packId` TEXT NOT NULL, `title` TEXT NOT NULL, `pathDay` TEXT, `pathNight` TEXT, `position` INTEGER NOT NULL, PRIMARY KEY(`packId`))");
        }
    }

    /* JADX INFO: renamed from: o.sIp$VoiceInteractor */
    public static final class VoiceInteractor extends Migration {
        public VoiceInteractor() {
            super(22, 23);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("UPDATE conversation_simple_info SET updateTime = NULL");
        }
    }

    /* JADX INFO: renamed from: o.sIp$AssistContent */
    public static final class AssistContent extends Migration {
        public AssistContent() {
            super(23, 24);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            supportSQLiteDatabase.execSQL("DROP INDEX IF EXISTS `index_conversations_nickname`");
            supportSQLiteDatabase.execSQL("DROP INDEX IF EXISTS `index_conversations_enNickname`");
            supportSQLiteDatabase.execSQL("DROP INDEX IF EXISTS `index_conversations_channelType`");
            supportSQLiteDatabase.execSQL("DROP INDEX IF EXISTS `index_im_messages_seqInLong_channelId_isRead_isVisible_isMentionMe_clientMessageId_contentType_replySeq_chainId_serviceName`");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_im_messages_channelId_seqInLong` ON `im_messages` (`channelId`, `seqInLong`)");
            supportSQLiteDatabase.execSQL("ALTER TABLE message_handling ADD COLUMN replaceMessageType INTEGER");
            supportSQLiteDatabase.execSQL("UPDATE message_handling SET replaceMessageType = " + InHouseIMContentType.Custom.getApiValue());
            pUU.KWHzl("IM_MIGRATION_23_24", "recreateIndexTime: " + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        }
    }

    /* JADX INFO: renamed from: o.sIp$SharedElementCallback */
    public static final class SharedElementCallback extends Migration {
        public SharedElementCallback() {
            super(24, 25);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE in_house_im_group ADD COLUMN paidGroupInfo_billingModel_enabled TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE in_house_im_group ADD COLUMN paidGroupInfo_billingModel_currencyId INTEGER");
            supportSQLiteDatabase.execSQL("ALTER TABLE in_house_im_group ADD COLUMN paidGroupInfo_billingModel_currencyCode TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE in_house_im_group ADD COLUMN paidGroupInfo_billingModel_currencySign TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE in_house_im_group ADD COLUMN paidGroupInfo_billingModel_amount TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE in_house_im_group ADD COLUMN paidGroupInfo_billingModel_billingType TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE in_house_im_group ADD COLUMN paidGroupInfo_paidGroupMemberStatus_paymentRequiredStatus TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE in_house_im_group ADD COLUMN paidGroupInfo_paidGroupMemberStatus_lastPaymentDatetime INTEGER");
            supportSQLiteDatabase.execSQL("ALTER TABLE in_house_im_group ADD COLUMN paidGroupInfo_paidGroupMemberStatus_nextPaymentDatetime INTEGER");
            supportSQLiteDatabase.execSQL("ALTER TABLE in_house_im_group ADD COLUMN paidGroupInfo_paidGroupMemberStatus_paidGroupBillingStatus TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE in_house_im_group ADD COLUMN paidGroupInfo_paidGroupMemberStatus_billingCyclePaymentStatus TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE in_house_im_group ADD COLUMN paidGroupInfo_outstandingAmount TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE group_member ADD COLUMN paidGroupMemberStatus_paymentRequiredStatus TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE group_member ADD COLUMN paidGroupMemberStatus_lastPaymentDatetime INTEGER");
            supportSQLiteDatabase.execSQL("ALTER TABLE group_member ADD COLUMN paidGroupMemberStatus_nextPaymentDatetime INTEGER");
            supportSQLiteDatabase.execSQL("ALTER TABLE group_member ADD COLUMN paidGroupMemberStatus_paidGroupBillingStatus TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE group_member ADD COLUMN paidGroupMemberStatus_billingCyclePaymentStatus TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE in_house_im_group ADD COLUMN public_group_type TEXT");
        }
    }

    /* JADX INFO: renamed from: o.sIp$TaskStackBuilder */
    public static final class TaskStackBuilder extends Migration {
        public TaskStackBuilder() {
            super(25, 26);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `emoji_reaction` (\n    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    `clientMessageId` TEXT NOT NULL,\n    `emoji` TEXT NOT NULL,\n    `reactorReactionTime` INTEGER NOT NULL,\n    `reactorUserId` TEXT NOT NULL,\n    `isCurrentUserReaction` INTEGER NOT NULL,\n    FOREIGN KEY(`clientMessageId`) REFERENCES `im_messages`(`clientMessageId`) ON DELETE CASCADE ON UPDATE NO ACTION\n)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_emoji_reaction_clientMessageId` \nON `emoji_reaction` (`clientMessageId`)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_emoji_reaction_clientMessageId_emoji_reactorUserId_reactorReactionTime` \nON `emoji_reaction` (`clientMessageId`, `emoji`, `reactorUserId`, `reactorReactionTime`)");
            supportSQLiteDatabase.execSQL("ALTER TABLE im_messages ADD COLUMN reactionUpdateTime INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* JADX INFO: renamed from: o.sIp$ComponentCallbacks */
    public static final class ComponentCallbacks extends Migration {
        public ComponentCallbacks() {
            super(27, 28);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("UPDATE conversation_simple_info SET updateTime = NULL");
            supportSQLiteDatabase.execSQL("DROP TABLE conversations");
            supportSQLiteDatabase.execSQL("DROP TABLE im_messages");
            supportSQLiteDatabase.execSQL("DROP TABLE inhouseim_messages_tags");
            supportSQLiteDatabase.execSQL("DROP TABLE emoji_reaction");
            supportSQLiteDatabase.execSQL("DROP TABLE message_handling");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `message` (\n    `messageId` TEXT NOT NULL, \n    `channelId` TEXT NOT NULL, \n    `senderUid` TEXT NOT NULL, \n    `seq` INTEGER NOT NULL, \n    `senderPlatformType` INTEGER NOT NULL, \n    `contentType` INTEGER NOT NULL, \n    `channelType` INTEGER NOT NULL, \n    `isRead` INTEGER, \n    `isVisible` INTEGER, \n    `sendTime` INTEGER NOT NULL, \n    `shouldIncludeInUnreadCount` INTEGER, \n    `extra` TEXT, \n    `status` INTEGER, \n    `sentStatus` INTEGER NOT NULL DEFAULT 0, \n    `receiveTime` INTEGER, \n    `isRecalled` INTEGER NOT NULL DEFAULT 0, \n    `isMentionMe` INTEGER NOT NULL DEFAULT 0, \n    `isReceiveReadReceipt` INTEGER, \n    `textContent` TEXT, \n    `atUserList` TEXT, \n    `atType` INTEGER, \n    `urlList` TEXT, \n    `siteMeta` TEXT, \n    `messageTextWithoutTagContent` TEXT, \n    `fileId` TEXT, \n    `urlPathCn` TEXT, \n    `urlPathDefault` TEXT, \n    `mediaThumbnail` TEXT, \n    `mediaWidth` INTEGER, \n    `mediaHeight` INTEGER, \n    `mediaDuration` INTEGER, \n    `mediaSize` INTEGER, \n    `localUri` TEXT, \n    `callType` INTEGER, \n    `callStatus` INTEGER, \n    `callDuration` INTEGER, \n    `callerUid` TEXT,\n    `replySeq` INTEGER, \n    `quotedMessage` TEXT, \n    `customMessage` TEXT, \n    `systemMessage` TEXT, \n    `shareMessage` TEXT, \n    `stickerId` TEXT, \n    `stickerPath` TEXT, \n    `readReceiptSequence` INTEGER, \n    `recallMessage` TEXT, \n    `invitationId` TEXT, \n    `groupInvitationGroupId` TEXT, \n    `groupInviterUid` TEXT, \n    `groupInviteExpireTime` INTEGER, \n    `groupInviteName` TEXT, \n    `groupInviteAvatar` TEXT, \n    `senderNickname` TEXT, \n    `senderEnNickName` TEXT, \n    `lookupSeq` INTEGER, \n    `frontendOption` TEXT, \n    `reactionUpdateTime` INTEGER NOT NULL DEFAULT 0, \n    PRIMARY KEY(`messageId`), \n    FOREIGN KEY(`channelId`) REFERENCES `conversation`(`channelId`) ON UPDATE NO ACTION ON DELETE CASCADE\n)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_message_channelId_seq` ON `message` (`channelId`, `seq`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `conversation` (\n    `channelId` TEXT NOT NULL, \n    `channelType` INTEGER, \n    `groupAtType` INTEGER NOT NULL, \n    `inGroupStatus` INTEGER, \n    `groupStatus` INTEGER, \n    `pinnedStatus` INTEGER NOT NULL,\n     `muteStatus` INTEGER, \n     `role` INTEGER NOT NULL, \n     `unreadCount` INTEGER NOT NULL DEFAULT 0, \n     `unreadMentionedCount` INTEGER NOT NULL DEFAULT 0, \n     `unreadMentionedType` INTEGER, \n     `startMsgSeq` INTEGER, \n     `lastReadMsgSeq` INTEGER, \n     `extra` TEXT, \n     `lastUserMessageId` TEXT,\n     `lastUserMessageSendTime` INTEGER NOT NULL DEFAULT 0, \n     `draftMessage` TEXT, \n     `updateTime` TEXT, \n     `conversationStatus` INTEGER, \n     `relatedId` TEXT, \n     `avatar` TEXT, \n     `nickname` TEXT, \n     `enNickname` TEXT, \n     `tags` TEXT, \n     `groupType` INTEGER, \n     `conversationIcons` TEXT,\n     `entityInfoExtra` TEXT,\n     PRIMARY KEY(`channelId`)\n)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `message_tag` (\n    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \n    `messageId` TEXT NOT NULL, \n    `atUserId` TEXT NOT NULL, \n    FOREIGN KEY(`messageId`) REFERENCES `message`(`messageId`) ON UPDATE NO ACTION ON DELETE CASCADE \n)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_message_tag_messageId` ON `message_tag` (`messageId`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `emoji_reaction` (\n    `emojiReactionId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \n    `messageId` TEXT NOT NULL,\n     `emoji` TEXT NOT NULL, \n     `reactorReactionTime` INTEGER NOT NULL, \n     `reactorUserId` TEXT NOT NULL, \n     `isCurrentUserReaction` INTEGER NOT NULL, \n     FOREIGN KEY(`messageId`) REFERENCES `message`(`messageId`) ON UPDATE NO ACTION ON DELETE CASCADE \n )");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_emoji_reaction_messageId` ON `emoji_reaction` (`messageId`)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_emoji_reaction_messageId_emoji_reactorUserId_reactorReactionTime` ON `emoji_reaction` (`messageId`, `emoji`, `reactorUserId`, `reactorReactionTime`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `reference_message` (\n    `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \n    `channelId` TEXT NOT NULL, \n    `sequence` INTEGER NOT NULL, \n    `content` TEXT, `type` INTEGER NOT NULL, \n    `priority` INTEGER NOT NULL, \n    `referenceSequence` INTEGER NOT NULL, \n    `replaceMessage` TEXT, \n    `replaceMessageType` INTEGER, \n    `visibility` INTEGER, \n    `strategyUids` TEXT, \n    `isCurrentUserInStrategy` INTEGER NOT NULL\n)");
            supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_reference_message_channelId_sequence` ON `reference_message` (`channelId`, `sequence`)");
        }
    }

    /* JADX INFO: renamed from: o.sIp$ComponentName */
    public static final class ComponentName extends Migration {
        public ComponentName() {
            super(28, 29);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE in_house_im_group ADD COLUMN noticeEditTime INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* JADX INFO: renamed from: o.sIp$ComponentCallbacks2 */
    public static final class ComponentCallbacks2 extends Migration {
        public ComponentCallbacks2() {
            super(30, 31);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE message ADD COLUMN streamPlaceholderMessage TEXT DEFAULT NULL");
        }
    }
}
