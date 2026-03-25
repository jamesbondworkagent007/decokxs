package o;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import com.okinc.market.watch.data.UserGroup;
import java.util.Collections;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: renamed from: o.qWh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C40450qWh implements InterfaceC40448qWf {
    public final EntityInsertAdapter<UserGroup> EZpvd = new EntityInsertAdapter<UserGroup>() { // from class: o.qWh.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.room.EntityInsertAdapter
        public java.lang.String createQuery() {
            return "INSERT OR REPLACE INTO `UserGroup` (`groupName`,`userId`,`groupIndex`,`isHidden`,`isPreset`,`translatedGroupName`) VALUES (?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Method merged with bridge method: bind(Landroidx/sqlite/SQLiteStatement;Ljava/lang/Object;)V */
        @Override // androidx.room.EntityInsertAdapter
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void bind(@androidx.annotation.NonNull androidx.sqlite.SQLiteStatement sQLiteStatement, @androidx.annotation.NonNull UserGroup userGroup) {
            if (userGroup.getGroupName() == null) {
                sQLiteStatement.mo5794bindNull(1);
            } else {
                sQLiteStatement.mo5795bindText(1, userGroup.getGroupName());
            }
            if (userGroup.getUserId() == null) {
                sQLiteStatement.mo5794bindNull(2);
            } else {
                sQLiteStatement.mo5795bindText(2, userGroup.getUserId());
            }
            sQLiteStatement.mo5793bindLong(3, userGroup.getGroupIndex());
            sQLiteStatement.mo5793bindLong(4, userGroup.isHidden() ? 1L : 0L);
            sQLiteStatement.mo5793bindLong(5, userGroup.isPreset() ? 1L : 0L);
            if (userGroup.getTranslatedGroupName() == null) {
                sQLiteStatement.mo5794bindNull(6);
            } else {
                sQLiteStatement.mo5795bindText(6, userGroup.getTranslatedGroupName());
            }
        }
    };
    public final RoomDatabase KWHzl;

    public C40450qWh(@androidx.annotation.NonNull RoomDatabase roomDatabase) {
        this.KWHzl = roomDatabase;
    }

    @Override // o.InterfaceC40448qWf
    public void copydefault(final UserGroup userGroup) {
        userGroup.getClass();
        DBUtil.performBlocking(this.KWHzl, false, true, new Function1() { // from class: o.qWm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return this.OLrzqt.copydefault(userGroup, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public final /* synthetic */ java.lang.Object copydefault(UserGroup userGroup, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        this.EZpvd.insert(sQLiteConnection, userGroup);
        return null;
    }

    @Override // o.InterfaceC40448qWf
    public java.util.List<UserGroup> AEQbTJ(final java.lang.String str) {
        return (java.util.List) DBUtil.performBlocking(this.KWHzl, true, false, new Function1() { // from class: o.qWe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40450qWh.AEQbTJ(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List AEQbTJ(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        boolean z;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM UserGroup WHERE userId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "groupName");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "groupIndex");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isHidden");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isPreset");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "translatedGroupName");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                java.lang.String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                int i2 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                int i3 = columnIndexOrThrow2;
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0) {
                    i = columnIndexOrThrow3;
                    z = true;
                } else {
                    i = columnIndexOrThrow3;
                    z = false;
                }
                arrayList.add(new UserGroup(text, text2, i2, z, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6)));
                columnIndexOrThrow2 = i3;
                columnIndexOrThrow3 = i;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC40448qWf
    public Flow<java.util.List<UserGroup>> EZpvd(final java.lang.String str) {
        return FlowUtil.createFlow(this.KWHzl, false, new java.lang.String[]{"UserGroup"}, new Function1() { // from class: o.qWi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40450qWh.OLrzqt(str, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.util.List OLrzqt(java.lang.String str, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        int i;
        boolean z;
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT * FROM UserGroup WHERE userId = ?");
        try {
            if (str == null) {
                sQLiteStatementPrepare.mo5794bindNull(1);
            } else {
                sQLiteStatementPrepare.mo5795bindText(1, str);
            }
            int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "groupName");
            int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "userId");
            int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "groupIndex");
            int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isHidden");
            int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "isPreset");
            int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "translatedGroupName");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (sQLiteStatementPrepare.step()) {
                java.lang.String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                java.lang.String text2 = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                int i2 = (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3);
                int i3 = columnIndexOrThrow2;
                if (((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow4)) != 0) {
                    i = columnIndexOrThrow3;
                    z = true;
                } else {
                    i = columnIndexOrThrow3;
                    z = false;
                }
                arrayList.add(new UserGroup(text, text2, i2, z, ((int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5)) != 0, sQLiteStatementPrepare.isNull(columnIndexOrThrow6) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow6)));
                columnIndexOrThrow2 = i3;
                columnIndexOrThrow3 = i;
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    @Override // o.InterfaceC40448qWf
    public void OLrzqt(final java.lang.String str, final java.lang.String str2) {
        DBUtil.performBlocking(this.KWHzl, false, true, new Function1() { // from class: o.qWg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40450qWh.KWHzl(str, str2, (androidx.sqlite.SQLiteConnection) obj);
            }
        });
    }

    public static /* synthetic */ java.lang.Object KWHzl(java.lang.String str, java.lang.String str2, androidx.sqlite.SQLiteConnection sQLiteConnection) {
        androidx.sqlite.SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("DELETE FROM UserGroup WHERE userId = ? AND groupName = ?");
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
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return null;
        } catch (java.lang.Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    public static java.util.List<java.lang.Class<?>> AEQbTJ() {
        return Collections.emptyList();
    }
}
