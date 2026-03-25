package com.immomo.mls.fun.ud.view.viewpager;

import com.immomo.mls.fun.ud.view.UDViewGroup;
import o.C7462akL;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDViewPagerCell<T extends C7462akL> extends UDViewGroup<T> {
    public LuaTable copydefault;

    public UDViewPagerCell(Globals globals) {
        super(globals);
        LuaTable luaTableAEQbTJ = LuaTable.AEQbTJ(globals);
        this.copydefault = luaTableAEQbTJ;
        luaTableAEQbTJ.set("contentView", this);
        ((C7462akL) this.dHguZz).setCell(this.copydefault);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public T AEQbTJ(LuaValue[] luaValueArr) {
        return (T) new C7462akL(AubY(), this, null);
    }

    @Override // org.luaj.vm2.LuaUserdata
    public String initLuaClassName(Globals globals) {
        return globals.EZpvd(UDViewGroup.class);
    }
}
