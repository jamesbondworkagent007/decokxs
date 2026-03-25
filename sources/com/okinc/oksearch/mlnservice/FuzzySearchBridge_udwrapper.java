package com.okinc.oksearch.mlnservice;

import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes24.dex */
@InterfaceC60044zuT
public class FuzzySearchBridge_udwrapper extends LuaUserdata {
    public static final String[] methods = {"fuzzySearchWithArrayV2", "fuzzySearchWithArray"};

    public FuzzySearchBridge_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public FuzzySearchBridge_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new FuzzySearchBridge(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public FuzzySearchBridge getJavaUserdata() {
        return (FuzzySearchBridge) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] fuzzySearchWithArrayV2(LuaValue[] luaValueArr) {
        String javaString = null;
        LuaTable luaTable = (LuaTable) (luaValueArr.length > 0 ? luaValueArr[0] : null);
        String javaString2 = (luaValueArr.length <= 1 || !luaValueArr[1].isString()) ? null : luaValueArr[1].toJavaString();
        String javaString3 = (luaValueArr.length <= 2 || !luaValueArr[2].isString()) ? null : luaValueArr[2].toJavaString();
        String javaString4 = (luaValueArr.length <= 3 || !luaValueArr[3].isString()) ? null : luaValueArr[3].toJavaString();
        if (luaValueArr.length > 4 && luaValueArr[4].isString()) {
            javaString = luaValueArr[4].toJavaString();
        }
        return LuaValue.varargsOf(((FuzzySearchBridge) this.javaUserdata).fuzzySearchWithArrayV2(luaTable, javaString2, javaString3, javaString4, javaString));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] fuzzySearchWithArray(LuaValue[] luaValueArr) {
        String javaString = null;
        LuaTable luaTable = (LuaTable) (luaValueArr.length > 0 ? luaValueArr[0] : null);
        String javaString2 = (luaValueArr.length <= 1 || !luaValueArr[1].isString()) ? null : luaValueArr[1].toJavaString();
        String javaString3 = (luaValueArr.length <= 2 || !luaValueArr[2].isString()) ? null : luaValueArr[2].toJavaString();
        if (luaValueArr.length > 3 && luaValueArr[3].isString()) {
            javaString = luaValueArr[3].toJavaString();
        }
        return LuaValue.varargsOf(((FuzzySearchBridge) this.javaUserdata).fuzzySearchWithArray(luaTable, javaString2, javaString3, javaString));
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
