package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.reactionemoji.EmojiReactionDao;
import com.okinc.okimcore.model.im.inhouseim.ws.ReactionDetail;
import com.okinc.okimcore.model.room.inhouseim.EmojiReactionEntity;
import java.util.Collections;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.sMz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C44361sMz implements EmojiReactionDao {
    public final RoomDatabase AEQbTJ;
    public final sMG OLrzqt = new sMG();
    public final EntityInsertAdapter<EmojiReactionEntity> KWHzl = new EntityInsertAdapter<EmojiReactionEntity>() { // from class: o.sMz.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `emoji_reaction` (`emojiReactionId`,`messageId`,`emoji`,`reactorReactionTime`,`reactorUserId`,`isCurrentUserReaction`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull EmojiReactionEntity emojiReactionEntity) {
            sQLiteStatement.mo5793bindLong(1, emojiReactionEntity.getEmojiReactionId());
            if (emojiReactionEntity.getMessageId() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, emojiReactionEntity.getMessageId());
            }
            if (emojiReactionEntity.getEmoji() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, emojiReactionEntity.getEmoji());
            }
            sQLiteStatement.mo5793bindLong(4, emojiReactionEntity.getReactorReactionTime());
            if (emojiReactionEntity.getReactorUserId() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, emojiReactionEntity.getReactorUserId());
            }
            sQLiteStatement.mo5793bindLong(6, emojiReactionEntity.isCurrentUserReaction() ? 1L : 0L);
        }
    };

    public C44361sMz(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.AEQbTJ = roomDatabase;
    }

    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.reactionemoji.EmojiReactionDao
    public java.lang.Object insertAll(final java.util.List<EmojiReactionEntity> list, Continuation<? super Unit> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.AEQbTJ, false, true, new Function1() { // from class: o.sMI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.copydefault(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit copydefault(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.KWHzl.insert(sQLiteConnection, list);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.reactionemoji.EmojiReactionDao
    public java.lang.Object updateReactionsInTransaction(final java.lang.String str, final java.util.List<EmojiReactionEntity> list, Continuation<? super java.lang.Boolean> continuation) {
        return DBUtil.performInTransactionSuspending(this.AEQbTJ, new Function1() { // from class: o.sMH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.KWHzl(str, list, (Continuation) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Object KWHzl(java.lang.String str, java.util.List list, Continuation continuation) {
        return EmojiReactionDao.TaskDescription.KWHzl(this, str, list, continuation);
    }

    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.reactionemoji.EmojiReactionDao
    public java.lang.Object getReactionsForMessage(final java.lang.String str, Continuation<? super java.util.List<EmojiReactionEntity>> continuation) {
        return DBUtil.performSuspending(this.AEQbTJ, true, false, new Function1() { // from class: o.sMC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44361sMz.EZpvd(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ java.util.List EZpvd(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM emoji_reaction WHERE messageId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "emojiReactionId");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "messageId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "emoji");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "reactorReactionTime");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "reactorUserId");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isCurrentUserReaction");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new EmojiReactionEntity(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6)) != 0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.reactionemoji.EmojiReactionDao
    public java.lang.Object getMessageReactionDetails(final java.lang.String str, Continuation<? super java.util.List<ReactionDetail>> continuation) {
        return DBUtil.performSuspending(this.AEQbTJ, true, true, new Function1() { // from class: o.sMD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.copydefault(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.util.List copydefault(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("\n        WITH message_channel AS (\n            SELECT channelId\n            FROM message\n            WHERE messageId = ?\n            LIMIT 1\n        ),\n        distinct_reactions AS (\n            SELECT DISTINCT\n                r.emoji,\n                r.reactorUserId,\n                r.isCurrentUserReaction,\n                r.reactorReactionTime as updateTime\n            FROM emoji_reaction r\n            WHERE r.messageId = ?\n        ),\n        user_details AS (\n            SELECT \n                dr.emoji,\n                dr.isCurrentUserReaction,\n                dr.updateTime,\n                '{' ||\n                    '\"name\":' || CASE \n                        WHEN gm.member_id IS NULL THEN 'null'\n                        ELSE \n                            CASE \n                                WHEN c.contactUid IS NOT NULL AND c.remarkName IS NOT NULL AND trim(c.remarkName) != '' \n                                THEN '\"' || REPLACE(c.remarkName, '\"', '\\\"') || '\"'\n                                WHEN gm.name IS NULL THEN 'null'\n                                ELSE '\"' || REPLACE(gm.name, '\"', '\\\"') || '\"'\n                            END\n                    END || ',' ||\n                    '\"avatarUrl\":\"' || REPLACE(COALESCE(gm.member_avatar, ''), '\"', '\\\"') || '\",' ||\n                    '\"officialTagInfo\":' || COALESCE(gm.officialTagInfo, '{}') || ',' ||\n                    '\"userUid\":\"' || dr.reactorUserId || '\",' ||\n                    '\"groupRole\":' || COALESCE(gm.role, 'null') || ',' ||\n                    '\"userTagType\":null' ||\n                '}' as user_detail\n            FROM distinct_reactions dr\n            LEFT JOIN message_channel mc\n            LEFT JOIN group_member gm ON dr.reactorUserId = gm.member_id \n                AND gm.group_id = mc.channelId\n            LEFT JOIN contacts c ON dr.reactorUserId = c.contactUid\n        ),\n        emoji_counts AS (\n            SELECT \n                emoji,\n                COUNT(DISTINCT user_detail) as user_count\n            FROM user_details\n            GROUP BY emoji\n        ),\n        sorted_users AS (\n            SELECT \n                ud.*,\n                ec.user_count\n            FROM user_details ud\n            JOIN emoji_counts ec ON ud.emoji = ec.emoji\n            GROUP BY ud.emoji, ud.user_detail\n            ORDER BY ud.isCurrentUserReaction DESC, ud.updateTime ASC\n        )\n        SELECT \n            su.emoji,\n            MAX(CASE WHEN su.isCurrentUserReaction = 1 THEN 1 ELSE 0 END) as isCurrentUserReaction,\n            MAX(su.updateTime) as updateTime,\n            '[' || GROUP_CONCAT(DISTINCT su.user_detail) || ']' as userUids\n        FROM sorted_users su\n        GROUP BY su.emoji\n        ORDER BY \n            su.user_count DESC,\n            su.emoji ASC\n    ");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(2);
            } else {
                sQLiteStatementPrepare.mo5795bindText(2, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "emoji");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isCurrentUserReaction");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userUids");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text = null;
                java.lang.String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2)) != 0;
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                }
                arrayList.add(new ReactionDetail(text2, z, this.OLrzqt.OLrzqt(text), j));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.reactionemoji.EmojiReactionDao
    public java.lang.Object getMessageReactionPrivateChatDetails(final java.lang.String str, Continuation<? super java.util.List<ReactionDetail>> continuation) {
        return DBUtil.performSuspending(this.AEQbTJ, true, true, new Function1() { // from class: o.sMB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.AYXKKw(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.util.List AYXKKw(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("\n        WITH user_details AS (\n            SELECT \n                r.emoji,\n                r.isCurrentUserReaction,\n                r.reactorReactionTime as updateTime,\n                '{' ||\n                    '\"name\":' || CASE \n                        WHEN c.remarkName IS NOT NULL AND trim(c.remarkName) != '' THEN '\"' || REPLACE(c.remarkName, '\"', '\\\"') || '\"'\n                        WHEN c.nickname IS NULL THEN 'null' \n                        ELSE '\"' || REPLACE(c.nickname, '\"', '\\\"') || '\"' \n                    END || ',' ||\n                    '\"avatarUrl\":\"' || REPLACE(COALESCE(c.avatar, ''), '\"', '\\\"') || '\",' ||\n                    '\"officialTagInfo\":{},' ||\n                    '\"userUid\":\"' || r.reactorUserId || '\",' ||\n                    '\"groupRole\":null,' ||\n                    '\"userTagType\":' || CASE \n                        WHEN c.tags IS NULL OR trim(c.tags) = '' THEN 'null'\n                        ELSE '[\"' || REPLACE(c.tags, '\"', '\\\"') || '\"]'\n                    END ||\n                '}' as user_detail\n            FROM emoji_reaction r\n            LEFT JOIN contacts c ON r.reactorUserId = c.contactUid\n            WHERE r.messageId = ?\n        ),\n        emoji_counts AS (\n            SELECT \n                emoji,\n                COUNT(*) as user_count,\n                MAX(updateTime) as latest_update\n            FROM user_details\n            GROUP BY emoji\n        ),\n        sorted_users AS (\n            SELECT \n                ud.*,\n                ec.user_count\n            FROM user_details ud\n            JOIN emoji_counts ec ON ud.emoji = ec.emoji\n            ORDER BY isCurrentUserReaction DESC, updateTime ASC\n        )\n        SELECT \n            su.emoji,\n            MAX(CASE WHEN su.isCurrentUserReaction = 1 THEN 1 ELSE 0 END) as isCurrentUserReaction,\n            MAX(su.updateTime) as updateTime,\n            '[' || GROUP_CONCAT(su.user_detail) || ']' as userUids\n        FROM sorted_users su\n        GROUP BY su.emoji\n        ORDER BY \n            su.user_count DESC,\n            su.emoji ASC\n    ");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "emoji");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isCurrentUserReaction");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userUids");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text = null;
                java.lang.String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                boolean z = ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2)) != 0;
                long j = sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow4)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow4);
                }
                arrayList.add(new ReactionDetail(text2, z, this.OLrzqt.OLrzqt(text), j));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.reactionemoji.EmojiReactionDao
    public java.lang.Object deleteAllForMessage(final java.lang.String str, Continuation<? super Unit> continuation) {
        return DBUtil.performSuspending(this.AEQbTJ, false, true, new Function1() { // from class: o.sMA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44361sMz.KWHzl(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ Unit KWHzl(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM emoji_reaction WHERE messageId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.step();
            return Unit.INSTANCE;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static java.util.List<java.lang.Class<?>> KWHzl() {
        return Collections.emptyList();
    }
}
