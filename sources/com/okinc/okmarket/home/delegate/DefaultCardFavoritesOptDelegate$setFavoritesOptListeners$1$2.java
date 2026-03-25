package com.okinc.okmarket.home.delegate;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o.C46600taI;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;
import o.InterfaceC55797xqi;

/* JADX INFO: loaded from: classes10.dex */
public final class DefaultCardFavoritesOptDelegate$setFavoritesOptListeners$1$2 extends SuspendLambda implements Function2<InterfaceC49371unL<? extends Pair<? extends String, ? extends InterfaceC55797xqi>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C46600taI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultCardFavoritesOptDelegate$setFavoritesOptListeners$1$2(C46600taI c46600taI, Continuation<? super DefaultCardFavoritesOptDelegate$setFavoritesOptListeners$1$2> continuation) {
        super(2, continuation);
        this.this$0 = c46600taI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultCardFavoritesOptDelegate$setFavoritesOptListeners$1$2 defaultCardFavoritesOptDelegate$setFavoritesOptListeners$1$2 = new DefaultCardFavoritesOptDelegate$setFavoritesOptListeners$1$2(this.this$0, continuation);
        defaultCardFavoritesOptDelegate$setFavoritesOptListeners$1$2.L$0 = obj;
        return defaultCardFavoritesOptDelegate$setFavoritesOptListeners$1$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC49371unL<? extends Pair<? extends String, ? extends InterfaceC55797xqi>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return invoke2((InterfaceC49371unL<? extends Pair<String, ? extends InterfaceC55797xqi>>) interfaceC49371unL, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC49371unL<? extends Pair<String, ? extends InterfaceC55797xqi>> interfaceC49371unL, Continuation<? super Unit> continuation) {
        return ((DefaultCardFavoritesOptDelegate$setFavoritesOptListeners$1$2) create(interfaceC49371unL, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.copydefault((InterfaceC49371unL) this.L$0);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
