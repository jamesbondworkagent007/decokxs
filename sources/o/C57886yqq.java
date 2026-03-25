package o;

import com.onesignal.influence.domain.OSInfluenceChannel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yqq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57886yqq {
    public final void copydefault(@NotNull android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "");
        try {
            try {
                sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                sQLiteDatabase.execSQL("CREATE TEMPORARY TABLE outcome_backup(_id,session,notification_ids,name,timestamp);");
                sQLiteDatabase.execSQL("INSERT INTO outcome_backup SELECT _id,session,notification_ids,name,timestamp FROM outcome;");
                sQLiteDatabase.execSQL("DROP TABLE outcome;");
                sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,session TEXT,notification_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
                sQLiteDatabase.execSQL("INSERT INTO outcome (_id,session,notification_ids,name,timestamp, weight) SELECT _id,session,notification_ids,name,timestamp, 0 FROM outcome_backup;");
                sQLiteDatabase.execSQL("DROP TABLE outcome_backup;");
            } catch (android.database.sqlite.SQLiteException e) {
                e.printStackTrace();
            }
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }

    public final void EZpvd(@NotNull android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "");
        java.lang.String strKWHzl = Intrinsics.KWHzl("_id,name,timestamp,notification_ids,weight", ",session");
        java.lang.String strKWHzl2 = Intrinsics.KWHzl("_id,name,timestamp,notification_ids,weight", ",notification_influence_type");
        try {
            try {
                sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                sQLiteDatabase.execSQL("ALTER TABLE outcome RENAME TO outcome_aux;");
                sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
                sQLiteDatabase.execSQL("INSERT INTO outcome(" + strKWHzl2 + ") SELECT " + strKWHzl + " FROM outcome_aux;");
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("DROP TABLE ");
                sb.append("outcome_aux");
                sb.append(';');
                sQLiteDatabase.execSQL(sb.toString());
            } catch (android.database.sqlite.SQLiteException e) {
                e.printStackTrace();
            }
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }

    public final void OLrzqt(@NotNull android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "");
        java.lang.String strKWHzl = Intrinsics.KWHzl("_id,name", ",notification_id");
        java.lang.String strKWHzl2 = Intrinsics.KWHzl("_id,name", ",channel_influence_id");
        try {
            try {
                sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
                sQLiteDatabase.execSQL("INSERT INTO cached_unique_outcome(" + strKWHzl2 + ") SELECT " + strKWHzl + " FROM cached_unique_outcome_notification;");
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("UPDATE cached_unique_outcome SET channel_type = '");
                sb.append(OSInfluenceChannel.NOTIFICATION);
                sb.append("';");
                sQLiteDatabase.execSQL(sb.toString());
                sQLiteDatabase.execSQL("DROP TABLE cached_unique_outcome_notification;");
            } catch (android.database.sqlite.SQLiteException e) {
                e.printStackTrace();
            }
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }
}
