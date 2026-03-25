package o;

import com.okinc.core.util.SPUtils;
import com.okinc.kline.data.KlineOpenOrderBean;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pFN {
    public static java.lang.String EZpvd;
    public static WeakReference<InterfaceC39508ptf> KWHzl;
    public static final pFN OLrzqt = new pFN();
    public static java.util.HashMap<java.lang.String, InterfaceC39509ptg> copydefault = new java.util.HashMap<>();
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull WeakReference<InterfaceC39508ptf> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        KWHzl = weakReference;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        EZpvd = str;
    }

    private pFN() {
    }

    public final WeakReference<InterfaceC39508ptf> copydefault() {
        WeakReference<InterfaceC39508ptf> weakReference = KWHzl;
        if (weakReference != null) {
            return weakReference;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final java.lang.String EZpvd() {
        java.lang.String str = EZpvd;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void EZpvd(@NotNull WeakReference<InterfaceC39508ptf> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        AEQbTJ(weakReference);
    }

    public final void OLrzqt() {
        if (KWHzl != null) {
            copydefault().clear();
        }
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull InterfaceC39509ptg interfaceC39509ptg) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC39509ptg, "");
        copydefault(str);
        if (copydefault.containsKey(str)) {
            return;
        }
        copydefault.put(str, interfaceC39509ptg);
    }

    public final InterfaceC39509ptg djBIcL() {
        try {
            return copydefault.get(EZpvd());
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final java.lang.String AEQbTJ() {
        return Intrinsics.EZpvd((java.lang.Object) "kline_dark", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark")) ? "kline_dark" : (!Intrinsics.EZpvd((java.lang.Object) "kline_white", (java.lang.Object) SPUtils.getString("kline_theme_type", "kline_dark")) && C33492mxV.OLrzqt()) ? "kline_dark" : "kline_white";
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String KWHzl() {
        if ((Intrinsics.EZpvd((java.lang.Object) C36246oUr.copydefault().getFieldNames(), (java.lang.Object) "sp_timeinterval_okx_pro") && C36246oUr.copydefault().zLjUOn().getChartMode() != 2) || Intrinsics.EZpvd((java.lang.Object) C36246oUr.copydefault().fZBcTu(), (java.lang.Object) "cedefi_mode")) {
            return AEQbTJ();
        }
        int iEZpvd = C33492mxV.EZpvd();
        if (iEZpvd != -1) {
            if (iEZpvd != 1) {
                return iEZpvd != 2 ? "" : "kline_dark";
            }
            return "kline_white";
        }
        if (!C33492mxV.OLrzqt()) {
            return "kline_white";
        }
    }

    public final int AEQbTJ(float f) {
        return (int) android.util.TypedValue.applyDimension(1, f, C36246oUr.copydefault().AubY().getResources().getDisplayMetrics());
    }

    public final java.lang.String KWHzl(@androidx.annotation.StringRes int i) {
        return C33070mpX.AYXKKw(i);
    }

    public final boolean valueOf() {
        return C33512mxp.AEQbTJ.AYXKKw() == 0;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:20:0x0091 */
    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [o.pth] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.Unit] */
    public final void AEQbTJ(@NotNull java.util.List<? extends InterfaceC39510pth> list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ?? r3 = (InterfaceC39510pth) it.next();
            java.util.List<? extends InterfaceC39510pth> listDCUTEI = C36246oUr.copydefault().DCUTEI();
            Intrinsics.checkNotNullExpressionValue(listDCUTEI, "");
            java.util.Iterator it2 = listDCUTEI.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (Intrinsics.EZpvd((java.lang.Object) ((InterfaceC39510pth) next).getPosId(), (java.lang.Object) r3.getPosId())) {
                        break;
                    }
                }
            }
            InterfaceC39510pth interfaceC39510pth = (InterfaceC39510pth) next;
            if (interfaceC39510pth != null) {
                r3.setLongClick(interfaceC39510pth.getLongClick());
                r3.setSelected(interfaceC39510pth.getSelected());
                r3.setShowSolid(interfaceC39510pth.getShowSolid());
                r3.setDragTP(interfaceC39510pth.isDragTP());
                r3.setDragSL(interfaceC39510pth.isDragSL());
                r3.setLiqSelected(interfaceC39510pth.getLiqSelected());
                r3.setShowSolidLiq(interfaceC39510pth.getShowSolidLiq());
                r3.setBeSelected(interfaceC39510pth.getBeSelected());
                r3.setShowSolidBE(interfaceC39510pth.getShowSolidBE());
                r3 = Unit.INSTANCE;
            }
            arrayList.add(r3);
        }
        C36246oUr.copydefault().EZpvd(list);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:26:0x00ad */
    /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r4v2. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.okinc.kline.data.KlineOpenOrderBean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [kotlin.Unit] */
    public final void EZpvd(@NotNull java.util.List<KlineOpenOrderBean> list) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ?? r3 = (KlineOpenOrderBean) it.next();
            java.util.List<KlineOpenOrderBean> listGasjUx = C36246oUr.copydefault().gasjUx();
            Intrinsics.checkNotNullExpressionValue(listGasjUx, "");
            java.util.Iterator it2 = listGasjUx.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                KlineOpenOrderBean klineOpenOrderBean = (KlineOpenOrderBean) next;
                if (Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdId(), (java.lang.Object) r3.getOrdId()) && Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getOrdType(), (java.lang.Object) r3.getOrdType()) && Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getAmount(), (java.lang.Object) r3.getAmount()) && Intrinsics.EZpvd((java.lang.Object) klineOpenOrderBean.getPrice(), (java.lang.Object) r3.getPrice())) {
                    break;
                }
            }
            KlineOpenOrderBean klineOpenOrderBean2 = (KlineOpenOrderBean) next;
            if (klineOpenOrderBean2 != null) {
                r3.setLongClick(klineOpenOrderBean2.getLongClick());
                r3.setSelected(klineOpenOrderBean2.getSelected());
                r3.setShowSolid(klineOpenOrderBean2.getShowSolid());
                r3.setLineColor(klineOpenOrderBean2.getLineColor());
                r3.setCostPrice(klineOpenOrderBean2.getCostPrice());
                r3.setCostLiq(klineOpenOrderBean2.getCostLiq());
                r3.setCostBE(klineOpenOrderBean2.getCostBE());
                r3 = Unit.INSTANCE;
            }
            arrayList.add(r3);
        }
        C36246oUr.copydefault().AEQbTJ(list);
    }
}
