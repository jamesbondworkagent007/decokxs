package com.okinc.trade.experience.bridge;

import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes24.dex */
@InterfaceC60044zuT
public class UDOKMarketBridge_udwrapper extends LuaUserdata {
    public static final String[] methods = {"a_measureTextHeight", "isKlineThemeMode", "getStableCoin", "triggerVibration", "getProductABSwitch", "getGrayABSwitch", "getCurrentUsername", "shareFeedDetail", "sharePageSnapshot", "filterUserPreFeed", "showFeedDetailSharingDialog", "showFeedDetailSharingDialogToIM", "notifyEvent", "formatQuantity", "clearViewClick", "isMarketEnabledInExplore", "isCedefiBoostEnabledInExplore", "enableCeDeFiBoost"};

    public UDOKMarketBridge_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public UDOKMarketBridge_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new UDOKMarketBridge(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public UDOKMarketBridge getJavaUserdata() {
        return (UDOKMarketBridge) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] a_measureTextHeight(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDOKMarketBridge) this.javaUserdata).a_measureTextHeight(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isKlineThemeMode(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDOKMarketBridge) this.javaUserdata).isKlineThemeMode());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getStableCoin(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDOKMarketBridge) this.javaUserdata).getStableCoin());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] triggerVibration(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDOKMarketBridge) this.javaUserdata).triggerVibration());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getProductABSwitch(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDOKMarketBridge) this.javaUserdata).getProductABSwitch(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getGrayABSwitch(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDOKMarketBridge) this.javaUserdata).getGrayABSwitch(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getCurrentUsername(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDOKMarketBridge) this.javaUserdata).getCurrentUsername(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] shareFeedDetail(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDOKMarketBridge) this.javaUserdata).shareFeedDetail(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] sharePageSnapshot(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDOKMarketBridge) this.javaUserdata).sharePageSnapshot(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] filterUserPreFeed(LuaValue[] luaValueArr) {
        ((UDOKMarketBridge) this.javaUserdata).filterUserPreFeed(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showFeedDetailSharingDialog(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDOKMarketBridge) this.javaUserdata).showFeedDetailSharingDialog(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showFeedDetailSharingDialogToIM(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDOKMarketBridge) this.javaUserdata).showFeedDetailSharingDialogToIM(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] notifyEvent(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDOKMarketBridge) this.javaUserdata).notifyEvent(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] formatQuantity(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDOKMarketBridge) this.javaUserdata).formatQuantity(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] clearViewClick(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDOKMarketBridge) this.javaUserdata).clearViewClick(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isMarketEnabledInExplore(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDOKMarketBridge) this.javaUserdata).isMarketEnabledInExplore());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isCedefiBoostEnabledInExplore(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDOKMarketBridge) this.javaUserdata).isCedefiBoostEnabledInExplore());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] enableCeDeFiBoost(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDOKMarketBridge) this.javaUserdata).enableCeDeFiBoost());
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
