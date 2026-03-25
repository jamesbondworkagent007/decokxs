package com.okinc.okmarket.home;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27811kEe;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC27809kEc;

/* JADX INFO: loaded from: classes10.dex */
public final class CardQuoteFragment$addTabClickEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $position;
    Object L$0;
    int label;
    final /* synthetic */ CardQuoteFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardQuoteFragment$addTabClickEvent$1(CardQuoteFragment cardQuoteFragment, int i, Continuation<? super CardQuoteFragment$addTabClickEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = cardQuoteFragment;
        this.$position = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardQuoteFragment$addTabClickEvent$1(this.this$0, this.$position, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CardQuoteFragment$addTabClickEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String strEZpvd = this.this$0.EZpvd(this.$position);
            CardQuoteFragment cardQuoteFragment = this.this$0;
            int i2 = this.$position;
            this.L$0 = strEZpvd;
            this.label = 1;
            Object objAEQbTJ = cardQuoteFragment.AEQbTJ(i2, (Continuation<? super String>) this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            str = strEZpvd;
            obj = objAEQbTJ;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        String str2 = (String) obj;
        InterfaceC27809kEc interfaceC27809kEcAEQbTJ = C27811kEe.AEQbTJ(this.this$0);
        if (interfaceC27809kEcAEQbTJ != null) {
            interfaceC27809kEcAEQbTJ.EZpvd(str, str2);
        }
        return Unit.INSTANCE;
    }
}
