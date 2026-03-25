package o;

import android.graphics.RectF;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.kline.data.KlineSpotAverageBean;
import com.okinc.kline.library.data.DataSource;
import com.okinc.rxutils.RxBus;
import com.okinc.unify_trade.biz.BotWebHook;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C36250oUv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oXb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36311oXb extends oWO {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int djBIcL = 8;
    public final C36312oXc DbNXlk;
    public int gEmmrt;
    public boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.oWO
    public java.lang.String KWHzl() {
        return "StateLongPress";
    }

    public C36311oXb(@NotNull C36312oXc c36312oXc) {
        Intrinsics.checkNotNullParameter(c36312oXc, "");
        this.DbNXlk = c36312oXc;
        this.gEmmrt = -1;
    }

    public final void djBIcL() {
        C36250oUv c36250oUvDbNXlk;
        oWN own = C36246oUr.copydefault().DCJXGO().get("ds0");
        if (own != null) {
            own.AwvSrB();
        }
        C36250oUv c36250oUvDbNXlk2 = this.DbNXlk.DbNXlk();
        if (c36250oUvDbNXlk2 != null) {
            c36250oUvDbNXlk2.invalidate();
        }
        this.DbNXlk.EZpvd(0L);
        C36250oUv c36250oUvDbNXlk3 = this.DbNXlk.DbNXlk();
        if (c36250oUvDbNXlk3 != null && c36250oUvDbNXlk3.isConnected() == 1 && (c36250oUvDbNXlk = this.DbNXlk.DbNXlk()) != null && c36250oUvDbNXlk.OcIXYQ()) {
            C36312oXc c36312oXc = this.DbNXlk;
            c36312oXc.EZpvd(c36312oXc.wlaJM);
        } else {
            C36312oXc c36312oXc2 = this.DbNXlk;
            c36312oXc2.EZpvd(c36312oXc2.zLjUOn);
        }
    }

    @Override // o.oWO
    public boolean AhwBna(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        this.DbNXlk.EZpvd(java.lang.System.currentTimeMillis());
        float fAbs = java.lang.Math.abs(motionEvent.getX() - this.DbNXlk.AhwBna());
        float fAbs2 = java.lang.Math.abs(motionEvent.getY() - this.DbNXlk.valueOf());
        double dSqrt = java.lang.Math.sqrt((fAbs * fAbs) + (fAbs2 * fAbs2));
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        java.util.List<KlineOpenOrderBean> listGasjUx = c36246oUrCopydefault.gasjUx();
        if (listGasjUx != null) {
            for (KlineOpenOrderBean klineOpenOrderBean : listGasjUx) {
                klineOpenOrderBean.setLongClick(false);
                klineOpenOrderBean.setSelected(false);
                klineOpenOrderBean.setShowSolid(false);
            }
        }
        java.util.List<? extends InterfaceC39510pth> listDCUTEI = c36246oUrCopydefault.DCUTEI();
        if (listDCUTEI != null) {
            java.util.Iterator<T> it = listDCUTEI.iterator();
            while (it.hasNext()) {
                ((InterfaceC39510pth) it.next()).setLongClick(false);
            }
        }
        KlineSpotAverageBean klineSpotAverageBean = c36246oUrCopydefault.zLjUOn().getKlineSpotAverageBean();
        if (klineSpotAverageBean != null) {
            klineSpotAverageBean.setTLongClick(false);
            klineSpotAverageBean.setTSelected(false);
            klineSpotAverageBean.setTShowSolid(false);
        }
        if (c36246oUrCopydefault.iwGUEr().QUSxYX() != null) {
            RectF rectFQUSxYX = c36246oUrCopydefault.iwGUEr().QUSxYX();
            Intrinsics.copydefault(rectFQUSxYX);
            if (rectFQUSxYX.contains(motionEvent.getX(), motionEvent.getY())) {
                C36250oUv c36250oUvDbNXlk = this.DbNXlk.DbNXlk();
                if (c36250oUvDbNXlk != null) {
                    c36250oUvDbNXlk.QbewEr();
                }
                this.values = true;
                fARcdN(motionEvent);
                return false;
            }
        }
        if (((java.lang.Boolean) valueOf(motionEvent).first).booleanValue()) {
            this.DbNXlk.EZpvd(0L);
            OLrzqt(this.DbNXlk, motionEvent);
            return super.AhwBna(motionEvent);
        }
        if (((java.lang.Boolean) gEmmrt(motionEvent).first).booleanValue()) {
            this.DbNXlk.EZpvd(0L);
            OLrzqt(this.DbNXlk, motionEvent);
            return super.AhwBna(motionEvent);
        }
        if (((java.lang.Boolean) djBIcL(motionEvent).first).booleanValue()) {
            this.DbNXlk.EZpvd(0L);
            OLrzqt(this.DbNXlk, motionEvent);
            return super.AhwBna(motionEvent);
        }
        if (((java.lang.Boolean) AEQbTJ(motionEvent).first).booleanValue()) {
            this.DbNXlk.EZpvd(0L);
            OLrzqt(this.DbNXlk, motionEvent);
            return super.AhwBna(motionEvent);
        }
        if (((java.lang.Boolean) OLrzqt(motionEvent).first).booleanValue()) {
            this.DbNXlk.EZpvd(0L);
            OLrzqt(this.DbNXlk, motionEvent);
            return super.AhwBna(motionEvent);
        }
        if (dSqrt > AbstractC36302oWt.copydefault(5.0f)) {
            fARcdN(motionEvent);
            if (c36246oUrCopydefault.fARcdN() != null && c36246oUrCopydefault.fARcdN().contains(motionEvent.getX(), motionEvent.getY())) {
                RxBus.KWHzl("kline_trade_point_click");
            } else {
                C36246oUr.copydefault().OLrzqt();
            }
        } else {
            oVT ovt = c36246oUrCopydefault.iwGUEr().values().get("ds0.root");
            Intrinsics.copydefault(ovt);
            ovt.AEQbTJ((int) motionEvent.getX(), (int) motionEvent.getY());
            C36250oUv c36250oUvDbNXlk2 = this.DbNXlk.DbNXlk();
            if (c36250oUvDbNXlk2 != null) {
                c36250oUvDbNXlk2.invalidate();
            }
        }
        return super.AhwBna(motionEvent);
    }

    public final void fARcdN(android.view.MotionEvent motionEvent) {
        AhwBna();
        C36250oUv c36250oUvDbNXlk = this.DbNXlk.DbNXlk();
        if (c36250oUvDbNXlk != null) {
            c36250oUvDbNXlk.invalidate();
        }
        this.DbNXlk.copydefault(motionEvent.getX());
        this.DbNXlk.OLrzqt(motionEvent.getY());
        this.DbNXlk.EZpvd(0L);
        C36312oXc c36312oXc = this.DbNXlk;
        c36312oXc.EZpvd(c36312oXc.gHZMYf);
    }

    @Override // o.oWO
    public boolean DbNXlk(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        C36250oUv c36250oUvDbNXlk = this.DbNXlk.DbNXlk();
        if (c36250oUvDbNXlk != null) {
            c36250oUvDbNXlk.EZpvd(true);
        }
        if (this.values) {
            return false;
        }
        oVT ovt = C36246oUr.copydefault().iwGUEr().values().get("ds0.root");
        Intrinsics.copydefault(ovt);
        ovt.AEQbTJ((int) motionEvent.getX(), (int) motionEvent.getY());
        C36250oUv c36250oUvDbNXlk2 = this.DbNXlk.DbNXlk();
        if (c36250oUvDbNXlk2 != null) {
            c36250oUvDbNXlk2.invalidate();
        }
        OLrzqt((int) motionEvent.getY());
        return false;
    }

    @Override // o.oWO
    public boolean fetchVPNInfo(@NotNull android.view.MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "");
        this.DbNXlk.AEQbTJ(motionEvent.getX());
        this.DbNXlk.KWHzl(motionEvent.getY());
        C36250oUv c36250oUvDbNXlk = this.DbNXlk.DbNXlk();
        if (c36250oUvDbNXlk != null) {
            c36250oUvDbNXlk.EZpvd(false);
        }
        this.values = false;
        return true;
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
            return false;
        }
        C36312oXc c36312oXc2 = this.DbNXlk;
        c36312oXc2.EZpvd(c36312oXc2.zLjUOn);
        return false;
    }

    @Override // o.oWO
    public void AEQbTJ(boolean z) {
        C36250oUv c36250oUvDbNXlk;
        if (z) {
            C36250oUv c36250oUvDbNXlk2 = this.DbNXlk.DbNXlk();
            if (c36250oUvDbNXlk2 != null && c36250oUvDbNXlk2.isConnected() == 1 && (c36250oUvDbNXlk = this.DbNXlk.DbNXlk()) != null && c36250oUvDbNXlk.OcIXYQ()) {
                C36312oXc c36312oXc = this.DbNXlk;
                c36312oXc.EZpvd(c36312oXc.wlaJM);
            } else {
                C36312oXc c36312oXc2 = this.DbNXlk;
                c36312oXc2.EZpvd(c36312oXc2.getFieldNames);
            }
            C36246oUr.copydefault().valueOf(true);
            return;
        }
        C36312oXc c36312oXc3 = this.DbNXlk;
        c36312oXc3.EZpvd(c36312oXc3.zLjUOn);
        C36246oUr.copydefault().valueOf(false);
    }

    @Override // o.oWO
    public void EZpvd() {
        C36250oUv.StateListAnimator stateListAnimatorDbNXlk;
        C36250oUv.StateListAnimator stateListAnimatorDbNXlk2;
        super.EZpvd();
        C36250oUv c36250oUvDbNXlk = this.DbNXlk.DbNXlk();
        if (c36250oUvDbNXlk != null) {
            c36250oUvDbNXlk.EZpvd(true);
        }
        C37932pGa c37932pGa = C37932pGa.AEQbTJ;
        c37932pGa.copydefault();
        c37932pGa.AEQbTJ();
        c37932pGa.KWHzl();
        c37932pGa.EZpvd();
        c37932pGa.OLrzqt();
        C36246oUr.copydefault().djBIcL();
        if (KWHzl(this.DbNXlk.copydefault(), this.DbNXlk.djBIcL())) {
            C36250oUv c36250oUvDbNXlk2 = this.DbNXlk.DbNXlk();
            if (c36250oUvDbNXlk2 == null || (stateListAnimatorDbNXlk2 = c36250oUvDbNXlk2.DbNXlk()) == null) {
                return;
            }
            stateListAnimatorDbNXlk2.KWHzl();
            return;
        }
        if (AEQbTJ(this.DbNXlk.copydefault(), this.DbNXlk.djBIcL())) {
            return;
        }
        if (copydefault(this.DbNXlk.copydefault(), this.DbNXlk.djBIcL())) {
            C36250oUv c36250oUvDbNXlk3 = this.DbNXlk.DbNXlk();
            if (c36250oUvDbNXlk3 == null || (stateListAnimatorDbNXlk = c36250oUvDbNXlk3.DbNXlk()) == null) {
                return;
            }
            stateListAnimatorDbNXlk.EZpvd();
            return;
        }
        copydefault();
        oVT ovt = C36246oUr.copydefault().iwGUEr().values().get("ds0.root");
        Intrinsics.copydefault(ovt);
        ovt.AEQbTJ((int) this.DbNXlk.copydefault(), (int) this.DbNXlk.djBIcL());
        C36250oUv c36250oUvDbNXlk4 = this.DbNXlk.DbNXlk();
        if (c36250oUvDbNXlk4 != null) {
            c36250oUvDbNXlk4.invalidate();
        }
        OLrzqt((int) this.DbNXlk.djBIcL());
    }

    public final void OLrzqt(int i) {
        DataSource.DataArrayList<DataSource.StateListAnimator> dataArrayList;
        DataSource.StateListAnimator stateListAnimator;
        C36250oUv.ActionBar actionBarFetchVPNInfo;
        try {
            C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
            oWC owc = c36246oUrCopydefault.iwGUEr().QVAiDq().get("ds0.m");
            java.lang.String s$default = owc != null ? C33129mqd.formatS$default(java.lang.Double.valueOf(owc.EZpvd(i)), null, null, null, 7, null) : null;
            if (s$default != null && (actionBarFetchVPNInfo = this.DbNXlk.DbNXlk().fetchVPNInfo()) != null) {
                actionBarFetchVPNInfo.EZpvd(s$default);
            }
            oWN own = c36246oUrCopydefault.DCJXGO().get("ds0");
            if (own != null) {
                int iHDKMBd = own.hDKMBd();
                com.okinc.kline.library.data.DataSource dataSource = c36246oUrCopydefault.zLjUOn().getDataSources().get("ds0");
                boolean z = (dataSource == null || (dataArrayList = dataSource.AEQbTJ) == null || (stateListAnimator = dataArrayList.get(iHDKMBd)) == null || (C33129mqd.AhwBna(stateListAnimator.KWHzl()) <= 0 && C33129mqd.AhwBna(stateListAnimator.fIwbmz()) <= 0)) ? false : true;
                C36250oUv.ActionBar actionBarFetchVPNInfo2 = this.DbNXlk.DbNXlk().fetchVPNInfo();
                if (actionBarFetchVPNInfo2 != null) {
                    actionBarFetchVPNInfo2.copydefault(java.lang.Boolean.valueOf(z));
                }
                if (iHDKMBd != this.gEmmrt) {
                    C36250oUv.ActionBar actionBarFetchVPNInfo3 = this.DbNXlk.DbNXlk().fetchVPNInfo();
                    if (actionBarFetchVPNInfo3 != null) {
                        actionBarFetchVPNInfo3.aI_();
                    }
                    this.gEmmrt = iHDKMBd;
                }
                pUU.OLrzqt("current timeline price：" + s$default + ", has buy or sell count: " + z);
            }
        } catch (java.lang.Throwable th) {
            th.printStackTrace();
            pUU.AEQbTJ("setPriceListener", Unit.INSTANCE);
        }
    }

    @Override // o.oWO
    public void OLrzqt() {
        super.OLrzqt();
        oWN own = C36246oUr.copydefault().DCJXGO().get("ds0");
        if (own != null) {
            own.sSMYrx();
        }
        if (own != null) {
            own.AwvSrB();
        }
    }

    public final boolean copydefault(float f, float f2) {
        boolean z;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        boolean z2 = true;
        if (!(!c36246oUrCopydefault.iwGUEr().AxsJAY().isEmpty()) || !c36246oUrCopydefault.fdOvFl()) {
            this.values = false;
            return false;
        }
        java.util.List<KlineOpenOrderBean> listGasjUx = c36246oUrCopydefault.gasjUx();
        if (listGasjUx != null) {
            java.util.Iterator<T> it = listGasjUx.iterator();
            while (it.hasNext()) {
                ((KlineOpenOrderBean) it.next()).setLongClick(false);
            }
        }
        java.util.Set<Map.Entry<java.lang.Integer, RectF>> setEntrySet = c36246oUrCopydefault.iwGUEr().AxsJAY().entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        java.util.Iterator it2 = CollectionsKt___CollectionsKt.gkJEwt(setEntrySet).iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = false;
                z2 = false;
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            int iIntValue = ((java.lang.Number) entry.getKey()).intValue();
            if (((RectF) entry.getValue()).contains(f, f2)) {
                java.util.List<KlineOpenOrderBean> listGasjUx2 = c36246oUrCopydefault.gasjUx();
                Intrinsics.checkNotNullExpressionValue(listGasjUx2, "");
                KlineOpenOrderBean klineOpenOrderBean = (KlineOpenOrderBean) CollectionsKt___CollectionsKt.AkhnZx(listGasjUx2, iIntValue);
                if (klineOpenOrderBean == null || !klineOpenOrderBean.isMainOrder()) {
                    z = true;
                    z2 = false;
                } else {
                    klineOpenOrderBean.setLongClick(true);
                    C36250oUv c36250oUvDbNXlk = this.DbNXlk.DbNXlk();
                    if (c36250oUvDbNXlk != null) {
                        c36250oUvDbNXlk.invalidate();
                    }
                    z = true;
                }
            }
        }
        if (z2) {
            java.util.List<KlineOpenOrderBean> listGasjUx3 = c36246oUrCopydefault.gasjUx();
            if (listGasjUx3 != null) {
                for (KlineOpenOrderBean klineOpenOrderBean2 : listGasjUx3) {
                    klineOpenOrderBean2.setSelected(false);
                    klineOpenOrderBean2.setShowSolid(false);
                }
            }
            AhwBna();
        }
        this.values = z;
        return z;
    }

    public final boolean KWHzl(float f, float f2) {
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        boolean z = true;
        boolean z2 = false;
        if (!(!c36246oUrCopydefault.iwGUEr().gEmmrt().isEmpty()) || !c36246oUrCopydefault.fdOvFl()) {
            this.values = false;
            return false;
        }
        java.util.List<? extends InterfaceC39510pth> listDCUTEI = c36246oUrCopydefault.DCUTEI();
        if (listDCUTEI != null) {
            java.util.Iterator<T> it = listDCUTEI.iterator();
            while (it.hasNext()) {
                ((InterfaceC39510pth) it.next()).setLongClick(false);
            }
        }
        java.util.Set<Map.Entry<java.lang.Integer, RectF>> setEntrySet = c36246oUrCopydefault.iwGUEr().gEmmrt().entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        java.util.Iterator it2 = CollectionsKt___CollectionsKt.gkJEwt(setEntrySet).iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = false;
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            int iIntValue = ((java.lang.Number) entry.getKey()).intValue();
            if (((RectF) entry.getValue()).contains(f, f2)) {
                java.util.List<? extends InterfaceC39510pth> listDCUTEI2 = c36246oUrCopydefault.DCUTEI();
                Intrinsics.checkNotNullExpressionValue(listDCUTEI2, "");
                InterfaceC39510pth interfaceC39510pth = (InterfaceC39510pth) CollectionsKt___CollectionsKt.AkhnZx(listDCUTEI2, iIntValue);
                if (interfaceC39510pth != null) {
                    interfaceC39510pth.setLongClick(true);
                }
                C36250oUv c36250oUvDbNXlk = this.DbNXlk.DbNXlk();
                if (c36250oUvDbNXlk != null) {
                    c36250oUvDbNXlk.invalidate();
                }
                z2 = true;
            }
        }
        if (z) {
            C37932pGa c37932pGa = C37932pGa.AEQbTJ;
            c37932pGa.copydefault();
            c37932pGa.AEQbTJ();
            c37932pGa.KWHzl();
            c37932pGa.EZpvd();
            c37932pGa.OLrzqt();
            AhwBna();
        }
        this.values = z2;
        return z2;
    }

    public final boolean AEQbTJ(float f, float f2) {
        RectF rectFAKErDB;
        C36250oUv c36250oUvDbNXlk;
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        if (c36246oUrCopydefault.zLjUOn().getKlineSpotAverageBean() == null || c36246oUrCopydefault.iwGUEr().aKErDB() == null || !c36246oUrCopydefault.fdOvFl() || (rectFAKErDB = c36246oUrCopydefault.iwGUEr().aKErDB()) == null || !rectFAKErDB.contains(f, f2)) {
            this.values = false;
            return false;
        }
        KlineSpotAverageBean klineSpotAverageBean = c36246oUrCopydefault.zLjUOn().getKlineSpotAverageBean();
        if (klineSpotAverageBean != null) {
            klineSpotAverageBean.setTLongClick(true);
        }
        C36312oXc c36312oXc = this.DbNXlk;
        if (c36312oXc != null && (c36250oUvDbNXlk = c36312oXc.DbNXlk()) != null) {
            c36250oUvDbNXlk.invalidate();
        }
        this.values = true;
        return true;
    }

    public final void AhwBna() {
        oWN own = C36246oUr.copydefault().DCJXGO().get("ds0");
        if (own != null) {
            own.AwvSrB();
        }
    }

    /* JADX INFO: renamed from: o.oXb$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oXb.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void copydefault() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("KLine_Mid_Chart_Interact", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oXe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36311oXb.KWHzl((EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(BotWebHook.KEY_ACTION, "hold", true);
        eventParamsList.put("chart_location", "kline_page", true);
        eventParamsList.put("chart_type", "original", true);
        eventParamsList.put("terminal", "app", true);
        EventParamsList.put$default(eventParamsList, "is_cedefi", C36246oUr.copydefault().RKDWNf() ? "1" : "0", false, 4, null);
        return Unit.INSTANCE;
    }
}
