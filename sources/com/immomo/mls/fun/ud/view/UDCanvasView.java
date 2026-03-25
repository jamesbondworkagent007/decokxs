package com.immomo.mls.fun.ud.view;

import android.util.ArrayMap;
import android.view.View;
import com.immomo.mls.fun.ud.UDPaint;
import java.util.Iterator;
import o.C7530ala;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDCanvasView extends UDView {
    public static final String[] KWHzl = {"closeHardWare"};
    public final ArrayMap<String, Runnable> OLrzqt;

    @InterfaceC60044zuT
    public UDCanvasView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.OLrzqt = new ArrayMap<>();
    }

    @Override // org.luaj.vm2.LuaUserdata
    @InterfaceC60044zuT
    public void __onLuaGc() {
        super.__onLuaGc();
        View viewF_ = f_();
        if (viewF_ == null) {
            return;
        }
        Iterator<Runnable> it = this.OLrzqt.values().iterator();
        while (it.hasNext()) {
            viewF_.removeCallbacks(it.next());
        }
        this.OLrzqt.clear();
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    public View AEQbTJ(LuaValue[] luaValueArr) {
        return new C7530ala(AubY(), this);
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] refresh(LuaValue[] luaValueArr) {
        this.dHguZz.invalidate();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] closeHardWare(LuaValue[] luaValueArr) {
        UDPaint uDPaint = (luaValueArr.length <= 0 || !luaValueArr[0].isUserdata()) ? null : (UDPaint) luaValueArr[0].toUserdata();
        f_().setLayerType(1, (uDPaint == null || uDPaint.getJavaUserdata() == null) ? null : uDPaint.getJavaUserdata());
        if (uDPaint != null) {
            uDPaint.destroy();
        }
        return null;
    }
}
