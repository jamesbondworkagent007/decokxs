package o;

import android.graphics.RectF;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.data.KlineQuickOrderPriceBean;
import com.okinc.kline.library.data.ChartViewOutSideConfig;
import com.okinc.kline.library.template.TemplateSetting;
import com.okinc.unify_trade.biz.BotWebHook;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oWP extends oWO {
    public static final Activity Companion = new Activity(null);
    public static final int djBIcL = 8;
    public android.view.VelocityTracker AkhnZx;
    public C36312oXc DbNXlk;
    public final long fJNWhG;
    public float fetchVPNInfo;
    public boolean gEmmrt;
    public boolean isConnected;
    public final InterfaceC56387yDm values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.oWO
    public java.lang.String KWHzl() {
        return "StateDrag";
    }

    @Override // o.oWO
    public void OLrzqt() {
    }

    public oWP(@NotNull C36312oXc c36312oXc) {
        Intrinsics.checkNotNullParameter(c36312oXc, "");
        this.DbNXlk = c36312oXc;
        this.fJNWhG = 50L;
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.oWT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return oWP.AYXKKw();
            }
        });
    }

    public static final C36246oUr AYXKKw() {
        return C36246oUr.copydefault();
    }

    public final C36246oUr valueOf() {
        return (C36246oUr) this.values.getValue();
    }

    @Override // o.oWO
    public boolean AYXKKw(@NotNull android.view.MotionEvent motionEvent) {
        C36250oUv c36250oUvDbNXlk;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        super.AYXKKw(motionEvent);
        C36250oUv c36250oUvDbNXlk2 = this.DbNXlk.DbNXlk();
        if (c36250oUvDbNXlk2 != null && c36250oUvDbNXlk2.isConnected() == 1 && (c36250oUvDbNXlk = this.DbNXlk.DbNXlk()) != null && c36250oUvDbNXlk.OcIXYQ()) {
            C36312oXc c36312oXc = this.DbNXlk;
            c36312oXc.EZpvd(c36312oXc.wlaJM);
        } else {
            C36312oXc c36312oXc2 = this.DbNXlk;
            c36312oXc2.EZpvd(c36312oXc2.zLjUOn);
        }
        this.DbNXlk.OLrzqt(false);
        this.DbNXlk.KWHzl(false);
        this.DbNXlk.copydefault(false);
        this.isConnected = false;
        this.fetchVPNInfo = 0.0f;
        AkhnZx();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x015d A[PHI: r5
  0x015d: PHI (r5v8 float) = (r5v7 float), (r5v9 float), (r5v10 float) binds: [B:66:0x015b, B:60:0x0147, B:54:0x0133] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.oWO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean DbNXlk(@NotNull android.view.MotionEvent motionEvent) {
        ChartViewOutSideConfig chartViewOutSideConfigAkhnZx;
        RectF rectFQfsBiF;
        float f;
        TemplateSetting templateSettingWlaJM;
        java.util.ArrayList<java.lang.String> sideIndicatorNames;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (this.DbNXlk.DbNXlk() != null) {
            numValueOf = null;
            numValueOf = null;
            java.lang.Integer numValueOf = null;
            if (this.DbNXlk.fJNWhG() || ((rectFQfsBiF = valueOf().iwGUEr().QfsBiF()) != null && rectFQfsBiF.contains(motionEvent.getX(), motionEvent.getY()) && !this.isConnected)) {
                KlineQuickOrderPriceBean klineQuickOrderPriceBeanDAIeex = valueOf().DAIeex();
                if (klineQuickOrderPriceBeanDAIeex != null) {
                    this.DbNXlk.OLrzqt(true);
                    oWC owc = valueOf().iwGUEr().QVAiDq().get("ds0.m");
                    java.lang.String s$default = owc != null ? C33129mqd.formatS$default(java.lang.Double.valueOf(owc.EZpvd((int) motionEvent.getY())), null, null, null, 7, null) : null;
                    klineQuickOrderPriceBeanDAIeex.setPrice(s$default != null ? s$default : "");
                    C36250oUv c36250oUvDbNXlk = this.DbNXlk.DbNXlk();
                    if (c36250oUvDbNXlk != null) {
                        c36250oUvDbNXlk.invalidate();
                    }
                    C36250oUv c36250oUvDbNXlk2 = this.DbNXlk.DbNXlk();
                    if (c36250oUvDbNXlk2 != null) {
                        c36250oUvDbNXlk2.KWHzl(klineQuickOrderPriceBeanDAIeex.getPrice());
                    }
                    fetchVPNInfo();
                }
            } else if ((this.DbNXlk.fIwbmz() || this.DbNXlk.AuCTel()) && !this.isConnected) {
                C36250oUv c36250oUvDbNXlk3 = this.DbNXlk.DbNXlk();
                if (c36250oUvDbNXlk3 != null) {
                    c36250oUvDbNXlk3.KWHzl(java.lang.Float.valueOf(motionEvent.getY()), this.DbNXlk.fIwbmz(), this.DbNXlk.AuCTel(), false);
                }
                C36250oUv c36250oUvDbNXlk4 = this.DbNXlk.DbNXlk();
                if (c36250oUvDbNXlk4 != null) {
                    c36250oUvDbNXlk4.invalidate();
                }
                this.fetchVPNInfo = motionEvent.getY();
                fetchVPNInfo();
            } else if (valueOf().gHZMYf().equals("YScale") && !this.DbNXlk.fJNWhG()) {
                if (Intrinsics.EZpvd((java.lang.Object) valueOf().flVtFt(), (java.lang.Object) "YMove")) {
                    float y = motionEvent.getY();
                    float fDjBIcL = this.DbNXlk.djBIcL();
                    C36250oUv c36250oUvDbNXlk5 = this.DbNXlk.DbNXlk();
                    if (c36250oUvDbNXlk5 != null && (templateSettingWlaJM = c36250oUvDbNXlk5.wlaJM()) != null && (sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames()) != null) {
                        numValueOf = java.lang.Integer.valueOf(sideIndicatorNames.size());
                    }
                    int height = this.DbNXlk.DbNXlk().getHeight();
                    if (!this.DbNXlk.DbNXlk().uzCIH().booleanValue()) {
                        int iAccept = C36246oUr.copydefault().accept();
                        Intrinsics.copydefault(numValueOf);
                        height -= iAccept * numValueOf.intValue();
                    }
                    float f2 = (y - fDjBIcL) / height;
                    int iIsConnected = this.DbNXlk.DbNXlk().isConnected();
                    if (this.DbNXlk.DbNXlk().uzCIH().booleanValue()) {
                        iIsConnected = 2;
                    }
                    if (iIsConnected == 0) {
                        f = 0.6f;
                        if (java.lang.Math.abs(f2) > 0.6f) {
                            if (f2 <= 0.0f) {
                                f2 = -0.6f;
                            }
                        }
                        valueOf().iwGUEr().KWHzl("Move");
                        valueOf().KWHzl(f2, iIsConnected);
                        this.DbNXlk.DbNXlk().invalidate();
                    } else if (iIsConnected != 1) {
                        if (iIsConnected == 2) {
                            f = 0.4f;
                            if (java.lang.Math.abs(f2) > 0.4f) {
                                f2 = f2 > 0.0f ? f : -0.4f;
                            }
                        }
                        valueOf().iwGUEr().KWHzl("Move");
                        valueOf().KWHzl(f2, iIsConnected);
                        this.DbNXlk.DbNXlk().invalidate();
                    } else {
                        f = 0.8f;
                        if (java.lang.Math.abs(f2) > 0.8f) {
                            if (f2 <= 0.0f) {
                                f2 = -0.8f;
                            }
                        }
                        valueOf().iwGUEr().KWHzl("Move");
                        valueOf().KWHzl(f2, iIsConnected);
                        this.DbNXlk.DbNXlk().invalidate();
                    }
                } else {
                    valueOf().iwGUEr().KWHzl("Move");
                    C36246oUr c36246oUrValueOf = valueOf();
                    Intrinsics.checkNotNullExpressionValue(c36246oUrValueOf, "");
                    EZpvd(motionEvent, c36246oUrValueOf);
                    C36246oUr c36246oUrValueOf2 = valueOf();
                    Intrinsics.checkNotNullExpressionValue(c36246oUrValueOf2, "");
                    KWHzl(motionEvent, c36246oUrValueOf2);
                    this.isConnected = true;
                    this.DbNXlk.DbNXlk().invalidate();
                }
            } else if (!this.DbNXlk.fJNWhG() && !this.DbNXlk.fIwbmz() && !this.DbNXlk.AuCTel()) {
                C36246oUr c36246oUrValueOf3 = valueOf();
                Intrinsics.checkNotNullExpressionValue(c36246oUrValueOf3, "");
                KWHzl(motionEvent, c36246oUrValueOf3);
                this.isConnected = true;
                this.DbNXlk.DbNXlk().invalidate();
            }
            C36250oUv c36250oUvDbNXlk6 = this.DbNXlk.DbNXlk();
            if (c36250oUvDbNXlk6 != null && (chartViewOutSideConfigAkhnZx = c36250oUvDbNXlk6.AkhnZx()) != null) {
                chartViewOutSideConfigAkhnZx.clearFastKLineBean();
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
            own.AubY();
            own.OLrzqt(0, 0);
            own.valueOf(own.fJNWhG());
        }
        C36250oUv c36250oUvDbNXlk = this.DbNXlk.DbNXlk();
        if (c36250oUvDbNXlk != null) {
            c36250oUvDbNXlk.EZpvd(true);
        }
        C36312oXc c36312oXc = this.DbNXlk;
        c36312oXc.EZpvd(c36312oXc.AwvSrB);
        return true;
    }

    @Override // o.oWO
    public boolean fetchVPNInfo(@NotNull android.view.MotionEvent motionEvent) {
        java.lang.String strFIwbmz;
        C36250oUv c36250oUvDbNXlk;
        java.lang.String price;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(motionEvent, "");
        this.isConnected = false;
        if (this.DbNXlk.fJNWhG()) {
            this.DbNXlk.OLrzqt(false);
            C36250oUv c36250oUvDbNXlk2 = this.DbNXlk.DbNXlk();
            if (c36250oUvDbNXlk2 != null) {
                KlineQuickOrderPriceBean klineQuickOrderPriceBeanDAIeex = C36246oUr.copydefault().DAIeex();
                if (klineQuickOrderPriceBeanDAIeex == null || (price = klineQuickOrderPriceBeanDAIeex.getPrice()) == null) {
                    price = "";
                }
                c36250oUvDbNXlk2.KWHzl(price);
            }
            C36250oUv c36250oUvDbNXlk3 = this.DbNXlk.DbNXlk();
            if (c36250oUvDbNXlk3 != null) {
                c36250oUvDbNXlk3.QVAiDq();
            }
            AkhnZx();
        }
        if (this.DbNXlk.fIwbmz() || this.DbNXlk.AuCTel()) {
            C36250oUv c36250oUvDbNXlk4 = this.DbNXlk.DbNXlk();
            if (c36250oUvDbNXlk4 != null) {
                c36250oUvDbNXlk4.KWHzl(java.lang.Float.valueOf(this.fetchVPNInfo), this.DbNXlk.fIwbmz(), this.DbNXlk.AuCTel(), true);
            }
            AkhnZx();
            this.DbNXlk.KWHzl(false);
            this.DbNXlk.copydefault(false);
        }
        android.view.VelocityTracker velocityTracker = this.AkhnZx;
        if (velocityTracker != null) {
            Intrinsics.copydefault(velocityTracker);
            velocityTracker.recycle();
            this.AkhnZx = null;
        }
        C36250oUv c36250oUvDbNXlk5 = this.DbNXlk.DbNXlk();
        if (c36250oUvDbNXlk5 != null) {
            c36250oUvDbNXlk5.EZpvd(false);
        }
        C36250oUv c36250oUvDbNXlk6 = this.DbNXlk.DbNXlk();
        if (c36250oUvDbNXlk6 != null && c36250oUvDbNXlk6.isConnected() == 1 && (c36250oUvDbNXlk = this.DbNXlk.DbNXlk()) != null && c36250oUvDbNXlk.OcIXYQ()) {
            C36312oXc c36312oXc = this.DbNXlk;
            c36312oXc.EZpvd(c36312oXc.wlaJM);
        } else {
            C36312oXc c36312oXc2 = this.DbNXlk;
            c36312oXc2.EZpvd(c36312oXc2.zLjUOn);
        }
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        if (c36246oUrCopydefault.gHZMYf().equals("YScale")) {
            djBIcL();
            c36246oUrCopydefault.Ufzxmz();
        }
        java.util.HashMap<java.lang.String, oWN> mapDCJXGO = c36246oUrCopydefault.DCJXGO();
        C36250oUv c36250oUvDbNXlk7 = this.DbNXlk.DbNXlk();
        if (c36250oUvDbNXlk7 != null && (strFIwbmz = c36250oUvDbNXlk7.fIwbmz()) != null) {
            str = strFIwbmz;
        }
        oWN own = mapDCJXGO.get(str);
        if (own != null) {
            own.gEmmrt();
            own.EZpvd(false);
            own.AwvSrB();
            own.AEQbTJ(false);
        }
        if (this.DbNXlk.fARcdN()) {
            if (c36246oUrCopydefault.gHZMYf().equals("NORMAL") && own != null) {
                if (own.wlaJM()) {
                    own.sSMYrx();
                    this.DbNXlk.ejfBZ();
                    this.DbNXlk.gEmmrt().KWHzl((int) motionEvent.getX(), this.DbNXlk.values());
                } else {
                    copydefault(own);
                    EZpvd(own);
                }
            }
        } else {
            copydefault(own);
            EZpvd(own);
        }
        if (c36246oUrCopydefault.zLjUOn().isCeFiMCapMode()) {
            AhwBna();
        } else {
            gEmmrt();
        }
        return false;
    }

    public final void copydefault(oWN own) {
        C36250oUv c36250oUvDbNXlk;
        if (C36246oUr.copydefault().UlJrfe() || own == null || own.isConnected() != 0 || (c36250oUvDbNXlk = this.DbNXlk.DbNXlk()) == null) {
            return;
        }
        c36250oUvDbNXlk.DTwDnp();
    }

    public final void EZpvd(oWN own) {
        C36250oUv c36250oUvDbNXlk;
        C36246oUr.copydefault().ixgjPv();
        Objects.toString(own != null ? java.lang.Integer.valueOf(own.AuCTel()) : null);
        if (C36246oUr.copydefault().ixgjPv()) {
            return;
        }
        if (!Intrinsics.EZpvd(own != null ? java.lang.Integer.valueOf(own.ejfBZ()) : null, own != null ? java.lang.Integer.valueOf(own.AuCTel()) : null) || (c36250oUvDbNXlk = this.DbNXlk.DbNXlk()) == null) {
            return;
        }
        c36250oUvDbNXlk.ORxRYg();
    }

    public final void djBIcL() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KLine_Chart_Yaxis_Scroll", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oWR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oWP.KWHzl((EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final void EZpvd(android.view.MotionEvent motionEvent, C36246oUr c36246oUr) {
        TemplateSetting templateSettingWlaJM;
        java.util.ArrayList<java.lang.String> sideIndicatorNames;
        float y = motionEvent.getY();
        float fDjBIcL = this.DbNXlk.djBIcL();
        C36250oUv c36250oUvDbNXlk = this.DbNXlk.DbNXlk();
        java.lang.Integer numValueOf = (c36250oUvDbNXlk == null || (templateSettingWlaJM = c36250oUvDbNXlk.wlaJM()) == null || (sideIndicatorNames = templateSettingWlaJM.getSideIndicatorNames()) == null) ? null : java.lang.Integer.valueOf(sideIndicatorNames.size());
        int height = this.DbNXlk.DbNXlk().getHeight();
        if (!this.DbNXlk.DbNXlk().uzCIH().booleanValue()) {
            int iAccept = C36246oUr.copydefault().accept();
            Intrinsics.copydefault(numValueOf);
            height -= iAccept * numValueOf.intValue();
        }
        float f = (y - fDjBIcL) / height;
        int iIsConnected = this.DbNXlk.DbNXlk().isConnected();
        if (this.DbNXlk.DbNXlk().uzCIH().booleanValue()) {
            iIsConnected = 2;
        }
        c36246oUr.copydefault(f, iIsConnected);
    }

    public final void KWHzl(android.view.MotionEvent motionEvent, C36246oUr c36246oUr) {
        java.lang.String strFIwbmz;
        float x = motionEvent.getX();
        float fCopydefault = this.DbNXlk.copydefault();
        C37932pGa c37932pGa = C37932pGa.AEQbTJ;
        c37932pGa.copydefault();
        c37932pGa.AEQbTJ();
        c37932pGa.KWHzl();
        c37932pGa.EZpvd();
        c37932pGa.OLrzqt();
        java.util.HashMap<java.lang.String, oWN> mapDCJXGO = c36246oUr.DCJXGO();
        C36250oUv c36250oUvDbNXlk = this.DbNXlk.DbNXlk();
        if (c36250oUvDbNXlk == null || (strFIwbmz = c36250oUvDbNXlk.fIwbmz()) == null) {
            strFIwbmz = "";
        }
        oWN own = mapDCJXGO.get(strFIwbmz);
        if (own != null) {
            own.AhwBna(x - fCopydefault);
            this.DbNXlk.copydefault(motionEvent.getX());
        }
        C36250oUv c36250oUvDbNXlk2 = this.DbNXlk.DbNXlk();
        if (c36250oUvDbNXlk2 != null) {
            c36250oUvDbNXlk2.invalidate();
        }
        if (this.AkhnZx == null) {
            this.AkhnZx = android.view.VelocityTracker.obtain();
        }
        android.view.VelocityTracker velocityTracker = this.AkhnZx;
        Intrinsics.copydefault(velocityTracker);
        velocityTracker.addMovement(motionEvent);
        android.view.VelocityTracker velocityTracker2 = this.AkhnZx;
        Intrinsics.copydefault(velocityTracker2);
        velocityTracker2.computeCurrentVelocity(1000, this.DbNXlk.AkhnZx());
        C36312oXc c36312oXc = this.DbNXlk;
        android.view.VelocityTracker velocityTracker3 = this.AkhnZx;
        Intrinsics.copydefault(velocityTracker3);
        c36312oXc.EZpvd((int) velocityTracker3.getXVelocity());
        C36250oUv c36250oUvDbNXlk3 = this.DbNXlk.DbNXlk();
        if (c36250oUvDbNXlk3 != null) {
            c36250oUvDbNXlk3.EZpvd(true);
        }
    }

    @Override // o.oWO
    public void EZpvd() {
        C36246oUr.copydefault().djBIcL();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oWP.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void gEmmrt() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KLine_Mid_Chart_Interact", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oWU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oWP.OLrzqt((EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(BotWebHook.KEY_ACTION, "scroll", true);
        eventParamsList.put("chart_location", "kline_page", true);
        eventParamsList.put("chart_type", "original", true);
        eventParamsList.put("terminal", "app", true);
        EventParamsList.put$default(eventParamsList, "is_cedefi", C36246oUr.copydefault().RKDWNf() ? "1" : "0", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        C32866mlf.onEvent$default("Chart_MarketCap_Chart_Scroll", (TrackChannel[]) null, new Function1() { // from class: o.oWS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return oWP.djBIcL((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public final void fetchVPNInfo() {
        if (this.gEmmrt) {
            return;
        }
        this.gEmmrt = true;
        C37932pGa c37932pGa = C37932pGa.AEQbTJ;
        android.content.Context contextAubY = C36246oUr.copydefault().AubY();
        Intrinsics.checkNotNullExpressionValue(contextAubY, "");
        c37932pGa.EZpvd(contextAubY, this.fJNWhG);
    }

    public final void AkhnZx() {
        if (this.gEmmrt) {
            this.gEmmrt = false;
            C37932pGa c37932pGa = C37932pGa.AEQbTJ;
            android.content.Context contextAubY = C36246oUr.copydefault().AubY();
            Intrinsics.checkNotNullExpressionValue(contextAubY, "");
            c37932pGa.EZpvd(contextAubY, this.fJNWhG);
        }
    }
}
