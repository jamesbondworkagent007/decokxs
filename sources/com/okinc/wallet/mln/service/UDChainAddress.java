package com.okinc.wallet.mln.service;

import androidx.annotation.NonNull;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import o.InterfaceC60044zuT;
import o.InterfaceC9780bbz;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes12.dex */
@InterfaceC60044zuT
public class UDChainAddress extends LuaUserdata<InterfaceC9780bbz> {
    public static final String LUA_CLASS_NAME = "ChainAddress";
    public static final String[] methods = {WalletSearchRequest.SEARCH_SOURCE_ADDRESS, "chainId", "addressType", "addressTypeText", "eoaAddress", "publicKey"};
    public InterfaceC9780bbz mChainAddress;

    @InterfaceC60044zuT
    public UDChainAddress(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public UDChainAddress(@NonNull Globals globals, InterfaceC9780bbz interfaceC9780bbz) {
        super(globals, interfaceC9780bbz);
        this.mChainAddress = interfaceC9780bbz;
    }

    @InterfaceC60044zuT
    public LuaValue[] address(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.mChainAddress.getAddress());
    }

    @InterfaceC60044zuT
    public LuaValue[] addressType(LuaValue[] luaValueArr) {
        return LuaValue.rNumber(this.mChainAddress.getAddressType());
    }

    @InterfaceC60044zuT
    public LuaValue[] chainId(LuaValue[] luaValueArr) {
        return LuaValue.rNumber(this.mChainAddress.getChainId());
    }

    @InterfaceC60044zuT
    public LuaValue[] addressTypeText(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.mChainAddress.getAddressTypeText());
    }

    @InterfaceC60044zuT
    public LuaValue[] eoaAddress(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.mChainAddress.getEoaAddress());
    }

    @InterfaceC60044zuT
    public LuaValue[] publicKey(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.mChainAddress.getPublicKey());
    }
}
