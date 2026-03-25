package com.okinc.wallet.mln.service;

import androidx.annotation.NonNull;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.immomo.mls.fun.ud.UDArray;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC60044zuT;
import o.InterfaceC9744bbP;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes12.dex */
@InterfaceC60044zuT
public class UDWalletNFTAsset extends LuaUserdata<InterfaceC9744bbP> {
    public static final String LUA_CLASS_NAME = "WalletNFTAsset";
    public static final String[] methods = {MTPushConstants.PlatformNode.KEY_PLATFORM, "network", "detail", "logo"};
    public InterfaceC9744bbP asset;

    @InterfaceC60044zuT
    public UDWalletNFTAsset(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public UDWalletNFTAsset(@NonNull Globals globals, InterfaceC9744bbP interfaceC9744bbP) {
        super(globals, interfaceC9744bbP);
        this.asset = interfaceC9744bbP;
    }

    @InterfaceC60044zuT
    public LuaValue[] platform(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.asset.AEQbTJ());
    }

    @InterfaceC60044zuT
    public LuaValue[] network(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.asset.copydefault());
    }

    @InterfaceC60044zuT
    public LuaValue[] detail(LuaValue[] luaValueArr) {
        return LuaValue.varargsOf(new UDArray(this.globals, (List) new ArrayList()));
    }

    @InterfaceC60044zuT
    public LuaValue[] logo(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.asset.OLrzqt());
    }
}
