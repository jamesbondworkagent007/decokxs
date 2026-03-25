package com.immomo.mls.fun.lt;

import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import java.util.List;
import java.util.Map;
import o.C7323ahf;
import o.InterfaceC7298ahG;
import o.InterfaceC7835arN;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@LuaClass
public class SIGlobalEvent {
    public static final String LUA_CLASS_NAME = "OKGlobalEvent";
    public Map<String, List<InterfaceC7835arN>> globalEvents;

    public SIGlobalEvent(Globals globals, LuaValue[] luaValueArr) {
    }

    public void EZpvd() {
        KWHzl();
    }

    public final void KWHzl() {
        Map<String, List<InterfaceC7835arN>> map = this.globalEvents;
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, List<InterfaceC7835arN>> entry : this.globalEvents.entrySet()) {
            String key = entry.getKey();
            List<InterfaceC7835arN> value = entry.getValue();
            C7323ahf.KWHzl().AEQbTJ(key, (InterfaceC7835arN[]) value.toArray(new InterfaceC7835arN[value.size()]));
        }
    }

    @LuaBridge
    @Deprecated
    public void addEvent(String str, InterfaceC7835arN interfaceC7835arN, String str2) {
        InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
        if (interfaceC7298ahGKWHzl != null) {
            interfaceC7298ahGKWHzl.EZpvd(str, interfaceC7835arN, str2);
        }
    }

    @LuaBridge
    public void postEvent(String str, Map map) {
        Object obj;
        InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
        if (interfaceC7298ahGKWHzl != null) {
            interfaceC7298ahGKWHzl.AEQbTJ(str, (map == null || (obj = map.get("dst_l_evn")) == null) ? null : obj.toString().split("\\|"), map);
        }
    }

    @LuaBridge
    public void removeEventListener(String str, InterfaceC7835arN interfaceC7835arN) {
        InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
        if (interfaceC7298ahGKWHzl != null) {
            interfaceC7298ahGKWHzl.AEQbTJ(str, interfaceC7835arN);
        }
    }

    @LuaBridge
    public void removeEvent(String str, String str2) {
        InterfaceC7298ahG interfaceC7298ahGKWHzl = C7323ahf.KWHzl();
        if (interfaceC7298ahGKWHzl != null) {
            interfaceC7298ahGKWHzl.OLrzqt(str, str2);
        }
    }
}
