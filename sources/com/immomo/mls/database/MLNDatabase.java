package com.immomo.mls.database;

import android.database.sqlite.SQLiteDatabase;
import com.okinc.base.utils.commmon.ThreadUtils;
import kotlin.Unit;
import o.C32979mnm;
import o.C7385aio;
import o.InterfaceC60044zuT;
import o.yHO;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class MLNDatabase extends LuaUserdata {
    public static final String[] KWHzl = {"executeSQL", "query"};
    public C7385aio OLrzqt;

    @InterfaceC60044zuT
    public MLNDatabase(Globals globals, Object obj) {
        super(globals, obj);
    }

    @InterfaceC60044zuT
    public MLNDatabase(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        String javaString = luaValueArr[0].toJavaString();
        int i = luaValueArr[1].toInt();
        String javaString2 = luaValueArr[2].toJavaString();
        final LuaFunction luaFunction = luaValueArr[3].toLuaFunction();
        this.OLrzqt = C7385aio.Companion.copydefault(C32979mnm.EZpvd.OLrzqt(), javaString, null, i, javaString2, new yHO() { // from class: o.aiy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return this.OLrzqt.OLrzqt(luaFunction, (android.database.sqlite.SQLiteDatabase) obj, (java.lang.Integer) obj2, (java.lang.Integer) obj3);
            }
        });
    }

    public final /* synthetic */ Unit OLrzqt(final LuaFunction luaFunction, SQLiteDatabase sQLiteDatabase, final Integer num, final Integer num2) {
        ThreadUtils.copydefault(new Runnable() { // from class: com.immomo.mls.database.MLNDatabase.4
            @Override // java.lang.Runnable
            public void run() {
                luaFunction.invoke(LuaValue.varargsOf(LuaNumber.valueOf(num.intValue()), LuaNumber.valueOf(num2.intValue())));
            }
        });
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] executeSQL(LuaValue[] luaValueArr) {
        this.OLrzqt.KWHzl(luaValueArr[0].toJavaString(), luaValueArr.length > 1 ? luaValueArr[1].toLuaFunction() : null);
        return LuaValue.rNil();
    }

    @InterfaceC60044zuT
    public LuaValue[] query(LuaValue[] luaValueArr) {
        this.OLrzqt.AEQbTJ(luaValueArr[0].toJavaString(), luaValueArr.length > 1 ? luaValueArr[1].toLuaFunction() : null);
        return LuaValue.rNil();
    }
}
