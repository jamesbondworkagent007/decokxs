package com.okinc.referral.mlnservice.bean;

import com.okinc.referral.biz.net.bean.AddressItem;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes11.dex */
@InterfaceC60044zuT
public class UDAddressItem extends LuaUserdata {
    public static final String LUA_CLASS_NAME = "addressItem";
    public static final String[] methods = {"name", "num", "state", "identifier", "path"};
    public final AddressItem mAddressItem;

    public UDAddressItem(Globals globals, Object obj) {
        super(globals, obj);
        this.mAddressItem = (AddressItem) obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.okinc.referral.biz.net.bean.AddressItem] */
    @InterfaceC60044zuT
    public UDAddressItem(long j, LuaValue[] luaValueArr) {
        super(j, (LuaValue[]) null);
        ?? addressItem = new AddressItem();
        this.mAddressItem = addressItem;
        this.javaUserdata = addressItem;
    }

    @InterfaceC60044zuT
    public LuaValue[] identifier(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.mAddressItem.getIdentifier());
    }

    @InterfaceC60044zuT
    public LuaValue[] name(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.mAddressItem.getName());
    }

    @InterfaceC60044zuT
    public LuaValue[] num(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.mAddressItem.getNum());
    }

    @InterfaceC60044zuT
    public LuaValue[] path(LuaValue[] luaValueArr) {
        return LuaValue.rString(this.mAddressItem.getPath());
    }

    @InterfaceC60044zuT
    public LuaValue[] state(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1 && luaValueArr[0].isInt()) {
            this.mAddressItem.setState(luaValueArr[0].toInt());
        }
        return LuaValue.rNumber(this.mAddressItem.getState());
    }
}
