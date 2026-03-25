package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.business.invest_biz.data.bean.InvestUniv3ChartData;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeViewModel;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C25592izd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3SubscribeViewModel$getUniv3PriceData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends InvestUniv3ChartData>>, Object> {
    final /* synthetic */ int $dateType;
    int I$0;
    Object L$0;
    int label;
    final /* synthetic */ InvestUniv3SubscribeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeViewModel$getUniv3PriceData$2(InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel, int i, Continuation<? super InvestUniv3SubscribeViewModel$getUniv3PriceData$2> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeViewModel;
        this.$dateType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeViewModel$getUniv3PriceData$2(this.this$0, this.$dateType, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends InvestUniv3ChartData>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<InvestUniv3ChartData>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<InvestUniv3ChartData>> continuation) {
        return ((InvestUniv3SubscribeViewModel$getUniv3PriceData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        ResponseData responseData;
        MutableStateFlow<InvestUniv3SubscribeViewModel.ChartLoadingStatus> mutableStateFlowRJOkX;
        InvestUniv3SubscribeViewModel.ChartLoadingStatus chartLoadingStatus;
        List<InvestUniv3ChartData> list;
        int i;
        InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel2 = this.this$0;
            i = this.$dateType;
            Result.Application application2 = Result.Companion;
            MutableStateFlow<InvestUniv3SubscribeViewModel.ChartLoadingStatus> mutableStateFlowRJOkX2 = investUniv3SubscribeViewModel2.RJOkX();
            InvestUniv3SubscribeViewModel.ChartLoadingStatus chartLoadingStatus2 = InvestUniv3SubscribeViewModel.ChartLoadingStatus.Loading;
            this.L$0 = investUniv3SubscribeViewModel2;
            this.I$0 = i;
            this.label = 1;
            if (mutableStateFlowRJOkX2.emit(chartLoadingStatus2, this) == objCopydefault) {
                return objCopydefault;
            }
            investUniv3SubscribeViewModel = investUniv3SubscribeViewModel2;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(obj);
                    objM7377constructorimpl = Result.m7377constructorimpl((ResponseData) obj);
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        objM7377constructorimpl = null;
                    }
                    responseData = (ResponseData) objM7377constructorimpl;
                    mutableStateFlowRJOkX = this.this$0.RJOkX();
                    chartLoadingStatus = (responseData != null ? (List) responseData.getData() : null) != null ? InvestUniv3SubscribeViewModel.ChartLoadingStatus.Error : InvestUniv3SubscribeViewModel.ChartLoadingStatus.OK;
                    this.L$0 = responseData;
                    this.label = 3;
                    if (mutableStateFlowRJOkX.emit(chartLoadingStatus, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    if (responseData != null) {
                        InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel3 = this.this$0;
                        if (!list.isEmpty()) {
                        }
                    }
                    return this.this$0.QVAiDq();
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return this.this$0.QVAiDq();
                }
                responseData = (ResponseData) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (responseData != null && (list = (List) responseData.getData()) != null) {
                    InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel32 = this.this$0;
                    if (!list.isEmpty()) {
                        MutableStateFlow<InvestUniv3SubscribeViewModel.ChartLoadingStatus> mutableStateFlowRJOkX3 = investUniv3SubscribeViewModel32.RJOkX();
                        InvestUniv3SubscribeViewModel.ChartLoadingStatus chartLoadingStatus3 = InvestUniv3SubscribeViewModel.ChartLoadingStatus.Error;
                        this.L$0 = list;
                        this.label = 4;
                        if (mutableStateFlowRJOkX3.emit(chartLoadingStatus3, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        investUniv3SubscribeViewModel32.AEQbTJ(list);
                    }
                }
                return this.this$0.QVAiDq();
            }
            i = this.I$0;
            investUniv3SubscribeViewModel = (InvestUniv3SubscribeViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C25592izd c25592izd = C25592izd.OLrzqt;
        long j = investUniv3SubscribeViewModel.gHZMYf;
        Integer numAEQbTJ = C56443yFo.AEQbTJ(i);
        this.L$0 = null;
        this.label = 2;
        obj = c25592izd.KWHzl(j, 2, numAEQbTJ, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((ResponseData) obj);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
        responseData = (ResponseData) objM7377constructorimpl;
        mutableStateFlowRJOkX = this.this$0.RJOkX();
        if ((responseData != null ? (List) responseData.getData() : null) != null) {
        }
        this.L$0 = responseData;
        this.label = 3;
        if (mutableStateFlowRJOkX.emit(chartLoadingStatus, this) == objCopydefault) {
        }
        if (responseData != null) {
        }
        return this.this$0.QVAiDq();
    }
}
