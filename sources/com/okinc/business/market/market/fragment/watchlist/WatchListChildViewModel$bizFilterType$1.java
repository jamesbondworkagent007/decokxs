package com.okinc.business.market.market.fragment.watchlist;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.kIJ;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchListChildViewModel$bizFilterType$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ kIJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchListChildViewModel$bizFilterType$1(kIJ kij, Continuation<? super WatchListChildViewModel$bizFilterType$1> continuation) {
        super(2, continuation);
        this.this$0 = kij;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchListChildViewModel$bizFilterType$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchListChildViewModel$bizFilterType$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kIJ kij = this.this$0;
            AnonymousClass1 anonymousClass1 = new MutablePropertyReference1Impl() { // from class: com.okinc.business.market.market.fragment.watchlist.WatchListChildViewModel$bizFilterType$1.1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj2) {
                    return ((kIJ.StateListAnimator) obj2).EZpvd();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj2, Object obj3) {
                    ((kIJ.StateListAnimator) obj2).OLrzqt((String) obj3);
                }
            };
            String str = kij.OLrzqt;
            this.label = 1;
            if (kij.KWHzl(anonymousClass1, str, this) == objCopydefault) {
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
