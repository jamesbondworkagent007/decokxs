package com.okinc.wallet.mln.service;

import com.immomo.mls.fun.ud.UDArray;
import com.immomo.mls.fun.ud.UDColor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C7858ark;
import o.InterfaceC60044zuT;
import o.InterfaceC9735bbG;
import o.InterfaceC9738bbJ;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes12.dex */
@InterfaceC60044zuT
public class UDRootWallet extends LuaUserdata<InterfaceC9735bbG> {
    public static final String LUA_CLASS_NAME = "RootWallet";
    public static final String[] methods = {"isBackup", "walletId", "getName", "wallets", "getColor"};
    public InterfaceC9735bbG rootWallet;

    public UDRootWallet(Globals globals, InterfaceC9735bbG interfaceC9735bbG) {
        super(globals, interfaceC9735bbG);
        this.rootWallet = interfaceC9735bbG;
    }

    public UDRootWallet(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @InterfaceC60044zuT
    public LuaValue[] isBackup(LuaValue[] luaValueArr) {
        return LuaValue.rBoolean(this.rootWallet.AEQbTJ());
    }

    @InterfaceC60044zuT
    public LuaValue[] walletId(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.rootWallet.EZpvd());
    }

    @InterfaceC60044zuT
    public LuaValue[] wallets(LuaValue[] luaValueArr) {
        List<InterfaceC9738bbJ> listKWHzl = this.rootWallet.KWHzl();
        ArrayList arrayList = new ArrayList();
        if (listKWHzl.isEmpty()) {
            return LuaValue.varargsOf(new UDArray(this.globals, (List) arrayList));
        }
        Iterator<InterfaceC9738bbJ> it = listKWHzl.iterator();
        while (it.hasNext()) {
            arrayList.add(new UDWallet(getGlobals(), it.next()));
        }
        return LuaValue.varargsOf(new UDArray(this.globals, (List) arrayList));
    }

    @InterfaceC60044zuT
    public LuaValue[] getName(LuaValue[] luaValueArr) {
        return LuaValue.rString((String) this.rootWallet.AEQbTJ(true));
    }

    @InterfaceC60044zuT
    public LuaValue[] getColor(LuaValue[] luaValueArr) {
        UDColor uDColor = new UDColor(getGlobals(), 0);
        uDColor.copydefault(C7858ark.copydefault(this.rootWallet.OLrzqt()));
        return LuaValue.varargsOf(uDColor);
    }
}
