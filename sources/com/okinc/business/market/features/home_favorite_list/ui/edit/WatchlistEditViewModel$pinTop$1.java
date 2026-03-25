package com.okinc.business.market.features.home_favorite_list.ui.edit;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC28464kbK;
import o.C28416kaP;
import o.C28422kaV;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchlistEditViewModel$pinTop$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $groupId;
    final /* synthetic */ C28422kaV $token;
    int label;
    final /* synthetic */ WatchlistEditViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchlistEditViewModel$pinTop$1(WatchlistEditViewModel watchlistEditViewModel, C28422kaV c28422kaV, int i, Continuation<? super WatchlistEditViewModel$pinTop$1> continuation) {
        super(2, continuation);
        this.this$0 = watchlistEditViewModel;
        this.$token = c28422kaV;
        this.$groupId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchlistEditViewModel$pinTop$1(this.this$0, this.$token, this.$groupId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchlistEditViewModel$pinTop$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.KWHzl();
            C28416kaP c28416kaP = this.this$0.AYXKKw;
            String strEZpvd = this.$token.EZpvd();
            String strAkhnZx = this.$token.AkhnZx();
            int i2 = this.$groupId;
            this.label = 1;
            objEZpvd = c28416kaP.EZpvd(strEZpvd, strAkhnZx, i2, this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        WatchlistEditViewModel watchlistEditViewModel = this.this$0;
        C28422kaV c28422kaV = this.$token;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            if (!((Boolean) objEZpvd).booleanValue()) {
                watchlistEditViewModel.EZpvd.setValue(AbstractC28464kbK.Application.KWHzl);
            } else {
                watchlistEditViewModel.OLrzqt(c28422kaV);
            }
            watchlistEditViewModel.OLrzqt();
        }
        WatchlistEditViewModel watchlistEditViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objEZpvd) != null) {
            watchlistEditViewModel2.EZpvd.setValue(AbstractC28464kbK.Application.KWHzl);
            watchlistEditViewModel2.OLrzqt();
        }
        return Unit.INSTANCE;
    }
}
