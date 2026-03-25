package com.okinc.wallet.mln.service;

import com.okinc.business.defi.api.bean.NftDetail;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes12.dex */
@InterfaceC60044zuT
public class UDWalletNFTItem extends LuaUserdata<NftDetail> {
    public static final String LUA_CLASS_NAME = "WalletNFTItem";
    public static final String[] methods = {"name", "id", "imageURL", "contract"};
    public NftDetail detail;

    @InterfaceC60044zuT
    public UDWalletNFTItem(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @InterfaceC60044zuT
    public LuaValue[] name(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.detail.getName());
    }

    @InterfaceC60044zuT
    public LuaValue[] id(LuaValue[] luaValueArr) {
        return LuaValue.rNumber(Double.parseDouble(this.detail.getId()));
    }

    @InterfaceC60044zuT
    public LuaValue[] imageURL(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.detail.getImageUrl());
    }

    @InterfaceC60044zuT
    public LuaValue[] contract(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.detail.getContract());
    }
}
