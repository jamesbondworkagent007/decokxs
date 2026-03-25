package com.immomo.mls.fun.ui.custom;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.CombinedData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import com.github.mikephil.charting.listener.OnChartValueSelectedListener;
import com.github.mikephil.charting.utils.Utils;
import com.immomo.mls.fun.ud.UDColor;
import com.immomo.mls.fun.ud.UDImageInfo;
import com.immomo.mls.fun.ud.UDSize;
import com.immomo.mls.fun.ud.view.UDView;
import com.immomo.mls.fun.ud.view.UDViewGroup;
import com.immomo.mls.fun.ui.custom.data.JDImageInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.AbstractC7522alS;
import o.C32113mPz;
import o.C7323ahf;
import o.C7505alB;
import o.C7514alK;
import o.C7555alz;
import o.C7829arH;
import o.C7833arL;
import o.C7840arS;
import o.C7865arr;
import o.C7910asj;
import o.InterfaceC60041zuQ;
import o.InterfaceC60044zuT;
import org.luaj.vm2.LuaFunction;
import org.luaj.vm2.LuaNil;
import org.luaj.vm2.LuaNumber;
import org.luaj.vm2.LuaTable;
import org.luaj.vm2.LuaValue;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC60044zuT
public class OkCombinedChart<U extends C7555alz> extends UDViewGroup<U> {
    public static final String[] EZpvd = {"touchEnabled", "dragEnabled", "scaleXEnabled", "scaleYEnabled", "pinchZoomEnabled", "setXGridDashedLine", "setYGridDashedLine", "setXAxisMaximum", "setXAxisMinimum", "setLeftAxisMaximum", "setLeftAxisMinimum", "setRightAxisMaximum", "setRightAxisMinimum", "setXAxisPosition", "setDrawGridBackgroundEnabled", "setGridBackgroundColor", "setXLabelCount", "setLeftLabelCount", "setRightLabelCount", "setDrawXAxisLineEnabled", "setDrawLeftAxisLineEnabled", "setDrawRightAxisLineEnabled", "setXGranularityEnabled", "setLeftGranularityEnabled", "setRightGranularityEnabled", "setRightAxisEnabled", "setLeftAxisEnabled", "animateX", "animateY", "animateXY", "setDrawBordersEnabled", "setLegendEnabled", "setXValueFormatter", "setLeftValueFormatter", "setRightValueFormatter", "setDrawXGridLinesEnabled", "setDrawLeftGridLinesEnabled", "setDrawRightGridLinesEnabled", "setMarkerView", "setMarkerCallback", "setArrowImage", "setArrowColor", "setXAvoidFirstLastClippingEnabled", "setXAxisGridColor", "setXAxisTextColor", "setLeftAxisTextColor", "setRightAxisTextColor", "setXAxisLineColor", "setLeftGridColor", "setRightGridColor", "setLeftAxisGridLineWidth", "setRightAxisGridLineWidth", "setLeftAxisLineColor", "setHardwareAccelerationEnabled", "setMode", "setLineData", "setLineAndBarChartData", "setDrawHorizontalHighlightIndicatorEnabled", "setDrawVerticalHighlightIndicatorEnabled", "setHighLightColor", "setValueFont", "setValueTextColor", "setDrawFilledEnabled", "setDrawValuesEnabled", "setDrawCirclesEnabled", "setDrawCircleHoleEnabled", "setLineWidth", "setCircleColor", "setCircleHoleColor", "setCircleRadius", "setCircleRadius2", "setCircleHoleRadius", "setColor", "setFillColor", "setBarWidth", "setBarColor", "setBarColors", "setLeftAxisZeroLineEnabled", "setLeftAxisZeroLineColor", "setLeftAxisZeroLineWidth", "setDrawLeftAxisLabelsEnabled", "setDrawRightAxisLabelsEnabled", "setXAxisAxisMaximumOffset", "setXAxisAxisMinimumOffset", "setShowBarValues", "setBarTextColor", "setBarTextFont", "setBarHighLightColor", "setShowRightAxis", "setShowLeftAxis", "setBarHighlightEnabled", "setVisibleXRangeMinimum", "setLineChartDataSets", "setXAxisLabelRotationAngle", "setFillColors", "setOutLineColor", "setOutLineColor2", "setOutLineCenterColor", "setExtraRightOffset", "setExtraLeftOffset", "setExtraTopOffset", "setExtraBottomOffset", "setXAxisLabelYOffset", "setXAxisLabelXOffset", "setLeftAxisLabelYOffset", "setLeftAxisLabelXOffset", "highlightValueX", "setMaximumScaleX", "setMarkerCancelSelectCallback", "disableParentActionWhenTouching", "setMaxVisibleValueCount", "setHighlightDashedLine", "setHighlightLineWidth", "setPointerWidth", "setPointerHeight", "setShadowMarkerView", "setVibrationEnable", "setPointerDirection", "setMarkerEndPanningCallback", "setHighlightPerTapEnabled", "setUseLongPressGestureEnabled", "lineCapType", "setCGLayerWithColor", "setLineShadowWithColor", "setDrawXAxisEnabled", "setDrawXAxisLabelsEnabled"};
    public boolean AEQbTJ;
    public float AYXKKw;
    public float AhwBna;
    public JColor AkhnZx;
    public float AuCTel;
    public float AuCTelauCTel;
    public float AubY;
    public boolean AwvSrB;
    public boolean AxsJAY;
    public View DLWbHP;
    public boolean DbNXlk;
    public Vibrator Dmq;
    public boolean KWHzl;
    public float OFhtUX;
    public int[] OHqIaq;
    public JColor OJuSTm;
    public Boolean OLrzqt;
    public LuaFunction OxVOHk;
    public JColor QCjLjM;
    public JColor QOLQEE;
    public JColor QSLkRj;
    public LuaFunction QVsKAR;
    public boolean QwvEab;
    public JColor USBtdM;
    public LuaFunction UlJrfe;
    public Typeface aUsmxb;
    public JColor copydefault;
    public float dUDNAs;
    public float djBIcL;
    public float ejfBZ;
    public Typeface fARcdN;
    public Integer fERRXa;
    public float fIwbmz;
    public float fJNWhG;
    public LuaFunction fdOvFl;
    public List<Integer> fetchVPNInfo;
    public Integer fjfviF;
    public JDImageInfo gEmmrt;
    public JColor gHZMYf;
    public LineDataSet.Mode getFieldNames;
    public JColor getNewProxyInstance;
    public JDImageInfo hDKMBd;
    public float htlTjW;
    public Integer igXuih;
    public JColor isConnected;
    public C7555alz iwGUEr;
    public boolean sSMYrx;
    public JColor spnCvw;
    public LuaFunction uzCIH;
    public float valueOf;
    public JColor values;
    public float wlaJM;
    public JColor zLjUOn;
    public JColor zsXlph;
    public boolean zuBGHE;

