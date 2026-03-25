package o;

import com.okinc.core.util.SPUtils;
import com.okinc.market.search.features.main.root.data.po.P2pAndDepositHistory;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qCA implements InterfaceC39921qCs<P2pAndDepositHistory> {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public java.util.ArrayList<P2pAndDepositHistory> EZpvd = new java.util.ArrayList<>();

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qCA.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.util.List<P2pAndDepositHistory> EZpvd() {
        java.util.ArrayList arrayList = SPUtils.getArrayList("market.p2p_and_Deposit_History_Key", P2pAndDepositHistory.class);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        if (arrayList.size() != 0) {
            this.EZpvd.addAll(arrayList);
        }
        return this.EZpvd;
    }

    public void copydefault() {
        this.EZpvd.clear();
        SPUtils.put("market.p2p_and_Deposit_History_Key", this.EZpvd);
    }

    public void OLrzqt() {
        SPUtils.put("market.p2p_and_Deposit_History_Key", CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) this.EZpvd, 20));
    }

    public void AEQbTJ(@NotNull P2pAndDepositHistory p2pAndDepositHistory) {
        Intrinsics.checkNotNullParameter(p2pAndDepositHistory, "");
        if (!this.EZpvd.contains(p2pAndDepositHistory)) {
            this.EZpvd.add(0, p2pAndDepositHistory);
        } else {
            this.EZpvd.remove(p2pAndDepositHistory);
            this.EZpvd.add(0, p2pAndDepositHistory);
        }
        OLrzqt();
    }

    public final void AEQbTJ() {
        java.util.ArrayList<P2pAndDepositHistory> arrayList = this.EZpvd;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (((P2pAndDepositHistory) obj).isP2p()) {
                arrayList2.add(obj);
            }
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.EZpvd.remove((P2pAndDepositHistory) it.next());
        }
        SPUtils.put("market.p2p_and_Deposit_History_Key", this.EZpvd);
    }

    public final void KWHzl() {
        java.util.ArrayList<P2pAndDepositHistory> arrayList = this.EZpvd;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (!((P2pAndDepositHistory) obj).isP2p()) {
                arrayList2.add(obj);
            }
        }
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            this.EZpvd.remove((P2pAndDepositHistory) it.next());
        }
        SPUtils.put("market.p2p_and_Deposit_History_Key", this.EZpvd);
    }
}
