package com.okinc.im.imui.messageV2.view.banner.joincall;

import com.okinc.okimcore.model.other.GroupInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C35233nrU;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHO;

/* JADX INFO: loaded from: classes16.dex */
public final class JoinOnGoingCallFragment$initObserver$1 extends SuspendLambda implements yHO<GroupInfo, C35233nrU, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ JoinOnGoingCallFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JoinOnGoingCallFragment$initObserver$1(JoinOnGoingCallFragment joinOnGoingCallFragment, Continuation<? super JoinOnGoingCallFragment$initObserver$1> continuation) {
        super(3, continuation);
        this.this$0 = joinOnGoingCallFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(GroupInfo groupInfo, C35233nrU c35233nrU, Continuation<? super Boolean> continuation) {
        JoinOnGoingCallFragment$initObserver$1 joinOnGoingCallFragment$initObserver$1 = new JoinOnGoingCallFragment$initObserver$1(this.this$0, continuation);
        joinOnGoingCallFragment$initObserver$1.L$0 = groupInfo;
        joinOnGoingCallFragment$initObserver$1.L$1 = c35233nrU;
        return joinOnGoingCallFragment$initObserver$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            return C56443yFo.KWHzl(this.this$0.KWHzl((GroupInfo) this.L$0, (C35233nrU) this.L$1));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
