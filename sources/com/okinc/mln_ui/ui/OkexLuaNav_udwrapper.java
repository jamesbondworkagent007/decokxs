package com.okinc.mln_ui.ui;

import java.util.Map;
import o.C60039zuO;
import o.C8017aul;
import o.InterfaceC60044zuT;
import o.InterfaceC8029auy;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes23.dex */
@InterfaceC60044zuT
public class OkexLuaNav_udwrapper extends LuaUserdata {
    public static final String[] methods = {"methodA", "methodC", "gotoPage", "property"};

    public OkexLuaNav_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public OkexLuaNav_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new OkexLuaNav(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public OkexLuaNav getJavaUserdata() {
        return (OkexLuaNav) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] methodA(LuaValue[] luaValueArr) {
        ((OkexLuaNav) this.javaUserdata).methodA();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] methodC(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C60039zuO.KWHzl(this.globals, ((OkexLuaNav) this.javaUserdata).methodB(luaValueArr[0].toInt(), luaValueArr[1].toBoolean(), (luaValueArr.length <= 2 || !luaValueArr[2].isString()) ? null : luaValueArr[2].toJavaString(), (luaValueArr.length <= 3 || luaValueArr[3].isNil()) ? null : (InterfaceC8029auy) C8017aul.AEQbTJ(luaValueArr[3], InterfaceC8029auy.class), luaValueArr.length > 4 ? luaValueArr[4] : null)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] gotoPage(LuaValue[] luaValueArr) {
        ((OkexLuaNav) this.javaUserdata).gotoPage((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (Map) C8017aul.AEQbTJ(luaValueArr[1], Map.class), luaValueArr[2].toInt());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] property(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.varargsOf(LuaNumber.valueOf(((OkexLuaNav) this.javaUserdata).EZpvd));
        }
        ((OkexLuaNav) this.javaUserdata).EZpvd = luaValueArr[0].toInt();
        return null;
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
