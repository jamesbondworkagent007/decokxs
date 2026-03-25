package o;

import androidx.camera.video.AudioStats;
import com.okinc.kline.ui.view.pricewindow.PriceFloatWindowManager$subV5Tickers$1;
import com.okinc.kline.ui.view.pricewindow.PriceWindowData;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.C38358pVv;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes9.dex */
public final class pBO extends AbstractC37822pBz {
    public static CoroutineScope dvKsVJ;
    public static android.app.Activity finit;
    public static final pBO dxcTrN = new pBO();
    public static C38358pVv fFgQHt = new C38358pVv();
    public static final int UeEOUB = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(android.app.Activity activity) {
        finit = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.app.Activity sSMYrx() {
        return finit;
    }

    private pBO() {
    }

    public final void gHZMYf() {
        fetchVPNInfo().clear();
        AhwBna().clear();
        java.util.Iterator<PriceWindowData.PriceWindowItem> it = isConnected().iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            PriceWindowData.PriceWindowItem next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            PriceWindowData.PriceWindowItem priceWindowItem = next;
            AhwBna().add(priceWindowItem.getContract());
            java.lang.String strAEQbTJ = pFI.AEQbTJ(priceWindowItem.getKlineType());
            if (!fetchVPNInfo().contains(strAEQbTJ)) {
                fetchVPNInfo().add(strAEQbTJ);
            }
        }
        valueOf().set(0);
    }

