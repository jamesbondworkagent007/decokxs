package com.immomo.mls.fun.ud;

import android.graphics.Rect;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDSafeAreaRect extends LuaUserdata {
    public static final String LUA_CLASS_NAME = "SafeAreaAdapter";
    public static final String[] methods = {"insetsTop", "insetsBottom", "insetsLeft", "insetsRight"};
    public Rect safeArea;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Rect EZpvd() {
        return this.safeArea;
    }

    @InterfaceC60044zuT
    public UDSafeAreaRect(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.safeArea = new Rect();
    }

    @InterfaceC60044zuT
    public LuaValue[] insetsTop(LuaValue[] luaValueArr) {
        this.safeArea.top = luaValueArr.length > 0 ? luaValueArr[0].toInt() : 0;
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] insetsBottom(LuaValue[] luaValueArr) {
        this.safeArea.bottom = luaValueArr.length > 0 ? luaValueArr[0].toInt() : 0;
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] insetsLeft(LuaValue[] luaValueArr) {
        this.safeArea.left = luaValueArr.length > 0 ? luaValueArr[0].toInt() : 0;
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] insetsRight(LuaValue[] luaValueArr) {
        this.safeArea.right = luaValueArr.length > 0 ? luaValueArr[0].toInt() : 0;
        return null;
    }
}
