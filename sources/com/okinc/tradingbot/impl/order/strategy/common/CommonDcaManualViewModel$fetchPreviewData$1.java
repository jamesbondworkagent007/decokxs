package com.okinc.tradingbot.impl.order.strategy.common;

import com.okinc.tradingbot.impl.dto.DcaPreviewOrderInfo;
import com.okinc.tradingbot.impl.dto.DcaPreviewResponse;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.vNB;
import o.wTJ;
import o.wTR;

/* JADX INFO: loaded from: classes11.dex */
public final class CommonDcaManualViewModel$fetchPreviewData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ wTJ $req;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CommonDcaManualViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonDcaManualViewModel$fetchPreviewData$1(CommonDcaManualViewModel commonDcaManualViewModel, wTJ wtj, Continuation<? super CommonDcaManualViewModel$fetchPreviewData$1> continuation) {
        super(2, continuation);
        this.this$0 = commonDcaManualViewModel;
        this.$req = wtj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CommonDcaManualViewModel$fetchPreviewData$1 commonDcaManualViewModel$fetchPreviewData$1 = new CommonDcaManualViewModel$fetchPreviewData$1(this.this$0, this.$req, continuation);
        commonDcaManualViewModel$fetchPreviewData$1.L$0 = obj;
        return commonDcaManualViewModel$fetchPreviewData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CommonDcaManualViewModel$fetchPreviewData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        CommonDcaManualViewModel commonDcaManualViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            commonDcaManualViewModel = this.this$0;
            wTJ wtj = this.$req;
            Result.Application application2 = Result.Companion;
            wTR wtr = commonDcaManualViewModel.KWHzl;
            this.L$0 = commonDcaManualViewModel;
            this.label = 1;
            obj = wtr.KWHzl(wtj, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                CommonDcaManualViewModel commonDcaManualViewModel2 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    MutableStateFlow mutableStateFlow = commonDcaManualViewModel2.AEQbTJ;
                    vNB.StateListAnimator stateListAnimator = new vNB.StateListAnimator(thM7380exceptionOrNullimpl);
                    this.L$0 = objM7377constructorimpl;
                    this.label = 3;
                    if (mutableStateFlow.emit(stateListAnimator, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            commonDcaManualViewModel = (CommonDcaManualViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        DcaPreviewResponse dcaPreviewResponse = (DcaPreviewResponse) obj;
        ArrayList arrayList = new ArrayList();
        DcaPreviewOrderInfo dcaPreviewOrderInfoOLrzqt = dcaPreviewResponse.OLrzqt();
        if (dcaPreviewOrderInfoOLrzqt != null) {
            C56443yFo.KWHzl(arrayList.add(dcaPreviewOrderInfoOLrzqt));
        }
        DcaPreviewOrderInfo dcaPreviewOrderInfoAEQbTJ = dcaPreviewResponse.AEQbTJ();
        if (dcaPreviewOrderInfoAEQbTJ != null) {
            C56443yFo.KWHzl(arrayList.add(dcaPreviewOrderInfoAEQbTJ));
        }
        arrayList.addAll(dcaPreviewResponse.EZpvd());
        DcaPreviewOrderInfo dcaPreviewOrderInfoCopydefault = dcaPreviewResponse.copydefault();
        if (dcaPreviewOrderInfoCopydefault != null) {
            arrayList.add(dcaPreviewOrderInfoCopydefault);
        }
        MutableStateFlow mutableStateFlow2 = commonDcaManualViewModel.AEQbTJ;
        vNB.TaskDescription taskDescription = new vNB.TaskDescription(arrayList);
        this.L$0 = null;
        this.label = 2;
        if (mutableStateFlow2.emit(taskDescription, this) == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        CommonDcaManualViewModel commonDcaManualViewModel22 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
