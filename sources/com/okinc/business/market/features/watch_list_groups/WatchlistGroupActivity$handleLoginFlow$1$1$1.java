package com.okinc.business.market.features.watch_list_groups;

import android.os.Bundle;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.kBV;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchlistGroupActivity$handleLoginFlow$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bundle $bundle;
    final /* synthetic */ Function0<Unit> $onPostLogin;
    int label;
    final /* synthetic */ kBV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistGroupActivity$handleLoginFlow$1$1$1(kBV kbv, Bundle bundle, Function0<Unit> function0, Continuation<? super WatchlistGroupActivity$handleLoginFlow$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = kbv;
        this.$bundle = bundle;
        this.$onPostLogin = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchlistGroupActivity$handleLoginFlow$1$1$1(this.this$0, this.$bundle, this.$onPostLogin, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchlistGroupActivity$handleLoginFlow$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            WatchlistJwtViewModel watchlistJwtViewModelDjBIcL = this.this$0.djBIcL();
            Bundle bundle = this.$bundle;
            this.label = 1;
            objOLrzqt = watchlistJwtViewModelDjBIcL.OLrzqt(bundle, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        Boolean boolKWHzl = C56443yFo.KWHzl(false);
        if (Result.m7383isFailureimpl(objOLrzqt)) {
            objOLrzqt = boolKWHzl;
        }
        if (((Boolean) objOLrzqt).booleanValue()) {
            this.$onPostLogin.invoke();
        }
        return Unit.INSTANCE;
    }
}
