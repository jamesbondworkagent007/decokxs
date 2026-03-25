package com.immomo.mls.fun.ud.view;

import androidx.annotation.NonNull;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.view.LuaSinglePieChartView;
import com.immomo.mls.fun.ui.custom.JColor;
import o.C7829arH;
import o.InterfaceC60044zuT;
import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class UDSinglePieChartView<T extends LuaSinglePieChartView> extends UDView<T> {
    public static final String[] copydefault = {"setPieChartColors", "setCircleConfig", "setContentConfig", "setData", "removeTouchMode", "pieChartClickCallback"};
    public LuaSinglePieChartView EZpvd;

    @InterfaceC60044zuT
    public UDSinglePieChartView(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    @InterfaceC60044zuT
    public UDSinglePieChartView(Globals globals, @NonNull T t) {
        super(globals, t);
    }

    @InterfaceC60044zuT
    public UDSinglePieChartView(Globals globals) {
        super(globals);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    @Override // com.immomo.mls.fun.ud.view.UDView
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public T AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        T t = (T) new LuaSinglePieChartView(AubY(), this);
        this.EZpvd = t;
        return t;
    }

    @InterfaceC60044zuT
    public LuaValue[] setPieChartColors(LuaValue[] luaValueArr) {
        int i = 0;
        try {
            LuaTable luaTable = (LuaTable) luaValueArr[0];
            int[] iArr = new int[luaTable.zLjUOn()];
            while (i < luaTable.zLjUOn()) {
                int i2 = i + 1;
                UDColor uDColor = (UDColor) luaTable.get(i2);
                iArr[i] = uDColor.AEQbTJ().getColor(this.globals);
                uDColor.destroy();
                i = i2;
            }
            this.EZpvd.setPieChartColors(iArr);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setContentConfig(LuaValue[] luaValueArr) {
        try {
            UDColor uDColor = (UDColor) luaValueArr[0];
            JColor jColorAEQbTJ = uDColor.AEQbTJ();
            String javaString = luaValueArr[1].toJavaString();
            float f = (float) luaValueArr[2].toDouble();
            UDColor uDColor2 = (UDColor) luaValueArr[3];
            JColor jColorAEQbTJ2 = uDColor2.AEQbTJ();
            float f2 = (float) luaValueArr[4].toDouble();
            float f3 = (float) luaValueArr[5].toDouble();
            this.EZpvd.setContentConfig(jColorAEQbTJ.getColor(this.globals), C7829arH.KWHzl.AEQbTJ(javaString, AubY()), f, jColorAEQbTJ2.getColor(this.globals), f2, f3);
            uDColor.destroy();
            uDColor2.destroy();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setCircleConfig(LuaValue[] luaValueArr) {
        try {
            float f = luaValueArr[0].toFloat();
            float f2 = luaValueArr[1].toFloat();
            float f3 = luaValueArr[2].toFloat();
            float f4 = luaValueArr[3].toFloat();
            UDColor uDColor = (UDColor) luaValueArr[4];
            this.EZpvd.setCircleConfig(f, f2, f3, f4, uDColor.AEQbTJ().getColor(this.globals));
            uDColor.destroy();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setData(LuaValue[] luaValueArr) {
        try {
            this.EZpvd.setData(luaValueArr[0].toJavaString());
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] removeTouchMode(LuaValue[] luaValueArr) {
        this.EZpvd.AEQbTJ();
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] pieChartClickCallback(LuaValue[] luaValueArr) {
        try {
            this.EZpvd.KWHzl(luaValueArr[0].toLuaFunction());
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
