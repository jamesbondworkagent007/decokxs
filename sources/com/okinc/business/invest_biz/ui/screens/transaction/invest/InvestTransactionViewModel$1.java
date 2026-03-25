package com.okinc.business.invest_biz.ui.screens.transaction.invest;

import android.os.Bundle;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestTransactionModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C26661jgY;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC26680jgr;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestTransactionViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C26661jgY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestTransactionViewModel$1(C26661jgY c26661jgY, Continuation<? super InvestTransactionViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = c26661jgY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestTransactionViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestTransactionViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class TaskDescription implements Flow<InvestTransactionModel> {
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ C26661jgY copydefault;

        /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestTransactionViewModel$1$TaskDescription$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ C26661jgY EZpvd;
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, C26661jgY c26661jgY) {
                this.OLrzqt = flowCollector;
                this.EZpvd = c26661jgY;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                InvestTransactionViewModel$1$invokeSuspend$$inlined$filter$1$2$1 investTransactionViewModel$1$invokeSuspend$$inlined$filter$1$2$1;
                if (continuation instanceof InvestTransactionViewModel$1$invokeSuspend$$inlined$filter$1$2$1) {
                    investTransactionViewModel$1$invokeSuspend$$inlined$filter$1$2$1 = (InvestTransactionViewModel$1$invokeSuspend$$inlined$filter$1$2$1) continuation;
                    int i = investTransactionViewModel$1$invokeSuspend$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        investTransactionViewModel$1$invokeSuspend$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        investTransactionViewModel$1$invokeSuspend$$inlined$filter$1$2$1 = new InvestTransactionViewModel$1$invokeSuspend$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                Object obj2 = investTransactionViewModel$1$invokeSuspend$$inlined$filter$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = investTransactionViewModel$1$invokeSuspend$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    InvestTransactionModel investTransactionModel = (InvestTransactionModel) obj;
                    String txId = investTransactionModel.getTxId();
                    Bundle bundleAEQbTJ = this.EZpvd.QKVWgx.AEQbTJ();
                    if (Intrinsics.EZpvd((Object) txId, (Object) (bundleAEQbTJ != null ? bundleAEQbTJ.getString("tx_id") : null)) && C26661jgY.Companion.AEQbTJ(investTransactionModel.getPushToastCode())) {
                        investTransactionViewModel$1$invokeSuspend$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, investTransactionViewModel$1$invokeSuspend$$inlined$filter$1$2$1) == objCopydefault) {
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

        public TaskDescription(Flow flow, C26661jgY c26661jgY) {
            this.EZpvd = flow;
            this.copydefault = c26661jgY;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super InvestTransactionModel> flowCollector, Continuation continuation) {
            Object objCollect = this.EZpvd.collect(new AnonymousClass5(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            TaskDescription taskDescription = new TaskDescription(this.this$0.OcIXYQ.AEQbTJ(), this.this$0);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(taskDescription, anonymousClass2, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.screens.transaction.invest.InvestTransactionViewModel$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<InvestTransactionModel, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C26661jgY this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C26661jgY c26661jgY, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = c26661jgY;
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
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.EZpvd(InterfaceC26680jgr.Application.copydefault);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
