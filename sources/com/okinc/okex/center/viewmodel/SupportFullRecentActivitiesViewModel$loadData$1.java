package com.okinc.okex.center.viewmodel;

import com.okinc.okex.center.bean.FullRecentActivityPageDataV2;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC45154skT;
import o.C45351soE;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportFullRecentActivitiesViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SupportFullRecentActivitiesViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportFullRecentActivitiesViewModel$loadData$1(SupportFullRecentActivitiesViewModel supportFullRecentActivitiesViewModel, Continuation<? super SupportFullRecentActivitiesViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = supportFullRecentActivitiesViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportFullRecentActivitiesViewModel$loadData$1 supportFullRecentActivitiesViewModel$loadData$1 = new SupportFullRecentActivitiesViewModel$loadData$1(this.this$0, continuation);
        supportFullRecentActivitiesViewModel$loadData$1.L$0 = obj;
        return supportFullRecentActivitiesViewModel$loadData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportFullRecentActivitiesViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SupportFullRecentActivitiesViewModel supportFullRecentActivitiesViewModel = this.this$0;
                Result.Application application = Result.Companion;
                C45351soE c45351soE = supportFullRecentActivitiesViewModel.AYXKKw;
                this.label = 1;
                objOLrzqt = c45351soE.OLrzqt(this);
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
            C56391yDq.AEQbTJ(objOLrzqt);
            objM7377constructorimpl = Result.m7377constructorimpl((FullRecentActivityPageDataV2) objOLrzqt);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        SupportFullRecentActivitiesViewModel supportFullRecentActivitiesViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            FullRecentActivityPageDataV2 fullRecentActivityPageDataV2 = (FullRecentActivityPageDataV2) objM7377constructorimpl;
            supportFullRecentActivitiesViewModel2.KWHzl.setValue(fullRecentActivityPageDataV2);
            supportFullRecentActivitiesViewModel2.OLrzqt.setValue(new AbstractC45154skT.StateListAnimator(fullRecentActivityPageDataV2.getTxnLists(), fullRecentActivityPageDataV2.getTxnSelfServiceTools(), fullRecentActivityPageDataV2.getHasMore()));
            supportFullRecentActivitiesViewModel2.copydefault.setValue(fullRecentActivityPageDataV2.getHasMore());
        }
        SupportFullRecentActivitiesViewModel supportFullRecentActivitiesViewModel3 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
            supportFullRecentActivitiesViewModel3.OLrzqt.setValue(AbstractC45154skT.Activity.OLrzqt);
        }
        return Unit.INSTANCE;
    }
}
