package com.okinc.wallet.mln.service;

import androidx.annotation.NonNull;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.p2p.api.OtcExtraKeys;
import o.InterfaceC60044zuT;
import o.InterfaceC9742bbN;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes12.dex */
@InterfaceC60044zuT
public class UDWalletCoinAsset extends LuaUserdata<InterfaceC9742bbN> {
    public static final String LUA_CLASS_NAME = "WalletCoinAsset";
    public static final String[] methods = {"coinId", "chainId", "realChainId", "symbol", OtcExtraKeys.AMOUNT, "coinAmount", "displayAmount", "currencyAmount", "subTitle", "assetImageURL", WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "addressType", "addressTypeText"};
    public InterfaceC9742bbN asset;

    @InterfaceC60044zuT
    public UDWalletCoinAsset(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public UDWalletCoinAsset(@NonNull Globals globals, InterfaceC9742bbN interfaceC9742bbN) {
        super(globals, interfaceC9742bbN);
        this.asset = interfaceC9742bbN;
    }

    @InterfaceC60044zuT
    public LuaValue[] coinId(LuaValue[] luaValueArr) {
        if (this.asset == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(LuaValue.rNumber(r3.OLrzqt()));
    }

    @InterfaceC60044zuT
    public LuaValue[] chainId(LuaValue[] luaValueArr) {
        if (this.asset == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(LuaValue.rNumber(r3.AEQbTJ()));
    }

    @InterfaceC60044zuT
    public LuaValue[] realChainId(LuaValue[] luaValueArr) {
        if (this.asset == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(LuaValue.rNumber(r3.gEmmrt()));
    }

    @InterfaceC60044zuT
    public LuaValue[] symbol(LuaValue[] luaValueArr) {
        InterfaceC9742bbN interfaceC9742bbN = this.asset;
        if (interfaceC9742bbN == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(LuaValue.rString(interfaceC9742bbN.valueOf()));
    }

    @InterfaceC60044zuT
    public LuaValue[] amount(LuaValue[] luaValueArr) {
        InterfaceC9742bbN interfaceC9742bbN = this.asset;
        if (interfaceC9742bbN == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(LuaValue.rString(interfaceC9742bbN.copydefault()));
    }

    @InterfaceC60044zuT
    public LuaValue[] coinAmount(LuaValue[] luaValueArr) {
        InterfaceC9742bbN interfaceC9742bbN = this.asset;
        if (interfaceC9742bbN == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(LuaValue.rString(interfaceC9742bbN.copydefault()));
    }

    @InterfaceC60044zuT
    public LuaValue[] displayAmount(LuaValue[] luaValueArr) {
        InterfaceC9742bbN interfaceC9742bbN = this.asset;
        if (interfaceC9742bbN == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(LuaValue.rString(interfaceC9742bbN.AYXKKw()));
    }

    @InterfaceC60044zuT
    public LuaValue[] currencyAmount(LuaValue[] luaValueArr) {
        InterfaceC9742bbN interfaceC9742bbN = this.asset;
        if (interfaceC9742bbN == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(LuaValue.rString(interfaceC9742bbN.AhwBna()));
    }

    @InterfaceC60044zuT
    public LuaValue[] subTitle(LuaValue[] luaValueArr) {
        InterfaceC9742bbN interfaceC9742bbN = this.asset;
        if (interfaceC9742bbN == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(LuaValue.rString(interfaceC9742bbN.KWHzl().gEmmrt()));
    }

    @InterfaceC60044zuT
    public LuaValue[] assetImageURL(LuaValue[] luaValueArr) {
        InterfaceC9742bbN interfaceC9742bbN = this.asset;
        if (interfaceC9742bbN == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(LuaValue.rString(interfaceC9742bbN.KWHzl().DbNXlk()));
    }

    @InterfaceC60044zuT
    public LuaValue[] address(LuaValue[] luaValueArr) {
        InterfaceC9742bbN interfaceC9742bbN = this.asset;
        if (interfaceC9742bbN == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(LuaValue.rString(interfaceC9742bbN.EZpvd().getAddress()));
    }

    @InterfaceC60044zuT
    public LuaValue[] addressType(LuaValue[] luaValueArr) {
        if (this.asset == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(LuaValue.rNumber(r3.EZpvd().getAddressType()));
    }

    @InterfaceC60044zuT
    public LuaValue[] addressTypeText(LuaValue[] luaValueArr) {
        InterfaceC9742bbN interfaceC9742bbN = this.asset;
        if (interfaceC9742bbN == null) {
            return LuaValue.rNil();
        }
        return LuaValue.varargsOf(LuaValue.rString(interfaceC9742bbN.EZpvd().getAddressTypeText()));
    }
}
