package com.okinc.business.market.features.favorites.editing.ui;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import o.C26168jUl;
import o.C42683raz;
import o.C56391yDq;
import o.C56442yFn;
import o.jSN;

/* JADX INFO: loaded from: classes6.dex */
public final class MarketFavoritesCryptosEditActivity$showGuidingCoachMark$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ jSN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavoritesCryptosEditActivity$showGuidingCoachMark$1(jSN jsn, Continuation<? super MarketFavoritesCryptosEditActivity$showGuidingCoachMark$1> continuation) {
        super(2, continuation);
        this.this$0 = jsn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarketFavoritesCryptosEditActivity$showGuidingCoachMark$1 marketFavoritesCryptosEditActivity$showGuidingCoachMark$1 = new MarketFavoritesCryptosEditActivity$showGuidingCoachMark$1(this.this$0, continuation);
        marketFavoritesCryptosEditActivity$showGuidingCoachMark$1.L$0 = obj;
        return marketFavoritesCryptosEditActivity$showGuidingCoachMark$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketFavoritesCryptosEditActivity$showGuidingCoachMark$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            this.L$0 = coroutineScope2;
            this.label = 1;
            if (DelayKt.delay(150L, this) == objCopydefault) {
                return objCopydefault;
            }
            coroutineScope = coroutineScope2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (CoroutineScopeKt.isActive(coroutineScope)) {
            C26168jUl c26168jUl = C26168jUl.AEQbTJ;
            jSN jsn = this.this$0;
            C42683raz c42683raz = jsn.valueOf;
            if (c42683raz == null) {
                return Unit.INSTANCE;
            }
            c26168jUl.AEQbTJ(jsn, c42683raz);
        }
        return Unit.INSTANCE;
    }
}
