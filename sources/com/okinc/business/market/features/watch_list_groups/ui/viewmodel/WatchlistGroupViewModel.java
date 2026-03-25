package com.okinc.business.market.features.watch_list_groups.ui.viewmodel;

import androidx.lifecycle.SavedStateHandle;
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
import o.C26109jSg;
import o.C26240jXc;
import o.C27762kCk;
import o.C27764kCm;
import o.C27765kCn;
import o.C27768kCq;
import o.C27769kCr;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC26239jXb;
import o.InterfaceC26243jXf;
import o.InterfaceC26246jXi;
import o.InterfaceC27779kDa;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchlistGroupViewModel extends ViewModel implements InterfaceC26246jXi {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final SharedFlow<InterfaceC27779kDa> AEQbTJ;
    public final C27769kCr AYXKKw;
    public final C26240jXc AhwBna;
    public final C26109jSg AkhnZx;
    public final MutableStateFlow<InterfaceC26239jXb> EZpvd;
    public final MutableSharedFlow<InterfaceC27779kDa> KWHzl;
    public final MutableSharedFlow<List<Integer>> copydefault;
    public final C27764kCm djBIcL;
    public final C27762kCk gEmmrt;
    public final C27768kCq isConnected;
    public final C27765kCn valueOf;
    public final StateFlow<InterfaceC26239jXb> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC26246jXi
    public SharedFlow<InterfaceC27779kDa> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC26246jXi
    public StateFlow<InterfaceC26239jXb> copydefault() {
        return this.values;
    }

    @yCM
    public WatchlistGroupViewModel(@NotNull C27764kCm c27764kCm, @NotNull C27762kCk c27762kCk, @NotNull C27769kCr c27769kCr, @NotNull C27768kCq c27768kCq, @NotNull C27765kCn c27765kCn, @NotNull C26109jSg c26109jSg, @NotNull C26240jXc c26240jXc, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(c27764kCm, "");
        Intrinsics.checkNotNullParameter(c27762kCk, "");
        Intrinsics.checkNotNullParameter(c27769kCr, "");
        Intrinsics.checkNotNullParameter(c27768kCq, "");
        Intrinsics.checkNotNullParameter(c27765kCn, "");
        Intrinsics.checkNotNullParameter(c26109jSg, "");
        Intrinsics.checkNotNullParameter(c26240jXc, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.djBIcL = c27764kCm;
        this.gEmmrt = c27762kCk;
        this.AYXKKw = c27769kCr;
        this.isConnected = c27768kCq;
        this.valueOf = c27765kCn;
        this.AkhnZx = c26109jSg;
        this.AhwBna = c26240jXc;
        MutableStateFlow<InterfaceC26239jXb> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC26239jXb.Activity.copydefault);
        this.EZpvd = MutableStateFlow;
        this.values = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<InterfaceC27779kDa> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.AEQbTJ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.copydefault = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        OLrzqt();
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.watch_list_groups.ui.viewmodel.WatchlistGroupViewModel.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.watch_list_groups.ui.viewmodel.WatchlistGroupViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WatchlistGroupViewModel.this.new AnonymousClass1(continuation);
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
                Flow flowDebounce = FlowKt.debounce(WatchlistGroupViewModel.this.copydefault, 10L);
                C03721 c03721 = new C03721(WatchlistGroupViewModel.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDebounce, c03721, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.business.market.features.watch_list_groups.ui.viewmodel.WatchlistGroupViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03721 extends SuspendLambda implements Function2<List<? extends Integer>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ WatchlistGroupViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03721(WatchlistGroupViewModel watchlistGroupViewModel, Continuation<? super C03721> continuation) {
                super(2, continuation);
                this.this$0 = watchlistGroupViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03721 c03721 = new C03721(this.this$0, continuation);
                c03721.L$0 = obj;
                return c03721;
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
                return ((C03721) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    List<Integer> list = (List) this.L$0;
                    C27768kCq c27768kCq = this.this$0.isConnected;
                    this.label = 1;
                    if (c27768kCq.KWHzl(list, this) == objCopydefault) {
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
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new WatchlistGroupViewModel$loadData$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object EZpvd(@NotNull String str, @NotNull Continuation<? super Result<? extends InterfaceC26243jXf>> continuation) throws Throwable {
        WatchlistGroupViewModel$createNewGroup$1 watchlistGroupViewModel$createNewGroup$1;
        if (continuation instanceof WatchlistGroupViewModel$createNewGroup$1) {
            watchlistGroupViewModel$createNewGroup$1 = (WatchlistGroupViewModel$createNewGroup$1) continuation;
            int i = watchlistGroupViewModel$createNewGroup$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchlistGroupViewModel$createNewGroup$1.label = i - Integer.MIN_VALUE;
            } else {
                watchlistGroupViewModel$createNewGroup$1 = new WatchlistGroupViewModel$createNewGroup$1(this, continuation);
            }
        }
        Object obj = watchlistGroupViewModel$createNewGroup$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchlistGroupViewModel$createNewGroup$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        C27762kCk c27762kCk = this.gEmmrt;
        watchlistGroupViewModel$createNewGroup$1.label = 1;
        Object objOLrzqt = c27762kCk.OLrzqt(str, watchlistGroupViewModel$createNewGroup$1);
        return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object copydefault(int i, @NotNull String str, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        WatchlistGroupViewModel$haveDuplicate$1 watchlistGroupViewModel$haveDuplicate$1;
        Object objCopydefault;
        if (continuation instanceof WatchlistGroupViewModel$haveDuplicate$1) {
            watchlistGroupViewModel$haveDuplicate$1 = (WatchlistGroupViewModel$haveDuplicate$1) continuation;
            int i2 = watchlistGroupViewModel$haveDuplicate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                watchlistGroupViewModel$haveDuplicate$1.label = i2 - Integer.MIN_VALUE;
            } else {
                watchlistGroupViewModel$haveDuplicate$1 = new WatchlistGroupViewModel$haveDuplicate$1(this, continuation);
            }
        }
        Object obj = watchlistGroupViewModel$haveDuplicate$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i3 = watchlistGroupViewModel$haveDuplicate$1.label;
        boolean z = false;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            C27764kCm c27764kCm = this.djBIcL;
            watchlistGroupViewModel$haveDuplicate$1.L$0 = str;
            watchlistGroupViewModel$haveDuplicate$1.I$0 = i;
            watchlistGroupViewModel$haveDuplicate$1.label = 1;
            objCopydefault = c27764kCm.copydefault(false, watchlistGroupViewModel$haveDuplicate$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = watchlistGroupViewModel$haveDuplicate$1.I$0;
            str = (String) watchlistGroupViewModel$haveDuplicate$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objCopydefault = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objCopydefault)) {
            objCopydefault = null;
        }
        List listAhwBna = (List) objCopydefault;
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
    public Object EZpvd(int i, @NotNull String str, @NotNull Continuation<? super Result<? extends InterfaceC26243jXf>> continuation) throws Throwable {
        WatchlistGroupViewModel$renameGroup$1 watchlistGroupViewModel$renameGroup$1;
        WatchlistGroupViewModel watchlistGroupViewModel;
        if (continuation instanceof WatchlistGroupViewModel$renameGroup$1) {
            watchlistGroupViewModel$renameGroup$1 = (WatchlistGroupViewModel$renameGroup$1) continuation;
            int i2 = watchlistGroupViewModel$renameGroup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                watchlistGroupViewModel$renameGroup$1.label = i2 - Integer.MIN_VALUE;
            } else {
                watchlistGroupViewModel$renameGroup$1 = new WatchlistGroupViewModel$renameGroup$1(this, continuation);
            }
        }
        Object objCopydefault = watchlistGroupViewModel$renameGroup$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i3 = watchlistGroupViewModel$renameGroup$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            watchlistGroupViewModel$renameGroup$1.L$0 = this;
            watchlistGroupViewModel$renameGroup$1.L$1 = str;
            watchlistGroupViewModel$renameGroup$1.I$0 = i;
            watchlistGroupViewModel$renameGroup$1.label = 1;
            objCopydefault = copydefault(i, str, watchlistGroupViewModel$renameGroup$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            watchlistGroupViewModel = this;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                return ((Result) objCopydefault).m7386unboximpl();
            }
            i = watchlistGroupViewModel$renameGroup$1.I$0;
            str = (String) watchlistGroupViewModel$renameGroup$1.L$1;
            watchlistGroupViewModel = (WatchlistGroupViewModel) watchlistGroupViewModel$renameGroup$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        if (((Boolean) objCopydefault).booleanValue()) {
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(InterfaceC26243jXf.ActionBar.copydefault);
        }
        C27769kCr c27769kCr = watchlistGroupViewModel.AYXKKw;
        watchlistGroupViewModel$renameGroup$1.L$0 = null;
        watchlistGroupViewModel$renameGroup$1.L$1 = null;
        watchlistGroupViewModel$renameGroup$1.label = 2;
        Object objCopydefault3 = c27769kCr.copydefault(i, str, watchlistGroupViewModel$renameGroup$1);
        return objCopydefault3 == objCopydefault2 ? objCopydefault2 : objCopydefault3;
    }

    @Override // o.InterfaceC26246jXi
    public void AEQbTJ(@NotNull CommonGroupUiModel commonGroupUiModel) {
        Intrinsics.checkNotNullParameter(commonGroupUiModel, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new WatchlistGroupViewModel$deleteGroup$1(this, commonGroupUiModel, null), 3, null);
    }

    @Override // o.InterfaceC26246jXi
    public void copydefault(@NotNull List<CommonGroupUiModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new WatchlistGroupViewModel$sortGroups$1(this, list, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(Throwable th) {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new WatchlistGroupViewModel$handleError$1(th, this, null), 3, null);
    }

    @Override // o.InterfaceC26246jXi
    public void KWHzl() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new WatchlistGroupViewModel$signalGroupListRefresh$1(this, null), 3, null);
    }
}
