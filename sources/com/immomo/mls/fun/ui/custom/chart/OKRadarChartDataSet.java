package com.immomo.mls.fun.ui.custom.chart;

import android.graphics.drawable.GradientDrawable;
import androidx.annotation.NonNull;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.immomo.mls.fun.ud.UDColor;
import java.util.ArrayList;
import java.util.List;
import o.C7910asj;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class OKRadarChartDataSet extends LuaUserdata<RadarDataSet> {
    public static final String LUA_CLASS_NAME = "OKRadarChartDataSet";
    public static final String[] methods = {"setColor", "setFillColor", "setDrawFilled", "setFillAlpha", "setLineWidth", "setDrawHighlightCircleEnabled", "setHighlightCircleStrokeWidth", "setHighlightCircleStrokeColor", "setHighlightCircleStrokeAlpha", "setHighlightCircleInnerRadius", "setHighLightColor", "setHighlightCircleFillColor", "setDrawHighlightIndicators", "drawValuesEnabled", "setGradientFillEnabled", "setGradientFillColors"};
    public boolean mFillGradientColorEnable;

    /* JADX WARN: Type inference failed for: r4v1, types: [T, com.github.mikephil.charting.data.RadarDataSet] */
    @InterfaceC60044zuT
    public OKRadarChartDataSet(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.mFillGradientColorEnable = false;
        if (luaValueArr == null || luaValueArr.length != 2) {
            return;
        }
        LuaTable luaTable = luaValueArr[0].toLuaTable();
        this.javaUserdata = new RadarDataSet(KWHzl(luaTable), luaValueArr[1].toJavaString());
    }

    public final List<RadarEntry> KWHzl(LuaTable luaTable) {
        ArrayList arrayList = new ArrayList();
        if (!luaTable.gHZMYf()) {
            return arrayList;
        }
        List listCopydefault = C7910asj.copydefault(luaTable);
        for (int i = 0; i < listCopydefault.size(); i++) {
            Object obj = listCopydefault.get(i);
            float fFloatValue = obj instanceof Integer ? ((Integer) obj).floatValue() : 0.0f;
            if (obj instanceof Double) {
                fFloatValue = ((Double) obj).floatValue();
            }
            if (obj instanceof Float) {
                fFloatValue = ((Float) obj).floatValue();
            }
            arrayList.add(new RadarEntry(fFloatValue));
        }
        luaTable.zsXlph();
        luaTable.destroy();
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setColor(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((RadarDataSet) t).setColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setFillColor(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((RadarDataSet) t).setFillColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setDrawFilled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((RadarDataSet) t).setDrawFilled(luaValue.toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setFillAlpha(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((RadarDataSet) t).setFillAlpha((int) (luaValue.toFloat() * 255.0f));
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setLineWidth(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((RadarDataSet) t).setLineWidth(luaValue.toFloat());
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setDrawHighlightCircleEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((RadarDataSet) t).setDrawHighlightCircleEnabled(luaValue.toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setHighlightCircleStrokeWidth(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((RadarDataSet) t).setHighlightCircleStrokeWidth(luaValue.toFloat());
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setHighlightCircleStrokeColor(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((RadarDataSet) t).setHighlightCircleStrokeColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setHighlightCircleStrokeAlpha(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((RadarDataSet) t).setHighlightCircleStrokeAlpha((int) (luaValue.toFloat() * 255.0f));
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setHighlightCircleInnerRadius(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((RadarDataSet) t).setHighlightCircleInnerRadius(luaValue.toFloat());
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setHighLightColor(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((RadarDataSet) t).setHighLightColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setHighlightCircleFillColor(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((RadarDataSet) t).setHighlightCircleFillColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setDrawHighlightIndicators(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((RadarDataSet) t).setDrawHighlightIndicators(luaValue.toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] drawValuesEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            ((RadarDataSet) this.javaUserdata).setDrawValues(luaValue.toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setGradientFillEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.mFillGradientColorEnable = luaValue.toBoolean();
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v9, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setGradientFillColors(LuaValue[] luaValueArr) {
        int[] iArrAEQbTJ = AEQbTJ(luaValueArr);
        if (iArrAEQbTJ != null && this.mFillGradientColorEnable) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
            gradientDrawable.setShape(0);
            gradientDrawable.setColors(iArrAEQbTJ);
            gradientDrawable.setSize(10, 10);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setAlpha(((RadarDataSet) this.javaUserdata).getFillAlpha());
            ((RadarDataSet) this.javaUserdata).setFillDrawable(gradientDrawable);
        }
        return LuaValue.varargsOf(this);
    }

    public int[] AEQbTJ(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length < 1) {
            return null;
        }
        ArrayList<UDColor> arrayListOLrzqt = OLrzqt(luaValueArr[0].toLuaTable());
        int[] iArr = new int[arrayListOLrzqt.size()];
        for (int i = 0; i < arrayListOLrzqt.size(); i++) {
            iArr[i] = arrayListOLrzqt.get(i).AEQbTJ().getColor(this.globals);
        }
        return iArr;
    }

    public ArrayList<UDColor> OLrzqt(@NonNull LuaTable luaTable) {
        ArrayList<UDColor> arrayList = new ArrayList<>();
        if (!luaTable.gHZMYf()) {
            return arrayList;
        }
        while (true) {
            LuaValue[] luaValueArrSSMYrx = luaTable.sSMYrx();
            if (luaValueArrSSMYrx != null) {
                LuaValue luaValue = luaValueArrSSMYrx[1];
                if (luaValue instanceof UDColor) {
                    arrayList.add((UDColor) luaValue);
                }
            } else {
                luaTable.zsXlph();
                luaTable.destroy();
                return arrayList;
            }
        }
    }
}
