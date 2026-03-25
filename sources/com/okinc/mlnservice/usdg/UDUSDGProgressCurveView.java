package com.okinc.mlnservice.usdg;

import androidx.annotation.NonNull;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.view.UDView;
import o.C43171rkJ;
import o.C7910asj;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaBoolean;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC60044zuT
public class UDUSDGProgressCurveView<T extends C43171rkJ> extends UDView<T> {
    public static final String[] AEQbTJ = {"setLineWidth", "setDotRadius", "setBaseLineColor", "setBaseLineGradient", "setProgressLineColor", "setProgressLineGradient", "setDotInactiveColor", "setDotInActiveGradient", "setDotActiveColor", "setDotActiveGradient", "setCurve", "setReverse", "setDotCount", "setDotFractions", "setEnableDotBounceOnPass", "setDotBounceParams", "setProgress", "setDotsProgress", "setDotBounceBezier", "resetDotBounceStates", "animateLine", "animateDots"};

    @InterfaceC60044zuT
    public UDUSDGProgressCurveView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @InterfaceC60044zuT
    public UDUSDGProgressCurveView(Globals globals, T t) {
        super(globals, t);
    }

    @InterfaceC60044zuT
    public UDUSDGProgressCurveView(Globals globals) {
        super(globals);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public T AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        return (T) new C43171rkJ(AubY(), this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLineWidth(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof LuaNumber)) {
            return null;
        }
        f_().setLineWidth(luaValue.toFloat());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setDotRadius(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof LuaNumber)) {
            return null;
        }
        f_().setDotRadius(luaValue.toFloat());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setBaseLineColor(LuaValue[] luaValueArr) {
        int color;
        int color2 = 0;
        if (luaValueArr.length == 1) {
            LuaValue luaValue = luaValueArr[0];
            if (luaValue instanceof UDColor) {
                UDColor uDColor = (UDColor) luaValue;
                f_().setBaseLineColor(uDColor.AEQbTJ().getColor(this.globals));
                uDColor.destroy();
            }
        }
        if (luaValueArr.length <= 1) {
            return null;
        }
        LuaValue luaValue2 = luaValueArr[0];
        if (luaValue2 instanceof UDColor) {
            UDColor uDColor2 = (UDColor) luaValue2;
            color = uDColor2.AEQbTJ().getColor(this.globals);
            uDColor2.destroy();
        } else {
            color = 0;
        }
        LuaValue luaValue3 = luaValueArr[1];
        if (luaValue3 instanceof UDColor) {
            UDColor uDColor3 = (UDColor) luaValue3;
            color2 = uDColor3.AEQbTJ().getColor(this.globals);
            uDColor3.destroy();
        }
        f_().setBaseLineGradient(color, color2);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setBaseLineGradient(LuaValue[] luaValueArr) {
        int color;
        if (luaValueArr.length <= 1) {
            return null;
        }
        int color2 = 0;
        LuaValue luaValue = luaValueArr[0];
        if (luaValue instanceof UDColor) {
            UDColor uDColor = (UDColor) luaValue;
            color = uDColor.AEQbTJ().getColor(this.globals);
            uDColor.destroy();
        } else {
            color = 0;
        }
        LuaValue luaValue2 = luaValueArr[1];
        if (luaValue2 instanceof UDColor) {
            UDColor uDColor2 = (UDColor) luaValue2;
            color2 = uDColor2.AEQbTJ().getColor(this.globals);
            uDColor2.destroy();
        }
        f_().setBaseLineGradient(color, color2);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setProgressLineColor(LuaValue[] luaValueArr) {
        int color;
        int color2 = 0;
        if (luaValueArr.length == 1) {
            LuaValue luaValue = luaValueArr[0];
            if (luaValue instanceof UDColor) {
                UDColor uDColor = (UDColor) luaValue;
                f_().setProgressLineColor(uDColor.AEQbTJ().getColor(this.globals));
                uDColor.destroy();
            }
        }
        if (luaValueArr.length <= 1) {
            return null;
        }
        LuaValue luaValue2 = luaValueArr[0];
        if (luaValue2 instanceof UDColor) {
            UDColor uDColor2 = (UDColor) luaValue2;
            color = uDColor2.AEQbTJ().getColor(this.globals);
            uDColor2.destroy();
        } else {
            color = 0;
        }
        LuaValue luaValue3 = luaValueArr[1];
        if (luaValue3 instanceof UDColor) {
            UDColor uDColor3 = (UDColor) luaValue3;
            color2 = uDColor3.AEQbTJ().getColor(this.globals);
            uDColor3.destroy();
        }
        f_().setProgressLineGradient(color, color2);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setProgressLineGradient(LuaValue[] luaValueArr) {
        int color;
        if (luaValueArr.length <= 1) {
            return null;
        }
        int color2 = 0;
        LuaValue luaValue = luaValueArr[0];
        if (luaValue instanceof UDColor) {
            UDColor uDColor = (UDColor) luaValue;
            color = uDColor.AEQbTJ().getColor(this.globals);
            uDColor.destroy();
        } else {
            color = 0;
        }
        LuaValue luaValue2 = luaValueArr[1];
        if (luaValue2 instanceof UDColor) {
            UDColor uDColor2 = (UDColor) luaValue2;
            color2 = uDColor2.AEQbTJ().getColor(this.globals);
            uDColor2.destroy();
        }
        f_().setProgressLineGradient(color, color2);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setDotInactiveColor(LuaValue[] luaValueArr) {
        int color;
        int color2 = 0;
        if (luaValueArr.length == 1) {
            LuaValue luaValue = luaValueArr[0];
            if (luaValue instanceof UDColor) {
                UDColor uDColor = (UDColor) luaValue;
                f_().setDotInactiveColor(uDColor.AEQbTJ().getColor(this.globals));
                uDColor.destroy();
            }
        }
        if (luaValueArr.length <= 1) {
            return null;
        }
        LuaValue luaValue2 = luaValueArr[0];
        if (luaValue2 instanceof UDColor) {
            UDColor uDColor2 = (UDColor) luaValue2;
            color = uDColor2.AEQbTJ().getColor(this.globals);
            uDColor2.destroy();
        } else {
            color = 0;
        }
        LuaValue luaValue3 = luaValueArr[1];
        if (luaValue3 instanceof UDColor) {
            UDColor uDColor3 = (UDColor) luaValue3;
            color2 = uDColor3.AEQbTJ().getColor(this.globals);
            uDColor3.destroy();
        }
        f_().setDotInActiveGradient(color, color2);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setDotInActiveGradient(LuaValue[] luaValueArr) {
        int color;
        if (luaValueArr.length <= 1) {
            return null;
        }
        int color2 = 0;
        LuaValue luaValue = luaValueArr[0];
        if (luaValue instanceof UDColor) {
            UDColor uDColor = (UDColor) luaValue;
            color = uDColor.AEQbTJ().getColor(this.globals);
            uDColor.destroy();
        } else {
            color = 0;
        }
        LuaValue luaValue2 = luaValueArr[1];
        if (luaValue2 instanceof UDColor) {
            UDColor uDColor2 = (UDColor) luaValue2;
            color2 = uDColor2.AEQbTJ().getColor(this.globals);
            uDColor2.destroy();
        }
        f_().setDotInActiveGradient(color, color2);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setDotActiveColor(LuaValue[] luaValueArr) {
        int color;
        int color2 = 0;
        if (luaValueArr.length == 1) {
            LuaValue luaValue = luaValueArr[0];
            if (luaValue instanceof UDColor) {
                UDColor uDColor = (UDColor) luaValue;
                f_().setDotActiveColor(uDColor.AEQbTJ().getColor(this.globals));
                uDColor.destroy();
            }
        }
        if (luaValueArr.length <= 1) {
            return null;
        }
        LuaValue luaValue2 = luaValueArr[0];
        if (luaValue2 instanceof UDColor) {
            UDColor uDColor2 = (UDColor) luaValue2;
            color = uDColor2.AEQbTJ().getColor(this.globals);
            uDColor2.destroy();
        } else {
            color = 0;
        }
        LuaValue luaValue3 = luaValueArr[1];
        if (luaValue3 instanceof UDColor) {
            UDColor uDColor3 = (UDColor) luaValue3;
            color2 = uDColor3.AEQbTJ().getColor(this.globals);
            uDColor3.destroy();
        }
        f_().setDotActiveGradient(color, color2);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setDotActiveGradient(LuaValue[] luaValueArr) {
        int color;
        if (luaValueArr.length <= 1) {
            return null;
        }
        int color2 = 0;
        LuaValue luaValue = luaValueArr[0];
        if (luaValue instanceof UDColor) {
            UDColor uDColor = (UDColor) luaValue;
            color = uDColor.AEQbTJ().getColor(this.globals);
            uDColor.destroy();
        } else {
            color = 0;
        }
        LuaValue luaValue2 = luaValueArr[1];
        if (luaValue2 instanceof UDColor) {
            UDColor uDColor2 = (UDColor) luaValue2;
            color2 = uDColor2.AEQbTJ().getColor(this.globals);
            uDColor2.destroy();
        }
        f_().setDotActiveGradient(color, color2);
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setCurve(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof LuaNumber)) {
            return null;
        }
        f_().setCurve(luaValue.toFloat());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setReverse(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof LuaBoolean)) {
            return null;
        }
        f_().setReverse(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setDotCount(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof LuaNumber)) {
            return null;
        }
        f_().setDotCount(luaValue.toInt());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setDotFractions(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof LuaTable)) {
            return null;
        }
        f_().setDotFractions(C7910asj.OLrzqt((LuaTable) luaValue));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setEnableDotBounceOnPass(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof LuaBoolean)) {
            return null;
        }
        f_().setEnableDotBounceOnPass(luaValue.toBoolean());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setDotBounceParams(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 1) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof LuaNumber) || !(luaValueArr[1] instanceof LuaNumber)) {
            return null;
        }
        f_().setDotBounceParams(luaValue.toFloat(), luaValueArr[1].toLong());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setProgress(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof LuaNumber)) {
            return null;
        }
        f_().setLineProgress(luaValue.toFloat());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setDotsProgress(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof LuaNumber)) {
            return null;
        }
        f_().setDotsProgress(luaValue.toFloat());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] animateLine(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 1) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof LuaNumber) || !(luaValueArr[1] instanceof LuaNumber)) {
            return null;
        }
        f_().EZpvd(luaValue.toFloat(), luaValueArr[1].toLong());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] animateDots(LuaValue[] luaValueArr) {
        if (luaValueArr.length <= 1) {
            return null;
        }
        LuaValue luaValue = luaValueArr[0];
        if (!(luaValue instanceof LuaNumber) || !(luaValueArr[1] instanceof LuaNumber)) {
            return null;
        }
        f_().KWHzl(luaValue.toFloat(), luaValueArr[1].toLong());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setDotBounceBezier(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 4) {
            return null;
        }
        f_().setDotBounceBezier(luaValueArr[0].toFloat(), luaValueArr[1].toFloat(), luaValueArr[2].toFloat(), luaValueArr[3].toFloat());
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] resetDotBounceStates(LuaValue[] luaValueArr) {
        f_().EZpvd();
        return null;
    }
}
