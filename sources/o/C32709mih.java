package o;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.components.report.db.EventData;
import java.util.Collections;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: o.mih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C32709mih implements InterfaceC32710mii {
    public final RoomDatabase EZpvd;
    public final EntityInsertAdapter<EventData> copydefault = new EntityInsertAdapter<EventData>() { // from class: o.mih.2
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `report_event_data` (`_id`,`footprintId`,`act`,`source`,`time`,`path`,`code`,`msg`,`env`,`attrs`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, EventData eventData) {
            sQLiteStatement.mo5793bindLong(1, eventData.id);
            if (eventData.getFootprintId() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, eventData.getFootprintId());
            }
            if (eventData.getAct() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, eventData.getAct());
            }
            if (eventData.getSource() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, eventData.getSource());
            }
            if (eventData.getTime() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5793bindLong(5, eventData.getTime().longValue());
            }
            if (eventData.getPath() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, eventData.getPath());
            }
            if (eventData.getCode() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, eventData.getCode());
            }
            if (eventData.getMsg() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, eventData.getMsg());
            }
            if (eventData.getEnv() == null) {
                sQLiteStatement.mo5794bindNull(9);
            } else {
                sQLiteStatement.mo5795bindText(9, eventData.getEnv());
            }
            java.lang.String strAEQbTJ = C32711mij.AEQbTJ(eventData.getAttrs());
            if (strAEQbTJ == null) {
                sQLiteStatement.mo5794bindNull(10);
            } else {
                sQLiteStatement.mo5795bindText(10, strAEQbTJ);
            }
        }
    };
    public final EntityDeleteOrUpdateAdapter<EventData> OLrzqt = new EntityDeleteOrUpdateAdapter<EventData>() { // from class: o.mih.5
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "DELETE FROM `report_event_data` WHERE `_id` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, EventData eventData) {
            sQLiteStatement.mo5793bindLong(1, eventData.id);
        }
    };
    public final EntityDeleteOrUpdateAdapter<EventData> KWHzl = new EntityDeleteOrUpdateAdapter<EventData>() { // from class: o.mih.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "UPDATE OR ABORT `report_event_data` SET `_id` = ?,`footprintId` = ?,`act` = ?,`source` = ?,`time` = ?,`path` = ?,`code` = ?,`msg` = ?,`env` = ?,`attrs` = ? WHERE `_id` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, EventData eventData) {
            sQLiteStatement.mo5793bindLong(1, eventData.id);
            if (eventData.getFootprintId() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, eventData.getFootprintId());
            }
            if (eventData.getAct() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, eventData.getAct());
            }
            if (eventData.getSource() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, eventData.getSource());
            }
            if (eventData.getTime() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5793bindLong(5, eventData.getTime().longValue());
            }
            if (eventData.getPath() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, eventData.getPath());
            }
            if (eventData.getCode() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, eventData.getCode());
            }
            if (eventData.getMsg() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, eventData.getMsg());
            }
            if (eventData.getEnv() == null) {
                sQLiteStatement.mo5794bindNull(9);
            } else {
                sQLiteStatement.mo5795bindText(9, eventData.getEnv());
            }
            java.lang.String strAEQbTJ = C32711mij.AEQbTJ(eventData.getAttrs());
            if (strAEQbTJ == null) {
                sQLiteStatement.mo5794bindNull(10);
            } else {
                sQLiteStatement.mo5795bindText(10, strAEQbTJ);
            }
            sQLiteStatement.mo5793bindLong(11, eventData.id);
        }
    };

    public C32709mih(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.EZpvd = roomDatabase;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl([Ljava/lang/Object;)[J */
    @Override // o.InterfaceC32703mib
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public long[] KWHzl(final EventData... eventDataArr) {
        eventDataArr.getClass();
        return (long[]) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.mip
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.OLrzqt(eventDataArr, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ long[] OLrzqt(EventData[] eventDataArr, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.copydefault.insertAndReturnIdsArray(sQLiteConnection, eventDataArr);
    }

    @Override // o.InterfaceC32710mii
    public long KWHzl(final EventData eventData) {
        eventData.getClass();
        return ((java.lang.Long) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.min
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.copydefault(eventData, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long copydefault(EventData eventData, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.copydefault.insertAndReturnId(sQLiteConnection, eventData));
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Ljava/lang/Object;)I */
    @Override // o.InterfaceC32703mib
    /* JADX INFO: renamed from: KWHzl, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public int AEQbTJ(final EventData... eventDataArr) {
        eventDataArr.getClass();
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.mig
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.AEQbTJ.EZpvd(eventDataArr, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer EZpvd(EventData[] eventDataArr, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.OLrzqt.handleMultiple(sQLiteConnection, eventDataArr));
    }

    @Override // o.InterfaceC32710mii
    public int copydefault(final EventData eventData) {
        eventData.getClass();
        return ((java.lang.Integer) DBUtil.performBlocking(this.EZpvd, false, true, new Function1() { // from class: o.mio
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.OLrzqt(eventData, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer OLrzqt(EventData eventData, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.KWHzl.handle(sQLiteConnection, eventData));
    }

    @Override // o.InterfaceC32703mib
    public java.util.List<EventData> EZpvd(final int i) {
        return (java.util.List) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.mim
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32709mih.copydefault(i, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List copydefault(int i, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM report_event_data LIMIT ?");
        try {
            sQLiteStatementPrepare.mo5793bindLong(1, i);
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "footprintId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "act");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "source");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CrashHianalyticsData.TIME);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "path");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "code");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "msg");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "env");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "attrs");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                EventData eventData = new EventData();
                eventData.id = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                java.lang.String text = null;
                eventData.setFootprintId(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                eventData.setAct(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                eventData.setSource(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                eventData.setTime(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow5)));
                eventData.setPath(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                eventData.setCode(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                eventData.setMsg(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                eventData.setEnv(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                }
                eventData.setAttrs(C32711mij.EZpvd(text));
                arrayList.add(eventData);
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC32710mii
    public EventData OLrzqt(final java.lang.String str, final java.lang.String str2) {
        return (EventData) DBUtil.performBlocking(this.EZpvd, true, false, new Function1() { // from class: o.mil
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32709mih.OLrzqt(str, str2, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ EventData OLrzqt(java.lang.String str, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM report_event_data WHERE footprintId = ? AND act = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            if (str2 == null) {
                sQLiteStatementPrepare.mo5794bindNull(2);
            } else {
                sQLiteStatementPrepare.mo5795bindText(2, str2);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "_id");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "footprintId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "act");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "source");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, CrashHianalyticsData.TIME);
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "path");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "code");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "msg");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "env");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "attrs");
            EventData eventData = null;
            java.lang.String text = null;
            if (sQLiteStatementPrepare.step()) {
                EventData eventData2 = new EventData();
                eventData2.id = sQLiteStatementPrepare.getLong(columnIndexOrThrow);
                eventData2.setFootprintId(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2));
                eventData2.setAct(sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3));
                eventData2.setSource(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4));
                eventData2.setTime(sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : java.lang.Long.valueOf(sQLiteStatementPrepare.getLong(columnIndexOrThrow5)));
                eventData2.setPath(sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6));
                eventData2.setCode(sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7));
                eventData2.setMsg(sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8));
                eventData2.setEnv(sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9));
                if (!sQLiteStatementPrepare.isNull(columnIndexOrThrow10)) {
                    text = sQLiteStatementPrepare.getText(columnIndexOrThrow10);
                }
                eventData2.setAttrs(C32711mij.EZpvd(text));
                eventData = eventData2;
            }
            return eventData;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    public static java.util.List<java.lang.Class<?>> AEQbTJ() {
        return Collections.emptyList();
    }
}
