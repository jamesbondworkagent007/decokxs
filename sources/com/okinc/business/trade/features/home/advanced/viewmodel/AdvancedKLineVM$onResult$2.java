package com.okinc.business.trade.features.home.advanced.viewmodel;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC28224kTm;
import o.C56391yDq;
import o.C56442yFn;
import o.oUO;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedKLineVM$onResult$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<oUO> $items;
    final /* synthetic */ String $origin;
    int label;
    final /* synthetic */ AdvancedKLineVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.oUO> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdvancedKLineVM$onResult$2(AdvancedKLineVM advancedKLineVM, List<? extends oUO> list, String str, Continuation<? super AdvancedKLineVM$onResult$2> continuation) {
        super(2, continuation);
        this.this$0 = advancedKLineVM;
        this.$items = list;
        this.$origin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedKLineVM$onResult$2(this.this$0, this.$items, this.$origin, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedKLineVM$onResult$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        this.this$0.copydefault.setValue(new AbstractC28224kTm.Application(this.$items, this.$origin));
        return Unit.INSTANCE;
    }
}
