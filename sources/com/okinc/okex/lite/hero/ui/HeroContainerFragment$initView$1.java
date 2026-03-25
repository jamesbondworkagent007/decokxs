package com.okinc.okex.lite.hero.ui;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C45729svl;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC45740svw;
import o.yHO;

/* JADX INFO: loaded from: classes10.dex */
public final class HeroContainerFragment$initView$1 extends SuspendLambda implements yHO<CoroutineScope, InterfaceC45740svw, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C45729svl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeroContainerFragment$initView$1(C45729svl c45729svl, Continuation<? super HeroContainerFragment$initView$1> continuation) {
        super(3, continuation);
        this.this$0 = c45729svl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(CoroutineScope coroutineScope, InterfaceC45740svw interfaceC45740svw, Continuation<? super Unit> continuation) {
        HeroContainerFragment$initView$1 heroContainerFragment$initView$1 = new HeroContainerFragment$initView$1(this.this$0, continuation);
        heroContainerFragment$initView$1.L$0 = interfaceC45740svw;
        return heroContainerFragment$initView$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC45740svw interfaceC45740svw = (InterfaceC45740svw) this.L$0;
            if (!Intrinsics.EZpvd(interfaceC45740svw, InterfaceC45740svw.Application.EZpvd)) {
                if (interfaceC45740svw instanceof InterfaceC45740svw.Activity) {
                    this.this$0.AEQbTJ(((InterfaceC45740svw.Activity) interfaceC45740svw).OLrzqt());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
