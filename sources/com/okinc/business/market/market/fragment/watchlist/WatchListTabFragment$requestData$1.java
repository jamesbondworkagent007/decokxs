package com.okinc.business.market.market.fragment.watchlist;

import androidx.lifecycle.MutableLiveData;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C55629xnZ;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54577xNn;
import o.kIY;
import o.pWO;
import o.xTS;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchListTabFragment$requestData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ kIY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WatchListTabFragment$requestData$1(kIY kiy, Continuation<? super WatchListTabFragment$requestData$1> continuation) {
        super(2, continuation);
        this.this$0 = kiy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WatchListTabFragment$requestData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WatchListTabFragment$requestData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableLiveData mutableLiveData;
        kIY kiy;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kIY kiy2 = this.this$0;
            mutableLiveData = new MutableLiveData();
            kIY kiy3 = this.this$0;
            mutableLiveData.observe(kiy3, kiy3.zLjUOn);
            InterfaceC54577xNn interfaceC54577xNnKWHzl = pWO.KWHzl();
            xTS xts = kiy3.ejfBZ;
            Function1<WatchListData, Boolean> function1AuCTel = kiy3.AuCTel();
            this.L$0 = mutableLiveData;
            this.L$1 = kiy2;
            this.label = 1;
            if (C55629xnZ.EZpvd(interfaceC54577xNnKWHzl, kiy3, mutableLiveData, xts, function1AuCTel, this) == objCopydefault) {
                return objCopydefault;
            }
            kiy = kiy2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kiy = (kIY) this.L$1;
            mutableLiveData = (MutableLiveData) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        kiy.getFieldNames = mutableLiveData;
        return Unit.INSTANCE;
    }
}
