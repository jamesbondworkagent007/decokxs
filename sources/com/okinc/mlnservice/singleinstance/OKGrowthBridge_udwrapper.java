package com.okinc.mlnservice.singleinstance;

import o.C8017aul;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes23.dex */
@InterfaceC60044zuT
public class OKGrowthBridge_udwrapper extends LuaUserdata {
    public static final String[] methods = {"isInDemoTrading", "switchTradeMode", "useNewMiniApp", "getCurrencyDCISOCodeLowercase", "getCurrencyDCISOCodeUppercase", "getCurrencyDCSymbol", "getXCdnHeaderDomain", "goToTradeModePageWithType", "getCurrentTradeMarginType", "changeTradeMarginType", "reportPopupInteraction", "homeOnBoardingIsTreatment", "appendOKTSBaggageValues", "setGrowthSoftInputMode", "getIMGroupUnreadCount", "jumpToChatActivity"};

    public OKGrowthBridge_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public OKGrowthBridge_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new OKGrowthBridge(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public OKGrowthBridge getJavaUserdata() {
        return (OKGrowthBridge) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isInDemoTrading(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((OKGrowthBridge) this.javaUserdata).isInDemoTrading(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] switchTradeMode(LuaValue[] luaValueArr) {
        ((OKGrowthBridge) this.javaUserdata).switchTradeMode(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] useNewMiniApp(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((OKGrowthBridge) this.javaUserdata).useNewMiniApp(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getCurrencyDCISOCodeLowercase(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKGrowthBridge) this.javaUserdata).getCurrencyDCISOCodeLowercase(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getCurrencyDCISOCodeUppercase(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKGrowthBridge) this.javaUserdata).getCurrencyDCISOCodeUppercase(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getCurrencyDCSymbol(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKGrowthBridge) this.javaUserdata).getCurrencyDCSymbol(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getXCdnHeaderDomain(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKGrowthBridge) this.javaUserdata).getXCdnHeaderDomain(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] goToTradeModePageWithType(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKGrowthBridge) this.javaUserdata).goToTradeModePageWithType(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getCurrentTradeMarginType(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKGrowthBridge) this.javaUserdata).getCurrentTradeMarginType(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] changeTradeMarginType(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKGrowthBridge) this.javaUserdata).changeTradeMarginType(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] reportPopupInteraction(LuaValue[] luaValueArr) {
        ((OKGrowthBridge) this.javaUserdata).reportPopupInteraction(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] homeOnBoardingIsTreatment(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKGrowthBridge) this.javaUserdata).homeOnBoardingIsTreatment(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] appendOKTSBaggageValues(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKGrowthBridge) this.javaUserdata).appendOKTSBaggageValues(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setGrowthSoftInputMode(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKGrowthBridge) this.javaUserdata).setGrowthSoftInputMode(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getIMGroupUnreadCount(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKGrowthBridge) this.javaUserdata).getIMGroupUnreadCount(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] jumpToChatActivity(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKGrowthBridge) this.javaUserdata).jumpToChatActivity(luaValueArr));
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

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    @InterfaceC60044zuT
    public void __onLuaGc() {
        T t = this.javaUserdata;
        if (t != 0) {
            this.javaUserdata = null;
            ((OKGrowthBridge) t).KWHzl();
            this.javaUserdata = null;
        }
        super.__onLuaGc();
    }
}
