package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.AbstractC30503lcQ;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHQ;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$initApproveState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$initApproveState$2(AdvancedPlaceOrderVM advancedPlaceOrderVM, Continuation<? super AdvancedPlaceOrderVM$initApproveState$2> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedPlaceOrderVM$initApproveState$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedPlaceOrderVM$initApproveState$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Flow flowCombine = FlowKt.combine(this.this$0.AubY, this.this$0.djBIcL(), this.this$0.getFieldNames(), this.this$0.djBIcL, this.this$0.gEmmrt, new AnonymousClass1(null));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
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

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM$initApproveState$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements yHQ<AdvancedApproveState, AbstractC30503lcQ, AdvancedOrderType, Boolean, Boolean, Continuation<? super Pair<? extends Pair<? extends AdvancedApproveState, ? extends AbstractC30503lcQ>, ? extends Triple<? extends AdvancedOrderType, ? extends Boolean, ? extends Boolean>>>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ boolean Z$0;
        /* synthetic */ boolean Z$1;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(6, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Object invoke(AdvancedApproveState advancedApproveState, AbstractC30503lcQ abstractC30503lcQ, AdvancedOrderType advancedOrderType, boolean z, boolean z2, Continuation<? super Pair<? extends Pair<? extends AdvancedApproveState, ? extends AbstractC30503lcQ>, ? extends Triple<? extends AdvancedOrderType, Boolean, Boolean>>> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = advancedApproveState;
            anonymousClass1.L$1 = abstractC30503lcQ;
            anonymousClass1.L$2 = advancedOrderType;
            anonymousClass1.Z$0 = z;
            anonymousClass1.Z$1 = z2;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // o.yHQ
        public /* synthetic */ Object invoke(AdvancedApproveState advancedApproveState, AbstractC30503lcQ abstractC30503lcQ, AdvancedOrderType advancedOrderType, Boolean bool, Boolean bool2, Continuation<? super Pair<? extends Pair<? extends AdvancedApproveState, ? extends AbstractC30503lcQ>, ? extends Triple<? extends AdvancedOrderType, ? extends Boolean, ? extends Boolean>>> continuation) {
            return invoke(advancedApproveState, abstractC30503lcQ, advancedOrderType, bool.booleanValue(), bool2.booleanValue(), (Continuation<? super Pair<? extends Pair<? extends AdvancedApproveState, ? extends AbstractC30503lcQ>, ? extends Triple<? extends AdvancedOrderType, Boolean, Boolean>>>) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                return C56390yDp.OLrzqt(C56390yDp.OLrzqt((AdvancedApproveState) this.L$0, (AbstractC30503lcQ) this.L$1), new Triple((AdvancedOrderType) this.L$2, C56443yFo.KWHzl(this.Z$0), C56443yFo.KWHzl(this.Z$1)));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM$initApproveState$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Pair<? extends Pair<? extends AdvancedApproveState, ? extends AbstractC30503lcQ>, ? extends Triple<? extends AdvancedOrderType, ? extends Boolean, ? extends Boolean>>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AdvancedPlaceOrderVM this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AdvancedPlaceOrderVM advancedPlaceOrderVM, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = advancedPlaceOrderVM;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Pair<? extends Pair<? extends AdvancedApproveState, ? extends AbstractC30503lcQ>, ? extends Triple<? extends AdvancedOrderType, ? extends Boolean, ? extends Boolean>> pair, Continuation<? super Unit> continuation) {
            return invoke2((Pair<? extends Pair<? extends AdvancedApproveState, ? extends AbstractC30503lcQ>, ? extends Triple<? extends AdvancedOrderType, Boolean, Boolean>>) pair, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Pair<? extends Pair<? extends AdvancedApproveState, ? extends AbstractC30503lcQ>, ? extends Triple<? extends AdvancedOrderType, Boolean, Boolean>> pair, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                Pair pair = (Pair) this.L$0;
                Pair pair2 = (Pair) pair.component1();
                Triple triple = (Triple) pair.component2();
                AdvancedApproveState advancedApproveState = (AdvancedApproveState) pair2.component1();
                AbstractC30503lcQ abstractC30503lcQ = (AbstractC30503lcQ) pair2.component2();
                AdvancedOrderType advancedOrderType = (AdvancedOrderType) triple.component1();
                this.this$0.AYXKKw.setValue(C56443yFo.KWHzl(this.this$0.QfsBiF && ((Boolean) triple.component2()).booleanValue() && advancedApproveState == AdvancedApproveState.NEED_APPROVE && Intrinsics.EZpvd(abstractC30503lcQ, AbstractC30503lcQ.Activity.AEQbTJ) && advancedOrderType == AdvancedOrderType.MARKET && ((Boolean) triple.component3()).booleanValue()));
                this.this$0.copydefault("");
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
