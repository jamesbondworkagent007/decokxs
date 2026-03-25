package o;

import com.okinc.network.okg.dns.executor.OKDohConfig;
import com.okinc.network.okg.dns.model.DoHChain;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rnc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43349rnc {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final ConcurrentHashMap<DoHChain, C43326rnF> KWHzl = new ConcurrentHashMap<>();

    public final boolean KWHzl(@NotNull DoHChain doHChain) {
        Intrinsics.checkNotNullParameter(doHChain, "");
        return this.KWHzl.containsKey(doHChain);
    }

    public final java.util.Set<Map.Entry<DoHChain, C43326rnF>> EZpvd() {
        java.util.Set<Map.Entry<DoHChain, C43326rnF>> setEntrySet = this.KWHzl.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        return setEntrySet;
    }

    public final java.util.Enumeration<DoHChain> copydefault() {
        java.util.Enumeration<DoHChain> enumerationKeys = this.KWHzl.keys();
        Intrinsics.checkNotNullExpressionValue(enumerationKeys, "");
        return enumerationKeys;
    }

    public final C43326rnF copydefault(@NotNull DoHChain doHChain) {
        Intrinsics.checkNotNullParameter(doHChain, "");
        C43326rnF c43326rnF = this.KWHzl.get(doHChain);
        if (c43326rnF != null) {
            return c43326rnF;
        }
        pUU.KWHzl("DnsExecutors", "getOrCreate, create executors for chain:" + doHChain);
        C43326rnF c43326rnFOLrzqt = OLrzqt(doHChain);
        this.KWHzl.put(doHChain, c43326rnFOLrzqt);
        return c43326rnFOLrzqt;
    }

    public static /* synthetic */ void startTimer$default(C43349rnc c43349rnc, long j, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        c43349rnc.OLrzqt(j);
    }

    public final C43326rnF OLrzqt(DoHChain doHChain) {
        ReentrantLock reentrantLock = new ReentrantLock();
        java.util.concurrent.locks.Condition conditionNewCondition = reentrantLock.newCondition();
        OKDohConfig oKDohConfig = new OKDohConfig(doHChain.getTarget(), null);
        Intrinsics.copydefault(conditionNewCondition);
        return new C43326rnF(oKDohConfig, reentrantLock, conditionNewCondition, null, 8, null);
    }

    /* JADX INFO: renamed from: o.rnc$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rnc.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final void OLrzqt(long j) {
        java.util.Iterator<Map.Entry<DoHChain, C43326rnF>> it = this.KWHzl.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().KWHzl(j);
        }
    }

    public final void KWHzl() {
        java.util.Iterator<Map.Entry<DoHChain, C43326rnF>> it = this.KWHzl.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().gEmmrt();
        }
    }
}
