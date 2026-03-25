package com.okinc.referral.mlnservice.instance;

import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes24.dex */
@InterfaceC60044zuT
public class OKMLNReferralAddress_udwrapper extends LuaUserdata {
    public static final String[] methods = {"getAddressListData", "getAddressListDataByTable", "checkAddressState", "requestAddressPermission", "jumpAddressSetting", "searchAddressWithText", "searchAddressWithTextByTable", "fuzzySearchAddressWithTextByTable", "jumpSendMessagePage", "jumpSendEmailPage"};

    public OKMLNReferralAddress_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public OKMLNReferralAddress_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new OKMLNReferralAddress(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public OKMLNReferralAddress getJavaUserdata() {
        return (OKMLNReferralAddress) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getAddressListData(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKMLNReferralAddress) this.javaUserdata).getAddressListData(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getAddressListDataByTable(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKMLNReferralAddress) this.javaUserdata).getAddressListDataByTable(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] checkAddressState(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKMLNReferralAddress) this.javaUserdata).checkAddressState(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] requestAddressPermission(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKMLNReferralAddress) this.javaUserdata).requestAddressPermission(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] jumpAddressSetting(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKMLNReferralAddress) this.javaUserdata).jumpAddressSetting());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] searchAddressWithText(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKMLNReferralAddress) this.javaUserdata).searchAddressWithText(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] searchAddressWithTextByTable(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKMLNReferralAddress) this.javaUserdata).searchAddressWithTextByTable(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] fuzzySearchAddressWithTextByTable(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKMLNReferralAddress) this.javaUserdata).fuzzySearchAddressWithTextByTable(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] jumpSendMessagePage(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKMLNReferralAddress) this.javaUserdata).jumpSendMessagePage(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] jumpSendEmailPage(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((OKMLNReferralAddress) this.javaUserdata).jumpSendEmailPage(luaValueArr));
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
            ((OKMLNReferralAddress) t).OLrzqt();
            this.javaUserdata = null;
        }
        super.__onLuaGc();
    }
}
