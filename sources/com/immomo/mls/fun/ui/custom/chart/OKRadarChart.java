package com.immomo.mls.fun.ui.custom.chart;

import androidx.annotation.NonNull;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import java.util.List;
import o.C7910asj;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class OKRadarChart<U extends RadarChart> extends UDViewGroup<U> {
    public static final String[] AEQbTJ = {"setDataSets", "highlightValues", "setWebLineWidth", "setWebColor", "setBackgroundColor", "setWebLineWidthInner", "setWebColorInner", "setWebAlpha", "setTouchEnabled", "setAnimation", "setXAxisTextSize", "setXAxisTextColor", "setXValueFormatter", "setXAxisEnabled", "setYAxisEnabled", "setYAxisLabelCount", "setYAxisMinimum", "setYAxisMaximum", "setYAxisDrawLabels", "setYAxisTextSize", "setYAxisTextColor", "setYValueFormatter", "highlightPerTapEnabled"};
    public LuaFunction EZpvd;
    public XAxis KWHzl;
    public YAxis OLrzqt;
    public RadarChart copydefault;
    public LuaFunction gEmmrt;

    @InterfaceC60044zuT
    public OKRadarChart(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public U AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        RadarChart radarChart = new RadarChart(AubY());
        this.copydefault = radarChart;
        radarChart.getDescription().setEnabled(false);
        XAxis xAxis = this.copydefault.getXAxis();
        this.KWHzl = xAxis;
        xAxis.setYOffset(0.0f);
        this.KWHzl.setXOffset(0.0f);
        this.OLrzqt = this.copydefault.getYAxis();
        this.copydefault.getLegend().setEnabled(false);
        return (U) this.copydefault;
    }

    @InterfaceC60044zuT
    public LuaValue[] setDataSets(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.varargsOf(this);
        }
        RadarData radarData = new RadarData((List<IRadarDataSet>) C7910asj.copydefault(luaValueArr[0].toLuaTable()));
        radarData.setValueTextSize(8.0f);
        radarData.setDrawValues(false);
        radarData.setValueTextColor(-1);
        this.copydefault.setData(radarData);
        this.copydefault.invalidate();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] highlightValues(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            List listOLrzqt = C7910asj.OLrzqt(luaValue.toLuaTable());
            Highlight[] highlightArr = new Highlight[listOLrzqt.size()];
            listOLrzqt.toArray(highlightArr);
            this.copydefault.highlightValues(highlightArr);
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setBackgroundColor(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.copydefault.setBackgroundColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setAnimation(LuaValue[] luaValueArr) {
        Easing.EasingFunction easingFunction;
        if (luaValueArr.length == 4) {
            int i = (int) (luaValueArr[0].toFloat() * 1000.0f);
            int i2 = (int) (luaValueArr[1].toFloat() * 1000.0f);
            switch (luaValueArr[3].toInt()) {
                case 1:
                    easingFunction = Easing.EaseInOutQuad;
                    break;
                case 2:
                    easingFunction = Easing.Linear;
                    break;
                case 3:
                    easingFunction = Easing.EaseInQuad;
                    break;
                case 4:
                    easingFunction = Easing.EaseOutQuad;
                    break;
                case 5:
                    easingFunction = Easing.EaseInCubic;
                    break;
                case 6:
                    easingFunction = Easing.EaseOutCubic;
                    break;
                case 7:
                    easingFunction = Easing.EaseInOutCubic;
                    break;
                case 8:
                    easingFunction = Easing.EaseInQuart;
                    break;
                case 9:
                    easingFunction = Easing.EaseOutQuart;
                    break;
                case 10:
                    easingFunction = Easing.EaseInOutQuart;
                    break;
                case 11:
                    easingFunction = Easing.EaseInSine;
                    break;
                case 12:
                    easingFunction = Easing.EaseOutSine;
                    break;
                case 13:
                    easingFunction = Easing.EaseInOutSine;
                    break;
                case 14:
                    easingFunction = Easing.EaseInExpo;
                    break;
                case 15:
                    easingFunction = Easing.EaseOutExpo;
                    break;
                case 16:
                    easingFunction = Easing.EaseInOutExpo;
                    break;
                case 17:
                    easingFunction = Easing.EaseInCirc;
                    break;
                case 18:
                    easingFunction = Easing.EaseOutCirc;
                    break;
                case 19:
                    easingFunction = Easing.EaseInOutCirc;
                    break;
                case 20:
                    easingFunction = Easing.EaseInElastic;
                    break;
                case 21:
                    easingFunction = Easing.EaseOutElastic;
                    break;
                case 22:
                    easingFunction = Easing.EaseInOutElastic;
                    break;
                case 23:
                    easingFunction = Easing.EaseInBack;
                    break;
                case 24:
                    easingFunction = Easing.EaseOutBack;
                    break;
                case 25:
                    easingFunction = Easing.EaseInOutBack;
                    break;
                case 26:
                    easingFunction = Easing.EaseInBounce;
                    break;
                case 27:
                    easingFunction = Easing.EaseOutBounce;
                    break;
                case 28:
                    easingFunction = Easing.EaseInOutBounce;
                    break;
                default:
                    easingFunction = null;
                    break;
            }
            this.copydefault.animateXY(i, i2, easingFunction);
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setWebLineWidth(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.copydefault.setWebLineWidth(luaValue.toFloat());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setWebColor(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.copydefault.setWebColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setWebLineWidthInner(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.copydefault.setWebLineWidthInner(luaValue.toFloat());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setWebColorInner(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.copydefault.setWebColorInner(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setWebAlpha(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.copydefault.setWebAlpha(luaValue.toInt() * 255);
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setTouchEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.copydefault.setTouchEnabled(luaValue.toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXAxisTextSize(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.KWHzl.setTextSize(luaValue.toFloat());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXAxisTextColor(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.KWHzl.setTextColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXValueFormatter(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.EZpvd = luaValue.toLuaFunction();
            this.KWHzl.setValueFormatter(new ValueFormatter() { // from class: com.immomo.mls.fun.ui.custom.chart.OKRadarChart.2
                @Override // com.github.mikephil.charting.formatter.ValueFormatter
                public String getFormattedValue(float f) {
                    return OKRadarChart.this.EZpvd.invoke(LuaValue.varargsOf(LuaNumber.copydefault(f)))[0].toJavaString();
                }
            });
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXAxisEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.KWHzl.setEnabled(luaValue.toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setYAxisEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.OLrzqt.setEnabled(luaValue.toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setYAxisLabelCount(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 2 && (luaValue = luaValueArr[0]) != null && luaValueArr[1] != null) {
            this.OLrzqt.setLabelCount(luaValue.toInt(), luaValueArr[1].toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setYAxisMinimum(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.OLrzqt.setAxisMinimum(luaValue.toFloat());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setYAxisMaximum(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.OLrzqt.setAxisMaximum(luaValue.toFloat());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setYAxisDrawLabels(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.OLrzqt.setDrawLabels(luaValue.toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setYAxisTextSize(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.OLrzqt.setTextSize(luaValue.toFloat());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setYAxisTextColor(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.OLrzqt.setTextColor(((UDColor) luaValue).AEQbTJ().getColor(this.globals));
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setYValueFormatter(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.gEmmrt = luaValue.toLuaFunction();
            this.OLrzqt.setValueFormatter(new ValueFormatter() { // from class: com.immomo.mls.fun.ui.custom.chart.OKRadarChart.3
                @Override // com.github.mikephil.charting.formatter.ValueFormatter
                public String getFormattedValue(float f) {
                    return OKRadarChart.this.gEmmrt.invoke(LuaValue.varargsOf(LuaNumber.copydefault(f)))[0].toJavaString();
                }
            });
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] highlightPerTapEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.copydefault.setHighlightPerTapEnabled(luaValue.toBoolean());
        }
        return LuaValue.varargsOf(this);
    }
}
