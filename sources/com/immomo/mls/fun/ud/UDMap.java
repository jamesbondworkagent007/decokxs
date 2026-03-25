package com.immomo.mls.fun.ud;

import androidx.collection.ArrayMap;
import com.immomo.mls.fun.ud.view.UDView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C7910asj;
import o.InterfaceC60044zuT;
import o.InterfaceC8009aud;
import o.InterfaceC8012aug;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDMap extends LuaUserdata<Map> {
    public static final InterfaceC8009aud<UDMap, Map> OLrzqt = new InterfaceC8009aud<UDMap, Map>() { // from class: com.immomo.mls.fun.ud.UDMap.1
        /* JADX DEBUG: Method merged with bridge method: KWHzl(Lorg/luaj/vm2/Globals;Ljava/lang/Object;)Lorg/luaj/vm2/LuaValue; */
        @Override // o.InterfaceC8009aud
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public UDMap KWHzl(Globals globals, Map map) {
            return new UDMap(globals, map);
        }
    };
    public static final InterfaceC8012aug<LuaValue, Map> KWHzl = new InterfaceC8012aug<LuaValue, Map>() { // from class: com.immomo.mls.fun.ud.UDMap.5
        /* JADX DEBUG: Method merged with bridge method: copydefault(Lorg/luaj/vm2/LuaValue;)Ljava/lang/Object; */
        @Override // o.InterfaceC8012aug
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public Map copydefault(LuaValue luaValue) {
            if (luaValue.isTable()) {
                return C7910asj.AEQbTJ((LuaTable) luaValue);
            }
            return ((UDMap) luaValue).EZpvd();
        }
    };

    public static native void _init();

    public static native void _register(long j, String str);

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.HashMap] */
    @InterfaceC60044zuT
    public UDMap(long j) {
        super(j, (LuaValue[]) null);
        this.javaUserdata = new HashMap(10);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.util.HashMap] */
    @InterfaceC60044zuT
    public UDMap(long j, int i) {
        super(j, (LuaValue[]) null);
        this.javaUserdata = new HashMap(i);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.collection.ArrayMap] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.util.Map] */
    public UDMap(Globals globals, Object obj) {
        super(globals, (Object) null);
        if (obj == null) {
            this.javaUserdata = new ArrayMap(0);
        } else {
            this.javaUserdata = (Map) obj;
        }
    }

    public Object OLrzqt(LuaValue luaValue) {
        if (luaValue == null || luaValue.isNil()) {
            return null;
        }
        if (luaValue instanceof UDView) {
            return luaValue;
        }
        if (luaValue.isTable()) {
            return C7910asj.AEQbTJ(luaValue.toLuaTable());
        }
        return luaValue.toUserdata().getJavaUserdata();
    }

    public Object EZpvd(double d) {
        int i = (int) d;
        if (d == i) {
            return Integer.valueOf(i);
        }
        long j = (long) d;
        if (d == j) {
            return Long.valueOf(j);
        }
        return Double.valueOf(d);
    }

    @InterfaceC60044zuT
    public void put(String str, boolean z) {
        ((Map) this.javaUserdata).put(str, Boolean.valueOf(z));
    }

    @InterfaceC60044zuT
    public LuaValue contains(String str) {
        return C7910asj.KWHzl(getGlobals(), Boolean.valueOf(((Map) this.javaUserdata).containsKey(str)));
    }

    @InterfaceC60044zuT
    public void put(String str, double d) {
        ((Map) this.javaUserdata).put(str, EZpvd(d));
    }

    @InterfaceC60044zuT
    public void put(String str, String str2) {
        ((Map) this.javaUserdata).put(str, str2);
    }

    @InterfaceC60044zuT
    public void put(String str, LuaValue luaValue) {
        ((Map) this.javaUserdata).put(str, OLrzqt(luaValue));
    }

    @InterfaceC60044zuT
    public void put(double d, boolean z) {
        ((Map) this.javaUserdata).put(EZpvd(d), Boolean.valueOf(z));
    }

    @InterfaceC60044zuT
    public void put(double d, double d2) {
        ((Map) this.javaUserdata).put(EZpvd(d), EZpvd(d2));
    }

    @InterfaceC60044zuT
    public void put(double d, String str) {
        ((Map) this.javaUserdata).put(EZpvd(d), str);
    }

    @InterfaceC60044zuT
    public void put(double d, LuaValue luaValue) {
        ((Map) this.javaUserdata).put(EZpvd(d), OLrzqt(luaValue));
    }

    @InterfaceC60044zuT
    public void put(LuaValue luaValue, LuaValue luaValue2) {
        ((Map) this.javaUserdata).put(luaValue, OLrzqt(luaValue2));
    }

    @InterfaceC60044zuT
    public void putAll(UDMap uDMap) {
        ((Map) this.javaUserdata).putAll((Map) uDMap.javaUserdata);
    }

    @InterfaceC60044zuT
    public void remove(String str) {
        ((Map) this.javaUserdata).remove(str);
    }

    @InterfaceC60044zuT
    public void remove(double d) {
        ((Map) this.javaUserdata).remove(EZpvd(d));
    }

    @InterfaceC60044zuT
    public void remove(LuaValue luaValue) {
        ((Map) this.javaUserdata).remove(OLrzqt(luaValue));
    }

    @InterfaceC60044zuT
    public void removeAll() {
        ((Map) this.javaUserdata).clear();
    }

    @Override // org.luaj.vm2.LuaValue
    @InterfaceC60044zuT
    public LuaValue get(String str) {
        return C7910asj.KWHzl(getGlobals(), ((Map) this.javaUserdata).get(str));
    }

    @InterfaceC60044zuT
    public LuaValue get(double d) {
        return C7910asj.KWHzl(getGlobals(), ((Map) this.javaUserdata).get(EZpvd(d)));
    }

    @InterfaceC60044zuT
    public LuaValue get(LuaValue luaValue) {
        return C7910asj.KWHzl(getGlobals(), ((Map) this.javaUserdata).get(OLrzqt(luaValue)));
    }

    @InterfaceC60044zuT
    public int size() {
        return ((Map) this.javaUserdata).size();
    }

    @InterfaceC60044zuT
    public UDArray allKeys() {
        return new UDArray(getGlobals(), ((Map) this.javaUserdata).keySet());
    }

    @InterfaceC60044zuT
    public LuaValue[] isMap() {
        return LuaValue.rBoolean(true);
    }

    @InterfaceC60044zuT
    public void removeObjects(UDArray uDArray) {
        List javaUserdata = uDArray != null ? uDArray.getJavaUserdata() : null;
        if (javaUserdata != null) {
            Iterator it = javaUserdata.iterator();
            while (it.hasNext()) {
                ((Map) this.javaUserdata).remove(it.next());
            }
        }
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    public String toString() {
        return ((Map) this.javaUserdata).toString();
    }

    public Map EZpvd() {
        return (Map) this.javaUserdata;
    }
}
