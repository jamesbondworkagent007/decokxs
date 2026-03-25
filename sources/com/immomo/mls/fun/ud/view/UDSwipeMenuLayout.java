package com.immomo.mls.fun.ud.view;

import androidx.annotation.NonNull;
import o.C55109xdj;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDSwipeMenuLayout<U extends C55109xdj> extends UDViewGroup<U> {
    public static final String[] copydefault = {"expandMenuAnim", "closeMenuAnim", "quickCloseMenu", "quickExpandMenu", "setEnableSwipe", "setEnableLeftMenu", "setClickMenuAndClose"};
    public C55109xdj EZpvd;

    @InterfaceC60044zuT
    public UDSwipeMenuLayout(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @InterfaceC60044zuT
    public UDSwipeMenuLayout(Globals globals, U u) {
        super(globals, u);
    }

    @InterfaceC60044zuT
    public UDSwipeMenuLayout(Globals globals) {
        super(globals);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public U AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        U u = (U) new C55109xdj(AubY());
        this.EZpvd = u;
        return u;
    }

    @InterfaceC60044zuT
    public LuaValue[] expandMenuAnim(LuaValue[] luaValueArr) {
        this.EZpvd.copydefault();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] closeMenuAnim(LuaValue[] luaValueArr) {
        this.EZpvd.OLrzqt();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] quickCloseMenu(LuaValue[] luaValueArr) {
        this.EZpvd.AYXKKw();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] quickExpandMenu(LuaValue[] luaValueArr) {
        this.EZpvd.djBIcL();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setEnableSwipe(LuaValue[] luaValueArr) {
        this.EZpvd.AEQbTJ(luaValueArr[0].toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setEnableLeftMenu(LuaValue[] luaValueArr) {
        this.EZpvd.KWHzl(luaValueArr[0].toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setClickMenuAndClose(LuaValue[] luaValueArr) {
        this.EZpvd.copydefault(luaValueArr[0].toBoolean());
        return null;
    }
}
