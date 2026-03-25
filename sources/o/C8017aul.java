package o;

import com.google.gson.JsonPrimitive;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.aul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8017aul {
    public static final java.util.Map<java.lang.Class, InterfaceC8012aug> KWHzl;
    public static final java.util.Map<java.lang.Class, InterfaceC8009aud> OLrzqt = new java.util.HashMap(20);

    static {
        java.util.HashMap map = new java.util.HashMap(20);
        KWHzl = map;
        map.put(InterfaceC8029auy.class, C8022auq.copydefault);
        map.put(InterfaceC8027auv.class, C8018aum.copydefault);
        map.put(InterfaceC8026auu.class, C8019aun.KWHzl);
        map.put(InterfaceC8025aut.class, C8020auo.AEQbTJ);
        map.put(InterfaceC7835arN.class, C7901asa.KWHzl);
    }

    public static void AEQbTJ() {
        OLrzqt.clear();
        java.util.Map<java.lang.Class, InterfaceC8012aug> map = KWHzl;
        map.clear();
        map.put(InterfaceC8029auy.class, C8022auq.copydefault);
        map.put(InterfaceC8027auv.class, C8018aum.copydefault);
        map.put(InterfaceC8026auu.class, C8019aun.KWHzl);
        map.put(InterfaceC8025aut.class, C8020auo.AEQbTJ);
        map.put(InterfaceC7835arN.class, C7901asa.KWHzl);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: org.luaj.vm2.LuaValue */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T AEQbTJ(LuaValue luaValue, java.lang.Class<T> cls) {
        if (luaValue.getClass().isAssignableFrom(cls)) {
            return luaValue;
        }
        java.util.Map<java.lang.Class, InterfaceC8012aug> map = KWHzl;
        InterfaceC8012aug interfaceC8012aug = map.get(cls);
        if (interfaceC8012aug == null) {
            if (java.util.Map.class.isAssignableFrom(cls)) {
                interfaceC8012aug = map.get(java.util.Map.class);
            } else if (java.util.List.class.isAssignableFrom(cls)) {
                interfaceC8012aug = map.get(java.util.List.class);
            }
        }
        if (interfaceC8012aug != null) {
            return (T) interfaceC8012aug.copydefault(luaValue);
        }
        if (!luaValue.isUserdata()) {
            return null;
        }
        T t = (T) luaValue.toUserdata().getJavaUserdata();
        if (cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    public static LuaValue copydefault(Globals globals, java.lang.Object obj) {
        if (obj == null) {
            return LuaValue.Nil();
        }
        if (obj instanceof LuaValue) {
            return (LuaValue) obj;
        }
        if (obj instanceof InterfaceC7383aim) {
            return ((InterfaceC7383aim) obj).getUserdata();
        }
        java.util.Map<java.lang.Class, InterfaceC8009aud> map = OLrzqt;
        InterfaceC8009aud interfaceC8009aud = map.get(obj.getClass());
        if (interfaceC8009aud == null) {
            if (obj instanceof java.util.Map) {
                interfaceC8009aud = map.get(java.util.Map.class);
            } else if (obj instanceof java.util.List) {
                interfaceC8009aud = map.get(java.util.List.class);
            }
        }
        if (interfaceC8009aud != null) {
            LuaValue luaValueKWHzl = interfaceC8009aud.KWHzl(globals, obj);
            luaValueKWHzl.getClass();
            return luaValueKWHzl;
        }
        return LuaValue.Nil();
    }

    public static boolean EZpvd(java.lang.Object obj) {
        return (obj instanceof java.lang.Boolean) || (obj instanceof java.lang.Number) || (obj instanceof java.lang.Character) || (obj instanceof java.lang.String) || (obj instanceof JsonPrimitive);
    }

    public static LuaValue copydefault(java.lang.Object obj) {
        java.lang.Class<?> cls = obj.getClass();
        if (cls == java.lang.Boolean.class) {
            return ((java.lang.Boolean) obj).booleanValue() ? LuaValue.True() : LuaValue.False();
        }
        if (java.lang.Number.class.isAssignableFrom(cls)) {
            return LuaNumber.copydefault(((java.lang.Number) obj).doubleValue());
        }
        if (cls == java.lang.Character.class) {
            return LuaNumber.valueOf(((java.lang.Character) obj).charValue());
        }
        if (cls == java.lang.String.class) {
            return LuaString.copydefault(obj.toString());
        }
        if (cls != JsonPrimitive.class) {
            return null;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        if (jsonPrimitive.isNumber()) {
            return LuaNumber.copydefault(jsonPrimitive.getAsNumber().doubleValue());
        }
        if (jsonPrimitive.isBoolean()) {
            return jsonPrimitive.getAsBoolean() ? LuaValue.True() : LuaValue.False();
        }
        if (jsonPrimitive.isString()) {
            return LuaString.copydefault(jsonPrimitive.getAsString());
        }
        return null;
    }

    public static void copydefault(java.lang.Class cls) {
        AEQbTJ(cls, C8010aue.copydefault(cls));
    }

    public static void AEQbTJ(java.lang.Class cls, java.lang.Class<? extends LuaUserdata> cls2) {
        copydefault(cls, new TaskDescription(cls2));
    }

    public static void copydefault(java.lang.Class cls, InterfaceC8009aud interfaceC8009aud) {
        OLrzqt.put(cls, interfaceC8009aud);
    }

    public static void KWHzl(java.lang.Class cls) {
        OLrzqt(cls, new ActionBar());
    }

    public static void OLrzqt(java.lang.Class cls, InterfaceC8012aug interfaceC8012aug) {
        KWHzl.put(cls, interfaceC8012aug);
    }

    /* JADX INFO: renamed from: o.aul$TaskDescription */
    public static final class TaskDescription implements InterfaceC8009aud<LuaUserdata, java.lang.Object> {
        public java.lang.reflect.Constructor<? extends LuaUserdata> EZpvd;

        public TaskDescription(java.lang.Class<? extends LuaUserdata> cls) {
            try {
                this.EZpvd = cls.getConstructor(Globals.class, java.lang.Object.class);
            } catch (java.lang.Throwable th) {
                pUU.copydefault("mln", android.util.Log.getStackTraceString(th));
            }
        }

        /* JADX DEBUG: Method merged with bridge method: KWHzl(Lorg/luaj/vm2/Globals;Ljava/lang/Object;)Lorg/luaj/vm2/LuaValue; */
        @Override // o.InterfaceC8009aud
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public LuaUserdata KWHzl(Globals globals, java.lang.Object obj) {
            try {
                return this.EZpvd.newInstance(globals, obj);
            } catch (java.lang.Throwable th) {
                throw new java.lang.RuntimeException(th);
            }
        }
    }

    /* JADX INFO: renamed from: o.aul$ActionBar */
    public static final class ActionBar implements InterfaceC8012aug<LuaUserdata, java.lang.Object> {
        private ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Lorg/luaj/vm2/LuaValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC8012aug
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public java.lang.Object copydefault(LuaUserdata luaUserdata) {
            java.lang.Object javaUserdata = luaUserdata.getJavaUserdata();
            luaUserdata.destroy();
            return javaUserdata;
        }
    }
}
