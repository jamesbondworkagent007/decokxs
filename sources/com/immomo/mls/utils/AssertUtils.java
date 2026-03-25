package com.immomo.mls.utils;

import o.C7320ahc;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
public class AssertUtils {
    public static void AEQbTJ(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void AEQbTJ(Object obj) {
        obj.getClass();
    }

    public static boolean KWHzl(Object obj, String str, Globals globals) {
        if (obj != null) {
            return true;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        if (C7320ahc.AEQbTJ(nullPointerException, globals)) {
            return false;
        }
        throw nullPointerException;
    }

    public static boolean EZpvd(LuaValue luaValue, LuaFunction luaFunction, Globals globals) {
        if (luaValue != null && luaValue.isNumber()) {
            return true;
        }
        OLrzqt(new ReturnError(" return type invalid! need number instead of " + luaValue + " in caller " + luaFunction), globals);
        return false;
    }

    public static boolean OLrzqt(LuaValue luaValue, LuaFunction luaFunction, Globals globals) {
        if (luaValue != null && luaValue.isString()) {
            return true;
        }
        OLrzqt(new ReturnError(" return type invalid! need string instead of " + luaValue + " in caller " + luaFunction), globals);
        return false;
    }

    public static boolean EZpvd(LuaValue luaValue, Class<? extends LuaUserdata> cls, LuaFunction luaFunction, Globals globals) {
        if (luaValue != null && cls.isInstance(luaValue)) {
            return true;
        }
        OLrzqt(new ReturnError(" return type invalid! need " + KWHzl(cls) + " instead of " + luaValue + " in caller " + luaFunction), globals);
        return false;
    }

    public static boolean KWHzl(LuaValue luaValue, Class<? extends LuaUserdata> cls, String str, Globals globals) {
        if (luaValue != null && cls.isInstance(luaValue)) {
            return true;
        }
        OLrzqt(new ReturnError(" setter type invalid! need " + KWHzl(cls) + " instead of " + luaValue + " in caller " + str), globals);
        return false;
    }

    public static boolean EZpvd(LuaValue luaValue, String str, Globals globals) {
        if (luaValue != null && luaValue.isFunction()) {
            return true;
        }
        ReturnError returnError = new ReturnError(str);
        if (C7320ahc.AEQbTJ(returnError, globals)) {
            return false;
        }
        throw returnError;
    }

    public static String KWHzl(Class<? extends LuaUserdata> cls) {
        return cls.getSimpleName();
    }

    public static void OLrzqt(ReturnError returnError, Globals globals) {
        if (!C7320ahc.AEQbTJ(returnError, globals)) {
            throw returnError;
        }
    }

    public static final class ReturnError extends RuntimeException {
        public ReturnError(Throwable th) {
            super(th);
        }

        public ReturnError(String str) {
            super(str);
        }
    }
}
