package com.okinc.business.invest_biz.ui.screens.tvl_chart;

import com.okinc.business.invest_biz.data.bean.CandleResultTvlInfo;
import com.okinc.business.invest_biz.data.contants.ChartInterval;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23949iPh;
import o.C27398juT;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC26824jjc;
import o.iEM;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
public final class TvlChartViewModel$loadTvlChart$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChartInterval $chartInterval;
    final /* synthetic */ long $investmentId;
    int label;
    final /* synthetic */ TvlChartViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TvlChartViewModel$loadTvlChart$1(TvlChartViewModel tvlChartViewModel, ChartInterval chartInterval, long j, Continuation<? super TvlChartViewModel$loadTvlChart$1> continuation) {
        super(2, continuation);
        this.this$0 = tvlChartViewModel;
        this.$chartInterval = chartInterval;
        this.$investmentId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TvlChartViewModel$loadTvlChart$1(this.this$0, this.$chartInterval, this.$investmentId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TvlChartViewModel$loadTvlChart$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objEZpvd;
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Object value = this.this$0.KWHzl.getValue();
            InterfaceC26824jjc.TaskDescription taskDescription = value instanceof InterfaceC26824jjc.TaskDescription ? (InterfaceC26824jjc.TaskDescription) value : null;
            if (taskDescription == null) {
                this.this$0.KWHzl.setValue(InterfaceC26824jjc.ActionBar.EZpvd);
            } else {
                this.this$0.KWHzl.setValue(InterfaceC26824jjc.TaskDescription.copy$default(taskDescription, new C27398juT(this.$chartInterval, new C23949iPh(yDY.AhwBna(), yDY.AhwBna(), yDY.AhwBna()), false, null, null, null, 0, null, 0, 0, true, false, null, 7164, null), null, 2, null));
            }
            iEM iem = this.this$0.EZpvd;
            long j = this.$investmentId;
            ChartInterval chartInterval = this.$chartInterval;
            this.label = 1;
            Object objCopydefault2 = iem.copydefault(j, chartInterval, this);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            objEZpvd = objCopydefault2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objEZpvd = ((Result) obj).m7386unboximpl();
        }
        TvlChartViewModel tvlChartViewModel = this.this$0;
        ChartInterval chartInterval2 = this.$chartInterval;
        if (Result.m7384isSuccessimpl(objEZpvd)) {
            try {
                Result.Application application = Result.Companion;
                CandleResultTvlInfo candleResultTvlInfo = (CandleResultTvlInfo) objEZpvd;
                tvlChartViewModel.KWHzl.setValue(new InterfaceC26824jjc.TaskDescription(tvlChartViewModel.copydefault.copydefault(candleResultTvlInfo, chartInterval2), candleResultTvlInfo.getText()));
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objEZpvd = C56391yDq.EZpvd(th);
                objM7377constructorimpl = Result.m7377constructorimpl(objEZpvd);
            }
        } else {
            objM7377constructorimpl = Result.m7377constructorimpl(objEZpvd);
        }
        TvlChartViewModel tvlChartViewModel2 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.KWHzl(thM7380exceptionOrNullimpl);
            tvlChartViewModel2.KWHzl.setValue(new InterfaceC26824jjc.Activity(thM7380exceptionOrNullimpl));
        }
        return Unit.INSTANCE;
    }
}
