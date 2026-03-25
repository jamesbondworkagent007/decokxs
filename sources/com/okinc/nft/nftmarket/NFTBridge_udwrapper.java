package com.okinc.nft.nftmarket;

import o.C8017aul;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes23.dex */
@InterfaceC60044zuT
public class NFTBridge_udwrapper extends LuaUserdata {
    public static final String[] methods = {"setCurrentNFT", "postPushCheckerResult", "saveUrlImage", "isOpenOnDrawListener", "setSearchContainer", "registerProgressChangedCallback", "addProgressChangedCallback", "dismissAll", "dismissAllExcept", "isShowTotalAsset", "apkIsInstalled", "openApkByPackageName", "checkGasStationStratageSupported", "showGasStationPage", "showSupplementList", "showRechargeDialog", "getEncryptSignFromWallet", "checkIsRunningInEmulator", "getGuardReport", "base64Encoding", "base64Decoding", "walletRequestHeader", "goToMap", "addEventToCalendar", "getFileDecodedInfo", "simpleYYYYMMddHHmmWithTimeZone", "simpleYYYYMMddWithTimeZone", "simpleHHmmWithTimeZone", "simpleMMddHHmmWithTimeZone", "checkRegisterStatus", "showChainRegisterDialog", "runStarkNetJS", "checkPasswordForStarknet", "isSupportApplication", "openApplication", "isShowUKBanner", "appUpdateEnable", "updateApp", "removeUpdateCallback", "guestState", "guestAddress", "getTimeZoneName", "clearNativeShareInstance"};

    public NFTBridge_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public NFTBridge_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new NFTBridge(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public NFTBridge getJavaUserdata() {
        return (NFTBridge) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setCurrentNFT(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).setCurrentNFT(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] postPushCheckerResult(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).postPushCheckerResult(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] saveUrlImage(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).saveUrlImage(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isOpenOnDrawListener(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).isOpenOnDrawListener(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setSearchContainer(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).setSearchContainer(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] registerProgressChangedCallback(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).registerProgressChangedCallback(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] addProgressChangedCallback(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).addProgressChangedCallback(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] dismissAll(LuaValue[] luaValueArr) {
        ((NFTBridge) this.javaUserdata).dismissAll();
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] dismissAllExcept(LuaValue[] luaValueArr) {
        ((NFTBridge) this.javaUserdata).dismissAllExcept((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString());
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isShowTotalAsset(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).isShowTotalAsset();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] apkIsInstalled(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).apkIsInstalled(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] openApkByPackageName(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).openApkByPackageName(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] checkGasStationStratageSupported(LuaValue[] luaValueArr) {
        ((NFTBridge) this.javaUserdata).checkGasStationStratageSupported(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showGasStationPage(LuaValue[] luaValueArr) {
        ((NFTBridge) this.javaUserdata).showGasStationPage(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showSupplementList(LuaValue[] luaValueArr) {
        ((NFTBridge) this.javaUserdata).showSupplementList(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showRechargeDialog(LuaValue[] luaValueArr) {
        ((NFTBridge) this.javaUserdata).showRechargeDialog(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getEncryptSignFromWallet(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((NFTBridge) this.javaUserdata).getEncryptSignFromWallet((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString())));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] checkIsRunningInEmulator(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).checkIsRunningInEmulator();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getGuardReport(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((NFTBridge) this.javaUserdata).getGuardReport());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] base64Encoding(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).base64Encoding(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] base64Decoding(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).base64Decoding(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] walletRequestHeader(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).walletRequestHeader(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] goToMap(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).goToMap(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] addEventToCalendar(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).addEventToCalendar(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getFileDecodedInfo(LuaValue[] luaValueArr) {
        Boolean boolValueOf = null;
        String javaString = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && luaValueArr[1].isBoolean()) {
            boolValueOf = Boolean.valueOf(luaValueArr[1].toBoolean());
        }
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((NFTBridge) this.javaUserdata).getFileDecodedInfo(javaString, boolValueOf)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] simpleYYYYMMddHHmmWithTimeZone(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).simpleYYYYMMddHHmmWithTimeZone(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] simpleYYYYMMddWithTimeZone(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).simpleYYYYMMddWithTimeZone(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] simpleHHmmWithTimeZone(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).simpleHHmmWithTimeZone(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] simpleMMddHHmmWithTimeZone(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).simpleMMddHHmmWithTimeZone(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] checkRegisterStatus(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((NFTBridge) this.javaUserdata).checkRegisterStatus(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showChainRegisterDialog(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).showChainRegisterDialog(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] runStarkNetJS(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((NFTBridge) this.javaUserdata).runStarkNetJS(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] checkPasswordForStarknet(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).checkPasswordForStarknet(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isSupportApplication(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).isSupportApplication(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] openApplication(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).openApplication(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isShowUKBanner(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).isShowUKBanner(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] appUpdateEnable(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).appUpdateEnable(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] updateApp(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).updateApp(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] removeUpdateCallback(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).removeUpdateCallback(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] guestState(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).guestState(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] guestAddress(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).guestAddress(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getTimeZoneName(LuaValue[] luaValueArr) {
        return ((NFTBridge) this.javaUserdata).getTimeZoneName(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] clearNativeShareInstance(LuaValue[] luaValueArr) {
        ((NFTBridge) this.javaUserdata).clearNativeShareInstance();
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
