package com.okinc.business.invest_biz.ui.screens.base_transaction;

import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC24170iXm;
import o.C24177iXt;
import o.C24181iXx;
import o.C25481ixY;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC24182iXy;
import o.iXC;

/* JADX INFO: loaded from: classes6.dex */
public final class BaseTransactionViewModel$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AbstractC24170iXm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTransactionViewModel$2(AbstractC24170iXm abstractC24170iXm, Continuation<? super BaseTransactionViewModel$2> continuation) {
        super(2, continuation);
        this.this$0 = abstractC24170iXm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseTransactionViewModel$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseTransactionViewModel$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.invest_biz.ui.screens.base_transaction.BaseTransactionViewModel$2$4, reason: invalid class name */
    public static final class AnonymousClass4<T> implements FlowCollector {
        public final /* synthetic */ AbstractC24170iXm EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(AbstractC24170iXm abstractC24170iXm) {
            this.EZpvd = abstractC24170iXm;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(InterfaceC24182iXy interfaceC24182iXy, Continuation<? super Unit> continuation) throws Throwable {
            BaseTransactionViewModel$2$1$emit$1 baseTransactionViewModel$2$1$emit$1;
            iXC ixcAEQbTJ;
            AnonymousClass4<T> anonymousClass4;
            if (continuation instanceof BaseTransactionViewModel$2$1$emit$1) {
                baseTransactionViewModel$2$1$emit$1 = (BaseTransactionViewModel$2$1$emit$1) continuation;
                int i = baseTransactionViewModel$2$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    baseTransactionViewModel$2$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    baseTransactionViewModel$2$1$emit$1 = new BaseTransactionViewModel$2$1$emit$1(this, continuation);
                }
            }
            Object obj = baseTransactionViewModel$2$1$emit$1.result;
            Object objCopydefault = C56442yFn.copydefault();
            int i2 = baseTransactionViewModel$2$1$emit$1.label;
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                ixcAEQbTJ = C24181iXx.AEQbTJ(interfaceC24182iXy);
                if (ixcAEQbTJ == null) {
                    return Unit.INSTANCE;
                }
                this.EZpvd.EZpvd(ixcAEQbTJ.AhwBna());
                AbstractC24170iXm abstractC24170iXm = this.EZpvd;
                C24177iXt c24177iXtKWHzl = ixcAEQbTJ.KWHzl();
                List<TransactionStep> listFetchVPNInfo = ixcAEQbTJ.fetchVPNInfo();
                TransactionStage transactionStageDbNXlk = ixcAEQbTJ.DbNXlk();
                baseTransactionViewModel$2$1$emit$1.L$0 = this;
                baseTransactionViewModel$2$1$emit$1.L$1 = ixcAEQbTJ;
                baseTransactionViewModel$2$1$emit$1.label = 1;
                if (abstractC24170iXm.copydefault(c24177iXtKWHzl, listFetchVPNInfo, transactionStageDbNXlk, baseTransactionViewModel$2$1$emit$1) == objCopydefault) {
                    return objCopydefault;
                }
                anonymousClass4 = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                ixcAEQbTJ = (iXC) baseTransactionViewModel$2$1$emit$1.L$1;
                anonymousClass4 = (AnonymousClass4) baseTransactionViewModel$2$1$emit$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            MutableStateFlow mutableStateFlow = anonymousClass4.EZpvd.gEmmrt;
            C25481ixY c25481ixYAYXKKw = ixcAEQbTJ.AYXKKw();
            baseTransactionViewModel$2$1$emit$1.L$0 = null;
            baseTransactionViewModel$2$1$emit$1.L$1 = null;
            baseTransactionViewModel$2$1$emit$1.label = 2;
            if (mutableStateFlow.emit(c25481ixYAYXKKw, baseTransactionViewModel$2$1$emit$1) == objCopydefault) {
                return objCopydefault;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.copydefault;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0);
            this.label = 1;
            if (mutableStateFlow.collect(anonymousClass4, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
