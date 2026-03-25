package com.okinc.core.ok_app.mlnservices;

import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes23.dex */
@InterfaceC60044zuT
public class UDOKApp_udwrapper extends LuaUserdata {
    public static final String[] methods = {"getMode", "isModeLite", "isFullApp", "supportScheme", "property"};

    public UDOKApp_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public UDOKApp_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new UDOKApp(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public UDOKApp getJavaUserdata() {
        return (UDOKApp) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getMode(LuaValue[] luaValueArr) {
        return ((UDOKApp) this.javaUserdata).getMode(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isModeLite(LuaValue[] luaValueArr) {
        return ((UDOKApp) this.javaUserdata).isModeLite(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isFullApp(LuaValue[] luaValueArr) {
        return ((UDOKApp) this.javaUserdata).isFullApp(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] supportScheme(LuaValue[] luaValueArr) {
        return ((UDOKApp) this.javaUserdata).supportScheme(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] property(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.varargsOf(LuaNumber.valueOf(((UDOKApp) this.javaUserdata).property));
        }
        ((UDOKApp) this.javaUserdata).property = luaValueArr[0].toInt();
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
