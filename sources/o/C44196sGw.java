package o;

import com.okinc.okimcore.feature.conversation.UnreadCountManager$resetTotalUnreadCountFlow$1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: renamed from: o.sGw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44196sGw {
    public static Job AYXKKw;
    public static CoroutineScope KWHzl;
    public static final C44196sGw copydefault = new C44196sGw();
    public static final MutableSharedFlow<java.lang.Integer> OLrzqt = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
    public static final AtomicInteger AEQbTJ = new AtomicInteger(-1);
    public static final int EZpvd = 8;

    private C44196sGw() {
    }

    public final CoroutineScope OLrzqt() {
        CoroutineScope coroutineScope = KWHzl;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        CoroutineScope coroutineScopeGtdfxv = ((sEZ) C58113yvE.copydefault(C32979mnm.EZpvd.OLrzqt(), sEZ.class)).gtdfxv();
        KWHzl = coroutineScopeGtdfxv;
        return coroutineScopeGtdfxv;
    }

    public final void EZpvd() {
        Job job = AYXKKw;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        AYXKKw = BuildersKt__Builders_commonKt.launch$default(OLrzqt(), sDN.copydefault.copydefault(), null, new UnreadCountManager$resetTotalUnreadCountFlow$1(null), 2, null);
    }

    public final void AEQbTJ() {
        OLrzqt(0);
    }

    public final void OLrzqt(int i) {
        pUU.KWHzl("CoreUnreadCountManager", "setUnreadCountAndBadgeCount: " + i);
        OLrzqt.tryEmit(java.lang.Integer.valueOf(i));
        copydefault(i);
    }

    public final void copydefault(int i) {
        if (AEQbTJ.getAndSet(i) != i) {
            pUU.KWHzl("CoreUnreadCountManager", "set badge count: " + i);
            try {
                xVV.djBIcL(C32979mnm.EZpvd.OLrzqt(), i);
                pUU.KWHzl("CoreUnreadCountManager", "BadgeUtil.setBadgeCount called with: " + i);
            } catch (java.lang.Exception e) {
                pUU.copydefault("CoreUnreadCountManager", "BadgeUtil.setBadgeCount failed: " + e.getMessage());
            }
        }
    }
}
