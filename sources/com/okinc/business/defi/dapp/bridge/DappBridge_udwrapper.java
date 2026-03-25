package com.okinc.business.defi.dapp.bridge;

import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes23.dex */
@InterfaceC60044zuT
public class DappBridge_udwrapper extends LuaUserdata {
    public static final String[] methods = {DappBridge.EVENT_KEY_CLOSE_DAPP_NEW_HOME_PAGE, "closeDappSearchPage", "openDappSearchFragment", "validateDeeplinkScheme", "requestDappWhiteList", "presentToSearchVC", "openManagementPage", "validateDAppWhiteList", "openDAppBrowserWithDic", "getCurrentSelectedTab", "abTestForDAppUseMLN", "switchToDiscoverTabbar", "getABTestValueForFlag", "getDappHistory", "getRecentAccess", "removeRecentAccess", "clearDappAllHistory", "deleteDappHistory", "regexDeeplink", "openSelectChainDialog", "startNotification", "cancelNotification", "getWebTabCount", "discoverDBFilePath", "openSettings", "getNotificationAuth", "showBoostTab", "registerHashStatus", "registerCedefiHashStatus", "selectWallet", "isAppInstalled", "openDappNewHomePage", "getTimeZoneOffset"};

    public DappBridge_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public DappBridge_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new DappBridge(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public DappBridge getJavaUserdata() {
        return (DappBridge) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] closeDappNewHomePage(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).closeDappNewHomePage();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] closeDappSearchPage(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).closeDappSearchPage();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] openDappSearchFragment(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).openDappSearchFragment(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] validateDeeplinkScheme(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).validateDeeplinkScheme(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] requestDappWhiteList(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).requestDappWhiteList(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] presentToSearchVC(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).presentToSearchVC(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] openManagementPage(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).openManagementPage(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] validateDAppWhiteList(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).validateDAppWhiteList(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] openDAppBrowserWithDic(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).openDAppBrowserWithDic(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getCurrentSelectedTab(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).getCurrentSelectedTab(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] abTestForDAppUseMLN(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).abTestForDAppUseMLN(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] switchToDiscoverTabbar(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).switchToDiscoverTabbar(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getABTestValueForFlag(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).getABTestValueForFlag(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getDappHistory(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).getDappHistory(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getRecentAccess(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).getRecentAccess(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] removeRecentAccess(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).removeRecentAccess(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] clearDappAllHistory(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).clearDappAllHistory(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] deleteDappHistory(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).deleteDappHistory(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] regexDeeplink(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).regexDeeplink(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] openSelectChainDialog(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).openSelectChainDialog(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] startNotification(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).startNotification(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] cancelNotification(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).cancelNotification(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getWebTabCount(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).getWebTabCount(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] discoverDBFilePath(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).discoverDBFilePath(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] openSettings(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).openSettings(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getNotificationAuth(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).getNotificationAuth(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showBoostTab(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).showBoostTab(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] registerHashStatus(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).registerHashStatus(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] registerCedefiHashStatus(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).registerCedefiHashStatus();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] selectWallet(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).selectWallet(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isAppInstalled(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).isAppInstalled(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] openDappNewHomePage(LuaValue[] luaValueArr) {
        ((DappBridge) this.javaUserdata).openDappNewHomePage((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), luaValueArr[1].toInt(), (luaValueArr.length <= 2 || !luaValueArr[2].isString()) ? null : luaValueArr[2].toJavaString());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getTimeZoneOffset(LuaValue[] luaValueArr) {
        return ((DappBridge) this.javaUserdata).getTimeZoneOffset(luaValueArr);
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
