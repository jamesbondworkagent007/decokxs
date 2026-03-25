package com.okinc.wallet.mln.service;

import androidx.annotation.NonNull;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import o.C43248rlh;
import o.InterfaceC60044zuT;
import o.InterfaceC9731bbC;
import o.xWE;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes12.dex */
@InterfaceC60044zuT
public class UDCoinMeta extends LuaUserdata<InterfaceC9731bbC> {
    public static final String LUA_CLASS_NAME = "CoinMeta";
    public static final String[] methods = {"coinId", "name", "symbol", "decimalNum", "baseCoinId", "imageUrl", "chainId", "realChainId", "realEvmChainId", "generalChainId", "chainMeta", "chainName", WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "isCoin", "chainIconUrl", "isCustomNetwork", "displayPrecision", "isStableCoin"};
    public InterfaceC9731bbC meta;

    @InterfaceC60044zuT
    public UDCoinMeta(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public UDCoinMeta(@NonNull Globals globals, InterfaceC9731bbC interfaceC9731bbC) {
        super(globals, interfaceC9731bbC);
        this.meta = interfaceC9731bbC;
    }

    @InterfaceC60044zuT
    public LuaValue[] coinId(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rNumber(this.meta.AhwBna()));
    }

    @InterfaceC60044zuT
    public LuaValue[] name(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rString(this.meta.values()));
    }

    @InterfaceC60044zuT
    public LuaValue[] symbol(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rString(this.meta.fJNWhG()));
    }

    @InterfaceC60044zuT
    public LuaValue[] decimalNum(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rNumber(this.meta.valueOf()));
    }

    @InterfaceC60044zuT
    public LuaValue[] baseCoinId(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rNumber(this.meta.EZpvd()));
    }

    @InterfaceC60044zuT
    public LuaValue[] chainIconUrl(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rString(this.meta.AYXKKw()));
    }

    @InterfaceC60044zuT
    public LuaValue[] imageUrl(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rString(this.meta.DbNXlk()));
    }

    @InterfaceC60044zuT
    public LuaValue[] chainId(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rNumber(this.meta.AEQbTJ()));
    }

    @InterfaceC60044zuT
    public LuaValue[] realChainId(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rNumber(this.meta.fetchVPNInfo()));
    }

    @InterfaceC60044zuT
    public LuaValue[] realEvmChainId(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rNumber(this.meta.isConnected()));
    }

    @InterfaceC60044zuT
    public LuaValue[] generalChainId(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rNumber(this.meta.fetchVPNInfo()));
    }

    @InterfaceC60044zuT
    public LuaValue[] chainMeta(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(new UDCoinMeta(this.globals, this.meta.KWHzl()));
    }

    @InterfaceC60044zuT
    public LuaValue[] chainName(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rString(this.meta.KWHzl().djBIcL()));
    }

    @InterfaceC60044zuT
    public LuaValue[] address(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rString(this.meta.OLrzqt()));
    }

    @InterfaceC60044zuT
    public LuaValue[] isCoin(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rBoolean(this.meta.AuCTel()));
    }

    @InterfaceC60044zuT
    public LuaValue[] isCustomNetwork(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rBoolean(((xWE) C43248rlh.KWHzl.AEQbTJ(xWE.class)).KWHzl(this.meta.fetchVPNInfo(), true)));
    }

    @InterfaceC60044zuT
    public LuaValue[] displayPrecision(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rNumber(this.meta.AkhnZx()));
    }

    @InterfaceC60044zuT
    public LuaValue[] isStableCoin(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(LuaValue.rBoolean(this.meta.getNewProxyInstance()));
    }
}
