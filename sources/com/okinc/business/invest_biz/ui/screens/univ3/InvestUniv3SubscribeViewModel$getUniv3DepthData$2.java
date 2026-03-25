package com.okinc.business.invest_biz.ui.screens.univ3;

import com.okinc.business.invest_biz.data.bean.InvestUniv3ChartData;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeViewModel;
import com.okinc.network.okg.response.ResponseData;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C25592izd;
import o.C56391yDq;
import o.C56442yFn;
import o.yET;

/* JADX INFO: loaded from: classes18.dex */
public final class InvestUniv3SubscribeViewModel$getUniv3DepthData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends InvestUniv3ChartData>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ InvestUniv3SubscribeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUniv3SubscribeViewModel$getUniv3DepthData$2(InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel, Continuation<? super InvestUniv3SubscribeViewModel$getUniv3DepthData$2> continuation) {
        super(2, continuation);
        this.this$0 = investUniv3SubscribeViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUniv3SubscribeViewModel$getUniv3DepthData$2(this.this$0, continuation);
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
        return ((InvestUniv3SubscribeViewModel$getUniv3DepthData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class ActionBar<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Integer.valueOf(((InvestUniv3ChartData) t).getTick()), Integer.valueOf(((InvestUniv3ChartData) t2).getTick()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        ResponseData responseData;
        MutableStateFlow<InvestUniv3SubscribeViewModel.ChartLoadingStatus> mutableStateFlowHDKMBd;
        InvestUniv3SubscribeViewModel.ChartLoadingStatus chartLoadingStatus;
        List list;
        InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel;
        Object univ3ChartData$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            investUniv3SubscribeViewModel = this.this$0;
            Result.Application application2 = Result.Companion;
            MutableStateFlow<InvestUniv3SubscribeViewModel.ChartLoadingStatus> mutableStateFlowHDKMBd2 = investUniv3SubscribeViewModel.hDKMBd();
            InvestUniv3SubscribeViewModel.ChartLoadingStatus chartLoadingStatus2 = InvestUniv3SubscribeViewModel.ChartLoadingStatus.Loading;
            this.L$0 = investUniv3SubscribeViewModel;
            this.label = 1;
            if (mutableStateFlowHDKMBd2.emit(chartLoadingStatus2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    C56391yDq.AEQbTJ(obj);
                    univ3ChartData$default = obj;
                    objM7377constructorimpl = Result.m7377constructorimpl((ResponseData) univ3ChartData$default);
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        objM7377constructorimpl = null;
                    }
                    responseData = (ResponseData) objM7377constructorimpl;
                    mutableStateFlowHDKMBd = this.this$0.hDKMBd();
                    chartLoadingStatus = (responseData != null ? (List) responseData.getData() : null) != null ? InvestUniv3SubscribeViewModel.ChartLoadingStatus.Error : InvestUniv3SubscribeViewModel.ChartLoadingStatus.OK;
                    this.L$0 = responseData;
                    this.label = 3;
                    if (mutableStateFlowHDKMBd.emit(chartLoadingStatus, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    if (responseData != null) {
                        InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel2 = this.this$0;
                        if (!list.isEmpty()) {
                        }
                    }
                    return this.this$0.iwGUEr();
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return this.this$0.iwGUEr();
                }
                responseData = (ResponseData) this.L$0;
                C56391yDq.AEQbTJ(obj);
                if (responseData != null && (list = (List) responseData.getData()) != null) {
                    InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel22 = this.this$0;
                    if (!list.isEmpty()) {
                        MutableStateFlow<InvestUniv3SubscribeViewModel.ChartLoadingStatus> mutableStateFlowHDKMBd3 = investUniv3SubscribeViewModel22.hDKMBd();
                        InvestUniv3SubscribeViewModel.ChartLoadingStatus chartLoadingStatus3 = InvestUniv3SubscribeViewModel.ChartLoadingStatus.Error;
                        this.L$0 = list;
                        this.label = 4;
                        if (mutableStateFlowHDKMBd3.emit(chartLoadingStatus3, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        investUniv3SubscribeViewModel22.OLrzqt(CollectionsKt___CollectionsKt.EZpvd(list, new ActionBar()));
                    }
                }
                return this.this$0.iwGUEr();
            }
            investUniv3SubscribeViewModel = (InvestUniv3SubscribeViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C25592izd c25592izd = C25592izd.OLrzqt;
        long j = investUniv3SubscribeViewModel.gHZMYf;
        this.L$0 = null;
        this.label = 2;
        univ3ChartData$default = C25592izd.getUniv3ChartData$default(c25592izd, j, 1, null, this, 4, null);
        if (univ3ChartData$default == objCopydefault) {
            return objCopydefault;
        }
        objM7377constructorimpl = Result.m7377constructorimpl((ResponseData) univ3ChartData$default);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
        }
        responseData = (ResponseData) objM7377constructorimpl;
        mutableStateFlowHDKMBd = this.this$0.hDKMBd();
        if ((responseData != null ? (List) responseData.getData() : null) != null) {
        }
        this.L$0 = responseData;
        this.label = 3;
        if (mutableStateFlowHDKMBd.emit(chartLoadingStatus, this) == objCopydefault) {
        }
        if (responseData != null) {
        }
        return this.this$0.iwGUEr();
    }
}
