package o;

import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteConnectionUtil;
import androidx.room.util.SQLiteStatementUtil;
import com.okinc.business.defi.biz.database.wallet.entity.DAppSearchHistoryEntity;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import o.cJS;

/* JADX INFO: loaded from: classes23.dex */
public final class cJP implements cJS {
    public final RoomDatabase copydefault;
    public final EntityInsertAdapter<DAppSearchHistoryEntity> OLrzqt = new EntityInsertAdapter<DAppSearchHistoryEntity>() { // from class: o.cJP.5
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR ABORT INTO `dapp_search_history` (`balance`,`category`,`deepLink`,`id`,`logo`,`user`,`volume`,`name`,`shortDescribe`,`timestamp`,`type`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull DAppSearchHistoryEntity dAppSearchHistoryEntity) {
            if (dAppSearchHistoryEntity.getBalance() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, dAppSearchHistoryEntity.getBalance());
            }
            sQLiteStatement.mo5793bindLong(2, dAppSearchHistoryEntity.getCategory());
            if (dAppSearchHistoryEntity.getDeepLink() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, dAppSearchHistoryEntity.getDeepLink());
            }
            if (dAppSearchHistoryEntity.getId() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, dAppSearchHistoryEntity.getId());
            }
            if (dAppSearchHistoryEntity.getLogo() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, dAppSearchHistoryEntity.getLogo());
            }
            if (dAppSearchHistoryEntity.getUser() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, dAppSearchHistoryEntity.getUser());
            }
            if (dAppSearchHistoryEntity.getVolume() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, dAppSearchHistoryEntity.getVolume());
            }
            if (dAppSearchHistoryEntity.getName() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, dAppSearchHistoryEntity.getName());
            }
            if (dAppSearchHistoryEntity.getShortDescribe() == null) {
                sQLiteStatement.mo5794bindNull(9);
            } else {
                sQLiteStatement.mo5795bindText(9, dAppSearchHistoryEntity.getShortDescribe());
            }
            sQLiteStatement.mo5793bindLong(10, dAppSearchHistoryEntity.getTimestamp());
            sQLiteStatement.mo5793bindLong(11, dAppSearchHistoryEntity.getType());
        }
    };
    public final EntityInsertAdapter<DAppSearchHistoryEntity> KWHzl = new EntityInsertAdapter<DAppSearchHistoryEntity>() { // from class: o.cJP.4
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `dapp_search_history` (`balance`,`category`,`deepLink`,`id`,`logo`,`user`,`volume`,`name`,`shortDescribe`,`timestamp`,`type`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull DAppSearchHistoryEntity dAppSearchHistoryEntity) {
            if (dAppSearchHistoryEntity.getBalance() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, dAppSearchHistoryEntity.getBalance());
            }
            sQLiteStatement.mo5793bindLong(2, dAppSearchHistoryEntity.getCategory());
            if (dAppSearchHistoryEntity.getDeepLink() == null) {
                sQLiteStatement.mo5794bindNull(3);
            } else {
                sQLiteStatement.mo5795bindText(3, dAppSearchHistoryEntity.getDeepLink());
            }
            if (dAppSearchHistoryEntity.getId() == null) {
                sQLiteStatement.mo5794bindNull(4);
            } else {
                sQLiteStatement.mo5795bindText(4, dAppSearchHistoryEntity.getId());
            }
            if (dAppSearchHistoryEntity.getLogo() == null) {
                sQLiteStatement.mo5794bindNull(5);
            } else {
                sQLiteStatement.mo5795bindText(5, dAppSearchHistoryEntity.getLogo());
            }
            if (dAppSearchHistoryEntity.getUser() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, dAppSearchHistoryEntity.getUser());
            }
            if (dAppSearchHistoryEntity.getVolume() == null) {
                sQLiteStatement.mo5794bindNull(7);
            } else {
                sQLiteStatement.mo5795bindText(7, dAppSearchHistoryEntity.getVolume());
            }
            if (dAppSearchHistoryEntity.getName() == null) {
                sQLiteStatement.mo5794bindNull(8);
            } else {
                sQLiteStatement.mo5795bindText(8, dAppSearchHistoryEntity.getName());
            }
            if (dAppSearchHistoryEntity.getShortDescribe() == null) {
                sQLiteStatement.mo5794bindNull(9);
            } else {
                sQLiteStatement.mo5795bindText(9, dAppSearchHistoryEntity.getShortDescribe());
            }
            sQLiteStatement.mo5793bindLong(10, dAppSearchHistoryEntity.getTimestamp());
            sQLiteStatement.mo5793bindLong(11, dAppSearchHistoryEntity.getType());
        }
    };
    public final EntityDeleteOrUpdateAdapter<DAppSearchHistoryEntity> AEQbTJ = new EntityDeleteOrUpdateAdapter<DAppSearchHistoryEntity>() { // from class: o.cJP.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        public java.lang.String createQuery() {
            return "DELETE FROM `dapp_search_history` WHERE `deepLink` = ? AND `type` = ?";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityDeleteOrUpdateAdapter
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull DAppSearchHistoryEntity dAppSearchHistoryEntity) {
            if (dAppSearchHistoryEntity.getDeepLink() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, dAppSearchHistoryEntity.getDeepLink());
            }
            sQLiteStatement.mo5793bindLong(2, dAppSearchHistoryEntity.getType());
        }
    };

    public cJP(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.copydefault = roomDatabase;
    }

    @Override // o.cJS
    public long copydefault(final DAppSearchHistoryEntity dAppSearchHistoryEntity) {
        dAppSearchHistoryEntity.getClass();
        return ((java.lang.Long) DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.cKb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.EZpvd(dAppSearchHistoryEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long EZpvd(DAppSearchHistoryEntity dAppSearchHistoryEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.OLrzqt.insertAndReturnId(sQLiteConnection, dAppSearchHistoryEntity));
    }

    @Override // o.cJS
    public java.util.List<java.lang.Long> copydefault(final java.util.List<DAppSearchHistoryEntity> list) {
        list.getClass();
        return (java.util.List) DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.cKc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.copydefault.OLrzqt(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.util.List OLrzqt(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return this.KWHzl.insertAndReturnIdsList(sQLiteConnection, list);
    }

    @Override // o.cJS
    public long OLrzqt(final DAppSearchHistoryEntity dAppSearchHistoryEntity) {
        dAppSearchHistoryEntity.getClass();
        return ((java.lang.Long) DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.cKh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.copydefault(dAppSearchHistoryEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).longValue();
    }

    public final /* synthetic */ java.lang.Long copydefault(DAppSearchHistoryEntity dAppSearchHistoryEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Long.valueOf(this.KWHzl.insertAndReturnId(sQLiteConnection, dAppSearchHistoryEntity));
    }

    @Override // o.cJS
    public int AEQbTJ(final DAppSearchHistoryEntity dAppSearchHistoryEntity) {
        dAppSearchHistoryEntity.getClass();
        return ((java.lang.Integer) DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.cJX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.KWHzl.OLrzqt(dAppSearchHistoryEntity, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public final /* synthetic */ java.lang.Integer OLrzqt(DAppSearchHistoryEntity dAppSearchHistoryEntity, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        return java.lang.Integer.valueOf(this.AEQbTJ.handle(sQLiteConnection, dAppSearchHistoryEntity));
    }

    @Override // o.cJS
    public void OLrzqt(final java.util.List<DAppSearchHistoryEntity> list) {
        DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.cJT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.EZpvd.copydefault(list, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ Unit copydefault(java.util.List list, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        cJS.Application.copydefault(this, list);
        return Unit.INSTANCE;
    }

    @Override // o.cJS
    public java.util.List<DAppSearchHistoryEntity> AEQbTJ() {
        return (java.util.List) DBUtil.performBlocking(this.copydefault, true, false, new Function1() { // from class: o.cJY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cJP.DbNXlk((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List DbNXlk(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM dapp_search_history WHERE type = 0");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "balance");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deepLink");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logo");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "user");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "volume");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "shortDescribe");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new DAppSearchHistoryEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cJS
    public DAppSearchHistoryEntity EZpvd(final java.lang.String str) {
        return (DAppSearchHistoryEntity) DBUtil.performBlocking(this.copydefault, true, false, new Function1() { // from class: o.cKg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cJP.copydefault(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ DAppSearchHistoryEntity copydefault(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        DAppSearchHistoryEntity dAppSearchHistoryEntity;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM dapp_search_history WHERE deepLink = ? AND type = 0 LIMIT 1");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "balance");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deepLink");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logo");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "user");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "volume");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "shortDescribe");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            if (sQLiteStatementPrepare.step()) {
                dAppSearchHistoryEntity = new DAppSearchHistoryEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11));
            } else {
                dAppSearchHistoryEntity = null;
            }
            return dAppSearchHistoryEntity;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cJS
    public int gEmmrt() {
        return ((java.lang.Integer) DBUtil.performBlocking(this.copydefault, true, false, new Function1() { // from class: o.cJZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cJP.isConnected((androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer isConnected(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT count(*) FROM dapp_search_history WHERE type = 0");
        try {
            int i = sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0;
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(i);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.cJS
    public java.util.List<DAppSearchHistoryEntity> OLrzqt() {
        return (java.util.List) DBUtil.performBlocking(this.copydefault, true, false, new Function1() { // from class: o.cKd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cJP.values((androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List values(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM dapp_search_history WHERE type = 1");
        try {
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "balance");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "category");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "deepLink");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "id");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "logo");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "user");
            int columnIndexOrThrow7 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "volume");
            int columnIndexOrThrow8 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "name");
            int columnIndexOrThrow9 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "shortDescribe");
            int columnIndexOrThrow10 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
            int columnIndexOrThrow11 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(new DAppSearchHistoryEntity(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow2), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4), sQLiteStatementPrepare.isNull(columnIndexOrThrow5) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow5), sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6), sQLiteStatementPrepare.isNull(columnIndexOrThrow7) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow7), sQLiteStatementPrepare.isNull(columnIndexOrThrow8) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow8), sQLiteStatementPrepare.isNull(columnIndexOrThrow9) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow9), sQLiteStatementPrepare.getLong(columnIndexOrThrow10), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow11)));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.cJS
    public int valueOf() {
        return ((java.lang.Integer) DBUtil.performBlocking(this.copydefault, true, false, new Function1() { // from class: o.cJV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cJP.fetchVPNInfo((androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer fetchVPNInfo(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT count(*) FROM dapp_search_history WHERE type = 1");
        try {
            int i = sQLiteStatementPrepare.step() ? (int) sQLiteStatementPrepare.getLong(0) : 0;
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(i);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.cJS
    public int KWHzl() {
        return ((java.lang.Integer) DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.cKa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cJP.valueOf((androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer valueOf(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM dapp_search_history WHERE type = 0");
        try {
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.cJS
    public int copydefault() {
        return ((java.lang.Integer) DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.cJW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cJP.djBIcL((androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer djBIcL(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM dapp_search_history WHERE type = 0 AND id = (SELECT id FROM dapp_search_history WHERE type = 0 LIMIT 1)");
        try {
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.cJS
    public int EZpvd() {
        return ((java.lang.Integer) DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.cKe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cJP.gEmmrt((androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer gEmmrt(androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM dapp_search_history WHERE type = 1 AND rowid = (SELECT rowid FROM dapp_search_history WHERE type = 1 ORDER BY timestamp ASC, rowid ASC LIMIT 1)");
        try {
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    @Override // o.cJS
    public int AEQbTJ(final java.lang.String str) {
        return ((java.lang.Integer) DBUtil.performBlocking(this.copydefault, false, true, new Function1() { // from class: o.cJU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cJP.AEQbTJ(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        })).intValue();
    }

    public static /* synthetic */ java.lang.Integer AEQbTJ(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM dapp_search_history WHERE type = 1 AND id = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            sQLiteStatementPrepare.step();
            int totalChangedRows = SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection);
            sQLiteStatementPrepare.close();
            return java.lang.Integer.valueOf(totalChangedRows);
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static java.util.List<java.lang.Class<?>> djBIcL() {
        return Collections.emptyList();
    }
}
