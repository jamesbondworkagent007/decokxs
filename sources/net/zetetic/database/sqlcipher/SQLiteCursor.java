package net.zetetic.database.sqlcipher;

import android.database.AbstractWindowedCursor;
import android.database.CursorWindow;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import net.zetetic.database.DatabaseUtils;

/* JADX INFO: loaded from: classes13.dex */
public class SQLiteCursor extends AbstractWindowedCursor {
    public static int AEQbTJ = 0;
    public static boolean EZpvd = false;
    public static final int OLrzqt;
    public final SQLiteCursorDriver AYXKKw;
    public int AhwBna;
    public final String[] KWHzl;
    public Map<String, Integer> copydefault;
    public final String djBIcL;
    public final SQLiteQuery gEmmrt;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.database.AbstractCursor, android.database.Cursor
    public String[] getColumnNames() {
        return this.KWHzl;
    }

    static {
        int iPow = (int) (Math.pow(1024.0d, 2.0d) * 8.0d);
        OLrzqt = iPow;
        AEQbTJ = iPow;
    }

    @Deprecated
    public SQLiteCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this(sQLiteCursorDriver, str, sQLiteQuery);
    }

    public SQLiteCursor(SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        this.valueOf = -1;
        if (sQLiteQuery == null) {
            throw new IllegalArgumentException("query object cannot be null");
        }
        this.AYXKKw = sQLiteCursorDriver;
        this.djBIcL = str;
        this.copydefault = null;
        this.gEmmrt = sQLiteQuery;
        this.KWHzl = sQLiteQuery.AEQbTJ();
    }

    public SQLiteDatabase copydefault() {
        return this.gEmmrt.AhwBna();
    }

    @Override // android.database.AbstractCursor, android.database.CrossProcessCursor
    public boolean onMove(int i, int i2) {
        CursorWindow cursorWindow = ((AbstractWindowedCursor) this).mWindow;
        if (cursorWindow != null && i2 >= cursorWindow.getStartPosition() && i2 < ((AbstractWindowedCursor) this).mWindow.getStartPosition() + ((AbstractWindowedCursor) this).mWindow.getNumRows()) {
            return true;
        }
        AEQbTJ(i2);
        return true;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getCount() {
        if (this.valueOf == -1) {
            AEQbTJ(0);
        }
        return this.valueOf;
    }

    public final void EZpvd(String str) {
        CursorWindow cursorWindow;
        int i = AEQbTJ + 512;
        if (EZpvd) {
            AEQbTJ();
            EZpvd = false;
        }
        CursorWindow window = getWindow();
        if (window == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                SQLiteCursor$$ExternalSyntheticApiModelOutline0.AEQbTJ();
                cursorWindow = o.SQLiteClosable.AEQbTJ(str, i);
            } else {
                try {
                    Field declaredField = CursorWindow.class.getDeclaredField("sCursorWindowSize");
                    if (declaredField != null) {
                        declaredField.setAccessible(true);
                        declaredField.set(null, Integer.valueOf(i));
                        String.format("Set CursorWindow allocation size to %s", Integer.valueOf(i));
                    }
                } catch (Exception unused) {
                }
                cursorWindow = new CursorWindow(str);
            }
            setWindow(cursorWindow);
            return;
        }
        window.clear();
    }

    public final void AEQbTJ() {
        setWindow(null);
    }

    public final void AEQbTJ(int i) {
        EZpvd(copydefault().getPath());
        try {
            if (this.valueOf == -1) {
                this.valueOf = this.gEmmrt.OLrzqt(((AbstractWindowedCursor) this).mWindow, DatabaseUtils.OLrzqt(i, 0), i, true);
                this.AhwBna = ((AbstractWindowedCursor) this).mWindow.getNumRows();
                Log.isLoggable("SQLiteCursor", 3);
                return;
            }
            this.gEmmrt.OLrzqt(((AbstractWindowedCursor) this).mWindow, DatabaseUtils.OLrzqt(i, this.AhwBna), i, false);
        } catch (RuntimeException e) {
            AEQbTJ();
            throw e;
        }
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getColumnIndex(String str) {
        if (this.copydefault == null) {
            String[] strArr = this.KWHzl;
            int length = strArr.length;
            HashMap map = new HashMap(length, 1.0f);
            for (int i = 0; i < length; i++) {
                map.put(strArr[i], Integer.valueOf(i));
            }
            this.copydefault = map;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            new Exception();
            str = str.substring(iLastIndexOf + 1);
        }
        Integer num = this.copydefault.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public void deactivate() {
        super.deactivate();
        this.AYXKKw.EZpvd();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        synchronized (this) {
            this.gEmmrt.close();
            this.AYXKKw.OLrzqt();
        }
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public boolean requery() {
        if (isClosed()) {
            return false;
        }
        synchronized (this) {
            if (!this.gEmmrt.AhwBna().isOpen()) {
                return false;
            }
            CursorWindow cursorWindow = ((AbstractWindowedCursor) this).mWindow;
            if (cursorWindow != null) {
                cursorWindow.clear();
            }
            ((AbstractWindowedCursor) this).mPos = -1;
            this.valueOf = -1;
            this.AYXKKw.copydefault(this);
            try {
                return super.requery();
            } catch (IllegalStateException e) {
                e.getMessage();
                return false;
            }
        }
    }

    @Override // android.database.AbstractWindowedCursor
    public void setWindow(CursorWindow cursorWindow) {
        super.setWindow(cursorWindow);
        this.valueOf = -1;
    }

    @Override // android.database.AbstractCursor
    public void finalize() throws Throwable {
        try {
            if (((AbstractWindowedCursor) this).mWindow != null) {
                close();
            }
        } finally {
            super.finalize();
        }
    }
}
