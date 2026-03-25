package o;

import android.graphics.RectF;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.kline.data.KlineSpotAverageBean;
import com.okinc.kline.util.KlineTradeDragType;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oXj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36319oXj extends oWO {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int gEmmrt = 8;
    public boolean AkhnZx;
    public KlineOpenOrderBean AuCTel;
    public InterfaceC39510pth DbNXlk;
    public KlineOpenOrderBean djBIcL;
    public C36312oXc ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public KlineSpotAverageBean fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public boolean fetchVPNInfo;
    public KlineTradeDragType isConnected;
    public final long iwGUEr;
    public boolean values;

    /* JADX INFO: renamed from: o.oXj$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[KlineTradeDragType.values().length];
            try {
                iArr[KlineTradeDragType.ORDER_SL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[KlineTradeDragType.ORDER_TP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[KlineTradeDragType.CURRENT_ORDER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[KlineTradeDragType.COST_SL.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[KlineTradeDragType.COST_TP.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[KlineTradeDragType.SPOT_TP.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[KlineTradeDragType.SPOT_SL.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[KlineTradeDragType.ORDER_CANCEL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[KlineTradeDragType.COST_CANCEL.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[KlineTradeDragType.COST_OPPOSITE.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[KlineTradeDragType.SPOT_CANCEL.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[KlineTradeDragType.NONE.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.oWO
    public java.lang.String KWHzl() {
        return "StateMoveOpenOrderLine";
    }

    public C36319oXj(@NotNull C36312oXc c36312oXc) {
        Intrinsics.checkNotNullParameter(c36312oXc, "");
        this.ejfBZ = c36312oXc;
        this.fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.oXi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36319oXj.djBIcL();
            }
        });
        this.fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.oXh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C36319oXj.OLrzqt(this.KWHzl);
            }
        });
        this.iwGUEr = 50L;
        this.isConnected = KlineTradeDragType.NONE;
    }

    /* JADX INFO: renamed from: o.oXj$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oXj.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    private final C36246oUr AYXKKw() {
        return (C36246oUr) this.fARcdN.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C36246oUr djBIcL() {
        return C36246oUr.copydefault();
    }

    public final oWC AhwBna() {
        return (oWC) this.fJNWhG.getValue();
    }

    public static final oWC OLrzqt(C36319oXj c36319oXj) {
        return c36319oXj.AYXKKw().iwGUEr().QVAiDq().get("ds0.m");
    }

    @Override // o.oWO
    public boolean AhwBna(@NotNull android.view.MotionEvent motionEvent) {
        java.lang.String tpOrdPx;
        java.lang.String tpOrdPx2;
        java.lang.String slOrdPx;
        java.lang.String slOrdPx2;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        super.AhwBna(motionEvent);
        this.AhwBna = -1;
        this.AkhnZx = false;
        this.values = false;
        this.djBIcL = null;
        this.DbNXlk = null;
        this.fIwbmz = null;
        this.isConnected = KlineTradeDragType.NONE;
        if (((java.lang.Boolean) fARcdN(motionEvent).first).booleanValue()) {
            this.isConnected = KlineTradeDragType.COST_CANCEL;
            InterfaceC39510pth interfaceC39510pth = (InterfaceC39510pth) fARcdN(motionEvent).second;
            this.DbNXlk = interfaceC39510pth;
            copydefault(interfaceC39510pth);
        } else if (((java.lang.Boolean) uzCIH(motionEvent).first).booleanValue()) {
            this.isConnected = KlineTradeDragType.COST_OPPOSITE;
            InterfaceC39510pth interfaceC39510pth2 = (InterfaceC39510pth) uzCIH(motionEvent).second;
            this.DbNXlk = interfaceC39510pth2;
            copydefault(interfaceC39510pth2);
        } else if (((java.lang.Boolean) getNewProxyInstance(motionEvent).first).booleanValue()) {
            this.isConnected = KlineTradeDragType.COST_SL;
            InterfaceC39510pth interfaceC39510pth3 = (InterfaceC39510pth) getNewProxyInstance(motionEvent).second;
            this.DbNXlk = interfaceC39510pth3;
            copydefault(false, interfaceC39510pth3);
            C36250oUv c36250oUvDbNXlk = this.ejfBZ.DbNXlk();
            if (c36250oUvDbNXlk != null) {
                c36250oUvDbNXlk.EZpvd(true);
            }
            EZpvd(this.AuCTel);
        } else if (((java.lang.Boolean) hDKMBd(motionEvent).first).booleanValue()) {
            this.isConnected = KlineTradeDragType.COST_TP;
            InterfaceC39510pth interfaceC39510pth4 = (InterfaceC39510pth) hDKMBd(motionEvent).second;
            this.DbNXlk = interfaceC39510pth4;
            copydefault(true, interfaceC39510pth4);
            C36250oUv c36250oUvDbNXlk2 = this.ejfBZ.DbNXlk();
            if (c36250oUvDbNXlk2 != null) {
                c36250oUvDbNXlk2.EZpvd(true);
            }
            EZpvd(this.AuCTel);
        } else if (((java.lang.Boolean) valueOf(motionEvent).first).booleanValue()) {
            this.isConnected = KlineTradeDragType.CURRENT_COST;
            InterfaceC39510pth interfaceC39510pth5 = (InterfaceC39510pth) valueOf(motionEvent).second;
            this.DbNXlk = interfaceC39510pth5;
            copydefault(interfaceC39510pth5);
        } else if (((java.lang.Boolean) gEmmrt(motionEvent).first).booleanValue()) {
            this.isConnected = KlineTradeDragType.SPOT_CLICK;
            KlineSpotAverageBean klineSpotAverageBean = (KlineSpotAverageBean) gEmmrt(motionEvent).second;
            this.fIwbmz = klineSpotAverageBean;
            copydefault(klineSpotAverageBean);
        } else if (((java.lang.Boolean) zLjUOn(motionEvent).first).booleanValue()) {
            this.isConnected = KlineTradeDragType.SPOT_SL;
            KlineSpotAverageBean klineSpotAverageBean2 = (KlineSpotAverageBean) zLjUOn(motionEvent).second;
            this.fIwbmz = klineSpotAverageBean2;
            OLrzqt(false, klineSpotAverageBean2);
            KlineSpotAverageBean klineSpotAverageBean3 = this.fIwbmz;
            if (klineSpotAverageBean3 != null) {
                if (klineSpotAverageBean3 != null) {
                    java.lang.String accAvgPx = "";
                    klineSpotAverageBean3.setSlOrdPx(accAvgPx);
                } else {
                    java.lang.String accAvgPx2 = "";
                    klineSpotAverageBean3.setSlOrdPx(accAvgPx2);
                }
            }
            KlineSpotAverageBean klineSpotAverageBean4 = this.fIwbmz;
            if (klineSpotAverageBean4 != null) {
                klineSpotAverageBean4.setTpOrdPx("");
            }
            C37932pGa c37932pGa = C37932pGa.AEQbTJ;
            KlineSpotAverageBean klineSpotAverageBean5 = this.fIwbmz;
            if (klineSpotAverageBean5 == null || (slOrdPx = klineSpotAverageBean5.getSlOrdPx()) == null) {
                slOrdPx = "";
            }
            if (c37932pGa.OLrzqt(slOrdPx)) {
                KlineSpotAverageBean klineSpotAverageBean6 = this.fIwbmz;
                if (klineSpotAverageBean6 != null) {
                    if (klineSpotAverageBean6 == null || (slOrdPx2 = klineSpotAverageBean6.getSlOrdPx()) == null) {
                        slOrdPx2 = "";
                    }
                    klineSpotAverageBean6.setTpOrdPx(slOrdPx2);
                }
                KlineSpotAverageBean klineSpotAverageBean7 = this.fIwbmz;
                if (klineSpotAverageBean7 != null) {
                    klineSpotAverageBean7.setSlOrdPx("");
                }
            }
            C36250oUv c36250oUvDbNXlk3 = this.ejfBZ.DbNXlk();
            if (c36250oUvDbNXlk3 != null) {
                c36250oUvDbNXlk3.EZpvd(true);
            }
            OLrzqt(this.AuCTel);
        } else if (((java.lang.Boolean) wlaJM(motionEvent).first).booleanValue()) {
            this.isConnected = KlineTradeDragType.SPOT_TP;
            KlineSpotAverageBean klineSpotAverageBean8 = (KlineSpotAverageBean) wlaJM(motionEvent).second;
            this.fIwbmz = klineSpotAverageBean8;
            OLrzqt(true, klineSpotAverageBean8);
            KlineSpotAverageBean klineSpotAverageBean9 = this.fIwbmz;
            if (klineSpotAverageBean9 != null) {
                if (klineSpotAverageBean9 != null) {
                    java.lang.String accAvgPx3 = "";
                    klineSpotAverageBean9.setTpOrdPx(accAvgPx3);
                } else {
                    java.lang.String accAvgPx32 = "";
                    klineSpotAverageBean9.setTpOrdPx(accAvgPx32);
                }
            }
            KlineSpotAverageBean klineSpotAverageBean10 = this.fIwbmz;
            if (klineSpotAverageBean10 != null) {
                klineSpotAverageBean10.setSlOrdPx("");
            }
            C37932pGa c37932pGa2 = C37932pGa.AEQbTJ;
            KlineSpotAverageBean klineSpotAverageBean11 = this.fIwbmz;
            if (klineSpotAverageBean11 == null || (tpOrdPx = klineSpotAverageBean11.getTpOrdPx()) == null) {
                tpOrdPx = "";
            }
            if (!c37932pGa2.OLrzqt(tpOrdPx)) {
                KlineSpotAverageBean klineSpotAverageBean12 = this.fIwbmz;
                if (klineSpotAverageBean12 != null) {
                    if (klineSpotAverageBean12 == null || (tpOrdPx2 = klineSpotAverageBean12.getTpOrdPx()) == null) {
                        tpOrdPx2 = "";
                    }
                    klineSpotAverageBean12.setSlOrdPx(tpOrdPx2);
                }
                KlineSpotAverageBean klineSpotAverageBean13 = this.fIwbmz;
                if (klineSpotAverageBean13 != null) {
                    klineSpotAverageBean13.setTpOrdPx("");
                }
            }
            C36250oUv c36250oUvDbNXlk4 = this.ejfBZ.DbNXlk();
            if (c36250oUvDbNXlk4 != null) {
                c36250oUvDbNXlk4.EZpvd(true);
            }
            OLrzqt(this.AuCTel);
        } else if (((java.lang.Boolean) AuCTelauCTel(motionEvent).first).booleanValue()) {
            this.isConnected = KlineTradeDragType.SPOT_CANCEL;
            this.fIwbmz = (KlineSpotAverageBean) AuCTelauCTel(motionEvent).second;
        } else if (((java.lang.Boolean) iwGUEr(motionEvent).first).booleanValue()) {
            this.isConnected = KlineTradeDragType.ORDER_CANCEL;
            KlineOpenOrderBean klineOpenOrderBean = (KlineOpenOrderBean) iwGUEr(motionEvent).second;
            this.djBIcL = klineOpenOrderBean;
            EZpvd(klineOpenOrderBean);
        } else if (((java.lang.Boolean) getFieldNames(motionEvent).first).booleanValue()) {
            this.isConnected = KlineTradeDragType.ORDER_SL;
            KlineOpenOrderBean klineOpenOrderBean2 = (KlineOpenOrderBean) getFieldNames(motionEvent).second;
            this.djBIcL = klineOpenOrderBean2;
            if (klineOpenOrderBean2 != null) {
                klineOpenOrderBean2.setDragging(true);
            }
            copydefault(false, this.djBIcL);
            C36250oUv c36250oUvDbNXlk5 = this.ejfBZ.DbNXlk();
            if (c36250oUvDbNXlk5 != null) {
                c36250oUvDbNXlk5.EZpvd(true);
            }
            EZpvd(this.AuCTel);
        } else if (((java.lang.Boolean) AubY(motionEvent).first).booleanValue()) {
            this.isConnected = KlineTradeDragType.ORDER_TP;
            KlineOpenOrderBean klineOpenOrderBean3 = (KlineOpenOrderBean) AubY(motionEvent).second;
            this.djBIcL = klineOpenOrderBean3;
            if (klineOpenOrderBean3 != null) {
                klineOpenOrderBean3.setDragging(true);
            }
            copydefault(true, this.djBIcL);
            C36250oUv c36250oUvDbNXlk6 = this.ejfBZ.DbNXlk();
            if (c36250oUvDbNXlk6 != null) {
                c36250oUvDbNXlk6.EZpvd(true);
            }
            EZpvd(this.AuCTel);
        } else if (((java.lang.Boolean) djBIcL(motionEvent).first).booleanValue()) {
            this.isConnected = KlineTradeDragType.CURRENT_ORDER_CLICK;
            KlineOpenOrderBean klineOpenOrderBean4 = (KlineOpenOrderBean) djBIcL(motionEvent).second;
            this.djBIcL = klineOpenOrderBean4;
            if (klineOpenOrderBean4 != null) {
                klineOpenOrderBean4.setChangePrice(true);
            }
            KlineOpenOrderBean klineOpenOrderBean5 = this.djBIcL;
            if (klineOpenOrderBean5 != null) {
                if (klineOpenOrderBean5.isOrderCanDrag() && klineOpenOrderBean5.getSelected() && klineOpenOrderBean5.getShowSolid()) {
                    this.isConnected = KlineTradeDragType.CURRENT_ORDER;
                    KlineOpenOrderBean klineOpenOrderBean6 = new KlineOpenOrderBean();
                    klineOpenOrderBean6.setPrice(klineOpenOrderBean5.getPrice());
                    klineOpenOrderBean6.setOriginPos(klineOpenOrderBean5.getOriginPos());
                    this.AuCTel = klineOpenOrderBean6;
                    klineOpenOrderBean5.setShowDragCircle(true);
                    C36250oUv c36250oUvDbNXlk7 = this.ejfBZ.DbNXlk();
                    if (c36250oUvDbNXlk7 != null) {
                        c36250oUvDbNXlk7.EZpvd(true);
                    }
                }
                EZpvd(klineOpenOrderBean5);
            }
        } else if (((java.lang.Boolean) AEQbTJ(motionEvent).first).booleanValue()) {
            this.isConnected = KlineTradeDragType.COST_LIQ;
            InterfaceC39510pth interfaceC39510pth6 = (InterfaceC39510pth) AEQbTJ(motionEvent).second;
            this.DbNXlk = interfaceC39510pth6;
            OLrzqt(interfaceC39510pth6);
        } else if (((java.lang.Boolean) OLrzqt(motionEvent).first).booleanValue()) {
            this.isConnected = KlineTradeDragType.COST_BE;
            InterfaceC39510pth interfaceC39510pth7 = (InterfaceC39510pth) OLrzqt(motionEvent).second;
            this.DbNXlk = interfaceC39510pth7;
            KWHzl(interfaceC39510pth7);
        }
        oWN own = AYXKKw().DCJXGO().get("ds0");
        if (own == null) {
            return true;
        }
        own.sSMYrx();
        this.ejfBZ.EZpvd(java.lang.System.currentTimeMillis());
        this.ejfBZ.copydefault(motionEvent.getX());
        this.ejfBZ.OLrzqt(motionEvent.getY());
        return false;
    }

    @Override // o.oWO
    public boolean DbNXlk(@NotNull android.view.MotionEvent motionEvent) {
        java.lang.String price;
        java.lang.String price2;
        java.lang.String price3;
        C36250oUv c36250oUvDbNXlk;
        java.lang.String pnl;
        C36250oUv c36250oUvDbNXlk2;
        C36250oUv c36250oUvDbNXlk3;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        super.DbNXlk(motionEvent);
        if (this.isConnected == KlineTradeDragType.NONE) {
            if (java.lang.Math.abs(motionEvent.getX() - this.ejfBZ.copydefault()) < java.lang.Math.abs(motionEvent.getY() - this.ejfBZ.djBIcL())) {
                C36250oUv c36250oUvDbNXlk4 = this.ejfBZ.DbNXlk();
                if (c36250oUvDbNXlk4 != null) {
                    c36250oUvDbNXlk4.EZpvd(false);
                }
                gEmmrt();
                return true;
            }
            C36250oUv c36250oUvDbNXlk5 = this.ejfBZ.DbNXlk();
            if (c36250oUvDbNXlk5 != null) {
                c36250oUvDbNXlk5.EZpvd(false);
            }
            C36312oXc c36312oXc = this.ejfBZ;
            c36312oXc.EZpvd(c36312oXc.gHZMYf);
            return true;
        }
        if (java.lang.Math.abs(motionEvent.getY() - this.ejfBZ.djBIcL()) <= this.valueOf) {
            return true;
        }
        KlineOpenOrderBean klineOpenOrderBean = this.djBIcL;
        if (klineOpenOrderBean != null) {
            int i = ActionBar.KWHzl[this.isConnected.ordinal()];
            if (i == 1 || i == 2) {
                this.AkhnZx = true;
                C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
                if (!this.values) {
                    c36246oUrCopydefault.gasjUx().add(this.AuCTel);
                    this.values = true;
                }
                oWC owcAhwBna = AhwBna();
                if (owcAhwBna != null) {
                    float y = motionEvent.getY();
                    float fDjBIcL = this.ejfBZ.djBIcL();
                    KlineOpenOrderBean klineOpenOrderBean2 = this.AuCTel;
                    if (klineOpenOrderBean2 != null) {
                        klineOpenOrderBean2.setPrice(C33129mqd.addS$default(klineOpenOrderBean.getPrice(), C33129mqd.mulS$default(java.lang.Float.valueOf(y - fDjBIcL), C33129mqd.divS$default(C33129mqd.subS$default(java.lang.Double.valueOf(owcAhwBna.EZpvd(owcAhwBna.uzCIH())), java.lang.Double.valueOf(owcAhwBna.EZpvd(owcAhwBna.gEmmrt())), null, null, null, 14, null), java.lang.Integer.valueOf(owcAhwBna.uzCIH() - owcAhwBna.gEmmrt()), null, null, null, 14, null), null, null, null, 14, null), null, null, null, 14, null));
                    }
                    klineOpenOrderBean.setShowSolid(false);
                    KlineOpenOrderBean klineOpenOrderBean3 = this.AuCTel;
                    if (klineOpenOrderBean3 != null && (c36250oUvDbNXlk2 = this.ejfBZ.DbNXlk()) != null) {
                        c36250oUvDbNXlk2.copydefault(klineOpenOrderBean3, klineOpenOrderBean.getPrice(), false, this.isConnected == KlineTradeDragType.ORDER_TP, 0);
                    }
                    KlineOpenOrderBean klineOpenOrderBean4 = this.djBIcL;
                    if (klineOpenOrderBean4 != null && (!klineOpenOrderBean4.getHaveSL() || !klineOpenOrderBean4.getHaveTP())) {
                        KlineOpenOrderBean klineOpenOrderBean5 = this.AuCTel;
                        if (klineOpenOrderBean5 != null && (pnl = klineOpenOrderBean5.getPnl()) != null && C33129mqd.AEQbTJ(pnl, 0)) {
                            KlineOpenOrderBean klineOpenOrderBean6 = this.AuCTel;
                            if (klineOpenOrderBean6 != null) {
                                klineOpenOrderBean6.setOrdType("TP_Limit");
                            }
                            this.isConnected = KlineTradeDragType.ORDER_TP;
                            klineOpenOrderBean4.setHaveTP(true);
                            klineOpenOrderBean4.setHaveSL(false);
                        } else {
                            KlineOpenOrderBean klineOpenOrderBean7 = this.AuCTel;
                            if (klineOpenOrderBean7 != null) {
                                klineOpenOrderBean7.setOrdType("SL_Limit");
                            }
                            this.isConnected = KlineTradeDragType.ORDER_SL;
                            klineOpenOrderBean4.setHaveTP(false);
                            klineOpenOrderBean4.setHaveSL(true);
                        }
                    }
                    C36250oUv c36250oUvDbNXlk6 = this.ejfBZ.DbNXlk();
                    if (c36250oUvDbNXlk6 != null) {
                        c36250oUvDbNXlk6.invalidate();
                    }
                    android.content.Context contextAubY = c36246oUrCopydefault.AubY();
                    Intrinsics.checkNotNullExpressionValue(contextAubY, "");
                    copydefault(contextAubY);
                }
            } else if (i == 3) {
                if (!AYXKKw().DsrFlB()) {
                    return true;
                }
                this.AkhnZx = true;
                if (!this.values) {
                    KlineOpenOrderBean klineOpenOrderBean8 = (KlineOpenOrderBean) C37881pEd.copydefault(klineOpenOrderBean);
                    klineOpenOrderBean8.setSelected(false);
                    klineOpenOrderBean8.setShowSolid(false);
                    klineOpenOrderBean8.setShowDragCircle(false);
                    klineOpenOrderBean8.setLongClick(false);
                    klineOpenOrderBean8.setDragging(false);
                    klineOpenOrderBean8.setChangePrice(false);
                    klineOpenOrderBean8.setCopyOrder(true);
                    AYXKKw().gasjUx().add(klineOpenOrderBean8);
                    this.values = true;
                }
                oWC owcAhwBna2 = AhwBna();
                if (owcAhwBna2 != null) {
                    float y2 = motionEvent.getY();
                    float fDjBIcL2 = this.ejfBZ.djBIcL();
                    KlineOpenOrderBean klineOpenOrderBean9 = this.AuCTel;
                    klineOpenOrderBean.setPrice(C33129mqd.gEmmrt(C33129mqd.EZpvd(C33129mqd.addS$default(klineOpenOrderBean9 != null ? klineOpenOrderBean9.getPrice() : null, C33129mqd.mulS$default(java.lang.Float.valueOf(y2 - fDjBIcL2), C33129mqd.divS$default(C33129mqd.subS$default(java.lang.Double.valueOf(owcAhwBna2.EZpvd(owcAhwBna2.uzCIH())), java.lang.Double.valueOf(owcAhwBna2.EZpvd(owcAhwBna2.gEmmrt())), null, null, null, 14, null), java.lang.Integer.valueOf(owcAhwBna2.uzCIH() - owcAhwBna2.gEmmrt()), null, null, null, 14, null), null, null, null, 14, null), null, null, null, 14, null)).setScale(AYXKKw().gkJEwt(), RoundingMode.DOWN)));
                    if (!klineOpenOrderBean.isMainOrder()) {
                        C36250oUv c36250oUvDbNXlk7 = this.ejfBZ.DbNXlk();
                        if (c36250oUvDbNXlk7 != null) {
                            c36250oUvDbNXlk7.copydefault(klineOpenOrderBean, klineOpenOrderBean.getMainPrice(), false, Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "TP_Market") || Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "TP_Limit"), 0);
                        }
                    } else if (klineOpenOrderBean.isCostConnect() && AYXKKw().DCUTEI().size() > klineOpenOrderBean.getCostPos() && (c36250oUvDbNXlk3 = this.ejfBZ.DbNXlk()) != null) {
                        c36250oUvDbNXlk3.copydefault(klineOpenOrderBean, AYXKKw().DCUTEI().get(klineOpenOrderBean.getCostPos()).getAvgPx(), true, Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "TP_Market") || Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "TP_Limit"), klineOpenOrderBean.getCostPos());
                    }
                    C36250oUv c36250oUvDbNXlk8 = this.ejfBZ.DbNXlk();
                    if (c36250oUvDbNXlk8 != null) {
                        c36250oUvDbNXlk8.invalidate();
                    }
                    android.content.Context contextAubY2 = AYXKKw().AubY();
                    Intrinsics.checkNotNullExpressionValue(contextAubY2, "");
                    copydefault(contextAubY2);
                }
            }
        }
        InterfaceC39510pth interfaceC39510pth = this.DbNXlk;
        if (interfaceC39510pth != null) {
            int i2 = ActionBar.KWHzl[this.isConnected.ordinal()];
            if (i2 == 4 || i2 == 5) {
                this.AkhnZx = true;
                KlineTradeDragType klineTradeDragType = this.isConnected;
                KlineTradeDragType klineTradeDragType2 = KlineTradeDragType.COST_TP;
                if (klineTradeDragType == klineTradeDragType2) {
                    if (!interfaceC39510pth.isDragTP()) {
                        interfaceC39510pth.setDragTP(true);
                    }
                } else if (!interfaceC39510pth.isDragSL()) {
                    interfaceC39510pth.setDragSL(true);
                }
                if (!this.values) {
                    AYXKKw().gasjUx().add(this.AuCTel);
                    this.values = true;
                }
                oWC owcAhwBna3 = AhwBna();
                if (owcAhwBna3 != null) {
                    float y3 = motionEvent.getY();
                    float fDjBIcL3 = this.ejfBZ.djBIcL();
                    KlineOpenOrderBean klineOpenOrderBean10 = this.AuCTel;
                    if (klineOpenOrderBean10 != null) {
                        klineOpenOrderBean10.setPrice(C33129mqd.addS$default(interfaceC39510pth.getAvgPx(), C33129mqd.mulS$default(java.lang.Float.valueOf(y3 - fDjBIcL3), C33129mqd.divS$default(C33129mqd.subS$default(java.lang.Double.valueOf(owcAhwBna3.EZpvd(owcAhwBna3.uzCIH())), java.lang.Double.valueOf(owcAhwBna3.EZpvd(owcAhwBna3.gEmmrt())), null, null, null, 14, null), java.lang.Integer.valueOf(owcAhwBna3.uzCIH() - owcAhwBna3.gEmmrt()), null, null, null, 14, null), null, null, null, 14, null), null, null, null, 14, null));
                    }
                    KlineOpenOrderBean klineOpenOrderBean11 = this.AuCTel;
                    if (klineOpenOrderBean11 != null && (c36250oUvDbNXlk = this.ejfBZ.DbNXlk()) != null) {
                        c36250oUvDbNXlk.copydefault(klineOpenOrderBean11, interfaceC39510pth.getAvgPx(), true, this.isConnected == klineTradeDragType2, klineOpenOrderBean11.getCostPos());
                    }
                    C36250oUv c36250oUvDbNXlk9 = this.ejfBZ.DbNXlk();
                    if (c36250oUvDbNXlk9 != null) {
                        c36250oUvDbNXlk9.invalidate();
                    }
                    android.content.Context contextAubY3 = AYXKKw().AubY();
                    Intrinsics.checkNotNullExpressionValue(contextAubY3, "");
                    copydefault(contextAubY3);
                }
            }
        }
        KlineSpotAverageBean klineSpotAverageBean = this.fIwbmz;
        if (klineSpotAverageBean != null) {
            int i3 = ActionBar.KWHzl[this.isConnected.ordinal()];
            if (i3 == 6 || i3 == 7) {
                this.AkhnZx = true;
                if (!this.values) {
                    AYXKKw().gasjUx().add(this.AuCTel);
                    this.values = true;
                }
                oWC owcAhwBna4 = AhwBna();
                if (owcAhwBna4 != null) {
                    float y4 = motionEvent.getY();
                    float fDjBIcL4 = this.ejfBZ.djBIcL();
                    java.lang.String openAvgPx = klineSpotAverageBean.isOpenAvgPx() ? klineSpotAverageBean.getOpenAvgPx() : klineSpotAverageBean.getAccAvgPx();
                    KlineOpenOrderBean klineOpenOrderBean12 = this.AuCTel;
                    if (klineOpenOrderBean12 != null) {
                        klineOpenOrderBean12.setPrice(C33129mqd.addS$default(openAvgPx, C33129mqd.mulS$default(java.lang.Float.valueOf(y4 - fDjBIcL4), C33129mqd.divS$default(C33129mqd.subS$default(java.lang.Double.valueOf(owcAhwBna4.EZpvd(owcAhwBna4.uzCIH())), java.lang.Double.valueOf(owcAhwBna4.EZpvd(owcAhwBna4.gEmmrt())), null, null, null, 14, null), java.lang.Integer.valueOf(owcAhwBna4.uzCIH() - owcAhwBna4.gEmmrt()), null, null, null, 14, null), null, null, null, 14, null), null, null, null, 14, null));
                    }
                    C37932pGa c37932pGa = C37932pGa.AEQbTJ;
                    KlineOpenOrderBean klineOpenOrderBean13 = this.AuCTel;
                    if (klineOpenOrderBean13 == null || (price = klineOpenOrderBean13.getPrice()) == null) {
                        price = "";
                    }
                    if (c37932pGa.OLrzqt(price)) {
                        KlineOpenOrderBean klineOpenOrderBean14 = this.AuCTel;
                        if (klineOpenOrderBean14 != null) {
                            klineOpenOrderBean14.setOrdType("TP_Limit");
                        }
                        this.isConnected = KlineTradeDragType.SPOT_TP;
                    } else {
                        KlineOpenOrderBean klineOpenOrderBean15 = this.AuCTel;
                        if (klineOpenOrderBean15 != null) {
                            klineOpenOrderBean15.setOrdType("SL_Limit");
                        }
                        this.isConnected = KlineTradeDragType.SPOT_SL;
                    }
                    if (this.isConnected == KlineTradeDragType.SPOT_TP) {
                        KlineOpenOrderBean klineOpenOrderBean16 = this.AuCTel;
                        if (klineOpenOrderBean16 == null || (price3 = klineOpenOrderBean16.getPrice()) == null) {
                            price3 = "";
                        }
                        klineSpotAverageBean.setTpOrdPx(price3);
                        klineSpotAverageBean.setSlOrdPx("");
                        if (!klineSpotAverageBean.getTDragTP()) {
                            klineSpotAverageBean.setTDragTP(true);
                        }
                        if (!klineSpotAverageBean.getTDragSL()) {
                            klineSpotAverageBean.setTDragSL(true);
                        }
                    } else {
                        KlineOpenOrderBean klineOpenOrderBean17 = this.AuCTel;
                        if (klineOpenOrderBean17 == null || (price2 = klineOpenOrderBean17.getPrice()) == null) {
                            price2 = "";
                        }
                        klineSpotAverageBean.setSlOrdPx(price2);
                        klineSpotAverageBean.setTpOrdPx("");
                        if (!klineSpotAverageBean.getTDragSL()) {
                            klineSpotAverageBean.setTDragSL(true);
                        }
                        if (!klineSpotAverageBean.getTDragTP()) {
                            klineSpotAverageBean.setTDragTP(true);
                        }
                    }
                    C36250oUv c36250oUvDbNXlk10 = this.ejfBZ.DbNXlk();
                    if (c36250oUvDbNXlk10 != null) {
                        c36250oUvDbNXlk10.invalidate();
                    }
                    android.content.Context contextAubY4 = AYXKKw().AubY();
                    Intrinsics.checkNotNullExpressionValue(contextAubY4, "");
                    copydefault(contextAubY4);
                }
            }
        }
        return true;
    }

    @Override // o.oWO
    public boolean fetchVPNInfo(@NotNull android.view.MotionEvent motionEvent) {
        KlineOpenOrderBean klineOpenOrderBean;
        KlineOpenOrderBean klineOpenOrderBean2;
        C36250oUv c36250oUvDbNXlk;
        C36250oUv c36250oUvDbNXlk2;
        C36250oUv c36250oUvDbNXlk3;
        C36250oUv c36250oUvDbNXlk4;
        Intrinsics.checkNotNullParameter(motionEvent, "");
        KlineOpenOrderBean klineOpenOrderBean3 = this.AuCTel;
        if (klineOpenOrderBean3 != null && !this.AkhnZx) {
            klineOpenOrderBean3.setPrice("");
        }
        switch (ActionBar.KWHzl[this.isConnected.ordinal()]) {
            case 1:
                KlineOpenOrderBean klineOpenOrderBean4 = this.AuCTel;
                if (klineOpenOrderBean4 != null) {
                    C36250oUv c36250oUvDbNXlk5 = this.ejfBZ.DbNXlk();
                    if (c36250oUvDbNXlk5 != null) {
                        c36250oUvDbNXlk5.AEQbTJ(klineOpenOrderBean4);
                    }
                    valueOf();
                }
                break;
            case 2:
                KlineOpenOrderBean klineOpenOrderBean5 = this.AuCTel;
                if (klineOpenOrderBean5 != null) {
                    C36250oUv c36250oUvDbNXlk6 = this.ejfBZ.DbNXlk();
                    if (c36250oUvDbNXlk6 != null) {
                        c36250oUvDbNXlk6.AYXKKw(klineOpenOrderBean5);
                    }
                    valueOf();
                }
                break;
            case 3:
                KlineOpenOrderBean klineOpenOrderBean6 = this.djBIcL;
                if (klineOpenOrderBean6 != null) {
                    C36250oUv c36250oUvDbNXlk7 = this.ejfBZ.DbNXlk();
                    if (c36250oUvDbNXlk7 != null) {
                        c36250oUvDbNXlk7.copydefault(klineOpenOrderBean6);
                    }
                    valueOf();
                }
                break;
            case 4:
                KlineOpenOrderBean klineOpenOrderBean7 = this.AuCTel;
                if (klineOpenOrderBean7 != null) {
                    C36250oUv c36250oUvDbNXlk8 = this.ejfBZ.DbNXlk();
                    if (c36250oUvDbNXlk8 != null) {
                        c36250oUvDbNXlk8.EZpvd(klineOpenOrderBean7);
                    }
                    valueOf();
                }
                break;
            case 5:
                KlineOpenOrderBean klineOpenOrderBean8 = this.AuCTel;
                if (klineOpenOrderBean8 != null) {
                    C36250oUv c36250oUvDbNXlk9 = this.ejfBZ.DbNXlk();
                    if (c36250oUvDbNXlk9 != null) {
                        c36250oUvDbNXlk9.KWHzl(klineOpenOrderBean8);
                    }
                    valueOf();
                }
                break;
            case 6:
                KlineSpotAverageBean klineSpotAverageBean = this.fIwbmz;
                if (klineSpotAverageBean != null && (klineOpenOrderBean = this.AuCTel) != null) {
                    C36250oUv c36250oUvDbNXlk10 = this.ejfBZ.DbNXlk();
                    if (c36250oUvDbNXlk10 != null) {
                        c36250oUvDbNXlk10.AEQbTJ(klineSpotAverageBean, klineOpenOrderBean);
                    }
                    valueOf();
                }
                break;
            case 7:
                KlineSpotAverageBean klineSpotAverageBean2 = this.fIwbmz;
                if (klineSpotAverageBean2 != null && (klineOpenOrderBean2 = this.AuCTel) != null) {
                    C36250oUv c36250oUvDbNXlk11 = this.ejfBZ.DbNXlk();
                    if (c36250oUvDbNXlk11 != null) {
                        c36250oUvDbNXlk11.OLrzqt(klineSpotAverageBean2, klineOpenOrderBean2);
                    }
                    valueOf();
                }
                break;
            case 8:
                KlineOpenOrderBean klineOpenOrderBean9 = this.djBIcL;
                if (klineOpenOrderBean9 != null && (c36250oUvDbNXlk = this.ejfBZ.DbNXlk()) != null) {
                    c36250oUvDbNXlk.OLrzqt(klineOpenOrderBean9);
                }
                break;
            case 9:
                InterfaceC39510pth interfaceC39510pth = this.DbNXlk;
                if (interfaceC39510pth != null && (c36250oUvDbNXlk2 = this.ejfBZ.DbNXlk()) != null) {
                    c36250oUvDbNXlk2.KWHzl(interfaceC39510pth);
                }
                break;
            case 10:
                InterfaceC39510pth interfaceC39510pth2 = this.DbNXlk;
                if (interfaceC39510pth2 != null && (c36250oUvDbNXlk3 = this.ejfBZ.DbNXlk()) != null) {
                    c36250oUvDbNXlk3.EZpvd(interfaceC39510pth2);
                }
                break;
            case 11:
                KlineSpotAverageBean klineSpotAverageBean3 = this.fIwbmz;
                if (klineSpotAverageBean3 != null && (c36250oUvDbNXlk4 = this.ejfBZ.DbNXlk()) != null) {
                    c36250oUvDbNXlk4.EZpvd(klineSpotAverageBean3);
                }
                break;
            case 12:
                gEmmrt();
                C36312oXc c36312oXc = this.ejfBZ;
                c36312oXc.EZpvd(c36312oXc.zLjUOn);
                break;
        }
        C36250oUv c36250oUvDbNXlk12 = this.ejfBZ.DbNXlk();
        if (c36250oUvDbNXlk12 == null) {
            return false;
        }
        c36250oUvDbNXlk12.invalidate();
        return false;
    }

    @Override // o.oWO
    public boolean AEQbTJ() {
        KlineTradeDragType klineTradeDragType = this.isConnected;
        if (klineTradeDragType != KlineTradeDragType.NONE && (((klineTradeDragType != KlineTradeDragType.CURRENT_ORDER && klineTradeDragType != KlineTradeDragType.CURRENT_ORDER_CLICK) || this.AkhnZx) && ((klineTradeDragType != KlineTradeDragType.CURRENT_COST || this.AkhnZx) && (klineTradeDragType != KlineTradeDragType.SPOT_CLICK || this.AkhnZx)))) {
            return false;
        }
        C36312oXc c36312oXc = this.ejfBZ;
        c36312oXc.EZpvd(c36312oXc.AubY);
        return false;
    }

    public final void gEmmrt() {
        C36312oXc c36312oXc = this.ejfBZ;
        c36312oXc.EZpvd(c36312oXc.gHZMYf);
        C36250oUv c36250oUvDbNXlk = this.ejfBZ.DbNXlk();
        if (c36250oUvDbNXlk != null) {
            c36250oUvDbNXlk.invalidate();
        }
    }

    private final void valueOf() {
        if (this.fetchVPNInfo) {
            this.fetchVPNInfo = false;
            C37932pGa c37932pGa = C37932pGa.AEQbTJ;
            android.content.Context contextAubY = AYXKKw().AubY();
            Intrinsics.checkNotNullExpressionValue(contextAubY, "");
            c37932pGa.EZpvd(contextAubY, this.iwGUEr);
        }
    }

    public final void copydefault(android.content.Context context) {
        if (this.fetchVPNInfo) {
            return;
        }
        this.fetchVPNInfo = true;
        C37932pGa.AEQbTJ.EZpvd(context, this.iwGUEr);
        C36250oUv c36250oUvDbNXlk = this.ejfBZ.DbNXlk();
        if (c36250oUvDbNXlk != null) {
            c36250oUvDbNXlk.dvKsVJ();
        }
    }

    @Override // o.oWO
    public void OLrzqt() {
        C37932pGa c37932pGa = C37932pGa.AEQbTJ;
        c37932pGa.copydefault();
        c37932pGa.AEQbTJ();
        c37932pGa.KWHzl();
        c37932pGa.EZpvd();
        c37932pGa.OLrzqt();
    }

    public final android.util.Pair<java.lang.Boolean, KlineOpenOrderBean> iwGUEr(android.view.MotionEvent motionEvent) {
        boolean z = true;
        KlineOpenOrderBean klineOpenOrderBean = null;
        if ((!AYXKKw().iwGUEr().zuBGHE().isEmpty()) && AYXKKw().fdOvFl()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(AYXKKw().iwGUEr().zuBGHE().keySet());
            C56404yEc.zsXlph(arrayList);
            java.util.Iterator it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                java.lang.Integer num = (java.lang.Integer) it.next();
                RectF rectF = AYXKKw().iwGUEr().zuBGHE().get(num);
                if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY()) && num.intValue() < AYXKKw().gasjUx().size()) {
                    java.util.List<KlineOpenOrderBean> listGasjUx = AYXKKw().gasjUx();
                    Intrinsics.copydefault(num);
                    klineOpenOrderBean = listGasjUx.get(num.intValue());
                    this.AhwBna = num.intValue();
                    break;
                }
            }
            return new android.util.Pair<>(java.lang.Boolean.valueOf(z), klineOpenOrderBean);
        }
        return new android.util.Pair<>(java.lang.Boolean.FALSE, null);
    }

    public final android.util.Pair<java.lang.Boolean, KlineOpenOrderBean> getFieldNames(android.view.MotionEvent motionEvent) {
        boolean z = true;
        KlineOpenOrderBean klineOpenOrderBean = null;
        if ((!AYXKKw().iwGUEr().QKVWgx().isEmpty()) && AYXKKw().fdOvFl()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(AYXKKw().iwGUEr().QKVWgx().keySet());
            C56404yEc.zsXlph(arrayList);
            java.util.Iterator it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                java.lang.Integer num = (java.lang.Integer) it.next();
                RectF rectF = AYXKKw().iwGUEr().QKVWgx().get(num);
                if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY()) && num.intValue() < AYXKKw().gasjUx().size()) {
                    java.util.List<KlineOpenOrderBean> listGasjUx = AYXKKw().gasjUx();
                    Intrinsics.copydefault(num);
                    klineOpenOrderBean = listGasjUx.get(num.intValue());
                    this.AhwBna = num.intValue();
                    break;
                }
            }
            return new android.util.Pair<>(java.lang.Boolean.valueOf(z), klineOpenOrderBean);
        }
        return new android.util.Pair<>(java.lang.Boolean.FALSE, null);
    }

    public final android.util.Pair<java.lang.Boolean, KlineOpenOrderBean> AubY(android.view.MotionEvent motionEvent) {
        boolean z = true;
        KlineOpenOrderBean klineOpenOrderBean = null;
        if ((!AYXKKw().iwGUEr().OcIXYQ().isEmpty()) && AYXKKw().fdOvFl()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(AYXKKw().iwGUEr().OcIXYQ().keySet());
            C56404yEc.zsXlph(arrayList);
            java.util.Iterator it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                java.lang.Integer num = (java.lang.Integer) it.next();
                RectF rectF = AYXKKw().iwGUEr().OcIXYQ().get(num);
                if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY()) && num.intValue() < AYXKKw().gasjUx().size()) {
                    java.util.List<KlineOpenOrderBean> listGasjUx = AYXKKw().gasjUx();
                    Intrinsics.copydefault(num);
                    klineOpenOrderBean = listGasjUx.get(num.intValue());
                    this.AhwBna = num.intValue();
                    break;
                }
            }
            return new android.util.Pair<>(java.lang.Boolean.valueOf(z), klineOpenOrderBean);
        }
        return new android.util.Pair<>(java.lang.Boolean.FALSE, null);
    }

    public final void copydefault(boolean z, KlineOpenOrderBean klineOpenOrderBean) {
        if (klineOpenOrderBean != null) {
            KlineOpenOrderBean klineOpenOrderBean2 = new KlineOpenOrderBean();
            klineOpenOrderBean2.setOrdType(z ? "TP_Limit" : "SL_Limit");
            klineOpenOrderBean2.setMainPrice(klineOpenOrderBean.getPrice());
            klineOpenOrderBean2.setPrice(klineOpenOrderBean.getPrice());
            klineOpenOrderBean2.setOrdId(klineOpenOrderBean.getOrdId());
            klineOpenOrderBean2.setAmount(klineOpenOrderBean.getAmount());
            klineOpenOrderBean2.setAmountNoSign(klineOpenOrderBean.getAmountNoSign());
            klineOpenOrderBean2.setSide(z ? "TP" : "SL");
            klineOpenOrderBean2.setLineColor(klineOpenOrderBean.getLineColor());
            klineOpenOrderBean2.setMainOrder(false);
            klineOpenOrderBean2.setSelected(true);
            klineOpenOrderBean2.setShowSolid(true);
            klineOpenOrderBean2.setShowDragCircle(true);
            klineOpenOrderBean2.setTemp(true);
            klineOpenOrderBean2.setOriginPos(klineOpenOrderBean.getOriginPos());
            if (z) {
                if (klineOpenOrderBean.getHaveTP()) {
                    klineOpenOrderBean.setHaveSL(true);
                    klineOpenOrderBean2.setOrdType("SL_Limit");
                } else {
                    klineOpenOrderBean.setHaveTP(true);
                    klineOpenOrderBean2.setOrdType("TP_Limit");
                }
                klineOpenOrderBean2.setTPLeft(klineOpenOrderBean.getTPLeft());
            } else {
                if (klineOpenOrderBean.getHaveSL()) {
                    klineOpenOrderBean.setHaveTP(true);
                    klineOpenOrderBean2.setOrdType("TP_Limit");
                } else {
                    klineOpenOrderBean.setHaveSL(true);
                    klineOpenOrderBean2.setOrdType("SL_Limit");
                }
                klineOpenOrderBean2.setSLLeft(klineOpenOrderBean.getSLLeft());
            }
            this.AuCTel = klineOpenOrderBean2;
        }
    }

    public final void copydefault(boolean z, InterfaceC39510pth interfaceC39510pth) {
        if (interfaceC39510pth != null) {
            KlineOpenOrderBean klineOpenOrderBean = new KlineOpenOrderBean();
            klineOpenOrderBean.setOrdType(z ? "TP_Limit" : "SL_Limit");
            klineOpenOrderBean.setPrice(interfaceC39510pth.getAvgPx());
            klineOpenOrderBean.setReduceOnly("true");
            klineOpenOrderBean.setTdMode(interfaceC39510pth.getMgnMode());
            klineOpenOrderBean.setSide(EZpvd(interfaceC39510pth));
            klineOpenOrderBean.setAmount(C33129mqd.gEmmrt(java.lang.Double.valueOf(java.lang.Math.abs(C33129mqd.AEQbTJ(interfaceC39510pth.getPos())))));
            klineOpenOrderBean.setAmountNoSign(C33129mqd.gEmmrt(java.lang.Double.valueOf(java.lang.Math.abs(C33129mqd.AEQbTJ(interfaceC39510pth.getPos())))));
            klineOpenOrderBean.setOrderSize(interfaceC39510pth.getSize());
            klineOpenOrderBean.setLineColor(interfaceC39510pth.getBSSide());
            klineOpenOrderBean.setMainOrder(false);
            klineOpenOrderBean.setSelected(true);
            klineOpenOrderBean.setShowSolid(true);
            klineOpenOrderBean.setShowDragCircle(true);
            klineOpenOrderBean.setTemp(true);
            klineOpenOrderBean.setOriginPos(interfaceC39510pth.getIndex());
            klineOpenOrderBean.setCostPos(interfaceC39510pth.getIndex());
            klineOpenOrderBean.setOrdId(interfaceC39510pth.getPosId());
            if (z) {
                klineOpenOrderBean.setTPLeft(interfaceC39510pth.getTPLeft());
            } else {
                klineOpenOrderBean.setSLLeft(interfaceC39510pth.getSLLeft());
            }
            this.AuCTel = klineOpenOrderBean;
        }
    }

    public final void OLrzqt(boolean z, KlineSpotAverageBean klineSpotAverageBean) {
        if (klineSpotAverageBean != null) {
            KlineOpenOrderBean klineOpenOrderBean = new KlineOpenOrderBean();
            klineOpenOrderBean.setOrdType(z ? "TP_Limit" : "SL_Limit");
            klineOpenOrderBean.setPrice(klineSpotAverageBean.isOpenAvgPx() ? klineSpotAverageBean.getAccAvgPx() : klineSpotAverageBean.getOpenAvgPx());
            klineOpenOrderBean.setSide(this.OLrzqt);
            klineOpenOrderBean.setLineColor(this.KWHzl);
            klineOpenOrderBean.setShowTempPnl(false);
            klineOpenOrderBean.setMainOrder(false);
            klineOpenOrderBean.setSelected(true);
            klineOpenOrderBean.setShowSolid(true);
            klineOpenOrderBean.setShowDragCircle(true);
            klineOpenOrderBean.setTemp(true);
            klineOpenOrderBean.setAccAvgPx(klineSpotAverageBean.isOpenAvgPx() ? klineSpotAverageBean.getOpenAvgPx() : klineSpotAverageBean.getAccAvgPx());
            if (z) {
                klineOpenOrderBean.setTPLeft(klineSpotAverageBean.getTPLeft());
            } else {
                klineOpenOrderBean.setSLLeft(klineSpotAverageBean.getSLLeft());
            }
            if (C37932pGa.AEQbTJ.OLrzqt(klineOpenOrderBean.getPrice())) {
                klineOpenOrderBean.setOrdType("TP_Limit");
                this.isConnected = KlineTradeDragType.SPOT_TP;
            } else {
                klineOpenOrderBean.setOrdType("SL_Limit");
                this.isConnected = KlineTradeDragType.SPOT_SL;
            }
            this.AuCTel = klineOpenOrderBean;
        }
    }

    public final java.lang.String EZpvd(InterfaceC39510pth interfaceC39510pth) {
        if (Intrinsics.EZpvd((java.lang.Object) interfaceC39510pth.getBSSide(), (java.lang.Object) this.OLrzqt)) {
            java.lang.String str = this.KWHzl;
            Intrinsics.copydefault((java.lang.Object) str);
            return str;
        }
        java.lang.String str2 = this.OLrzqt;
        Intrinsics.copydefault((java.lang.Object) str2);
        return str2;
    }

    public final android.util.Pair<java.lang.Boolean, InterfaceC39510pth> fARcdN(android.view.MotionEvent motionEvent) {
        boolean z = true;
        InterfaceC39510pth interfaceC39510pth = null;
        if ((!AYXKKw().iwGUEr().valueOf().isEmpty()) && AYXKKw().fdOvFl()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(AYXKKw().iwGUEr().valueOf().keySet());
            C56404yEc.zsXlph(arrayList);
            java.util.Iterator it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                java.lang.Integer num = (java.lang.Integer) it.next();
                RectF rectF = AYXKKw().iwGUEr().valueOf().get(num);
                if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY()) && num.intValue() < AYXKKw().DCUTEI().size()) {
                    java.util.List<? extends InterfaceC39510pth> listDCUTEI = AYXKKw().DCUTEI();
                    Intrinsics.copydefault(num);
                    interfaceC39510pth = listDCUTEI.get(num.intValue());
                    break;
                }
            }
            return new android.util.Pair<>(java.lang.Boolean.valueOf(z), interfaceC39510pth);
        }
        return new android.util.Pair<>(java.lang.Boolean.FALSE, null);
    }

    public final android.util.Pair<java.lang.Boolean, InterfaceC39510pth> uzCIH(android.view.MotionEvent motionEvent) {
        boolean z = true;
        InterfaceC39510pth interfaceC39510pth = null;
        if ((!AYXKKw().iwGUEr().djBIcL().isEmpty()) && AYXKKw().fdOvFl()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(AYXKKw().iwGUEr().djBIcL().keySet());
            C56404yEc.zsXlph(arrayList);
            java.util.Iterator it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                java.lang.Integer num = (java.lang.Integer) it.next();
                RectF rectF = AYXKKw().iwGUEr().djBIcL().get(num);
                if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY()) && num.intValue() < AYXKKw().DCUTEI().size()) {
                    java.util.List<? extends InterfaceC39510pth> listDCUTEI = AYXKKw().DCUTEI();
                    Intrinsics.copydefault(num);
                    interfaceC39510pth = listDCUTEI.get(num.intValue());
                    break;
                }
            }
            return new android.util.Pair<>(java.lang.Boolean.valueOf(z), interfaceC39510pth);
        }
        return new android.util.Pair<>(java.lang.Boolean.FALSE, null);
    }

    public final android.util.Pair<java.lang.Boolean, InterfaceC39510pth> getNewProxyInstance(android.view.MotionEvent motionEvent) {
        boolean z = true;
        InterfaceC39510pth interfaceC39510pth = null;
        if ((!AYXKKw().iwGUEr().AhwBna().isEmpty()) && AYXKKw().fdOvFl()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(AYXKKw().iwGUEr().AhwBna().keySet());
            C56404yEc.zsXlph(arrayList);
            java.util.Iterator it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                java.lang.Integer num = (java.lang.Integer) it.next();
                RectF rectF = AYXKKw().iwGUEr().AhwBna().get(num);
                if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY()) && num.intValue() < AYXKKw().DCUTEI().size()) {
                    java.util.List<? extends InterfaceC39510pth> listDCUTEI = AYXKKw().DCUTEI();
                    Intrinsics.copydefault(num);
                    interfaceC39510pth = listDCUTEI.get(num.intValue());
                    break;
                }
            }
            return new android.util.Pair<>(java.lang.Boolean.valueOf(z), interfaceC39510pth);
        }
        return new android.util.Pair<>(java.lang.Boolean.FALSE, null);
    }

    public final android.util.Pair<java.lang.Boolean, InterfaceC39510pth> hDKMBd(android.view.MotionEvent motionEvent) {
        boolean z = true;
        InterfaceC39510pth interfaceC39510pth = null;
        if ((!AYXKKw().iwGUEr().AYXKKw().isEmpty()) && AYXKKw().fdOvFl()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(AYXKKw().iwGUEr().AYXKKw().keySet());
            C56404yEc.zsXlph(arrayList);
            java.util.Iterator it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                java.lang.Integer num = (java.lang.Integer) it.next();
                RectF rectF = AYXKKw().iwGUEr().AYXKKw().get(num);
                if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY()) && num.intValue() < AYXKKw().DCUTEI().size()) {
                    java.util.List<? extends InterfaceC39510pth> listDCUTEI = AYXKKw().DCUTEI();
                    Intrinsics.copydefault(num);
                    interfaceC39510pth = listDCUTEI.get(num.intValue());
                    break;
                }
            }
            return new android.util.Pair<>(java.lang.Boolean.valueOf(z), interfaceC39510pth);
        }
        return new android.util.Pair<>(java.lang.Boolean.FALSE, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.util.Pair<java.lang.Boolean, KlineSpotAverageBean> wlaJM(android.view.MotionEvent motionEvent) {
        boolean z;
        KlineSpotAverageBean klineSpotAverageBean = null;
        if (AYXKKw().iwGUEr().dNCPSb() != null) {
            RectF rectFDNCPSb = AYXKKw().iwGUEr().dNCPSb();
            if (rectFDNCPSb != null) {
                boolean zContains = rectFDNCPSb.contains(motionEvent.getX(), motionEvent.getY());
                z = true;
                if (zContains) {
                    klineSpotAverageBean = AYXKKw().zLjUOn().getKlineSpotAverageBean();
                } else {
                    z = false;
                }
            }
            return new android.util.Pair<>(java.lang.Boolean.valueOf(z), klineSpotAverageBean);
        }
        return new android.util.Pair<>(java.lang.Boolean.FALSE, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.util.Pair<java.lang.Boolean, KlineSpotAverageBean> zLjUOn(android.view.MotionEvent motionEvent) {
        boolean z;
        KlineSpotAverageBean klineSpotAverageBean = null;
        if (AYXKKw().iwGUEr().UeEOUB() != null) {
            RectF rectFUeEOUB = AYXKKw().iwGUEr().UeEOUB();
            if (rectFUeEOUB != null) {
                boolean zContains = rectFUeEOUB.contains(motionEvent.getX(), motionEvent.getY());
                z = true;
                if (zContains) {
                    klineSpotAverageBean = AYXKKw().zLjUOn().getKlineSpotAverageBean();
                } else {
                    z = false;
                }
            }
            return new android.util.Pair<>(java.lang.Boolean.valueOf(z), klineSpotAverageBean);
        }
        return new android.util.Pair<>(java.lang.Boolean.FALSE, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final android.util.Pair<java.lang.Boolean, KlineSpotAverageBean> AuCTelauCTel(android.view.MotionEvent motionEvent) {
        boolean z;
        KlineSpotAverageBean klineSpotAverageBean = null;
        if (AYXKKw().iwGUEr().QbewEr() != null) {
            RectF rectFQbewEr = AYXKKw().iwGUEr().QbewEr();
            if (rectFQbewEr != null) {
                boolean zContains = rectFQbewEr.contains(motionEvent.getX(), motionEvent.getY());
                z = true;
                if (zContains) {
                    klineSpotAverageBean = AYXKKw().zLjUOn().getKlineSpotAverageBean();
                } else {
                    z = false;
                }
            }
            return new android.util.Pair<>(java.lang.Boolean.valueOf(z), klineSpotAverageBean);
        }
        return new android.util.Pair<>(java.lang.Boolean.FALSE, null);
    }
}
