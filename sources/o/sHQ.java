package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationSimpleInfoDao;
import com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMConversationSimpleInfoEntity;
import java.util.Collections;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public final class sHQ implements InHouseIMConversationSimpleInfoDao {
    public final EntityInsertAdapter<InHouseIMConversationSimpleInfoEntity> AEQbTJ = new EntityInsertAdapter<InHouseIMConversationSimpleInfoEntity>() { // from class: o.sHQ.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `conversation_simple_info` (`channelId`,`lastMsgTime`,`pinnedStatus`,`isFlagged`,`inGroupStatus`,`lastReadMsgSeq`,`startMsgSeq`,`endMsgSeq`,`updateTime`) VALUES (?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull InHouseIMConversationSimpleInfoEntity inHouseIMConversationSimpleInfoEntity) {
            if (inHouseIMConversationSimpleInfoEntity.getChannelId() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, inHouseIMConversationSimpleInfoEntity.getChannelId());
            }
            if (inHouseIMConversationSimpleInfoEntity.getLastMsgTime() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, inHouseIMConversationSimpleInfoEntity.getLastMsgTime());
            }
            sQLiteStatement.mo5793bindLong(3, inHouseIMConversationSimpleInfoEntity.getPinnedStatus());
            sQLiteStatement.mo5793bindLong(4, inHouseIMConversationSimpleInfoEntity.isFlagged());
            if (inHouseIMConversationSimpleInfoEntity.getInGroupStatus() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, sHQ.this.OLrzqt(inHouseIMConversationSimpleInfoEntity.getInGroupStatus()));
            }
            if (inHouseIMConversationSimpleInfoEntity.getLastReadMsgSeq() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, inHouseIMConversationSimpleInfoEntity.getLastReadMsgSeq());
            }
            if (inHouseIMConversationSimpleInfoEntity.getStartMsgSeq() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, inHouseIMConversationSimpleInfoEntity.getStartMsgSeq());
            }
            if (inHouseIMConversationSimpleInfoEntity.getEndMsgSeq() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, inHouseIMConversationSimpleInfoEntity.getEndMsgSeq());
            }
            if (inHouseIMConversationSimpleInfoEntity.getUpdateTime() == null) {
                sQLiteStatement.mo5794bindNull(9);
            } else {
                sQLiteStatement.mo5795bindText(9, inHouseIMConversationSimpleInfoEntity.getUpdateTime());
            }
        }
    };
    public final RoomDatabase EZpvd;

    public sHQ(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.EZpvd = roomDatabase;
    }

    @Override // com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationSimpleInfoDao
    public java.lang.Object insertAll(final java.util.List<InHouseIMConversationSimpleInfoEntity> list, Continuation<? super Unit> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.EZpvd, false, true, new Function1() { // from class: o.sHP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.KWHzl(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit KWHzl(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.AEQbTJ.insert(sQLiteConnection, list);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationSimpleInfoDao
    public java.lang.Object getAllSimpleConversationInfo(Continuation<? super java.util.List<InHouseIMConversationSimpleInfoEntity>> continuation) {
        return DBUtil.performSuspending(this.EZpvd, true, false, new Function1() { // from class: o.sHR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.EZpvd((androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.util.List EZpvd(androidx.sqlite.SQLiteConnection sQLiteConnection) throws java.lang.Throwable {
        int i;
        InGroupStatus inGroupStatusKWHzl;
        java.lang.String text;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM conversation_simple_info");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, RemoteMessageConst.Notification.CHANNEL_ID);
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastMsgTime");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "pinnedStatus");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isFlagged");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "inGroupStatus");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "lastReadMsgSeq");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "startMsgSeq");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "endMsgSeq");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "updateTime");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                java.lang.String text3 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                int i2 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                int i3 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow5)) {
                    inGroupStatusKWHzl = null;
                    i = columnIndexOrThrow2;
                } else {
                    i = columnIndexOrThrow2;
                    inGroupStatusKWHzl = KWHzl(sQLiteStatementPrepare.getText(columnIndexOrThrow5));
                }
                java.lang.String text4 = sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6);
                java.lang.String text5 = sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7);
                java.lang.String text6 = sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8);
                if (sQLiteStatementPrepare.isNull(columnIndexOrThrow9)) {
                    text = null;
                } else {
                    try {
                        text = sQLiteStatementPrepare.getText(columnIndexOrThrow9);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        sQLiteStatementPrepare.close();
                        throw th;
                    }
                }
                arrayList.add(new InHouseIMConversationSimpleInfoEntity(text2, text3, i2, i3, inGroupStatusKWHzl, text4, text5, text6, text));
                columnIndexOrThrow2 = i;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationSimpleInfoDao
    public java.lang.Object delete(final java.util.Set<java.lang.String> set, Continuation<? super Unit> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DELETE FROM conversation_simple_info WHERE channelId IN (");
        StringUtil.appendPlaceholders(sb, set.size());
        sb.append(")");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.EZpvd, false, true, new Function1() { // from class: o.sHO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sHQ.AEQbTJ(string, set, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ Unit AEQbTJ(java.lang.String str, java.util.Set set, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            java.util.Iterator it = set.iterator();
            int i = 1;
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (str2 == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i);
                } else {
                    sQLiteStatementPrepare.mo5795bindText(i, str2);
                }
                i++;
            }
            sQLiteStatementPrepare.step();
            return Unit.INSTANCE;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.conversation.repository.local.inhouseim.InHouseIMConversationSimpleInfoDao, com.okinc.okimcore.common.database.BaseDao
    public java.lang.String getDaoName() {
        return InHouseIMConversationSimpleInfoDao.Activity.OLrzqt(this);
    }

    public static java.util.List<java.lang.Class<?>> KWHzl() {
        return Collections.emptyList();
    }

    /* JADX INFO: renamed from: o.sHQ$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] EZpvd;

        static {
            int[] iArr = new int[InGroupStatus.values().length];
            EZpvd = iArr;
            try {
                iArr[InGroupStatus.IN_GROUP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                EZpvd[InGroupStatus.NOT_IN_GROUP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                EZpvd[InGroupStatus.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public final java.lang.String OLrzqt(@androidx.annotation.NonNull InGroupStatus inGroupStatus) {
        int i = AnonymousClass5.EZpvd[inGroupStatus.ordinal()];
        if (i == 1) {
            return "IN_GROUP";
        }
        if (i == 2) {
            return "NOT_IN_GROUP";
        }
        if (i == 3) {
            return "UNKNOWN";
        }
        throw new java.lang.IllegalArgumentException("Can't convert enum to string, unknown enum value: " + inGroupStatus);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InGroupStatus KWHzl(@androidx.annotation.NonNull java.lang.String str) {
        byte b;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -608626991) {
            if (iHashCode != 433141802) {
                b = (iHashCode == 1669806789 && str.equals("IN_GROUP")) ? (byte) 2 : (byte) -1;
            } else if (str.equals("UNKNOWN")) {
                b = 1;
            }
        } else if (str.equals("NOT_IN_GROUP")) {
            b = 0;
        }
        if (b == 0) {
            return InGroupStatus.NOT_IN_GROUP;
        }
        if (b == 1) {
            return InGroupStatus.UNKNOWN;
        }
        if (b == 2) {
            return InGroupStatus.IN_GROUP;
        }
        throw new java.lang.IllegalArgumentException("Can't convert value to enum, unknown value: " + str);
    }
}
