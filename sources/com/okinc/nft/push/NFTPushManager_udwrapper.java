package com.okinc.nft.push;

import java.util.Map;
import o.C8017aul;
import o.InterfaceC60044zuT;
import o.InterfaceC7835arN;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes23.dex */
@InterfaceC60044zuT
public class NFTPushManager_udwrapper extends LuaUserdata {
    public static final String[] methods = {"addListenerWithParams", "addCommonListenerWithParams", "removeListenerWithChannelId", "removeListenerWithId"};

    public NFTPushManager_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public NFTPushManager_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new NFTPushManager(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public NFTPushManager getJavaUserdata() {
        return (NFTPushManager) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] addListenerWithParams(LuaValue[] luaValueArr) {
        ((NFTPushManager) this.javaUserdata).addListenerWithParams((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), luaValueArr[1].toInt(), (luaValueArr.length <= 2 || !luaValueArr[2].isString()) ? null : luaValueArr[2].toJavaString(), (luaValueArr.length <= 3 || luaValueArr[3].isNil()) ? null : (Map) C8017aul.AEQbTJ(luaValueArr[3], Map.class), (luaValueArr.length <= 4 || luaValueArr[4].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[4], InterfaceC7835arN.class), (luaValueArr.length <= 5 || luaValueArr[5].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[5], InterfaceC7835arN.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] addCommonListenerWithParams(LuaValue[] luaValueArr) {
        ((NFTPushManager) this.javaUserdata).addCommonListenerWithParams((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (Map) C8017aul.AEQbTJ(luaValueArr[1], Map.class), (luaValueArr.length <= 2 || luaValueArr[2].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[2], InterfaceC7835arN.class), (luaValueArr.length <= 3 || luaValueArr[3].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[3], InterfaceC7835arN.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] removeListenerWithChannelId(LuaValue[] luaValueArr) {
        return ((NFTPushManager) this.javaUserdata).removeListenerWithChannelId(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] removeListenerWithId(LuaValue[] luaValueArr) {
        return ((NFTPushManager) this.javaUserdata).removeListenerWithId(luaValueArr);
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    @InterfaceC60044zuT
    public String toString() {
        return String.valueOf(this.javaUserdata);
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        T t = this.javaUserdata;
        if (t != 0) {
            return t.equals(((LuaUserdata) obj).getJavaUserdata());
        }
        return ((LuaUserdata) obj).getJavaUserdata() == null;
    }

    @Override // org.luaj.vm2.LuaUserdata
    @InterfaceC60044zuT
    public boolean __onLuaEq(Object obj) {
        return equals(obj);
    }
}
