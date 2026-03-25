package com.okinc.business.trade.features.home.autoconfirm;

import com.okinc.business.dexlogic.bean.QuotaInfoBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC23234huQ;
import o.InterfaceC9738bbJ;
import o.kTV;

/* JADX INFO: loaded from: classes7.dex */
public final class AutoConfirmUseCaseImpl$getQuotaInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super QuotaInfoBean>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ kTV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoConfirmUseCaseImpl$getQuotaInfo$2(kTV ktv, Continuation<? super AutoConfirmUseCaseImpl$getQuotaInfo$2> continuation) {
        super(2, continuation);
        this.this$0 = ktv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AutoConfirmUseCaseImpl$getQuotaInfo$2 autoConfirmUseCaseImpl$getQuotaInfo$2 = new AutoConfirmUseCaseImpl$getQuotaInfo$2(this.this$0, continuation);
        autoConfirmUseCaseImpl$getQuotaInfo$2.L$0 = obj;
        return autoConfirmUseCaseImpl$getQuotaInfo$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super QuotaInfoBean> continuation) {
        return ((AutoConfirmUseCaseImpl$getQuotaInfo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String strDbNXlk;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC9738bbJ interfaceC9738bbJKWHzl = this.this$0.EZpvd.KWHzl();
            if (interfaceC9738bbJKWHzl != null && (strDbNXlk = interfaceC9738bbJKWHzl.DbNXlk()) != null) {
                kTV ktv = this.this$0;
                Result.Application application2 = Result.Companion;
                InterfaceC23234huQ interfaceC23234huQ = ktv.copydefault;
                this.label = 1;
                obj = interfaceC23234huQ.copydefault(strDbNXlk, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            return null;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(obj);
        objM7377constructorimpl = Result.m7377constructorimpl((QuotaInfoBean) ((ResponseData) obj).getData());
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            return null;
        }
        return objM7377constructorimpl;
    }
}
