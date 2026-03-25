package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import com.okinc.business.dex.trade.common.expire.model.ExpireTimeConfig;
import com.okinc.business.dexlogic.main.limmitorder.bean.BizMode;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.reactive.AwaitKt;
import o.AbstractC58185ywX;
import o.C19918gUd;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class CopyTradingExpireTimeListDialogViewModel$getExpireTimeList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C19918gUd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingExpireTimeListDialogViewModel$getExpireTimeList$1(C19918gUd c19918gUd, Continuation<? super CopyTradingExpireTimeListDialogViewModel$getExpireTimeList$1> continuation) {
        super(2, continuation);
        this.this$0 = c19918gUd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingExpireTimeListDialogViewModel$getExpireTimeList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingExpireTimeListDialogViewModel$getExpireTimeList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C19918gUd c19918gUd = this.this$0;
                Result.Application application = Result.Companion;
                AbstractC58185ywX<List<ExpireTimeConfig>> abstractC58185ywXEZpvd = c19918gUd.EZpvd.EZpvd(BizMode.COPY_TRADE);
                this.label = 1;
                obj = AwaitKt.awaitFirst(abstractC58185ywXEZpvd, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C19918gUd c19918gUd2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            c19918gUd2.KWHzl().setValue(C56390yDp.OLrzqt(C56443yFo.KWHzl(true), (List) objM7377constructorimpl));
        }
        C19918gUd c19918gUd3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("CopyTradingExpireTimeListDialogViewModel", "getExpireTimeList error", thM7380exceptionOrNullimpl);
            c19918gUd3.KWHzl().setValue(C56390yDp.OLrzqt(C56443yFo.KWHzl(false), yDY.AhwBna()));
        }
        return Unit.INSTANCE;
    }
}