    @InterfaceC60044zuT
    public OkCombinedChart(long j, LuaValue[] luaValueArr) {
        super(j, luaValueArr);
        this.getFieldNames = LineDataSet.Mode.CUBIC_BEZIER;
        this.AEQbTJ = false;
        this.KWHzl = true;
        this.AxsJAY = false;
        this.sSMYrx = false;
        this.AwvSrB = false;
        this.zuBGHE = false;
        this.QwvEab = false;
        this.dUDNAs = 17.0f;
        this.fIwbmz = 17.0f;
        this.htlTjW = 0.001f;
        this.wlaJM = -1.0f;
        this.AubY = -1.0f;
        this.AuCTelauCTel = -1.0f;
        this.OFhtUX = -1.0f;
        this.AuCTel = 0.0f;
        this.fJNWhG = 0.0f;
        this.OHqIaq = new int[0];
        this.valueOf = 0.0f;
        this.AYXKKw = 0.0f;
        this.djBIcL = 0.0f;
        this.AhwBna = 0.0f;
        this.fjfviF = null;
        this.igXuih = null;
        this.OLrzqt = Boolean.FALSE;
        this.fERRXa = 0;
        this.Dmq = null;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ([Lorg/luaj/vm2/LuaValue;)Landroid/view/View; */
    /* JADX DEBUG: Method merged with bridge method: EZpvd([Lorg/luaj/vm2/LuaValue;)Landroid/view/ViewGroup; */
    @Override // com.immomo.mls.fun.ud.view.UDViewGroup
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public U AEQbTJ(@NonNull LuaValue[] luaValueArr) {
        C7555alz c7555alz = new C7555alz(AubY());
        this.iwGUEr = c7555alz;
        c7555alz.getAxisRight().setEnabled(false);
        this.iwGUEr.getDescription().setEnabled(false);
        this.iwGUEr.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        this.iwGUEr.getXAxis().setAvoidFirstLastClipping(true);
        this.iwGUEr.getAxisLeft().setDrawGridLines(false);
        this.iwGUEr.getAxisLeft().setDrawGridLines(true);
        this.iwGUEr.setDragEnabled(true);
        this.iwGUEr.setScaleEnabled(false);
        this.iwGUEr.setPinchZoom(false);
        this.iwGUEr.setDoubleTapToZoomEnabled(false);
        return (U) this.iwGUEr;
    }

    @InterfaceC60044zuT
    public LuaValue[] setPointerDirection(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.fERRXa = Integer.valueOf(luaValue.toInt());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setVibrationEnable(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.OLrzqt = Boolean.valueOf(luaValue.toBoolean());
        }
        this.iwGUEr.setOnChartValueSelectedListener(new OnChartValueSelectedListener() { // from class: com.immomo.mls.fun.ui.custom.OkCombinedChart.2
            @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
            public void onNothingSelected() {
            }

            @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
            public void onValueSelected(Entry entry, Highlight highlight) {
                if (OkCombinedChart.this.OLrzqt.booleanValue()) {
                    OkCombinedChart.this.gEmmrt();
                }
            }
        });
        return LuaValue.varargsOf(this);
    }

    public void gEmmrt() {
        Context contextAubY = AubY();
        if (this.Dmq == null) {
            if (Build.VERSION.SDK_INT >= 31) {
                VibratorManager vibratorManagerCI_ = C7514alK.cI_(contextAubY.getSystemService("vibrator_manager"));
                if (vibratorManagerCI_ != null) {
                    this.Dmq = vibratorManagerCI_.getDefaultVibrator();
                }
            } else {
                this.Dmq = (Vibrator) contextAubY.getSystemService("vibrator");
            }
        }
        Vibrator vibrator = this.Dmq;
        if (vibrator != null) {
            vibrator.cancel();
            if (Build.VERSION.SDK_INT >= 26) {
                this.Dmq.vibrate(VibrationEffect.createOneShot(3L, -1));
            } else {
                this.Dmq.vibrate(3L);
            }
        }
    }

    @InterfaceC60044zuT
    public LuaValue[] setHighlightLineWidth(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.AhwBna = luaValue.toFloat();
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setHighlightDashedLine(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 3 && (luaValue = luaValueArr[0]) != null && luaValueArr[1] != null && luaValueArr[2] != null) {
            this.valueOf = luaValue.toFloat();
            this.AYXKKw = luaValueArr[1].toFloat();
            this.djBIcL = luaValueArr[2].toFloat();
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setMaxVisibleValueCount(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.iwGUEr.setMaxVisibleValueCount(luaValue.toInt());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] disableParentActionWhenTouching(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 2 && (luaValue = luaValueArr[0]) != null && luaValueArr[1] != null) {
            this.iwGUEr.setDisableParentActionWhenTouching(luaValue.toBoolean(), luaValueArr[1].toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXAvoidFirstLastClippingEnabled(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1 && luaValueArr[0] != null) {
            this.iwGUEr.getXAxis().setAvoidFirstLastClipping(luaValueArr[0].toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setHardwareAccelerationEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.iwGUEr.setHardwareAccelerationEnabled(luaValue.toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setPointerHeight(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        this.igXuih = Integer.valueOf(C7865arr.copydefault(luaValueArr[0].toFloat()));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setPointerWidth(LuaValue[] luaValueArr) {
        if (luaValueArr.length != 1) {
            return null;
        }
        this.fjfviF = Integer.valueOf(C7865arr.copydefault(luaValueArr[0].toFloat()));
        return null;
    }

    @InterfaceC60044zuT
    public LuaValue[] setMarkerView(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 1) {
            if (luaValueArr[0].isNil()) {
                C7833arL.valueOf("call addView(nil)!", this.globals);
                return null;
            }
            this.DLWbHP = ((UDView) luaValueArr[0]).f_();
            this.iwGUEr.setMarker(OLrzqt());
        }
        return LuaValue.varargsOf(this);
    }

    public final AbstractC7522alS OLrzqt() {
        final View view = this.DLWbHP;
        final ArrayList arrayList = new ArrayList();
        JColor jColor = this.zLjUOn;
        if (jColor != null) {
            arrayList.add(Integer.valueOf(jColor.getColor(this.globals)));
        }
        AbstractC7522alS abstractC7522alS = new AbstractC7522alS(AubY()) { // from class: com.immomo.mls.fun.ui.custom.OkCombinedChart.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.AbstractC7522alS
            public ArrayList<Integer> KWHzl() {
                return arrayList;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.AbstractC7522alS, com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
            public void refreshContent(Entry entry, Highlight highlight) {
                int entryIndex = ((IBarLineScatterCandleBubbleDataSet) ((CombinedData) OkCombinedChart.this.iwGUEr.getData()).getDataSetByIndex(highlight.getDataSetIndex())).getEntryIndex(entry);
                if (OkCombinedChart.this.QVsKAR != null) {
                    OkCombinedChart.this.QVsKAR.invoke(LuaValue.varargsOf(LuaNumber.valueOf(entryIndex)));
                }
                super.refreshContent(entry, highlight);
            }

            @Override // o.AbstractC7522alS
            public View OLrzqt(ViewGroup viewGroup) {
                viewGroup.addView(view);
                setPointRadius(Utils.convertDpToPixel(OkCombinedChart.this.wlaJM));
                setPointCenterRadius(Utils.convertDpToPixel(OkCombinedChart.this.AuCTelauCTel));
                setPaintRadius2(Utils.convertDpToPixel(OkCombinedChart.this.AubY));
                if (OkCombinedChart.this.hDKMBd != null) {
                    OkCombinedChart okCombinedChart = OkCombinedChart.this;
                    okCombinedChart.EZpvd(okCombinedChart.hDKMBd, EZpvd());
                } else {
                    Drawable drawable = ContextCompat.getDrawable(getContext(), C32113mPz.TaskDescription.AYXKKw);
                    if (drawable != null) {
                        int color = ContextCompat.getColor(getContext(), C32113mPz.ActionBar.OcIXYQ);
                        if (OkCombinedChart.this.spnCvw != null) {
                            color = OkCombinedChart.this.spnCvw.getColor(OkCombinedChart.this.globals);
                        }
                        DrawableCompat.setTint(drawable, color);
                    }
                    EZpvd().setImageDrawable(drawable);
                }
                if (OkCombinedChart.this.gEmmrt != null) {
                    OkCombinedChart okCombinedChart2 = OkCombinedChart.this;
                    okCombinedChart2.EZpvd(okCombinedChart2.gEmmrt, EZpvd());
                } else {
                    Drawable drawable2 = ContextCompat.getDrawable(getContext(), C32113mPz.TaskDescription.valueOf);
                    if (drawable2 != null) {
                        int color2 = ContextCompat.getColor(getContext(), C32113mPz.ActionBar.OcIXYQ);
                        if (OkCombinedChart.this.copydefault != null) {
                            color2 = OkCombinedChart.this.copydefault.getColor(OkCombinedChart.this.globals);
                        }
                        DrawableCompat.setTint(drawable2, color2);
                    }
                    OLrzqt().setImageDrawable(drawable2);
                }
                return view;
            }
        };
        JColor jColor2 = this.QCjLjM;
        if (jColor2 != null) {
            abstractC7522alS.setOutLineColor(jColor2.getColor(this.globals));
        }
        JColor jColor3 = this.QSLkRj;
        if (jColor3 != null) {
            abstractC7522alS.setOutLineColor2(jColor3.getColor(this.globals));
        }
        JColor jColor4 = this.OJuSTm;
        if (jColor4 != null) {
            abstractC7522alS.setCenterColor(jColor4.getColor(this.globals));
        }
        if (this.fjfviF != null) {
            abstractC7522alS.EZpvd().getLayoutParams().width = this.fjfviF.intValue();
            abstractC7522alS.OLrzqt().getLayoutParams().width = this.fjfviF.intValue();
            if (this.fjfviF.intValue() == 0) {
                ViewGroup.LayoutParams layoutParams = abstractC7522alS.copydefault().getLayoutParams();
                if (layoutParams instanceof LinearLayout.LayoutParams) {
                    ((LinearLayout.LayoutParams) layoutParams).topMargin = 0;
                }
            }
        }
        if (this.igXuih != null) {
            abstractC7522alS.EZpvd().getLayoutParams().height = this.igXuih.intValue();
            abstractC7522alS.OLrzqt().getLayoutParams().height = this.igXuih.intValue();
            if (this.igXuih.intValue() == 0) {
                ViewGroup.LayoutParams layoutParams2 = abstractC7522alS.copydefault().getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    ((LinearLayout.LayoutParams) layoutParams2).topMargin = 0;
                }
            }
        }
        abstractC7522alS.setPointerDirection(this.fERRXa.intValue());
        abstractC7522alS.setChartView(this.iwGUEr);
        return abstractC7522alS;
    }

    @InterfaceC60044zuT
    public LuaValue[] setShadowMarkerView(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 5) {
            if (luaValueArr[0].isNil()) {
                C7833arL.valueOf("call addView(nil)!", this.globals);
                return null;
            }
            this.DLWbHP = ((UDView) luaValueArr[0]).f_();
            AbstractC7522alS abstractC7522alSOLrzqt = OLrzqt();
            UDSize uDSize = (UDSize) luaValueArr[1];
            float fCopydefault = C7865arr.copydefault(luaValueArr[2].toFloat());
            float f = luaValueArr[3].toFloat();
            float fCopydefault2 = C7865arr.copydefault(luaValueArr[4].toFloat());
            if (uDSize.AEQbTJ() != null) {
                abstractC7522alSOLrzqt.setShadow(f, fCopydefault, uDSize.AEQbTJ(), fCopydefault2);
            }
            this.iwGUEr.setMarker(abstractC7522alSOLrzqt);
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setArrowColor(LuaValue[] luaValueArr) {
        this.spnCvw = ((UDColor) luaValueArr[0]).AEQbTJ();
        this.copydefault = ((UDColor) luaValueArr[1]).AEQbTJ();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setArrowImage(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        LuaValue luaValue2;
        if (luaValueArr.length == 1 && (luaValue2 = luaValueArr[0]) != null) {
            UDImageInfo uDImageInfo = (UDImageInfo) luaValue2;
            this.hDKMBd = uDImageInfo.EZpvd();
            uDImageInfo.destroy();
        }
        if (luaValueArr.length == 2 && (luaValue = luaValueArr[0]) != null && luaValueArr[1] != null && !(luaValue instanceof LuaNil)) {
            UDImageInfo uDImageInfo2 = (UDImageInfo) luaValue;
            this.hDKMBd = uDImageInfo2.EZpvd();
            uDImageInfo2.destroy();
        }
        return LuaValue.varargsOf(this);
    }

    private void EZpvd(Drawable drawable, ImageView imageView) {
        imageView.setImageDrawable(drawable);
    }

    public void EZpvd(final JDImageInfo jDImageInfo, final ImageView imageView) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            copydefault(jDImageInfo, imageView);
        } else {
            C7840arS.copydefault(new Runnable() { // from class: com.immomo.mls.fun.ui.custom.OkCombinedChart.4
                @Override // java.lang.Runnable
                public void run() {
                    OkCombinedChart.this.copydefault(jDImageInfo, imageView);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void copydefault(JDImageInfo jDImageInfo, ImageView imageView) {
        Context contextAubY = AubY();
        if (contextAubY == null) {
            return;
        }
        boolean zIsNetUrl = jDImageInfo.isNetUrl();
        if (!zIsNetUrl && !TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
            EZpvd(C7323ahf.AYXKKw().KWHzl(contextAubY, jDImageInfo), imageView);
        } else {
            if (zIsNetUrl || !TextUtils.isEmpty(jDImageInfo.getLocalUrl())) {
                return;
            }
            EZpvd((Drawable) null, imageView);
        }
    }

    public final LineData EZpvd(List list, List list2, String str) {
        LineData lineData = new LineData();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new Entry(Float.parseFloat(list.get(i).toString()), Float.parseFloat(list2.get(i).toString())));
        }
        LineDataSet lineDataSet = new LineDataSet(arrayList, str);
        lineDataSet.setMode(this.getFieldNames);
        lineDataSet.setDrawHorizontalHighlightIndicator(this.AEQbTJ);
        lineDataSet.setDrawVerticalHighlightIndicator(this.KWHzl);
        lineDataSet.enableDashedHighlightLine(Utils.convertDpToPixel(this.valueOf), Utils.convertDpToPixel(this.AYXKKw), Utils.convertDpToPixel(this.djBIcL));
        float f = this.AhwBna;
        if (f > 0.0f) {
            lineDataSet.setHighlightLineWidth(f);
        }
        JColor jColor = this.getNewProxyInstance;
        if (jColor != null) {
            lineDataSet.setHighLightColor(jColor.getColor(this.globals));
        }
        lineDataSet.setDrawValues(true);
        lineDataSet.setValueTextSize(this.dUDNAs);
        JColor jColor2 = this.USBtdM;
        if (jColor2 != null) {
            lineDataSet.setValueTextColor(jColor2.getColor(this.globals));
        }
        lineDataSet.setDrawFilled(this.AxsJAY);
        lineDataSet.setDrawCircles(this.AwvSrB);
        if (arrayList.size() == 1) {
            lineDataSet.setDrawCircles(true);
        }
        float f2 = this.wlaJM;
        if (f2 > 0.0f) {
            lineDataSet.setCircleRadius(f2);
        }
        float f3 = this.AuCTelauCTel;
        if (f3 > 0.0f) {
            lineDataSet.setCircleHoleRadius(f3);
        }
        float f4 = this.OFhtUX;
        if (f4 > 0.0f) {
            lineDataSet.setLineWidth(f4);
        }
        JColor jColor3 = this.gHZMYf;
        if (jColor3 != null) {
            lineDataSet.setColor(jColor3.getColor(this.globals));
        }
        int[] iArr = this.OHqIaq;
        if (iArr != null && iArr.length > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
            gradientDrawable.setColors(this.OHqIaq);
            lineDataSet.setFillDrawable(gradientDrawable);
        }
        JColor jColor4 = this.QOLQEE;
        if (jColor4 != null) {
            lineDataSet.setFillColor(jColor4.getColor(this.globals));
        }
        JColor jColor5 = this.zsXlph;
        if (jColor5 != null) {
            lineDataSet.setCircleColor(jColor5.getColor(this.globals));
        }
        JColor jColor6 = this.zLjUOn;
        if (jColor6 != null) {
            lineDataSet.setCircleHoleColor(jColor6.getColor(this.globals));
        }
        lineDataSet.setDrawValues(this.sSMYrx);
        lineDataSet.setDrawCircleHole(this.zuBGHE);
        lineDataSet.setAxisDependency(YAxis.AxisDependency.LEFT);
        lineData.addDataSet(lineDataSet);
        return lineData;
    }

    public final BarData OLrzqt(List list, List list2, String str) {
        BarData barData = new BarData();
        float f = this.ejfBZ;
        if (f > 0.0f) {
            barData.setBarWidth(f);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new BarEntry(Float.parseFloat(list.get(i).toString()), Float.parseFloat(list2.get(i).toString())));
        }
        BarDataSet barDataSet = new BarDataSet(arrayList, str);
        JColor jColor = this.AkhnZx;
        if (jColor != null) {
            barDataSet.setColor(jColor.getColor(this.globals));
        }
        List<Integer> list3 = this.fetchVPNInfo;
        if (list3 != null) {
            barDataSet.setColors(list3);
        }
        barDataSet.setHighlightEnabled(false);
        JColor jColor2 = this.values;
        if (jColor2 != null) {
            barDataSet.setHighLightColor(jColor2.getColor(this.globals));
        }
        barDataSet.setValueTextSize(this.fIwbmz);
        JColor jColor3 = this.isConnected;
        if (jColor3 != null) {
            barDataSet.setValueTextColor(jColor3.getColor(this.globals));
        }
        barDataSet.setHighlightEnabled(this.DbNXlk);
        barDataSet.setDrawValues(this.QwvEab);
        barDataSet.setAxisDependency(YAxis.AxisDependency.RIGHT);
        barData.addDataSet(barDataSet);
        return barData;
    }

    @Override // com.immomo.mls.fun.ud.view.UDView
    @InterfaceC60044zuT
    public LuaValue[] bgColor(LuaValue[] luaValueArr) {
        this.iwGUEr.setBackgroundColor(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals));
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] touchEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.iwGUEr.setTouchEnabled(luaValue.toBoolean());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] dragEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.iwGUEr.setDragEnabled(luaValue.toBoolean());
            return LuaValue.varargsOf(this);
        }
        return LuaValue.rBoolean(this.iwGUEr.isDragEnabled());
    }

    @InterfaceC60044zuT
    public LuaValue[] scaleXEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.iwGUEr.setScaleXEnabled(luaValue.toBoolean());
            return LuaValue.varargsOf(this);
        }
        return LuaValue.rBoolean(this.iwGUEr.isScaleXEnabled());
    }

    @InterfaceC60044zuT
    public LuaValue[] scaleYEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.iwGUEr.setScaleYEnabled(luaValue.toBoolean());
            return LuaValue.varargsOf(this);
        }
        return LuaValue.rBoolean(this.iwGUEr.isScaleYEnabled());
    }

    @InterfaceC60044zuT
    public LuaValue[] pinchZoomEnabled(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr.length == 1 && (luaValue = luaValueArr[0]) != null) {
            this.iwGUEr.setPinchZoom(luaValue.toBoolean());
            return LuaValue.varargsOf(this);
        }
        return LuaValue.rBoolean(this.iwGUEr.isPinchZoomEnabled());
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawGridBackgroundEnabled(LuaValue[] luaValueArr) {
        this.iwGUEr.setDrawGridBackground(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setGridBackgroundColor(LuaValue[] luaValueArr) {
        this.iwGUEr.setGridBackgroundColor(luaValueArr[0].toInt());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXGranularityEnabled(LuaValue[] luaValueArr) {
        this.iwGUEr.getXAxis().setGranularityEnabled(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLeftGranularityEnabled(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisLeft().setGranularityEnabled(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setRightGranularityEnabled(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisLeft().setGranularityEnabled(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawBordersEnabled(LuaValue[] luaValueArr) {
        this.iwGUEr.setDrawBorders(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLeftAxisEnabled(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisLeft().setEnabled(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setRightAxisEnabled(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisRight().setEnabled(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] animateX(LuaValue[] luaValueArr) {
        this.iwGUEr.animateX(luaValueArr[0].toInt());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] animateXY(LuaValue[] luaValueArr) {
        this.iwGUEr.animateXY(luaValueArr[0].toInt(), luaValueArr[1].toInt());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] animateY(LuaValue[] luaValueArr) {
        this.iwGUEr.animateY(luaValueArr[0].toInt());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLegendEnabled(LuaValue[] luaValueArr) {
        this.iwGUEr.getLegend().setEnabled(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXLabelCount(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 1) {
            this.iwGUEr.getXAxis().setLabelCount(luaValueArr[0].toInt(), luaValueArr[1].toBoolean());
        } else {
            this.iwGUEr.getXAxis().setLabelCount(luaValueArr[0].toInt());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLeftLabelCount(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 1) {
            this.iwGUEr.getAxisLeft().setLabelCount(luaValueArr[0].toInt(), luaValueArr[1].toBoolean());
        } else {
            this.iwGUEr.getAxisLeft().setLabelCount(luaValueArr[0].toInt());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setRightLabelCount(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 1) {
            this.iwGUEr.getAxisRight().setLabelCount(luaValueArr[0].toInt(), luaValueArr[1].toBoolean());
        } else {
            this.iwGUEr.getAxisRight().setLabelCount(luaValueArr[0].toInt());
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawLeftAxisLineEnabled(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisLeft().setDrawAxisLine(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawRightAxisLineEnabled(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisRight().setDrawAxisLine(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXGridDashedLine(LuaValue[] luaValueArr) {
        this.iwGUEr.getXAxis().enableGridDashedLine(luaValueArr[0].toFloat(), luaValueArr[1].toFloat(), luaValueArr[2].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setYGridDashedLine(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisLeft().enableGridDashedLine(luaValueArr[0].toFloat(), luaValueArr[1].toFloat(), luaValueArr[2].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXAxisMaximum(LuaValue[] luaValueArr) {
        this.iwGUEr.getXAxis().setAxisMaximum(luaValueArr[0].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXAxisMinimum(LuaValue[] luaValueArr) {
        this.iwGUEr.getXAxis().setAxisMinimum(luaValueArr[0].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLeftAxisMaximum(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisLeft().setAxisMaximum(luaValueArr[0].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLeftAxisMinimum(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisLeft().setAxisMinimum(luaValueArr[0].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setRightAxisMaximum(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisRight().setAxisMaximum(luaValueArr[0].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setRightAxisMinimum(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisRight().setAxisMinimum(luaValueArr[0].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawXAxisLineEnabled(LuaValue[] luaValueArr) {
        this.iwGUEr.getXAxis().setDrawAxisLine(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawXGridLinesEnabled(LuaValue[] luaValueArr) {
        this.iwGUEr.getXAxis().setDrawGridLines(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawXAxisEnabled(LuaValue[] luaValueArr) {
        this.iwGUEr.getXAxis().setEnabled(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawXAxisLabelsEnabled(LuaValue[] luaValueArr) {
        this.iwGUEr.getXAxis().setDrawLabels(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawLeftGridLinesEnabled(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisLeft().setDrawGridLines(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawRightGridLinesEnabled(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisRight().setDrawGridLines(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXAxisPosition(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0) {
            int i = luaValueArr[0].toInt();
            if (i == 0) {
                this.iwGUEr.getXAxis().setPosition(XAxis.XAxisPosition.TOP);
            } else if (i == 1) {
                this.iwGUEr.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
            } else if (i == 2) {
                this.iwGUEr.getXAxis().setPosition(XAxis.XAxisPosition.BOTH_SIDED);
            } else if (i == 3) {
                this.iwGUEr.getXAxis().setPosition(XAxis.XAxisPosition.TOP_INSIDE);
            } else if (i == 4) {
                this.iwGUEr.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM_INSIDE);
            }
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setMode(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 0) {
            int i = luaValueArr[0].toInt();
            if (i == 0) {
                this.getFieldNames = LineDataSet.Mode.LINEAR;
            } else if (i == 1) {
                this.getFieldNames = LineDataSet.Mode.STEPPED;
            } else if (i == 2) {
                this.getFieldNames = LineDataSet.Mode.CUBIC_BEZIER;
            } else if (i == 3) {
                this.getFieldNames = LineDataSet.Mode.HORIZONTAL_BEZIER;
            }
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLineData(LuaValue[] luaValueArr) {
        LuaValue luaValue = luaValueArr[0];
        if (luaValue instanceof LuaTable) {
            List listCopydefault = C7910asj.copydefault((LuaTable) luaValue);
            luaValueArr[0].destroy();
            List listCopydefault2 = C7910asj.copydefault((LuaTable) luaValueArr[1]);
            luaValueArr[1].destroy();
            String javaString = luaValueArr[2].toJavaString();
            CombinedData combinedData = new CombinedData();
            combinedData.setData(EZpvd(listCopydefault, listCopydefault2, javaString));
            this.iwGUEr.setData(combinedData);
            float f = this.htlTjW;
            if (f > 0.001f) {
                this.iwGUEr.setVisibleXRangeMinimum(f);
            }
            this.iwGUEr.notifyDataSetChanged();
            this.iwGUEr.invalidate();
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLineAndBarChartData(LuaValue[] luaValueArr) {
        LuaValue luaValue = luaValueArr[0];
        if (luaValue instanceof LuaTable) {
            List listCopydefault = C7910asj.copydefault((LuaTable) luaValue);
            luaValueArr[0].destroy();
            List listCopydefault2 = C7910asj.copydefault((LuaTable) luaValueArr[1]);
            luaValueArr[1].destroy();
            List listCopydefault3 = C7910asj.copydefault((LuaTable) luaValueArr[2]);
            luaValueArr[2].destroy();
            String javaString = luaValueArr[3].toJavaString();
            String javaString2 = luaValueArr[4].toJavaString();
            CombinedData combinedData = new CombinedData();
            combinedData.setData(EZpvd(listCopydefault, listCopydefault2, javaString));
            combinedData.setData(OLrzqt(listCopydefault, listCopydefault3, javaString2));
            this.iwGUEr.getXAxis().setAxisMinimum(combinedData.getXMin() + this.fJNWhG);
            this.iwGUEr.getXAxis().setAxisMaximum(combinedData.getXMax() + this.AuCTel);
            this.iwGUEr.setData(combinedData);
            float f = this.htlTjW;
            if (f > 0.001f) {
                this.iwGUEr.setVisibleXRangeMinimum(f);
            }
            this.iwGUEr.notifyDataSetChanged();
            this.iwGUEr.invalidate();
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawHorizontalHighlightIndicatorEnabled(LuaValue[] luaValueArr) {
        this.AEQbTJ = luaValueArr[0].toBoolean();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawVerticalHighlightIndicatorEnabled(LuaValue[] luaValueArr) {
        this.KWHzl = luaValueArr[0].toBoolean();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setHighLightColor(LuaValue[] luaValueArr) {
        this.getNewProxyInstance = ((UDColor) luaValueArr[0]).AEQbTJ();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setBarHighLightColor(LuaValue[] luaValueArr) {
        this.values = ((UDColor) luaValueArr[0]).AEQbTJ();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setValueFont(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 2 && luaValueArr[1] != null) {
            this.aUsmxb = C7829arH.KWHzl.AEQbTJ(luaValueArr[0].toJavaString(), AubY());
            this.dUDNAs = (float) luaValueArr[1].toDouble();
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setVisibleXRangeMinimum(LuaValue[] luaValueArr) {
        this.htlTjW = luaValueArr[0].toFloat();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setValueTextColor(LuaValue[] luaValueArr) {
        this.USBtdM = ((UDColor) luaValueArr[0]).AEQbTJ();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawFilledEnabled(LuaValue[] luaValueArr) {
        this.AxsJAY = luaValueArr[0].toBoolean();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawValuesEnabled(LuaValue[] luaValueArr) {
        this.sSMYrx = luaValueArr[0].toBoolean();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawCircleHoleEnabled(LuaValue[] luaValueArr) {
        this.zuBGHE = luaValueArr[0].toBoolean();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawCirclesEnabled(LuaValue[] luaValueArr) {
        this.AwvSrB = luaValueArr[0].toBoolean();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLineWidth(LuaValue[] luaValueArr) {
        this.OFhtUX = luaValueArr[0].toInt();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setCircleRadius(LuaValue[] luaValueArr) {
        this.wlaJM = luaValueArr[0].toFloat();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setCircleRadius2(LuaValue[] luaValueArr) {
        this.AubY = luaValueArr[0].toFloat();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setCircleColor(LuaValue[] luaValueArr) {
        this.zsXlph = ((UDColor) luaValueArr[0]).AEQbTJ();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setCircleHoleColor(LuaValue[] luaValueArr) {
        this.zLjUOn = ((UDColor) luaValueArr[0]).AEQbTJ();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setCircleHoleRadius(LuaValue[] luaValueArr) {
        this.AuCTelauCTel = luaValueArr[0].toFloat();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setColor(LuaValue[] luaValueArr) {
        this.gHZMYf = ((UDColor) luaValueArr[0]).AEQbTJ();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXAxisGridColor(LuaValue[] luaValueArr) {
        this.iwGUEr.getXAxis().setGridColor(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals));
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXAxisLineColor(LuaValue[] luaValueArr) {
        this.iwGUEr.getXAxis().setAxisLineColor(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals));
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXAxisTextColor(LuaValue[] luaValueArr) {
        this.iwGUEr.getXAxis().setTextColor(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals));
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLeftAxisTextColor(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisLeft().setTextColor(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals));
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setRightAxisTextColor(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisRight().setTextColor(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals));
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLeftGridColor(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisLeft().setGridColor(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals));
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setRightGridColor(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisRight().setGridColor(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals));
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLeftAxisLineColor(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisLeft().setAxisLineColor(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals));
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setFillColor(LuaValue[] luaValueArr) {
        this.QOLQEE = ((UDColor) luaValueArr[0]).AEQbTJ();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setMarkerCallback(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            this.QVsKAR = luaValue.toLuaFunction();
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXValueFormatter(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            this.fdOvFl = luaValue.toLuaFunction();
            this.iwGUEr.getXAxis().setValueFormatter(new ValueFormatter() { // from class: com.immomo.mls.fun.ui.custom.OkCombinedChart.5
                @Override // com.github.mikephil.charting.formatter.ValueFormatter
                public String getFormattedValue(float f) {
                    return OkCombinedChart.this.fdOvFl.invoke(LuaValue.varargsOf(LuaNumber.copydefault(f)))[0].toJavaString();
                }
            });
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLeftValueFormatter(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            this.uzCIH = luaValue.toLuaFunction();
            this.iwGUEr.getAxisLeft().setValueFormatter(new ValueFormatter() { // from class: com.immomo.mls.fun.ui.custom.OkCombinedChart.1
                @Override // com.github.mikephil.charting.formatter.ValueFormatter
                public String getFormattedValue(float f) {
                    return OkCombinedChart.this.uzCIH.invoke(LuaValue.varargsOf(LuaNumber.copydefault(f)))[0].toJavaString();
                }
            });
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setRightValueFormatter(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            this.UlJrfe = luaValue.toLuaFunction();
            this.iwGUEr.getAxisRight().setValueFormatter(new ValueFormatter() { // from class: com.immomo.mls.fun.ui.custom.OkCombinedChart.8
                @Override // com.github.mikephil.charting.formatter.ValueFormatter
                public String getFormattedValue(float f) {
                    return OkCombinedChart.this.UlJrfe.invoke(LuaValue.varargsOf(LuaNumber.copydefault(f)))[0].toJavaString();
                }
            });
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXAxisAxisMaximumOffset(LuaValue[] luaValueArr) {
        this.AuCTel = luaValueArr[0].toFloat();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXAxisAxisMinimumOffset(LuaValue[] luaValueArr) {
        this.fJNWhG = luaValueArr[0].toFloat();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setExtraRightOffset(LuaValue[] luaValueArr) {
        this.iwGUEr.setExtraRightOffset(luaValueArr[0].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setExtraLeftOffset(LuaValue[] luaValueArr) {
        this.iwGUEr.setExtraLeftOffset(luaValueArr[0].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setExtraTopOffset(LuaValue[] luaValueArr) {
        this.iwGUEr.setExtraTopOffset(luaValueArr[0].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setExtraBottomOffset(LuaValue[] luaValueArr) {
        this.iwGUEr.setExtraBottomOffset(luaValueArr[0].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setBarWidth(LuaValue[] luaValueArr) {
        this.ejfBZ = luaValueArr[0].toFloat();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setBarColor(LuaValue[] luaValueArr) {
        this.AkhnZx = ((UDColor) luaValueArr[0]).AEQbTJ();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setBarColors(LuaValue[] luaValueArr) {
        this.fetchVPNInfo = copydefault((LuaTable) luaValueArr[0]);
        return LuaValue.varargsOf(this);
    }

    private List<Integer> copydefault(LuaTable luaTable) {
        ArrayList arrayList = new ArrayList();
        InterfaceC60041zuQ<LuaTable.Application> it = luaTable.iterator();
        if (it == null) {
            return arrayList;
        }
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((UDColor) it.next().KWHzl).AEQbTJ().getColor(this.globals)));
        }
        it.AEQbTJ();
        luaTable.destroy();
        return arrayList;
    }

    @InterfaceC60044zuT
    public LuaValue[] setLeftAxisZeroLineEnabled(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisLeft().setDrawZeroLine(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLeftAxisZeroLineColor(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisLeft().setZeroLineColor(((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals));
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLeftAxisZeroLineWidth(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisLeft().setZeroLineWidth(luaValueArr[0].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawLeftAxisLabelsEnabled(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisLeft().setDrawLabels(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setDrawRightAxisLabelsEnabled(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisRight().setDrawLabels(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setBarTextColor(LuaValue[] luaValueArr) {
        this.isConnected = ((UDColor) luaValueArr[0]).AEQbTJ();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setBarTextFont(LuaValue[] luaValueArr) {
        if (luaValueArr.length == 2 && luaValueArr[1] != null) {
            this.fARcdN = C7829arH.KWHzl.AEQbTJ(luaValueArr[0].toJavaString(), AubY());
            this.fIwbmz = (float) luaValueArr[1].toDouble();
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setShowBarValues(LuaValue[] luaValueArr) {
        this.QwvEab = luaValueArr[0].toBoolean();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setShowRightAxis(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisRight().setEnabled(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setShowLeftAxis(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisLeft().setEnabled(luaValueArr[0].toBoolean());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setBarHighlightEnabled(LuaValue[] luaValueArr) {
        this.DbNXlk = luaValueArr[0].toBoolean();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLeftAxisGridLineWidth(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisLeft().setAxisLineWidth(luaValueArr[0].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setRightAxisGridLineWidth(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisRight().setAxisLineWidth(luaValueArr[0].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLineChartDataSets(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length == 2) {
            CombinedData combinedData = new CombinedData();
            List listCopydefault = C7910asj.copydefault(luaValueArr[0].toLuaTable());
            LineData lineData = new LineData();
            if (listCopydefault.size() > 0) {
                Iterator it = listCopydefault.iterator();
                while (it.hasNext()) {
                    lineData.addDataSet((LineDataSet) it.next());
                }
            }
            combinedData.setData(lineData);
            List<BarDataSet> listCopydefault2 = C7910asj.copydefault(luaValueArr[1].toLuaTable());
            BarData barData = new BarData();
            if (listCopydefault2.size() > 0) {
                for (BarDataSet barDataSet : listCopydefault2) {
                    List<Integer> list = this.fetchVPNInfo;
                    if (list != null) {
                        barDataSet.setColors(list);
                    }
                    barData.addDataSet(barDataSet);
                    if (barDataSet instanceof C7505alB) {
                        C7505alB c7505alB = (C7505alB) barDataSet;
                        if (c7505alB.AEQbTJ() > 0.0f || c7505alB.KWHzl() > 0.0f) {
                            this.iwGUEr.setUseLuaBarChartRenderer(true);
                        }
                    }
                }
            }
            float f = this.ejfBZ;
            if (f > 0.0f) {
                barData.setBarWidth(f);
            }
            combinedData.setData(barData);
            this.iwGUEr.getXAxis().setAxisMinimum(combinedData.getXMin() + this.fJNWhG);
            this.iwGUEr.getXAxis().setAxisMaximum(combinedData.getXMax() + this.AuCTel);
            this.iwGUEr.setData(combinedData);
            float f2 = this.htlTjW;
            if (f2 > 0.001f) {
                this.iwGUEr.setVisibleXRangeMinimum(f2);
            }
            this.iwGUEr.notifyDataSetChanged();
            this.iwGUEr.invalidate();
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXAxisLabelRotationAngle(LuaValue[] luaValueArr) {
        this.iwGUEr.getXAxis().setLabelRotationAngle(luaValueArr[0].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXAxisLabelYOffset(LuaValue[] luaValueArr) {
        this.iwGUEr.getXAxis().setYOffset(luaValueArr[0].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setXAxisLabelXOffset(LuaValue[] luaValueArr) {
        this.iwGUEr.getXAxis().setXOffset(luaValueArr[0].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLeftAxisLabelYOffset(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisLeft().setYOffset(luaValueArr[0].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLeftAxisLabelXOffset(LuaValue[] luaValueArr) {
        this.iwGUEr.getAxisLeft().setXOffset(luaValueArr[0].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setFillColors(LuaValue[] luaValueArr) {
        if (luaValueArr.length > 1) {
            this.OHqIaq = new int[]{((UDColor) luaValueArr[0]).AEQbTJ().getColor(this.globals), ((UDColor) luaValueArr[1]).AEQbTJ().getColor(this.globals)};
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setOutLineColor(LuaValue[] luaValueArr) {
        this.QCjLjM = ((UDColor) luaValueArr[0]).AEQbTJ();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setOutLineColor2(LuaValue[] luaValueArr) {
        this.QSLkRj = ((UDColor) luaValueArr[0]).AEQbTJ();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setOutLineCenterColor(LuaValue[] luaValueArr) {
        this.OJuSTm = ((UDColor) luaValueArr[0]).AEQbTJ();
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] highlightValueX(LuaValue[] luaValueArr) {
        if (luaValueArr != null && luaValueArr.length == 4) {
            Highlight highlight = new Highlight(luaValueArr[0].toFloat(), luaValueArr[1].toFloat(), luaValueArr[2].toInt());
            highlight.setDataIndex(luaValueArr[3].toInt());
            if (this.iwGUEr.getData() != 0) {
                this.iwGUEr.highlightValue(highlight);
            }
        } else {
            this.iwGUEr.highlightValue(null);
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setMaximumScaleX(LuaValue[] luaValueArr) {
        this.iwGUEr.getViewPortHandler().setMaximumScaleX(luaValueArr[0].toFloat());
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setMarkerCancelSelectCallback(LuaValue[] luaValueArr) {
        LuaValue luaValue;
        if (luaValueArr != null && luaValueArr.length > 0 && (luaValue = luaValueArr[0]) != null) {
            this.OxVOHk = luaValue.toLuaFunction();
        }
        this.iwGUEr.setOnChartValueSelectedListener(new OnChartValueSelectedListener() { // from class: com.immomo.mls.fun.ui.custom.OkCombinedChart.9
            @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
            public void onValueSelected(Entry entry, Highlight highlight) {
            }

            @Override // com.github.mikephil.charting.listener.OnChartValueSelectedListener
            public void onNothingSelected() {
                if (OkCombinedChart.this.OxVOHk != null) {
                    OkCombinedChart.this.OxVOHk.invoke(LuaValue.varargsOf(LuaNumber.valueOf(-1)));
                }
            }
        });
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setMarkerEndPanningCallback(LuaValue[] luaValueArr) {
        if (luaValueArr != null) {
            try {
                if (luaValueArr.length > 0) {
                    this.iwGUEr.setMarkerEndPanningCallback(luaValueArr[0].toLuaFunction());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setHighlightPerTapEnabled(LuaValue[] luaValueArr) {
        if (luaValueArr != null) {
            try {
                if (luaValueArr.length > 0) {
                    this.iwGUEr.setHighlightPerTapEnabled(luaValueArr[0].toBoolean());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setUseLongPressGestureEnabled(LuaValue[] luaValueArr) {
        if (luaValueArr != null) {
            try {
                if (luaValueArr.length > 0) {
                    this.iwGUEr.setUseLongPressGestureEnabled(luaValueArr[0].toBoolean());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] lineCapType(LuaValue[] luaValueArr) {
        if (luaValueArr != null) {
            try {
                if (luaValueArr.length > 0) {
                    this.iwGUEr.EZpvd(luaValueArr[0].toInt());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setLineShadowWithColor(LuaValue[] luaValueArr) {
        if (luaValueArr != null) {
            try {
                if (luaValueArr.length == 4) {
                    UDColor uDColor = (UDColor) luaValueArr[0];
                    this.iwGUEr.setLineShadowWithColor(uDColor.AEQbTJ().getColor(this.globals), luaValueArr[1].toFloat(), luaValueArr[2].toFloat(), luaValueArr[3].toFloat());
                    uDColor.destroy();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return LuaValue.varargsOf(this);
    }

    @InterfaceC60044zuT
    public LuaValue[] setCGLayerWithColor(LuaValue[] luaValueArr) {
        if (luaValueArr != null) {
            try {
                if (luaValueArr.length == 6) {
                    UDColor uDColor = (UDColor) luaValueArr[0];
                    this.iwGUEr.setCGLayerWithColor(uDColor.AEQbTJ().getColor(this.globals), luaValueArr[3].toInt(), luaValueArr[4].toInt(), luaValueArr[5].toInt());
                    uDColor.destroy();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return LuaValue.varargsOf(this);
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void copydefault() {
        super.copydefault();
    }

    @Override // com.immomo.mls.fun.ud.view.UDView, o.InterfaceC7383aim.ActionBar
    public void AEQbTJ() {
        super.AEQbTJ();
    }

    @Override // org.luaj.vm2.LuaUserdata, org.luaj.vm2.NLuaValue, org.luaj.vm2.LuaValue
    public void destroy() {
        super.destroy();
    }
}
