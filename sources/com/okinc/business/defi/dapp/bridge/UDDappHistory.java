package com.okinc.business.defi.dapp.bridge;

import com.okinc.dapp.bean.DappSearchResultBean;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC60044zuT
public class UDDappHistory extends LuaUserdata<DappSearchResultBean> {
    public static final String LUA_CLASS_NAME = "DappHistory";
    public static final String[] methods = {"name", "logo", "url", "id", "category", "shortDescribe"};
    public DappSearchResultBean resultBean;

    @InterfaceC60044zuT
    public UDDappHistory(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    public UDDappHistory(Globals globals, DappSearchResultBean dappSearchResultBean) {
        super(globals, dappSearchResultBean);
        this.resultBean = dappSearchResultBean;
    }

    @InterfaceC60044zuT
    public LuaValue[] name(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.resultBean.getName());
    }

    @InterfaceC60044zuT
    public LuaValue[] logo(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.resultBean.getLogo());
    }

    @InterfaceC60044zuT
    public LuaValue[] url(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.resultBean.getDeepLink());
    }

    @InterfaceC60044zuT
    public LuaValue[] id(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.resultBean.getId());
    }

    @InterfaceC60044zuT
    public LuaValue[] category(LuaValue[] luaValueArr) {
        return LuaValue.rString(String.valueOf(this.resultBean.getCategory()));
    }

    @InterfaceC60044zuT
    public LuaValue[] shortDescribe(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.resultBean.getShortDescribe());
    }
}
