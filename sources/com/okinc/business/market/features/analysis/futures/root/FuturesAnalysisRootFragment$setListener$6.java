package com.okinc.business.market.features.analysis.futures.root;

import com.okinc.business.market.features.analysis.futures.root.viewmodel.FuturesAnalysisViewModel;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.C25852jIt;
import o.C33546myW;
import o.C42787rcx;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class FuturesAnalysisRootFragment$setListener$6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C25852jIt this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisRootFragment$setListener$6(C25852jIt c25852jIt, Continuation<? super FuturesAnalysisRootFragment$setListener$6> continuation) {
        super(2, continuation);
        this.this$0 = c25852jIt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesAnalysisRootFragment$setListener$6(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisRootFragment$setListener$6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class Activity implements Flow<FuturesAnalysisViewModel.StateListAnimator> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$setListener$6$Activity$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:31:0x0084 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                FuturesAnalysisRootFragment$setListener$6$invokeSuspend$$inlined$filter$1$2$1 futuresAnalysisRootFragment$setListener$6$invokeSuspend$$inlined$filter$1$2$1;
                if (continuation instanceof FuturesAnalysisRootFragment$setListener$6$invokeSuspend$$inlined$filter$1$2$1) {
                    futuresAnalysisRootFragment$setListener$6$invokeSuspend$$inlined$filter$1$2$1 = (FuturesAnalysisRootFragment$setListener$6$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i = futuresAnalysisRootFragment$setListener$6$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        futuresAnalysisRootFragment$setListener$6$invokeSuspend$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        futuresAnalysisRootFragment$setListener$6$invokeSuspend$$inlined$filter$1$2$1 = new FuturesAnalysisRootFragment$setListener$6$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                Object obj2 = futuresAnalysisRootFragment$setListener$6$invokeSuspend$$inlined$filter$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = futuresAnalysisRootFragment$setListener$6$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    FuturesAnalysisViewModel.StateListAnimator stateListAnimator = (FuturesAnalysisViewModel.StateListAnimator) obj;
                    List<InterfaceC49371unL> listGEmmrt = yDY.gEmmrt(stateListAnimator.EZpvd(), stateListAnimator.KWHzl(), stateListAnimator.copydefault());
                    if ((listGEmmrt instanceof Collection) && listGEmmrt.isEmpty()) {
                        futuresAnalysisRootFragment$setListener$6$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, futuresAnalysisRootFragment$setListener$6$invokeSuspend$$inlined$filter$1$2$1) == objCopydefault) {
                        }
                    } else {
                        for (InterfaceC49371unL interfaceC49371unL : listGEmmrt) {
                            if (!(interfaceC49371unL instanceof InterfaceC49371unL.Activity) && !(interfaceC49371unL instanceof InterfaceC49371unL.TaskDescription) && !(interfaceC49371unL instanceof InterfaceC49371unL.Application)) {
                                break;
                            }
                        }
                        futuresAnalysisRootFragment$setListener$6$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, futuresAnalysisRootFragment$setListener$6$invokeSuspend$$inlined$filter$1$2$1) == objCopydefault) {
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

        public Activity(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super FuturesAnalysisViewModel.StateListAnimator> flowCollector, Continuation continuation) {
            Object objCollect = this.AEQbTJ.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C25852jIt c25852jIt = this.this$0;
            Activity activity = new Activity(c25852jIt.uiStateFlow(c25852jIt.fARcdN()));
            final C25852jIt c25852jIt2 = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.analysis.futures.root.FuturesAnalysisRootFragment$setListener$6.2
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(FuturesAnalysisViewModel.StateListAnimator stateListAnimator, Continuation<? super Unit> continuation) {
                    C33546myW c33546myW;
                    C42787rcx c42787rcx = c25852jIt2.OLrzqt;
                    if (c42787rcx != null && (c33546myW = c42787rcx.AYXKKw) != null) {
                        c33546myW.AEQbTJ();
                    }
                    pUU.EZpvd(c25852jIt2.getTAG(), "overview: " + stateListAnimator.EZpvd() + ", calendar: " + stateListAnimator.KWHzl() + ", ranking: " + stateListAnimator.copydefault());
                    if (!c25852jIt2.KWHzl && c25852jIt2.fARcdN().AhwBna() == FundingFeeType.FundingFee) {
                        c25852jIt2.djBIcL();
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (activity.collect(flowCollector, this) == objCopydefault) {
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
