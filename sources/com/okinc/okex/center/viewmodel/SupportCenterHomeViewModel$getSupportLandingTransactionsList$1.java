package com.okinc.okex.center.viewmodel;

import java.util.List;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C45348soB;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportCenterHomeViewModel$getSupportLandingTransactionsList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $feature;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SupportCenterHomeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportCenterHomeViewModel$getSupportLandingTransactionsList$1(SupportCenterHomeViewModel supportCenterHomeViewModel, String str, Continuation<? super SupportCenterHomeViewModel$getSupportLandingTransactionsList$1> continuation) {
        super(2, continuation);
        this.this$0 = supportCenterHomeViewModel;
        this.$feature = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportCenterHomeViewModel$getSupportLandingTransactionsList$1 supportCenterHomeViewModel$getSupportLandingTransactionsList$1 = new SupportCenterHomeViewModel$getSupportLandingTransactionsList$1(this.this$0, this.$feature, continuation);
        supportCenterHomeViewModel$getSupportLandingTransactionsList$1.L$0 = obj;
        return supportCenterHomeViewModel$getSupportLandingTransactionsList$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportCenterHomeViewModel$getSupportLandingTransactionsList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SupportCenterHomeViewModel supportCenterHomeViewModel = this.this$0;
                String str = this.$feature;
                Result.Application application = Result.Companion;
                C45348soB c45348soB = supportCenterHomeViewModel.valueOf;
                this.label = 1;
                objAEQbTJ = c45348soB.AEQbTJ(str, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = ((Result) obj).m7386unboximpl();
            }
            C56391yDq.AEQbTJ(objAEQbTJ);
            objM7377constructorimpl = Result.m7377constructorimpl((List) objAEQbTJ);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        String str2 = this.$feature;
        SupportCenterHomeViewModel supportCenterHomeViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            pUU.EZpvd("nemo", "getSupportLandingTransactionsList success===");
            supportCenterHomeViewModel2.EZpvd.setValue(new C32989mnw(new Pair(str2, (List) objM7377constructorimpl)));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.EZpvd("nemo", "getSupportLandingTransactionsList failed===" + thM7380exceptionOrNullimpl.getMessage());
        }
        return Unit.INSTANCE;
    }
}
