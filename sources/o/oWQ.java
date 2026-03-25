package o;

import android.graphics.RectF;
import androidx.camera.video.AudioStats;
import com.google.gson.Gson;
import com.okinc.core.util.SPUtils;
import com.okinc.kline.data.DrawLineBean;
import com.okinc.kline.library.data.DataSource;
import com.okinc.kline.library.drawline.DrawLineData;
import com.okinc.kline.library.layout.ChartArea;
import com.okinc.rxutils.RxBus;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C36250oUv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oWQ extends oWO {
    public static final Application Companion = new Application(null);
    public static final int djBIcL = 8;
    public boolean AkhnZx;
    public boolean AuCTel;
    public C36312oXc DbNXlk;
    public boolean fARcdN;
    public android.view.VelocityTracker fJNWhG;
    public java.util.ArrayList<DrawLineData.Dot> fetchVPNInfo;
    public int gEmmrt;
    public boolean isConnected;
    public int values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.oWO
    public java.lang.String KWHzl() {
        return "StateDrawing";
    }

    public final boolean KWHzl(float f, float f2, float f3, float f4, float f5) {
        float f6 = f - f3;
        float f7 = f2 - f4;
        return (f6 * f6) + (f7 * f7) <= f5 * f5;
    }

    public oWQ(@NotNull C36312oXc c36312oXc) {
        C36250oUv.TaskDescription taskDescriptionAuCTel;
        Intrinsics.checkNotNullParameter(c36312oXc, "");
        this.DbNXlk = c36312oXc;
        this.fetchVPNInfo = new java.util.ArrayList<>();
        DrawLineData drawLineData = DrawLineData.copydefault;
        drawLineData.OLrzqt(new Function1() { // from class: o.oWV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oWQ.EZpvd((java.util.ArrayList) obj);
            }
        });
        if (drawLineData.valueOf() != null) {
            this.fetchVPNInfo.clear();
            C36246oUr.copydefault().AhwBna();
            C36250oUv c36250oUvDbNXlk = this.DbNXlk.DbNXlk();
            if (c36250oUvDbNXlk != null && (taskDescriptionAuCTel = c36250oUvDbNXlk.AuCTel()) != null) {
                taskDescriptionAuCTel.AEQbTJ();
            }
            AhwBna();
        }
    }

    @Override // o.oWO
    public boolean AkhnZx(@NotNull android.view.MotionEvent motionEvent) {
        C36250oUv c36250oUvDbNXlk;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        this.fARcdN = false;
        this.AkhnZx = true;
        if (motionEvent.getPointerCount() <= 2 && (c36250oUvDbNXlk = this.DbNXlk.DbNXlk()) != null) {
            c36250oUvDbNXlk.EZpvd(false);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x014d  */
    @Override // o.oWO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean AhwBna(@NotNull android.view.MotionEvent motionEvent) {
        int i;
        DrawLineData.DrawLineItem drawLineItemIsConnected;
        DataSource.DataArrayList<DataSource.StateListAnimator> dataArrayList;
        int i2;
        int i3;
        java.lang.Integer num;
        int i4;
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
        RectF rectFORxRYg;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        super.AhwBna(motionEvent);
        int i5 = 0;
        java.lang.Integer num2 = 0;
        this.AkhnZx = false;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        int i6 = 1;
        if (c36246oUrCopydefault.iwGUEr().ORxRYg() != null && (rectFORxRYg = c36246oUrCopydefault.iwGUEr().ORxRYg()) != null && rectFORxRYg.contains(motionEvent.getX(), motionEvent.getY())) {
            if (this.DbNXlk.gEmmrt() != null && !this.DbNXlk.gEmmrt().OLrzqt()) {
                this.DbNXlk.gEmmrt().EZpvd();
            }
            C36246oUr.copydefault().AhwBna(false);
            C36250oUv c36250oUvDbNXlk = this.DbNXlk.DbNXlk();
            if (c36250oUvDbNXlk != null) {
                c36250oUvDbNXlk.invalidate();
            }
            c36246oUrCopydefault.iwGUEr().djBIcL((RectF) null);
            this.isConnected = true;
            return false;
        }
        oWN own = c36246oUrCopydefault.DCJXGO().get("ds0");
        this.DbNXlk.copydefault(motionEvent.getX());
        this.DbNXlk.OLrzqt(motionEvent.getY());
        if (this.DbNXlk.gEmmrt() != null && !this.DbNXlk.gEmmrt().OLrzqt()) {
            this.DbNXlk.gEmmrt().EZpvd();
            this.AuCTel = true;
            this.DbNXlk.EZpvd(0);
            return false;
        }
        java.util.ArrayList<DrawLineData.DrawLineItem> arrayListDxcTrN = c36246oUrCopydefault.RdAHlO() ? c36246oUrCopydefault.dxcTrN() : DrawLineData.copydefault.EZpvd();
        if (DrawLineData.copydefault.valueOf() == null) {
            com.okinc.kline.library.data.DataSource dataSource = c36246oUrCopydefault.sSMYrx().get("ds0");
            int i7 = -1;
            if (dataSource == null || (dataArrayList = dataSource.AEQbTJ) == null || dataArrayList.size() <= 1) {
                i = -1;
            } else {
                int size = arrayListDxcTrN.size();
                int i8 = 0;
                int i9 = -1;
                while (i8 < size) {
                    arrayListDxcTrN.get(i8).setSelected(i7);
                    oUU ouu = oUU.copydefault;
                    if (ouu.copydefault(motionEvent, arrayListDxcTrN.get(i8).getLinePositionList()) < AudioStats.AUDIO_AMPLITUDE_NONE || arrayListDxcTrN.get(i8).isDelete()) {
                        i2 = i9;
                    } else {
                        arrayListDxcTrN.get(i8).getLineType().getStrName();
                        if (i9 < 0 || ouu.copydefault(motionEvent, arrayListDxcTrN.get(i8).getLinePositionList()) < ouu.copydefault(motionEvent, arrayListDxcTrN.get(i9).getLinePositionList())) {
                            i2 = i8;
                        }
                    }
                    if (arrayListDxcTrN.get(i8).getLineType() != DrawLineData.LineType.G_CIRCLE || i2 >= 0) {
                        i3 = i8;
                        num = num2;
                        i4 = size;
                    } else {
                        arrayListDxcTrN.get(i8).getLineType().getStrName();
                        DrawLineData.DrawLineItem drawLineItem = arrayListDxcTrN.get(i8);
                        float fFloatValue = ((drawLineItem == null || (dotList6 = drawLineItem.getDotList()) == null || (dot6 = dotList6.get(i5)) == null) ? num2 : java.lang.Double.valueOf(dot6.getX())).floatValue();
                        DrawLineData.DrawLineItem drawLineItem2 = arrayListDxcTrN.get(i8);
                        float fFloatValue2 = ((drawLineItem2 == null || (dotList5 = drawLineItem2.getDotList()) == null || (dot5 = dotList5.get(i5)) == null) ? num2 : java.lang.Double.valueOf(dot5.getY())).floatValue();
                        DrawLineData.DrawLineItem drawLineItem3 = arrayListDxcTrN.get(i8);
                        float fFloatValue3 = ((drawLineItem3 == null || (dotList4 = drawLineItem3.getDotList()) == null || (dot4 = dotList4.get(i6)) == null) ? num2 : java.lang.Double.valueOf(dot4.getX())).floatValue();
                        DrawLineData.DrawLineItem drawLineItem4 = arrayListDxcTrN.get(i8);
                        num = num2;
                        double d = 2;
                        float fSqrt = (float) java.lang.Math.sqrt(java.lang.Math.pow(fFloatValue - fFloatValue3, d) + java.lang.Math.pow(fFloatValue2 - ((drawLineItem4 == null || (dotList3 = drawLineItem4.getDotList()) == null || (dot3 = dotList3.get(i6)) == null) ? num2 : java.lang.Double.valueOf(dot3.getY())).floatValue(), d));
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        DrawLineData.DrawLineItem drawLineItem5 = arrayListDxcTrN.get(i8);
                        float fFloatValue4 = ((drawLineItem5 == null || (dotList2 = drawLineItem5.getDotList()) == null || (dot2 = dotList2.get(0)) == null) ? num : java.lang.Double.valueOf(dot2.getX())).floatValue();
                        DrawLineData.DrawLineItem drawLineItem6 = arrayListDxcTrN.get(i8);
                        i3 = i8;
                        i4 = size;
                        if (KWHzl(x, y, fFloatValue4, ((drawLineItem6 == null || (dotList = drawLineItem6.getDotList()) == null || (dot = dotList.get(0)) == null) ? num : java.lang.Double.valueOf(dot.getY())).floatValue(), fSqrt)) {
                            i9 = i3;
                        }
                        i8 = i3 + 1;
                        size = i4;
                        num2 = num;
                        i5 = 0;
                        i6 = 1;
                        i7 = -1;
                    }
                    i9 = i2;
                    i8 = i3 + 1;
                    size = i4;
                    num2 = num;
                    i5 = 0;
                    i6 = 1;
                    i7 = -1;
                }
                i = i9;
            }
            if (i >= 0 && !C36246oUr.copydefault().QwvEab()) {
                arrayListDxcTrN.get(i).setSelected(0);
                DrawLineData drawLineData = DrawLineData.copydefault;
                drawLineData.KWHzl(arrayListDxcTrN.get(i));
                DrawLineData.DrawLineItem drawLineItemIsConnected2 = drawLineData.isConnected();
                if ((drawLineItemIsConnected2 != null ? drawLineItemIsConnected2.getLineType() : null) == DrawLineData.LineType.G_TRIANGLE && (drawLineItemIsConnected = drawLineData.isConnected()) != null) {
                    drawLineItemIsConnected.setSelected(5);
                }
                oWO owo = this.DbNXlk.AxsJAY;
                Intrinsics.copydefault(owo, "");
                ((C36316oXg) owo).AEQbTJ((DrawLineData.DrawLineItem) new Gson().fromJson(new Gson().toJson(drawLineData.isConnected()), DrawLineData.DrawLineItem.class));
                C36312oXc c36312oXc = this.DbNXlk;
                c36312oXc.EZpvd(c36312oXc.AxsJAY);
                C36250oUv c36250oUvDbNXlk2 = this.DbNXlk.DbNXlk();
                if (c36250oUvDbNXlk2 == null) {
                    return false;
                }
                c36250oUvDbNXlk2.invalidate();
                return false;
            }
            DrawLineData.copydefault.KWHzl((DrawLineData.DrawLineItem) null);
            this.DbNXlk.EZpvd(java.lang.System.currentTimeMillis());
            if (own != null) {
                own.sSMYrx();
            }
            if (own != null) {
                own.AwvSrB();
            }
            C36250oUv c36250oUvDbNXlk3 = this.DbNXlk.DbNXlk();
            if (c36250oUvDbNXlk3 == null) {
                return false;
            }
            c36250oUvDbNXlk3.invalidate();
            return false;
        }
        this.gEmmrt = own != null ? own.getNewProxyInstance() : 0;
        this.values = own != null ? own.uzCIH() : 0;
        return false;
    }

    @Override // o.oWO
    public boolean AYXKKw(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        super.AYXKKw(motionEvent);
        C36312oXc c36312oXc = this.DbNXlk;
        c36312oXc.EZpvd(c36312oXc.zLjUOn);
        this.AuCTel = false;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x010d  */
    @Override // o.oWO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean DbNXlk(@NotNull android.view.MotionEvent motionEvent) {
        float fDjBIcL;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (this.isConnected || this.AuCTel) {
            return false;
        }
        if (Intrinsics.EZpvd(this.DbNXlk.isConnected(), this.DbNXlk.getFieldNames)) {
            DrawLineData drawLineData = DrawLineData.copydefault;
            if (drawLineData.valueOf() != null) {
                oWN own = C36246oUr.copydefault().DCJXGO().get("ds0");
                if (own != null) {
                    float x = motionEvent.getX();
                    float fCopydefault = this.DbNXlk.copydefault();
                    float y = motionEvent.getY();
                    float fDjBIcL2 = this.DbNXlk.djBIcL();
                    float newProxyInstance = own.getNewProxyInstance() + (x - fCopydefault);
                    if ((drawLineData.valueOf() == DrawLineData.LineType.H_SEGMENT || drawLineData.valueOf() == DrawLineData.LineType.H_RADIAL) && C33129mqd.KWHzl((java.util.Collection) this.fetchVPNInfo)) {
                        fDjBIcL = C33129mqd.djBIcL(java.lang.Integer.valueOf(own.uzCIH()));
                    } else {
                        fDjBIcL = own.uzCIH() + (y - fDjBIcL2);
                    }
                    if (newProxyInstance < 0.0f) {
                        newProxyInstance = 0.0f;
                    }
                    if (newProxyInstance > this.DbNXlk.DbNXlk().getWidth()) {
                        newProxyInstance = C33129mqd.djBIcL(java.lang.Integer.valueOf(this.DbNXlk.DbNXlk().getWidth()));
                    }
                    if (fDjBIcL < 0.0f) {
                        fDjBIcL = 0.0f;
                    }
                    ChartArea chartArea = C36246oUr.copydefault().values().get("ds0.m");
                    int iDjBIcL = chartArea != null ? chartArea.djBIcL() : this.DbNXlk.DbNXlk().getHeight();
                    if (fDjBIcL > iDjBIcL) {
                        fDjBIcL = C33129mqd.djBIcL(java.lang.Integer.valueOf(iDjBIcL));
                    }
                    this.DbNXlk.copydefault(motionEvent.getX());
                    this.DbNXlk.OLrzqt(motionEvent.getY());
                    own.KWHzl(C33129mqd.AhwBna(java.lang.Float.valueOf(newProxyInstance)), C33129mqd.AhwBna(java.lang.Float.valueOf(fDjBIcL)));
                    C36250oUv c36250oUvDbNXlk = this.DbNXlk.DbNXlk();
                    if (c36250oUvDbNXlk != null) {
                        c36250oUvDbNXlk.invalidate();
                    }
                }
            } else if (!this.fARcdN && !this.AkhnZx) {
                float x2 = motionEvent.getX();
                float fCopydefault2 = this.DbNXlk.copydefault();
                oWN own2 = C36246oUr.copydefault().DCJXGO().get(this.DbNXlk.DbNXlk().fIwbmz());
                if (own2 != null) {
                    own2.AhwBna(x2 - fCopydefault2);
                    this.DbNXlk.copydefault(motionEvent.getX());
                }
                C36250oUv c36250oUvDbNXlk2 = this.DbNXlk.DbNXlk();
                if (c36250oUvDbNXlk2 != null) {
                    c36250oUvDbNXlk2.invalidate();
                }
                if (this.fJNWhG == null) {
                    this.fJNWhG = android.view.VelocityTracker.obtain();
                }
                android.view.VelocityTracker velocityTracker = this.fJNWhG;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                android.view.VelocityTracker velocityTracker2 = this.fJNWhG;
                if (velocityTracker2 != null) {
                    velocityTracker2.computeCurrentVelocity(1000, this.DbNXlk.AkhnZx());
                }
                C36312oXc c36312oXc = this.DbNXlk;
                android.view.VelocityTracker velocityTracker3 = this.fJNWhG;
                java.lang.Integer numValueOf = velocityTracker3 != null ? java.lang.Integer.valueOf((int) velocityTracker3.getXVelocity()) : null;
                Intrinsics.copydefault(numValueOf);
                c36312oXc.EZpvd(numValueOf.intValue());
                this.DbNXlk.DbNXlk().EZpvd(true);
            } else if (!this.AkhnZx) {
                super.DbNXlk(motionEvent);
                float fCopydefault3 = C36326oXq.copydefault(motionEvent);
                if (java.lang.Math.abs(fCopydefault3 - this.DbNXlk.fetchVPNInfo()) > android.view.ViewConfiguration.get(this.DbNXlk.DbNXlk().getContext()).getScaledTouchSlop()) {
                    C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
                    oWN own3 = c36246oUrCopydefault.DCJXGO().get("ds0");
                    Intrinsics.copydefault(own3);
                    own3.EZpvd(true);
                    oWN own4 = c36246oUrCopydefault.DCJXGO().get("ds0");
                    Intrinsics.copydefault(own4);
                    own4.EZpvd(fCopydefault3 - this.DbNXlk.fetchVPNInfo(), fCopydefault3 > this.DbNXlk.fetchVPNInfo() ? 1 : -1);
                    this.DbNXlk.EZpvd(fCopydefault3);
                    C36250oUv c36250oUvDbNXlk3 = this.DbNXlk.DbNXlk();
                    if (c36250oUvDbNXlk3 != null) {
                        c36250oUvDbNXlk3.invalidate();
                    }
                    this.DbNXlk.DbNXlk().EZpvd(true);
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
        this.DbNXlk.EZpvd(C36326oXq.copydefault(motionEvent));
        if (this.DbNXlk.fetchVPNInfo() > android.view.ViewConfiguration.get(this.DbNXlk.DbNXlk().getContext()).getScaledTouchSlop() && (own = C36246oUr.copydefault().DCJXGO().get("ds0")) != null) {
            own.AxsJAY();
            own.OLrzqt(0, 0);
            own.valueOf(own.fJNWhG());
        }
        this.DbNXlk.DbNXlk().EZpvd(true);
        this.fARcdN = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0424 A[LOOP:2: B:122:0x041e->B:124:0x0424, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04cd  */
    @Override // o.oWO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean fetchVPNInfo(@NotNull android.view.MotionEvent motionEvent) {
        long jAhwBna;
        long jAhwBna2;
        double dEZpvd;
        java.util.Iterator<DrawLineData.DrawLineItem> it;
        C36250oUv c36250oUvDbNXlk;
        C36250oUv.TaskDescription taskDescriptionAuCTel;
        boolean z;
        int i;
        boolean z2;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (this.isConnected) {
            this.isConnected = false;
            return false;
        }
        if (Intrinsics.EZpvd(this.DbNXlk.isConnected(), this.DbNXlk.getFieldNames)) {
            DrawLineData drawLineData = DrawLineData.copydefault;
            if (drawLineData.valueOf() != null) {
                oWN own = C36246oUr.copydefault().DCJXGO().get("ds0");
                if (own != null) {
                    if (java.lang.Math.abs(this.gEmmrt - own.getNewProxyInstance()) >= 5 || java.lang.Math.abs(this.values - own.uzCIH()) >= 5) {
                        return false;
                    }
                    C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
                    java.util.ArrayList<DrawLineData.DrawLineItem> arrayListDxcTrN = c36246oUrCopydefault.RdAHlO() ? c36246oUrCopydefault.dxcTrN() : drawLineData.EZpvd();
                    oWC owc = c36246oUrCopydefault.iwGUEr().QVAiDq().get("ds0.m");
                    java.util.ArrayList<DrawLineData.Dot> arrayList = new java.util.ArrayList<>();
                    com.okinc.kline.library.data.DataSource dataSource = c36246oUrCopydefault.sSMYrx().get("ds0");
                    if ((dataSource != null ? dataSource.AEQbTJ : null) == null || dataSource.AEQbTJ.size() < 2) {
                        return false;
                    }
                    long jKWHzl = pEV.OLrzqt.KWHzl();
                    int iValueOf = own.valueOf(this.gEmmrt);
                    if (iValueOf < 0) {
                        jAhwBna = dataSource.AEQbTJ.get(0).AhwBna() + (jKWHzl * ((long) iValueOf));
                    } else {
                        if (iValueOf >= dataSource.AEQbTJ.size()) {
                            DataSource.DataArrayList<DataSource.StateListAnimator> dataArrayList = dataSource.AEQbTJ;
                            jAhwBna2 = dataArrayList.get(dataArrayList.size() - 1).AhwBna() + (jKWHzl * ((long) ((iValueOf - dataSource.AEQbTJ.size()) + 1)));
                            Intrinsics.copydefault(owc);
                            dEZpvd = owc.EZpvd(this.values);
                            if (drawLineData.valueOf() != DrawLineData.LineType.H_LINE || drawLineData.valueOf() == DrawLineData.LineType.PRICE_LINE) {
                                this.fetchVPNInfo.add(KWHzl(own, owc, iValueOf, jAhwBna2, dEZpvd));
                                arrayList.addAll(this.fetchVPNInfo);
                                it = arrayListDxcTrN.iterator();
                                Intrinsics.checkNotNullExpressionValue(it, "");
                                while (it.hasNext()) {
                                    it.next().setSelected(-1);
                                }
                                DrawLineData drawLineData2 = DrawLineData.copydefault;
                                DrawLineData.LineType lineTypeValueOf = drawLineData2.valueOf();
                                Intrinsics.copydefault(lineTypeValueOf);
                                oUJ ouj = oUJ.KWHzl;
                                DrawLineBean drawLineBeanAEQbTJ = ouj.AEQbTJ();
                                java.lang.String coinId = drawLineBeanAEQbTJ == null ? drawLineBeanAEQbTJ.getCoinId() : null;
                                Intrinsics.copydefault((java.lang.Object) coinId);
                                DrawLineBean drawLineBeanAEQbTJ2 = ouj.AEQbTJ();
                                java.lang.Integer type = drawLineBeanAEQbTJ2 == null ? drawLineBeanAEQbTJ2.getType() : null;
                                Intrinsics.copydefault(type);
                                arrayListDxcTrN.add(new DrawLineData.DrawLineItem(lineTypeValueOf, coinId, type.intValue(), 0, arrayList, 0, drawLineData2.AEQbTJ(), drawLineData2.AhwBna(), drawLineData2.gEmmrt(), drawLineData2.djBIcL(), C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), drawLineData2.AYXKKw(), drawLineData2.KWHzl(), drawLineData2.copydefault()));
                                Intrinsics.copydefault(arrayListDxcTrN);
                                drawLineData2.KWHzl((DrawLineData.DrawLineItem) CollectionsKt___CollectionsKt.wlaJM(arrayListDxcTrN));
                                drawLineData2.EZpvd((DrawLineData.LineType) null);
                                c36250oUvDbNXlk = this.DbNXlk.DbNXlk();
                                if (c36250oUvDbNXlk != null) {
                                    c36250oUvDbNXlk.invalidate();
                                }
                                C36312oXc c36312oXc = this.DbNXlk;
                                c36312oXc.EZpvd(c36312oXc.AxsJAY);
                                own.AwvSrB();
                                this.fetchVPNInfo.clear();
                                taskDescriptionAuCTel = this.DbNXlk.DbNXlk().AuCTel();
                                if (taskDescriptionAuCTel != null) {
                                    taskDescriptionAuCTel.AEQbTJ();
                                }
                                RxBus.KWHzl("kline_drawing_data_upload");
                            } else {
                                java.util.ArrayList<DrawLineData.Dot> arrayList2 = this.fetchVPNInfo;
                                if (arrayList2 == null || arrayList2.isEmpty()) {
                                    DrawLineData.Dot dotKWHzl = KWHzl(own, owc, iValueOf, jAhwBna2, dEZpvd);
                                    this.fetchVPNInfo.add(dotKWHzl);
                                    this.fetchVPNInfo.add(dotKWHzl);
                                    DrawLineData.LineType lineTypeValueOf2 = drawLineData.valueOf();
                                    DrawLineData.LineType lineType = DrawLineData.LineType.G_TRIANGLE;
                                    if (lineTypeValueOf2 == lineType) {
                                        this.fetchVPNInfo.add(dotKWHzl);
                                    }
                                    arrayList.addAll(this.fetchVPNInfo);
                                    if (drawLineData.valueOf() == lineType) {
                                        pUU.copydefault("StateDrawing", "第1个点 G_TRIANGLE = dot1" + this.fetchVPNInfo.get(0).getX() + "  dot2" + this.fetchVPNInfo.get(1).getX() + "  dot3" + this.fetchVPNInfo.get(2).getX());
                                    }
                                    c36246oUrCopydefault.KWHzl(this.gEmmrt, this.values);
                                    java.util.Iterator<DrawLineData.DrawLineItem> it2 = arrayListDxcTrN.iterator();
                                    Intrinsics.checkNotNullExpressionValue(it2, "");
                                    while (it2.hasNext()) {
                                        it2.next().setSelected(-1);
                                    }
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
                                    arrayListDxcTrN.add(new DrawLineData.DrawLineItem(lineTypeValueOf3, coinId2, type2.intValue(), 0, arrayList, 0, drawLineData3.AEQbTJ(), drawLineData3.AhwBna(), drawLineData3.gEmmrt(), drawLineData3.djBIcL(), C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), drawLineData3.AYXKKw(), drawLineData3.KWHzl(), drawLineData3.copydefault()));
                                    C36250oUv c36250oUvDbNXlk2 = this.DbNXlk.DbNXlk();
                                    if (c36250oUvDbNXlk2 != null) {
                                        c36250oUvDbNXlk2.invalidate();
                                    }
                                    Intrinsics.copydefault(arrayListDxcTrN);
                                    drawLineData3.KWHzl((DrawLineData.DrawLineItem) CollectionsKt___CollectionsKt.wlaJM(arrayListDxcTrN));
                                } else {
                                    DrawLineData.Dot dot = (DrawLineData.Dot) CollectionsKt___CollectionsKt.AkhnZx(this.fetchVPNInfo, 0);
                                    if (dot != null && jAhwBna2 == dot.getTime()) {
                                        DrawLineData.Dot dot2 = (DrawLineData.Dot) CollectionsKt___CollectionsKt.AkhnZx(this.fetchVPNInfo, 0);
                                        if (Intrinsics.EZpvd(dEZpvd, dot2 != null ? java.lang.Double.valueOf(dot2.getPrice()) : null)) {
                                            return false;
                                        }
                                    }
                                    DrawLineData.Dot dot3 = (DrawLineData.Dot) CollectionsKt___CollectionsKt.AkhnZx(this.fetchVPNInfo, 1);
                                    if (dot3 != null && jAhwBna2 == dot3.getTime()) {
                                        DrawLineData.Dot dot4 = (DrawLineData.Dot) CollectionsKt___CollectionsKt.AkhnZx(this.fetchVPNInfo, 1);
                                        if (Intrinsics.EZpvd(dEZpvd, dot4 != null ? java.lang.Double.valueOf(dot4.getPrice()) : null)) {
                                            return false;
                                        }
                                    }
                                    DrawLineData.Dot dotKWHzl2 = KWHzl(own, owc, iValueOf, jAhwBna2, dEZpvd);
                                    DrawLineData.LineType lineTypeValueOf4 = drawLineData.valueOf();
                                    DrawLineData.LineType lineType2 = DrawLineData.LineType.G_TRIANGLE;
                                    if (lineTypeValueOf4 == lineType2) {
                                        if (!Intrinsics.EZpvd(this.fetchVPNInfo.get(1), this.fetchVPNInfo.get(0))) {
                                            i = 2;
                                            this.fetchVPNInfo.set(2, dotKWHzl2);
                                            z2 = true;
                                        } else {
                                            i = 2;
                                            this.fetchVPNInfo.set(1, dotKWHzl2);
                                            this.fetchVPNInfo.set(2, dotKWHzl2);
                                            z2 = false;
                                        }
                                        pUU.copydefault("StateDrawing", "G_TRIANGLE = dot1" + this.fetchVPNInfo.get(0).getX() + "  dot2" + this.fetchVPNInfo.get(1).getX() + "  dot3" + this.fetchVPNInfo.get(i).getX());
                                        z = z2;
                                    } else {
                                        this.fetchVPNInfo.set(1, dotKWHzl2);
                                        z = false;
                                    }
                                    arrayList.addAll(this.fetchVPNInfo);
                                    if (drawLineData.valueOf() != lineType2 || z) {
                                        Intrinsics.copydefault(arrayListDxcTrN);
                                        EZpvd(arrayListDxcTrN, arrayList, own);
                                    } else {
                                        java.util.Iterator<DrawLineData.DrawLineItem> it3 = arrayListDxcTrN.iterator();
                                        Intrinsics.checkNotNullExpressionValue(it3, "");
                                        while (it3.hasNext()) {
                                            it3.next().setSelected(-1);
                                        }
                                        Intrinsics.copydefault(arrayListDxcTrN);
                                        int iAuCTel = yDY.AuCTel(arrayListDxcTrN);
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
                                        arrayListDxcTrN.set(iAuCTel, new DrawLineData.DrawLineItem(lineTypeValueOf5, coinId3, type3.intValue(), 0, arrayList, 0, drawLineData4.AEQbTJ(), drawLineData4.AhwBna(), drawLineData4.gEmmrt(), drawLineData4.djBIcL(), C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), drawLineData4.AYXKKw(), drawLineData4.KWHzl(), drawLineData4.copydefault()));
                                        C36250oUv c36250oUvDbNXlk3 = this.DbNXlk.DbNXlk();
                                        if (c36250oUvDbNXlk3 != null) {
                                            c36250oUvDbNXlk3.invalidate();
                                        }
                                        drawLineData4.KWHzl((DrawLineData.DrawLineItem) CollectionsKt___CollectionsKt.wlaJM(arrayListDxcTrN));
                                    }
                                }
                            }
                            return false;
                        }
                        jAhwBna = dataSource.AEQbTJ.get(iValueOf).AhwBna();
                    }
                    jAhwBna2 = jAhwBna;
                    Intrinsics.copydefault(owc);
                    dEZpvd = owc.EZpvd(this.values);
                    if (drawLineData.valueOf() != DrawLineData.LineType.H_LINE) {
                        this.fetchVPNInfo.add(KWHzl(own, owc, iValueOf, jAhwBna2, dEZpvd));
                        arrayList.addAll(this.fetchVPNInfo);
                        it = arrayListDxcTrN.iterator();
                        Intrinsics.checkNotNullExpressionValue(it, "");
                        while (it.hasNext()) {
                        }
                        DrawLineData drawLineData22 = DrawLineData.copydefault;
                        DrawLineData.LineType lineTypeValueOf6 = drawLineData22.valueOf();
                        Intrinsics.copydefault(lineTypeValueOf6);
                        oUJ ouj4 = oUJ.KWHzl;
                        DrawLineBean drawLineBeanAEQbTJ7 = ouj4.AEQbTJ();
                        if (drawLineBeanAEQbTJ7 == null) {
                        }
                        Intrinsics.copydefault((java.lang.Object) coinId);
                        DrawLineBean drawLineBeanAEQbTJ22 = ouj4.AEQbTJ();
                        if (drawLineBeanAEQbTJ22 == null) {
                        }
                        Intrinsics.copydefault(type);
                        arrayListDxcTrN.add(new DrawLineData.DrawLineItem(lineTypeValueOf6, coinId, type.intValue(), 0, arrayList, 0, drawLineData22.AEQbTJ(), drawLineData22.AhwBna(), drawLineData22.gEmmrt(), drawLineData22.djBIcL(), C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), drawLineData22.AYXKKw(), drawLineData22.KWHzl(), drawLineData22.copydefault()));
                        Intrinsics.copydefault(arrayListDxcTrN);
                        drawLineData22.KWHzl((DrawLineData.DrawLineItem) CollectionsKt___CollectionsKt.wlaJM(arrayListDxcTrN));
                        drawLineData22.EZpvd((DrawLineData.LineType) null);
                        c36250oUvDbNXlk = this.DbNXlk.DbNXlk();
                        if (c36250oUvDbNXlk != null) {
                        }
                        C36312oXc c36312oXc2 = this.DbNXlk;
                        c36312oXc2.EZpvd(c36312oXc2.AxsJAY);
                        own.AwvSrB();
                        this.fetchVPNInfo.clear();
                        taskDescriptionAuCTel = this.DbNXlk.DbNXlk().AuCTel();
                        if (taskDescriptionAuCTel != null) {
                        }
                        RxBus.KWHzl("kline_drawing_data_upload");
                    }
                    return false;
                }
                pUU.copydefault("StateDrawing", "timeline is null");
                return false;
            }
        }
        android.view.VelocityTracker velocityTracker = this.fJNWhG;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.fJNWhG = null;
        this.DbNXlk.DbNXlk().EZpvd(false);
        oWN own2 = C36246oUr.copydefault().DCJXGO().get(this.DbNXlk.DbNXlk().fIwbmz());
        if (own2 != null) {
            own2.gEmmrt();
            own2.EZpvd(false);
            own2.AwvSrB();
            own2.AEQbTJ(false);
        }
        if (this.DbNXlk.fARcdN() && !this.AuCTel && own2 != null && own2.wlaJM()) {
            own2.sSMYrx();
            this.DbNXlk.ejfBZ();
            this.DbNXlk.gEmmrt().KWHzl((int) motionEvent.getX(), this.DbNXlk.values());
        }
        this.AuCTel = false;
        if (own2 != null) {
            own2.AEQbTJ(false);
        }
        return false;
    }

    public final DrawLineData.Dot KWHzl(oWN own, oWC owc, int i, long j, double d) {
        DrawLineData.Dot dot = new DrawLineData.Dot(j, d);
        dot.setX(C33129mqd.AEQbTJ(java.lang.Float.valueOf(own.AYXKKw(i))));
        dot.setY(C33129mqd.AEQbTJ(java.lang.Integer.valueOf(owc.OLrzqt(d))));
        return dot;
    }

    @Override // o.oWO
    public void AEQbTJ(boolean z) {
        if (!z) {
            C36312oXc c36312oXc = this.DbNXlk;
            c36312oXc.EZpvd(c36312oXc.zLjUOn);
            C36246oUr.copydefault().valueOf(false);
            AhwBna();
        } else if (C36246oUr.copydefault().QwvEab()) {
            AhwBna();
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

    public final void EZpvd(java.util.ArrayList<DrawLineData.DrawLineItem> arrayList, java.util.ArrayList<DrawLineData.Dot> arrayList2, oWN own) {
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
            java.util.ArrayList<DrawLineData.Dot> arrayList3 = this.fetchVPNInfo;
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
        C36250oUv c36250oUvDbNXlk = this.DbNXlk.DbNXlk();
        if (c36250oUvDbNXlk != null) {
            c36250oUvDbNXlk.invalidate();
        }
        C36312oXc c36312oXc = this.DbNXlk;
        c36312oXc.EZpvd(c36312oXc.AxsJAY);
        own.AwvSrB();
        this.fetchVPNInfo.clear();
        C36246oUr.copydefault().AhwBna();
        C36250oUv c36250oUvDbNXlk2 = this.DbNXlk.DbNXlk();
        if (c36250oUvDbNXlk2 != null && (taskDescriptionAuCTel = c36250oUvDbNXlk2.AuCTel()) != null) {
            taskDescriptionAuCTel.AEQbTJ();
        }
        RxBus.KWHzl("kline_drawing_data_upload");
    }

    public final void copydefault() {
        C36250oUv.TaskDescription taskDescriptionAuCTel;
        if (C33129mqd.KWHzl((java.util.Collection) this.fetchVPNInfo)) {
            C56406yEe.getFieldNames(DrawLineData.copydefault.EZpvd());
            java.util.ArrayList<DrawLineData.DrawLineItem> arrayListDxcTrN = C36246oUr.copydefault().dxcTrN();
            Intrinsics.checkNotNullExpressionValue(arrayListDxcTrN, "");
            C56406yEe.getFieldNames(arrayListDxcTrN);
            this.fetchVPNInfo.clear();
            C36250oUv c36250oUvDbNXlk = this.DbNXlk.DbNXlk();
            if (c36250oUvDbNXlk != null && (taskDescriptionAuCTel = c36250oUvDbNXlk.AuCTel()) != null) {
                taskDescriptionAuCTel.AEQbTJ();
            }
        }
        C36250oUv c36250oUvDbNXlk2 = this.DbNXlk.DbNXlk();
        if (c36250oUvDbNXlk2 != null) {
            c36250oUvDbNXlk2.invalidate();
        }
        C36246oUr.copydefault().AhwBna();
    }

    public final void AhwBna() {
        oWN own = C36246oUr.copydefault().DCJXGO().get("ds0");
        if (own != null) {
            own.AwvSrB();
        }
        DrawLineData.copydefault.EZpvd((DrawLineData.LineType) null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oWQ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static final Unit EZpvd(java.util.ArrayList arrayList) {
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
