package com.immomo.mls.fun.ui.custom.chart;

import androidx.annotation.NonNull;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.immomo.mls.fun.ud.UDColor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C7910asj;
import o.InterfaceC60041zuQ;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class OKStackBarChartDataSet extends LuaUserdata<BarDataSet> {
    public static final String LUA_CLASS_NAME = "OKStackBarChartDataSet";
    public static final String[] methods = {"drawValuesEnabled", "valueTextColor", "highlightColor", "highlightEnabled", "color", "colors", "axisDependency", "barBorderWidth"};

    /* JADX WARN: Type inference failed for: r3v1, types: [T, com.github.mikephil.charting.data.BarDataSet] */
    @InterfaceC60044zuT
    public OKStackBarChartDataSet(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        if (luaValueArr == null || luaValueArr.length != 2) {
            return;
        }
        LuaTable luaTable = luaValueArr[0].toLuaTable();
        this.javaUserdata = new BarDataSet(OLrzqt(luaTable), luaValueArr[1].toJavaString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] drawValuesEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((BarDataSet) t).setDrawValues(luaValue.toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] valueTextColor(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((BarDataSet) t).setValueTextColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] highlightColor(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((BarDataSet) t).setHighLightColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] highlightEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((BarDataSet) t).setHighlightEnabled(luaValue.toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] color(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((BarDataSet) t).setColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v8, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] colors(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && this.javaUserdata != 0) {
            InterfaceC60041zuQ<LuaTable.Application> it = luaValue.toLuaTable().iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((UDColor) it.next().KWHzl).AEQbTJ().getColor(this.globals)));
            }
            int size = arrayList.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = ((Integer) arrayList.get(i)).intValue();
            }
            ((BarDataSet) this.javaUserdata).setColors(iArr);
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] axisDependency(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && this.javaUserdata != 0) {
            int i = luaValue.toInt();
            if (i == 0) {
                ((BarDataSet) this.javaUserdata).setAxisDependency(YAxis.AxisDependency.LEFT);
            } else if (i == 1) {
                ((BarDataSet) this.javaUserdata).setAxisDependency(YAxis.AxisDependency.RIGHT);
            }
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] barBorderWidth(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((BarDataSet) t).setBarBorderWidth(luaValue.toFloat());
        }
        return LuaValue.varargsOf(this);
    }

    public final ArrayList<BarEntry> OLrzqt(@NonNull LuaTable luaTable) {
        ArrayList<BarEntry> arrayList = new ArrayList<>();
        if (!luaTable.gHZMYf()) {
            return arrayList;
        }
        List listCopydefault = C7910asj.copydefault(luaTable);
        for (int i = 0; i < listCopydefault.size(); i++) {
            HashMap map = (HashMap) listCopydefault.get(i);
            Object obj = map.get("x");
            float fFloatValue = obj instanceof Integer ? ((Integer) obj).floatValue() : 0.0f;
            if (obj instanceof Double) {
                fFloatValue = ((Double) obj).floatValue();
            }
            if (obj instanceof Float) {
                fFloatValue = ((Float) obj).floatValue();
            }
            float[] fArrAEQbTJ = AEQbTJ((HashMap) map.get("yValues"));
            if (fArrAEQbTJ != null) {
                arrayList.add(new BarEntry(fFloatValue, fArrAEQbTJ));
            }
        }
        luaTable.zsXlph();
        luaTable.destroy();
        return arrayList;
    }

    public final float[] AEQbTJ(HashMap map) {
        if (map == null || map.values().isEmpty()) {
            return null;
        }
        float[] fArr = new float[map.size()];
        int i = 0;
        for (Object obj : map.values()) {
            float fFloatValue = obj instanceof Integer ? ((Integer) obj).floatValue() : 0.0f;
            if (obj instanceof Double) {
                fFloatValue = ((Double) obj).floatValue();
            }
            if (obj instanceof Float) {
                fFloatValue = ((Float) obj).floatValue();
            }
            fArr[i] = fFloatValue;
            i++;
        }
        return fArr;
    }
}
