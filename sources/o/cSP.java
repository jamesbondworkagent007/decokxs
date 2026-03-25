package o;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes4.dex */
public final class cSP {
    public static final cSP OLrzqt = new cSP();
    public static final android.database.sqlite.SQLiteOpenHelper copydefault = new Application(C9678baC.Companion.AEQbTJ().getApplicationContext());
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.database.sqlite.SQLiteOpenHelper AEQbTJ() {
        return copydefault;
    }

    private cSP() {
    }

    public static final class Application extends android.database.sqlite.SQLiteOpenHelper {
        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }

        public Application(android.content.Context context) {
            super(context, "wallet", (SQLiteDatabase.CursorFactory) null, 2);
        }
    }
}
