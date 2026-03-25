package o;

import com.okinc.business.defi.biz.core.common.WalletSelectedChainBean;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C10614brl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ffH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18269ffH {
    public final C10614brl OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C18269ffH() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C18269ffH(@NotNull C10614brl c10614brl) {
        Intrinsics.checkNotNullParameter(c10614brl, "");
        this.OLrzqt = c10614brl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:o.brl:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.brl:0x0007: INVOKE 
  (wrap:o.brl$TaskDescription:0x0004: SGET  A[WRAPPED] (LINE:13) o.brl.Companion o.brl$TaskDescription)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.brl.TaskDescription.getInstance$default(o.brl$TaskDescription, android.content.Context, int, java.lang.Object):o.brl A[MD:(o.brl$TaskDescription, android.content.Context, int, java.lang.Object):o.brl (m), WRAPPED] (LINE:13)) : (r1v0 o.brl))
 A[MD:(o.brl):void (m)] (LINE:12) call: o.ffH.<init>(o.brl):void type: THIS */
    public /* synthetic */ C18269ffH(C10614brl c10614brl, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null) : c10614brl);
    }

    public final java.util.List<C10525bqB> AEQbTJ(@NotNull AbstractC12782ctV abstractC12782ctV, @NotNull java.util.List<C10525bqB> list) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(list, "");
        WalletSelectedChainBean walletSelectedChainBeanKWHzl = this.OLrzqt.KWHzl(abstractC12782ctV.DbNXlk());
        java.util.List<C10854bwM> listRKDWNf = abstractC12782ctV.RKDWNf();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listRKDWNf, 10));
        java.util.Iterator<T> it = listRKDWNf.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((C10854bwM) it.next()).AhwBna()));
        }
        java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
        if (walletSelectedChainBeanKWHzl.isAllNetwork()) {
            return getAggregateCoins$default(this, abstractC12782ctV, list, null, 4, null);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            C10525bqB c10525bqB = (C10525bqB) obj;
            if (c10525bqB.KWHzl().fetchVPNInfo() == C33129mqd.valueOf(walletSelectedChainBeanKWHzl.getGeneralChainId()) && (!c10525bqB.KWHzl().giSNqX() || setOqFWZa.contains(java.lang.Long.valueOf(c10525bqB.OLrzqt())) || C33129mqd.AEQbTJ(c10525bqB.copydefault(), 0))) {
                arrayList2.add(obj);
            }
        }
        return EZpvd(abstractC12782ctV, arrayList2, C56402yEa.EZpvd(2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ffH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.util.List getAggregateCoins$default(C18269ffH c18269ffH, AbstractC12782ctV abstractC12782ctV, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list2 = yDY.gEmmrt(1, 2);
        }
        return c18269ffH.EZpvd(abstractC12782ctV, (java.util.List<C10525bqB>) list, (java.util.List<java.lang.Integer>) list2);
    }

    public final java.util.List<C10525bqB> EZpvd(AbstractC12782ctV abstractC12782ctV, java.util.List<C10525bqB> list, java.util.List<java.lang.Integer> list2) {
        java.util.Map<java.lang.String, java.util.List<C10525bqB>> mapHrNTAI = abstractC12782ctV.hrNTAI();
        Intrinsics.copydefault(mapHrNTAI, "");
        return CollectionsKt___CollectionsKt.EZpvd(EZpvd(list, list2, yDY.gEmmrt(mapHrNTAI, C56424yEw.KWHzl())), C10534bqK.copydefault);
    }

    public final java.util.List<C10525bqB> AEQbTJ(java.util.List<C10525bqB> list, boolean z, int i, java.util.Map<java.lang.Object, ? extends java.util.List<C10525bqB>> map) {
        java.lang.Object objValueOf;
        java.util.List<C10525bqB> list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C10525bqB c10525bqBFetchVPNInfo = ((C10525bqB) it.next()).fetchVPNInfo();
            if (i == 1 && c10525bqBFetchVPNInfo.KWHzl().giSNqX()) {
                objValueOf = c10525bqBFetchVPNInfo.KWHzl().fJNWhG();
            } else {
                objValueOf = (i == 2 && c10525bqBFetchVPNInfo.KWHzl().dxcTrN()) ? java.lang.Long.valueOf(c10525bqBFetchVPNInfo.KWHzl().AhwBna()) : null;
            }
            if (objValueOf == null) {
                arrayList.add(c10525bqBFetchVPNInfo);
            } else {
                java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(objValueOf);
                if (num == null) {
                    linkedHashMap.put(objValueOf, java.lang.Integer.valueOf(arrayList.size()));
                    if (z && (list2 = map.get(objValueOf)) != null && C33129mqd.AEQbTJ(java.lang.Integer.valueOf(list2.size()), 1)) {
                        c10525bqBFetchVPNInfo.DbNXlk();
                    }
                    arrayList.add(c10525bqBFetchVPNInfo);
                } else {
                    ((C10525bqB) arrayList.get(num.intValue())).EZpvd(c10525bqBFetchVPNInfo);
                }
            }
        }
        return arrayList;
    }

    public final java.util.List<C10525bqB> EZpvd(java.util.List<C10525bqB> list, java.util.List<java.lang.Integer> list2, java.util.List<? extends java.util.Map<java.lang.Object, ? extends java.util.List<C10525bqB>>> list3) {
        int i = 0;
        for (java.lang.Object obj : list2) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            list = AEQbTJ(list, true, ((java.lang.Number) obj).intValue(), list3.get(i));
            i++;
        }
        return list;
    }
}
