package o;

import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.jse.JavaClass;
import org.luaj.vm2.jse.JavaInstance;

/* JADX INFO: renamed from: o.zuO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C60039zuO {
    public static LuaTable KWHzl(@androidx.annotation.NonNull Globals globals, @androidx.annotation.Nullable java.lang.Object obj) {
        if (globals.isDestroyed()) {
            return null;
        }
        int i = 0;
        int length = obj == null ? 0 : java.lang.reflect.Array.getLength(obj);
        if (length == 0) {
            return null;
        }
        LuaTable luaTableAEQbTJ = LuaTable.AEQbTJ(globals);
        while (i < length) {
            int i2 = i + 1;
            luaTableAEQbTJ.set(i2, copydefault(globals, java.lang.reflect.Array.get(obj, i)));
            i = i2;
        }
        return luaTableAEQbTJ;
    }

    public static LuaValue copydefault(Globals globals, java.lang.Object obj) {
        LuaValue luaValueKWHzl = C7910asj.KWHzl(globals, obj);
        if (luaValueKWHzl != null && !luaValueKWHzl.isNil()) {
            return luaValueKWHzl;
        }
        if (obj instanceof java.lang.Class) {
            return JavaClass.forClass(globals, (java.lang.Class) obj);
        }
        return new JavaInstance(globals, obj);
    }

    public static java.lang.Object EZpvd(@androidx.annotation.Nullable LuaTable luaTable, @androidx.annotation.NonNull java.lang.Class cls) {
        int i = 0;
        int iZLjUOn = luaTable == null ? 0 : luaTable.zLjUOn();
        if (iZLjUOn == 0) {
            return null;
        }
        java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) cls, iZLjUOn);
        while (i < iZLjUOn) {
            int i2 = i + 1;
            java.lang.reflect.Array.set(objNewInstance, i, copydefault(luaTable.get(i2), cls));
            i = i2;
        }
        return objNewInstance;
    }

    public static java.lang.Object copydefault(LuaValue luaValue, java.lang.Class cls) {
        if (luaValue == null || luaValue.isNil() || cls == null) {
            return null;
        }
        if (cls == java.lang.String.class) {
            return luaValue.toJavaString();
        }
        if (luaValue.isUserdata() || luaValue.isTable()) {
            return C8017aul.AEQbTJ(luaValue, cls);
        }
        if (cls.isPrimitive()) {
            return KWHzl(luaValue, cls);
        }
        if (java.lang.Character.class == cls) {
            cls = java.lang.Character.TYPE;
        } else if (java.lang.Boolean.class == cls) {
            cls = java.lang.Boolean.TYPE;
        } else if (cls == java.lang.Byte.class) {
            cls = java.lang.Byte.TYPE;
        } else if (cls == java.lang.Short.class) {
            cls = java.lang.Short.TYPE;
        } else if (cls == java.lang.Integer.class) {
            cls = java.lang.Integer.TYPE;
        } else if (cls == java.lang.Float.class) {
            cls = java.lang.Float.TYPE;
        } else if (cls == java.lang.Long.class) {
            cls = java.lang.Long.TYPE;
        } else if (cls == java.lang.Double.class) {
            cls = java.lang.Double.TYPE;
        }
        if (cls.isPrimitive()) {
            return KWHzl(luaValue, cls);
        }
        return null;
    }

    public static java.lang.reflect.Method copydefault(java.util.List<java.lang.reflect.Method> list, LuaValue[] luaValueArr) {
        int i = Integer.MAX_VALUE;
        java.lang.reflect.Method method = null;
        for (java.lang.reflect.Method method2 : list) {
            int iKWHzl = KWHzl(luaValueArr, method2.getParameterTypes());
            if (iKWHzl == 0) {
                return method2;
            }
            if (iKWHzl < i) {
                method = method2;
                i = iKWHzl;
            }
        }
        return method;
    }

    public static java.lang.reflect.Constructor OLrzqt(java.util.List<java.lang.reflect.Constructor> list, LuaValue[] luaValueArr) {
        int i = Integer.MAX_VALUE;
        java.lang.reflect.Constructor constructor = null;
        for (java.lang.reflect.Constructor constructor2 : list) {
            int iKWHzl = KWHzl(luaValueArr, constructor2.getParameterTypes());
            if (iKWHzl == 0) {
                return constructor2;
            }
            if (iKWHzl < i) {
                constructor = constructor2;
                i = iKWHzl;
            }
        }
        return constructor;
    }

    public static java.lang.Object[] AEQbTJ(LuaValue[] luaValueArr, java.lang.Class[] clsArr) {
        int length = clsArr.length;
        int length2 = luaValueArr.length;
        java.lang.Object[] objArr = new java.lang.Object[length];
        for (int i = 0; i < length && i < length2; i++) {
            objArr[i] = copydefault(luaValueArr[i], clsArr[i]);
        }
        return objArr;
    }

    public static java.lang.Object KWHzl(LuaValue luaValue, java.lang.Class cls) {
        if (cls == java.lang.Boolean.TYPE) {
            return java.lang.Boolean.valueOf(luaValue.toBoolean());
        }
        if (cls == java.lang.Byte.TYPE) {
            return java.lang.Byte.valueOf((byte) luaValue.toInt());
        }
        if (cls == java.lang.Character.TYPE) {
            return java.lang.Character.valueOf((char) luaValue.toInt());
        }
        if (cls == java.lang.Short.TYPE) {
            return java.lang.Short.valueOf((short) luaValue.toInt());
        }
        if (cls == java.lang.Integer.TYPE) {
            return java.lang.Integer.valueOf(luaValue.toInt());
        }
        if (cls == java.lang.Float.TYPE) {
            return java.lang.Float.valueOf(luaValue.toFloat());
        }
        if (cls == java.lang.Long.TYPE) {
            return java.lang.Long.valueOf((long) luaValue.toDouble());
        }
        return java.lang.Double.valueOf(luaValue.toDouble());
    }

    public static int KWHzl(LuaValue[] luaValueArr, java.lang.Class[] clsArr) {
        int length = luaValueArr != null ? luaValueArr.length : 0;
        int length2 = clsArr != null ? clsArr.length : 0;
        int iOLrzqt = length > length2 ? (length - length2) * 256 : 0;
        for (int i = 0; i < length && i < length2; i++) {
            iOLrzqt += OLrzqt(luaValueArr[i], clsArr[i]);
        }
        return iOLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v12, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r3v16, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r3v17, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r3v18, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r3v19, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r3v20, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r3v21, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public static int OLrzqt(LuaValue luaValue, java.lang.Class cls) {
        boolean zIsNumber;
        if (cls.isPrimitive()) {
            if (cls == java.lang.Boolean.TYPE) {
                zIsNumber = luaValue.isBoolean();
            } else {
                zIsNumber = luaValue.isNumber();
            }
        } else {
            if (luaValue.isNil() || luaValue.getClass() == cls) {
                return 0;
            }
            if (cls == java.lang.Boolean.class) {
                zIsNumber = luaValue.isBoolean();
            } else if (java.lang.Number.class.isAssignableFrom(cls) || java.lang.Character.class == cls) {
                zIsNumber = luaValue.isNumber();
            } else if (cls == java.lang.String.class) {
                zIsNumber = luaValue.isString();
            } else if (luaValue instanceof LuaUserdata) {
                zIsNumber = cls.isInstance(((LuaUserdata) luaValue).getJavaUserdata());
            } else {
                if (luaValue.isTable()) {
                    return (java.util.Map.class.isAssignableFrom(cls) || java.util.List.class.isAssignableFrom(cls)) ? 0 : 1;
                }
                return 1;
            }
        }
        return !zIsNumber;
    }
}
