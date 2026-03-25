package o;

import android.graphics.RectF;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.data.KlineSpotAverageBean;
import com.okinc.unify_trade.biz.BotWebHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oXn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36323oXn extends oWO {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int djBIcL = 8;
    public final C36312oXc AkhnZx;
    public java.lang.String fetchVPNInfo;
    public final /* synthetic */ oUV gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.oWO
    public java.lang.String KWHzl() {
        return "StateWaitingDeal";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(@NotNull C36312oXc c36312oXc, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(c36312oXc, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt.KWHzl(c36312oXc, str);
    }

    public C36323oXn(@NotNull C36312oXc c36312oXc) {
        Intrinsics.checkNotNullParameter(c36312oXc, "");
        this.gEmmrt = new oUV();
        this.AkhnZx = c36312oXc;
        this.fetchVPNInfo = "ds0.m";
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d4  */
    @Override // o.oWO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean fetchVPNInfo(@NotNull android.view.MotionEvent motionEvent) {
        C36250oUv c36250oUvDbNXlk;
        C36250oUv c36250oUvDbNXlk2;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        copydefault();
        C37932pGa c37932pGa = C37932pGa.AEQbTJ;
        if (c37932pGa.AYXKKw()) {
            c37932pGa.copydefault();
            c37932pGa.AEQbTJ();
            c37932pGa.KWHzl();
            c37932pGa.EZpvd();
            c37932pGa.OLrzqt();
            C36250oUv c36250oUvDbNXlk3 = this.AkhnZx.DbNXlk();
            if (c36250oUvDbNXlk3 != null) {
                c36250oUvDbNXlk3.invalidate();
            }
            C36250oUv c36250oUvDbNXlk4 = this.AkhnZx.DbNXlk();
            if (c36250oUvDbNXlk4 != null && c36250oUvDbNXlk4.isConnected() == 1 && (c36250oUvDbNXlk2 = this.AkhnZx.DbNXlk()) != null && c36250oUvDbNXlk2.OcIXYQ()) {
                C36312oXc c36312oXc = this.AkhnZx;
                c36312oXc.EZpvd(c36312oXc.wlaJM);
            } else {
                C36312oXc c36312oXc2 = this.AkhnZx;
                c36312oXc2.EZpvd(c36312oXc2.zLjUOn);
            }
        } else if (java.lang.System.currentTimeMillis() - this.AkhnZx.AYXKKw() < 350) {
            C36312oXc c36312oXc3 = this.AkhnZx;
            c36312oXc3.EZpvd(c36312oXc3.AubY);
        } else {
            C36250oUv c36250oUvDbNXlk5 = this.AkhnZx.DbNXlk();
            if (c36250oUvDbNXlk5 != null && c36250oUvDbNXlk5.isConnected() == 1 && (c36250oUvDbNXlk = this.AkhnZx.DbNXlk()) != null && c36250oUvDbNXlk.OcIXYQ()) {
                C36312oXc c36312oXc4 = this.AkhnZx;
                c36312oXc4.EZpvd(c36312oXc4.wlaJM);
            } else {
                C36312oXc c36312oXc5 = this.AkhnZx;
                c36312oXc5.EZpvd(c36312oXc5.zLjUOn);
            }
            if (((java.lang.Boolean) valueOf(motionEvent).first).booleanValue()) {
                android.util.Pair<java.lang.Boolean, InterfaceC39510pth> pairValueOf = valueOf(motionEvent);
                if (((java.lang.Boolean) pairValueOf.first).booleanValue()) {
                    oWC owc = C36246oUr.copydefault().iwGUEr().QVAiDq().get(this.fetchVPNInfo);
                    if (!C33129mqd.AEQbTJ(((InterfaceC39510pth) pairValueOf.second).getAvgPx(), owc != null ? java.lang.Double.valueOf(owc.DbNXlk()) : 0)) {
                        if (C33129mqd.gEmmrt(((InterfaceC39510pth) pairValueOf.second).getAvgPx(), owc != null ? java.lang.Double.valueOf(owc.AkhnZx()) : 0)) {
                            if (pDN.AEQbTJ.EZpvd() && C36246oUr.copydefault().QXDzTk()) {
                                KWHzl(this.AkhnZx, ((InterfaceC39510pth) pairValueOf.second).getAvgPx());
                            }
                        }
                        AuCTel(motionEvent);
                        if (this.AkhnZx.DbNXlk() != null) {
                            this.AkhnZx.DbNXlk().invalidate();
                        }
                        djBIcL();
                    }
                }
            } else if (((java.lang.Boolean) gEmmrt(motionEvent).first).booleanValue()) {
                android.util.Pair<java.lang.Boolean, KlineSpotAverageBean> pairGEmmrt = gEmmrt(motionEvent);
                if (((java.lang.Boolean) pairGEmmrt.first).booleanValue()) {
                    oWC owc2 = C36246oUr.copydefault().iwGUEr().QVAiDq().get(this.fetchVPNInfo);
                    boolean zIsOpenAvgPx = ((KlineSpotAverageBean) pairGEmmrt.second).isOpenAvgPx();
                    KlineSpotAverageBean klineSpotAverageBean = (KlineSpotAverageBean) pairGEmmrt.second;
                    java.lang.String accAvgPx = zIsOpenAvgPx ? klineSpotAverageBean.getAccAvgPx() : klineSpotAverageBean.getOpenAvgPx();
                    if (C33129mqd.AEQbTJ(accAvgPx, owc2 != null ? java.lang.Double.valueOf(owc2.DbNXlk()) : 0)) {
                        if (pDN.AEQbTJ.EZpvd() && C36246oUr.copydefault().QXDzTk()) {
                            KWHzl(this.AkhnZx, accAvgPx);
                        }
                        ejfBZ(motionEvent);
                        if (this.AkhnZx.DbNXlk() != null) {
                            this.AkhnZx.DbNXlk().invalidate();
                        }
                        djBIcL();
                    } else {
                        if (C33129mqd.gEmmrt(accAvgPx, owc2 != null ? java.lang.Double.valueOf(owc2.AkhnZx()) : 0)) {
                        }
                        ejfBZ(motionEvent);
                        if (this.AkhnZx.DbNXlk() != null) {
                        }
                        djBIcL();
                    }
                }
            } else if (((java.lang.Boolean) djBIcL(motionEvent).first).booleanValue()) {
                fJNWhG(motionEvent);
                if (this.AkhnZx.DbNXlk() != null) {
                    this.AkhnZx.DbNXlk().invalidate();
                }
                djBIcL();
            } else if (((java.lang.Boolean) AEQbTJ(motionEvent).first).booleanValue()) {
                fIwbmz(motionEvent);
                if (this.AkhnZx.DbNXlk() != null) {
                    this.AkhnZx.DbNXlk().invalidate();
                }
                djBIcL();
            } else if (((java.lang.Boolean) OLrzqt(motionEvent).first).booleanValue()) {
                isConnected(motionEvent);
                if (this.AkhnZx.DbNXlk() != null) {
                    this.AkhnZx.DbNXlk().invalidate();
                }
                djBIcL();
            } else if (((java.lang.Boolean) EZpvd(motionEvent).first).booleanValue() && this.AkhnZx.DbNXlk() != null) {
                this.AkhnZx.DbNXlk().KWHzl((oLS) EZpvd(motionEvent).second);
                this.AkhnZx.DbNXlk().invalidate();
                KWHzl((oLS) EZpvd(motionEvent).second);
            }
        }
        this.AkhnZx.AEQbTJ(motionEvent.getX());
        this.AkhnZx.KWHzl(motionEvent.getY());
        return super.fetchVPNInfo(motionEvent);
    }

    public final void djBIcL() {
        if (C36246oUr.copydefault().QXDzTk()) {
            C36312oXc c36312oXc = this.AkhnZx;
            c36312oXc.EZpvd(c36312oXc.sSMYrx);
        }
    }

    @Override // o.oWO
    public boolean AYXKKw(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        super.AYXKKw(motionEvent);
        C36312oXc c36312oXc = this.AkhnZx;
        c36312oXc.EZpvd(c36312oXc.zLjUOn);
        C36246oUr.copydefault().djBIcL();
        return false;
    }

    @Override // o.oWO
    public boolean values(@NotNull android.view.MotionEvent motionEvent) {
        android.content.Context contextAubY;
        oWN own;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        if (motionEvent.getPointerCount() > 2) {
            return true;
        }
        this.AkhnZx.EZpvd(C36326oXq.copydefault(motionEvent));
        float fFetchVPNInfo = this.AkhnZx.fetchVPNInfo();
        C36250oUv c36250oUvDbNXlk = this.AkhnZx.DbNXlk();
        if (c36250oUvDbNXlk == null || (contextAubY = c36250oUvDbNXlk.getContext()) == null) {
            contextAubY = C36246oUr.copydefault().AubY();
        }
        if (fFetchVPNInfo > android.view.ViewConfiguration.get(contextAubY).getScaledTouchSlop() && (own = C36246oUr.copydefault().DCJXGO().get("ds0")) != null) {
            own.AxsJAY();
        }
        C36250oUv c36250oUvDbNXlk2 = this.AkhnZx.DbNXlk();
        if (c36250oUvDbNXlk2 != null) {
            c36250oUvDbNXlk2.EZpvd(true);
        }
        C36312oXc c36312oXc = this.AkhnZx;
        c36312oXc.EZpvd(c36312oXc.AwvSrB);
        return true;
    }

    @Override // o.oWO
    public boolean DbNXlk(@NotNull android.view.MotionEvent motionEvent) {
        RectF rectFGHZMYf;
        RectF rectFSSMYrx;
        RectF rectFQfsBiF;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        super.DbNXlk(motionEvent);
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        boolean z = java.lang.Math.abs(motionEvent.getY() - this.AkhnZx.djBIcL()) > ((float) this.valueOf);
        if ((this.AkhnZx.fJNWhG() || ((rectFQfsBiF = c36246oUrCopydefault.iwGUEr().QfsBiF()) != null && rectFQfsBiF.contains(motionEvent.getX(), motionEvent.getY()))) && z) {
            C36250oUv c36250oUvDbNXlk = this.AkhnZx.DbNXlk();
            if (c36250oUvDbNXlk != null) {
                c36250oUvDbNXlk.EZpvd(true);
            }
            C36312oXc c36312oXc = this.AkhnZx;
            c36312oXc.EZpvd(c36312oXc.iwGUEr);
            return true;
        }
        if ((this.AkhnZx.fIwbmz() || this.AkhnZx.AuCTel()) && z) {
            C36250oUv c36250oUvDbNXlk2 = this.AkhnZx.DbNXlk();
            if (c36250oUvDbNXlk2 != null) {
                c36250oUvDbNXlk2.EZpvd(true);
            }
            C36312oXc c36312oXc2 = this.AkhnZx;
            c36312oXc2.EZpvd(c36312oXc2.iwGUEr);
            return true;
        }
        if (java.lang.Math.abs(motionEvent.getX() - this.AkhnZx.copydefault()) == java.lang.Math.abs(motionEvent.getY() - this.AkhnZx.djBIcL()) || (java.lang.Math.abs(motionEvent.getX() - this.AkhnZx.copydefault()) < this.valueOf && java.lang.Math.abs(motionEvent.getY() - this.AkhnZx.djBIcL()) < this.valueOf)) {
            return true;
        }
        if (java.lang.Math.abs(motionEvent.getX() - this.AkhnZx.copydefault()) > java.lang.Math.abs(motionEvent.getY() - this.AkhnZx.djBIcL())) {
            c36246oUrCopydefault.fIwbmz("XMove");
            C36250oUv c36250oUvDbNXlk3 = this.AkhnZx.DbNXlk();
            if (c36250oUvDbNXlk3 != null) {
                c36250oUvDbNXlk3.EZpvd(true);
            }
            C36312oXc c36312oXc3 = this.AkhnZx;
            c36312oXc3.EZpvd(c36312oXc3.iwGUEr);
        } else {
            if (c36246oUrCopydefault.hUfVAv() == 1) {
                C36250oUv c36250oUvDbNXlk4 = this.AkhnZx.DbNXlk();
                if (c36250oUvDbNXlk4 != null) {
                    c36250oUvDbNXlk4.EZpvd(false);
                }
                C36312oXc c36312oXc4 = this.AkhnZx;
                c36312oXc4.EZpvd(c36312oXc4.zLjUOn);
                return true;
            }
            if (!c36246oUrCopydefault.zblBkD()) {
                C36250oUv c36250oUvDbNXlk5 = this.AkhnZx.DbNXlk();
                if (c36250oUvDbNXlk5 != null) {
                    c36250oUvDbNXlk5.EZpvd(false);
                }
                C36312oXc c36312oXc5 = this.AkhnZx;
                c36312oXc5.EZpvd(c36312oXc5.zLjUOn);
                return true;
            }
            if (Intrinsics.EZpvd((java.lang.Object) c36246oUrCopydefault.fZBcTu(), (java.lang.Object) "nft_mode")) {
                C36250oUv c36250oUvDbNXlk6 = this.AkhnZx.DbNXlk();
                if (c36250oUvDbNXlk6 != null) {
                    c36250oUvDbNXlk6.EZpvd(false);
                }
                C36312oXc c36312oXc6 = this.AkhnZx;
                c36312oXc6.EZpvd(c36312oXc6.zLjUOn);
                return true;
            }
            if (!pDN.AEQbTJ.EZpvd()) {
                C36250oUv c36250oUvDbNXlk7 = this.AkhnZx.DbNXlk();
                if (c36250oUvDbNXlk7 != null) {
                    c36250oUvDbNXlk7.EZpvd(false);
                }
                C36312oXc c36312oXc7 = this.AkhnZx;
                c36312oXc7.EZpvd(c36312oXc7.zLjUOn);
                return true;
            }
            if (c36246oUrCopydefault.iwGUEr().sSMYrx() != null && (rectFSSMYrx = c36246oUrCopydefault.iwGUEr().sSMYrx()) != null && rectFSSMYrx.contains(motionEvent.getX(), motionEvent.getY())) {
                c36246oUrCopydefault.DbNXlk("YScale");
                c36246oUrCopydefault.Ufzxmz();
                c36246oUrCopydefault.fIwbmz("YMove");
                C36250oUv c36250oUvDbNXlk8 = this.AkhnZx.DbNXlk();
                if (c36250oUvDbNXlk8 != null) {
                    c36250oUvDbNXlk8.EZpvd(true);
                }
                C36312oXc c36312oXc8 = this.AkhnZx;
                c36312oXc8.EZpvd(c36312oXc8.iwGUEr);
            } else if (c36246oUrCopydefault.iwGUEr().gHZMYf() != null && (rectFGHZMYf = c36246oUrCopydefault.iwGUEr().gHZMYf()) != null && rectFGHZMYf.contains(motionEvent.getX(), motionEvent.getY())) {
                if (c36246oUrCopydefault.gHZMYf().equals("YScale")) {
                    c36246oUrCopydefault.fIwbmz(" YUPDOWNMOVE");
                    c36246oUrCopydefault.Ufzxmz();
                    C36250oUv c36250oUvDbNXlk9 = this.AkhnZx.DbNXlk();
                    if (c36250oUvDbNXlk9 != null) {
                        c36250oUvDbNXlk9.EZpvd(true);
                    }
                    C36312oXc c36312oXc9 = this.AkhnZx;
                    c36312oXc9.EZpvd(c36312oXc9.iwGUEr);
                }
            } else {
                C36250oUv c36250oUvDbNXlk10 = this.AkhnZx.DbNXlk();
                if (c36250oUvDbNXlk10 != null) {
                    c36250oUvDbNXlk10.EZpvd(false);
                }
                C36312oXc c36312oXc10 = this.AkhnZx;
                c36312oXc10.EZpvd(c36312oXc10.zLjUOn);
            }
        }
        return true;
    }

    @Override // o.oWO
    public boolean AEQbTJ() {
        C36312oXc c36312oXc = this.AkhnZx;
        c36312oXc.EZpvd(c36312oXc.AubY);
        return false;
    }

    @Override // o.oWO
    public void OLrzqt() {
        super.OLrzqt();
    }

    /* JADX INFO: renamed from: o.oXn$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oXn.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void copydefault() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KLine_Mid_Chart_Interact", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oXk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36323oXn.OLrzqt((EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(BotWebHook.KEY_ACTION, "click", true);
        eventParamsList.put("chart_location", "kline_page", true);
        eventParamsList.put("chart_type", "original", true);
        eventParamsList.put("terminal", "app", true);
        EventParamsList.put$default(eventParamsList, "is_cedefi", C36246oUr.copydefault().RKDWNf() ? "1" : "0", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(oLS ols) {
        final java.lang.String str = (ols == null || C33129mqd.AEQbTJ(java.lang.Long.valueOf(ols.KWHzl()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))) ? "upcoming_events" : "past_events";
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Chart_Calendar_Icon_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oXm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36323oXn.OLrzqt(str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("economic_events", str, true);
        return Unit.INSTANCE;
    }
}
