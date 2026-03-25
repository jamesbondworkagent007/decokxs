package com.okinc.okex.center.viewmodel;

import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC45235slv;
import o.C44711scA;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes19.dex */
public final class SupportTroubleshootViewModel$fetchData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SupportTroubleshootViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportTroubleshootViewModel$fetchData$1(SupportTroubleshootViewModel supportTroubleshootViewModel, Continuation<? super SupportTroubleshootViewModel$fetchData$1> continuation) {
        super(2, continuation);
        this.this$0 = supportTroubleshootViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportTroubleshootViewModel$fetchData$1 supportTroubleshootViewModel$fetchData$1 = new SupportTroubleshootViewModel$fetchData$1(this.this$0, continuation);
        supportTroubleshootViewModel$fetchData$1.L$0 = obj;
        return supportTroubleshootViewModel$fetchData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportTroubleshootViewModel$fetchData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.AhwBna.setValue(AbstractC45235slv.ActionBar.copydefault);
                SupportTroubleshootViewModel supportTroubleshootViewModel = this.this$0;
                Result.Application application = Result.Companion;
                CoroutineDispatcher coroutineDispatcherOLrzqt = C44711scA.EZpvd.OLrzqt();
                SupportTroubleshootViewModel$fetchData$1$1$1 supportTroubleshootViewModel$fetchData$1$1$1 = new SupportTroubleshootViewModel$fetchData$1$1$1(supportTroubleshootViewModel, null);
                this.label = 1;
                obj = BuildersKt.withContext(coroutineDispatcherOLrzqt, supportTroubleshootViewModel$fetchData$1$1$1, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
            C56391yDq.AEQbTJ(objM7386unboximpl);
            objM7377constructorimpl = Result.m7377constructorimpl((List) objM7386unboximpl);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        SupportTroubleshootViewModel supportTroubleshootViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            supportTroubleshootViewModel2.AhwBna.setValue(new AbstractC45235slv.Application(null, 1, null));
            supportTroubleshootViewModel2.EZpvd.setValue((List) objM7377constructorimpl);
            supportTroubleshootViewModel2.OLrzqt();
            return Unit.INSTANCE;
        }
        SupportTroubleshootViewModel supportTroubleshootViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            OKServerException oKServerException = thM7380exceptionOrNullimpl instanceof OKServerException ? (OKServerException) thM7380exceptionOrNullimpl : null;
            Integer numAEQbTJ = oKServerException != null ? C56443yFo.AEQbTJ(oKServerException.getCode()) : null;
            if (numAEQbTJ != null) {
                supportTroubleshootViewModel3.copydefault.setValue(numAEQbTJ);
            }
            supportTroubleshootViewModel3.AhwBna.setValue(AbstractC45235slv.StateListAnimator.copydefault);
        }
        return Unit.INSTANCE;
    }
}
