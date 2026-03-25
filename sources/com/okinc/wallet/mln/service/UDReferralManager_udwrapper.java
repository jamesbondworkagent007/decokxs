package com.okinc.wallet.mln.service;

import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes24.dex */
@InterfaceC60044zuT
public class UDReferralManager_udwrapper extends LuaUserdata {
    public static final String[] methods = {"isWalletSupportBindReferral", "isWalletSupportCreateReferral", "supportCreateReferralChainList", "supportCreateReferralWalletTypeList", "isCreateReferralNeedsBackup", "supportBindReferralChainList", "supportBindReferralWalletTypeList", "isBindReferralNeedsBackup", "getReferralInfo", "getReferralDeviceCodeInfo", "updateReferralDeviceCodeInfo", "removeReferralDeviceCodeInfo", "getPreferReferralCode", "getUnbindReferralCode", "saveReferralInfo", "unFreezeReferralInfo", "deleteReferralInfo", "disablePreferReferralCode", "checkSelfBind", "checkSelfBindWithAccountId", "updateUnbindCodeInfo", "getReferralCodeMessage", "verifySignature", "triggerRetryReportReferralInfo", "updateReferralShareCodeCache", "showDexRefAppliedRemindVC", "showDexRefAppliedRemindSecondVC"};

    public UDReferralManager_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public UDReferralManager_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new UDReferralManager(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public UDReferralManager getJavaUserdata() {
        return (UDReferralManager) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isWalletSupportBindReferral(LuaValue[] luaValueArr) {
        return ((UDReferralManager) this.javaUserdata).isWalletSupportBindReferral(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isWalletSupportCreateReferral(LuaValue[] luaValueArr) {
        return ((UDReferralManager) this.javaUserdata).isWalletSupportCreateReferral(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] supportCreateReferralChainList(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDReferralManager) this.javaUserdata).supportCreateReferralChainList(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] supportCreateReferralWalletTypeList(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDReferralManager) this.javaUserdata).supportCreateReferralWalletTypeList(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isCreateReferralNeedsBackup(LuaValue[] luaValueArr) {
        return ((UDReferralManager) this.javaUserdata).isCreateReferralNeedsBackup(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] supportBindReferralChainList(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDReferralManager) this.javaUserdata).supportBindReferralChainList(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] supportBindReferralWalletTypeList(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDReferralManager) this.javaUserdata).supportBindReferralWalletTypeList(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isBindReferralNeedsBackup(LuaValue[] luaValueArr) {
        return ((UDReferralManager) this.javaUserdata).isBindReferralNeedsBackup(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getReferralInfo(LuaValue[] luaValueArr) {
        return ((UDReferralManager) this.javaUserdata).getReferralInfo(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getReferralDeviceCodeInfo(LuaValue[] luaValueArr) {
        return ((UDReferralManager) this.javaUserdata).getReferralDeviceCodeInfo(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] updateReferralDeviceCodeInfo(LuaValue[] luaValueArr) {
        ((UDReferralManager) this.javaUserdata).updateReferralDeviceCodeInfo(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] removeReferralDeviceCodeInfo(LuaValue[] luaValueArr) {
        ((UDReferralManager) this.javaUserdata).removeReferralDeviceCodeInfo(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getPreferReferralCode(LuaValue[] luaValueArr) {
        return ((UDReferralManager) this.javaUserdata).getPreferReferralCode(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getUnbindReferralCode(LuaValue[] luaValueArr) {
        return ((UDReferralManager) this.javaUserdata).getUnbindReferralCode(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] saveReferralInfo(LuaValue[] luaValueArr) throws Throwable {
        ((UDReferralManager) this.javaUserdata).saveReferralInfo(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] unFreezeReferralInfo(LuaValue[] luaValueArr) {
        ((UDReferralManager) this.javaUserdata).unFreezeReferralInfo(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] deleteReferralInfo(LuaValue[] luaValueArr) {
        ((UDReferralManager) this.javaUserdata).deleteReferralInfo(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] disablePreferReferralCode(LuaValue[] luaValueArr) {
        ((UDReferralManager) this.javaUserdata).disablePreferReferralCode(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] checkSelfBind(LuaValue[] luaValueArr) throws Throwable {
        ((UDReferralManager) this.javaUserdata).checkSelfBind(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] checkSelfBindWithAccountId(LuaValue[] luaValueArr) throws Throwable {
        ((UDReferralManager) this.javaUserdata).checkSelfBindWithAccountId(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] updateUnbindCodeInfo(LuaValue[] luaValueArr) throws Throwable {
        ((UDReferralManager) this.javaUserdata).updateUnbindCodeInfo(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getReferralCodeMessage(LuaValue[] luaValueArr) {
        return ((UDReferralManager) this.javaUserdata).getReferralCodeMessage(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] verifySignature(LuaValue[] luaValueArr) {
        return ((UDReferralManager) this.javaUserdata).verifySignature(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] triggerRetryReportReferralInfo(LuaValue[] luaValueArr) {
        ((UDReferralManager) this.javaUserdata).triggerRetryReportReferralInfo(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] updateReferralShareCodeCache(LuaValue[] luaValueArr) {
        ((UDReferralManager) this.javaUserdata).updateReferralShareCodeCache(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showDexRefAppliedRemindVC(LuaValue[] luaValueArr) {
        ((UDReferralManager) this.javaUserdata).showDexRefAppliedRemindVC(luaValueArr);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showDexRefAppliedRemindSecondVC(LuaValue[] luaValueArr) {
        ((UDReferralManager) this.javaUserdata).showDexRefAppliedRemindSecondVC(luaValueArr);
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
