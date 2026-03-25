package com.okinc.business.defi.wallet.home;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C13912dbY;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeContainerFragment$initView$3$onEvent$2$1$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.BooleanRef $isNeedUpdate;
    final /* synthetic */ ArrayList<Long> $localShowChainList;
    final /* synthetic */ ArrayList<Long> $newShowChainList;
    int label;
    final /* synthetic */ DefiHomeContainerFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeContainerFragment$initView$3$onEvent$2$1$1$2(ArrayList<Long> arrayList, DefiHomeContainerFragment defiHomeContainerFragment, ArrayList<Long> arrayList2, Ref.BooleanRef booleanRef, Continuation<? super DefiHomeContainerFragment$initView$3$onEvent$2$1$1$2> continuation) {
        super(2, continuation);
        this.$localShowChainList = arrayList;
        this.this$0 = defiHomeContainerFragment;
        this.$newShowChainList = arrayList2;
        this.$isNeedUpdate = booleanRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeContainerFragment$initView$3$onEvent$2$1$1$2(this.$localShowChainList, this.this$0, this.$newShowChainList, this.$isNeedUpdate, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeContainerFragment$initView$3$onEvent$2$1$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            C13912dbY.copydefault.AEQbTJ(this.$localShowChainList);
            this.this$0.OLrzqt((ArrayList<Long>) this.$newShowChainList, this.$isNeedUpdate.element);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
