package o;

import com.immomo.mls.fun.ud.UDStyleString;
import com.immomo.mls.fun.ud.view.UDView;
import java.util.Map;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.asj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7910asj {
    public static java.lang.Object EZpvd(@androidx.annotation.Nullable LuaValue luaValue) {
        if (luaValue == null || luaValue.isNil()) {
            return null;
        }
        if ((luaValue instanceof UDView) || (luaValue instanceof UDStyleString)) {
            return luaValue;
        }
        int iType = luaValue.type();
        if (iType == 1) {
            return java.lang.Boolean.valueOf(luaValue.toBoolean());
        }
        if (iType != 2) {
            if (iType == 3) {
                double d = luaValue.toDouble();
                int i = (int) d;
                if (d == i) {
                    return java.lang.Integer.valueOf(i);
                }
                long j = (long) d;
                if (d == j) {
                    return java.lang.Long.valueOf(j);
                }
                return java.lang.Double.valueOf(d);
            }
            if (iType == 4) {
                return luaValue.toJavaString();
            }
            if (iType == 5) {
                return AEQbTJ(luaValue.toLuaTable());
            }
            if (iType != 7) {
                return luaValue;
            }
        }
        LuaUserdata userdata = luaValue.toUserdata();
        java.lang.Object javaUserdata = userdata.getJavaUserdata();
        return C8017aul.AEQbTJ(userdata, javaUserdata != null ? javaUserdata.getClass() : null);
    }

    public static java.util.Map AEQbTJ(@androidx.annotation.NonNull LuaTable luaTable) {
        java.util.HashMap map = new java.util.HashMap();
        if (!luaTable.gHZMYf()) {
            return map;
        }
        while (true) {
            LuaValue[] luaValueArrSSMYrx = luaTable.sSMYrx();
            if (luaValueArrSSMYrx != null) {
                map.put(EZpvd(luaValueArrSSMYrx[0]), EZpvd(luaValueArrSSMYrx[1]));
            } else {
                luaTable.zsXlph();
                luaTable.destroy();
                return map;
            }
        }
    }

    public static java.util.List copydefault(@androidx.annotation.NonNull LuaTable luaTable) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!luaTable.gHZMYf()) {
            return arrayList;
        }
        while (true) {
            LuaValue[] luaValueArrSSMYrx = luaTable.sSMYrx();
            if (luaValueArrSSMYrx != null) {
                arrayList.add(EZpvd(luaValueArrSSMYrx[1]));
            } else {
                luaTable.zsXlph();
                luaTable.destroy();
                return arrayList;
            }
        }
    }

    public static java.util.List OLrzqt(@androidx.annotation.NonNull LuaTable luaTable) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iZLjUOn = luaTable.zLjUOn();
        for (int i = 1; i <= iZLjUOn; i++) {
            arrayList.add(EZpvd(luaTable.get(i)));
        }
        luaTable.destroy();
        return arrayList;
    }

    public static LuaTable EZpvd(@androidx.annotation.NonNull Globals globals, @androidx.annotation.NonNull java.util.Map<java.lang.String, java.lang.Object> map) {
        LuaTable luaTableAEQbTJ = LuaTable.AEQbTJ(globals);
        for (Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (value == null) {
                luaTableAEQbTJ.set(key, LuaValue.Nil());
            } else if (value instanceof java.lang.Number) {
                luaTableAEQbTJ.set(key, ((java.lang.Number) value).doubleValue());
            } else if (value instanceof java.lang.String) {
                luaTableAEQbTJ.set(key, value.toString());
            } else if (value instanceof java.lang.Boolean) {
                luaTableAEQbTJ.set(key, ((java.lang.Boolean) value).booleanValue());
            } else if (value instanceof java.util.Map) {
                luaTableAEQbTJ.set(key, EZpvd(globals, (java.util.Map) value));
            } else if (value instanceof java.util.List) {
                luaTableAEQbTJ.set(key, OLrzqt(globals, (java.util.List) value));
            } else {
                luaTableAEQbTJ.set(key, KWHzl(globals, value));
            }
        }
        return luaTableAEQbTJ;
    }

    public static LuaTable OLrzqt(@androidx.annotation.NonNull Globals globals, @androidx.annotation.NonNull java.util.List list) {
        LuaTable luaTableAEQbTJ = LuaTable.AEQbTJ(globals);
        int size = list.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj = list.get(i);
            i++;
            if (obj == null) {
                luaTableAEQbTJ.set(i, LuaValue.Nil());
            } else if (obj instanceof java.lang.Number) {
                luaTableAEQbTJ.set(i, ((java.lang.Number) obj).doubleValue());
            } else if (obj instanceof java.lang.String) {
                luaTableAEQbTJ.set(i, obj.toString());
            } else if (obj instanceof java.lang.Boolean) {
                luaTableAEQbTJ.set(i, ((java.lang.Boolean) obj).booleanValue());
            } else if (obj instanceof java.util.Map) {
                luaTableAEQbTJ.set(i, EZpvd(globals, (java.util.Map) obj));
            } else if (obj instanceof java.util.List) {
                luaTableAEQbTJ.set(i, OLrzqt(globals, (java.util.List) obj));
            } else {
                luaTableAEQbTJ.set(i, KWHzl(globals, obj));
            }
        }
        return luaTableAEQbTJ;
    }

    public static LuaValue KWHzl(@androidx.annotation.NonNull Globals globals, java.lang.Object obj) {
        LuaValue luaValueCopydefault = C8017aul.EZpvd(obj) ? C8017aul.copydefault(obj) : null;
        if (luaValueCopydefault == null && (obj instanceof InterfaceC7396aiz)) {
            return ((InterfaceC7396aiz) obj).EZpvd();
        }
        return luaValueCopydefault == null ? C8017aul.copydefault(globals, obj) : luaValueCopydefault;
    }
}
