package com.okinc.business.market.features.address_tracker;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C26240jXc;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC26239jXb;
import o.InterfaceC26243jXf;
import o.InterfaceC26246jXi;
import o.InterfaceC27779kDa;
import o.jAE;
import o.jAI;
import o.jAJ;
import o.jAM;
import o.jAP;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerGroupManageViewModel extends ViewModel implements InterfaceC26246jXi {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final SharedFlow<InterfaceC27779kDa> AEQbTJ;
    public final jAI AYXKKw;
    public final jAE AhwBna;
    public final StateFlow<InterfaceC26239jXb> AkhnZx;
    public final MutableSharedFlow<InterfaceC27779kDa> EZpvd;
    public final MutableStateFlow<InterfaceC26239jXb> OLrzqt;
    public final MutableSharedFlow<List<Integer>> copydefault;
    public final C26240jXc djBIcL;
    public final jAJ gEmmrt;
    public final jAM valueOf;
    public final jAP values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC26246jXi
    public SharedFlow<InterfaceC27779kDa> AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC26246jXi
    public void KWHzl() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC26246jXi
    public StateFlow<InterfaceC26239jXb> copydefault() {
        return this.AkhnZx;
    }

    @yCM
    public TrackerGroupManageViewModel(@NotNull jAJ jaj, @NotNull jAE jae, @NotNull jAM jam, @NotNull jAP jap, @NotNull jAI jai, @NotNull C26240jXc c26240jXc) {
        Intrinsics.checkNotNullParameter(jaj, "");
        Intrinsics.checkNotNullParameter(jae, "");
        Intrinsics.checkNotNullParameter(jam, "");
        Intrinsics.checkNotNullParameter(jap, "");
        Intrinsics.checkNotNullParameter(jai, "");
        Intrinsics.checkNotNullParameter(c26240jXc, "");
        this.gEmmrt = jaj;
        this.AhwBna = jae;
        this.valueOf = jam;
        this.values = jap;
        this.AYXKKw = jai;
        this.djBIcL = c26240jXc;
        MutableStateFlow<InterfaceC26239jXb> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC26239jXb.Activity.copydefault);
        this.OLrzqt = MutableStateFlow;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<InterfaceC27779kDa> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.AEQbTJ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.copydefault = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        OLrzqt();
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker.TrackerGroupManageViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker.TrackerGroupManageViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return TrackerGroupManageViewModel.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Flow flowDebounce = FlowKt.debounce(TrackerGroupManageViewModel.this.copydefault, 10L);
                C03411 c03411 = new C03411(TrackerGroupManageViewModel.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDebounce, c03411, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.business.market.features.address_tracker.TrackerGroupManageViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03411 extends SuspendLambda implements Function2<List<? extends Integer>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TrackerGroupManageViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03411(TrackerGroupManageViewModel trackerGroupManageViewModel, Continuation<? super C03411> continuation) {
                super(2, continuation);
                this.this$0 = trackerGroupManageViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03411 c03411 = new C03411(this.this$0, continuation);
                c03411.L$0 = obj;
                return c03411;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(List<? extends Integer> list, Continuation<? super Unit> continuation) {
                return invoke2((List<Integer>) list, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(List<Integer> list, Continuation<? super Unit> continuation) {
                return ((C03411) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    List<Integer> list = (List) this.L$0;
                    jAP jap = this.this$0.values;
                    this.label = 1;
                    if (jap.OLrzqt(list, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    ((Result) obj).m7386unboximpl();
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // o.InterfaceC26246jXi
    public void OLrzqt() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TrackerGroupManageViewModel$loadData$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object KWHzl(@NotNull String str, @NotNull Continuation<? super Result<? extends InterfaceC26243jXf>> continuation) throws Throwable {
        TrackerGroupManageViewModel$createNewGroup$1 trackerGroupManageViewModel$createNewGroup$1;
        TrackerGroupManageViewModel trackerGroupManageViewModel;
        if (continuation instanceof TrackerGroupManageViewModel$createNewGroup$1) {
            trackerGroupManageViewModel$createNewGroup$1 = (TrackerGroupManageViewModel$createNewGroup$1) continuation;
            int i = trackerGroupManageViewModel$createNewGroup$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                trackerGroupManageViewModel$createNewGroup$1.label = i - Integer.MIN_VALUE;
            } else {
                trackerGroupManageViewModel$createNewGroup$1 = new TrackerGroupManageViewModel$createNewGroup$1(this, continuation);
            }
        }
        Object objKWHzl = trackerGroupManageViewModel$createNewGroup$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = trackerGroupManageViewModel$createNewGroup$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            trackerGroupManageViewModel$createNewGroup$1.L$0 = this;
            trackerGroupManageViewModel$createNewGroup$1.L$1 = str;
            trackerGroupManageViewModel$createNewGroup$1.label = 1;
            objKWHzl = KWHzl(-1, str, trackerGroupManageViewModel$createNewGroup$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            trackerGroupManageViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
                return ((Result) objKWHzl).m7386unboximpl();
            }
            str = (String) trackerGroupManageViewModel$createNewGroup$1.L$1;
            trackerGroupManageViewModel = (TrackerGroupManageViewModel) trackerGroupManageViewModel$createNewGroup$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        if (((Boolean) objKWHzl).booleanValue()) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(InterfaceC26243jXf.ActionBar.copydefault);
        }
        jAE jae = trackerGroupManageViewModel.AhwBna;
        trackerGroupManageViewModel$createNewGroup$1.L$0 = null;
        trackerGroupManageViewModel$createNewGroup$1.L$1 = null;
        trackerGroupManageViewModel$createNewGroup$1.label = 2;
        Object objCopydefault2 = jae.copydefault(str, trackerGroupManageViewModel$createNewGroup$1);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object KWHzl(int i, @NotNull String str, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        TrackerGroupManageViewModel$haveDuplicate$1 trackerGroupManageViewModel$haveDuplicate$1;
        Object objKWHzl;
        if (continuation instanceof TrackerGroupManageViewModel$haveDuplicate$1) {
            trackerGroupManageViewModel$haveDuplicate$1 = (TrackerGroupManageViewModel$haveDuplicate$1) continuation;
            int i2 = trackerGroupManageViewModel$haveDuplicate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackerGroupManageViewModel$haveDuplicate$1.label = i2 - Integer.MIN_VALUE;
            } else {
                trackerGroupManageViewModel$haveDuplicate$1 = new TrackerGroupManageViewModel$haveDuplicate$1(this, continuation);
            }
        }
        Object obj = trackerGroupManageViewModel$haveDuplicate$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = trackerGroupManageViewModel$haveDuplicate$1.label;
        boolean z = false;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            jAJ jaj = this.gEmmrt;
            trackerGroupManageViewModel$haveDuplicate$1.L$0 = str;
            trackerGroupManageViewModel$haveDuplicate$1.I$0 = i;
            trackerGroupManageViewModel$haveDuplicate$1.label = 1;
            objKWHzl = jaj.KWHzl(false, trackerGroupManageViewModel$haveDuplicate$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = trackerGroupManageViewModel$haveDuplicate$1.I$0;
            str = (String) trackerGroupManageViewModel$haveDuplicate$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objKWHzl)) {
            objKWHzl = null;
        }
        List listAhwBna = (List) objKWHzl;
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        if (!(listAhwBna instanceof Collection) || !listAhwBna.isEmpty()) {
            Iterator it = listAhwBna.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                CommonGroupData commonGroupData = (CommonGroupData) it.next();
                if (Intrinsics.EZpvd((Object) commonGroupData.AEQbTJ(), (Object) str) && commonGroupData.OLrzqt() != i) {
                    z = true;
                    break;
                }
            }
        }
        return C56443yFo.KWHzl(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object AEQbTJ(int i, @NotNull String str, @NotNull Continuation<? super Result<? extends InterfaceC26243jXf>> continuation) throws Throwable {
        TrackerGroupManageViewModel$renameGroup$1 trackerGroupManageViewModel$renameGroup$1;
        TrackerGroupManageViewModel trackerGroupManageViewModel;
        if (continuation instanceof TrackerGroupManageViewModel$renameGroup$1) {
            trackerGroupManageViewModel$renameGroup$1 = (TrackerGroupManageViewModel$renameGroup$1) continuation;
            int i2 = trackerGroupManageViewModel$renameGroup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackerGroupManageViewModel$renameGroup$1.label = i2 - Integer.MIN_VALUE;
            } else {
                trackerGroupManageViewModel$renameGroup$1 = new TrackerGroupManageViewModel$renameGroup$1(this, continuation);
            }
        }
        Object objKWHzl = trackerGroupManageViewModel$renameGroup$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = trackerGroupManageViewModel$renameGroup$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            trackerGroupManageViewModel$renameGroup$1.L$0 = this;
            trackerGroupManageViewModel$renameGroup$1.L$1 = str;
            trackerGroupManageViewModel$renameGroup$1.I$0 = i;
            trackerGroupManageViewModel$renameGroup$1.label = 1;
            objKWHzl = KWHzl(i, str, trackerGroupManageViewModel$renameGroup$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            trackerGroupManageViewModel = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
                return ((Result) objKWHzl).m7386unboximpl();
            }
            i = trackerGroupManageViewModel$renameGroup$1.I$0;
            str = (String) trackerGroupManageViewModel$renameGroup$1.L$1;
            trackerGroupManageViewModel = (TrackerGroupManageViewModel) trackerGroupManageViewModel$renameGroup$1.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        if (((Boolean) objKWHzl).booleanValue()) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(InterfaceC26243jXf.ActionBar.copydefault);
        }
        jAM jam = trackerGroupManageViewModel.valueOf;
        trackerGroupManageViewModel$renameGroup$1.L$0 = null;
        trackerGroupManageViewModel$renameGroup$1.L$1 = null;
        trackerGroupManageViewModel$renameGroup$1.label = 2;
        Object objAEQbTJ = jam.AEQbTJ(i, str, trackerGroupManageViewModel$renameGroup$1);
        return objAEQbTJ == objCopydefault ? objCopydefault : objAEQbTJ;
    }

    @Override // o.InterfaceC26246jXi
    public void AEQbTJ(@NotNull CommonGroupUiModel commonGroupUiModel) {
        Intrinsics.checkNotNullParameter(commonGroupUiModel, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TrackerGroupManageViewModel$deleteGroup$1(this, commonGroupUiModel, null), 3, null);
    }

    @Override // o.InterfaceC26246jXi
    public void copydefault(@NotNull List<CommonGroupUiModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TrackerGroupManageViewModel$sortGroups$1(this, list, null), 3, null);
    }

    public final void KWHzl(Throwable th) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new TrackerGroupManageViewModel$handleError$1(th, this, null), 3, null);
    }
}
