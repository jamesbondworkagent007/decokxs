package com.okinc.planet.biz_positions;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.AbstractC46197tLk;
import o.C46043tFs;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC46072tGu;

/* JADX INFO: loaded from: classes19.dex */
public final class ProfilePositionsFragment$initView$2$3 extends SuspendLambda implements Function2<AbstractC46197tLk<? extends List<? extends InterfaceC46072tGu.Activity>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C46043tFs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePositionsFragment$initView$2$3(C46043tFs c46043tFs, Continuation<? super ProfilePositionsFragment$initView$2$3> continuation) {
        super(2, continuation);
        this.this$0 = c46043tFs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfilePositionsFragment$initView$2$3 profilePositionsFragment$initView$2$3 = new ProfilePositionsFragment$initView$2$3(this.this$0, continuation);
        profilePositionsFragment$initView$2$3.L$0 = obj;
        return profilePositionsFragment$initView$2$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(AbstractC46197tLk<? extends List<? extends InterfaceC46072tGu.Activity>> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return invoke2((AbstractC46197tLk<? extends List<InterfaceC46072tGu.Activity>>) abstractC46197tLk, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AbstractC46197tLk<? extends List<InterfaceC46072tGu.Activity>> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return ((ProfilePositionsFragment$initView$2$3) create(abstractC46197tLk, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC46197tLk abstractC46197tLk = (AbstractC46197tLk) this.L$0;
            Function1 function1 = this.this$0.AYXKKw;
            if (function1 != null) {
                List list = (List) abstractC46197tLk.copydefault();
                function1.invoke(list != null ? C56443yFo.AEQbTJ(list.size()) : null);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