    public final void AEQbTJ(java.util.ArrayList<java.lang.String> arrayList) {
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ;
        InterfaceC58217yxC interfaceC58217yxCAkhnZx = AkhnZx();
        if (interfaceC58217yxCAkhnZx != null) {
            interfaceC58217yxCAkhnZx.dispose();
        }
        AbstractC58185ywX<C38358pVv.StateListAnimator> abstractC58185ywXGEmmrt = fFgQHt.gEmmrt(arrayList);
        if (abstractC58185ywXGEmmrt != null) {
            final Function1 function1 = new Function1() { // from class: o.pBP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return pBO.AEQbTJ((C38358pVv.StateListAnimator) obj);
                }
            };
            interfaceC58217yxCAEQbTJ = abstractC58185ywXGEmmrt.AEQbTJ(new InterfaceC58227yxM() { // from class: o.pBQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    pBO.djBIcL(function1, obj);
                }
            });
        } else {
            interfaceC58217yxCAEQbTJ = null;
        }
        KWHzl(interfaceC58217yxCAEQbTJ);
    }

    public static final void djBIcL(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(C38358pVv.StateListAnimator stateListAnimator) {
        InterfaceC49425uoM interfaceC49425uoM;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2;
        AbstractC54531xLw abstractC54531xLwOLrzqt2;
        InterfaceC54577xNn interfaceC54577xNn3;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3;
        AbstractC54531xLw abstractC54531xLwOLrzqt3;
        for (TickersData tickersData : stateListAnimator.OLrzqt()) {
            for (PriceWindowData.PriceWindowItem priceWindowItem : dxcTrN.isConnected()) {
                if (Intrinsics.EZpvd((java.lang.Object) tickersData.getInstId(), (java.lang.Object) priceWindowItem.getContract())) {
                    java.lang.String instType = tickersData.getInstType();
                    switch (instType.hashCode()) {
                        case -2027980370:
                            if (instType.equals("MARGIN")) {
                                InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                                if (interfaceC49425uoM2 != null && (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt2 = interfaceC54577xNn2.OLrzqt()) != null && (abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt2.OLrzqt(tickersData.getInstType())) != null) {
                                    BizInstrument bizInstrumentValueOf = abstractC54531xLwOLrzqt2.valueOf(tickersData.getInstId());
                                    java.lang.String instFamily = bizInstrumentValueOf != null ? bizInstrumentValueOf.getInstFamily() : null;
                                    Intrinsics.copydefault((java.lang.Object) instFamily);
                                    priceWindowItem.setPrice(C54536xML.toSafeString$default(abstractC54531xLwOLrzqt2.gEmmrt(instFamily).AYXKKw(tickersData.getLast()).djBIcL().AkhnZx(), false, 1, null));
                                }
                            }
                            break;
                        case -1956807563:
                            if (instType.equals("OPTION") && (interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class)) != null && (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt = interfaceC54577xNn.OLrzqt()) != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(tickersData.getInstType())) != null) {
                                BizInstrument bizInstrumentValueOf2 = abstractC54531xLwOLrzqt.valueOf(tickersData.getInstId());
                                java.lang.String instFamily2 = bizInstrumentValueOf2 != null ? bizInstrumentValueOf2.getInstFamily() : null;
                                Intrinsics.copydefault((java.lang.Object) instFamily2);
                                priceWindowItem.setPrice(C54536xML.toSafeString$default(abstractC54531xLwOLrzqt.gEmmrt(instFamily2).AYXKKw(tickersData.getLast()).djBIcL().AkhnZx(), false, 1, null));
                            }
                            break;
                        case 2552066:
                            if (instType.equals("SPOT")) {
                            }
                            break;
                        case 2558355:
                            if (instType.equals("SWAP")) {
                                InterfaceC49425uoM interfaceC49425uoM3 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
                                if (interfaceC49425uoM3 != null && (interfaceC54577xNn3 = (InterfaceC54577xNn) interfaceC49425uoM3.KWHzl(TradeKey.MANAGER)) != null && (interfaceC54581xNrOLrzqt3 = interfaceC54577xNn3.OLrzqt()) != null && (abstractC54531xLwOLrzqt3 = interfaceC54581xNrOLrzqt3.OLrzqt(tickersData.getInstType())) != null) {
                                    BizInstrument bizInstrumentValueOf3 = abstractC54531xLwOLrzqt3.valueOf(tickersData.getInstId());
                                    java.lang.String instFamily3 = bizInstrumentValueOf3 != null ? bizInstrumentValueOf3.getInstFamily() : null;
                                    Intrinsics.copydefault((java.lang.Object) instFamily3);
                                    priceWindowItem.setPrice(C54536xML.toSafeString$default(abstractC54531xLwOLrzqt3.gEmmrt(instFamily3).AYXKKw(tickersData.getLast()).djBIcL().AkhnZx(), false, 1, null));
                                }
                            }
                            break;
                        case 214415088:
                            if (instType.equals("FUTURES")) {
                            }
                            break;
                    }
                    InterfaceC46557tYt interfaceC46557tYt = (InterfaceC46557tYt) C43251rlk.OLrzqt(InterfaceC46557tYt.class);
                    java.lang.String strOLrzqt = interfaceC46557tYt != null ? interfaceC46557tYt.OLrzqt(tickersData.getOpen24h(), tickersData.getSodUtc0(), tickersData.getSodUtc8()) : null;
                    java.lang.String strSubS$default = C33129mqd.subS$default(tickersData.getLast(), strOLrzqt, null, null, null, 14, null);
                    RoundingMode roundingMode = RoundingMode.HALF_UP;
                    double dDivD$default = C33129mqd.divD$default(strSubS$default, strOLrzqt, 4, null, roundingMode, 4, null);
                    java.lang.String str = dDivD$default > AudioStats.AUDIO_AMPLITUDE_NONE ? Marker.ANY_NON_NULL_MARKER : "";
                    priceWindowItem.setChangePercent(str + pTB.KWHzl(pTB.OLrzqt(java.lang.Double.valueOf(dDivD$default)), 2, roundingMode));
                }
            }
        }
        pBO pbo = dxcTrN;
        pbo.AYXKKw().OLrzqt();
        pbo.AYXKKw().OLrzqt(pbo.isConnected());
        pbo.AYXKKw().notifyDataSetChanged();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC37822pBz
    public void values() {
        AubY();
    }

    @Override // o.AbstractC37822pBz
    public void AubY() {
        CoroutineScope coroutineScope = dvKsVJ;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
        CoroutineScope coroutineScopeMainScope = CoroutineScopeKt.MainScope();
        dvKsVJ = coroutineScopeMainScope;
        if (coroutineScopeMainScope != null) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScopeMainScope, null, null, new PriceFloatWindowManager$subV5Tickers$1(null), 3, null);
        }
    }

    @Override // o.AbstractC37822pBz
    public void gEmmrt() {
        super.gEmmrt();
        CoroutineScope coroutineScope = dvKsVJ;
        if (coroutineScope != null) {
            CoroutineScopeKt.cancel$default(coroutineScope, null, 1, null);
        }
    }
}
