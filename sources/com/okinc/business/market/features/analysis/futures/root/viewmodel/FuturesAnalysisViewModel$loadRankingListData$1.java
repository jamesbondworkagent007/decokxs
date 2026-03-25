package com.okinc.business.market.features.analysis.futures.root.viewmodel;

import com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPeriod;
import com.okinc.business.market.features.analysis.futures.sub.ranking.ui.FuturesAnalysisRankingPnlType;
import java.util.List;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C25922jLi;
import o.C25937jLx;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC49371unL;

/* JADX INFO: loaded from: classes6.dex */
public final class FuturesAnalysisViewModel$loadRankingListData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FuturesAnalysisRankingPeriod $period;
    final /* synthetic */ FuturesAnalysisRankingPnlType $pnlType;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ FuturesAnalysisViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesAnalysisViewModel$loadRankingListData$1(FuturesAnalysisViewModel futuresAnalysisViewModel, FuturesAnalysisRankingPnlType futuresAnalysisRankingPnlType, FuturesAnalysisRankingPeriod futuresAnalysisRankingPeriod, Continuation<? super FuturesAnalysisViewModel$loadRankingListData$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresAnalysisViewModel;
        this.$pnlType = futuresAnalysisRankingPnlType;
        this.$period = futuresAnalysisRankingPeriod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesAnalysisViewModel$loadRankingListData$1 futuresAnalysisViewModel$loadRankingListData$1 = new FuturesAnalysisViewModel$loadRankingListData$1(this.this$0, this.$pnlType, this.$period, continuation);
        futuresAnalysisViewModel$loadRankingListData$1.L$0 = obj;
        return futuresAnalysisViewModel$loadRankingListData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FuturesAnalysisViewModel$loadRankingListData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00de  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        FuturesAnalysisViewModel futuresAnalysisViewModel;
        FuturesAnalysisRankingPnlType futuresAnalysisRankingPnlType;
        FuturesAnalysisRankingPeriod futuresAnalysisRankingPeriod;
        Object objCopydefault = C56442yFn.copydefault();
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        switch (this.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                FuturesAnalysisViewModel futuresAnalysisViewModel2 = this.this$0;
                InterfaceC49371unL.ActionBar actionBar = new InterfaceC49371unL.ActionBar(null, 1, null);
                this.L$0 = coroutineScope;
                this.label = 1;
                if (futuresAnalysisViewModel2.copydefault((InterfaceC49371unL<? extends List<C25937jLx>>) actionBar, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
                futuresAnalysisViewModel = this.this$0;
                futuresAnalysisRankingPnlType = this.$pnlType;
                futuresAnalysisRankingPeriod = this.$period;
                Result.Application application2 = Result.Companion;
                this.L$0 = futuresAnalysisViewModel;
                this.L$1 = futuresAnalysisRankingPnlType;
                this.L$2 = futuresAnalysisRankingPeriod;
                this.label = 2;
                obj = futuresAnalysisViewModel.AEQbTJ(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                C25922jLi c25922jLi = futuresAnalysisViewModel.AkhnZx;
                Triple triple = new Triple(futuresAnalysisRankingPnlType, futuresAnalysisRankingPeriod, (String) obj);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                obj = c25922jLi.EZpvd(triple, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
                obj2 = objM7377constructorimpl;
                FuturesAnalysisViewModel futuresAnalysisViewModel3 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                    List list = (List) obj2;
                    if (list.isEmpty()) {
                        InterfaceC49371unL.TaskDescription taskDescription = new InterfaceC49371unL.TaskDescription(null, 1, null);
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 4;
                        if (futuresAnalysisViewModel3.copydefault((InterfaceC49371unL<? extends List<C25937jLx>>) taskDescription, (Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        InterfaceC49371unL.Activity activity = new InterfaceC49371unL.Activity(list);
                        this.L$0 = obj2;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 5;
                        if (futuresAnalysisViewModel3.copydefault((InterfaceC49371unL<? extends List<C25937jLx>>) activity, (Continuation<? super Unit>) this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                FuturesAnalysisViewModel futuresAnalysisViewModel4 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                    InterfaceC49371unL.Application application3 = new InterfaceC49371unL.Application(thM7380exceptionOrNullimpl, null, 2, null);
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 6;
                    if (futuresAnalysisViewModel4.copydefault((InterfaceC49371unL<? extends List<C25937jLx>>) application3, (Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C56391yDq.AEQbTJ(obj);
                futuresAnalysisViewModel = this.this$0;
                futuresAnalysisRankingPnlType = this.$pnlType;
                futuresAnalysisRankingPeriod = this.$period;
                Result.Application application22 = Result.Companion;
                this.L$0 = futuresAnalysisViewModel;
                this.L$1 = futuresAnalysisRankingPnlType;
                this.L$2 = futuresAnalysisRankingPeriod;
                this.label = 2;
                obj = futuresAnalysisViewModel.AEQbTJ(this);
                if (obj == objCopydefault) {
                }
                C25922jLi c25922jLi2 = futuresAnalysisViewModel.AkhnZx;
                Triple triple2 = new Triple(futuresAnalysisRankingPnlType, futuresAnalysisRankingPeriod, (String) obj);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                obj = c25922jLi2.EZpvd(triple2, this);
                if (obj == objCopydefault) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
                obj2 = objM7377constructorimpl;
                FuturesAnalysisViewModel futuresAnalysisViewModel32 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                FuturesAnalysisViewModel futuresAnalysisViewModel42 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 2:
                futuresAnalysisRankingPeriod = (FuturesAnalysisRankingPeriod) this.L$2;
                futuresAnalysisRankingPnlType = (FuturesAnalysisRankingPnlType) this.L$1;
                futuresAnalysisViewModel = (FuturesAnalysisViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
                C25922jLi c25922jLi22 = futuresAnalysisViewModel.AkhnZx;
                Triple triple22 = new Triple(futuresAnalysisRankingPnlType, futuresAnalysisRankingPeriod, (String) obj);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 3;
                obj = c25922jLi22.EZpvd(triple22, this);
                if (obj == objCopydefault) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
                obj2 = objM7377constructorimpl;
                FuturesAnalysisViewModel futuresAnalysisViewModel322 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                FuturesAnalysisViewModel futuresAnalysisViewModel422 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 3:
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl((List) obj);
                obj2 = objM7377constructorimpl;
                FuturesAnalysisViewModel futuresAnalysisViewModel3222 = this.this$0;
                if (Result.m7384isSuccessimpl(obj2)) {
                }
                FuturesAnalysisViewModel futuresAnalysisViewModel4222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 4:
            case 5:
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                FuturesAnalysisViewModel futuresAnalysisViewModel42222 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(obj2);
                if (thM7380exceptionOrNullimpl != null) {
                }
                return Unit.INSTANCE;
            case 6:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
