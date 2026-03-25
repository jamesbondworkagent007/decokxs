package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageHandlingDao;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageHandling;
import java.util.Collections;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public final class sLV implements InHouseIMMessageHandlingDao {
    public final RoomDatabase AEQbTJ;
    public final sIO OLrzqt = new sIO();
    public final EntityInsertAdapter<InHouseIMMessageHandling> KWHzl = new EntityInsertAdapter<InHouseIMMessageHandling>() { // from class: o.sLV.3
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `reference_message` (`id`,`channelId`,`sequence`,`content`,`type`,`priority`,`referenceSequence`,`replaceMessage`,`replaceMessageType`,`visibility`,`strategyUids`,`isCurrentUserInStrategy`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull InHouseIMMessageHandling inHouseIMMessageHandling) {
            sQLiteStatement.mo5793bindLong(1, inHouseIMMessageHandling.getId());
            if (inHouseIMMessageHandling.getChannelId() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, inHouseIMMessageHandling.getChannelId());
            }
            sQLiteStatement.mo5793bindLong(3, inHouseIMMessageHandling.getSequence());
            if (inHouseIMMessageHandling.getContent() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, inHouseIMMessageHandling.getContent());
            }
            sQLiteStatement.mo5793bindLong(5, inHouseIMMessageHandling.getType());
            sQLiteStatement.mo5793bindLong(6, inHouseIMMessageHandling.getPriority());
            sQLiteStatement.mo5793bindLong(7, inHouseIMMessageHandling.getReferenceSequence());
            if (inHouseIMMessageHandling.getReplaceMessage() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, inHouseIMMessageHandling.getReplaceMessage());
            }
            if (inHouseIMMessageHandling.getReplaceMessageType() == null) {
                sQLiteStatement.mo5794bindNull(9);
            } else {
                sQLiteStatement.mo5793bindLong(9, inHouseIMMessageHandling.getReplaceMessageType().intValue());
            }
            if (inHouseIMMessageHandling.getVisibility() == null) {
                sQLiteStatement.mo5794bindNull(10);
            } else {
                sQLiteStatement.mo5793bindLong(10, inHouseIMMessageHandling.getVisibility().intValue());
            }
            java.lang.String strOLrzqt = sLV.this.OLrzqt.OLrzqt(inHouseIMMessageHandling.getStrategyUids());
            if (strOLrzqt == null) {
                sQLiteStatement.mo5794bindNull(11);
            } else {
                sQLiteStatement.mo5795bindText(11, strOLrzqt);
            }
            sQLiteStatement.mo5793bindLong(12, inHouseIMMessageHandling.isCurrentUserInStrategy() ? 1L : 0L);
        }
    };

    public sLV(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.AEQbTJ = roomDatabase;
    }

    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageHandlingDao
    public java.lang.Object coreInsertOrReplace(final java.util.List<InHouseIMMessageHandling> list, Continuation<? super Unit> continuation) {
        list.getClass();
        return DBUtil.performSuspending(this.AEQbTJ, false, true, new Function1() { // from class: o.sMc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.AEQbTJ(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ Unit AEQbTJ(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.KWHzl.insert(sQLiteConnection, list);
        return Unit.INSTANCE;
    }

    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageHandlingDao
    public java.lang.Object insertOrReplaceByChannel(final java.lang.String str, final java.util.List<InHouseIMMessageHandling> list, Continuation<? super Unit> continuation) {
        return DBUtil.performInTransactionSuspending(this.AEQbTJ, new Function1() { // from class: o.sMe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.EZpvd(str, list, (Continuation) obj);
            }
        }, continuation);
    }

    public final /* synthetic */ java.lang.Object EZpvd(java.lang.String str, java.util.List list, Continuation continuation) {
        return InHouseIMMessageHandlingDao.Activity.KWHzl(this, str, list, continuation);
    }

    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageHandlingDao
    public java.lang.Object getHighestPriorityMessageHandling(final java.lang.String str, final long j, Continuation<? super InHouseIMMessageHandling> continuation) {
        return DBUtil.performSuspending(this.AEQbTJ, true, false, new Function1() { // from class: o.sMa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.KWHzl(str, j, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final /* synthetic */ InHouseIMMessageHandling KWHzl(java.lang.String str, long j, androidx.sqlite.SQLiteConnection sQLiteConnection) throws java.lang.Throwable {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("\n        SELECT * FROM reference_message \n        WHERE channelId = ?\n        AND referenceSequence = ?\n        AND visibility IS NOT NULL\n        AND (\n            strategyUids IS NULL \n            OR isCurrentUserInStrategy = 1\n        )\n        ORDER BY priority DESC\n        LIMIT 1\n    ");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.mo5793bindLong(2, j);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, RemoteMessageConst.Notification.CHANNEL_ID);
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, MTPushConstants.Operation.KEY_SEQUENCE);
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "content");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, RemoteMessageConst.Notification.PRIORITY);
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "referenceSequence");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "replaceMessage");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "replaceMessageType");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "visibility");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "strategyUids");
            int columnIndexOrThrow12 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isCurrentUserInStrategy");
            InHouseIMMessageHandling inHouseIMMessageHandling = null;
            if (sQLiteStatementPrepare.step()) {
                try {
                    inHouseIMMessageHandling = new InHouseIMMessageHandling(sQLiteStatementPrepare.getLong(columnIndexOrThrow), sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2), sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow6), sQLiteStatementPrepare.getLong(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow9)), sQLiteStatementPrepare.isNull(columnIndexOrThrow10) ? null : java.lang.Integer.valueOf((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow10)), this.OLrzqt.OLrzqt(sQLiteStatementPrepare.isNull(columnIndexOrThrow11) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow11)), ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow12)) != 0);
                } catch (java.lang.Throwable th) {
                    th = th;
                    sQLiteStatementPrepare.close();
                    throw th;
                }
            }
            sQLiteStatementPrepare.close();
            return inHouseIMMessageHandling;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageHandlingDao
    public java.lang.Object deleteByBatch(final java.lang.String str, final java.util.Set<java.lang.Long> set, Continuation<? super Unit> continuation) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("\n");
        sb.append("        DELETE FROM reference_message ");
        sb.append("\n");
        sb.append("        WHERE channelId=");
        sb.append("?");
        sb.append(" ");
        sb.append("\n");
        sb.append("        AND sequence IN (");
        StringUtil.appendPlaceholders(sb, set.size());
        sb.append(") ");
        sb.append("\n");
        sb.append("    ");
        final java.lang.String string = sb.toString();
        return DBUtil.performSuspending(this.AEQbTJ, false, true, new Function1() { // from class: o.sMb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sLV.AEQbTJ(string, str, set, (androidx.sqlite.SQLiteConnection) obj);
            }
        }, continuation);
    }

    public static /* synthetic */ Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.util.Set set, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            if (str2 == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str2);
            }
            java.util.Iterator it = set.iterator();
            int i = 2;
            while (it.hasNext()) {
                java.lang.Long l = (java.lang.Long) it.next();
                if (l == null) {
                    sQLiteStatementPrepare.mo5794bindNull(i);
                } else {
                    sQLiteStatementPrepare.mo5793bindLong(i, l.longValue());
                }
                i++;
            }
            sQLiteStatementPrepare.step();
            return Unit.INSTANCE;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // com.okinc.okimcore.feature.message.repository.local.inhouseim.InHouseIMMessageHandlingDao, com.okinc.okimcore.common.database.BaseDao
    public java.lang.String getDaoName() {
        return InHouseIMMessageHandlingDao.Activity.EZpvd(this);
    }

    public static java.util.List<java.lang.Class<?>> AEQbTJ() {
        return Collections.emptyList();
    }
}
