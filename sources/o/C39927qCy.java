package o;

import com.okinc.market.search.features.main.root.data.po.TradingStrategy;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.trade.source.SearchTradeBizInfo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC39924qCv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qCy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39927qCy implements InterfaceC39924qCv {
    public final C39922qCt EZpvd;
    public final C39925qCw KWHzl;
    public final qCC OLrzqt;

    @yCM
    public C39927qCy(@NotNull C39922qCt c39922qCt, @NotNull C39925qCw c39925qCw, @NotNull qCC qcc) {
        Intrinsics.checkNotNullParameter(c39922qCt, "");
        Intrinsics.checkNotNullParameter(c39925qCw, "");
        Intrinsics.checkNotNullParameter(qcc, "");
        this.EZpvd = c39922qCt;
        this.KWHzl = c39925qCw;
        this.OLrzqt = qcc;
    }

    public java.lang.String EZpvd(@NotNull java.lang.Object obj) {
        return InterfaceC39924qCv.TaskDescription.EZpvd(this, obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (r1v0 o.qCt)
  (r2v0 o.qCw)
  (wrap:o.qCC:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.qCC:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:13) call: o.qCC.<init>():void type: CONSTRUCTOR) : (r3v0 o.qCC))
 A[MD:(o.qCt, o.qCw, o.qCC):void (m)] (LINE:10) call: o.qCy.<init>(o.qCt, o.qCw, o.qCC):void type: THIS */
    public /* synthetic */ C39927qCy(C39922qCt c39922qCt, C39925qCw c39925qCw, qCC qcc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c39922qCt, c39925qCw, (i & 4) != 0 ? new qCC() : qcc);
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
        java.lang.String strEZpvd = EZpvd(obj);
        if (strEZpvd != null) {
            this.KWHzl.KWHzl(strEZpvd);
        }
        if (obj instanceof SearchTradeBizInfo) {
            this.EZpvd.EZpvd((SearchTradeBizInfo) obj);
        }
        if (obj instanceof TradingStrategy) {
            this.OLrzqt.OLrzqt((TradingStrategy) obj);
        }
    }

    @Override // o.InterfaceC39924qCv
    public void AEQbTJ() {
        this.KWHzl.OLrzqt();
        this.EZpvd.KWHzl();
        this.OLrzqt.OLrzqt();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    @Override // o.InterfaceC39924qCv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<java.lang.Object> EZpvd() {
        java.lang.Object next;
        java.lang.Object objCopydefault;
        java.util.List<SearchTradeBizInfo> listOLrzqt = this.EZpvd.OLrzqt();
        java.util.List<TradingStrategy> listKWHzl = this.OLrzqt.KWHzl();
        if (this.KWHzl.EZpvd().isEmpty() && (!listOLrzqt.isEmpty())) {
            C39925qCw c39925qCw = this.KWHzl;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = listOLrzqt.iterator();
            while (it.hasNext()) {
                java.lang.String strEZpvd = EZpvd((SearchTradeBizInfo) it.next());
                if (strEZpvd != null) {
                    arrayList.add(strEZpvd);
                }
            }
            c39925qCw.KWHzl(arrayList);
        }
        java.util.List<java.lang.String> listEZpvd = this.KWHzl.EZpvd();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<T> it2 = listEZpvd.iterator();
        while (true) {
            java.lang.Object obj = null;
            if (!it2.hasNext()) {
                break;
            }
            java.lang.String str = (java.lang.String) it2.next();
            java.util.Iterator<T> it3 = listOLrzqt.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it3.next();
                if (Intrinsics.EZpvd((java.lang.Object) EZpvd((SearchTradeBizInfo) next2), (java.lang.Object) str)) {
                    obj = next2;
                    break;
                }
            }
            SearchTradeBizInfo searchTradeBizInfo = (SearchTradeBizInfo) obj;
            if (searchTradeBizInfo != null) {
                arrayList2.add(searchTradeBizInfo);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.String str2 : listEZpvd) {
            java.util.Iterator<T> it4 = listOLrzqt.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
                if (Intrinsics.EZpvd((java.lang.Object) EZpvd((SearchTradeBizInfo) next), (java.lang.Object) str2)) {
                    break;
                }
            }
            SearchTradeBizInfo searchTradeBizInfo2 = (SearchTradeBizInfo) next;
            if (searchTradeBizInfo2 != null) {
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
                objCopydefault = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.copydefault(searchTradeBizInfo2.getInstType(), searchTradeBizInfo2.getInstId(), searchTradeBizInfo2.getIndex(), searchTradeBizInfo2.getAlias()) : null;
                if (objCopydefault == null) {
                }
            } else {
                java.util.Iterator<T> it5 = listKWHzl.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        objCopydefault = null;
                        break;
                    }
                    java.lang.Object next3 = it5.next();
                    if (Intrinsics.EZpvd((java.lang.Object) EZpvd((TradingStrategy) next3), (java.lang.Object) str2)) {
                        objCopydefault = next3;
                        break;
                    }
                }
            }
            if (objCopydefault != null) {
                arrayList3.add(objCopydefault);
            }
        }
        return CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) arrayList3, 20);
    }
}
