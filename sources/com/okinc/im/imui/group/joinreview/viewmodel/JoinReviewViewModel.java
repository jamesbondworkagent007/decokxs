package com.okinc.im.imui.group.joinreview.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.im.imui.group.joinreview.displaymodel.JoinRequestDisplayModel;
import com.okinc.okimcore.model.im.GroupActionFailReason;
import com.okinc.okimcore.model.other.GroupInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C35781oDl;
import o.C44124sEe;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.nUK;
import o.oDI;
import o.oDJ;
import o.oDS;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinReviewViewModel extends AbstractC33073mpa {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final MutableSharedFlow<ActionBar> AEQbTJ;
    public final oDJ AYXKKw;
    public final StateFlow<Boolean> AhwBna;
    public final MutableStateFlow<Application> EZpvd;
    public final SharedFlow<Long> KWHzl;
    public final StateFlow<GroupInfo> copydefault;
    public final SavedStateHandle djBIcL;
    public final C35781oDl gEmmrt;
    public final oDS isConnected;
    public final oDI valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> fJNWhG() {
        return this.AhwBna;
    }

    @yCM
    public JoinReviewViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull oDI odi, @NotNull oDJ odj, @NotNull oDS ods, @NotNull C35781oDl c35781oDl) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(odi, "");
        Intrinsics.checkNotNullParameter(odj, "");
        Intrinsics.checkNotNullParameter(ods, "");
        Intrinsics.checkNotNullParameter(c35781oDl, "");
        this.djBIcL = savedStateHandle;
        this.valueOf = odi;
        this.AYXKKw = odj;
        this.isConnected = ods;
        this.gEmmrt = c35781oDl;
        this.EZpvd = StateFlowKt.MutableStateFlow(Application.StateListAnimator.OLrzqt);
        this.AEQbTJ = SharedFlowKt.MutableSharedFlow$default(0, 1, BufferOverflow.DROP_OLDEST, 1, null);
        Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new StateListAnimator(savedStateHandle.getStateFlow("KEY_GROUP_ID", -1L)));
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharedFlow<Long> sharedFlowShareIn$default = FlowKt__ShareKt.shareIn$default(flowDistinctUntilChanged, viewModelScope, SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 0, 4, null);
        this.KWHzl = sharedFlowShareIn$default;
        this.copydefault = FlowKt.stateIn(FlowKt.transformLatest(sharedFlowShareIn$default, new JoinReviewViewModel$special$$inlined$flatMapLatest$1(null, this)), ViewModelKt.getViewModelScope(this), companion.getEagerly(), null);
        this.AhwBna = savedStateHandle.getStateFlow("KEY_IS_SINGLE_SELECT", Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.joinreview.viewmodel.JoinReviewViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final class StateListAnimator implements Flow<Long> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: com.okinc.im.imui.group.joinreview.viewmodel.JoinReviewViewModel$StateListAnimator$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                JoinReviewViewModel$special$$inlined$filter$1$2$1 joinReviewViewModel$special$$inlined$filter$1$2$1;
                if (continuation instanceof JoinReviewViewModel$special$$inlined$filter$1$2$1) {
                    joinReviewViewModel$special$$inlined$filter$1$2$1 = (JoinReviewViewModel$special$$inlined$filter$1$2$1) continuation;
                    int i = joinReviewViewModel$special$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        joinReviewViewModel$special$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        joinReviewViewModel$special$$inlined$filter$1$2$1 = new JoinReviewViewModel$special$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                Object obj2 = joinReviewViewModel$special$$inlined$filter$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = joinReviewViewModel$special$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    if (((Number) obj).longValue() >= 0) {
                        joinReviewViewModel$special$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, joinReviewViewModel$special$$inlined$filter$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public StateListAnimator(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super Long> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.joinreview.viewmodel.JoinReviewViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class StateListAnimator extends Application {
            public static final StateListAnimator OLrzqt = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }

        private Application() {
        }

        public static final class Activity extends Application {
            public final boolean AEQbTJ;
            public final boolean EZpvd;
            public final List<JoinRequestDisplayModel> KWHzl;
            public final boolean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.imui.group.joinreview.viewmodel.JoinReviewViewModel$Application$Activity */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Activity copy$default(Activity activity, List list, boolean z, boolean z2, boolean z3, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = activity.KWHzl;
                }
                if ((i & 2) != 0) {
                    z = activity.EZpvd;
                }
                if ((i & 4) != 0) {
                    z2 = activity.AEQbTJ;
                }
                if ((i & 8) != 0) {
                    z3 = activity.OLrzqt;
                }
                return activity.KWHzl(list, z, z2, z3);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity KWHzl(@NotNull List<JoinRequestDisplayModel> list, boolean z, boolean z2, boolean z3) {
                Intrinsics.checkNotNullParameter(list, "");
                return new Activity(list, z, z2, z3);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<JoinRequestDisplayModel> KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean copydefault() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                Activity activity = (Activity) obj;
                return Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && this.EZpvd == activity.EZpvd && this.AEQbTJ == activity.AEQbTJ && this.OLrzqt == activity.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((((this.KWHzl.hashCode() * 31) + Boolean.hashCode(this.EZpvd)) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + Boolean.hashCode(this.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Content(requestList=" + this.KWHzl + ", isAnySelected=" + this.EZpvd + ", isAllSelected=" + this.AEQbTJ + ", canLoadMore=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull List<JoinRequestDisplayModel> list, boolean z, boolean z2, boolean z3) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                this.KWHzl = list;
                this.EZpvd = z;
                this.AEQbTJ = z2;
                this.OLrzqt = z3;
            }
        }

        public static final class TaskDescription extends Application {
            public static final TaskDescription EZpvd = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.joinreview.viewmodel.JoinReviewViewModel$Application$Application, reason: collision with other inner class name */
        public static final class C0434Application extends Application {
            public final Throwable OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0434Application copy$default(C0434Application c0434Application, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = c0434Application.OLrzqt;
                }
                return c0434Application.EZpvd(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0434Application EZpvd(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new C0434Application(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Throwable KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0434Application) && Intrinsics.EZpvd(this.OLrzqt, ((C0434Application) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Error(error=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0434Application(@NotNull Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.OLrzqt = th;
            }
        }
    }

    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.joinreview.viewmodel.JoinReviewViewModel.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class StateListAnimator extends ActionBar {
            public static final StateListAnimator AEQbTJ = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }

        private ActionBar() {
        }

        public static final class Activity extends ActionBar {
            public static final Activity copydefault = new Activity();

            private Activity() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.joinreview.viewmodel.JoinReviewViewModel$ActionBar$ActionBar, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes16.dex */
        public static final class C0433ActionBar extends ActionBar {
            public static final C0433ActionBar OLrzqt = new C0433ActionBar();

            private C0433ActionBar() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Application extends ActionBar {
            public static final Application OLrzqt = new Application();

            private Application() {
                super(null);
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Fragment extends ActionBar {
            public final Map<GroupActionFailReason, List<String>> KWHzl;
            public final String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.imui.group.joinreview.viewmodel.JoinReviewViewModel$ActionBar$Fragment */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Fragment copy$default(Fragment fragment, String str, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fragment.OLrzqt;
                }
                if ((i & 2) != 0) {
                    map = fragment.KWHzl;
                }
                return fragment.KWHzl(str, map);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Fragment KWHzl(@NotNull String str, @NotNull Map<GroupActionFailReason, ? extends List<String>> map) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                return new Fragment(str, map);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<GroupActionFailReason, List<String>> KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Fragment)) {
                    return false;
                }
                Fragment fragment = (Fragment) obj;
                return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) fragment.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, fragment.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ThisUpdateFailed(groupId=" + this.OLrzqt + ", failedReasons=" + this.KWHzl + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<com.okinc.okimcore.model.im.GroupActionFailReason, ? extends java.util.List<java.lang.String>> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Fragment(@NotNull String str, @NotNull Map<GroupActionFailReason, ? extends List<String>> map) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                this.OLrzqt = str;
                this.KWHzl = map;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class TaskDescription extends ActionBar {
            public static final TaskDescription copydefault = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }
    }

    public final StateFlow<Application> gEmmrt() {
        return FlowKt.asStateFlow(this.EZpvd);
    }

    public final SharedFlow<ActionBar> AhwBna() {
        return FlowKt.asSharedFlow(this.AEQbTJ);
    }

    public final long fetchVPNInfo() {
        Long l = (Long) this.djBIcL.get("KEY_GROUP_ID");
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    public final List<JoinRequestDisplayModel> ejfBZ() {
        List<JoinRequestDisplayModel> list = (List) this.djBIcL.get("KEY_REQUEST_LIST");
        return list == null ? yDY.AhwBna() : list;
    }

    public final int OLrzqt() {
        Integer num = (Integer) this.djBIcL.get("KEY_REQUEST_FULL_TOTAL");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final boolean valueOf() {
        return OLrzqt() > ejfBZ().size();
    }

    public final boolean DbNXlk() {
        List<JoinRequestDisplayModel> listEjfBZ = ejfBZ();
        if (!(listEjfBZ instanceof Collection) || !listEjfBZ.isEmpty()) {
            Iterator<T> it = listEjfBZ.iterator();
            while (it.hasNext()) {
                if (!((JoinRequestDisplayModel) it.next()).AYXKKw()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean AkhnZx() {
        List<JoinRequestDisplayModel> listEjfBZ = ejfBZ();
        if (!(listEjfBZ instanceof Collection) || !listEjfBZ.isEmpty()) {
            Iterator<T> it = listEjfBZ.iterator();
            while (it.hasNext()) {
                if (((JoinRequestDisplayModel) it.next()).AYXKKw()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int AuCTel() {
        List<JoinRequestDisplayModel> listEjfBZ = ejfBZ();
        int i = 0;
        if (!(listEjfBZ instanceof Collection) || !listEjfBZ.isEmpty()) {
            Iterator<T> it = listEjfBZ.iterator();
            while (it.hasNext()) {
                if (((JoinRequestDisplayModel) it.next()).AYXKKw() && (i = i + 1) < 0) {
                    yDY.djBIcL();
                }
            }
        }
        return i;
    }

    public final int AEQbTJ() {
        return ejfBZ().size();
    }

    public final int AYXKKw() {
        GroupInfo value = this.copydefault.getValue();
        if (value != null) {
            return value.getGroupCount();
        }
        return 0;
    }

    public final long values() {
        GroupInfo value = this.copydefault.getValue();
        if (value != null) {
            return value.getMaxMemberCount();
        }
        return 0L;
    }

    public final long EZpvd() {
        return values() - ((long) AYXKKw());
    }

    public final boolean isConnected() {
        return ((long) (AYXKKw() + AuCTel())) > values();
    }

    public final long KWHzl() {
        Long l = (Long) this.djBIcL.get("KEY_MAX_ANIMATOR_DURATION");
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final Application djBIcL() {
        if (!ejfBZ().isEmpty()) {
            return new Application.Activity(ejfBZ(), AkhnZx(), DbNXlk(), valueOf());
        }
        return Application.TaskDescription.EZpvd;
    }

    public final Object EZpvd(Throwable th, Continuation<? super Unit> continuation) {
        Object objEmit = this.EZpvd.emit(new Application.C0434Application(th), continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.im.imui.group.joinreview.viewmodel.JoinReviewViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = JoinReviewViewModel.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.joinreview.viewmodel.JoinReviewViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C04311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ JoinReviewViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04311(JoinReviewViewModel joinReviewViewModel, Continuation<? super C04311> continuation) {
                super(2, continuation);
                this.this$0 = joinReviewViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C04311(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C04311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.okinc.im.imui.group.joinreview.viewmodel.JoinReviewViewModel$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C04321 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
                /* synthetic */ long J$0;
                int label;
                final /* synthetic */ JoinReviewViewModel this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C04321(JoinReviewViewModel joinReviewViewModel, Continuation<? super C04321> continuation) {
                    super(2, continuation);
                    this.this$0 = joinReviewViewModel;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C04321 c04321 = new C04321(this.this$0, continuation);
                    c04321.J$0 = ((Number) obj).longValue();
                    return c04321;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public final Object invoke(long j, Continuation<? super Unit> continuation) {
                    return ((C04321) create(Long.valueOf(j), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function2
                public /* synthetic */ Object invoke(Long l, Continuation<? super Unit> continuation) {
                    return invoke(l.longValue(), continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        C44124sEe.imLogGroup$default("JoinReviewViewModel: Group ID changed to " + this.J$0 + ", refreshing join requests", null, 2, null);
                        this.this$0.OLrzqt(true);
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    SharedFlow sharedFlow = this.this$0.KWHzl;
                    C04321 c04321 = new C04321(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(sharedFlow, c04321, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C04311(JoinReviewViewModel.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(JoinReviewViewModel.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: com.okinc.im.imui.group.joinreview.viewmodel.JoinReviewViewModel$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ JoinReviewViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(JoinReviewViewModel joinReviewViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = joinReviewViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Flow flowTransformLatest = FlowKt.transformLatest(this.this$0.KWHzl, new JoinReviewViewModel$1$2$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0));
                    final JoinReviewViewModel joinReviewViewModel = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.im.imui.group.joinreview.viewmodel.JoinReviewViewModel.1.2.5
                        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                        public final Object emit(C35781oDl.TaskDescription taskDescription, Continuation<? super Unit> continuation) {
                            C44124sEe.imLogGroup$default("JoinReviewViewModel: Received group system message event: " + taskDescription, null, 2, null);
                            if (Intrinsics.EZpvd(taskDescription, C35781oDl.TaskDescription.Application.OLrzqt)) {
                                joinReviewViewModel.copydefault();
                                return Unit.INSTANCE;
                            }
                            if (Intrinsics.EZpvd(taskDescription, C35781oDl.TaskDescription.ActionBar.KWHzl)) {
                                Object objEmit = joinReviewViewModel.AEQbTJ.emit(ActionBar.Activity.copydefault, continuation);
                                return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                    };
                    this.label = 1;
                    if (flowTransformLatest.collect(flowCollector, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    public final void KWHzl(Long l) {
        this.djBIcL.set("KEY_MAX_ANIMATOR_DURATION", l);
    }

    public final void EZpvd(long j) {
        this.djBIcL.set("KEY_GROUP_ID", Long.valueOf(j));
    }

    public final void AEQbTJ(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new JoinReviewViewModel$fetchJoinRequests$1(this, str, null), 3, null);
    }

    public static /* synthetic */ void refreshJoinRequests$default(JoinReviewViewModel joinReviewViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        joinReviewViewModel.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        if (z) {
            this.EZpvd.tryEmit(Application.StateListAnimator.OLrzqt);
        }
        this.djBIcL.set("KEY_REQUEST_LIST", null);
        this.djBIcL.set("KEY_REQUEST_FULL_TOTAL", null);
        AEQbTJ((String) null);
    }

    public final void copydefault() {
        JoinRequestDisplayModel joinRequestDisplayModel = (JoinRequestDisplayModel) CollectionsKt___CollectionsKt.wlaJM(ejfBZ());
        AEQbTJ(joinRequestDisplayModel != null ? joinRequestDisplayModel.AEQbTJ() : null);
    }

    public final void fARcdN() {
        this.djBIcL.set("KEY_IS_SINGLE_SELECT", Boolean.valueOf(!this.AhwBna.getValue().booleanValue()));
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(C56402yEa.EZpvd(str), true);
    }

    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KWHzl(C56402yEa.EZpvd(str), false);
    }

    public final void AEQbTJ(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.djBIcL.set("KEY_REQUEST_LIST", nUK.EZpvd(ejfBZ(), str, z));
        if (!ejfBZ().isEmpty()) {
            this.EZpvd.tryEmit(djBIcL());
        }
    }

    public final void EZpvd(boolean z) {
        this.djBIcL.set("KEY_REQUEST_LIST", nUK.updateSelection$default(ejfBZ(), null, z, 1, null));
        if (!ejfBZ().isEmpty()) {
            this.EZpvd.tryEmit(djBIcL());
        }
    }

    public final void fIwbmz() {
        ActionBar actionBar;
        if (isConnected()) {
            actionBar = ActionBar.C0433ActionBar.OLrzqt;
        } else {
            actionBar = ActionBar.Application.OLrzqt;
        }
        this.AEQbTJ.tryEmit(actionBar);
    }

    public final void AEQbTJ(boolean z) {
        List<JoinRequestDisplayModel> listEjfBZ = ejfBZ();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listEjfBZ) {
            if (((JoinRequestDisplayModel) obj).AYXKKw()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((JoinRequestDisplayModel) it.next()).AEQbTJ());
        }
        KWHzl(arrayList2, z);
    }

    public final void KWHzl(List<String> list, boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new JoinReviewViewModel$submitApprovalReviews$1(this, list, z, null), 3, null);
    }
}
