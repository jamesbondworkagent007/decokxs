package com.okinc.im.imui.broadcastmessages.messagelist;

import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C35254nrp;
import o.C35428nvF;
import o.C37005olf;
import o.C56391yDq;
import o.C56442yFn;
import o.rVN;

/* JADX INFO: loaded from: classes15.dex */
public final class BroadcastMessageListFragment$initView$7 extends SuspendLambda implements Function2<List<C35254nrp>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C35428nvF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastMessageListFragment$initView$7(C35428nvF c35428nvF, Continuation<? super BroadcastMessageListFragment$initView$7> continuation) {
        super(2, continuation);
        this.this$0 = c35428nvF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BroadcastMessageListFragment$initView$7 broadcastMessageListFragment$initView$7 = new BroadcastMessageListFragment$initView$7(this.this$0, continuation);
        broadcastMessageListFragment$initView$7.L$0 = obj;
        return broadcastMessageListFragment$initView$7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<C35254nrp> list, Continuation<? super Unit> continuation) {
        return ((BroadcastMessageListFragment$initView$7) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            C37005olf c37005olf = this.this$0.copydefault;
            if (c37005olf != null) {
                c37005olf.submitList(list);
            }
            rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
