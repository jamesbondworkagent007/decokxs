package com.okinc.business.defi.wallet;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C14494dmX;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiWalletMainActivity$trackBottomNavigationClickEvents$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $buttonName;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMainActivity$trackBottomNavigationClickEvents$2$1(String str, Continuation<? super DefiWalletMainActivity$trackBottomNavigationClickEvents$2$1> continuation) {
        super(2, continuation);
        this.$buttonName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletMainActivity$trackBottomNavigationClickEvents$2$1(this.$buttonName, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletMainActivity$trackBottomNavigationClickEvents$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C14494dmX c14494dmX = C14494dmX.KWHzl;
            String str = this.$buttonName;
            this.label = 1;
            if (c14494dmX.OLrzqt((15 & 1) != 0 ? false : false, (15 & 2) != 0 ? false : false, (15 & 4) != 0 ? null : null, (15 & 8) != 0 ? null : null, (15 & 16) != 0 ? null : str, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
