package com.okinc.business.market.features.smart_money.signal.ui.overview;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewUiModel;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.BuySellMarker;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C25389ivm;
import o.C28586kda;
import o.C29481kuU;
import o.C29506kut;
import o.C29508kuv;
import o.C29558kvs;
import o.C56391yDq;
import o.C56442yFn;
import o.yCM;
import o.yDY;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalOverviewViewModel extends ViewModel {
    public final MutableStateFlow<List<SignalOverviewUiModel>> AEQbTJ;
    public C29481kuU AYXKKw;
    public final C29508kuv AhwBna;
    public boolean AkhnZx;
    public final StateFlow<TaskDescription> EZpvd;
    public final MutableStateFlow<C29558kvs> KWHzl;
    public final MutableStateFlow<SignalOverviewUiModel> OLrzqt;
    public final MutableStateFlow<TaskDescription> copydefault;
    public final StateFlow<List<SignalOverviewUiModel>> djBIcL;
    public final C29506kut gEmmrt;
    public final StateFlow<C29558kvs> isConnected;
    public final C28586kda valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<SignalOverviewUiModel>> AEQbTJ() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<TaskDescription> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt() {
        this.AkhnZx = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C29558kvs> copydefault() {
        return this.isConnected;
    }

    @yCM
    public SignalOverviewViewModel(@NotNull C29508kuv c29508kuv, @NotNull C29506kut c29506kut, @NotNull C28586kda c28586kda) {
        Intrinsics.checkNotNullParameter(c29508kuv, "");
        Intrinsics.checkNotNullParameter(c29506kut, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        this.AhwBna = c29508kuv;
        this.gEmmrt = c29506kut;
        this.valueOf = c28586kda;
        MutableStateFlow<C29558kvs> MutableStateFlow = StateFlowKt.MutableStateFlow(new C29558kvs(false, true, false, null, 13, null));
        this.KWHzl = MutableStateFlow;
        this.isConnected = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<SignalOverviewUiModel>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow2;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<TaskDescription> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow3;
        this.EZpvd = FlowKt.asStateFlow(MutableStateFlow3);
        this.OLrzqt = StateFlowKt.MutableStateFlow(null);
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public static final class TaskDescription {
        public final boolean AEQbTJ;
        public final List<SignalOverviewUiModel> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.smart_money.signal.ui.overview.SignalOverviewViewModel$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = taskDescription.OLrzqt;
            }
            if ((i & 2) != 0) {
                z = taskDescription.AEQbTJ;
            }
            return taskDescription.AEQbTJ(list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription AEQbTJ(List<SignalOverviewUiModel> list, boolean z) {
            return new TaskDescription(list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<SignalOverviewUiModel> KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.OLrzqt, taskDescription.OLrzqt) && this.AEQbTJ == taskDescription.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            List<SignalOverviewUiModel> list = this.OLrzqt;
            return ((list == null ? 0 : list.hashCode()) * 31) + Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SignalOverviewUpdate(data=" + this.OLrzqt + ", isFromWebsocket=" + this.AEQbTJ + ")";
        }

        public TaskDescription(List<SignalOverviewUiModel> list, boolean z) {
            this.OLrzqt = list;
            this.AEQbTJ = z;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.market.features.smart_money.signal.ui.overview.SignalOverviewViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SignalOverviewViewModel.this.new AnonymousClass1(continuation);
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
                Flow flowCombine = FlowKt.combine(SignalOverviewViewModel.this.AhwBna.AEQbTJ(), SignalOverviewViewModel.this.AhwBna.KWHzl(), new C03691(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(SignalOverviewViewModel.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.business.market.features.smart_money.signal.ui.overview.SignalOverviewViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C03691 extends SuspendLambda implements yHO<List<? extends SignalOverviewUiModel>, Boolean, Continuation<? super TaskDescription>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ boolean Z$0;
            int label;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C03691(Continuation<? super C03691> continuation) {
                super(3, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // o.yHO
            public /* synthetic */ Object invoke(List<? extends SignalOverviewUiModel> list, Boolean bool, Continuation<? super TaskDescription> continuation) {
                return invoke((List<SignalOverviewUiModel>) list, bool.booleanValue(), continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(List<SignalOverviewUiModel> list, boolean z, Continuation<? super TaskDescription> continuation) {
                C03691 c03691 = new C03691(continuation);
                c03691.L$0 = list;
                c03691.Z$0 = z;
                return c03691.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    return new TaskDescription((List) this.L$0, this.Z$0);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: renamed from: com.okinc.business.market.features.smart_money.signal.ui.overview.SignalOverviewViewModel$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<TaskDescription, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SignalOverviewViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(SignalOverviewViewModel signalOverviewViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = signalOverviewViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TaskDescription taskDescription, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(taskDescription, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object value;
                Object value2;
                Object next;
                Object value3;
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    TaskDescription taskDescription = (TaskDescription) this.L$0;
                    MutableStateFlow mutableStateFlow = this.this$0.AEQbTJ;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, taskDescription.KWHzl()));
                    MutableStateFlow mutableStateFlow2 = this.this$0.copydefault;
                    do {
                        value2 = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value2, taskDescription));
                    if (taskDescription.copydefault()) {
                        this.this$0.AkhnZx = true;
                        this.this$0.AhwBna.copydefault();
                    }
                    SignalOverviewUiModel signalOverviewUiModel = (SignalOverviewUiModel) this.this$0.OLrzqt.getValue();
                    if (signalOverviewUiModel != null && taskDescription.KWHzl() != null) {
                        Iterator<T> it = taskDescription.KWHzl().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            SignalOverviewUiModel signalOverviewUiModel2 = (SignalOverviewUiModel) next;
                            if (Intrinsics.EZpvd((Object) signalOverviewUiModel2.valueOf(), (Object) signalOverviewUiModel.valueOf()) && Intrinsics.EZpvd((Object) signalOverviewUiModel2.values(), (Object) signalOverviewUiModel.values())) {
                                break;
                            }
                        }
                        SignalOverviewUiModel signalOverviewUiModel3 = (SignalOverviewUiModel) next;
                        if (signalOverviewUiModel3 != null && !Intrinsics.EZpvd(signalOverviewUiModel3, signalOverviewUiModel)) {
                            MutableStateFlow mutableStateFlow3 = this.this$0.OLrzqt;
                            do {
                                value3 = mutableStateFlow3.getValue();
                            } while (!mutableStateFlow3.compareAndSet(value3, signalOverviewUiModel3));
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.smart_money.signal.ui.overview.SignalOverviewViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchOverviews$default(SignalOverviewViewModel signalOverviewViewModel, List list, boolean z, C29481kuU c29481kuU, int i, Object obj) {
        if ((i & 1) != 0) {
            list = yDY.AhwBna();
        }
        if ((i & 2) != 0) {
            z = true;
        }
        signalOverviewViewModel.copydefault((List<String>) list, z, c29481kuU);
    }

    public final void copydefault(@NotNull List<String> list, boolean z, @NotNull C29481kuU c29481kuU) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c29481kuU, "");
        if (z) {
            this.AYXKKw = c29481kuU;
            this.AhwBna.OLrzqt();
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalOverviewViewModel$fetchOverviews$1(this, z, list, c29481kuU, null), 3, null);
    }

    public final void AEQbTJ(@NotNull BuySellMarker buySellMarker, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(buySellMarker, "");
        this.AhwBna.OLrzqt(buySellMarker, z, z2);
    }

    public final void copydefault(@NotNull String str, @NotNull String str2, @NotNull TimeIntervalSelector timeIntervalSelector) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(timeIntervalSelector, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalOverviewViewModel$onOverviewChartIntervalSelected$1(this, str, str2, timeIntervalSelector, null), 3, null);
    }

    public final void AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull TimeIntervalSelector timeIntervalSelector) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(timeIntervalSelector, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalOverviewViewModel$onFetchKlineLoadMore$1(this, str, str2, timeIntervalSelector, null), 3, null);
    }

    public final void KWHzl(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalOverviewViewModel$subscribeWs$1(this, list, null), 3, null);
    }

    public final void KWHzl() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalOverviewViewModel$unSubscribeWs$1(this, null), 3, null);
    }

    public final void gEmmrt() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalOverviewViewModel$unsubscribeAllTokens$1(this, null), 3, null);
    }

    public final void KWHzl(@NotNull SignalOverviewUiModel signalOverviewUiModel) {
        Intrinsics.checkNotNullParameter(signalOverviewUiModel, "");
        MutableStateFlow<SignalOverviewUiModel> mutableStateFlow = this.OLrzqt;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), signalOverviewUiModel)) {
        }
    }

    public final void EZpvd(@NotNull List<Pair<String, String>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Pair pair = (Pair) obj;
            if ((!StringsKt__StringsKt.fARcdN((CharSequence) pair.getFirst())) && (!StringsKt__StringsKt.fARcdN((CharSequence) pair.getSecond()))) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new SignalOverviewViewModel$subscribeVisibleTokens$1(this, arrayList, null), 3, null);
    }
}
