package com.okinc.business.defi.wallet.history.viewmodel;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C15504eKu;
import o.C15505eKv;
import o.C15516eLf;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class TypesSelectViewModel$getTradeTypes$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C15516eLf this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypesSelectViewModel$getTradeTypes$1(C15516eLf c15516eLf, Continuation<? super TypesSelectViewModel$getTradeTypes$1> continuation) {
        super(2, continuation);
        this.this$0 = c15516eLf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TypesSelectViewModel$getTradeTypes$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TypesSelectViewModel$getTradeTypes$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C15504eKu c15504eKu = this.this$0.valueOf;
            this.label = 1;
            obj = c15504eKu.copydefault(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List list = (List) obj;
        MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, list));
        if (this.this$0.KWHzl.getValue() == null) {
            C15505eKv c15505eKv = (C15505eKv) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (c15505eKv != null) {
                c15505eKv.AEQbTJ(true);
            }
            this.this$0.copydefault = c15505eKv;
            MutableStateFlow mutableStateFlow2 = this.this$0.KWHzl;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, c15505eKv));
        }
        return Unit.INSTANCE;
    }
}
