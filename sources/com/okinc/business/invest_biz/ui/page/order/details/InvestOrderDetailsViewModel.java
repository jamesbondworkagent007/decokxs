package com.okinc.business.invest_biz.ui.page.order.details;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo;
import com.okinc.business.invest_biz.data.bean.request.InvestOrderDetailsPageParam;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel;
import com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsState;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C23597iCg;
import o.C23605iCo;
import o.C24134iWd;
import o.C24135iWe;
import o.C24136iWf;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.iBH;
import o.iBL;
import o.iVX;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestOrderDetailsViewModel extends ViewModel {
    public final String AEQbTJ;
    public final C23597iCg AhwBna;
    public final C24134iWd EZpvd;
    public final MutableStateFlow<InvestOrderDetailsState> KWHzl;
    public final StateFlow<InvestOrderDetailsState> OLrzqt;
    public final iBH copydefault;
    public final String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InvestOrderDetailsState> KWHzl() {
        return this.OLrzqt;
    }

    @yCM
    public InvestOrderDetailsViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull iBH ibh, @NotNull C23597iCg c23597iCg, @NotNull C24134iWd c24134iWd) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(ibh, "");
        Intrinsics.checkNotNullParameter(c23597iCg, "");
        Intrinsics.checkNotNullParameter(c24134iWd, "");
        this.copydefault = ibh;
        this.AhwBna = c23597iCg;
        this.EZpvd = c24134iWd;
        this.AEQbTJ = (String) savedStateHandle.get("txHash");
        this.djBIcL = (String) savedStateHandle.get("uopHash");
        MutableStateFlow<InvestOrderDetailsState> MutableStateFlow = StateFlowKt.MutableStateFlow(new InvestOrderDetailsState(false, null, null, 7, null));
        this.KWHzl = MutableStateFlow;
        this.OLrzqt = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsViewModel$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestOrderDetailsViewModel.this.new AnonymousClass1(continuation);
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
                Activity activity = new Activity(InvestOrderDetailsViewModel.this.AhwBna.AEQbTJ(), InvestOrderDetailsViewModel.this);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(InvestOrderDetailsViewModel.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(activity, anonymousClass2, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsViewModel$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<InvestTransactionModel, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ InvestOrderDetailsViewModel this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(InvestOrderDetailsViewModel investOrderDetailsViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = investOrderDetailsViewModel;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InvestTransactionModel investTransactionModel, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(investTransactionModel, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    InvestOrderDetailsViewModel investOrderDetailsViewModel = this.this$0;
                    this.label = 1;
                    if (investOrderDetailsViewModel.copydefault(false, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsViewModel$1$Activity */
        public static final class Activity implements Flow<InvestTransactionModel> {
            public final /* synthetic */ Flow EZpvd;
            public final /* synthetic */ InvestOrderDetailsViewModel OLrzqt;

            /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.page.order.details.InvestOrderDetailsViewModel$1$Activity$1, reason: invalid class name and collision with other inner class name */
            public static final class C03351<T> implements FlowCollector {
                public final /* synthetic */ FlowCollector KWHzl;
                public final /* synthetic */ InvestOrderDetailsViewModel copydefault;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public C03351(FlowCollector flowCollector, InvestOrderDetailsViewModel investOrderDetailsViewModel) {
                    this.KWHzl = flowCollector;
                    this.copydefault = investOrderDetailsViewModel;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) throws Throwable {
                    InvestOrderDetailsViewModel$1$invokeSuspend$$inlined$filter$1$2$1 investOrderDetailsViewModel$1$invokeSuspend$$inlined$filter$1$2$1;
                    if (continuation instanceof InvestOrderDetailsViewModel$1$invokeSuspend$$inlined$filter$1$2$1) {
                        investOrderDetailsViewModel$1$invokeSuspend$$inlined$filter$1$2$1 = (InvestOrderDetailsViewModel$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                        int i = investOrderDetailsViewModel$1$invokeSuspend$$inlined$filter$1$2$1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            investOrderDetailsViewModel$1$invokeSuspend$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                        } else {
                            investOrderDetailsViewModel$1$invokeSuspend$$inlined$filter$1$2$1 = new InvestOrderDetailsViewModel$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                        }
                    }
                    Object obj2 = investOrderDetailsViewModel$1$invokeSuspend$$inlined$filter$1$2$1.result;
                    Object objCopydefault = C56442yFn.copydefault();
                    int i2 = investOrderDetailsViewModel$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if (i2 == 0) {
                        C56391yDq.AEQbTJ(obj2);
                        FlowCollector flowCollector = this.KWHzl;
                        if (C23605iCo.isSameTransaction$default((InvestTransactionModel) obj, this.copydefault.AEQbTJ, this.copydefault.djBIcL, null, 4, null)) {
                            investOrderDetailsViewModel$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                            if (flowCollector.emit(obj, investOrderDetailsViewModel$1$invokeSuspend$$inlined$filter$1$2$1) == objCopydefault) {
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

            public Activity(Flow flow, InvestOrderDetailsViewModel investOrderDetailsViewModel) {
                this.EZpvd = flow;
                this.OLrzqt = investOrderDetailsViewModel;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super InvestTransactionModel> flowCollector, Continuation continuation) {
                Object objCollect = this.EZpvd.collect(new C03351(flowCollector, this.OLrzqt), continuation);
                return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
            }
        }
    }

    public static /* synthetic */ Object refreshDataInternal$OKDeFi_invest_biz$default(InvestOrderDetailsViewModel investOrderDetailsViewModel, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return investOrderDetailsViewModel.copydefault(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(boolean z, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        InvestOrderDetailsViewModel$refreshDataInternal$1 investOrderDetailsViewModel$refreshDataInternal$1;
        String str;
        InvestOrderDetailsState value;
        Throwable th;
        InvestOrderDetailsViewModel investOrderDetailsViewModel;
        InvestOrderDetailsState value2;
        Object objM7377constructorimpl;
        InvestOrderDetailsViewModel investOrderDetailsViewModel2;
        Object obj;
        InvestOrderDetailsState value3;
        InvestOrderDetailsState.Status status;
        InvestOrderDetailsViewModel investOrderDetailsViewModel3;
        Throwable thM7380exceptionOrNullimpl;
        InvestOrderDetailsState value4;
        if (continuation instanceof InvestOrderDetailsViewModel$refreshDataInternal$1) {
            investOrderDetailsViewModel$refreshDataInternal$1 = (InvestOrderDetailsViewModel$refreshDataInternal$1) continuation;
            int i = investOrderDetailsViewModel$refreshDataInternal$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                investOrderDetailsViewModel$refreshDataInternal$1.label = i - Integer.MIN_VALUE;
            } else {
                investOrderDetailsViewModel$refreshDataInternal$1 = new InvestOrderDetailsViewModel$refreshDataInternal$1(this, continuation);
            }
        }
        Object objCopydefault = investOrderDetailsViewModel$refreshDataInternal$1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = investOrderDetailsViewModel$refreshDataInternal$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                String str2 = this.AEQbTJ;
                if ((str2 == null || str2.length() == 0) && ((str = this.djBIcL) == null || str.length() == 0)) {
                    MutableStateFlow<InvestOrderDetailsState> mutableStateFlow = this.KWHzl;
                    do {
                        value = mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(value, C24135iWe.copydefault(value, new InvestOrderDetailsState.ActionBar.StateListAnimator(C43422row.OLrzqt()))));
                    return Unit.INSTANCE;
                }
                if (z) {
                    MutableStateFlow<InvestOrderDetailsState> mutableStateFlow2 = this.KWHzl;
                    do {
                        value2 = mutableStateFlow2.getValue();
                    } while (!mutableStateFlow2.compareAndSet(value2, C24135iWe.AEQbTJ(value2)));
                }
                try {
                    Result.Application application = Result.Companion;
                    iBH ibh = this.copydefault;
                    InvestOrderDetailsPageParam investOrderDetailsPageParam = new InvestOrderDetailsPageParam(this.AEQbTJ, this.djBIcL);
                    investOrderDetailsViewModel$refreshDataInternal$1.L$0 = this;
                    investOrderDetailsViewModel$refreshDataInternal$1.label = 1;
                    objCopydefault = ibh.copydefault(investOrderDetailsPageParam, investOrderDetailsViewModel$refreshDataInternal$1);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                    investOrderDetailsViewModel = this;
                } catch (Throwable th2) {
                    th = th2;
                    investOrderDetailsViewModel = this;
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = investOrderDetailsViewModel$refreshDataInternal$1.L$1;
                    investOrderDetailsViewModel3 = (InvestOrderDetailsViewModel) investOrderDetailsViewModel$refreshDataInternal$1.L$0;
                    C56391yDq.AEQbTJ(objCopydefault);
                    investOrderDetailsViewModel2 = investOrderDetailsViewModel3;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
                    if (thM7380exceptionOrNullimpl != null) {
                        MutableStateFlow<InvestOrderDetailsState> mutableStateFlow3 = investOrderDetailsViewModel2.KWHzl;
                        do {
                            value4 = mutableStateFlow3.getValue();
                        } while (!mutableStateFlow3.compareAndSet(value4, C24135iWe.copydefault(value4, C24136iWf.OLrzqt(thM7380exceptionOrNullimpl))));
                    }
                    return Unit.INSTANCE;
                }
                investOrderDetailsViewModel = (InvestOrderDetailsViewModel) investOrderDetailsViewModel$refreshDataInternal$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objCopydefault);
                } catch (Throwable th3) {
                    th = th3;
                    Result.Application application22 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((InvestOrderDetailsInfoVo) iBL.unwrapResponseData$default((ResponseData) objCopydefault, null, 1, null));
            Object obj2 = objM7377constructorimpl;
            investOrderDetailsViewModel2 = investOrderDetailsViewModel;
            obj = obj2;
            if (Result.m7384isSuccessimpl(obj)) {
                InvestOrderDetailsInfoVo investOrderDetailsInfoVo = (InvestOrderDetailsInfoVo) obj;
                if (investOrderDetailsInfoVo != null) {
                    MutableStateFlow<InvestOrderDetailsState> mutableStateFlow4 = investOrderDetailsViewModel2.KWHzl;
                    InvestOrderDetailsState.Activity activity = InvestOrderDetailsState.Companion;
                    List<iVX> listKWHzl = investOrderDetailsViewModel2.EZpvd.KWHzl(investOrderDetailsInfoVo);
                    Integer orderStatus = investOrderDetailsInfoVo.getOrderStatus();
                    if (orderStatus != null && orderStatus.intValue() == 2) {
                        status = InvestOrderDetailsState.Status.PENDING;
                    } else if (orderStatus != null && orderStatus.intValue() == 5) {
                        status = InvestOrderDetailsState.Status.COMPLETED;
                    } else {
                        status = (orderStatus != null && orderStatus.intValue() == 4) ? InvestOrderDetailsState.Status.FAILED : InvestOrderDetailsState.Status.PENDING;
                    }
                    InvestOrderDetailsState investOrderDetailsStateEZpvd = activity.EZpvd(new InvestOrderDetailsState.TaskDescription(listKWHzl, status));
                    investOrderDetailsViewModel$refreshDataInternal$1.L$0 = investOrderDetailsViewModel2;
                    investOrderDetailsViewModel$refreshDataInternal$1.L$1 = obj;
                    investOrderDetailsViewModel$refreshDataInternal$1.label = 2;
                    if (mutableStateFlow4.emit(investOrderDetailsStateEZpvd, investOrderDetailsViewModel$refreshDataInternal$1) == objCopydefault2) {
                        return objCopydefault2;
                    }
                    investOrderDetailsViewModel3 = investOrderDetailsViewModel2;
                    investOrderDetailsViewModel2 = investOrderDetailsViewModel3;
                } else {
                    MutableStateFlow<InvestOrderDetailsState> mutableStateFlow5 = investOrderDetailsViewModel2.KWHzl;
                    do {
                        value3 = mutableStateFlow5.getValue();
                    } while (!mutableStateFlow5.compareAndSet(value3, C24135iWe.copydefault(value3, new InvestOrderDetailsState.ActionBar.StateListAnimator(C43422row.OLrzqt()))));
                }
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj);
            if (thM7380exceptionOrNullimpl != null) {
            }
            return Unit.INSTANCE;
        } catch (CancellationException e) {
            throw e;
        }
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestOrderDetailsViewModel$refreshData$1(this, null), 3, null);
    }

    public final void OLrzqt() {
        InvestOrderDetailsState value;
        MutableStateFlow<InvestOrderDetailsState> mutableStateFlow = this.KWHzl;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, InvestOrderDetailsState.copy$default(value, false, null, null, 3, null)));
    }
}
