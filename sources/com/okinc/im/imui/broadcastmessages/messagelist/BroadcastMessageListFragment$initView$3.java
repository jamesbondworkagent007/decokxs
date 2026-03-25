package com.okinc.im.imui.broadcastmessages.messagelist;

import com.okinc.okimcore.model.im.OKMessage;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C35428nvF;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class BroadcastMessageListFragment$initView$3 extends SuspendLambda implements Function2<Pair<? extends List<? extends OKMessage>, ? extends Boolean>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35428nvF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessageListFragment$initView$3(C35428nvF c35428nvF, Continuation<? super BroadcastMessageListFragment$initView$3> continuation) {
        super(2, continuation);
        this.this$0 = c35428nvF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BroadcastMessageListFragment$initView$3 broadcastMessageListFragment$initView$3 = new BroadcastMessageListFragment$initView$3(this.this$0, continuation);
        broadcastMessageListFragment$initView$3.L$0 = obj;
        return broadcastMessageListFragment$initView$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Pair<? extends List<? extends OKMessage>, ? extends Boolean> pair, Continuation<? super Unit> continuation) {
        return invoke2((Pair<? extends List<OKMessage>, Boolean>) pair, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Pair<? extends List<OKMessage>, Boolean> pair, Continuation<? super Unit> continuation) {
        return ((BroadcastMessageListFragment$initView$3) create(pair, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair pair = (Pair) this.L$0;
            this.this$0.AEQbTJ().AEQbTJ((List) pair.component1(), ((Boolean) pair.component2()).booleanValue());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
