package o;

import android.database.sqlite.SQLiteDatabase;
import com.amplitude.common.Logger;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Jv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5233Jv extends android.database.sqlite.SQLiteOpenHelper {
    public boolean AEQbTJ;
    public java.io.File EZpvd;
    public final Logger KWHzl;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.copydefault = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5233Jv(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull Logger logger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 4);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.KWHzl = logger;
        java.io.File databasePath = context.getDatabasePath(str);
        Intrinsics.checkNotNullExpressionValue(databasePath, "");
        this.EZpvd = databasePath;
        this.AEQbTJ = true;
        this.copydefault = 4;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@NotNull android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "");
        this.AEQbTJ = false;
        this.KWHzl.EZpvd("Attempt to re-create existing legacy database file " + this.EZpvd.getAbsolutePath());
    }

    public final android.database.Cursor AEQbTJ(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String[] strArr2, java.lang.String str3) {
        return sQLiteDatabase.query(str, strArr, str2, strArr2, null, null, str3, null);
    }

    public final void KWHzl(java.lang.IllegalStateException illegalStateException) {
        java.lang.String message = illegalStateException.getMessage();
        if (message != null && message.length() != 0 && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "Couldn't read", false, 2, (java.lang.Object) null) && StringsKt__StringsKt.contains$default((java.lang.CharSequence) message, (java.lang.CharSequence) "CursorWindow", false, 2, (java.lang.Object) null)) {
            copydefault();
            return;
        }
        throw illegalStateException;
    }

    public final void OLrzqt(java.lang.RuntimeException runtimeException) {
        java.lang.String message = runtimeException.getMessage();
        if (message == null || message.length() == 0) {
            throw runtimeException;
        }
        if (C59449zhJ.startsWith$default(message, "Cursor window allocation of", false, 2, null) || C59449zhJ.startsWith$default(message, "Could not allocate CursorWindow", false, 2, null)) {
            throw new com.amplitude.android.migration.CursorWindowAllocationException(message);
        }
        throw runtimeException;
    }

    public final void copydefault() {
        try {
            close();
        } catch (java.lang.Exception e) {
            C5239Kb.Companion.KWHzl().EZpvd("close failed: " + e.getMessage());
        }
    }

    public final java.util.List<JSONObject> OLrzqt() {
        java.util.List<JSONObject> listOLrzqt;
        synchronized (this) {
            listOLrzqt = OLrzqt("events");
        }
        return listOLrzqt;
    }

    public final java.util.List<JSONObject> KWHzl() {
        java.util.List<JSONObject> listOLrzqt;
        synchronized (this) {
            listOLrzqt = OLrzqt("identifys");
        }
        return listOLrzqt;
    }

    public final java.util.List<JSONObject> AEQbTJ() {
        synchronized (this) {
            if (this.copydefault < 4) {
                return yDY.AhwBna();
            }
            return OLrzqt("identify_interceptor");
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE, INVOKE, INVOKE] complete} */
    public final java.util.List<JSONObject> OLrzqt(java.lang.String str) {
        android.database.sqlite.SQLiteDatabase readableDatabase;
        if (!this.EZpvd.exists()) {
            return new java.util.ArrayList();
        }
        LinkedList linkedList = new LinkedList();
        android.database.Cursor cursorAEQbTJ = null;
        try {
            try {
                try {
                    readableDatabase = getReadableDatabase();
                } catch (java.lang.RuntimeException e) {
                    OLrzqt(e);
                    if (0 != 0) {
                    }
                    close();
                    return linkedList;
                } catch (java.lang.StackOverflowError e2) {
                    C5239Kb.Companion.KWHzl().EZpvd("read events from " + str + " failed: " + e2.getMessage());
                    copydefault();
                    if (0 != 0) {
                    }
                    close();
                    return linkedList;
                }
            } catch (android.database.sqlite.SQLiteException e3) {
                C5239Kb.Companion.KWHzl().EZpvd("read events from " + str + " failed: " + e3.getMessage());
                copydefault();
                if (0 != 0) {
                    break;
                }
                close();
                return linkedList;
            } catch (java.lang.IllegalStateException e4) {
                KWHzl(e4);
                if (0 != 0) {
                }
                close();
                return linkedList;
            }
            if (!this.AEQbTJ) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                close();
                return arrayList;
            }
            Intrinsics.checkNotNullExpressionValue(readableDatabase, "");
            cursorAEQbTJ = AEQbTJ(readableDatabase, str, new java.lang.String[]{"id", "event"}, null, null, "id ASC");
            while (true) {
                Intrinsics.copydefault(cursorAEQbTJ);
                if (!cursorAEQbTJ.moveToNext()) {
                    break;
                }
                long j = cursorAEQbTJ.getLong(0);
                java.lang.String string = cursorAEQbTJ.getString(1);
                if (string != null && string.length() != 0) {
                    JSONObject jSONObject = new JSONObject(string);
                    jSONObject.put("$rowId", j);
                    linkedList.add(jSONObject);
                }
            }
            cursorAEQbTJ.close();
            close();
            return linkedList;
        } catch (java.lang.Throwable th) {
            if (0 != 0) {
                cursorAEQbTJ.close();
            }
            close();
            throw th;
        }
    }

    public final void AEQbTJ(long j) {
        synchronized (this) {
            KWHzl("events", j);
        }
    }

    public final void KWHzl(long j) {
        synchronized (this) {
            KWHzl("identifys", j);
        }
    }

    public final void copydefault(long j) {
        synchronized (this) {
            if (this.copydefault < 4) {
                return;
            }
            KWHzl("identify_interceptor", j);
        }
    }

    public final void KWHzl(java.lang.String str, long j) {
        try {
            try {
                try {
                    getWritableDatabase().delete(str, "id = ?", new java.lang.String[]{java.lang.String.valueOf(j)});
                } catch (java.lang.StackOverflowError e) {
                    C5239Kb.Companion.KWHzl().EZpvd("remove events from " + str + " failed: " + e.getMessage());
                    copydefault();
                }
            } catch (android.database.sqlite.SQLiteException e2) {
                C5239Kb.Companion.KWHzl().EZpvd("remove events from " + str + " failed: " + e2.getMessage());
                copydefault();
            }
        } finally {
            close();
        }
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        java.lang.String str2;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            str2 = (java.lang.String) OLrzqt("store", str);
        }
        return str2;
    }

    public final java.lang.Long EZpvd(@NotNull java.lang.String str) {
        java.lang.Long l;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            l = (java.lang.Long) OLrzqt("long_store", str);
        }
        return l;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:25:0x0062 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    public final java.lang.Object OLrzqt(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        java.lang.StackOverflowError e;
        android.database.Cursor cursorAEQbTJ;
        android.database.sqlite.SQLiteException e2;
        android.database.sqlite.SQLiteDatabase readableDatabase;
        ?? r3 = 0;
        string = null;
        string = null;
        string = null;
        string = null;
        string = null;
        string = null;
        string = null;
        string = null;
        java.lang.Object string = null;
        try {
            if (!this.EZpvd.exists()) {
                return null;
            }
            try {
                readableDatabase = getReadableDatabase();
            } catch (android.database.sqlite.SQLiteException e3) {
                e2 = e3;
                cursorAEQbTJ = null;
            } catch (java.lang.IllegalStateException e4) {
                e = e4;
                cursorAEQbTJ = null;
            } catch (java.lang.RuntimeException e5) {
                e = e5;
                cursorAEQbTJ = null;
            } catch (java.lang.StackOverflowError e6) {
                e = e6;
                cursorAEQbTJ = null;
            } catch (java.lang.Throwable th) {
                th = th;
                if (r3 != 0) {
                    r3.close();
                }
                close();
                throw th;
            }
            if (this.AEQbTJ) {
                Intrinsics.checkNotNullExpressionValue(readableDatabase, "");
                cursorAEQbTJ = AEQbTJ(readableDatabase, str, new java.lang.String[]{JwtUtilsKt.DID_METHOD_KEY, "value"}, "key = ?", new java.lang.String[]{str2}, null);
                try {
                    Intrinsics.copydefault(cursorAEQbTJ);
                    if (cursorAEQbTJ.moveToFirst()) {
                        string = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "store") ? cursorAEQbTJ.getString(1) : java.lang.Long.valueOf(cursorAEQbTJ.getLong(1));
                    }
                } catch (android.database.sqlite.SQLiteException e7) {
                    e2 = e7;
                    C5239Kb.Companion.KWHzl().EZpvd("getValue from " + str + " failed: " + e2.getMessage());
                    copydefault();
                    if (cursorAEQbTJ != null) {
                    }
                    close();
                    return string;
                } catch (java.lang.IllegalStateException e8) {
                    e = e8;
                    KWHzl(e);
                    if (cursorAEQbTJ != null) {
                    }
                    close();
                    return string;
                } catch (java.lang.RuntimeException e9) {
                    e = e9;
                    OLrzqt(e);
                    if (cursorAEQbTJ != null) {
                    }
                    close();
                    return string;
                } catch (java.lang.StackOverflowError e10) {
                    e = e10;
                    C5239Kb.Companion.KWHzl().EZpvd("getValue from " + str + " failed: " + e.getMessage());
                    copydefault();
                    if (cursorAEQbTJ != null) {
                    }
                    close();
                    return string;
                }
                cursorAEQbTJ.close();
                close();
                return string;
            }
            close();
            return null;
            C5239Kb.Companion.KWHzl().EZpvd("getValue from " + str + " failed: " + e2.getMessage());
            copydefault();
            if (cursorAEQbTJ != null) {
                cursorAEQbTJ.close();
            }
            close();
            return string;
        } catch (java.lang.Throwable th2) {
            th = th2;
            r3 = str2;
        }
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            copydefault("long_store", str);
        }
    }

    public final void copydefault(java.lang.String str, java.lang.String str2) {
        try {
            try {
                try {
                    getWritableDatabase().delete(str, "key = ?", new java.lang.String[]{str2});
                } catch (android.database.sqlite.SQLiteException e) {
                    C5239Kb.Companion.KWHzl().EZpvd("remove value from " + str + " failed: " + e.getMessage());
                    copydefault();
                }
            } catch (java.lang.StackOverflowError e2) {
                C5239Kb.Companion.KWHzl().EZpvd("remove value from " + str + " failed: " + e2.getMessage());
                copydefault();
            }
        } finally {
            close();
        }
    }
}
