package com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC58260yxt;
import o.C26543jeM;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9738bbJ;

/* JADX INFO: loaded from: classes23.dex */
public final class CheckReadOnlyWalletUseCase$invoke$2 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ C26543jeM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckReadOnlyWalletUseCase$invoke$2(C26543jeM c26543jeM, Continuation<? super CheckReadOnlyWalletUseCase$invoke$2> continuation) {
        super(1, continuation);
        this.this$0 = c26543jeM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheckReadOnlyWalletUseCase$invoke$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Boolean> continuation) {
        return ((CheckReadOnlyWalletUseCase$invoke$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtKWHzl = this.this$0.EZpvd.gEmmrt().KWHzl();
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtKWHzl, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return C56443yFo.KWHzl(((InterfaceC9738bbJ) obj).QfsBiF());
    }
}
