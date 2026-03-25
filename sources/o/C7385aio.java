package o;

import android.database.sqlite.SQLiteDatabase;
import com.okinc.base.utils.commmon.ThreadUtils;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.aio, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C7385aio extends android.database.sqlite.SQLiteOpenHelper {
    public static volatile C7385aio AEQbTJ;
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final android.os.HandlerThread AYXKKw;
    public java.lang.String EZpvd;
    public android.os.Handler KWHzl;
    public android.database.sqlite.SQLiteDatabase OLrzqt;
    public int djBIcL;
    public final yHO<android.database.sqlite.SQLiteDatabase, java.lang.Integer, java.lang.Integer, Unit> gEmmrt;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.yHO<? super android.database.sqlite.SQLiteDatabase, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C7385aio(android.content.Context context, java.lang.String str, SQLiteDatabase.CursorFactory cursorFactory, int i, @NotNull java.lang.String str2, yHO<? super android.database.sqlite.SQLiteDatabase, ? super java.lang.Integer, ? super java.lang.Integer, Unit> yho) {
        super(context, str, cursorFactory, i);
        Intrinsics.checkNotNullParameter(str2, "");
        this.djBIcL = i;
        this.EZpvd = str2;
        this.gEmmrt = yho;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("databaseHandlerThread");
        this.AYXKKw = handlerThread;
        handlerThread.start();
        this.KWHzl = new android.os.Handler(handlerThread.getLooper()) { // from class: o.aio.1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message message) {
                Intrinsics.checkNotNullParameter(message, "");
                super.handleMessage(message);
                if (message.what == 1) {
                    java.lang.Object obj = message.obj;
                    if (obj instanceof java.lang.Runnable) {
                        Intrinsics.copydefault(obj, "");
                        ((java.lang.Runnable) obj).run();
                    }
                }
            }
        };
        KWHzl(this.EZpvd, (LuaFunction) null);
    }

    /* JADX INFO: renamed from: o.aio$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aio.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C7385aio copydefault(android.content.Context context, java.lang.String str, SQLiteDatabase.CursorFactory cursorFactory, int i, @NotNull java.lang.String str2, yHO<? super android.database.sqlite.SQLiteDatabase, ? super java.lang.Integer, ? super java.lang.Integer, Unit> yho) {
            Intrinsics.checkNotNullParameter(str2, "");
            C7385aio c7385aio = C7385aio.AEQbTJ;
            if (c7385aio == null || i != c7385aio.djBIcL) {
                C7385aio.AEQbTJ = null;
            }
            if (C7385aio.AEQbTJ == null) {
                synchronized (this) {
                    if (C7385aio.AEQbTJ == null) {
                        Activity activity = C7385aio.Companion;
                        C7385aio.AEQbTJ = new C7385aio(context, str, cursorFactory, i, str2, yho);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            C7385aio c7385aio2 = C7385aio.AEQbTJ;
            Intrinsics.copydefault(c7385aio2);
            return c7385aio2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        yHO<android.database.sqlite.SQLiteDatabase, java.lang.Integer, java.lang.Integer, Unit> yho = this.gEmmrt;
        if (yho != null) {
            yho.invoke(sQLiteDatabase, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
    }

    public final void KWHzl(@NotNull final java.lang.String str, final LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(str, "");
        android.os.Message messageObtain = android.os.Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = new java.lang.Runnable() { // from class: o.aiu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C7385aio.OLrzqt(this.AEQbTJ, str, luaFunction);
            }
        };
        android.os.Handler handler = this.KWHzl;
        if (handler != null) {
            handler.sendMessage(messageObtain);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000d A[Catch: all -> 0x003e, Exception -> 0x0040, TryCatch #0 {Exception -> 0x0040, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x0013, B:9:0x0017, B:10:0x001a, B:12:0x001e, B:13:0x0021, B:15:0x0025, B:16:0x0028, B:6:0x000d), top: B:44:0x0000, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OLrzqt(C7385aio c7385aio, java.lang.String str, final LuaFunction luaFunction) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        try {
            try {
                android.database.sqlite.SQLiteDatabase sQLiteDatabase2 = c7385aio.OLrzqt;
                if (sQLiteDatabase2 != null) {
                    Intrinsics.copydefault(sQLiteDatabase2);
                    if (!sQLiteDatabase2.isOpen()) {
                        c7385aio.OLrzqt = c7385aio.getWritableDatabase();
                    }
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase3 = c7385aio.OLrzqt;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.beginTransaction();
                    }
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase4 = c7385aio.OLrzqt;
                    if (sQLiteDatabase4 != null) {
                        sQLiteDatabase4.execSQL(str);
                    }
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase5 = c7385aio.OLrzqt;
                    if (sQLiteDatabase5 != null) {
                        sQLiteDatabase5.setTransactionSuccessful();
                    }
                    ThreadUtils.copydefault(new java.lang.Runnable() { // from class: o.aiq
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7385aio.EZpvd(luaFunction);
                        }
                    });
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase6 = c7385aio.OLrzqt;
                    if (sQLiteDatabase6 == null) {
                        return;
                    }
                    if (sQLiteDatabase6 != null) {
                        sQLiteDatabase6.endTransaction();
                    }
                    sQLiteDatabase = c7385aio.OLrzqt;
                    if (sQLiteDatabase == null) {
                        return;
                    }
                }
            } catch (java.lang.Exception e) {
                ThreadUtils.copydefault(new java.lang.Runnable() { // from class: o.ait
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7385aio.KWHzl(luaFunction, e);
                    }
                });
                android.database.sqlite.SQLiteDatabase sQLiteDatabase7 = c7385aio.OLrzqt;
                if (sQLiteDatabase7 == null) {
                    return;
                }
                if (sQLiteDatabase7 != null) {
                    sQLiteDatabase7.endTransaction();
                }
                sQLiteDatabase = c7385aio.OLrzqt;
                if (sQLiteDatabase == null) {
                    return;
                }
            }
            sQLiteDatabase.close();
        } catch (java.lang.Throwable th) {
            android.database.sqlite.SQLiteDatabase sQLiteDatabase8 = c7385aio.OLrzqt;
            if (sQLiteDatabase8 != null) {
                if (sQLiteDatabase8 != null) {
                    sQLiteDatabase8.endTransaction();
                }
                android.database.sqlite.SQLiteDatabase sQLiteDatabase9 = c7385aio.OLrzqt;
                if (sQLiteDatabase9 != null) {
                    sQLiteDatabase9.close();
                }
            }
            throw th;
        }
    }

    public static final void EZpvd(LuaFunction luaFunction) {
        if (luaFunction != null) {
            luaFunction.invoke(LuaValue.varargsOf(LuaBoolean.AEQbTJ(true), LuaValue.Nil()));
        }
    }

    public static final void KWHzl(LuaFunction luaFunction, java.lang.Exception exc) {
        if (luaFunction != null) {
            luaFunction.EZpvd(null, exc.getMessage());
        }
    }

    public final void AEQbTJ(@NotNull final java.lang.String str, final LuaFunction luaFunction) {
        Intrinsics.checkNotNullParameter(str, "");
        android.os.Message messageObtain = android.os.Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = new java.lang.Runnable() { // from class: o.aip
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C7385aio.KWHzl(this.EZpvd, str, luaFunction);
            }
        };
        android.os.Handler handler = this.KWHzl;
        if (handler != null) {
            handler.sendMessage(messageObtain);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e A[Catch: all -> 0x0081, Exception -> 0x0083, TryCatch #1 {Exception -> 0x0083, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x0014, B:9:0x002a, B:11:0x0030, B:12:0x003d, B:14:0x0043, B:16:0x004f, B:17:0x005b, B:18:0x005f, B:7:0x000e), top: B:47:0x0001, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KWHzl(C7385aio c7385aio, java.lang.String str, final LuaFunction luaFunction) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase;
        android.database.Cursor cursorRawQuery = null;
        try {
            try {
                android.database.sqlite.SQLiteDatabase sQLiteDatabase2 = c7385aio.OLrzqt;
                if (sQLiteDatabase2 != null) {
                    Intrinsics.copydefault(sQLiteDatabase2);
                    if (!sQLiteDatabase2.isOpen()) {
                        c7385aio.OLrzqt = c7385aio.getWritableDatabase();
                    }
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase3 = c7385aio.OLrzqt;
                    Intrinsics.copydefault(sQLiteDatabase3);
                    sQLiteDatabase3.beginTransaction();
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase4 = c7385aio.OLrzqt;
                    Intrinsics.copydefault(sQLiteDatabase4);
                    cursorRawQuery = sQLiteDatabase4.rawQuery(str, null);
                    final java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        java.util.HashMap map = new java.util.HashMap();
                        java.util.Iterator itEZpvd = yHX.EZpvd(cursorRawQuery.getColumnNames());
                        while (itEZpvd.hasNext()) {
                            java.lang.String str2 = (java.lang.String) itEZpvd.next();
                            if (cursorRawQuery.getColumnIndex(str2) >= 0) {
                                map.put(str2, cursorRawQuery.getString(cursorRawQuery.getColumnIndexOrThrow(str2)));
                            }
                        }
                        arrayList.add(map);
                    }
                    cursorRawQuery.close();
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase5 = c7385aio.OLrzqt;
                    Intrinsics.copydefault(sQLiteDatabase5);
                    sQLiteDatabase5.setTransactionSuccessful();
                    ThreadUtils.copydefault(new java.lang.Runnable() { // from class: o.air
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7385aio.copydefault(luaFunction, arrayList);
                        }
                    });
                    cursorRawQuery.close();
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase6 = c7385aio.OLrzqt;
                    if (sQLiteDatabase6 != null) {
                        sQLiteDatabase6.endTransaction();
                    }
                    sQLiteDatabase = c7385aio.OLrzqt;
                    if (sQLiteDatabase == null) {
                        return;
                    }
                }
            } catch (java.lang.Exception e) {
                ThreadUtils.copydefault(new java.lang.Runnable() { // from class: o.ais
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C7385aio.copydefault(luaFunction, e);
                    }
                });
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                android.database.sqlite.SQLiteDatabase sQLiteDatabase7 = c7385aio.OLrzqt;
                if (sQLiteDatabase7 != null) {
                    sQLiteDatabase7.endTransaction();
                }
                sQLiteDatabase = c7385aio.OLrzqt;
                if (sQLiteDatabase == null) {
                    return;
                }
            }
            sQLiteDatabase.close();
        } catch (java.lang.Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            android.database.sqlite.SQLiteDatabase sQLiteDatabase8 = c7385aio.OLrzqt;
            if (sQLiteDatabase8 != null) {
                sQLiteDatabase8.endTransaction();
            }
            android.database.sqlite.SQLiteDatabase sQLiteDatabase9 = c7385aio.OLrzqt;
            if (sQLiteDatabase9 != null) {
                sQLiteDatabase9.close();
            }
            throw th;
        }
    }

    public static final void copydefault(LuaFunction luaFunction, java.util.List list) {
        if (luaFunction != null) {
            luaFunction.EZpvd(C33490mxT.OLrzqt(list), null);
        }
    }

    public static final void copydefault(LuaFunction luaFunction, java.lang.Exception exc) {
        if (luaFunction != null) {
            luaFunction.EZpvd(null, exc.getMessage());
        }
    }
}
