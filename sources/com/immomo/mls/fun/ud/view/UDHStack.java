package com.immomo.mls.fun.ud.view;

import o.C7536alg;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDHStack<V extends C7536alg> extends UDBaseHVStack<V> {
    public static final String[] KWHzl = {"ellipsize"};

    @InterfaceC60044zuT
    public UDHStack(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        AhwBna(-1.0f);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public V AEQbTJ(LuaValue[] luaValueArr) {
        return (V) new C7536alg(AubY(), this);
    }

    @InterfaceC60044zuT
    public LuaValue[] ellipsize(LuaValue[] luaValueArr) {
        boolean z = false;
        if (luaValueArr.length > 0 && luaValueArr[0].toBoolean()) {
            z = true;
        }
        UDView uDView = (luaValueArr.length <= 1 || luaValueArr[1].isNil()) ? null : (UDView) luaValueArr[1].toUserdata();
        if (f_().AEQbTJ() != null) {
            f_().removeView(f_().AEQbTJ());
        }
        f_().EZpvd(z, uDView == null ? null : uDView.f_());
        if (f_().AEQbTJ() != null && f_().AhwBna()) {
            KWHzl(uDView, -1);
        }
        return null;
    }
}
