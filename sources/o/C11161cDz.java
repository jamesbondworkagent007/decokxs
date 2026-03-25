package o;

import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cDz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11161cDz {
    public static final C11161cDz OLrzqt = new C11161cDz();

    private C11161cDz() {
    }

    public final boolean OLrzqt(@NotNull final AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (!abstractC12782ctV.AubY() && !abstractC12782ctV.AwvSrB() && !abstractC12782ctV.QfsBiF()) {
            return false;
        }
        java.util.ArrayList<ChainAddress> arrayListGGvvIC = abstractC12782ctV.gGvvIC();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : arrayListGGvvIC) {
            java.lang.Long lValueOf = java.lang.Long.valueOf(((ChainAddress) obj).getCoinId());
            java.lang.Object arrayList = linkedHashMap.get(lValueOf);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(lValueOf, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(((java.lang.Number) entry.getKey()).longValue());
            if (c10854bwMKWHzl != null && c10854bwMKWHzl.iRxXKY()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.List<C10854bwM> listOLrzqt = C10954byG.EZpvd.valueOf().OLrzqt(6);
        if (linkedHashMap2.isEmpty() || !C33129mqd.KWHzl((java.util.Collection) listOLrzqt) || linkedHashMap2.size() == listOLrzqt.size()) {
            return false;
        }
        java.lang.Object objAhwBna = yDY.AhwBna();
        if (abstractC12782ctV.QfsBiF()) {
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                if (C33129mqd.KWHzl((java.util.Collection) entry2.getValue())) {
                    objAhwBna = entry2.getValue();
                }
            }
        } else {
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                java.lang.Iterable iterable = (java.lang.Iterable) entry3.getValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
                java.util.Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(java.lang.Integer.valueOf(((ChainAddress) it.next()).getAddressType()));
                }
                C8322bAY c8322bAY = C8322bAY.KWHzl;
                if (arrayList2.containsAll(c8322bAY.OLrzqt()) && c8322bAY.OLrzqt().containsAll(arrayList2)) {
                    objAhwBna = entry3.getValue();
                }
            }
        }
        if (!C33129mqd.KWHzl((java.util.Collection) objAhwBna)) {
            return false;
        }
        final java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator<T> it2 = listOLrzqt.iterator();
        while (true) {
            java.lang.Object obj2 = null;
            if (!it2.hasNext()) {
                break;
            }
            C10854bwM c10854bwM = (C10854bwM) it2.next();
            java.util.Collection collection = (java.util.Collection) linkedHashMap2.get(java.lang.Long.valueOf(c10854bwM.AhwBna()));
            if (collection == null || collection.isEmpty()) {
                arrayList3.add(java.lang.Long.valueOf(c10854bwM.fetchVPNInfo()));
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                for (ChainAddress chainAddress : (java.lang.Iterable) objAhwBna) {
                    arrayList4.add(chainAddress.copy((253 & 1) != 0 ? chainAddress.coinId : c10854bwM.AEQbTJ(), (253 & 2) != 0 ? chainAddress.address : null, (253 & 4) != 0 ? chainAddress.addressType : 0, (253 & 8) != 0 ? chainAddress.proxyAddres : null, (253 & 16) != 0 ? chainAddress.eoaAddress : null, (253 & 32) != 0 ? chainAddress.isDefault : false, (253 & 64) != 0 ? chainAddress.publicKey : null, (253 & 128) != 0 ? chainAddress.derivePath : null));
                }
                abstractC12782ctV.gGvvIC().addAll(arrayList4);
                java.util.Iterator it3 = arrayList4.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it3.next();
                    if (((ChainAddress) next).getAddressType() == C8322bAY.KWHzl.KWHzl(c10854bwM.fetchVPNInfo(), true)) {
                        obj2 = next;
                        break;
                    }
                }
                final ChainAddress chainAddress2 = (ChainAddress) obj2;
                if (chainAddress2 == null) {
                    chainAddress2 = (ChainAddress) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList4);
                }
                abstractC12782ctV.OLrzqt(new Function1() { // from class: o.cDy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj3) {
                        return C11161cDz.EZpvd(chainAddress2, (java.util.ArrayList) obj3);
                    }
                });
            }
        }
        if (!arrayList3.isEmpty()) {
            C32866mlf.onEvent$default("Wallet_ChainUpdate_Aggr_B", (TrackChannel[]) null, new Function1() { // from class: o.cDx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return C11161cDz.KWHzl(abstractC12782ctV, arrayList3, (EventParamsList) obj3);
                }
            }, 1, (java.lang.Object) null);
        }
        return !arrayList3.isEmpty();
    }

    public static final java.util.ArrayList EZpvd(ChainAddress chainAddress, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        arrayList.add(chainAddress);
        return arrayList;
    }

    public static final Unit KWHzl(AbstractC12782ctV abstractC12782ctV, java.util.ArrayList arrayList, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "wallet_id", abstractC12782ctV.DbNXlk(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "new_chain_id", CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null), false, 4, null);
        return Unit.INSTANCE;
    }
}
