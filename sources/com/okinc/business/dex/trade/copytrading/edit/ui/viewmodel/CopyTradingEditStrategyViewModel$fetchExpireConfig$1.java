package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import com.okinc.business.dex.trade.common.expire.model.ExpireTimeData;
import com.okinc.business.dex.trade.copytrading.strategyinfo.domain.model.CopyTradeDetail;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C19876gSp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class CopyTradingEditStrategyViewModel$fetchExpireConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CopyTradingEditStrategyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyViewModel$fetchExpireConfig$1(CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel, Continuation<? super CopyTradingEditStrategyViewModel$fetchExpireConfig$1> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingEditStrategyViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingEditStrategyViewModel$fetchExpireConfig$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingEditStrategyViewModel$fetchExpireConfig$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class StateListAnimator implements Flow<CopyTradeDetail> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel.CopyTradingEditStrategyViewModel$fetchExpireConfig$1$StateListAnimator$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                CopyTradingEditStrategyViewModel$fetchExpireConfig$1$invokeSuspend$$inlined$mapNotNull$1$2$1 copyTradingEditStrategyViewModel$fetchExpireConfig$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
                if (continuation instanceof CopyTradingEditStrategyViewModel$fetchExpireConfig$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
                    copyTradingEditStrategyViewModel$fetchExpireConfig$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (CopyTradingEditStrategyViewModel$fetchExpireConfig$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
                    int i = copyTradingEditStrategyViewModel$fetchExpireConfig$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        copyTradingEditStrategyViewModel$fetchExpireConfig$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        copyTradingEditStrategyViewModel$fetchExpireConfig$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new CopyTradingEditStrategyViewModel$fetchExpireConfig$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                Object obj2 = copyTradingEditStrategyViewModel$fetchExpireConfig$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = copyTradingEditStrategyViewModel$fetchExpireConfig$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    Result result = (Result) obj;
                    if (result != null) {
                        Object objM7386unboximpl = result.m7386unboximpl();
                        obj = (CopyTradeDetail) (Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
                    }
                    if (obj != null) {
                        copyTradingEditStrategyViewModel$fetchExpireConfig$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                        if (flowCollector.emit(obj, copyTradingEditStrategyViewModel$fetchExpireConfig$1$invokeSuspend$$inlined$mapNotNull$1$2$1) == objCopydefault) {
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
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super CopyTradeDetail> flowCollector, Continuation continuation) {
            Object objCollect = this.copydefault.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C19876gSp c19876gSp;
        CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel;
        CopyTradeDetail copyTradeDetail;
        CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModel3 = this.this$0;
            c19876gSp = copyTradingEditStrategyViewModel3.iwGUEr;
            StateFlow stateFlow = this.this$0.AkhnZx;
            if (stateFlow == null) {
                copyTradingEditStrategyViewModel = copyTradingEditStrategyViewModel3;
                copyTradeDetail = null;
                boolean zUzCIH = this.this$0.uzCIH();
                this.L$0 = copyTradingEditStrategyViewModel;
                this.L$1 = null;
                this.label = 2;
                obj = c19876gSp.OLrzqt(copyTradeDetail, zUzCIH, this);
                if (obj != objCopydefault) {
                    return objCopydefault;
                }
                copyTradingEditStrategyViewModel2 = copyTradingEditStrategyViewModel;
                copyTradingEditStrategyViewModel2.EZpvd((ExpireTimeData) obj);
                return Unit.INSTANCE;
            }
            StateListAnimator stateListAnimator = new StateListAnimator(stateFlow);
            this.L$0 = copyTradingEditStrategyViewModel3;
            this.L$1 = c19876gSp;
            this.label = 1;
            Object objFirst = FlowKt.first(stateListAnimator, this);
            if (objFirst == objCopydefault) {
                return objCopydefault;
            }
            copyTradingEditStrategyViewModel = copyTradingEditStrategyViewModel3;
            obj = objFirst;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                copyTradingEditStrategyViewModel2 = (CopyTradingEditStrategyViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                copyTradingEditStrategyViewModel2.EZpvd((ExpireTimeData) obj);
                return Unit.INSTANCE;
            }
            c19876gSp = (C19876gSp) this.L$1;
            copyTradingEditStrategyViewModel = (CopyTradingEditStrategyViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        copyTradeDetail = (CopyTradeDetail) obj;
        boolean zUzCIH2 = this.this$0.uzCIH();
        this.L$0 = copyTradingEditStrategyViewModel;
        this.L$1 = null;
        this.label = 2;
        obj = c19876gSp.OLrzqt(copyTradeDetail, zUzCIH2, this);
        if (obj != objCopydefault) {
        }
    }
}
