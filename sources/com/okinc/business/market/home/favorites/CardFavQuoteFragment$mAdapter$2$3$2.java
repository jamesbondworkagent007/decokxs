package com.okinc.business.market.home.favorites;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27811kEe;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27809kEc;
import o.kDF;

/* JADX INFO: loaded from: classes7.dex */
public final class CardFavQuoteFragment$mAdapter$2$3$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ kDF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardFavQuoteFragment$mAdapter$2$3$2(kDF kdf, Continuation<? super CardFavQuoteFragment$mAdapter$2$3$2> continuation) {
        super(2, continuation);
        this.this$0 = kdf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardFavQuoteFragment$mAdapter$2$3$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CardFavQuoteFragment$mAdapter$2$3$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC27809kEc interfaceC27809kEcAEQbTJ;
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            interfaceC27809kEcAEQbTJ = C27811kEe.AEQbTJ(this.this$0);
            if (interfaceC27809kEcAEQbTJ != null) {
                kDF kdf = this.this$0;
                this.L$0 = interfaceC27809kEcAEQbTJ;
                this.L$1 = "favorites";
                this.label = 1;
                obj = kdf.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                str = "favorites";
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) this.L$1;
        interfaceC27809kEcAEQbTJ = (InterfaceC27809kEc) this.L$0;
        C56391yDq.AEQbTJ(obj);
        interfaceC27809kEcAEQbTJ.copydefault(str, (String) obj);
        return Unit.INSTANCE;
    }
}
