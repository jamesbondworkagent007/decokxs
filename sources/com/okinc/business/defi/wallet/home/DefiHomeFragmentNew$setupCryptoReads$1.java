package com.okinc.business.defi.wallet.home;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C15572eNh;
import o.C18037fao;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC18036fan;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeFragmentNew$setupCryptoReads$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C18037fao $adapter;
    int label;
    final /* synthetic */ C15572eNh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeFragmentNew$setupCryptoReads$1(C15572eNh c15572eNh, C18037fao c18037fao, Continuation<? super DefiHomeFragmentNew$setupCryptoReads$1> continuation) {
        super(2, continuation);
        this.this$0 = c15572eNh;
        this.$adapter = c18037fao;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeFragmentNew$setupCryptoReads$1(this.this$0, this.$adapter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeFragmentNew$setupCryptoReads$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<List<InterfaceC18036fan>> stateFlowKWHzl = this.this$0.hDKMBd().KWHzl();
            final C18037fao c18037fao = this.$adapter;
            FlowCollector<? super List<InterfaceC18036fan>> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$setupCryptoReads$1.2
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(List<? extends InterfaceC18036fan> list, Continuation<? super Unit> continuation) {
                    c18037fao.submitList(list);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowKWHzl.collect(flowCollector, this) == objCopydefault) {
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
