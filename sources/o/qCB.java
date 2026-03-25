package o;

import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.market.common.biz_spot.bean.DefiWebCoins;
import com.okinc.market.search.features.main.recommend.history.data.model.Product;
import com.okinc.market.search.features.main.root.data.po.P2pAndDepositHistory;
import com.okinc.market.search.features.main.root.data.po.SearchTrader;
import com.okinc.market.search.features.main.root.data.po.TradingStrategy;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.trade.source.SearchTradeBizInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC39924qCv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qCB implements InterfaceC39924qCv {
    public final java.util.List<InterfaceC39921qCs<?>> AEQbTJ;
    public final qCG AYXKKw;
    public final qCA EZpvd;
    public final C39925qCw KWHzl;
    public final C39923qCu OLrzqt;
    public final C39922qCt copydefault;
    public final qCC djBIcL;
    public final qCD gEmmrt;

    public qCB(@NotNull C39922qCt c39922qCt, @NotNull qCD qcd, @NotNull C39925qCw c39925qCw, @NotNull qCC qcc, @NotNull C39923qCu c39923qCu, @NotNull qCG qcg, @NotNull qCA qca) {
        Intrinsics.checkNotNullParameter(c39922qCt, "");
        Intrinsics.checkNotNullParameter(qcd, "");
        Intrinsics.checkNotNullParameter(c39925qCw, "");
        Intrinsics.checkNotNullParameter(qcc, "");
        Intrinsics.checkNotNullParameter(c39923qCu, "");
        Intrinsics.checkNotNullParameter(qcg, "");
        Intrinsics.checkNotNullParameter(qca, "");
        this.copydefault = c39922qCt;
        this.gEmmrt = qcd;
        this.KWHzl = c39925qCw;
        this.djBIcL = qcc;
        this.OLrzqt = c39923qCu;
        this.AYXKKw = qcg;
        this.EZpvd = qca;
        this.AEQbTJ = yDY.gEmmrt(c39922qCt, qcd, qcc, c39923qCu, qcg, qca);
    }

    public java.lang.String copydefault(@NotNull java.lang.Object obj) {
        return InterfaceC39924qCv.TaskDescription.EZpvd(this, obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0035: CONSTRUCTOR 
  (r10v0 o.qCt)
  (r11v0 o.qCD)
  (r12v0 o.qCw)
  (wrap:o.qCC:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0009: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:21) call: o.qCC.<init>():void type: CONSTRUCTOR) : (r13v0 o.qCC))
  (wrap:o.qCu:?: TERNARY null = ((wrap:int:0x000c: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0015: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:22) call: o.qCu.<init>():void type: CONSTRUCTOR) : (r14v0 o.qCu))
  (wrap:o.qCG:?: TERNARY null = ((wrap:int:0x0018: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0021: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:23) call: o.qCG.<init>():void type: CONSTRUCTOR) : (r15v0 o.qCG))
  (wrap:o.qCA:?: TERNARY null = ((wrap:int:0x0024: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002d: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:24) call: o.qCA.<init>():void type: CONSTRUCTOR) : (r16v0 o.qCA))
 A[MD:(o.qCt, o.qCD, o.qCw, o.qCC, o.qCu, o.qCG, o.qCA):void (m)] (LINE:17) call: o.qCB.<init>(o.qCt, o.qCD, o.qCw, o.qCC, o.qCu, o.qCG, o.qCA):void type: THIS */
    public /* synthetic */ qCB(C39922qCt c39922qCt, qCD qcd, C39925qCw c39925qCw, qCC qcc, C39923qCu c39923qCu, qCG qcg, qCA qca, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c39922qCt, qcd, c39925qCw, (i & 8) != 0 ? new qCC() : qcc, (i & 16) != 0 ? new C39923qCu() : c39923qCu, (i & 32) != 0 ? new qCG() : qcg, (i & 64) != 0 ? new qCA() : qca);
    }

    @Override // o.InterfaceC39924qCv
    public void KWHzl(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        if (obj instanceof FutureInstrument) {
            FutureInstrument futureInstrument = (FutureInstrument) obj;
            obj = new SearchTradeBizInfo(null, futureInstrument.getInstType(), futureInstrument.getInstFamily(), futureInstrument.getAlias(), null, null, 49, null);
        } else if (obj instanceof BizInstrument) {
            BizInstrument bizInstrument = (BizInstrument) obj;
            obj = new SearchTradeBizInfo(bizInstrument.getInstId(), bizInstrument.getInstType(), null, null, null, null, 60, null);
        }
        java.lang.String strCopydefault = copydefault(obj);
        if (strCopydefault != null) {
            this.KWHzl.KWHzl(strCopydefault);
        }
        if (obj instanceof SearchTradeBizInfo) {
            this.copydefault.EZpvd((SearchTradeBizInfo) obj);
        }
        if (obj instanceof SearchTrader) {
            this.gEmmrt.AEQbTJ((SearchTrader) obj);
        }
        if (obj instanceof TradingStrategy) {
            this.djBIcL.OLrzqt((TradingStrategy) obj);
        }
        if (obj instanceof Product) {
            this.OLrzqt.AEQbTJ((Product) obj);
        }
        if (obj instanceof DefiWebCoins) {
            this.AYXKKw.OLrzqt((DefiWebCoins) obj);
        }
        if (obj instanceof P2pAndDepositHistory) {
            this.EZpvd.AEQbTJ((P2pAndDepositHistory) obj);
        }
    }

    @Override // o.InterfaceC39924qCv
    public void AEQbTJ() {
        this.KWHzl.OLrzqt();
        this.gEmmrt.copydefault();
        this.copydefault.KWHzl();
        this.djBIcL.OLrzqt();
        this.OLrzqt.copydefault();
        this.AYXKKw.EZpvd();
        this.EZpvd.copydefault();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a6 A[EDGE_INSN: B:84:0x01a6->B:85:0x01a7 BREAK  A[LOOP:7: B:80:0x018f->B:114:?], PHI: r10
  0x01a6: PHI (r10v8 java.lang.Object) = 
  (r10v7 java.lang.Object)
  (r10v12 java.lang.Object)
  (r10v16 java.lang.Object)
  (r10v20 java.lang.Object)
  (r10v22 java.lang.Object)
 binds: [B:51:0x0126, B:60:0x0147, B:69:0x0168, B:78:0x0189, B:113:0x01a6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.InterfaceC39924qCv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<java.lang.Object> EZpvd() {
        java.lang.Object obj;
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.Object next3;
        java.lang.Object next4;
        java.lang.Object next5;
        java.util.List<SearchTradeBizInfo> listOLrzqt = this.copydefault.OLrzqt();
        java.util.List<SearchTrader> listEZpvd = this.gEmmrt.EZpvd();
        java.util.List<TradingStrategy> listKWHzl = this.djBIcL.KWHzl();
        java.util.List<Product> listKWHzl2 = this.OLrzqt.KWHzl();
        if (((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).AEQbTJ(OKComplianceRestrictionService.Feature.CEFI_DEX) || C54589xNz.EZpvd.EZpvd()) {
            this.AYXKKw.EZpvd();
        }
        java.util.List<DefiWebCoins> listCopydefault = this.AYXKKw.copydefault();
        if (((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).AEQbTJ(OKComplianceRestrictionService.Feature.P2P)) {
            this.EZpvd.AEQbTJ();
        } else if (((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).AEQbTJ(OKComplianceRestrictionService.Feature.DEPOSIT)) {
            this.EZpvd.KWHzl();
        }
        java.util.List<P2pAndDepositHistory> listEZpvd2 = this.EZpvd.EZpvd();
        if (this.KWHzl.EZpvd().isEmpty() && (!listOLrzqt.isEmpty())) {
            C39925qCw c39925qCw = this.KWHzl;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = listOLrzqt.iterator();
            while (it.hasNext()) {
                java.lang.String strCopydefault = copydefault((SearchTradeBizInfo) it.next());
                if (strCopydefault != null) {
                    arrayList.add(strCopydefault);
                }
            }
            c39925qCw.KWHzl(arrayList);
        }
        java.util.List<java.lang.String> listEZpvd3 = this.KWHzl.EZpvd();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.String str : listEZpvd3) {
            java.util.Iterator<T> it2 = listOLrzqt.iterator();
            while (true) {
                obj = null;
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.EZpvd((java.lang.Object) copydefault((SearchTradeBizInfo) next), (java.lang.Object) str)) {
                    break;
                }
            }
            SearchTradeBizInfo searchTradeBizInfo = (SearchTradeBizInfo) next;
            if (searchTradeBizInfo != null) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
                BizInstrument bizInstrumentCopydefault = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.copydefault(searchTradeBizInfo.getInstType(), searchTradeBizInfo.getInstId(), searchTradeBizInfo.getIndex(), searchTradeBizInfo.getAlias()) : null;
                if (bizInstrumentCopydefault != null) {
                    obj = bizInstrumentCopydefault;
                }
            } else {
                java.util.Iterator<T> it3 = listEZpvd.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                    if (Intrinsics.EZpvd((java.lang.Object) copydefault((SearchTrader) next2), (java.lang.Object) str)) {
                        break;
                    }
                }
                obj = (SearchTrader) next2;
                if (obj == null) {
                    java.util.Iterator<T> it4 = listKWHzl2.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it4.next();
                        if (Intrinsics.EZpvd((java.lang.Object) copydefault((Product) next3), (java.lang.Object) str)) {
                            break;
                        }
                    }
                    obj = (Product) next3;
                    if (obj == null) {
                        java.util.Iterator<T> it5 = listKWHzl.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                next4 = null;
                                break;
                            }
                            next4 = it5.next();
                            if (Intrinsics.EZpvd((java.lang.Object) copydefault((TradingStrategy) next4), (java.lang.Object) str)) {
                                break;
                            }
                        }
                        obj = (TradingStrategy) next4;
                        if (obj == null) {
                            java.util.Iterator<T> it6 = listCopydefault.iterator();
                            while (true) {
                                if (!it6.hasNext()) {
                                    next5 = null;
                                    break;
                                }
                                next5 = it6.next();
                                if (Intrinsics.EZpvd((java.lang.Object) copydefault((DefiWebCoins) next5), (java.lang.Object) str)) {
                                    break;
                                }
                            }
                            obj = (DefiWebCoins) next5;
                            if (obj != null) {
                                obj = obj;
                                break;
                            }
                            for (java.lang.Object obj2 : listEZpvd2) {
                                if (Intrinsics.EZpvd((java.lang.Object) copydefault((P2pAndDepositHistory) obj2), (java.lang.Object) str)) {
                                    obj = obj2;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            if (obj != null) {
                arrayList2.add(obj);
            }
            arrayList2.size();
        }
        return arrayList2;
    }
}
