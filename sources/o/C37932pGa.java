package o;

import android.os.Build;
import com.okinc.kline.data.KlineOpenOrderBean;
import com.okinc.kline.data.KlineSpotAverageBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pGa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37932pGa {
    public static final C37932pGa AEQbTJ = new C37932pGa();

    private C37932pGa() {
    }

    public final void copydefault() {
        java.util.List<? extends InterfaceC39510pth> listDCUTEI = C36246oUr.copydefault().DCUTEI();
        Intrinsics.checkNotNullExpressionValue(listDCUTEI, "");
        for (InterfaceC39510pth interfaceC39510pth : listDCUTEI) {
            interfaceC39510pth.setSelected(false);
            interfaceC39510pth.setShowSolid(false);
        }
    }

    public final void AEQbTJ() {
        java.util.List<? extends InterfaceC39510pth> listDCUTEI = C36246oUr.copydefault().DCUTEI();
        Intrinsics.checkNotNullExpressionValue(listDCUTEI, "");
        for (InterfaceC39510pth interfaceC39510pth : listDCUTEI) {
            interfaceC39510pth.setLiqSelected(false);
            interfaceC39510pth.setShowSolidLiq(false);
        }
    }

    public final void KWHzl() {
        java.util.List<? extends InterfaceC39510pth> listDCUTEI = C36246oUr.copydefault().DCUTEI();
        Intrinsics.checkNotNullExpressionValue(listDCUTEI, "");
        for (InterfaceC39510pth interfaceC39510pth : listDCUTEI) {
            interfaceC39510pth.setBeSelected(false);
            interfaceC39510pth.setShowSolidBE(false);
        }
    }

    public final void EZpvd() {
        java.util.List<KlineOpenOrderBean> listGasjUx = C36246oUr.copydefault().gasjUx();
        Intrinsics.checkNotNullExpressionValue(listGasjUx, "");
        for (KlineOpenOrderBean klineOpenOrderBean : listGasjUx) {
            klineOpenOrderBean.setSelected(false);
            klineOpenOrderBean.setShowSolid(false);
        }
    }

    public final void OLrzqt() {
        KlineSpotAverageBean klineSpotAverageBean = C36246oUr.copydefault().zLjUOn().getKlineSpotAverageBean();
        if (klineSpotAverageBean != null) {
            klineSpotAverageBean.setTSelected(false);
            klineSpotAverageBean.setTShowSolid(false);
        }
    }

    public static /* synthetic */ void findChildOrder$default(C37932pGa c37932pGa, KlineOpenOrderBean klineOpenOrderBean, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            klineOpenOrderBean = null;
        }
        c37932pGa.EZpvd(klineOpenOrderBean);
    }

    public final void EZpvd(KlineOpenOrderBean klineOpenOrderBean) {
        if (klineOpenOrderBean != null) {
            if (!Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOriginOrdType(), (java.lang.Object) "oco")) {
                int size = C36246oUr.copydefault().gasjUx().size();
                for (int i = 0; i < size; i++) {
                    KlineOpenOrderBean klineOpenOrderBean2 = C36246oUr.copydefault().gasjUx().get(i);
                    if (Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdId(), (java.lang.Object) klineOpenOrderBean2.getOrdId())) {
                        klineOpenOrderBean2.setSelected(true);
                    }
                }
                int size2 = C36246oUr.copydefault().DCUTEI().size();
                for (int i2 = 0; i2 < size2; i2++) {
                    InterfaceC39510pth interfaceC39510pth = C36246oUr.copydefault().DCUTEI().get(i2);
                    C37932pGa c37932pGa = AEQbTJ;
                    if (c37932pGa.KWHzl(klineOpenOrderBean, interfaceC39510pth)) {
                        if (C36246oUr.copydefault().run() || C36246oUr.copydefault().DCUTEIddSDPG() || C36246oUr.copydefault().DCUTEIdCUTEI()) {
                            interfaceC39510pth.setSelected(true);
                            klineOpenOrderBean.setCostPrice(interfaceC39510pth.getAvgPx());
                            klineOpenOrderBean.setCostLiq(interfaceC39510pth.getLiqPx());
                            klineOpenOrderBean.setCostBE(interfaceC39510pth.getBePx());
                            klineOpenOrderBean.setLineColor(interfaceC39510pth.getBSSide());
                            c37932pGa.AEQbTJ(interfaceC39510pth);
                        } else {
                            klineOpenOrderBean.setLineColor(klineOpenOrderBean.getSide());
                        }
                    }
                }
            }
            klineOpenOrderBean.setSelected(true);
            klineOpenOrderBean.setShowSolid(true);
        }
    }

    public static /* synthetic */ void findSpotChildOrder$default(C37932pGa c37932pGa, KlineOpenOrderBean klineOpenOrderBean, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            klineOpenOrderBean = null;
        }
        c37932pGa.OLrzqt(klineOpenOrderBean);
    }

    public final void OLrzqt(KlineOpenOrderBean klineOpenOrderBean) {
        if (klineOpenOrderBean != null) {
            KlineSpotAverageBean klineSpotAverageBean = C36246oUr.copydefault().zLjUOn().getKlineSpotAverageBean();
            if (klineSpotAverageBean != null) {
                klineSpotAverageBean.setTSelected(true);
            }
            klineOpenOrderBean.setSelected(true);
            klineOpenOrderBean.setShowSolid(true);
        }
    }

    public static /* synthetic */ void findTradePosOrder$default(C37932pGa c37932pGa, InterfaceC39510pth interfaceC39510pth, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interfaceC39510pth = null;
        }
        c37932pGa.AEQbTJ(interfaceC39510pth);
    }

    public final void AEQbTJ(InterfaceC39510pth interfaceC39510pth) {
        if (interfaceC39510pth != null) {
            int size = C36246oUr.copydefault().gasjUx().size();
            for (int i = 0; i < size; i++) {
                KlineOpenOrderBean klineOpenOrderBean = C36246oUr.copydefault().gasjUx().get(i);
                if (AEQbTJ.KWHzl(klineOpenOrderBean, interfaceC39510pth)) {
                    if (C36246oUr.copydefault().WS()) {
                        klineOpenOrderBean.setSelected(true);
                        klineOpenOrderBean.setCostPrice(interfaceC39510pth.getAvgPx());
                        klineOpenOrderBean.setCostLiq(interfaceC39510pth.getLiqPx());
                        klineOpenOrderBean.setCostBE(interfaceC39510pth.getBePx());
                        klineOpenOrderBean.setLineColor(interfaceC39510pth.getBSSide());
                    } else {
                        klineOpenOrderBean.setLineColor(klineOpenOrderBean.getSide());
                    }
                }
            }
        }
    }

    public final boolean KWHzl(@NotNull KlineOpenOrderBean klineOpenOrderBean, @NotNull InterfaceC39510pth interfaceC39510pth) {
        Intrinsics.checkNotNullParameter(klineOpenOrderBean, "");
        Intrinsics.checkNotNullParameter(interfaceC39510pth, "");
        return ((Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getSide(), (java.lang.Object) "buy") && Intrinsics.EZpvd((java.lang.Object) interfaceC39510pth.getBSSide(), (java.lang.Object) "sell")) || (Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getSide(), (java.lang.Object) "sell") && Intrinsics.EZpvd((java.lang.Object) interfaceC39510pth.getBSSide(), (java.lang.Object) "buy"))) && (Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "TP_Market") || Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "TP_Limit") || Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "SL_Market") || Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "SL_Limit") || (Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) "limit") && Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.isTpLimit(), (java.lang.Object) "true"))) && Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getReduceOnly(), (java.lang.Object) "true") && Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getTdMode(), (java.lang.Object) interfaceC39510pth.getMgnMode());
    }

    public final void EZpvd(@NotNull android.content.Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("vibrator");
        Intrinsics.copydefault(systemService, "");
        android.os.Vibrator vibrator = (android.os.Vibrator) systemService;
        if (Build.VERSION.SDK_INT >= 26) {
            vibrator.vibrate(android.os.VibrationEffect.createOneShot(j, -1));
        } else {
            vibrator.vibrate(j);
        }
    }

    public final boolean AhwBna() {
        java.util.List<KlineOpenOrderBean> listGasjUx = C36246oUr.copydefault().gasjUx();
        Intrinsics.checkNotNullExpressionValue(listGasjUx, "");
        java.util.Iterator<T> it = listGasjUx.iterator();
        while (it.hasNext()) {
            if (((KlineOpenOrderBean) it.next()).isTemp()) {
                return true;
            }
        }
        return false;
    }

    public final boolean AYXKKw() {
        java.util.List<KlineOpenOrderBean> listGasjUx = C36246oUr.copydefault().gasjUx();
        Intrinsics.checkNotNullExpressionValue(listGasjUx, "");
        java.util.Iterator<T> it = listGasjUx.iterator();
        while (it.hasNext()) {
            if (((KlineOpenOrderBean) it.next()).getSelected()) {
                return true;
            }
        }
        java.util.List<? extends InterfaceC39510pth> listDCUTEI = C36246oUr.copydefault().DCUTEI();
        Intrinsics.checkNotNullExpressionValue(listDCUTEI, "");
        java.util.Iterator<T> it2 = listDCUTEI.iterator();
        while (it2.hasNext()) {
            if (((InterfaceC39510pth) it2.next()).getSelected()) {
                return true;
            }
        }
        KlineSpotAverageBean klineSpotAverageBean = C36246oUr.copydefault().zLjUOn().getKlineSpotAverageBean();
        return klineSpotAverageBean != null && klineSpotAverageBean.getTSelected();
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        com.okinc.kline.library.data.DataSource dataSource = C36246oUr.copydefault().zLjUOn().getDataSources().get("ds0");
        if (dataSource == null) {
            return false;
        }
        java.lang.String strGEmmrt = dataSource.gEmmrt() >= 1 ? C33129mqd.gEmmrt(java.lang.Double.valueOf(dataSource.AEQbTJ.get(dataSource.DbNXlk() - 1).copydefault())) : "";
        return z ? C33129mqd.AEQbTJ(str, strGEmmrt) : C33129mqd.gEmmrt(str, strGEmmrt);
    }

    public final boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        com.okinc.kline.library.data.DataSource dataSource = C36246oUr.copydefault().zLjUOn().getDataSources().get("ds0");
        if (dataSource != null) {
            return C33129mqd.AEQbTJ(str, dataSource.gEmmrt() >= 1 ? C33129mqd.gEmmrt(java.lang.Double.valueOf(dataSource.AEQbTJ.get(dataSource.DbNXlk() - 1).copydefault())) : "");
        }
        return false;
    }
}
