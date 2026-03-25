package com.okinc.business.invest_biz.mln.bridge;

import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes23.dex */
@InterfaceC60044zuT
public class InvestDataFormatBridge_udwrapper extends LuaUserdata {
    public static final String[] methods = {"percentNumberDisplay", "formatCurrencyDataWithKMB", "formatCurrencyDataWithMB", "formatCurrencyDataWithoutKMB"};

    public InvestDataFormatBridge_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public InvestDataFormatBridge_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new InvestDataFormatBridge();
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public InvestDataFormatBridge getJavaUserdata() {
        return (InvestDataFormatBridge) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] percentNumberDisplay(LuaValue[] luaValueArr) {
        return ((InvestDataFormatBridge) this.javaUserdata).percentNumberDisplay(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] formatCurrencyDataWithKMB(LuaValue[] luaValueArr) {
        return ((InvestDataFormatBridge) this.javaUserdata).formatCurrencyDataWithKMB(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] formatCurrencyDataWithMB(LuaValue[] luaValueArr) {
        return ((InvestDataFormatBridge) this.javaUserdata).formatCurrencyDataWithMB(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] formatCurrencyDataWithoutKMB(LuaValue[] luaValueArr) {
        return ((InvestDataFormatBridge) this.javaUserdata).formatCurrencyDataWithoutKMB(luaValueArr);
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
