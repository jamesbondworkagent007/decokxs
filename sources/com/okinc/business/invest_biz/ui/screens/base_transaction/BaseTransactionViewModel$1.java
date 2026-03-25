package com.okinc.business.invest_biz.ui.screens.base_transaction;

import com.okinc.business.invest_biz.data.models.InitialInfoModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC24170iXm;
import o.C56391yDq;
import o.C56442yFn;
import o.iXB;
import o.yHO;

/* JADX INFO: loaded from: classes6.dex */
public final class BaseTransactionViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AbstractC24170iXm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTransactionViewModel$1(AbstractC24170iXm abstractC24170iXm, Continuation<? super BaseTransactionViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = abstractC24170iXm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseTransactionViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseTransactionViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionViewModel$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHO<InitialInfoModel, iXB, Continuation<? super Pair<? extends InitialInfoModel, ? extends iXB>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InitialInfoModel initialInfoModel, iXB ixb, Continuation<? super Pair<? extends InitialInfoModel, iXB>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = initialInfoModel;
            anonymousClass1.L$1 = ixb;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHO
        public /* bridge */ /* synthetic */ Object invoke(InitialInfoModel initialInfoModel, iXB ixb, Continuation<? super Pair<? extends InitialInfoModel, ? extends iXB>> continuation) {
            return invoke2(initialInfoModel, ixb, (Continuation<? super Pair<? extends InitialInfoModel, iXB>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return new Pair((InitialInfoModel) this.L$0, (iXB) this.L$1);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowCombine = FlowKt.combine(this.this$0.KWHzl, this.this$0.AhwBna, new AnonymousClass1(null));
            final AbstractC24170iXm abstractC24170iXm = this.this$0;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionViewModel$1.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public final Object emit(Pair<? extends InitialInfoModel, iXB> pair, Continuation<? super Unit> continuation) {
                    InitialInfoModel initialInfoModelComponent1 = pair.component1();
                    iXB ixbComponent2 = pair.component2();
                    if (initialInfoModelComponent1 != null) {
                        iXB ixbAEQbTJ = abstractC24170iXm.AEQbTJ(initialInfoModelComponent1);
                        if (ixbAEQbTJ != null) {
                            Object objEmit = abstractC24170iXm.AhwBna.emit(ixbAEQbTJ, continuation);
                            return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
                        }
                        Object objReloadContent$default = AbstractC24170iXm.reloadContent$default(abstractC24170iXm, initialInfoModelComponent1, ixbComponent2, null, null, continuation, 12, null);
                        return objReloadContent$default == C56442yFn.copydefault() ? objReloadContent$default : Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowCombine.collect(flowCollector, this) == objCopydefault) {
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
