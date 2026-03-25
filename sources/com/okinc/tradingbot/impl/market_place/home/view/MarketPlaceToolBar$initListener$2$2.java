package com.okinc.tradingbot.impl.market_place.home.view;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C51623vqX;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.uCA;

/* JADX INFO: loaded from: classes11.dex */
public final class MarketPlaceToolBar$initListener$2$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C51623vqX this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketPlaceToolBar$initListener$2$2(C51623vqX c51623vqX, Continuation<? super MarketPlaceToolBar$initListener$2$2> continuation) {
        super(2, continuation);
        this.this$0 = c51623vqX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketPlaceToolBar$initListener$2$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketPlaceToolBar$initListener$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                uCA uca = uCA.KWHzl;
                this.label = 1;
                if (uca.AEQbTJ(false, "trade/main/strategy", this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Context context = this.this$0.getContext();
            Intrinsics.copydefault(context, "");
            ((AbstractActivityC33041mov) context).dismissLoading();
            pUU.KWHzl("systemChange", "setOnRealChangeClick false");
        } catch (Exception unused) {
            Context context2 = this.this$0.getContext();
            Intrinsics.copydefault(context2, "");
            ((AbstractActivityC33041mov) context2).dismissLoading();
        }
        return Unit.INSTANCE;
    }
}
