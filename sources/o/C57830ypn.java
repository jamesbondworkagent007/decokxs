package o;

import android.database.sqlite.SQLiteDatabase;
import com.onesignal.OneSignal;

/* JADX INFO: renamed from: o.ypn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57830ypn extends android.database.sqlite.SQLiteOpenHelper implements InterfaceC57833ypq {
    public static C57830ypn EZpvd;
    public static final java.lang.Object KWHzl = new java.lang.Object();
    public static final java.lang.String[] AEQbTJ = {"CREATE INDEX notification_notification_id_idx ON notification(notification_id); ", "CREATE INDEX notification_android_notification_id_idx ON notification(android_notification_id); ", "CREATE INDEX notification_group_id_idx ON notification(group_id); ", "CREATE INDEX notification_collapse_id_idx ON notification(collapse_id); ", "CREATE INDEX notification_created_time_idx ON notification(created_time); ", "CREATE INDEX notification_expire_time_idx ON notification(expire_time); "};
    public static InterfaceC57738yoA OLrzqt = new C57785yov();
    public static C57886yqq copydefault = new C57886yqq();

    public static int KWHzl() {
        return 8;
    }

    public C57830ypn(android.content.Context context) {
        super(context, "OneSignal.db", (SQLiteDatabase.CursorFactory) null, KWHzl());
    }

    public static C57830ypn KWHzl(android.content.Context context) {
        if (EZpvd == null) {
            synchronized (KWHzl) {
                if (EZpvd == null) {
                    EZpvd = new C57830ypn(context.getApplicationContext());
                }
            }
        }
        return EZpvd;
    }

    public final android.database.sqlite.SQLiteDatabase copydefault() {
        android.database.sqlite.SQLiteDatabase writableDatabase;
        synchronized (KWHzl) {
            try {
                try {
                    writableDatabase = getWritableDatabase();
                } catch (android.database.sqlite.SQLiteCantOpenDatabaseException e) {
                    throw e;
                } catch (android.database.sqlite.SQLiteDatabaseLockedException e2) {
                    throw e2;
                }
            } finally {
            }
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0018 A[Catch: all -> 0x000b, LOOP:0: B:21:0x0005->B:17:0x0018, LOOP_END, TryCatch #2 {all -> 0x000b, blocks: (B:5:0x0005, B:6:0x0009, B:15:0x0013, B:17:0x0018, B:18:0x001f), top: B:21:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x001f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.database.sqlite.SQLiteDatabase OLrzqt() {
        android.database.sqlite.SQLiteDatabase sQLiteDatabaseCopydefault;
        synchronized (KWHzl) {
            java.lang.Throwable th = null;
            int i = 0;
            while (true) {
                try {
                    try {
                        sQLiteDatabaseCopydefault = copydefault();
                    } catch (android.database.sqlite.SQLiteCantOpenDatabaseException e) {
                        e = e;
                        if (th == null) {
                            th = e;
                        }
                        i++;
                        if (i < 5) {
                            throw th;
                        }
                        android.os.SystemClock.sleep(i * 400);
                    } catch (android.database.sqlite.SQLiteDatabaseLockedException e2) {
                        e = e2;
                        if (th == null) {
                        }
                        i++;
                        if (i < 5) {
                        }
                    }
                    android.os.SystemClock.sleep(i * 400);
                } catch (java.lang.Throwable th2) {
                    throw th2;
                }
            }
        }
        return sQLiteDatabaseCopydefault;
    }

    @Override // o.InterfaceC57833ypq
    public android.database.Cursor KWHzl(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.Nullable java.lang.String[] strArr, @androidx.annotation.Nullable java.lang.String str2, java.lang.String[] strArr2, @androidx.annotation.Nullable java.lang.String str3, @androidx.annotation.Nullable java.lang.String str4, @androidx.annotation.Nullable java.lang.String str5) {
        android.database.Cursor cursorQuery;
        synchronized (KWHzl) {
            cursorQuery = OLrzqt().query(str, strArr, str2, strArr2, str3, str4, str5);
        }
        return cursorQuery;
    }

    @Override // o.InterfaceC57833ypq
    public android.database.Cursor copydefault(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.Nullable java.lang.String[] strArr, @androidx.annotation.Nullable java.lang.String str2, @androidx.annotation.Nullable java.lang.String[] strArr2, @androidx.annotation.Nullable java.lang.String str3, @androidx.annotation.Nullable java.lang.String str4, @androidx.annotation.Nullable java.lang.String str5, @androidx.annotation.Nullable java.lang.String str6) {
        android.database.Cursor cursorQuery;
        synchronized (KWHzl) {
            cursorQuery = OLrzqt().query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        }
        return cursorQuery;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [223=4] */
    @Override // o.InterfaceC57833ypq
    public void EZpvd(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.Nullable java.lang.String str2, @androidx.annotation.Nullable android.content.ContentValues contentValues) {
        InterfaceC57738yoA interfaceC57738yoA;
        synchronized (KWHzl) {
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseOLrzqt = OLrzqt();
            try {
                try {
                    sQLiteDatabaseOLrzqt.beginTransaction();
                    sQLiteDatabaseOLrzqt.insert(str, str2, contentValues);
                    sQLiteDatabaseOLrzqt.setTransactionSuccessful();
                    try {
                        sQLiteDatabaseOLrzqt.endTransaction();
                    } catch (android.database.sqlite.SQLiteException e) {
                        e = e;
                        OLrzqt.KWHzl("Error closing transaction! ", e);
                    } catch (java.lang.IllegalStateException e2) {
                        e = e2;
                        interfaceC57738yoA = OLrzqt;
                        interfaceC57738yoA.KWHzl("Error closing transaction! ", e);
                    }
                } catch (android.database.sqlite.SQLiteException e3) {
                    OLrzqt.KWHzl("Error inserting on table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e3);
                    if (sQLiteDatabaseOLrzqt != null) {
                        try {
                            sQLiteDatabaseOLrzqt.endTransaction();
                        } catch (android.database.sqlite.SQLiteException e4) {
                            e = e4;
                            OLrzqt.KWHzl("Error closing transaction! ", e);
                        } catch (java.lang.IllegalStateException e5) {
                            e = e5;
                            interfaceC57738yoA = OLrzqt;
                            interfaceC57738yoA.KWHzl("Error closing transaction! ", e);
                        }
                    }
                } catch (java.lang.IllegalStateException e6) {
                    OLrzqt.KWHzl("Error under inserting transaction under table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e6);
                    if (sQLiteDatabaseOLrzqt != null) {
                        try {
                            sQLiteDatabaseOLrzqt.endTransaction();
                        } catch (android.database.sqlite.SQLiteException e7) {
                            e = e7;
                            OLrzqt.KWHzl("Error closing transaction! ", e);
                        } catch (java.lang.IllegalStateException e8) {
                            e = e8;
                            interfaceC57738yoA = OLrzqt;
                            interfaceC57738yoA.KWHzl("Error closing transaction! ", e);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [250=4] */
    public void AEQbTJ(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.Nullable java.lang.String str2, @androidx.annotation.Nullable android.content.ContentValues contentValues) throws android.database.SQLException {
        InterfaceC57738yoA interfaceC57738yoA;
        synchronized (KWHzl) {
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseOLrzqt = OLrzqt();
            try {
                try {
                    sQLiteDatabaseOLrzqt.beginTransaction();
                    sQLiteDatabaseOLrzqt.insertOrThrow(str, str2, contentValues);
                    sQLiteDatabaseOLrzqt.setTransactionSuccessful();
                    try {
                        sQLiteDatabaseOLrzqt.endTransaction();
                    } catch (android.database.sqlite.SQLiteException e) {
                        e = e;
                        OLrzqt.KWHzl("Error closing transaction! ", e);
                    } catch (java.lang.IllegalStateException e2) {
                        e = e2;
                        interfaceC57738yoA = OLrzqt;
                        interfaceC57738yoA.KWHzl("Error closing transaction! ", e);
                    }
                } catch (android.database.sqlite.SQLiteException e3) {
                    OLrzqt.KWHzl("Error inserting or throw on table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e3);
                    if (sQLiteDatabaseOLrzqt != null) {
                        try {
                            sQLiteDatabaseOLrzqt.endTransaction();
                        } catch (android.database.sqlite.SQLiteException e4) {
                            e = e4;
                            OLrzqt.KWHzl("Error closing transaction! ", e);
                        } catch (java.lang.IllegalStateException e5) {
                            e = e5;
                            interfaceC57738yoA = OLrzqt;
                            interfaceC57738yoA.KWHzl("Error closing transaction! ", e);
                        }
                    }
                } catch (java.lang.IllegalStateException e6) {
                    OLrzqt.KWHzl("Error under inserting or throw transaction under table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e6);
                    if (sQLiteDatabaseOLrzqt != null) {
                        try {
                            sQLiteDatabaseOLrzqt.endTransaction();
                        } catch (android.database.sqlite.SQLiteException e7) {
                            e = e7;
                            OLrzqt.KWHzl("Error closing transaction! ", e);
                        } catch (java.lang.IllegalStateException e8) {
                            e = e8;
                            interfaceC57738yoA = OLrzqt;
                            interfaceC57738yoA.KWHzl("Error closing transaction! ", e);
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [280=4] */
    @Override // o.InterfaceC57833ypq
    public int AEQbTJ(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull android.content.ContentValues contentValues, @androidx.annotation.Nullable java.lang.String str2, @androidx.annotation.Nullable java.lang.String[] strArr) {
        InterfaceC57738yoA interfaceC57738yoA;
        int iUpdate = 0;
        if (contentValues == null || contentValues.toString().isEmpty()) {
            return 0;
        }
        synchronized (KWHzl) {
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseOLrzqt = OLrzqt();
            try {
                try {
                    sQLiteDatabaseOLrzqt.beginTransaction();
                    iUpdate = sQLiteDatabaseOLrzqt.update(str, contentValues, str2, strArr);
                    sQLiteDatabaseOLrzqt.setTransactionSuccessful();
                    try {
                        sQLiteDatabaseOLrzqt.endTransaction();
                    } catch (android.database.sqlite.SQLiteException e) {
                        e = e;
                        OLrzqt.KWHzl("Error closing transaction! ", e);
                    } catch (java.lang.IllegalStateException e2) {
                        e = e2;
                        interfaceC57738yoA = OLrzqt;
                        interfaceC57738yoA.KWHzl("Error closing transaction! ", e);
                    }
                } catch (android.database.sqlite.SQLiteException e3) {
                    OLrzqt.KWHzl("Error updating on table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e3);
                    if (sQLiteDatabaseOLrzqt != null) {
                        try {
                            sQLiteDatabaseOLrzqt.endTransaction();
                        } catch (android.database.sqlite.SQLiteException e4) {
                            e = e4;
                            OLrzqt.KWHzl("Error closing transaction! ", e);
                        } catch (java.lang.IllegalStateException e5) {
                            e = e5;
                            interfaceC57738yoA = OLrzqt;
                            interfaceC57738yoA.KWHzl("Error closing transaction! ", e);
                        }
                    }
                } catch (java.lang.IllegalStateException e6) {
                    OLrzqt.KWHzl("Error under update transaction under table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e6);
                    if (sQLiteDatabaseOLrzqt != null) {
                        try {
                            sQLiteDatabaseOLrzqt.endTransaction();
                        } catch (android.database.sqlite.SQLiteException e7) {
                            e = e7;
                            OLrzqt.KWHzl("Error closing transaction! ", e);
                        } catch (java.lang.IllegalStateException e8) {
                            e = e8;
                            interfaceC57738yoA = OLrzqt;
                            interfaceC57738yoA.KWHzl("Error closing transaction! ", e);
                        }
                    }
                }
            } finally {
            }
        }
        return iUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [307=4] */
    @Override // o.InterfaceC57833ypq
    public void AEQbTJ(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.Nullable java.lang.String str2, @androidx.annotation.Nullable java.lang.String[] strArr) {
        InterfaceC57738yoA interfaceC57738yoA;
        synchronized (KWHzl) {
            android.database.sqlite.SQLiteDatabase sQLiteDatabaseOLrzqt = OLrzqt();
            try {
                try {
                    sQLiteDatabaseOLrzqt.beginTransaction();
                    sQLiteDatabaseOLrzqt.delete(str, str2, strArr);
                    sQLiteDatabaseOLrzqt.setTransactionSuccessful();
                    try {
                        sQLiteDatabaseOLrzqt.endTransaction();
                    } catch (android.database.sqlite.SQLiteException e) {
                        e = e;
                        OLrzqt.KWHzl("Error closing transaction! ", e);
                    } catch (java.lang.IllegalStateException e2) {
                        e = e2;
                        interfaceC57738yoA = OLrzqt;
                        interfaceC57738yoA.KWHzl("Error closing transaction! ", e);
                    }
                } catch (android.database.sqlite.SQLiteException e3) {
                    OLrzqt.KWHzl("Error deleting on table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e3);
                    if (sQLiteDatabaseOLrzqt != null) {
                        try {
                            sQLiteDatabaseOLrzqt.endTransaction();
                        } catch (android.database.sqlite.SQLiteException e4) {
                            e = e4;
                            OLrzqt.KWHzl("Error closing transaction! ", e);
                        } catch (java.lang.IllegalStateException e5) {
                            e = e5;
                            interfaceC57738yoA = OLrzqt;
                            interfaceC57738yoA.KWHzl("Error closing transaction! ", e);
                        }
                    }
                } catch (java.lang.IllegalStateException e6) {
                    OLrzqt.KWHzl("Error under delete transaction under table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e6);
                    if (sQLiteDatabaseOLrzqt != null) {
                        try {
                            sQLiteDatabaseOLrzqt.endTransaction();
                        } catch (android.database.sqlite.SQLiteException e7) {
                            e = e7;
                            OLrzqt.KWHzl("Error closing transaction! ", e);
                        } catch (java.lang.IllegalStateException e8) {
                            e = e8;
                            interfaceC57738yoA = OLrzqt;
                            interfaceC57738yoA.KWHzl("Error closing transaction! ", e);
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        synchronized (KWHzl) {
            sQLiteDatabase.execSQL("CREATE TABLE notification (_id INTEGER PRIMARY KEY,notification_id TEXT,android_notification_id INTEGER,group_id TEXT,collapse_id TEXT,is_summary INTEGER DEFAULT 0,opened INTEGER DEFAULT 0,dismissed INTEGER DEFAULT 0,title TEXT,message TEXT,full_data TEXT,created_time TIMESTAMP DEFAULT (strftime('%s', 'now')),expire_time TIMESTAMP);");
            sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);");
            for (java.lang.String str : AEQbTJ) {
                sQLiteDatabase.execSQL(str);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.DEBUG, "OneSignal Database onUpgrade from: " + i + " to: " + i2);
        synchronized (KWHzl) {
            try {
                AEQbTJ(sQLiteDatabase, i);
            } catch (android.database.sqlite.SQLiteException e) {
                OneSignal.OLrzqt(OneSignal.LOG_LEVEL.ERROR, "Error in upgrade, migration may have already run! Skipping!", e);
            }
        }
    }

    public final void AEQbTJ(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i) {
        if (i < 2) {
            copydefault(sQLiteDatabase);
        }
        if (i < 3) {
            OLrzqt(sQLiteDatabase);
        }
        if (i < 4) {
            EZpvd(sQLiteDatabase);
        }
        if (i < 5) {
            KWHzl(sQLiteDatabase);
        }
        if (i == 5) {
            AEQbTJ(sQLiteDatabase);
        }
        if (i < 7) {
            AYXKKw(sQLiteDatabase);
        }
        if (i < 8) {
            AhwBna(sQLiteDatabase);
        }
    }

    public static void copydefault(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        OLrzqt(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN collapse_id TEXT;");
        OLrzqt(sQLiteDatabase, "CREATE INDEX notification_group_id_idx ON notification(group_id); ");
    }

    public static void OLrzqt(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        OLrzqt(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN expire_time TIMESTAMP;");
        OLrzqt(sQLiteDatabase, "UPDATE notification SET expire_time = created_time + 259200;");
        OLrzqt(sQLiteDatabase, "CREATE INDEX notification_expire_time_idx ON notification(expire_time); ");
    }

    public static void EZpvd(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        OLrzqt(sQLiteDatabase, "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_ids TEXT,name TEXT,session TEXT,params TEXT,timestamp TIMESTAMP);");
    }

    public static void KWHzl(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        OLrzqt(sQLiteDatabase, "CREATE TABLE cached_unique_outcome_notification (_id INTEGER PRIMARY KEY,notification_id TEXT,name TEXT);");
        AEQbTJ(sQLiteDatabase);
    }

    public static void AEQbTJ(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        copydefault.copydefault(sQLiteDatabase);
    }

    public static void AYXKKw(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        OLrzqt(sQLiteDatabase, "CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);");
    }

    public final void AhwBna(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        copydefault.EZpvd(sQLiteDatabase);
        copydefault.OLrzqt(sQLiteDatabase);
    }

    public static void OLrzqt(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (android.database.sqlite.SQLiteException e) {
            e.printStackTrace();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        OneSignal.KWHzl(OneSignal.LOG_LEVEL.WARN, "SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.");
        synchronized (KWHzl) {
            android.database.Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
            try {
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList(cursorRawQuery.getCount());
                while (cursorRawQuery.moveToNext()) {
                    arrayList.add(cursorRawQuery.getString(0));
                }
                for (java.lang.String str : arrayList) {
                    if (!str.startsWith("sqlite_")) {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                    }
                }
                cursorRawQuery.close();
                onCreate(sQLiteDatabase);
            } catch (java.lang.Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        }
    }

    public static java.lang.StringBuilder AEQbTJ() {
        long jKWHzl = OneSignal.aKErDB().KWHzl() / 1000;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("created_time > " + (jKWHzl - 604800) + " AND dismissed = 0 AND opened = 0 AND is_summary = 0");
        if (OneSignal.QOLQEE().values()) {
            sb.append(" AND expire_time > " + jKWHzl);
        }
        return sb;
    }
}
