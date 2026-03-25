package o;

import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: renamed from: o.asp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7916asp {
    private C7916asp() {
    }

    public static java.util.Map<java.lang.String, java.lang.Object> OLrzqt(LuaTable luaTable) {
        java.util.HashMap map = new java.util.HashMap();
        if (!luaTable.gHZMYf()) {
            return map;
        }
        while (true) {
            LuaValue[] luaValueArrSSMYrx = luaTable.sSMYrx();
            if (luaValueArrSSMYrx != null) {
                java.lang.String javaString = luaValueArrSSMYrx[0].toJavaString();
                LuaValue luaValue = luaValueArrSSMYrx[1];
                if (luaValue.isTable()) {
                    LuaTable luaTable2 = luaValue.toLuaTable();
                    if (luaTable2.zLjUOn() > 0) {
                        map.put(javaString, copydefault(luaTable2));
                    } else if (!luaTable2.AuCTelauCTel()) {
                        map.put(javaString, OLrzqt(luaTable2));
                    } else {
                        luaValue.destroy();
                    }
                } else {
                    map.put(javaString, C7910asj.EZpvd(luaValue));
                }
            } else {
                luaTable.zsXlph();
                luaTable.destroy();
                return map;
            }
        }
    }

    public static java.util.List<java.lang.Object> copydefault(LuaTable luaTable) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iZLjUOn = luaTable.zLjUOn();
        for (int i = 1; i <= iZLjUOn; i++) {
            LuaValue luaValue = luaTable.get(i);
            if (luaValue.isTable()) {
                LuaTable luaTable2 = luaValue.toLuaTable();
                if (luaTable2.zLjUOn() > 0) {
                    arrayList.add(copydefault(luaTable2));
                } else if (!luaTable2.AuCTelauCTel()) {
                    arrayList.add(OLrzqt(luaTable2));
                } else {
                    luaValue.destroy();
                }
            } else {
                arrayList.add(C7910asj.EZpvd(luaValue));
            }
        }
        luaTable.destroy();
        return arrayList;
    }
}
