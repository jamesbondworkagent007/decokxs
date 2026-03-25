package com.immomo.mls.fun.ud.view;

import android.view.ViewGroup;
import com.immomo.mls.utils.AssertUtils;
import o.C7330ahm;
import o.C7833arL;
import o.InterfaceC60041zuQ;
import o.InterfaceC60044zuT;
import o.InterfaceC7384ain;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDBaseStack<V extends ViewGroup & InterfaceC7384ain> extends UDViewGroup<V> {
    public static final String[] OLrzqt = {"children"};

    @InterfaceC60044zuT
    public UDBaseStack(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public boolean e_() {
        return C7330ahm.AEQbTJ;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public boolean d_() {
        return C7330ahm.AEQbTJ;
    }

    @InterfaceC60044zuT
    public LuaValue[] children(LuaValue[] luaValueArr) {
        LuaTable luaTable;
        InterfaceC60041zuQ<LuaTable.Application> it;
        if (luaValueArr.length <= 0 || (it = (luaTable = luaValueArr[0].toLuaTable()).iterator()) == null) {
            return null;
        }
        while (it.hasNext()) {
            LuaValue luaValue = it.next().KWHzl;
            if (luaValue.isNil()) {
                C7833arL.valueOf("children table has nil value!", this.globals);
            } else if (AssertUtils.KWHzl(luaValue, UDView.class, "addView", getGlobals())) {
                KWHzl((UDView) luaValue, -1);
            }
        }
        it.AEQbTJ();
        luaTable.destroy();
        return null;
    }
}
