package com.okinc.wallet.mln.service;

import o.C8017aul;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaString;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes24.dex */
@InterfaceC60044zuT
public class UDWalletCore_udwrapper extends LuaUserdata {
    public static final String[] methods = {"getWalletManager", "getCoinMetaManager", "ensureInitialized", "makeRpc", "encodeABILoader", "walletTxToastCheck", "encodeABI", "sendTransaction", "isValidAddress", "queryGasLimit", "getGasPrice", "getGasPriceWithChainId", "signMessage", "btcSignPsbt", "signEIP712Message", "solFindProgramAddress", "runSolanaJS", "runSolanaJSAsync", "runTrustMinJS", "changeCurrentWalletToMain", "checkDuplicateOrder", "ethEcRecover", "getAddressBookInfos", "getWalletAddressInfos", "getAllWalletsList", "convertCoinAmt", "openBrc20InscriptionTransferPage", "getAllMpcWalletStatus", "showWalletUpgradeVC", "userUniqueId", "loadWalletAvatar", "changeWSLoginAddress", "signAndSendCedefiBoostTransaction", "web3Mode", "property"};

    public UDWalletCore_udwrapper(Globals globals, Object obj) {
        super(globals, obj);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    public UDWalletCore_udwrapper(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.javaUserdata = newUserdata(luaValueArr);
    }

    public Object newUserdata(LuaValue[] luaValueArr) {
        return new UDWalletCore(this.globals, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: getJavaUserdata()Ljava/lang/Object; */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.luaj.vm2.LuaUserdata
    public UDWalletCore getJavaUserdata() {
        return (UDWalletCore) this.javaUserdata;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getWalletManager(LuaValue[] luaValueArr) {
        return ((UDWalletCore) this.javaUserdata).getWalletManager();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getCoinMetaManager(LuaValue[] luaValueArr) {
        return ((UDWalletCore) this.javaUserdata).getCoinMetaManager();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] ensureInitialized(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCore) this.javaUserdata).ensureInitialized(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] makeRpc(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCore) this.javaUserdata).makeRpc(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] encodeABILoader(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCore) this.javaUserdata).encodeABILoader(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] walletTxToastCheck(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCore) this.javaUserdata).walletTxToastCheck(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] encodeABI(LuaValue[] luaValueArr) {
        return ((UDWalletCore) this.javaUserdata).encodeABI(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] sendTransaction(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCore) this.javaUserdata).sendTransaction(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] isValidAddress(LuaValue[] luaValueArr) {
        LuaValue[] luaValueArr2 = new LuaValue[1];
        luaValueArr2[0] = ((UDWalletCore) this.javaUserdata).isValidAddress(luaValueArr) ? LuaValue.True() : LuaValue.False();
        return LuaValue.varargsOf(luaValueArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] queryGasLimit(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCore) this.javaUserdata).queryGasLimit(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getGasPrice(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCore) this.javaUserdata).getGasPrice(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getGasPriceWithChainId(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCore) this.javaUserdata).getGasPriceWithChainId(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] signMessage(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCore) this.javaUserdata).signMessage(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] btcSignPsbt(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCore) this.javaUserdata).btcSignPsbt(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] signEIP712Message(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCore) this.javaUserdata).signEIP712Message(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] solFindProgramAddress(LuaValue[] luaValueArr) {
        String javaString = null;
        String javaString2 = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        String javaString3 = (luaValueArr.length <= 1 || !luaValueArr[1].isString()) ? null : luaValueArr[1].toJavaString();
        if (luaValueArr.length > 2 && luaValueArr[2].isString()) {
            javaString = luaValueArr[2].toJavaString();
        }
        return LuaValue.varargsOf(LuaString.copydefault(((UDWalletCore) this.javaUserdata).solFindProgramAddress(javaString2, javaString3, javaString)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] runSolanaJS(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCore) this.javaUserdata).runSolanaJS(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] runSolanaJSAsync(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCore) this.javaUserdata).runSolanaJSAsync(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] runTrustMinJS(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCore) this.javaUserdata).runTrustMinJS(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] changeCurrentWalletToMain(LuaValue[] luaValueArr) {
        return ((UDWalletCore) this.javaUserdata).changeCurrentWalletToMain(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] checkDuplicateOrder(LuaValue[] luaValueArr) {
        String javaString = null;
        String javaString2 = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        if (luaValueArr.length > 1 && luaValueArr[1].isString()) {
            javaString = luaValueArr[1].toJavaString();
        }
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCore) this.javaUserdata).checkDuplicateOrder(javaString2, javaString)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] ethEcRecover(LuaValue[] luaValueArr) {
        Boolean boolValueOf = null;
        String javaString = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        String javaString2 = (luaValueArr.length <= 1 || !luaValueArr[1].isString()) ? null : luaValueArr[1].toJavaString();
        if (luaValueArr.length > 2 && luaValueArr[2].isBoolean()) {
            boolValueOf = Boolean.valueOf(luaValueArr[2].toBoolean());
        }
        return LuaValue.varargsOf(LuaString.copydefault(((UDWalletCore) this.javaUserdata).ethEcRecover(javaString, javaString2, boolValueOf)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getAddressBookInfos(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCore) this.javaUserdata).getAddressBookInfos((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString(), luaValueArr[1].toInt())));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getWalletAddressInfos(LuaValue[] luaValueArr) {
        String javaString = null;
        String javaString2 = (luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString();
        int i = luaValueArr[1].toInt();
        if (luaValueArr.length > 2 && luaValueArr[2].isString()) {
            javaString = luaValueArr[2].toJavaString();
        }
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCore) this.javaUserdata).getWalletAddressInfos(javaString2, i, javaString)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getAllWalletsList(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDWalletCore) this.javaUserdata).getAllWalletsList(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] convertCoinAmt(LuaValue[] luaValueArr) {
        return ((UDWalletCore) this.javaUserdata).convertCoinAmt(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] openBrc20InscriptionTransferPage(LuaValue[] luaValueArr) {
        return ((UDWalletCore) this.javaUserdata).openBrc20InscriptionTransferPage(luaValueArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] getAllMpcWalletStatus(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCore) this.javaUserdata).getAllMpcWalletStatus()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] showWalletUpgradeVC(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDWalletCore) this.javaUserdata).showWalletUpgradeVC(luaValueArr[0].toInt(), (luaValueArr.length <= 1 || !luaValueArr[1].isString()) ? null : luaValueArr[1].toJavaString(), (LuaFunction) (luaValueArr.length > 2 ? luaValueArr[2] : null)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] userUniqueId(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDWalletCore) this.javaUserdata).userUniqueId());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] loadWalletAvatar(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDWalletCore) this.javaUserdata).loadWalletAvatar(luaValueArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] changeWSLoginAddress(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDWalletCore) this.javaUserdata).changeWSLoginAddress((luaValueArr.length <= 0 || !luaValueArr[0].isString()) ? null : luaValueArr[0].toJavaString()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] signAndSendCedefiBoostTransaction(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(C8017aul.copydefault(this.globals, ((UDWalletCore) this.javaUserdata).signAndSendCedefiBoostTransaction(luaValueArr)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] web3Mode(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(((UDWalletCore) this.javaUserdata).web3Mode());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] property(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.varargsOf(LuaNumber.valueOf(((UDWalletCore) this.javaUserdata).property));
        }
        ((UDWalletCore) this.javaUserdata).property = luaValueArr[0].toInt();
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
