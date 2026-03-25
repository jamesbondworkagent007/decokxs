package com.immomo.mls.fun.ud;

import android.graphics.Canvas;
import com.immomo.mls.annotation.LuaBridge;
import com.immomo.mls.annotation.LuaClass;
import o.C7865arr;
import o.InterfaceC8029auy;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes17.dex */
@LuaClass(abstractClass = true)
public abstract class UDBaseDrawable {
    public int AEQbTJ;
    public int AYXKKw;
    public LuaValue AhwBna;
    public int AkhnZx;
    public int EZpvd;
    public int KWHzl;
    public int OLrzqt;
    public InterfaceC8029auy copydefault;
    public int djBIcL;
    public int gEmmrt;
    public InterfaceC8029auy valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(int i, int i2) {
        this.OLrzqt = i;
        this.KWHzl = i2;
    }

    @LuaBridge
    public abstract void draw(Canvas canvas);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public final void setLayoutFunction(InterfaceC8029auy interfaceC8029auy) {
        this.copydefault = interfaceC8029auy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @LuaBridge
    public final void setRefreshFunction(InterfaceC8029auy interfaceC8029auy) {
        this.valueOf = interfaceC8029auy;
    }

    public void copydefault() {
        InterfaceC8029auy interfaceC8029auy = this.valueOf;
        if (interfaceC8029auy != null) {
            interfaceC8029auy.OLrzqt();
        }
        InterfaceC8029auy interfaceC8029auy2 = this.copydefault;
        if (interfaceC8029auy2 != null) {
            interfaceC8029auy2.OLrzqt();
        }
        LuaValue luaValue = this.AhwBna;
        if (luaValue != null) {
            luaValue.destroy();
        }
        this.valueOf = null;
        this.copydefault = null;
        this.AhwBna = null;
    }

    @LuaBridge
    public void onAddedToViewTree(LuaValue luaValue) {
        LuaValue luaValue2 = this.AhwBna;
        if (luaValue2 != null) {
            luaValue2.destroy();
        }
        this.AhwBna = luaValue;
    }

    @LuaBridge
    public void onRemovedFromViewTree() {
        LuaValue luaValue = this.AhwBna;
        if (luaValue != null) {
            luaValue.destroy();
        }
        this.AhwBna = null;
    }

    @LuaBridge
    public final LuaValue[] onMeasure(int i, double d, int i2, double d2) {
        AEQbTJ(i, d, i2, d2);
        return LuaValue.varargsOf(LuaNumber.copydefault(C7865arr.AEQbTJ(this.OLrzqt)), LuaNumber.copydefault(C7865arr.AEQbTJ(this.KWHzl)));
    }

    @LuaBridge
    public void onLayout(boolean z, double d, double d2, double d3, double d4) {
        this.AkhnZx = C7865arr.copydefault(d3 - d);
        this.AEQbTJ = C7865arr.copydefault(d4 - d2);
    }

    @LuaBridge
    public void onPadding(double d, double d2, double d3, double d4) {
        this.AYXKKw = C7865arr.copydefault(d);
        this.gEmmrt = C7865arr.copydefault(d2);
        this.djBIcL = C7865arr.copydefault(d3);
        this.EZpvd = C7865arr.copydefault(d4);
    }

    public void AEQbTJ(int i, double d, int i2, double d2) {
        int iMin;
        int iMin2;
        if (i == 2) {
            iMin = C7865arr.copydefault(d);
        } else {
            int i3 = this.AYXKKw + this.djBIcL;
            iMin = i == 1 ? Math.min(i3, C7865arr.copydefault(d)) : i3;
        }
        if (i2 == 2) {
            iMin2 = C7865arr.copydefault(d2);
        } else {
            iMin2 = this.gEmmrt + this.EZpvd;
            if (i2 == 1) {
                iMin2 = Math.min(iMin2, C7865arr.copydefault(d2));
            }
        }
        KWHzl(iMin, iMin2);
    }
}
