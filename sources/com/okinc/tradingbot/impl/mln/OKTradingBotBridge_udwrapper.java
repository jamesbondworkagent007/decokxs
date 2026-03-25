package com.okinc.tradingbot.impl.mln;

import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes24.dex */
@InterfaceC60044zuT
public class OKTradingBotBridge_udwrapper extends LuaUserdata {
    public static final String[] methods = {"a_setTheme", "dismissSheet", "navigateToSmartArbCustomParamsPage", "getPriceDisplaySymbol", "isNegativeContract", "presentAdjustLeverVC", "navigateToBotCopySuccessPage", "getInstDisplayText", "getTradeAccountLevel", "a_showSnackbar"};

    public OKTradingBotBridge_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public OKTradingBotBridge_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new OKTradingBotBridge(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public OKTradingBotBridge getJavaUserdata() {
        return (OKTradingBotBridge) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] a_setTheme(LuaValue[] luaValueArr) {
        ((OKTradingBotBridge) this.javaUserdata).a_setTheme(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] dismissSheet(LuaValue[] luaValueArr) {
        ((OKTradingBotBridge) this.javaUserdata).dismissSheet();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] navigateToSmartArbCustomParamsPage(LuaValue[] luaValueArr) {
        ((OKTradingBotBridge) this.javaUserdata).navigateToSmartArbCustomParamsPage(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getPriceDisplaySymbol(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKTradingBotBridge) this.javaUserdata).getPriceDisplaySymbol(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isNegativeContract(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKTradingBotBridge) this.javaUserdata).isNegativeContract(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] presentAdjustLeverVC(LuaValue[] luaValueArr) {
        ((OKTradingBotBridge) this.javaUserdata).presentAdjustLeverVC(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] navigateToBotCopySuccessPage(LuaValue[] luaValueArr) {
        ((OKTradingBotBridge) this.javaUserdata).navigateToBotCopySuccessPage(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getInstDisplayText(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKTradingBotBridge) this.javaUserdata).getInstDisplayText(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getTradeAccountLevel(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKTradingBotBridge) this.javaUserdata).getTradeAccountLevel());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] a_showSnackbar(LuaValue[] luaValueArr) {
        ((OKTradingBotBridge) this.javaUserdata).a_showSnackbar(luaValueArr);
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
