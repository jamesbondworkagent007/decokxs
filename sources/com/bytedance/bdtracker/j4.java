package com.bytedance.bdtracker;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class j4 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f198a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public j4(f0 f0Var, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(f0Var.b(), str, cursorFactory, i);
        this.f198a = f0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.beginTransaction();
            Iterator<f4> it = f4.j().values().iterator();
            while (it.hasNext()) {
                String strA = it.next().a();
                if (strA != null) {
                    sQLiteDatabase.execSQL(strA);
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f198a.d.D.debug(5, "Database upgrade from:{} to:{}", Integer.valueOf(i), Integer.valueOf(i2));
        try {
            sQLiteDatabase.beginTransaction();
            Iterator<f4> it = f4.j().values().iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + it.next().f());
            }
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        r.a(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }
}
