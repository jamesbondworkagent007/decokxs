package o;

import com.okinc.lib.internal.monitor.memory.MemoryMonitorImpl$scheduleReporter$1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.InterfaceC38044pKd;
import o.pJX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pJl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38025pJl implements pJU {
    public final pJX.StateListAnimator AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final pJX.Application KWHzl;
    public final ConcurrentLinkedQueue<InterfaceC38044pKd.ActionBar> OLrzqt;
    public Job copydefault;
    public final ConcurrentHashMap<java.lang.String, pJZ> gEmmrt;
    public final InterfaceC56387yDm valueOf;

    public C38025pJl(@NotNull pJX.StateListAnimator stateListAnimator, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = stateListAnimator;
        this.EZpvd = coroutineDispatcher;
        this.gEmmrt = new ConcurrentHashMap<>();
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.pJs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C38025pJl.EZpvd(this.AEQbTJ);
            }
        });
        this.OLrzqt = new ConcurrentLinkedQueue<>();
        this.KWHzl = new StateListAnimator();
    }

    public static final CoroutineScope EZpvd(C38025pJl c38025pJl) {
        return CoroutineScopeKt.CoroutineScope(c38025pJl.EZpvd.plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null)));
    }

    public final CoroutineScope EZpvd() {
        return (CoroutineScope) this.valueOf.getValue();
    }

    @Override // o.pJU
    public void KWHzl(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        pJX.Companion.copydefault(this.EZpvd, application, this.AEQbTJ);
        OLrzqt();
        KWHzl();
    }

    public java.util.List<pJZ> AEQbTJ() {
        java.util.Collection<pJZ> collectionValues = this.gEmmrt.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(collectionValues);
    }

    public final void OLrzqt() {
        Job job = this.copydefault;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.copydefault = BuildersKt__Builders_commonKt.launch$default(EZpvd(), null, null, new MemoryMonitorImpl$scheduleReporter$1(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.pJl$StateListAnimator */
    public static final class StateListAnimator implements pJX.Application {
        public StateListAnimator() {
        }

        @Override // o.pJX.Application
        public void copydefault(InterfaceC38044pKd.ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            if (C38025pJl.this.OLrzqt.contains(actionBar)) {
                return;
            }
            C38025pJl.this.OLrzqt.offer(actionBar);
        }
    }

    public final void KWHzl() {
        pJX.Companion.copydefault().KWHzl(this.KWHzl).AhwBna();
    }

    public final void copydefault() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            InterfaceC38044pKd.ActionBar actionBarPoll = this.OLrzqt.poll();
            if (actionBarPoll == null) {
                break;
            } else {
                arrayList.add(actionBarPoll);
            }
        }
        if (!arrayList.isEmpty()) {
            for (pJZ pjz : AEQbTJ()) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    pjz.OLrzqt((InterfaceC38044pKd.ActionBar) it.next());
                }
            }
        }
    }

    @Override // o.pJU
    public void copydefault(@NotNull pJZ... pjzArr) {
        Intrinsics.checkNotNullParameter(pjzArr, "");
        for (pJZ pjz : pjzArr) {
            this.gEmmrt.put(pjz.AEQbTJ(), pjz);
        }
    }
}
