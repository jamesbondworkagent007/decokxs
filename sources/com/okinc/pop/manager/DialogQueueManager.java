package com.okinc.pop.manager;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.okinc.pop.manager.DialogQueueManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58185ywX;
import o.AbstractC58247yxg;
import o.C46515tXe;
import o.C56392yDr;
import o.C58156yvv;
import o.C58216yxB;
import o.C58266yxz;
import o.InterfaceC46516tXf;
import o.InterfaceC46518tXh;
import o.InterfaceC46523tXm;
import o.InterfaceC56387yDm;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class DialogQueueManager implements LifecycleObserver {
    public final String AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public boolean AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm EZpvd;
    public boolean KWHzl;
    public final CheckMode OLrzqt;
    public long copydefault;
    public InterfaceC46518tXh djBIcL;
    public final LifecycleOwner gEmmrt;
    public STATE isConnected;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CheckMode.values().length];
            iArr[CheckMode.SERIAL.ordinal()] = 1;
            iArr[CheckMode.PARALLEL.ordinal()] = 2;
            OLrzqt = iArr;
            int[] iArr2 = new int[ParallelCheckResult.values().length];
            iArr2[ParallelCheckResult.NEED_SHOW.ordinal()] = 1;
            iArr2[ParallelCheckResult.DO_NOT_SHOW.ordinal()] = 2;
            EZpvd = iArr2;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private final void onPause() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(long j) {
        this.KWHzl = true;
        this.copydefault = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LifecycleOwner KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.AhwBna = z;
    }

    public DialogQueueManager(@NotNull LifecycleOwner lifecycleOwner, CheckMode checkMode) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        this.gEmmrt = lifecycleOwner;
        this.OLrzqt = checkMode;
        this.AEQbTJ = "dialog_manager";
        this.isConnected = STATE.IDLE;
        this.valueOf = C56392yDr.copydefault(new Function0<C58216yxB>() { // from class: com.okinc.pop.manager.DialogQueueManager$mDisposable$2
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final C58216yxB invoke() {
                return new C58216yxB();
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0<PriorityQueue<InterfaceC46518tXh>>() { // from class: com.okinc.pop.manager.DialogQueueManager$dialogQueue$2
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final PriorityQueue<InterfaceC46518tXh> invoke() {
                return new PriorityQueue<>();
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0<HashSet<InterfaceC46516tXf>>() { // from class: com.okinc.pop.manager.DialogQueueManager$groups$2
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final HashSet<InterfaceC46516tXf> invoke() {
                return new HashSet<>();
            }
        });
        this.AkhnZx = C56392yDr.copydefault(new Function0<PriorityQueue<InterfaceC46518tXh>>() { // from class: com.okinc.pop.manager.DialogQueueManager$mVariableQueue$2
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            public final PriorityQueue<InterfaceC46518tXh> invoke() {
                return new PriorityQueue<>();
            }
        });
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    public final PriorityQueue<InterfaceC46518tXh> AEQbTJ() {
        return (PriorityQueue) this.EZpvd.getValue();
    }

    public final HashSet<InterfaceC46516tXf> OLrzqt() {
        return (HashSet) this.AYXKKw.getValue();
    }

    public final PriorityQueue<InterfaceC46518tXh> copydefault() {
        return (PriorityQueue) this.AkhnZx.getValue();
    }

    public void AEQbTJ(@NotNull InterfaceC46518tXh interfaceC46518tXh) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(interfaceC46518tXh, "");
            if (AEQbTJ().contains(interfaceC46518tXh)) {
                return;
            }
            AEQbTJ().offer(interfaceC46518tXh);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private final void onStart() {
        for (InterfaceC46518tXh interfaceC46518tXh : AEQbTJ()) {
            interfaceC46518tXh.AEQbTJ(false);
            interfaceC46518tXh.EZpvd(ParallelCheckResult.UNKNOWN);
            if (!copydefault().contains(interfaceC46518tXh) && interfaceC46518tXh.djBIcL() == ResumeCheckType.ONCE) {
                copydefault().offer(interfaceC46518tXh);
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private final void onResume() {
        for (InterfaceC46518tXh interfaceC46518tXh : AEQbTJ()) {
            interfaceC46518tXh.AEQbTJ(false);
            interfaceC46518tXh.EZpvd(ParallelCheckResult.UNKNOWN);
            if (!copydefault().contains(interfaceC46518tXh) && (interfaceC46518tXh.djBIcL() == ResumeCheckType.ALWAYS || interfaceC46518tXh.djBIcL() == ResumeCheckType.ALWAYS_AND_NO_REPEAT)) {
                if (!gEmmrt() || interfaceC46518tXh.djBIcL() != ResumeCheckType.ALWAYS_AND_NO_REPEAT || !Intrinsics.EZpvd(interfaceC46518tXh, this.djBIcL)) {
                    copydefault().add(interfaceC46518tXh);
                }
            }
        }
        CheckMode checkMode = this.OLrzqt;
        int i = checkMode == null ? -1 : StateListAnimator.OLrzqt[checkMode.ordinal()];
        if (i == 1) {
            AYXKKw();
        } else if (i == 2) {
            valueOf();
        } else {
            AYXKKw();
        }
    }

    public static final class Activity implements InterfaceC46523tXm {
        public Activity() {
        }

        @Override // o.InterfaceC46523tXm
        public void EZpvd(@NotNull InterfaceC46518tXh interfaceC46518tXh) {
            InterfaceC46523tXm.ActionBar.OLrzqt(this, interfaceC46518tXh);
        }

        @Override // o.InterfaceC46523tXm
        public void AEQbTJ(@NotNull InterfaceC46518tXh interfaceC46518tXh) {
            Intrinsics.checkNotNullParameter(interfaceC46518tXh, "");
            InterfaceC46523tXm.ActionBar.AEQbTJ(this, interfaceC46518tXh);
            DialogQueueManager.this.OLrzqt(interfaceC46518tXh);
            DialogQueueManager.this.EZpvd();
        }
    }

    public final void AYXKKw() {
        if (gEmmrt()) {
            Activity activity = new Activity();
            InterfaceC46518tXh interfaceC46518tXh = this.djBIcL;
            if (interfaceC46518tXh == null) {
                return;
            }
            interfaceC46518tXh.KWHzl(activity);
            return;
        }
        EZpvd();
    }

    public final void valueOf() {
        if (gEmmrt()) {
            Application application = new Application();
            InterfaceC46518tXh interfaceC46518tXh = this.djBIcL;
            if (interfaceC46518tXh != null) {
                interfaceC46518tXh.KWHzl(application);
            }
            copydefault(false, true);
            return;
        }
        parallelCheckResumeQueue$default(this, true, false, 2, null);
    }

    public static final class Application implements InterfaceC46523tXm {
        public Application() {
        }

        @Override // o.InterfaceC46523tXm
        public void EZpvd(@NotNull InterfaceC46518tXh interfaceC46518tXh) {
            InterfaceC46523tXm.ActionBar.OLrzqt(this, interfaceC46518tXh);
        }

        @Override // o.InterfaceC46523tXm
        public void AEQbTJ(@NotNull InterfaceC46518tXh interfaceC46518tXh) {
            Intrinsics.checkNotNullParameter(interfaceC46518tXh, "");
            InterfaceC46523tXm.ActionBar.AEQbTJ(this, interfaceC46518tXh);
            DialogQueueManager.this.OLrzqt(interfaceC46518tXh);
            DialogQueueManager.this.EZpvd();
        }
    }

    public final void EZpvd() {
        OLrzqt(copydefault());
    }

    public static /* synthetic */ void parallelCheckResumeQueue$default(DialogQueueManager dialogQueueManager, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        dialogQueueManager.copydefault(z, z2);
    }

    public final void copydefault(boolean z, boolean z2) {
        AbstractC58185ywX abstractC58185ywXCopydefault;
        AbstractC58185ywX abstractC58185ywXEZpvd;
        boolean z3 = false;
        for (final InterfaceC46518tXh interfaceC46518tXh : copydefault()) {
            if (interfaceC46518tXh.djBIcL() == ResumeCheckType.ALWAYS && !interfaceC46518tXh.AYXKKw()) {
                if (!z || z3) {
                    InterfaceC58217yxC interfaceC58217yxCKWHzl = interfaceC46518tXh.KWHzl();
                    if (interfaceC58217yxCKWHzl != null) {
                        interfaceC58217yxCKWHzl.dispose();
                    }
                    AbstractC58185ywX<Boolean> abstractC58185ywXCopydefault2 = interfaceC46518tXh.copydefault();
                    interfaceC46518tXh.AEQbTJ((abstractC58185ywXCopydefault2 == null || (abstractC58185ywXCopydefault = C46515tXe.copydefault(abstractC58185ywXCopydefault2)) == null || (abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXCopydefault, KWHzl())) == null) ? null : abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.tXi
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            DialogQueueManager.EZpvd(interfaceC46518tXh, this, (java.lang.Boolean) obj);
                        }
                    }, new InterfaceC58227yxM() { // from class: o.tXg
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            DialogQueueManager.KWHzl(interfaceC46518tXh, this, (java.lang.Throwable) obj);
                        }
                    }));
                }
                z3 = true;
            }
        }
        if (z2) {
            return;
        }
        OLrzqt(copydefault());
    }

    public static final void EZpvd(InterfaceC46518tXh interfaceC46518tXh, DialogQueueManager dialogQueueManager, Boolean bool) {
        Intrinsics.checkNotNullParameter(dialogQueueManager, "");
        Intrinsics.checkNotNullExpressionValue(bool, "");
        if (bool.booleanValue()) {
            interfaceC46518tXh.EZpvd(ParallelCheckResult.NEED_SHOW);
        } else {
            interfaceC46518tXh.EZpvd(ParallelCheckResult.DO_NOT_SHOW);
        }
        Intrinsics.checkNotNullExpressionValue(interfaceC46518tXh, "");
        dialogQueueManager.EZpvd(interfaceC46518tXh);
    }

    public static final void KWHzl(InterfaceC46518tXh interfaceC46518tXh, DialogQueueManager dialogQueueManager, Throwable th) {
        Intrinsics.checkNotNullParameter(dialogQueueManager, "");
        interfaceC46518tXh.EZpvd(ParallelCheckResult.UNKNOWN);
        Intrinsics.checkNotNullExpressionValue(interfaceC46518tXh, "");
        dialogQueueManager.EZpvd(interfaceC46518tXh);
    }

    public final void EZpvd(InterfaceC46518tXh interfaceC46518tXh) {
        if (interfaceC46518tXh.djBIcL() != ResumeCheckType.ONCE) {
            return;
        }
        if (AEQbTJ().contains(interfaceC46518tXh)) {
            AEQbTJ().remove(interfaceC46518tXh);
        }
        Iterator<T> it = OLrzqt().iterator();
        while (it.hasNext()) {
            List<InterfaceC46518tXh> listOLrzqt = ((InterfaceC46516tXf) it.next()).OLrzqt();
            if (listOLrzqt.contains(interfaceC46518tXh)) {
                listOLrzqt.remove(interfaceC46518tXh);
            }
        }
    }

    public final void OLrzqt(InterfaceC46518tXh interfaceC46518tXh) {
        this.isConnected = STATE.IDLE;
        InterfaceC58217yxC interfaceC58217yxCKWHzl = interfaceC46518tXh.KWHzl();
        if (interfaceC58217yxCKWHzl != null) {
            interfaceC58217yxCKWHzl.dispose();
        }
        interfaceC46518tXh.AhwBna();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
        djBIcL();
    }

    public final boolean AhwBna() {
        Iterator<T> it = OLrzqt().iterator();
        while (it.hasNext()) {
            Lifecycle lifecycleCopydefault = ((InterfaceC46516tXf) it.next()).copydefault();
            if ((lifecycleCopydefault == null ? null : lifecycleCopydefault.getCurrentState()) == Lifecycle.State.RESUMED) {
                return true;
            }
        }
        return false;
    }

    public final void OLrzqt(final PriorityQueue<InterfaceC46518tXh> priorityQueue) {
        if ((((!OLrzqt().isEmpty()) || this.AhwBna) && !AhwBna()) || gEmmrt() || priorityQueue.isEmpty() || this.gEmmrt.getLifecycle().getCurrentState() != Lifecycle.State.RESUMED) {
            return;
        }
        if (this.KWHzl) {
            long j = this.copydefault;
            if (j > 0) {
                this.KWHzl = false;
                AbstractC58247yxg<Long> abstractC58247yxgObserveOn = AbstractC58247yxg.timer(j, TimeUnit.MILLISECONDS).observeOn(C58266yxz.OLrzqt());
                Intrinsics.checkNotNullExpressionValue(abstractC58247yxgObserveOn, "");
                C58156yvv.copydefault(abstractC58247yxgObserveOn, this.gEmmrt).subscribe(new InterfaceC58227yxM() { // from class: o.tWZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        DialogQueueManager.copydefault(this.KWHzl, priorityQueue, (java.lang.Long) obj);
                    }
                });
                return;
            }
        }
        AEQbTJ(priorityQueue);
    }

    public static final void copydefault(DialogQueueManager dialogQueueManager, PriorityQueue priorityQueue, Long l) {
        Intrinsics.checkNotNullParameter(dialogQueueManager, "");
        Intrinsics.checkNotNullParameter(priorityQueue, "");
        dialogQueueManager.AEQbTJ((PriorityQueue<InterfaceC46518tXh>) priorityQueue);
    }

    public final void AEQbTJ(final PriorityQueue<InterfaceC46518tXh> priorityQueue) {
        AbstractC58185ywX<Boolean> abstractC58185ywXCopydefault;
        AbstractC58185ywX abstractC58185ywXCopydefault2;
        AbstractC58185ywX abstractC58185ywXEZpvd;
        InterfaceC58217yxC interfaceC58217yxCKWHzl;
        final InterfaceC46518tXh interfaceC46518tXhPoll = priorityQueue.poll();
        this.djBIcL = interfaceC46518tXhPoll;
        if (interfaceC46518tXhPoll != null) {
            interfaceC46518tXhPoll.KWHzl(new ActionBar(priorityQueue));
        }
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = null;
        ParallelCheckResult parallelCheckResultEZpvd = interfaceC46518tXhPoll == null ? null : interfaceC46518tXhPoll.EZpvd();
        int i = parallelCheckResultEZpvd == null ? -1 : StateListAnimator.EZpvd[parallelCheckResultEZpvd.ordinal()];
        if (i != 1) {
            if (i != 2) {
                InterfaceC46518tXh interfaceC46518tXh = this.djBIcL;
                if (interfaceC46518tXh != null && (interfaceC58217yxCKWHzl = interfaceC46518tXh.KWHzl()) != null) {
                    interfaceC58217yxCKWHzl.dispose();
                }
                InterfaceC46518tXh interfaceC46518tXh2 = this.djBIcL;
                if (interfaceC46518tXh2 != null && (abstractC58185ywXCopydefault = interfaceC46518tXh2.copydefault()) != null && (abstractC58185ywXCopydefault2 = C46515tXe.copydefault(abstractC58185ywXCopydefault)) != null && (abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXCopydefault2, this.gEmmrt)) != null) {
                    interfaceC58217yxCAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.tXd
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            DialogQueueManager.copydefault(this.EZpvd, interfaceC46518tXhPoll, priorityQueue, (java.lang.Boolean) obj);
                        }
                    }, new InterfaceC58227yxM() { // from class: o.tXc
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.InterfaceC58227yxM
                        public final void accept(java.lang.Object obj) {
                            DialogQueueManager.AEQbTJ(this.AEQbTJ, priorityQueue, interfaceC46518tXhPoll, (java.lang.Throwable) obj);
                        }
                    });
                }
                InterfaceC46518tXh interfaceC46518tXh3 = this.djBIcL;
                if (interfaceC46518tXh3 != null) {
                    interfaceC46518tXh3.AEQbTJ(interfaceC58217yxCAEQbTJ);
                }
            } else {
                OLrzqt(priorityQueue);
            }
        } else if (!gEmmrt()) {
            interfaceC46518tXhPoll.valueOf();
        } else {
            interfaceC46518tXhPoll.EZpvd(ParallelCheckResult.NEED_SHOW);
            copydefault().offer(interfaceC46518tXhPoll);
        }
        InterfaceC46518tXh interfaceC46518tXh4 = this.djBIcL;
        if (interfaceC46518tXh4 == null) {
            return;
        }
        interfaceC46518tXh4.EZpvd(ParallelCheckResult.UNKNOWN);
    }

    public static final class ActionBar implements InterfaceC46523tXm {
        public final /* synthetic */ PriorityQueue<InterfaceC46518tXh> EZpvd;

        public ActionBar(PriorityQueue<InterfaceC46518tXh> priorityQueue) {
            this.EZpvd = priorityQueue;
        }

        @Override // o.InterfaceC46523tXm
        public void EZpvd(@NotNull InterfaceC46518tXh interfaceC46518tXh) {
            Intrinsics.checkNotNullParameter(interfaceC46518tXh, "");
            InterfaceC46523tXm.ActionBar.OLrzqt(this, interfaceC46518tXh);
            DialogQueueManager.this.isConnected = STATE.SHOWING;
        }

        @Override // o.InterfaceC46523tXm
        public void AEQbTJ(@NotNull InterfaceC46518tXh interfaceC46518tXh) {
            Intrinsics.checkNotNullParameter(interfaceC46518tXh, "");
            InterfaceC46523tXm.ActionBar.AEQbTJ(this, interfaceC46518tXh);
            DialogQueueManager.this.OLrzqt(interfaceC46518tXh);
            if (!interfaceC46518tXh.AEQbTJ()) {
                DialogQueueManager.this.OLrzqt(this.EZpvd);
                return;
            }
            Iterator it = DialogQueueManager.this.copydefault().iterator();
            while (it.hasNext()) {
                InterfaceC58217yxC interfaceC58217yxCKWHzl = ((InterfaceC46518tXh) it.next()).KWHzl();
                if (interfaceC58217yxCKWHzl != null) {
                    interfaceC58217yxCKWHzl.dispose();
                }
            }
            DialogQueueManager.this.copydefault().clear();
        }
    }

    public static final void copydefault(DialogQueueManager dialogQueueManager, InterfaceC46518tXh interfaceC46518tXh, PriorityQueue priorityQueue, Boolean bool) {
        Intrinsics.checkNotNullParameter(dialogQueueManager, "");
        Intrinsics.checkNotNullParameter(priorityQueue, "");
        Intrinsics.checkNotNullExpressionValue(bool, "");
        if (bool.booleanValue()) {
            if (dialogQueueManager.gEmmrt()) {
                if (interfaceC46518tXh != null) {
                    interfaceC46518tXh.EZpvd(ParallelCheckResult.NEED_SHOW);
                }
                dialogQueueManager.copydefault().add(interfaceC46518tXh);
            } else if (interfaceC46518tXh != null) {
                interfaceC46518tXh.valueOf();
            }
        } else {
            dialogQueueManager.OLrzqt((PriorityQueue<InterfaceC46518tXh>) priorityQueue);
        }
        Intrinsics.checkNotNullExpressionValue(interfaceC46518tXh, "");
        dialogQueueManager.EZpvd(interfaceC46518tXh);
    }

    public static final void AEQbTJ(DialogQueueManager dialogQueueManager, PriorityQueue priorityQueue, InterfaceC46518tXh interfaceC46518tXh, Throwable th) {
        Intrinsics.checkNotNullParameter(dialogQueueManager, "");
        Intrinsics.checkNotNullParameter(priorityQueue, "");
        dialogQueueManager.OLrzqt((PriorityQueue<InterfaceC46518tXh>) priorityQueue);
        Intrinsics.checkNotNullExpressionValue(interfaceC46518tXh, "");
        dialogQueueManager.EZpvd(interfaceC46518tXh);
    }

    public boolean gEmmrt() {
        return this.isConnected == STATE.SHOWING;
    }

    private final void djBIcL() {
        InterfaceC58217yxC interfaceC58217yxCKWHzl;
        InterfaceC46518tXh interfaceC46518tXh = this.djBIcL;
        if (interfaceC46518tXh != null) {
            interfaceC46518tXh.AhwBna();
        }
        InterfaceC46518tXh interfaceC46518tXh2 = this.djBIcL;
        if (interfaceC46518tXh2 != null && (interfaceC58217yxCKWHzl = interfaceC46518tXh2.KWHzl()) != null) {
            interfaceC58217yxCKWHzl.dispose();
        }
        this.djBIcL = null;
        copydefault().clear();
        AEQbTJ().clear();
    }
}
