package o;

import com.okinc.network.okg.core.ThreadPoolType;
import io.reactivex.internal.schedulers.RxThreadFactory;
import java.lang.Thread;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import okhttp3.Dispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rnk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43357rnk {
    public static final C43357rnk KWHzl = new C43357rnk();
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.rnn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43357rnk.EZpvd();
        }
    });
    public static final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.rnm
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C43357rnk.KWHzl();
        }
    });
    public static final int OLrzqt = 8;

    private C43357rnk() {
    }

    public final C43358rnl djBIcL() {
        return (C43358rnl) copydefault.getValue();
    }

    public static final C43358rnl EZpvd() {
        return new C43358rnl();
    }

    public static final yAY KWHzl() {
        return new yAY(new RxThreadFactory("OKNet-RxSingle", 5, true));
    }

    public final yAY gEmmrt() {
        return (yAY) AEQbTJ.getValue();
    }

    public final yAY OLrzqt() {
        return gEmmrt();
    }

    public final ThreadPoolExecutor KWHzl(@NotNull ThreadPoolType threadPoolType) {
        Intrinsics.checkNotNullParameter(threadPoolType, "");
        return djBIcL().AEQbTJ(threadPoolType).AEQbTJ();
    }

    public final Dispatcher copydefault(@NotNull ThreadPoolType threadPoolType) {
        Intrinsics.checkNotNullParameter(threadPoolType, "");
        return djBIcL().AEQbTJ(threadPoolType).KWHzl();
    }

    public final AbstractC58253yxm EZpvd(@NotNull ThreadPoolType threadPoolType) {
        Intrinsics.checkNotNullParameter(threadPoolType, "");
        return djBIcL().AEQbTJ(threadPoolType).OLrzqt();
    }

    public final <T> AbstractC58185ywX<T> EZpvd(@NotNull AbstractC58185ywX<T> abstractC58185ywX, @NotNull ThreadPoolType threadPoolType) {
        Intrinsics.checkNotNullParameter(abstractC58185ywX, "");
        Intrinsics.checkNotNullParameter(threadPoolType, "");
        if (!Intrinsics.EZpvd(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            return abstractC58185ywX;
        }
        AbstractC58185ywX<T> abstractC58185ywXCopydefault = abstractC58185ywX.copydefault(EZpvd(threadPoolType));
        Intrinsics.copydefault(abstractC58185ywXCopydefault);
        return abstractC58185ywXCopydefault;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rnk */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logThreadState$default(C43357rnk c43357rnk, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = null;
        }
        c43357rnk.AEQbTJ(map);
    }

    public final void AEQbTJ(java.util.Map<java.lang.String, java.lang.String> map) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.ThreadGroup threadGroup = java.lang.Thread.currentThread().getThreadGroup();
        while (true) {
            if ((threadGroup != null ? threadGroup.getParent() : null) == null) {
                break;
            } else {
                threadGroup = threadGroup.getParent();
            }
        }
        if (threadGroup == null) {
            return;
        }
        int iEZpvd = C56548yJl.EZpvd(threadGroup.activeCount() * 2, 64, 32768);
        java.lang.Thread[] threadArr = new java.lang.Thread[0];
        int i = 0;
        int iEnumerate = 0;
        while (true) {
            if (i >= 8 || (iEnumerate = threadGroup.enumerate((threadArr = new java.lang.Thread[iEZpvd]), true)) < iEZpvd) {
                break;
            }
            int iValueOf = C56548yJl.valueOf(iEZpvd * 2, 32768);
            if (iValueOf <= iEZpvd) {
                pUU.KWHzl("NetworkThreadPoolManager", "cannot grow further (reached or exceeded max) " + iValueOf);
                break;
            }
            i++;
            iEZpvd = iValueOf;
        }
        java.util.Map mapOLrzqt = C56416yEo.OLrzqt(new StateListAnimator(C59467zhb.wlaJM(C59467zhb.AYXKKw(yDV.getNewProxyInstance(threadArr), C56548yJl.copydefault(iEnumerate, 0)))));
        java.lang.Integer num = (java.lang.Integer) mapOLrzqt.get(Thread.State.TIMED_WAITING);
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.Integer num2 = (java.lang.Integer) mapOLrzqt.get(Thread.State.WAITING);
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        java.lang.Integer num3 = (java.lang.Integer) mapOLrzqt.get(Thread.State.RUNNABLE);
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        java.lang.Integer num4 = (java.lang.Integer) mapOLrzqt.get(Thread.State.BLOCKED);
        int iIntValue4 = num4 != null ? num4.intValue() : 0;
        int iRlQdEF = CollectionsKt___CollectionsKt.RlQdEF(mapOLrzqt.values());
        pUU.KWHzl("NetworkThreadPoolManager", "timer_waiting: " + iIntValue + ", waiting: " + iIntValue2 + ", runnable: " + iIntValue3 + ", block: " + iIntValue4 + ", cost: " + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        if (map != null) {
            map.put("attr_1", java.lang.String.valueOf(iRlQdEF));
            map.put("otherTime", java.lang.String.valueOf(iIntValue + iIntValue2));
            map.put("launchTime", java.lang.String.valueOf(iIntValue3));
        }
    }

    /* JADX INFO: renamed from: o.rnk$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC56413yEl<java.lang.Thread, Thread.State> {
        public final /* synthetic */ Sequence AEQbTJ;

        public StateListAnimator(Sequence sequence) {
            this.AEQbTJ = sequence;
        }

        @Override // o.InterfaceC56413yEl
        public java.util.Iterator<java.lang.Thread> sourceIterator() {
            return this.AEQbTJ.iterator();
        }

        @Override // o.InterfaceC56413yEl
        public Thread.State keyOf(java.lang.Thread thread) {
            return thread.getState();
        }
    }
}
