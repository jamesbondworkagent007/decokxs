package o;

import android.graphics.RectF;
import androidx.camera.video.AudioStats;
import com.google.gson.Gson;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.data.DrawLineBean;
import com.okinc.kline.data.PriceWarningItemBean;
import com.okinc.kline.library.data.DataSource;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.rxutils.RxBus;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C36250oUv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oWZ extends oWO {
    public static final Application Companion = new Application(null);
    public static final int djBIcL = 8;
    public int AkhnZx;
    public java.util.ArrayList<DrawLineData.Dot> DbNXlk;
    public boolean ejfBZ;
    public android.view.VelocityTracker fIwbmz;
    public boolean fJNWhG;
    public boolean fetchVPNInfo;
    public int gEmmrt;
    public C36312oXc isConnected;
    public boolean values;

    private final boolean EZpvd(float f, float f2, float f3, float f4, float f5) {
        float f6 = f - f3;
        float f7 = f2 - f4;
        return (f6 * f6) + (f7 * f7) <= f5 * f5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.oWO
    public java.lang.String KWHzl() {
        return "stateDrawingAndIdle";
    }

    public oWZ(@NotNull C36312oXc c36312oXc) {
        C36250oUv.TaskDescription taskDescriptionAuCTel;
        Intrinsics.checkNotNullParameter(c36312oXc, "");
        this.isConnected = c36312oXc;
        this.DbNXlk = new java.util.ArrayList<>();
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.OLrzqt(new Function1() { // from class: o.oWW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oWZ.OLrzqt((java.util.ArrayList) obj);
            }
        });
        if (drawLineData.valueOf() != null) {
            this.DbNXlk.clear();
            C36246oUr.copydefault().AhwBna();
            C36250oUv c36250oUvDbNXlk = this.isConnected.DbNXlk();
            if (c36250oUvDbNXlk != null && (taskDescriptionAuCTel = c36250oUvDbNXlk.AuCTel()) != null) {
                taskDescriptionAuCTel.AEQbTJ();
            }
            gEmmrt();
        }
    }

    @Override // o.oWO
    public boolean AkhnZx(@NotNull android.view.MotionEvent motionEvent) {
        C36250oUv c36250oUvDbNXlk;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        this.fJNWhG = false;
        this.fetchVPNInfo = true;
        if (motionEvent.getPointerCount() <= 2 && (c36250oUvDbNXlk = this.isConnected.DbNXlk()) != null) {
            c36250oUvDbNXlk.EZpvd(false);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x036f, code lost:
    
        if (r2 != false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04d9  */
    @Override // o.oWO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean AhwBna(@NotNull android.view.MotionEvent motionEvent) {
        java.util.ArrayList<DrawLineData.DrawLineItem> arrayList;
        int i;
        DrawLineData.DrawLineItem drawLineItemIsConnected;
        DataSource.DataArrayList<DataSource.StateListAnimator> dataArrayList;
        int i2;
        int i3;
        int i4;
        java.util.ArrayList<DrawLineData.DrawLineItem> arrayList2;
        java.lang.Integer num;
        int i5;
        java.util.ArrayList<DrawLineData.Dot> dotList;
        DrawLineData.Dot dot;
        java.util.ArrayList<DrawLineData.Dot> dotList2;
        DrawLineData.Dot dot2;
        java.util.ArrayList<DrawLineData.Dot> dotList3;
        DrawLineData.Dot dot3;
        java.util.ArrayList<DrawLineData.Dot> dotList4;
        DrawLineData.Dot dot4;
        java.util.ArrayList<DrawLineData.Dot> dotList5;
        DrawLineData.Dot dot5;
        java.util.ArrayList<DrawLineData.Dot> dotList6;
        DrawLineData.Dot dot6;
        C36250oUv.StateListAnimator stateListAnimatorDbNXlk;
        RectF rectFRJOkX;
        RectF rectFORxRYg;
        RectF rectFAwvSrB;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        super.AhwBna(motionEvent);
        int i6 = 0;
        java.lang.Integer num2 = 0;
        this.isConnected.OLrzqt(false);
        this.fetchVPNInfo = false;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        int i7 = 1;
        if (c36246oUrCopydefault.getNewProxyInstance() == 1 && c36246oUrCopydefault.OLrzqt(motionEvent.getX(), motionEvent.getY()) != null) {
            C36250oUv c36250oUvDbNXlk = this.isConnected.DbNXlk();
            if (c36250oUvDbNXlk != null) {
                c36250oUvDbNXlk.invalidate();
                Unit unit = Unit.INSTANCE;
            }
            oWO owo = this.isConnected.AuCTelauCTel;
            Intrinsics.copydefault(owo, "");
            java.lang.String strEZpvd = c36246oUrCopydefault.OLrzqt(motionEvent.getX(), motionEvent.getY()).EZpvd();
            Intrinsics.checkNotNullExpressionValue(strEZpvd, "");
            ((C36310oXa) owo).OLrzqt(strEZpvd);
            C36312oXc c36312oXc = this.isConnected;
            c36312oXc.EZpvd(c36312oXc.AuCTelauCTel);
            return false;
        }
        c36246oUrCopydefault.AEQbTJ();
        if (c36246oUrCopydefault.iwGUEr().AwvSrB() != null && (rectFAwvSrB = c36246oUrCopydefault.iwGUEr().AwvSrB()) != null && rectFAwvSrB.contains(motionEvent.getX(), motionEvent.getY()) && !c36246oUrCopydefault.OJuSTm() && !Intrinsics.EZpvd((java.lang.Object) c36246oUrCopydefault.gHZMYf(), (java.lang.Object) "NORMAL")) {
            C36250oUv c36250oUvDbNXlk2 = this.isConnected.DbNXlk();
            if (c36250oUvDbNXlk2 != null) {
                c36250oUvDbNXlk2.invalidate();
                Unit unit2 = Unit.INSTANCE;
            }
            c36246oUrCopydefault.iwGUEr().KWHzl((RectF) null);
            c36246oUrCopydefault.EZpvd(5);
            c36246oUrCopydefault.iwGUEr().KWHzl("Click");
            C36246oUr.copydefault().fIwbmz("XMove");
            c36246oUrCopydefault.EZpvd(true);
            if (c36246oUrCopydefault.iwGUEr().fZBcTu()) {
                c36246oUrCopydefault.iwGUEr().EZpvd(false);
                c36246oUrCopydefault.DbNXlk("YScale");
                EZpvd(false);
            } else {
                c36246oUrCopydefault.iwGUEr().EZpvd(true);
                c36246oUrCopydefault.DbNXlk("NORMAL");
                EZpvd(true);
            }
            return false;
        }
        RectF rectFQfsBiF = c36246oUrCopydefault.iwGUEr().QfsBiF();
        if (rectFQfsBiF != null && rectFQfsBiF.contains(motionEvent.getX(), motionEvent.getY())) {
            OLrzqt(this.isConnected, motionEvent);
            this.isConnected.OLrzqt(true);
            return false;
        }
        if (c36246oUrCopydefault.iwGUEr().ORxRYg() != null && (rectFORxRYg = c36246oUrCopydefault.iwGUEr().ORxRYg()) != null && rectFORxRYg.contains(motionEvent.getX(), motionEvent.getY())) {
            copydefault(this.isConnected);
            this.values = true;
            c36246oUrCopydefault.iwGUEr().djBIcL((RectF) null);
            if (c36246oUrCopydefault.zLjUOn().isFastKLineMode() && this.isConnected.DbNXlk() != null) {
                this.isConnected.DbNXlk().UeEOUB();
                return false;
            }
            c36246oUrCopydefault.AhwBna(false);
            C36250oUv c36250oUvDbNXlk3 = this.isConnected.DbNXlk();
            if (c36250oUvDbNXlk3 != null) {
                c36250oUvDbNXlk3.invalidate();
                Unit unit3 = Unit.INSTANCE;
            }
            c36246oUrCopydefault.iwGUEr().KWHzl((RectF) null);
            c36246oUrCopydefault.EZpvd(true);
            c36246oUrCopydefault.iwGUEr().EZpvd(true);
            c36246oUrCopydefault.DbNXlk("NORMAL");
            return false;
        }
        if (c36246oUrCopydefault.QOLQEE() != null && c36246oUrCopydefault.QOLQEE().contains(motionEvent.getX(), motionEvent.getY())) {
            if (this.isConnected.DbNXlk() != null) {
                c36246oUrCopydefault.AEQbTJ((RectF) null);
                copydefault(this.isConnected);
                this.ejfBZ = true;
                RxBus.KWHzl("kline_portrait_normal");
                TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("KLine_Full_Button_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oWX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return oWZ.KWHzl((EventParamsList) obj);
                    }
                });
            }
            return false;
        }
        if (c36246oUrCopydefault.iwGUEr().RJOkX() != null && (rectFRJOkX = c36246oUrCopydefault.iwGUEr().RJOkX()) != null && rectFRJOkX.contains(motionEvent.getX(), motionEvent.getY())) {
            boolean z = SPUtils.getBoolean("hide_kline_drawing_data", false);
            boolean z2 = !z;
            SPUtils.put("hide_kline_drawing_data", java.lang.Boolean.valueOf(z2));
            C36246oUr.copydefault().AkhnZx(z2);
            C36250oUv c36250oUvDbNXlk4 = this.isConnected.DbNXlk();
            if (c36250oUvDbNXlk4 != null) {
                c36250oUvDbNXlk4.invalidate();
                Unit unit4 = Unit.INSTANCE;
            }
            if (!z) {
                RxBus.KWHzl("hide_drawing_line");
            }
            this.values = true;
            return false;
        }
        if (((java.lang.Boolean) valueOf(motionEvent).first).booleanValue()) {
            this.isConnected.copydefault(motionEvent.getX());
            this.isConnected.OLrzqt(motionEvent.getY());
            C36312oXc c36312oXc2 = this.isConnected;
            c36312oXc2.EZpvd(c36312oXc2.gHZMYf);
            return false;
        }
        if (((java.lang.Boolean) gEmmrt(motionEvent).first).booleanValue()) {
            this.isConnected.copydefault(motionEvent.getX());
            this.isConnected.OLrzqt(motionEvent.getY());
            C36312oXc c36312oXc3 = this.isConnected;
            c36312oXc3.EZpvd(c36312oXc3.gHZMYf);
            return false;
        }
        if (((java.lang.Boolean) djBIcL(motionEvent).first).booleanValue()) {
            this.isConnected.copydefault(motionEvent.getX());
            this.isConnected.OLrzqt(motionEvent.getY());
            C36312oXc c36312oXc4 = this.isConnected;
            c36312oXc4.EZpvd(c36312oXc4.gHZMYf);
            return false;
        }
        if (((java.lang.Boolean) AEQbTJ(motionEvent).first).booleanValue()) {
            this.isConnected.copydefault(motionEvent.getX());
            this.isConnected.OLrzqt(motionEvent.getY());
            C36312oXc c36312oXc5 = this.isConnected;
            c36312oXc5.EZpvd(c36312oXc5.gHZMYf);
            return false;
        }
        if (((java.lang.Boolean) OLrzqt(motionEvent).first).booleanValue()) {
            this.isConnected.copydefault(motionEvent.getX());
            this.isConnected.OLrzqt(motionEvent.getY());
            C36312oXc c36312oXc6 = this.isConnected;
            c36312oXc6.EZpvd(c36312oXc6.gHZMYf);
            return false;
        }
        if (!c36246oUrCopydefault.iwGUEr().DTwDnp().isEmpty()) {
            int size = c36246oUrCopydefault.iRxXKY().size();
            boolean z3 = false;
            for (int i8 = 0; i8 < size; i8++) {
                if (c36246oUrCopydefault.iRxXKY().get(i8).getSelected()) {
                    z3 = true;
                }
                c36246oUrCopydefault.iRxXKY().get(i8).setSelected(false);
            }
            java.util.Iterator<Map.Entry<java.lang.Integer, RectF>> it = c36246oUrCopydefault.iwGUEr().DTwDnp().entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry<java.lang.Integer, RectF> next = it.next();
                    int iIntValue = next.getKey().intValue();
                    if (next.getValue().contains(motionEvent.getX(), motionEvent.getY())) {
                        java.util.List<PriceWarningItemBean> listIRxXKY = c36246oUrCopydefault.iRxXKY();
                        Intrinsics.checkNotNullExpressionValue(listIRxXKY, "");
                        PriceWarningItemBean priceWarningItemBean = (PriceWarningItemBean) CollectionsKt___CollectionsKt.AkhnZx(listIRxXKY, iIntValue);
                        if (priceWarningItemBean != null) {
                            priceWarningItemBean.setSelected(true);
                            Unit unit5 = Unit.INSTANCE;
                        }
                    }
                }
            }
            if (this.isConnected.DbNXlk() != null) {
                this.isConnected.DbNXlk().invalidate();
                this.isConnected.OLrzqt(motionEvent.getY());
                oWO owo2 = this.isConnected.zsXlph;
                if (owo2 instanceof C36315oXf) {
                    Intrinsics.copydefault(owo2, "");
                    ((C36315oXf) owo2).EZpvd(true);
                }
                C36250oUv c36250oUvDbNXlk5 = this.isConnected.DbNXlk();
                if (c36250oUvDbNXlk5 != null && (stateListAnimatorDbNXlk = c36250oUvDbNXlk5.DbNXlk()) != null) {
                    stateListAnimatorDbNXlk.OLrzqt(new PriceWarningItemBean((java.lang.String) null, 0, (java.lang.String) null, 0, 0, (java.lang.String) null, 0L, false, 0, false, 0, 2047, (DefaultConstructorMarker) null), "force");
                    Unit unit6 = Unit.INSTANCE;
                }
                C36312oXc c36312oXc7 = this.isConnected;
                c36312oXc7.EZpvd(c36312oXc7.zsXlph);
            }
            this.values = true;
            return false;
        }
        if (((java.lang.Boolean) EZpvd(motionEvent).first).booleanValue()) {
            this.isConnected.copydefault(motionEvent.getX());
            this.isConnected.OLrzqt(motionEvent.getY());
            C36312oXc c36312oXc8 = this.isConnected;
            c36312oXc8.EZpvd(c36312oXc8.gHZMYf);
            return false;
        }
        oWN own = c36246oUrCopydefault.DCJXGO().get("ds0");
        this.isConnected.copydefault(motionEvent.getX());
        this.isConnected.OLrzqt(motionEvent.getY());
        if (this.isConnected.gEmmrt() != null && !this.isConnected.gEmmrt().OLrzqt()) {
            this.isConnected.gEmmrt().EZpvd();
            this.ejfBZ = true;
            this.isConnected.EZpvd(0);
            return false;
        }
        java.util.ArrayList<DrawLineData.DrawLineItem> arrayListDxcTrN = c36246oUrCopydefault.RdAHlO() ? c36246oUrCopydefault.dxcTrN() : DrawLineData.copydefault.EZpvd();
        if (DrawLineData.copydefault.valueOf() == null) {
            com.okinc.kline.library.data.DataSource dataSource = c36246oUrCopydefault.sSMYrx().get("ds0");
            int i9 = -1;
            if (dataSource == null || (dataArrayList = dataSource.AEQbTJ) == null || dataArrayList.size() <= 1) {
                arrayList = arrayListDxcTrN;
                i = -1;
            } else {
                int size2 = arrayListDxcTrN.size();
                int i10 = -1;
                int i11 = 0;
                while (i11 < size2) {
                    arrayListDxcTrN.get(i11).setSelected(i9);
                    oUU ouu = oUU.copydefault;
                    if (ouu.copydefault(motionEvent, arrayListDxcTrN.get(i11).getLinePositionList()) < AudioStats.AUDIO_AMPLITUDE_NONE || arrayListDxcTrN.get(i11).isDelete()) {
                        i2 = i10;
                    } else {
                        arrayListDxcTrN.get(i11).getLineType().getStrName();
                        if (i10 < 0 || ouu.copydefault(motionEvent, arrayListDxcTrN.get(i11).getLinePositionList()) < ouu.copydefault(motionEvent, arrayListDxcTrN.get(i10).getLinePositionList())) {
                            i2 = i11;
                        }
                    }
                    if (arrayListDxcTrN.get(i11).getLineType() != DrawLineData.LineType.G_CIRCLE || i2 >= 0) {
                        i3 = i11;
                        i4 = size2;
                        arrayList2 = arrayListDxcTrN;
                        num = num2;
                        i5 = -1;
                    } else {
                        arrayListDxcTrN.get(i11).getLineType().getStrName();
                        DrawLineData.DrawLineItem drawLineItem = arrayListDxcTrN.get(i11);
                        float fFloatValue = ((drawLineItem == null || (dotList6 = drawLineItem.getDotList()) == null || (dot6 = dotList6.get(i6)) == null) ? num2 : java.lang.Double.valueOf(dot6.getX())).floatValue();
                        DrawLineData.DrawLineItem drawLineItem2 = arrayListDxcTrN.get(i11);
                        float fFloatValue2 = ((drawLineItem2 == null || (dotList5 = drawLineItem2.getDotList()) == null || (dot5 = dotList5.get(i6)) == null) ? num2 : java.lang.Double.valueOf(dot5.getY())).floatValue();
                        DrawLineData.DrawLineItem drawLineItem3 = arrayListDxcTrN.get(i11);
                        float fFloatValue3 = ((drawLineItem3 == null || (dotList4 = drawLineItem3.getDotList()) == null || (dot4 = dotList4.get(i7)) == null) ? num2 : java.lang.Double.valueOf(dot4.getX())).floatValue();
                        DrawLineData.DrawLineItem drawLineItem4 = arrayListDxcTrN.get(i11);
                        num = num2;
                        double d = 2;
                        float fSqrt = (float) java.lang.Math.sqrt(java.lang.Math.pow(fFloatValue - fFloatValue3, d) + java.lang.Math.pow(fFloatValue2 - ((drawLineItem4 == null || (dotList3 = drawLineItem4.getDotList()) == null || (dot3 = dotList3.get(i7)) == null) ? num2 : java.lang.Double.valueOf(dot3.getY())).floatValue(), d));
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        DrawLineData.DrawLineItem drawLineItem5 = arrayListDxcTrN.get(i11);
                        float fFloatValue4 = ((drawLineItem5 == null || (dotList2 = drawLineItem5.getDotList()) == null || (dot2 = dotList2.get(0)) == null) ? num : java.lang.Double.valueOf(dot2.getX())).floatValue();
                        DrawLineData.DrawLineItem drawLineItem6 = arrayListDxcTrN.get(i11);
                        i3 = i11;
                        i4 = size2;
                        i5 = -1;
                        arrayList2 = arrayListDxcTrN;
                        if (EZpvd(x, y, fFloatValue4, ((drawLineItem6 == null || (dotList = drawLineItem6.getDotList()) == null || (dot = dotList.get(0)) == null) ? num : java.lang.Double.valueOf(dot.getY())).floatValue(), fSqrt)) {
                            i10 = i3;
                        }
                        i11 = i3 + 1;
                        i9 = i5;
                        arrayListDxcTrN = arrayList2;
                        size2 = i4;
                        num2 = num;
                        i6 = 0;
                        i7 = 1;
                    }
                    i10 = i2;
                    i11 = i3 + 1;
                    i9 = i5;
                    arrayListDxcTrN = arrayList2;
                    size2 = i4;
                    num2 = num;
                    i6 = 0;
                    i7 = 1;
                }
                arrayList = arrayListDxcTrN;
                i = i10;
            }
            if (i >= 0 && !C36246oUr.copydefault().QwvEab()) {
                arrayList.get(i).setSelected(0);
                DrawLineData drawLineData = DrawLineData.copydefault;
                drawLineData.KWHzl(arrayList.get(i));
                DrawLineData.DrawLineItem drawLineItemIsConnected2 = drawLineData.isConnected();
                if ((drawLineItemIsConnected2 != null ? drawLineItemIsConnected2.getLineType() : null) == DrawLineData.LineType.G_TRIANGLE && (drawLineItemIsConnected = drawLineData.isConnected()) != null) {
                    drawLineItemIsConnected.setSelected(5);
                    Unit unit7 = Unit.INSTANCE;
                }
                oWO owo3 = this.isConnected.AxsJAY;
                Intrinsics.copydefault(owo3, "");
                ((C36316oXg) owo3).AEQbTJ((DrawLineData.DrawLineItem) new Gson().fromJson(new Gson().toJson(drawLineData.isConnected()), DrawLineData.DrawLineItem.class));
                C36312oXc c36312oXc9 = this.isConnected;
                c36312oXc9.EZpvd(c36312oXc9.AxsJAY);
                C36250oUv c36250oUvDbNXlk6 = this.isConnected.DbNXlk();
                if (c36250oUvDbNXlk6 == null) {
                    return false;
                }
                c36250oUvDbNXlk6.invalidate();
                Unit unit8 = Unit.INSTANCE;
                return false;
            }
            this.isConnected.EZpvd(java.lang.System.currentTimeMillis());
            this.isConnected.copydefault(motionEvent.getX());
            this.isConnected.OLrzqt(motionEvent.getY());
            oWN own2 = c36246oUrCopydefault.DCJXGO().get("ds0");
            if (own2 == null) {
                return true;
            }
            own2.sSMYrx();
            own2.AwvSrB();
            if (this.isConnected.gEmmrt() != null && !this.isConnected.gEmmrt().OLrzqt()) {
                this.isConnected.gEmmrt().EZpvd();
                return false;
            }
            oVT ovt = c36246oUrCopydefault.iwGUEr().values().get("ds0.root");
            Intrinsics.copydefault(ovt);
            ovt.EZpvd((int) motionEvent.getX(), (int) motionEvent.getY());
            if (this.isConnected.DbNXlk() == null) {
                return true;
            }
            C36250oUv c36250oUvDbNXlk7 = this.isConnected.DbNXlk();
            if (c36250oUvDbNXlk7 != null) {
                c36250oUvDbNXlk7.invalidate();
                Unit unit9 = Unit.INSTANCE;
            }
            C36312oXc c36312oXc10 = this.isConnected;
            c36312oXc10.EZpvd(c36312oXc10.gHZMYf);
            return false;
        }
        this.gEmmrt = own != null ? own.getNewProxyInstance() : 0;
        this.AkhnZx = own != null ? own.uzCIH() : 0;
        return false;
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("chart_size_swtich_click", "classic_icon_click", true);
        return Unit.INSTANCE;
    }

    public final void EZpvd(boolean z) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        final java.lang.String str = "a_button";
        C32866mlf.EZpvd("KLine_Yaxis_Reset_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oWY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oWZ.EZpvd(str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("reset_type", str, true);
        return Unit.INSTANCE;
    }

    @Override // o.oWO
    public boolean AYXKKw(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        super.AYXKKw(motionEvent);
        C36312oXc c36312oXc = this.isConnected;
        c36312oXc.EZpvd(c36312oXc.zLjUOn);
        this.ejfBZ = false;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    @Override // o.oWO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean DbNXlk(@NotNull android.view.MotionEvent motionEvent) {
        float fDjBIcL;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (this.values || this.ejfBZ) {
            return false;
        }
        if (Intrinsics.EZpvd(this.isConnected.isConnected(), this.isConnected.wlaJM)) {
            DrawLineData drawLineData = DrawLineData.copydefault;
            if (drawLineData.valueOf() != null) {
                oWN own = C36246oUr.copydefault().DCJXGO().get("ds0");
                if (own != null && this.isConnected.DbNXlk() != null) {
                    float x = motionEvent.getX();
                    float fCopydefault = this.isConnected.copydefault();
                    float y = motionEvent.getY();
                    float fDjBIcL2 = this.isConnected.djBIcL();
                    float newProxyInstance = own.getNewProxyInstance() + (x - fCopydefault);
                    if ((drawLineData.valueOf() == DrawLineData.LineType.H_SEGMENT || drawLineData.valueOf() == DrawLineData.LineType.H_RADIAL) && C33129mqd.KWHzl((java.util.Collection) this.DbNXlk)) {
                        fDjBIcL = C33129mqd.djBIcL(java.lang.Integer.valueOf(own.uzCIH()));
                    } else {
                        fDjBIcL = own.uzCIH() + (y - fDjBIcL2);
                    }
                    if (newProxyInstance < 0.0f) {
                        newProxyInstance = 0.0f;
                    }
                    if (newProxyInstance > this.isConnected.DbNXlk().getWidth()) {
                        newProxyInstance = C33129mqd.djBIcL(java.lang.Integer.valueOf(this.isConnected.DbNXlk().getWidth()));
                    }
                    if (fDjBIcL < 0.0f) {
                        fDjBIcL = 0.0f;
                    }
                    ChartArea chartArea = C36246oUr.copydefault().values().get("ds0.m");
                    int iDjBIcL = chartArea != null ? chartArea.djBIcL() : this.isConnected.DbNXlk().getHeight();
                    if (fDjBIcL > iDjBIcL) {
                        fDjBIcL = C33129mqd.djBIcL(java.lang.Integer.valueOf(iDjBIcL));
                    }
                    this.isConnected.copydefault(motionEvent.getX());
                    this.isConnected.OLrzqt(motionEvent.getY());
                    own.KWHzl(C33129mqd.AhwBna(java.lang.Float.valueOf(newProxyInstance)), C33129mqd.AhwBna(java.lang.Float.valueOf(fDjBIcL)));
                    C36250oUv c36250oUvDbNXlk = this.isConnected.DbNXlk();
                    if (c36250oUvDbNXlk != null) {
                        c36250oUvDbNXlk.invalidate();
                    }
                }
            } else if (!this.fJNWhG && !this.fetchVPNInfo) {
                float x2 = motionEvent.getX();
                float fCopydefault2 = this.isConnected.copydefault();
                java.util.HashMap<java.lang.String, oWN> mapDCJXGO = C36246oUr.copydefault().DCJXGO();
                C36250oUv c36250oUvDbNXlk2 = this.isConnected.DbNXlk();
                oWN own2 = mapDCJXGO.get(c36250oUvDbNXlk2 != null ? c36250oUvDbNXlk2.fIwbmz() : null);
                if (own2 != null) {
                    own2.AhwBna(x2 - fCopydefault2);
                    this.isConnected.copydefault(motionEvent.getX());
                }
                C36250oUv c36250oUvDbNXlk3 = this.isConnected.DbNXlk();
                if (c36250oUvDbNXlk3 != null) {
                    c36250oUvDbNXlk3.invalidate();
                }
                if (this.fIwbmz == null) {
                    this.fIwbmz = android.view.VelocityTracker.obtain();
                }
                android.view.VelocityTracker velocityTracker = this.fIwbmz;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                android.view.VelocityTracker velocityTracker2 = this.fIwbmz;
                if (velocityTracker2 != null) {
                    velocityTracker2.computeCurrentVelocity(1000, this.isConnected.AkhnZx());
                }
                C36312oXc c36312oXc = this.isConnected;
                android.view.VelocityTracker velocityTracker3 = this.fIwbmz;
                java.lang.Integer numValueOf = velocityTracker3 != null ? java.lang.Integer.valueOf((int) velocityTracker3.getXVelocity()) : null;
                Intrinsics.copydefault(numValueOf);
                c36312oXc.EZpvd(numValueOf.intValue());
                C36250oUv c36250oUvDbNXlk4 = this.isConnected.DbNXlk();
                if (c36250oUvDbNXlk4 != null) {
                    c36250oUvDbNXlk4.EZpvd(true);
                }
            } else if (!this.fetchVPNInfo) {
                super.DbNXlk(motionEvent);
                if (this.isConnected.DbNXlk() != null) {
                    float fCopydefault3 = C36326oXq.copydefault(motionEvent);
                    if (java.lang.Math.abs(fCopydefault3 - this.isConnected.fetchVPNInfo()) > android.view.ViewConfiguration.get(this.isConnected.DbNXlk().getContext()).getScaledTouchSlop()) {
                        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
                        oWN own3 = c36246oUrCopydefault.DCJXGO().get("ds0");
                        Intrinsics.copydefault(own3);
                        own3.EZpvd(true);
                        oWN own4 = c36246oUrCopydefault.DCJXGO().get("ds0");
                        Intrinsics.copydefault(own4);
                        own4.EZpvd(fCopydefault3 - this.isConnected.fetchVPNInfo(), fCopydefault3 > this.isConnected.fetchVPNInfo() ? 1 : -1);
                        this.isConnected.EZpvd(fCopydefault3);
                        C36250oUv c36250oUvDbNXlk5 = this.isConnected.DbNXlk();
                        if (c36250oUvDbNXlk5 != null) {
                            c36250oUvDbNXlk5.invalidate();
                        }
                        C36250oUv c36250oUvDbNXlk6 = this.isConnected.DbNXlk();
                        if (c36250oUvDbNXlk6 != null) {
                            c36250oUvDbNXlk6.EZpvd(true);
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // o.oWO
    public boolean values(@NotNull android.view.MotionEvent motionEvent) {
        oWN own;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (motionEvent.getPointerCount() > 2) {
            return true;
        }
        this.isConnected.EZpvd(C36326oXq.copydefault(motionEvent));
        if (this.isConnected.DbNXlk().getContext() != null && this.isConnected.fetchVPNInfo() > android.view.ViewConfiguration.get(r4).getScaledTouchSlop() && (own = C36246oUr.copydefault().DCJXGO().get("ds0")) != null) {
            own.AxsJAY();
            own.OLrzqt(0, 0);
            own.valueOf(own.fJNWhG());
        }
        C36250oUv c36250oUvDbNXlk = this.isConnected.DbNXlk();
        if (c36250oUvDbNXlk != null) {
            c36250oUvDbNXlk.EZpvd(true);
        }
        this.fJNWhG = true;
        return true;
    }

    @Override // o.oWO
    public boolean fetchVPNInfo(@NotNull android.view.MotionEvent motionEvent) {
        long jAhwBna;
        C36250oUv.TaskDescription taskDescriptionAuCTel;
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList<DrawLineData.Dot> arrayList;
        int i;
        boolean z;
        int i2;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (this.values) {
            this.values = false;
            return false;
        }
        if (Intrinsics.EZpvd(this.isConnected.isConnected(), this.isConnected.wlaJM)) {
            DrawLineData drawLineData = DrawLineData.copydefault;
            if (drawLineData.valueOf() != null) {
                oWN own = C36246oUr.copydefault().DCJXGO().get("ds0");
                if (own != null) {
                    if (java.lang.Math.abs(this.gEmmrt - own.getNewProxyInstance()) >= 5 || java.lang.Math.abs(this.AkhnZx - own.uzCIH()) >= 5) {
                        return false;
                    }
                    C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
                    java.util.ArrayList<DrawLineData.DrawLineItem> arrayListDxcTrN = c36246oUrCopydefault.RdAHlO() ? c36246oUrCopydefault.dxcTrN() : drawLineData.EZpvd();
                    oWC owc = c36246oUrCopydefault.iwGUEr().QVAiDq().get("ds0.m");
                    java.util.ArrayList<DrawLineData.Dot> arrayList2 = new java.util.ArrayList<>();
                    com.okinc.kline.library.data.DataSource dataSource = c36246oUrCopydefault.sSMYrx().get("ds0");
                    if ((dataSource != null ? dataSource.AEQbTJ : null) == null || dataSource.AEQbTJ.size() < 2) {
                        return false;
                    }
                    long jKWHzl = pEV.OLrzqt.KWHzl();
                    int iValueOf = own.valueOf(this.gEmmrt);
                    if (iValueOf < 0) {
                        jAhwBna = dataSource.AEQbTJ.get(0).AhwBna() + (jKWHzl * ((long) iValueOf));
                    } else if (iValueOf >= dataSource.AEQbTJ.size()) {
                        DataSource.DataArrayList<DataSource.StateListAnimator> dataArrayList = dataSource.AEQbTJ;
                        jAhwBna = dataArrayList.get(dataArrayList.size() - 1).AhwBna() + (jKWHzl * ((long) ((iValueOf - dataSource.AEQbTJ.size()) + 1)));
                    } else {
                        jAhwBna = dataSource.AEQbTJ.get(iValueOf).AhwBna();
                    }
                    Intrinsics.copydefault(owc);
                    double dEZpvd = owc.EZpvd(this.AkhnZx);
                    if (drawLineData.valueOf() == DrawLineData.LineType.H_LINE || drawLineData.valueOf() == DrawLineData.LineType.PRICE_LINE) {
                        this.DbNXlk.add(OLrzqt(own, owc, iValueOf, jAhwBna, dEZpvd));
                        arrayList2.addAll(this.DbNXlk);
                        java.util.Iterator<DrawLineData.DrawLineItem> it = arrayListDxcTrN.iterator();
                        Intrinsics.checkNotNullExpressionValue(it, "");
                        while (it.hasNext()) {
                            it.next().setSelected(-1);
                        }
                        DrawLineData drawLineData2 = DrawLineData.copydefault;
                        DrawLineData.LineType lineTypeValueOf = drawLineData2.valueOf();
                        Intrinsics.copydefault(lineTypeValueOf);
                        oUJ ouj = oUJ.KWHzl;
                        DrawLineBean drawLineBeanAEQbTJ = ouj.AEQbTJ();
                        java.lang.String coinId = drawLineBeanAEQbTJ != null ? drawLineBeanAEQbTJ.getCoinId() : null;
                        Intrinsics.copydefault((java.lang.Object) coinId);
                        DrawLineBean drawLineBeanAEQbTJ2 = ouj.AEQbTJ();
                        java.lang.Integer type = drawLineBeanAEQbTJ2 != null ? drawLineBeanAEQbTJ2.getType() : null;
                        Intrinsics.copydefault(type);
                        arrayListDxcTrN.add(new DrawLineData.DrawLineItem(lineTypeValueOf, coinId, type.intValue(), 0, arrayList2, 0, drawLineData2.AEQbTJ(), drawLineData2.AhwBna(), drawLineData2.gEmmrt(), drawLineData2.djBIcL(), C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), drawLineData2.AYXKKw(), drawLineData2.KWHzl(), drawLineData2.copydefault()));
                        Intrinsics.copydefault(arrayListDxcTrN);
                        drawLineData2.KWHzl((DrawLineData.DrawLineItem) CollectionsKt___CollectionsKt.wlaJM(arrayListDxcTrN));
                        drawLineData2.EZpvd((DrawLineData.LineType) null);
                        C36250oUv c36250oUvDbNXlk = this.isConnected.DbNXlk();
                        if (c36250oUvDbNXlk != null) {
                            c36250oUvDbNXlk.invalidate();
                        }
                        C36312oXc c36312oXc = this.isConnected;
                        c36312oXc.EZpvd(c36312oXc.AxsJAY);
                        own.AwvSrB();
                        this.DbNXlk.clear();
                        C36250oUv c36250oUvDbNXlk2 = this.isConnected.DbNXlk();
                        if (c36250oUvDbNXlk2 != null && (taskDescriptionAuCTel = c36250oUvDbNXlk2.AuCTel()) != null) {
                            taskDescriptionAuCTel.AEQbTJ();
                        }
                        RxBus.KWHzl("kline_drawing_data_upload");
                    } else {
                        java.util.ArrayList<DrawLineData.Dot> arrayList3 = this.DbNXlk;
                        if (arrayList3 == null) {
                            str = "";
                            str2 = "  dot2";
                            arrayList = arrayList2;
                            i = 2;
                        } else if (arrayList3.isEmpty()) {
                            str2 = "  dot2";
                            arrayList = arrayList2;
                            str = "";
                            i = 2;
                        } else {
                            DrawLineData.Dot dot = (DrawLineData.Dot) CollectionsKt___CollectionsKt.AkhnZx(this.DbNXlk, 0);
                            if (dot != null && jAhwBna == dot.getTime()) {
                                DrawLineData.Dot dot2 = (DrawLineData.Dot) CollectionsKt___CollectionsKt.AkhnZx(this.DbNXlk, 0);
                                if (Intrinsics.EZpvd(dEZpvd, dot2 != null ? java.lang.Double.valueOf(dot2.getPrice()) : null)) {
                                    return false;
                                }
                            }
                            DrawLineData.Dot dot3 = (DrawLineData.Dot) CollectionsKt___CollectionsKt.AkhnZx(this.DbNXlk, 1);
                            if (dot3 != null && jAhwBna == dot3.getTime()) {
                                DrawLineData.Dot dot4 = (DrawLineData.Dot) CollectionsKt___CollectionsKt.AkhnZx(this.DbNXlk, 1);
                                if (Intrinsics.EZpvd(dEZpvd, dot4 != null ? java.lang.Double.valueOf(dot4.getPrice()) : null)) {
                                    return false;
                                }
                            }
                            DrawLineData.Dot dotOLrzqt = OLrzqt(own, owc, iValueOf, jAhwBna, dEZpvd);
                            DrawLineData.LineType lineTypeValueOf2 = drawLineData.valueOf();
                            DrawLineData.LineType lineType = DrawLineData.LineType.G_TRIANGLE;
                            if (lineTypeValueOf2 == lineType) {
                                if (!Intrinsics.EZpvd(this.DbNXlk.get(1), this.DbNXlk.get(0))) {
                                    i2 = 2;
                                    this.DbNXlk.set(2, dotOLrzqt);
                                    z = true;
                                } else {
                                    i2 = 2;
                                    this.DbNXlk.set(1, dotOLrzqt);
                                    this.DbNXlk.set(2, dotOLrzqt);
                                    z = false;
                                }
                                pUU.copydefault("StateDrawing", "G_TRIANGLE = dot1" + this.DbNXlk.get(0).getX() + "  dot2" + this.DbNXlk.get(1).getX() + "  dot3" + this.DbNXlk.get(i2).getX());
                            } else {
                                this.DbNXlk.set(1, dotOLrzqt);
                                z = false;
                            }
                            arrayList2.addAll(this.DbNXlk);
                            if (drawLineData.valueOf() != lineType || z) {
                                Intrinsics.copydefault(arrayListDxcTrN);
                                KWHzl(arrayListDxcTrN, arrayList2, own);
                            } else {
                                java.util.Iterator<DrawLineData.DrawLineItem> it2 = arrayListDxcTrN.iterator();
                                Intrinsics.checkNotNullExpressionValue(it2, "");
                                while (it2.hasNext()) {
                                    it2.next().setSelected(-1);
                                }
                                Intrinsics.copydefault(arrayListDxcTrN);
                                int iAuCTel = yDY.AuCTel(arrayListDxcTrN);
                                DrawLineData drawLineData3 = DrawLineData.copydefault;
                                DrawLineData.LineType lineTypeValueOf3 = drawLineData3.valueOf();
                                Intrinsics.copydefault(lineTypeValueOf3);
                                oUJ ouj2 = oUJ.KWHzl;
                                DrawLineBean drawLineBeanAEQbTJ3 = ouj2.AEQbTJ();
                                java.lang.String coinId2 = drawLineBeanAEQbTJ3 != null ? drawLineBeanAEQbTJ3.getCoinId() : null;
                                Intrinsics.copydefault((java.lang.Object) coinId2);
                                DrawLineBean drawLineBeanAEQbTJ4 = ouj2.AEQbTJ();
                                java.lang.Integer type2 = drawLineBeanAEQbTJ4 != null ? drawLineBeanAEQbTJ4.getType() : null;
                                Intrinsics.copydefault(type2);
                                arrayListDxcTrN.set(iAuCTel, new DrawLineData.DrawLineItem(lineTypeValueOf3, coinId2, type2.intValue(), 0, arrayList2, 0, drawLineData3.AEQbTJ(), drawLineData3.AhwBna(), drawLineData3.gEmmrt(), drawLineData3.djBIcL(), C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), drawLineData3.AYXKKw(), drawLineData3.KWHzl(), drawLineData3.copydefault()));
                                C36250oUv c36250oUvDbNXlk3 = this.isConnected.DbNXlk();
                                if (c36250oUvDbNXlk3 != null) {
                                    c36250oUvDbNXlk3.invalidate();
                                }
                                drawLineData3.KWHzl((DrawLineData.DrawLineItem) CollectionsKt___CollectionsKt.wlaJM(arrayListDxcTrN));
                            }
                        }
                        java.util.ArrayList<DrawLineData.Dot> arrayList4 = arrayList;
                        int i3 = i;
                        java.lang.String str3 = str2;
                        DrawLineData.Dot dotOLrzqt2 = OLrzqt(own, owc, iValueOf, jAhwBna, dEZpvd);
                        this.DbNXlk.add(dotOLrzqt2);
                        this.DbNXlk.add(dotOLrzqt2);
                        DrawLineData.LineType lineTypeValueOf4 = drawLineData.valueOf();
                        DrawLineData.LineType lineType2 = DrawLineData.LineType.G_TRIANGLE;
                        if (lineTypeValueOf4 == lineType2) {
                            this.DbNXlk.add(dotOLrzqt2);
                        }
                        arrayList4.addAll(this.DbNXlk);
                        if (drawLineData.valueOf() == lineType2) {
                            pUU.copydefault("StateDrawing", "第1个点 G_TRIANGLE = dot1" + this.DbNXlk.get(0).getX() + str3 + this.DbNXlk.get(1).getX() + "  dot3" + this.DbNXlk.get(i3).getX());
                        }
                        c36246oUrCopydefault.KWHzl(this.gEmmrt, this.AkhnZx);
                        java.util.Iterator<DrawLineData.DrawLineItem> it3 = arrayListDxcTrN.iterator();
                        Intrinsics.checkNotNullExpressionValue(it3, str);
                        while (it3.hasNext()) {
                            it3.next().setSelected(-1);
                        }
                        DrawLineData drawLineData4 = DrawLineData.copydefault;
                        DrawLineData.LineType lineTypeValueOf5 = drawLineData4.valueOf();
                        Intrinsics.copydefault(lineTypeValueOf5);
                        oUJ ouj3 = oUJ.KWHzl;
                        DrawLineBean drawLineBeanAEQbTJ5 = ouj3.AEQbTJ();
                        java.lang.String coinId3 = drawLineBeanAEQbTJ5 != null ? drawLineBeanAEQbTJ5.getCoinId() : null;
                        Intrinsics.copydefault((java.lang.Object) coinId3);
                        DrawLineBean drawLineBeanAEQbTJ6 = ouj3.AEQbTJ();
                        java.lang.Integer type3 = drawLineBeanAEQbTJ6 != null ? drawLineBeanAEQbTJ6.getType() : null;
                        Intrinsics.copydefault(type3);
                        arrayListDxcTrN.add(new DrawLineData.DrawLineItem(lineTypeValueOf5, coinId3, type3.intValue(), 0, arrayList4, 0, drawLineData4.AEQbTJ(), drawLineData4.AhwBna(), drawLineData4.gEmmrt(), drawLineData4.djBIcL(), C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), drawLineData4.AYXKKw(), drawLineData4.KWHzl(), drawLineData4.copydefault()));
                        C36250oUv c36250oUvDbNXlk4 = this.isConnected.DbNXlk();
                        if (c36250oUvDbNXlk4 != null) {
                            c36250oUvDbNXlk4.invalidate();
                        }
                        Intrinsics.copydefault(arrayListDxcTrN);
                        drawLineData4.KWHzl((DrawLineData.DrawLineItem) CollectionsKt___CollectionsKt.wlaJM(arrayListDxcTrN));
                    }
                    return false;
                }
                pUU.copydefault("stateDrawingAndIdle", "timeline is null");
                return false;
            }
        }
        android.view.VelocityTracker velocityTracker = this.fIwbmz;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.fIwbmz = null;
        C36250oUv c36250oUvDbNXlk5 = this.isConnected.DbNXlk();
        if (c36250oUvDbNXlk5 != null) {
            c36250oUvDbNXlk5.EZpvd(false);
        }
        java.util.HashMap<java.lang.String, oWN> mapDCJXGO = C36246oUr.copydefault().DCJXGO();
        C36250oUv c36250oUvDbNXlk6 = this.isConnected.DbNXlk();
        oWN own2 = mapDCJXGO.get(c36250oUvDbNXlk6 != null ? c36250oUvDbNXlk6.fIwbmz() : null);
        if (own2 != null) {
            own2.gEmmrt();
            own2.EZpvd(false);
            own2.AwvSrB();
            own2.AEQbTJ(false);
        }
        if (this.isConnected.fARcdN() && !this.ejfBZ && own2 != null && own2.wlaJM()) {
            own2.sSMYrx();
            this.isConnected.ejfBZ();
            this.isConnected.gEmmrt().KWHzl((int) motionEvent.getX(), this.isConnected.values());
        }
        this.ejfBZ = false;
        if (own2 != null) {
            own2.AEQbTJ(false);
        }
        return false;
    }

    private final DrawLineData.Dot OLrzqt(oWN own, oWC owc, int i, long j, double d) {
        DrawLineData.Dot dot = new DrawLineData.Dot(j, d);
        dot.setX(C33129mqd.AEQbTJ(java.lang.Float.valueOf(own.AYXKKw(i))));
        dot.setY(C33129mqd.AEQbTJ(java.lang.Integer.valueOf(owc.OLrzqt(d))));
        return dot;
    }

    private final void KWHzl(java.util.ArrayList<DrawLineData.DrawLineItem> arrayList, java.util.ArrayList<DrawLineData.Dot> arrayList2, oWN own) {
        C36250oUv.TaskDescription taskDescriptionAuCTel;
        if (yDY.AuCTel(arrayList) == -1) {
            DrawLineData drawLineData = DrawLineData.copydefault;
            DrawLineData.LineType lineTypeValueOf = drawLineData.valueOf();
            Intrinsics.copydefault(lineTypeValueOf);
            oUJ ouj = oUJ.KWHzl;
            DrawLineBean drawLineBeanAEQbTJ = ouj.AEQbTJ();
            java.lang.String coinId = drawLineBeanAEQbTJ != null ? drawLineBeanAEQbTJ.getCoinId() : null;
            Intrinsics.copydefault((java.lang.Object) coinId);
            DrawLineBean drawLineBeanAEQbTJ2 = ouj.AEQbTJ();
            java.lang.Integer type = drawLineBeanAEQbTJ2 != null ? drawLineBeanAEQbTJ2.getType() : null;
            Intrinsics.copydefault(type);
            arrayList.add(new DrawLineData.DrawLineItem(lineTypeValueOf, coinId, type.intValue(), 0, arrayList2, 0, drawLineData.AEQbTJ(), drawLineData.AhwBna(), drawLineData.gEmmrt(), drawLineData.djBIcL(), C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), drawLineData.AYXKKw(), drawLineData.KWHzl(), drawLineData.copydefault()));
            int size = arrayList.size();
            java.util.ArrayList<DrawLineData.Dot> arrayList3 = this.DbNXlk;
            pUU.copydefault("StateDrawing", "drawList.size = " + size + " mDotList.isNullOrEmpty() = " + (arrayList3 == null || arrayList3.isEmpty()));
        } else {
            int iAuCTel = yDY.AuCTel(arrayList);
            DrawLineData drawLineData2 = DrawLineData.copydefault;
            DrawLineData.LineType lineTypeValueOf2 = drawLineData2.valueOf();
            Intrinsics.copydefault(lineTypeValueOf2);
            oUJ ouj2 = oUJ.KWHzl;
            DrawLineBean drawLineBeanAEQbTJ3 = ouj2.AEQbTJ();
            java.lang.String coinId2 = drawLineBeanAEQbTJ3 != null ? drawLineBeanAEQbTJ3.getCoinId() : null;
            Intrinsics.copydefault((java.lang.Object) coinId2);
            DrawLineBean drawLineBeanAEQbTJ4 = ouj2.AEQbTJ();
            java.lang.Integer type2 = drawLineBeanAEQbTJ4 != null ? drawLineBeanAEQbTJ4.getType() : null;
            Intrinsics.copydefault(type2);
            Intrinsics.copydefault(arrayList.set(iAuCTel, new DrawLineData.DrawLineItem(lineTypeValueOf2, coinId2, type2.intValue(), 0, arrayList2, 0, drawLineData2.AEQbTJ(), drawLineData2.AhwBna(), drawLineData2.gEmmrt(), drawLineData2.djBIcL(), C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), drawLineData2.AYXKKw(), drawLineData2.KWHzl(), drawLineData2.copydefault())));
        }
        DrawLineData drawLineData3 = DrawLineData.copydefault;
        drawLineData3.EZpvd((DrawLineData.LineType) null);
        drawLineData3.KWHzl((DrawLineData.DrawLineItem) CollectionsKt___CollectionsKt.wlaJM(arrayList));
        C36250oUv c36250oUvDbNXlk = this.isConnected.DbNXlk();
        if (c36250oUvDbNXlk != null) {
            c36250oUvDbNXlk.invalidate();
        }
        C36312oXc c36312oXc = this.isConnected;
        c36312oXc.EZpvd(c36312oXc.AxsJAY);
        own.AwvSrB();
        this.DbNXlk.clear();
        C36246oUr.copydefault().AhwBna();
        C36250oUv c36250oUvDbNXlk2 = this.isConnected.DbNXlk();
        if (c36250oUvDbNXlk2 != null && (taskDescriptionAuCTel = c36250oUvDbNXlk2.AuCTel()) != null) {
            taskDescriptionAuCTel.AEQbTJ();
        }
        RxBus.KWHzl("kline_drawing_data_upload");
    }

    @Override // o.oWO
    public void AEQbTJ(boolean z) {
        if (!z) {
            C36312oXc c36312oXc = this.isConnected;
            c36312oXc.EZpvd(c36312oXc.zLjUOn);
            C36246oUr.copydefault().valueOf(false);
            gEmmrt();
        } else if (C36246oUr.copydefault().QwvEab()) {
            gEmmrt();
        }
        copydefault();
    }

    @Override // o.oWO
    public void EZpvd() {
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.EZpvd(SPUtils.getString("draw_line_color", "#2862FF"));
        drawLineData.AEQbTJ(SPUtils.getString("draw_line_color_blk", "A6"));
        drawLineData.KWHzl(SPUtils.getString("draw_fill_color_blk", "A6"));
        drawLineData.copydefault(SPUtils.getString("draw_fill_color", "#262862FF"));
        drawLineData.OLrzqt(SPUtils.getInt("draw_line_width", 1).intValue());
        drawLineData.copydefault(SPUtils.getInt("draw_line_style", 0).intValue());
        drawLineData.EZpvd(pEB.OLrzqt.gEmmrt());
    }

    @Override // o.oWO
    public void OLrzqt() {
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.EZpvd(drawLineData.EZpvd());
    }

    private final void copydefault() {
        C36250oUv.TaskDescription taskDescriptionAuCTel;
        if (C33129mqd.KWHzl((java.util.Collection) this.DbNXlk)) {
            C56406yEe.getFieldNames(DrawLineData.copydefault.EZpvd());
            java.util.ArrayList<DrawLineData.DrawLineItem> arrayListDxcTrN = C36246oUr.copydefault().dxcTrN();
            Intrinsics.checkNotNullExpressionValue(arrayListDxcTrN, "");
            C56406yEe.getFieldNames(arrayListDxcTrN);
            this.DbNXlk.clear();
            C36250oUv c36250oUvDbNXlk = this.isConnected.DbNXlk();
            if (c36250oUvDbNXlk != null && (taskDescriptionAuCTel = c36250oUvDbNXlk.AuCTel()) != null) {
                taskDescriptionAuCTel.AEQbTJ();
            }
        }
        C36250oUv c36250oUvDbNXlk2 = this.isConnected.DbNXlk();
        if (c36250oUvDbNXlk2 != null) {
            c36250oUvDbNXlk2.invalidate();
        }
        C36246oUr.copydefault().AhwBna();
    }

    private final void gEmmrt() {
        oWN own = C36246oUr.copydefault().DCJXGO().get("ds0");
        if (own != null) {
            own.AwvSrB();
        }
        DrawLineData.copydefault.EZpvd((DrawLineData.LineType) null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oWZ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static final Unit OLrzqt(java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.AEQbTJ((java.util.ArrayList<DrawLineData.DrawLineItem>) arrayList);
        java.util.Iterator<DrawLineData.DrawLineItem> it = drawLineData.EZpvd().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            DrawLineData.DrawLineItem next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            next.setSelected(-1);
        }
        return Unit.INSTANCE;
    }
}
