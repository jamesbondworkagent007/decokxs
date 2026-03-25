package o;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.WithLifecycleStateKt;
import com.okinc.planet.biz_positions.ProfilePositionsViewModel$1;
import com.okinc.planet.biz_positions.ProfilePositionsViewModel$loadData$2;
import com.okinc.planet.biz_positions.ProfilePositionsViewModel$observeWebSocket$2$1;
import com.okinc.planet.biz_positions.ProfilePositionsViewModel$special$$inlined$mapViewState$1$2$1;
import com.okinc.planet.biz_positions.ProfilePositionsViewModel$special$$inlined$mapViewState$2$2$1;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC46197tLk;
import o.C46374tRz;
import o.InterfaceC46072tGu;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tGd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46055tGd extends tLY<Unit> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public InterfaceC46072tGu.StateListAnimator AEQbTJ;
    public final tWG AYXKKw;
    public final StateFlow<AbstractC46197tLk<java.util.List<InterfaceC46072tGu.Activity>>> AhwBna;
    public Job AkhnZx;
    public final MutableStateFlow<AbstractC46197tLk<java.util.List<InterfaceC46072tGu.Activity>>> EZpvd;
    public final /* synthetic */ tRM OLrzqt;
    public final CoroutineDispatcher copydefault;
    public final Flow<AbstractC46197tLk<java.util.List<InterfaceC46072tGu>>> djBIcL;
    public final SavedStateHandle gEmmrt;
    public final InterfaceC46387tSl isConnected;
    public final Flow<AbstractC46197tLk<java.util.List<InterfaceC46072tGu>>> valueOf;
    public final C46074tGw values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AEQbTJ() {
        return this.OLrzqt.AEQbTJ();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<AbstractC46197tLk<java.util.List<InterfaceC46072tGu>>> EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC46197tLk<java.util.List<InterfaceC46072tGu.Activity>>> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<AbstractC46197tLk<java.util.List<InterfaceC46072tGu>>> copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (r7v0 androidx.lifecycle.SavedStateHandle)
  (wrap:o.tGw:0x000a: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tGw:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:36) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.Dmq():o.tGw A[MD:():o.tGw (m), WRAPPED] (LINE:36)) : (r8v0 o.tGw))
  (wrap:o.tSl:0x0015: TERNARY null = ((wrap:int:0x000b: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tSl:0x0011: INVOKE (wrap:o.tPF:0x000f: SGET  A[WRAPPED] (LINE:37) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.alsFma():o.tSm A[MD:():o.tSm (m), WRAPPED] (LINE:37)) : (r9v0 o.tSl))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:0x001e: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x001a: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getDefault():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:38)) : (r10v0 kotlinx.coroutines.CoroutineDispatcher))
  (wrap:o.tWG:?: TERNARY null = ((wrap:int:0x001f: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tWG:0x0025: INVOKE (wrap:o.tPF:0x0023: SGET  A[WRAPPED] (LINE:39) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.swzYdv():o.tWG A[MD:():o.tWG (m), WRAPPED] (LINE:39)) : (r11v0 o.tWG))
 A[MD:(androidx.lifecycle.SavedStateHandle, o.tGw, o.tSl, kotlinx.coroutines.CoroutineDispatcher, o.tWG):void (m)] (LINE:34) call: o.tGd.<init>(androidx.lifecycle.SavedStateHandle, o.tGw, o.tSl, kotlinx.coroutines.CoroutineDispatcher, o.tWG):void type: THIS */
    public /* synthetic */ C46055tGd(SavedStateHandle savedStateHandle, C46074tGw c46074tGw, InterfaceC46387tSl interfaceC46387tSl, CoroutineDispatcher coroutineDispatcher, tWG twg, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(savedStateHandle, (i & 2) != 0 ? tPF.copydefault.Dmq() : c46074tGw, (i & 4) != 0 ? tPF.copydefault.alsFma() : interfaceC46387tSl, (i & 8) != 0 ? Dispatchers.getDefault() : coroutineDispatcher, (i & 16) != 0 ? tPF.copydefault.swzYdv() : twg);
    }

    public C46055tGd(@NotNull SavedStateHandle savedStateHandle, @NotNull C46074tGw c46074tGw, @NotNull InterfaceC46387tSl interfaceC46387tSl, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull tWG twg) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c46074tGw, "");
        Intrinsics.checkNotNullParameter(interfaceC46387tSl, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(twg, "");
        this.OLrzqt = new tRM(savedStateHandle);
        this.gEmmrt = savedStateHandle;
        this.values = c46074tGw;
        this.isConnected = interfaceC46387tSl;
        this.copydefault = coroutineDispatcher;
        this.AYXKKw = twg;
        this.AEQbTJ = InterfaceC46072tGu.StateListAnimator.Companion.AEQbTJ();
        MutableStateFlow<AbstractC46197tLk<java.util.List<InterfaceC46072tGu.Activity>>> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC46197tLk.Companion.OLrzqt(true));
        this.EZpvd = MutableStateFlow;
        this.AhwBna = FlowKt.asStateFlow(MutableStateFlow);
        this.valueOf = new Application(MutableStateFlow);
        this.djBIcL = new Activity(MutableStateFlow, this);
        C46374tRz.safeLaunch$default(ViewModelKt.getViewModelScope(this), coroutineDispatcher, null, new ProfilePositionsViewModel$1(null), 2, null);
    }

    /* JADX INFO: renamed from: o.tGd$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tGd.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.tGd$TaskDescription */
    public static final class TaskDescription extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ C46055tGd copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(CoroutineExceptionHandler.Key key, C46055tGd c46055tGd) {
            super(key);
            this.copydefault = c46055tGd;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            this.copydefault.EZpvd.setValue(AbstractC46197tLk.Companion.OLrzqt(th));
        }
    }

    /* JADX INFO: renamed from: o.tGd$Activity */
    public static final class Activity implements Flow<AbstractC46197tLk<? extends java.util.List<? extends InterfaceC46072tGu>>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ C46055tGd copydefault;

        /* JADX INFO: renamed from: o.tGd$Activity$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ C46055tGd AEQbTJ;
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, C46055tGd c46055tGd) {
                this.OLrzqt = flowCollector;
                this.AEQbTJ = c46055tGd;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ProfilePositionsViewModel$special$$inlined$mapViewState$2$2$1 profilePositionsViewModel$special$$inlined$mapViewState$2$2$1;
                AbstractC46197tLk<T> abstractC46197tLkKWHzl;
                if (continuation instanceof ProfilePositionsViewModel$special$$inlined$mapViewState$2$2$1) {
                    profilePositionsViewModel$special$$inlined$mapViewState$2$2$1 = (ProfilePositionsViewModel$special$$inlined$mapViewState$2$2$1) continuation;
                    int i = profilePositionsViewModel$special$$inlined$mapViewState$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        profilePositionsViewModel$special$$inlined$mapViewState$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        profilePositionsViewModel$special$$inlined$mapViewState$2$2$1 = new ProfilePositionsViewModel$special$$inlined$mapViewState$2$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = profilePositionsViewModel$special$$inlined$mapViewState$2$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = profilePositionsViewModel$special$$inlined$mapViewState$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    AbstractC46197tLk abstractC46197tLk = (AbstractC46197tLk) obj;
                    if (abstractC46197tLk instanceof AbstractC46197tLk.Activity) {
                        abstractC46197tLkKWHzl = AbstractC46197tLk.Companion.OLrzqt(((AbstractC46197tLk.Activity) abstractC46197tLk).EZpvd());
                    } else if (abstractC46197tLk instanceof AbstractC46197tLk.StateListAnimator) {
                        abstractC46197tLkKWHzl = AbstractC46197tLk.Companion.OLrzqt(((AbstractC46197tLk.StateListAnimator) abstractC46197tLk).KWHzl());
                    } else {
                        if (!(abstractC46197tLk instanceof AbstractC46197tLk.Application)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        java.util.List list = (java.util.List) ((AbstractC46197tLk.Application) abstractC46197tLk).copydefault();
                        java.util.List listOLrzqt = C56402yEa.OLrzqt();
                        if (this.AEQbTJ.AEQbTJ.EZpvd()) {
                            listOLrzqt.add(this.AEQbTJ.AEQbTJ);
                            listOLrzqt.add(InterfaceC46072tGu.Application.AEQbTJ);
                        }
                        listOLrzqt.addAll(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) list, 3));
                        if (C33129mqd.AEQbTJ(C56443yFo.AEQbTJ(list.size()), C56443yFo.AEQbTJ(3))) {
                            listOLrzqt.add(InterfaceC46072tGu.ActionBar.copydefault);
                        }
                        abstractC46197tLkKWHzl = AbstractC46197tLk.Companion.KWHzl(C56402yEa.fARcdN(listOLrzqt));
                    }
                    profilePositionsViewModel$special$$inlined$mapViewState$2$2$1.label = 1;
                    if (flowCollector.emit(abstractC46197tLkKWHzl, profilePositionsViewModel$special$$inlined$mapViewState$2$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Activity(Flow flow, C46055tGd c46055tGd) {
            this.AEQbTJ = flow;
            this.copydefault = c46055tGd;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super AbstractC46197tLk<? extends java.util.List<? extends InterfaceC46072tGu>>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.tGd$Application */
    public static final class Application implements Flow<AbstractC46197tLk<? extends java.util.List<? extends InterfaceC46072tGu>>> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.tGd$Application$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ProfilePositionsViewModel$special$$inlined$mapViewState$1$2$1 profilePositionsViewModel$special$$inlined$mapViewState$1$2$1;
                AbstractC46197tLk<T> abstractC46197tLkKWHzl;
                if (continuation instanceof ProfilePositionsViewModel$special$$inlined$mapViewState$1$2$1) {
                    profilePositionsViewModel$special$$inlined$mapViewState$1$2$1 = (ProfilePositionsViewModel$special$$inlined$mapViewState$1$2$1) continuation;
                    int i = profilePositionsViewModel$special$$inlined$mapViewState$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        profilePositionsViewModel$special$$inlined$mapViewState$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        profilePositionsViewModel$special$$inlined$mapViewState$1$2$1 = new ProfilePositionsViewModel$special$$inlined$mapViewState$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = profilePositionsViewModel$special$$inlined$mapViewState$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = profilePositionsViewModel$special$$inlined$mapViewState$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    AbstractC46197tLk abstractC46197tLk = (AbstractC46197tLk) obj;
                    if (abstractC46197tLk instanceof AbstractC46197tLk.Activity) {
                        abstractC46197tLkKWHzl = AbstractC46197tLk.Companion.OLrzqt(((AbstractC46197tLk.Activity) abstractC46197tLk).EZpvd());
                    } else if (abstractC46197tLk instanceof AbstractC46197tLk.StateListAnimator) {
                        abstractC46197tLkKWHzl = AbstractC46197tLk.Companion.OLrzqt(((AbstractC46197tLk.StateListAnimator) abstractC46197tLk).KWHzl());
                    } else {
                        if (!(abstractC46197tLk instanceof AbstractC46197tLk.Application)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        java.util.List list = (java.util.List) ((AbstractC46197tLk.Application) abstractC46197tLk).copydefault();
                        java.util.List listOLrzqt = C56402yEa.OLrzqt();
                        listOLrzqt.add(InterfaceC46072tGu.Application.AEQbTJ);
                        listOLrzqt.addAll(list);
                        abstractC46197tLkKWHzl = AbstractC46197tLk.Companion.KWHzl(C56402yEa.fARcdN(listOLrzqt));
                    }
                    profilePositionsViewModel$special$$inlined$mapViewState$1$2$1.label = 1;
                    if (flowCollector.emit(abstractC46197tLkKWHzl, profilePositionsViewModel$special$$inlined$mapViewState$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Application(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super AbstractC46197tLk<? extends java.util.List<? extends InterfaceC46072tGu>>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public final void AEQbTJ(@NotNull Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "");
        java.lang.String strAEQbTJ = AEQbTJ();
        if (strAEQbTJ == null) {
            return;
        }
        this.EZpvd.setValue(AbstractC46197tLk.TaskDescription.loading$default(AbstractC46197tLk.Companion, false, 1, null));
        C46374tRz.safeLaunch$default(LifecycleKt.getCoroutineScope(lifecycle), new TaskDescription(CoroutineExceptionHandler.Key, this), null, new ProfilePositionsViewModel$loadData$2(this, strAEQbTJ, lifecycle, null), 2, null);
    }

    public final void KWHzl() {
        Job job = this.AkhnZx;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.AkhnZx = null;
    }

    public final java.lang.Object KWHzl(Lifecycle lifecycle, Continuation<? super Job> continuation) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        if (state.compareTo(Lifecycle.State.CREATED) < 0) {
            throw new java.lang.IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
        }
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        boolean zIsDispatchNeeded = immediate.isDispatchNeeded(continuation.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return C46374tRz.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.copydefault, null, new ProfilePositionsViewModel$observeWebSocket$2$1(this, null), 2, null);
            }
        }
        return WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, immediate, new Function0<Job>() { // from class: com.okinc.planet.biz_positions.ProfilePositionsViewModel$observeWebSocket$$inlined$withStateAtLeast$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Job invoke() {
                return C46374tRz.safeLaunch$default(ViewModelKt.getViewModelScope(this.this$0), this.this$0.copydefault, null, new ProfilePositionsViewModel$observeWebSocket$2$1(this.this$0, null), 2, null);
            }
        }, continuation);
    }
}
