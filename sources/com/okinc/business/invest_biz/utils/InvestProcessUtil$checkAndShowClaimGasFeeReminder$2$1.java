package com.okinc.business.invest_biz.utils;

import androidx.fragment.app.FragmentManager;
import com.okinc.business.invest_biz.data.bean.InvestGetGasFeeRequest;
import com.okinc.business.invest_biz.data.bean.InvestGetGasFeeResponse;
import com.okinc.network.okg.response.ResponseData;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import o.C25592izd;
import o.C27568jxe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.iBL;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestProcessUtil$checkAndShowClaimGasFeeReminder$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CancellableContinuation<Boolean> $continuation;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ InvestGetGasFeeRequest $request;
    final /* synthetic */ String $totalRewards;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InvestProcessUtil$checkAndShowClaimGasFeeReminder$2$1(InvestGetGasFeeRequest investGetGasFeeRequest, String str, CancellableContinuation<? super Boolean> cancellableContinuation, FragmentManager fragmentManager, Continuation<? super InvestProcessUtil$checkAndShowClaimGasFeeReminder$2$1> continuation) {
        super(2, continuation);
        this.$request = investGetGasFeeRequest;
        this.$totalRewards = str;
        this.$continuation = cancellableContinuation;
        this.$fragmentManager = fragmentManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestProcessUtil$checkAndShowClaimGasFeeReminder$2$1(this.$request, this.$totalRewards, this.$continuation, this.$fragmentManager, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestProcessUtil$checkAndShowClaimGasFeeReminder$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                InvestGetGasFeeRequest investGetGasFeeRequest = this.$request;
                Result.Application application = Result.Companion;
                C25592izd c25592izd = C25592izd.OLrzqt;
                this.label = 1;
                obj = c25592izd.OLrzqt(investGetGasFeeRequest, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((InvestGetGasFeeResponse) iBL.unwrapResponseData$default((ResponseData) obj, null, 1, null));
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        String str = this.$totalRewards;
        CancellableContinuation<Boolean> cancellableContinuation = this.$continuation;
        FragmentManager fragmentManager = this.$fragmentManager;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            C27568jxe.EZpvd.OLrzqt((InvestGetGasFeeResponse) objM7377constructorimpl, str, cancellableContinuation, fragmentManager);
        }
        CancellableContinuation<Boolean> cancellableContinuation2 = this.$continuation;
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            Result.Application application3 = Result.Companion;
            cancellableContinuation2.resumeWith(Result.m7377constructorimpl(C56443yFo.KWHzl(true)));
        }
        return Unit.INSTANCE;
    }
}
