package o;

import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.auB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7982auB {
    public static void KWHzl(LuaFunction luaFunction) {
        if (luaFunction == null || luaFunction.isDestroyed()) {
            throw new java.lang.IllegalStateException("lua function is destroyed.");
        }
    }

    public static LuaValue[] OLrzqt(LuaFunction luaFunction, java.lang.Object... objArr) {
        int length = objArr == null ? 0 : objArr.length;
        if (length == 0) {
            return luaFunction.invoke(null);
        }
        if (objArr.getClass() == LuaValue[].class) {
            return luaFunction.invoke((LuaValue[]) objArr);
        }
        LuaValue[] luaValueArr = new LuaValue[length];
        Globals globals = luaFunction.getGlobals();
        for (int i = 0; i < length; i++) {
            java.lang.Object obj = objArr[i];
            if (obj == null) {
                luaValueArr[i] = LuaValue.Nil();
            } else if (obj instanceof LuaValue) {
                luaValueArr[i] = (LuaValue) obj;
            } else if (C8017aul.EZpvd(obj)) {
                luaValueArr[i] = C8017aul.copydefault(obj);
            } else {
                luaValueArr[i] = C8017aul.copydefault(globals, objArr[i]);
            }
        }
        return luaFunction.invoke(luaValueArr);
    }
}
