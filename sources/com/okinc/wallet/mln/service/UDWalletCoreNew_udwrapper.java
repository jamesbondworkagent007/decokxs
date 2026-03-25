package com.okinc.wallet.mln.service;

import o.C8017aul;
import o.InterfaceC60044zuT;
import o.InterfaceC7835arN;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes24.dex */
@InterfaceC60044zuT
public class UDWalletCoreNew_udwrapper extends LuaUserdata {
    public static final String[] methods = {"openFeeInfoPage", "openSelectCoinFeePage", "getBalance", "checkFee", "checkAmt", "getChainMeta", "subFeeInfo", "submit", "initInteractionService", "initWalletDappSignBizService", "riskAddressCheck", "submitSign", "getAllBTCAddressInfosWithWalletId", "getAllBTCAddressInfosWithWalletIdAndProtocolId", "getCurrentBTCAddressInfo", "updateBTCNFTChargeAddress", "addCustomCoin", "isNewEntryPoint"};

    public UDWalletCoreNew_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public UDWalletCoreNew_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new UDWalletCoreNew(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public UDWalletCoreNew getJavaUserdata() {
        return (UDWalletCoreNew) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] openFeeInfoPage(LuaValue[] luaValueArr) {
        return ((UDWalletCoreNew) this.javaUserdata).openFeeInfoPage(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] openSelectCoinFeePage(LuaValue[] luaValueArr) {
        return ((UDWalletCoreNew) this.javaUserdata).openSelectCoinFeePage(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getBalance(LuaValue[] luaValueArr) {
        return ((UDWalletCoreNew) this.javaUserdata).getBalance(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] checkFee(LuaValue[] luaValueArr) {
        return ((UDWalletCoreNew) this.javaUserdata).checkFee(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] checkAmt(LuaValue[] luaValueArr) {
        return ((UDWalletCoreNew) this.javaUserdata).checkAmt(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getChainMeta(LuaValue[] luaValueArr) {
        return ((UDWalletCoreNew) this.javaUserdata).getChainMeta(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] subFeeInfo(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCoreNew) this.javaUserdata).subFeeInfo(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] submit(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCoreNew) this.javaUserdata).submit(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] initInteractionService(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCoreNew) this.javaUserdata).initInteractionService(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] initWalletDappSignBizService(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCoreNew) this.javaUserdata).initWalletDappSignBizService(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] riskAddressCheck(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCoreNew) this.javaUserdata).riskAddressCheck(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] submitSign(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCoreNew) this.javaUserdata).submitSign(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getAllBTCAddressInfosWithWalletId(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCoreNew) this.javaUserdata).getAllBTCAddressInfosWithWalletId(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getAllBTCAddressInfosWithWalletIdAndProtocolId(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCoreNew) this.javaUserdata).getAllBTCAddressInfosWithWalletIdAndProtocolId(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getCurrentBTCAddressInfo(LuaValue[] luaValueArr) {
        return ((UDWalletCoreNew) this.javaUserdata).getCurrentBTCAddressInfo();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] updateBTCNFTChargeAddress(LuaValue[] luaValueArr) {
        return ((UDWalletCoreNew) this.javaUserdata).updateBTCNFTChargeAddress(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] addCustomCoin(LuaValue[] luaValueArr) {
        ((UDWalletCoreNew) this.javaUserdata).addCustomCoin((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), luaValueArr[1].toInt(), (luaValueArr.length <= 2 || !luaValueArr[2].isString()) ? null : luaValueArr[2].toJavaString(), (luaValueArr.length <= 3 || !luaValueArr[3].isString()) ? null : luaValueArr[3].toJavaString(), (luaValueArr.length <= 4 || !luaValueArr[4].isString()) ? null : luaValueArr[4].toJavaString(), luaValueArr[5].toInt(), (luaValueArr.length <= 6 || luaValueArr[6].isNil()) ? null : (InterfaceC7835arN) C8017aul.AEQbTJ(luaValueArr[6], InterfaceC7835arN.class));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isNewEntryPoint(LuaValue[] luaValueArr) {
        return ((UDWalletCoreNew) this.javaUserdata).isNewEntryPoint(luaValueArr);
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
