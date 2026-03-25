package com.immomo.mls.fun.ui.custom.chart;

import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import androidx.annotation.NonNull;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.Utils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ibm.icu.text.DateFormat;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import com.okinc.p2p.api.OtcExtraKeys;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.C7323ahf;
import o.C7326ahi;
import o.C7521alR;
import o.C7829arH;
import o.C7910asj;
import o.InterfaceC60044zuT;
import o.InterfaceC7855arh;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaUserdata;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class OKLineChartDataSet extends LuaUserdata<LineDataSet> {
    public static final String LUA_CLASS_NAME = "OKLineChartDataSet";
    public static final String[] methods = {"drawHorizontalHighlightIndicatorEnabled", "drawVerticalHighlightIndicatorEnabled", "drawFilledEnabled", "drawValuesEnabled", "drawCirclesEnabled", "drawCircleHoleEnabled", "lineWidth", "valueTextColor", "highlightColor", "circleColor", "color", "fillColor", "circleRadius", "circleHoleRadius", "circleHoleColor", "axisDependency", OtcExtraKeys.MODE, "setFillColorTopAndBottom", "setValueFormatter", "valueFont", "setHighlightEnabled", "highlightDashedLine", "highlightLineWidth"};
    public final InterfaceC7855arh provider;

    /* JADX WARN: Type inference failed for: r6v5, types: [T, com.github.mikephil.charting.data.LineDataSet] */
    @InterfaceC60044zuT
    public OKLineChartDataSet(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.provider = C7323ahf.AYXKKw();
        if (luaValueArr == null || luaValueArr.length != 2) {
            return;
        }
        LuaTable luaTable = luaValueArr[0].toLuaTable();
        String javaString = luaValueArr[1].toJavaString();
        List<C7521alR> listEZpvd = EZpvd(luaTable);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listEZpvd.size(); i++) {
            C7521alR c7521alR = listEZpvd.get(i);
            Entry entry = new Entry(c7521alR.EZpvd(), c7521alR.AEQbTJ());
            copydefault(entry, c7521alR);
            arrayList.add(entry);
        }
        this.javaUserdata = new LineDataSet(arrayList, javaString);
    }

    public final void copydefault(Entry entry, C7521alR c7521alR) {
        JDImageInfo jDImageInfoKWHzl = c7521alR.KWHzl();
        if (jDImageInfoKWHzl != null) {
            entry.setIcon(this.provider.KWHzl(C7326ahi.OLrzqt(), jDImageInfoKWHzl));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] highlightLineWidth(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            float f = luaValue.toFloat();
            if (f > 0.0f) {
                ((LineDataSet) this.javaUserdata).setHighlightLineWidth(f);
            }
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] highlightDashedLine(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 3 && (luaValue = luaValueArr[0]) != null && luaValueArr[1] != null && luaValueArr[2] != null) {
            ((LineDataSet) this.javaUserdata).enableDashedHighlightLine(Utils.convertDpToPixel(luaValue.toFloat()), Utils.convertDpToPixel(luaValueArr[1].toFloat()), Utils.convertDpToPixel(luaValueArr[2].toFloat()));
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] drawHorizontalHighlightIndicatorEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((LineDataSet) t).setDrawHorizontalHighlightIndicator(luaValue.toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] drawVerticalHighlightIndicatorEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((LineDataSet) t).setDrawVerticalHighlightIndicator(luaValue.toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] drawFilledEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((LineDataSet) t).setDrawFilled(luaValue.toBoolean());
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
            ((LineDataSet) t).setDrawValues(luaValue.toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] drawCirclesEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((LineDataSet) t).setDrawCircles(luaValue.toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] drawCircleHoleEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((LineDataSet) t).setDrawCircleHole(luaValue.toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] lineWidth(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((LineDataSet) t).setLineWidth(luaValue.toFloat());
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r7v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] valueFont(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 2 && (luaValue = luaValueArr[0]) != null && luaValueArr[1] != null && this.javaUserdata != 0) {
            Typeface typefaceAEQbTJ = C7829arH.KWHzl.AEQbTJ(luaValue.toJavaString(), C7326ahi.OLrzqt());
            float f = (float) luaValueArr[1].toDouble();
            if (f != 0.0f) {
                ((LineDataSet) this.javaUserdata).setValueTextSize(f);
            }
            if (typefaceAEQbTJ != null) {
                ((LineDataSet) this.javaUserdata).setValueTypeface(typefaceAEQbTJ);
            }
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
            ((LineDataSet) t).setValueTextColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
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
            ((LineDataSet) t).setHighLightColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setHighlightEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((LineDataSet) t).setHighlightEnabled(luaValue.toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] circleColor(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((LineDataSet) t).setCircleColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
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
            ((LineDataSet) t).setColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] fillColor(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((LineDataSet) t).setFillColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setFillColorTopAndBottom(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 1) {
            UDColor uDColor = (UDColor) luaValueArr[0];
            UDColor uDColor2 = (UDColor) luaValueArr[1];
            int[] iArr = {uDColor.AEQbTJ().getColor(this.globals), uDColor2.AEQbTJ().getColor(this.globals)};
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable.setColors(iArr);
            ((LineDataSet) this.javaUserdata).setFillDrawable(gradientDrawable);
            uDColor.destroy();
            uDColor2.destroy();
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] setValueFormatter(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null && this.javaUserdata != 0) {
            final LuaFunction luaFunction = luaValue.toLuaFunction();
            ((LineDataSet) this.javaUserdata).setValueFormatter(new ValueFormatter() { // from class: com.immomo.mls.fun.ui.custom.chart.OKLineChartDataSet.5
                @Override // com.github.mikephil.charting.formatter.ValueFormatter
                public String getFormattedValue(float f) {
                    return luaFunction.invoke(LuaValue.varargsOf(LuaNumber.copydefault(f)))[0].toJavaString();
                }
            });
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] circleRadius(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((LineDataSet) t).setCircleRadius(luaValue.toFloat());
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] circleHoleRadius(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((LineDataSet) t).setCircleHoleRadius(luaValue.toFloat());
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] circleHoleColor(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        T t;
        if (luaValueArr != null && (luaValue = luaValueArr[0]) != null && (t = this.javaUserdata) != 0) {
            ((LineDataSet) t).setCircleHoleColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
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
                ((LineDataSet) this.javaUserdata).setAxisDependency(YAxis.AxisDependency.LEFT);
            } else if (i == 1) {
                ((LineDataSet) this.javaUserdata).setAxisDependency(YAxis.AxisDependency.RIGHT);
            }
        }
        return LuaValue.varargsOf(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC60044zuT
    public LuaValue[] mode(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr[0] != null && this.javaUserdata != 0) {
            LineDataSet.Mode[] modeArrValues = LineDataSet.Mode.values();
            int i = luaValueArr[0].toInt();
            if (i >= 0 && modeArrValues.length > i) {
                ((LineDataSet) this.javaUserdata).setMode(modeArrValues[i]);
            }
        }
        return LuaValue.varargsOf(this);
    }

    private List<C7521alR> EZpvd(@NonNull LuaTable luaTable) {
        ArrayList arrayList = new ArrayList();
        if (!luaTable.gHZMYf()) {
            return arrayList;
        }
        List listCopydefault = C7910asj.copydefault(luaTable);
        for (int i = 0; i < listCopydefault.size(); i++) {
            HashMap map = (HashMap) listCopydefault.get(i);
            float fFloatValue = EZpvd(map.get("x")).floatValue();
            float fFloatValue2 = EZpvd(map.get(DateFormat.YEAR)).floatValue();
            Object obj = map.get(RemoteMessageConst.Notification.ICON);
            if (obj instanceof JDImageInfo) {
                arrayList.add(new C7521alR(fFloatValue, fFloatValue2, (JDImageInfo) obj));
            } else {
                arrayList.add(new C7521alR(fFloatValue, fFloatValue2));
            }
        }
        luaTable.zsXlph();
        luaTable.destroy();
        return arrayList;
    }

    public final Float EZpvd(Object obj) {
        float fFloatValue = obj instanceof Integer ? ((Integer) obj).floatValue() : 0.0f;
        if (obj instanceof Double) {
            fFloatValue = ((Double) obj).floatValue();
        }
        if (obj instanceof Float) {
            fFloatValue = ((Float) obj).floatValue();
        }
        if (obj instanceof Long) {
            fFloatValue = ((Long) obj).floatValue();
        }
        return Float.valueOf(fFloatValue);
    }
}
