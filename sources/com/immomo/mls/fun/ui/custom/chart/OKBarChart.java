package com.immomo.mls.fun.ui.custom.chart;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.UDImageInfo;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.immomo.mls.fun.ui.custom.JColor;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.AbstractC7522alS;
import o.C32113mPz;
import o.C7323ahf;
import o.C7833arL;
import o.C7840arS;
import o.C7910asj;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNil;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class OKBarChart<U extends BarChart> extends UDViewGroup<U> {
    public static final String[] KWHzl = {"touchEnabled", "dragEnabled", "setCircleRadius", "setCircleHoleRadius", "setArrowColor", "setMarkerView", "setLegendEnabled", "setBarWidth", "setMarkerCallback", "scaleXEnabled", "setDrawXGridLinesEnabled", "setXAxisLineColor", "setXAxisTextColor", "setXAxisPosition", "setXLabelCount", "setXValueFormatter", "setLeftAxisMinimum", "setShowLeftAxis", "setDrawLeftGridLinesEnabled", "setLeftGridColor", "setLeftAxisGridLineWidth", "setDrawLeftAxisLineEnabled", "setLeftLabelCount", "setLeftAxisTextColor", "setLeftValueFormatter", "setShowRightAxis", "setDrawRightGridLinesEnabled", "setDataSets", "setOutLineColor"};
    public float AEQbTJ;
    public float AYXKKw;
    public LuaFunction AhwBna;
    public JColor AkhnZx;
    public JColor DbNXlk;
    public BarChart EZpvd;
    public JColor OLrzqt;
    public JDImageInfo copydefault;
    public JDImageInfo djBIcL;
    public float gEmmrt;
    public LuaFunction isConnected;
    public View valueOf;
    public LuaFunction values;

    @InterfaceC60044zuT
    public OKBarChart(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.AYXKKw = -1.0f;
        this.gEmmrt = -1.0f;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public U AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        BarChart barChart = new BarChart(AubY());
        this.EZpvd = barChart;
        barChart.getAxisRight().setEnabled(false);
        this.EZpvd.getDescription().setEnabled(false);
        this.EZpvd.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        this.EZpvd.getXAxis().setAvoidFirstLastClipping(true);
        this.EZpvd.getAxisLeft().setDrawGridLines(false);
        this.EZpvd.getAxisLeft().setDrawGridLines(true);
        this.EZpvd.setDragEnabled(true);
        this.EZpvd.setScaleEnabled(false);
        this.EZpvd.setPinchZoom(false);
        this.EZpvd.setDoubleTapToZoomEnabled(false);
        return (U) this.EZpvd;
    }

    @InterfaceC60044zuT
    public LuaValue[] touchEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.EZpvd.setTouchEnabled(luaValue.toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] dragEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.EZpvd.setDragEnabled(luaValue.toBoolean());
            return LuaValue.varargsOf(this);
        }
        return LuaValue.rBoolean(this.EZpvd.isDragEnabled());
    }

    @InterfaceC60044zuT
    public LuaValue[] setCircleRadius(LuaValue[] luaValueArr) {
        this.AYXKKw = luaValueArr[0].toFloat();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setCircleHoleRadius(LuaValue[] luaValueArr) {
        this.gEmmrt = luaValueArr[0].toFloat();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setArrowColor(LuaValue[] luaValueArr) {
        this.AkhnZx = ((UDColor) luaValueArr[0]).AEQbTJ();
        this.OLrzqt = ((UDColor) luaValueArr[1]).AEQbTJ();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setMarkerCallback(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            this.isConnected = luaValue.toLuaFunction();
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setMarkerView(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            if (luaValueArr[0].isNil()) {
                C7833arL.valueOf("call addView(nil)!", this.globals);
                return null;
            }
            final View viewF_ = ((UDView) luaValueArr[0]).f_();
            this.valueOf = viewF_;
            final ArrayList arrayList = new ArrayList();
            AbstractC7522alS abstractC7522alS = new AbstractC7522alS(AubY()) { // from class: com.immomo.mls.fun.ui.custom.chart.OKBarChart.5
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.AbstractC7522alS
                public ArrayList<Integer> KWHzl() {
                    return arrayList;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // o.AbstractC7522alS, com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
                public void refreshContent(Entry entry, Highlight highlight) {
                    OKBarChart.this.isConnected.invoke(LuaValue.varargsOf(LuaNumber.valueOf(((IBarLineScatterCandleBubbleDataSet) ((BarData) OKBarChart.this.EZpvd.getData()).getDataSetByIndex(highlight.getDataSetIndex())).getEntryIndex(entry))));
                    super.refreshContent(entry, highlight);
                }

                @Override // o.AbstractC7522alS
                public View OLrzqt(ViewGroup viewGroup) {
                    viewGroup.addView(viewF_);
                    setPointRadius(Utils.convertDpToPixel(OKBarChart.this.AYXKKw));
                    setPointCenterRadius(Utils.convertDpToPixel(OKBarChart.this.gEmmrt));
                    if (OKBarChart.this.djBIcL != null) {
                        OKBarChart oKBarChart = OKBarChart.this;
                        oKBarChart.EZpvd(oKBarChart.djBIcL, EZpvd());
                    } else {
                        Drawable drawable = ContextCompat.getDrawable(getContext(), C32113mPz.TaskDescription.AYXKKw);
                        if (drawable != null) {
                            int color = ContextCompat.getColor(getContext(), C32113mPz.ActionBar.OcIXYQ);
                            if (OKBarChart.this.AkhnZx != null) {
                                color = OKBarChart.this.AkhnZx.getColor(OKBarChart.this.globals);
                            }
                            DrawableCompat.setTint(drawable, color);
                        }
                        EZpvd().setImageDrawable(drawable);
                    }
                    if (OKBarChart.this.copydefault != null) {
                        OKBarChart oKBarChart2 = OKBarChart.this;
                        oKBarChart2.EZpvd(oKBarChart2.copydefault, EZpvd());
                    } else {
                        Drawable drawable2 = ContextCompat.getDrawable(getContext(), C32113mPz.TaskDescription.valueOf);
                        if (drawable2 != null) {
                            int color2 = ContextCompat.getColor(getContext(), C32113mPz.ActionBar.OcIXYQ);
                            if (OKBarChart.this.OLrzqt != null) {
                                color2 = OKBarChart.this.OLrzqt.getColor(OKBarChart.this.globals);
                            }
                            DrawableCompat.setTint(drawable2, color2);
                        }
                        OLrzqt().setImageDrawable(drawable2);
                    }
                    return viewF_;
                }
            };
            JColor jColor = this.DbNXlk;
            if (jColor != null) {
                abstractC7522alS.setOutLineColor(jColor.getColor(this.globals));
            }
            abstractC7522alS.setChartView(this.EZpvd);
            this.EZpvd.setMarker(abstractC7522alS);
        }
        return LuaValue.varargsOf(this);
    }

    public void EZpvd(final JDImageInfo jDImageInfo, final ImageView imageView) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            OLrzqt(jDImageInfo, imageView);
        } else {
            C7840arS.copydefault(new Runnable() { // from class: com.immomo.mls.fun.ui.custom.chart.OKBarChart.4
                @Override // java.lang.Runnable
                public void run() {
                    OKBarChart.this.OLrzqt(jDImageInfo, imageView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OLrzqt(JDImageInfo jDImageInfo, ImageView imageView) {
        Context contextAubY = AubY();
        if (contextAubY == null) {
            return;
        }
        boolean zIsNetUrl = jDImageInfo.isNetUrl();
        if (!zIsNetUrl && !TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
            KWHzl(C7323ahf.AYXKKw().KWHzl(contextAubY, jDImageInfo), imageView);
        } else {
            if (zIsNetUrl || !TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
                return;
            }
            KWHzl((Drawable) null, imageView);
        }
    }

    private void KWHzl(Drawable drawable, ImageView imageView) {
        imageView.setImageDrawable(drawable);
    }

    @InterfaceC60044zuT
    public LuaValue[] setArrowImage(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaValue luaValue2;
        if (luaValueArr.length == 1 && (luaValue2 = luaValueArr[0]) != null) {
            UDImageInfo uDImageInfo = (UDImageInfo) luaValue2;
            this.djBIcL = uDImageInfo.EZpvd();
            uDImageInfo.destroy();
        }
        if (luaValueArr.length == 2 && (luaValue = luaValueArr[0]) != null && luaValueArr[1] != null && !(luaValue instanceof LuaNil)) {
            UDImageInfo uDImageInfo2 = (UDImageInfo) luaValue;
            this.djBIcL = uDImageInfo2.EZpvd();
            uDImageInfo2.destroy();
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setOutLineColor(LuaValue[] luaValueArr) {
        this.DbNXlk = ((UDColor) luaValueArr[0]).AEQbTJ();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLegendEnabled(LuaValue[] luaValueArr) {
        this.EZpvd.getLegend().setEnabled(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setBarWidth(LuaValue[] luaValueArr) {
        this.AEQbTJ = luaValueArr[0].toFloat();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] scaleXEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.EZpvd.setScaleXEnabled(luaValue.toBoolean());
            return LuaValue.varargsOf(this);
        }
        return LuaValue.rBoolean(this.EZpvd.isScaleXEnabled());
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawXGridLinesEnabled(LuaValue[] luaValueArr) {
        this.EZpvd.getXAxis().setDrawGridLines(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXAxisLineColor(LuaValue[] luaValueArr) {
        this.EZpvd.getXAxis().setAxisLineColor(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals));
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXAxisTextColor(LuaValue[] luaValueArr) {
        this.EZpvd.getXAxis().setTextColor(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals));
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXAxisPosition(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0) {
            int i = luaValueArr[0].toInt();
            if (i == 0) {
                this.EZpvd.getXAxis().setPosition(XAxis.XAxisPosition.TOP);
            } else if (i == 1) {
                this.EZpvd.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
            } else if (i == 2) {
                this.EZpvd.getXAxis().setPosition(XAxis.XAxisPosition.BOTH_SIDED);
            } else if (i == 3) {
                this.EZpvd.getXAxis().setPosition(XAxis.XAxisPosition.TOP_INSIDE);
            } else if (i == 4) {
                this.EZpvd.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM_INSIDE);
            }
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXLabelCount(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 1) {
            this.EZpvd.getXAxis().setLabelCount(luaValueArr[0].toInt(), luaValueArr[1].toBoolean());
        } else {
            this.EZpvd.getXAxis().setLabelCount(luaValueArr[0].toInt());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXValueFormatter(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            this.values = luaValue.toLuaFunction();
            this.EZpvd.getXAxis().setValueFormatter(new ValueFormatter() { // from class: com.immomo.mls.fun.ui.custom.chart.OKBarChart.2
                @Override // com.github.mikephil.charting.formatter.ValueFormatter
                public String getFormattedValue(float f) {
                    return OKBarChart.this.values.invoke(LuaValue.varargsOf(LuaNumber.copydefault(f)))[0].toJavaString();
                }
            });
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLeftAxisMinimum(LuaValue[] luaValueArr) {
        this.EZpvd.getAxisLeft().setAxisMinimum(luaValueArr[0].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setShowLeftAxis(LuaValue[] luaValueArr) {
        this.EZpvd.getAxisLeft().setEnabled(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawLeftGridLinesEnabled(LuaValue[] luaValueArr) {
        this.EZpvd.getAxisLeft().setDrawGridLines(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLeftGridColor(LuaValue[] luaValueArr) {
        this.EZpvd.getAxisLeft().setGridColor(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals));
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLeftAxisGridLineWidth(LuaValue[] luaValueArr) {
        this.EZpvd.getAxisLeft().setAxisLineWidth(luaValueArr[0].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawLeftAxisLineEnabled(LuaValue[] luaValueArr) {
        this.EZpvd.getAxisLeft().setDrawAxisLine(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLeftLabelCount(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 1) {
            this.EZpvd.getAxisLeft().setLabelCount(luaValueArr[0].toInt(), luaValueArr[1].toBoolean());
        } else {
            this.EZpvd.getAxisLeft().setLabelCount(luaValueArr[0].toInt());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLeftAxisTextColor(LuaValue[] luaValueArr) {
        this.EZpvd.getAxisLeft().setTextColor(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals));
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLeftValueFormatter(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            this.AhwBna = luaValue.toLuaFunction();
            this.EZpvd.getAxisLeft().setValueFormatter(new ValueFormatter() { // from class: com.immomo.mls.fun.ui.custom.chart.OKBarChart.1
                @Override // com.github.mikephil.charting.formatter.ValueFormatter
                public String getFormattedValue(float f) {
                    return OKBarChart.this.AhwBna.invoke(LuaValue.varargsOf(LuaNumber.copydefault(f)))[0].toJavaString();
                }
            });
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setShowRightAxis(LuaValue[] luaValueArr) {
        this.EZpvd.getAxisRight().setEnabled(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawRightGridLinesEnabled(LuaValue[] luaValueArr) {
        this.EZpvd.getAxisRight().setDrawGridLines(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDataSets(LuaValue[] luaValueArr) {
        if (luaValueArr == null || luaValueArr.length == 0) {
            return LuaValue.varargsOf(this);
        }
        BarData barData = new BarData();
        List listCopydefault = C7910asj.copydefault(luaValueArr[1].toLuaTable());
        if (listCopydefault.size() > 0) {
            Iterator it = listCopydefault.iterator();
            while (it.hasNext()) {
                barData.addDataSet((BarDataSet) it.next());
            }
        }
        float f = this.AEQbTJ;
        if (f > 0.0f) {
            barData.setBarWidth(f);
        }
        this.EZpvd.setData(barData);
        this.EZpvd.notifyDataSetChanged();
        this.EZpvd.invalidate();
        return LuaValue.varargsOf(this);
    }
}
