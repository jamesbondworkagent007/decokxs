package com.immomo.mls.fun.ui.custom.chart;

import androidx.annotation.NonNull;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarEntry;
import com.ibm.icu.text.DateFormat;
import com.immomo.mls.fun.ud.UDColor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C7348aiD;
import o.C7505alB;
import o.C7865arr;
import o.C7910asj;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class OKBarChartDataSet extends LuaUserdata<C7505alB> {
    public static final String LUA_CLASS_NAME = "OKBarChartDataSet";
    public static final String[] methods = {"drawValuesEnabled", "valueTextColor", "highlightColor", "highlightEnabled", "color", "axisDependency", "barBorderWidth", "barCornerRadius", "barHighlightLine", "barBorderColor"};

    /* JADX WARN: Type inference failed for: r5v4, types: [T, o.alB] */
    @InterfaceC60044zuT
    public OKBarChartDataSet(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        if (luaValueArr == null || luaValueArr.length != 2) {
            return;
        }
        LuaTable luaTable = luaValueArr[0].toLuaTable();
        String javaString = luaValueArr[1].toJavaString();
        List<C7348aiD> listAEQbTJ = AEQbTJ(luaTable);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listAEQbTJ.size(); i++) {
            C7348aiD c7348aiD = listAEQbTJ.get(i);
            arrayList.add(new BarEntry(c7348aiD.KWHzl(), c7348aiD.EZpvd()));
        }
        this.javaUserdata = new C7505alB(arrayList, javaString);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] barBorderColor(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((C7505alB) t).setBarBorderColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] drawValuesEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((C7505alB) t).setDrawValues(luaValue.toBoolean());
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
            ((C7505alB) t).setValueTextColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
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
            ((C7505alB) t).setHighLightColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
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
            ((C7505alB) t).setHighlightEnabled(luaValue.toBoolean());
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
            ((C7505alB) t).setColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
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
                ((C7505alB) this.javaUserdata).setAxisDependency(YAxis.AxisDependency.LEFT);
            } else if (i == 1) {
                ((C7505alB) this.javaUserdata).setAxisDependency(YAxis.AxisDependency.RIGHT);
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
            ((C7505alB) t).setBarBorderWidth(luaValue.toFloat());
        }
        return LuaValue.varargsOf(this);
    }

    public final List<C7348aiD> AEQbTJ(@NonNull LuaTable luaTable) {
        ArrayList arrayList = new ArrayList();
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
            Object obj2 = map.get(DateFormat.YEAR);
            float fFloatValue2 = obj2 instanceof Integer ? ((Integer) obj2).floatValue() : 0.0f;
            if (obj2 instanceof Double) {
                fFloatValue2 = ((Double) obj2).floatValue();
            }
            if (obj2 instanceof Float) {
                fFloatValue2 = ((Float) obj2).floatValue();
            }
            arrayList.add(new C7348aiD(fFloatValue, fFloatValue2));
        }
        luaTable.zsXlph();
        luaTable.destroy();
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] barCornerRadius(LuaValue[] luaValueArr) {
        T t;
        if (luaValueArr != null && luaValueArr.length == 2 && (t = this.javaUserdata) != 0) {
            ((C7505alB) t).EZpvd(C7865arr.copydefault(luaValueArr[0].toFloat()));
            ((C7505alB) this.javaUserdata).EZpvd(luaValueArr[1].toInt());
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] barHighlightLine(LuaValue[] luaValueArr) {
        T t;
        if (luaValueArr != null && luaValueArr.length == 2 && (t = this.javaUserdata) != 0) {
            ((C7505alB) t).OLrzqt(C7865arr.copydefault(luaValueArr[0].toFloat()));
            ((C7505alB) this.javaUserdata).copydefault(((UDColor) luaValueArr[1]).AEQbTJ().getColor(this.globals));
        }
        return LuaValue.varargsOf(this);
    }
}
