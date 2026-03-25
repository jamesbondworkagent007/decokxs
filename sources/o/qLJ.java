package o;

import com.okinc.core.util.SPUtils;
import com.okinc.unify_trade.trade.source.SearchTradeBizInfo;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qLJ {
    private static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final java.util.Map<java.lang.Boolean, LinkedList<SearchTradeBizInfo>> EZpvd = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ(boolean z) {
        return z ? "market.nav_search_history_simulation" : "market.nav_search_history";
    }

    @yCM
    public qLJ() {
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qLJ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final boolean KWHzl() {
        return pWO.KWHzl().EZpvd();
    }

    public final LinkedList<SearchTradeBizInfo> EZpvd() {
        boolean zKWHzl = KWHzl();
        java.util.Map<java.lang.Boolean, LinkedList<SearchTradeBizInfo>> map = this.EZpvd;
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(zKWHzl);
        LinkedList<SearchTradeBizInfo> linkedList = map.get(boolValueOf);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            KWHzl(linkedList, zKWHzl);
            map.put(boolValueOf, linkedList);
        }
        return linkedList;
    }

    public final void KWHzl(LinkedList<SearchTradeBizInfo> linkedList, boolean z) {
        java.util.Collection arrayList = SPUtils.getArrayList(AEQbTJ(z), SearchTradeBizInfo.class);
        if (arrayList == null) {
            arrayList = yDY.AhwBna();
        }
        if (!arrayList.isEmpty()) {
            linkedList.clear();
            linkedList.addAll(CollectionsKt___CollectionsKt.AhwBna(arrayList, 20));
        }
    }

    public final void EZpvd(LinkedList<SearchTradeBizInfo> linkedList, boolean z) {
        SPUtils.put(AEQbTJ(z), linkedList);
    }

    public java.util.List<SearchTradeBizInfo> copydefault() {
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(EZpvd());
    }

    public java.util.List<SearchTradeBizInfo> KWHzl(@NotNull SearchTradeBizInfo searchTradeBizInfo) {
        Intrinsics.checkNotNullParameter(searchTradeBizInfo, "");
        LinkedList<SearchTradeBizInfo> linkedListEZpvd = EZpvd();
        boolean zKWHzl = KWHzl();
        linkedListEZpvd.remove(searchTradeBizInfo);
        linkedListEZpvd.addFirst(searchTradeBizInfo);
        if (linkedListEZpvd.size() > 20) {
            while (linkedListEZpvd.size() > 20) {
                linkedListEZpvd.removeLast();
            }
        }
        EZpvd(linkedListEZpvd, zKWHzl);
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(linkedListEZpvd);
    }

    public void AEQbTJ() {
        boolean zKWHzl = KWHzl();
        java.lang.String strAEQbTJ = AEQbTJ(zKWHzl);
        this.EZpvd.remove(java.lang.Boolean.valueOf(zKWHzl));
        SPUtils.remove(strAEQbTJ);
    }
}
