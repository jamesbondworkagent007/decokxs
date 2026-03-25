package com.okinc.business.trade.features.home.advanced.usecase;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28196kSl;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9738bbJ;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedWalletUseCase$getMainWallet$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC9738bbJ>, Object> {
    int label;
    final /* synthetic */ C28196kSl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedWalletUseCase$getMainWallet$2(C28196kSl c28196kSl, Continuation<? super AdvancedWalletUseCase$getMainWallet$2> continuation) {
        super(2, continuation);
        this.this$0 = c28196kSl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedWalletUseCase$getMainWallet$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC9738bbJ> continuation) {
        return ((AdvancedWalletUseCase$getMainWallet$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        return this.this$0.OLrzqt.EZpvd();
    }
}
