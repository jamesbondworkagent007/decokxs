package org.luaj.vm2.jse;

import com.okinc.account.api.model.security.otp.OtpEventTracker;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import o.C60039zuO;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.exception.InvokeError;

/* JADX INFO: loaded from: classes24.dex */
@InterfaceC60044zuT
public class Luajava {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    @InterfaceC60044zuT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LuaValue[] __index(long j, String str, LuaValue[] luaValueArr) {
        byte b;
        LuaValue luaValueEZpvd;
        try {
            switch (str.hashCode()) {
                case -956124357:
                    b = !str.equals("bindClass") ? (byte) -1 : (byte) 0;
                    break;
                case -507480366:
                    if (str.equals("createProxy")) {
                        b = 3;
                        break;
                    }
                    break;
                case 108960:
                    if (str.equals(OtpEventTracker.OTP_EVENT_VALUE_NEW)) {
                        b = 2;
                        break;
                    }
                    break;
                case 336622527:
                    if (str.equals("loadLib")) {
                        b = 4;
                        break;
                    }
                    break;
                case 1811874389:
                    if (str.equals("newInstance")) {
                        b = 1;
                        break;
                    }
                    break;
                default:
                    break;
            }
            if (b == 0) {
                luaValueEZpvd = EZpvd(Globals.EZpvd(j), luaValueArr[0].toJavaString());
            } else if (b == 1) {
                luaValueEZpvd = EZpvd(Globals.EZpvd(j), luaValueArr[0].toJavaString(), luaValueArr);
            } else if (b == 2) {
                luaValueEZpvd = OLrzqt(Globals.EZpvd(j), ((JavaClass) luaValueArr[0]).getJavaUserdata(), luaValueArr);
            } else if (b == 3) {
                luaValueEZpvd = KWHzl(Globals.EZpvd(j), luaValueArr);
            } else if (b == 4) {
                luaValueEZpvd = copydefault(Globals.EZpvd(j), luaValueArr[0].toJavaString(), luaValueArr[1].toJavaString());
            } else {
                throw new InvokeError("not support " + str + " yet!");
            }
            if (luaValueEZpvd != null) {
                return LuaValue.varargsOf(luaValueEZpvd);
            }
            return null;
        } catch (InvokeError e) {
            throw e;
        } catch (Exception e2) {
            throw new InvokeError("call luajava." + str + " failed!", e2);
        }
    }

    public static LuaValue EZpvd(Globals globals, String str) throws ClassNotFoundException {
        return JavaClass.forClass(globals, AEQbTJ(str));
    }

    public static LuaValue EZpvd(Globals globals, String str, LuaValue[] luaValueArr) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        return OLrzqt(globals, AEQbTJ(str), luaValueArr);
    }

    public static LuaValue OLrzqt(Globals globals, Class cls, LuaValue[] luaValueArr) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        List<Constructor> constructor = JavaClass.forClass(globals, cls).getConstructor();
        int length = luaValueArr.length;
        if (length == 1) {
            return C60039zuO.copydefault(globals, cls.newInstance());
        }
        int i = length - 1;
        LuaValue[] luaValueArr2 = new LuaValue[i];
        System.arraycopy(luaValueArr, 1, luaValueArr2, 0, i);
        Constructor constructorOLrzqt = C60039zuO.OLrzqt(constructor, luaValueArr2);
        return C60039zuO.copydefault(globals, constructorOLrzqt.newInstance(C60039zuO.AEQbTJ(luaValueArr, constructorOLrzqt.getParameterTypes())));
    }

    public static LuaValue KWHzl(Globals globals, LuaValue[] luaValueArr) throws ClassNotFoundException {
        int length = luaValueArr.length;
        if (length <= 1) {
            throw new InvokeError("no interface");
        }
        int i = length - 1;
        LuaTable luaTable = luaValueArr[i].toLuaTable();
        Class[] clsArr = new Class[i];
        for (int i2 = 0; i2 < i; i2++) {
            clsArr[i2] = AEQbTJ(luaValueArr[i2].toJavaString());
        }
        return new JavaInstance(globals, Proxy.newProxyInstance(Luajava.class.getClassLoader(), clsArr, new Activity(luaTable)));
    }

    public static LuaValue copydefault(Globals globals, String str, String str2) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Class clsAEQbTJ = AEQbTJ(str);
        Object objInvoke = clsAEQbTJ.getMethod(str2, new Class[0]).invoke(clsAEQbTJ, new Object[0]);
        return objInvoke instanceof LuaValue ? (LuaValue) objInvoke : LuaValue.Nil();
    }

    public static Class AEQbTJ(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }

    public static final class Activity implements InvocationHandler {
        public final LuaTable KWHzl;

        public Activity(LuaTable luaTable) {
            this.KWHzl = luaTable;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            LuaValue[] luaValueArrEmpty;
            LuaValue luaValue = this.KWHzl.get(method.getName());
            if (!luaValue.isFunction()) {
                return null;
            }
            int length = objArr != null ? objArr.length : 0;
            if (length > 0) {
                luaValueArrEmpty = new LuaValue[length];
                for (int i = 0; i < length; i++) {
                    luaValueArrEmpty[i] = C60039zuO.copydefault(this.KWHzl.getGlobals(), objArr[i]);
                }
            } else {
                luaValueArrEmpty = LuaValue.empty();
            }
            LuaValue[] luaValueArrInvoke = luaValue.invoke(luaValueArrEmpty);
            if (luaValueArrInvoke == null) {
                return null;
            }
            return C60039zuO.copydefault(luaValueArrInvoke[0], method.getReturnType());
        }
    }
}
