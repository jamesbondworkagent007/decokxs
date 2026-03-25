package com.immomo.mls.fun.ui.webview;

import androidx.annotation.NonNull;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.immomo.mls.fun.ui.webview.LuaWebContentView;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDWebContentView<U extends LuaWebContentView> extends UDViewGroup<U> {
    public static final String[] copydefault = {"url"};
    public LuaWebContentView OLrzqt;

    @InterfaceC60044zuT
    public UDWebContentView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @InterfaceC60044zuT
    public UDWebContentView(Globals globals, U u) {
        super(globals, u);
    }

    @InterfaceC60044zuT
    public UDWebContentView(Globals globals) {
        super(globals);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public U AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        U u = (U) new LuaWebContentView(AubY(), this);
        this.OLrzqt = u;
        return u;
    }

    @InterfaceC60044zuT
    public LuaValue[] url(LuaValue[] luaValueArr) {
        this.OLrzqt.url(luaValueArr[0].toJavaString());
        return null;
    }
}
