package com.okinc.planet.mlnservice;

import o.C8017aul;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes24.dex */
@InterfaceC60044zuT
public class MLNPlanetBridge_udwrapper extends LuaUserdata {
    public static final String[] methods = {"showSoftKeyBoardView", "openPersonalHomepage", "openPersonalHomepageWithExtraParams", "getPlanetABTest", "isPlanetEnable", "checkPublisherEnable", "isShowPublisher", "setMemoryCache", "getMemoryCache", "showPublisher", "checkIsOrbiter", "checkIsOrbiterCached", "openOrbiterUpgradeFlow", "isOrbiterUpgradeCheckRequired", "openProfileEditPage", "isProfileModified", "showSnackBar", "dashboardReport", "a_measureTextHeight", "isKlineThemeMode", "getStableCoin", "triggerVibration", "getProductABSwitch", "getGrayABSwitch", "getCurrentUsername", "shareFeedDetail", "sharePageSnapshot", "filterUserPreFeed", "showFeedDetailSharingDialog", "showFeedDetailSharingDialogToIM", "notifyEvent", "formatQuantity", "clearViewClick", "goToPluginDetail"};

    public MLNPlanetBridge_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public MLNPlanetBridge_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new MLNPlanetBridge(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public MLNPlanetBridge getJavaUserdata() {
        return (MLNPlanetBridge) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showSoftKeyBoardView(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).showSoftKeyBoardView(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] openPersonalHomepage(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).openPersonalHomepage(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] openPersonalHomepageWithExtraParams(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).openPersonalHomepageWithExtraParams(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getPlanetABTest(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((MLNPlanetBridge) this.javaUserdata).getPlanetABTest()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isPlanetEnable(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((MLNPlanetBridge) this.javaUserdata).isPlanetEnable()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] checkPublisherEnable(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).checkPublisherEnable(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isShowPublisher(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((MLNPlanetBridge) this.javaUserdata).isShowPublisher()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setMemoryCache(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).setMemoryCache(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getMemoryCache(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).getMemoryCache(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showPublisher(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).showPublisher(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] checkIsOrbiter(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((MLNPlanetBridge) this.javaUserdata).checkIsOrbiter()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] checkIsOrbiterCached(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((MLNPlanetBridge) this.javaUserdata).checkIsOrbiterCached()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] openOrbiterUpgradeFlow(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).openOrbiterUpgradeFlow(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isOrbiterUpgradeCheckRequired(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((MLNPlanetBridge) this.javaUserdata).isOrbiterUpgradeCheckRequired()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] openProfileEditPage(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).openProfileEditPage(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isProfileModified(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((MLNPlanetBridge) this.javaUserdata).isProfileModified()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showSnackBar(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).showSnackBar(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] dashboardReport(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).dashboardReport(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] a_measureTextHeight(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).a_measureTextHeight(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isKlineThemeMode(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).isKlineThemeMode());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getStableCoin(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).getStableCoin());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] triggerVibration(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).triggerVibration());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getProductABSwitch(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).getProductABSwitch(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getGrayABSwitch(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).getGrayABSwitch(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getCurrentUsername(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).getCurrentUsername(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] shareFeedDetail(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).shareFeedDetail(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] sharePageSnapshot(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).sharePageSnapshot(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] filterUserPreFeed(LuaValue[] luaValueArr) {
        ((MLNPlanetBridge) this.javaUserdata).filterUserPreFeed(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showFeedDetailSharingDialog(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).showFeedDetailSharingDialog(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showFeedDetailSharingDialogToIM(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).showFeedDetailSharingDialogToIM(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] notifyEvent(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).notifyEvent(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] formatQuantity(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).formatQuantity(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] clearViewClick(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).clearViewClick(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] goToPluginDetail(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((MLNPlanetBridge) this.javaUserdata).goToPluginDetail(luaValueArr));
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
