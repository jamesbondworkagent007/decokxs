package com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case;

import com.okinc.business.invest_biz.data.bean.CandleResultInfo;
import com.okinc.business.invest_biz.data.contants.ChartInterval;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.ui.bean.InvestKLineDataPoint;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C23673iFb;
import o.C23677iFf;
import o.C23682iFk;
import o.C23949iPh;
import o.C23951iPj;
import o.C26541jeK;
import o.C27398juT;
import o.C27492jwH;
import o.C56391yDq;
import o.C56442yFn;
import o.iEM;
import o.yDY;

/* JADX INFO: loaded from: classes15.dex */
public final class LoadChartUseCase$invoke$2 extends SuspendLambda implements Function1<Continuation<? super C27398juT>, Object> {
    final /* synthetic */ ChartInterval $interval;
    final /* synthetic */ long $investmentId;
    final /* synthetic */ InvestmentKind $kind;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C26541jeK this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadChartUseCase$invoke$2(C26541jeK c26541jeK, long j, InvestmentKind investmentKind, ChartInterval chartInterval, Continuation<? super LoadChartUseCase$invoke$2> continuation) {
        super(1, continuation);
        this.this$0 = c26541jeK;
        this.$investmentId = j;
        this.$kind = investmentKind;
        this.$interval = chartInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new LoadChartUseCase$invoke$2(this.this$0, this.$investmentId, this.$kind, this.$interval, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super C27398juT> continuation) {
        return ((LoadChartUseCase$invoke$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0171  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        List list;
        int i;
        String ratePercent$default;
        String ratePercent$default2;
        Object objKWHzl;
        int i2;
        int i3;
        String str;
        String str2;
        boolean zKWHzl;
        List<InvestKLineDataPoint> listAhwBna;
        String strAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = this.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            iEM iem = this.this$0.OLrzqt;
            long j = this.$investmentId;
            InvestmentKind investmentKind = this.$kind;
            ChartInterval chartInterval = this.$interval;
            this.label = 1;
            objAEQbTJ = iem.AEQbTJ(j, investmentKind, chartInterval, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = this.I$1;
                int i6 = this.I$0;
                String str3 = (String) this.L$2;
                String str4 = (String) this.L$1;
                list = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = ((Result) obj).m7386unboximpl();
                i2 = i5;
                i3 = i6;
                str = str3;
                str2 = str4;
                C56391yDq.AEQbTJ(objKWHzl);
                C23673iFb c23673iFb = (C23673iFb) objKWHzl;
                zKWHzl = C23677iFf.KWHzl(c23673iFb);
                if (!zKWHzl) {
                    listAhwBna = C23951iPj.copydefault(list);
                } else {
                    listAhwBna = yDY.AhwBna();
                }
                List<InvestKLineDataPoint> list2 = listAhwBna;
                C23949iPh c23949iPhEZpvd = C23951iPj.EZpvd((List<CandleResultInfo>) list);
                InvestKLineDataPoint investKLineDataPoint = (InvestKLineDataPoint) CollectionsKt___CollectionsKt.wlaJM(list2);
                return new C27398juT(this.$interval, c23949iPhEZpvd, zKWHzl, list2, (investKLineDataPoint != null || (strAEQbTJ = investKLineDataPoint.AEQbTJ()) == null) ? "" : strAEQbTJ, str2, i3, str, i2, list.size(), false, false, c23673iFb.EZpvd().DbNXlk());
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(objAEQbTJ);
        list = (List) objAEQbTJ;
        Iterator it = list.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (((CandleResultInfo) it.next()).getLimitValue() == 1) {
                break;
            }
            i7++;
        }
        Iterator it2 = list.iterator();
        int i8 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (((CandleResultInfo) it2.next()).getLimitValue() == -1) {
                i = i8;
                break;
            }
            i8++;
        }
        CandleResultInfo candleResultInfo = i7 == -1 ? null : (CandleResultInfo) list.get(i7);
        CandleResultInfo candleResultInfo2 = i == -1 ? null : (CandleResultInfo) list.get(i);
        String bonusRate = candleResultInfo != null ? candleResultInfo.getBonusRate() : null;
        String rate = candleResultInfo != null ? candleResultInfo.getRate() : null;
        if (bonusRate == null || bonusRate.length() == 0) {
            ratePercent$default = (rate == null || rate.length() == 0) ? "" : C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, rate, false, 2, null);
        } else {
            ratePercent$default = C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, bonusRate, false, 2, null);
        }
        String bonusRate2 = candleResultInfo2 != null ? candleResultInfo2.getBonusRate() : null;
        String rate2 = candleResultInfo2 != null ? candleResultInfo2.getRate() : null;
        if (bonusRate2 == null || bonusRate2.length() == 0) {
            ratePercent$default2 = (rate2 == null || rate2.length() == 0) ? "" : C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, rate2, false, 2, null);
        } else {
            ratePercent$default2 = C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, bonusRate2, false, 2, null);
        }
        C23682iFk c23682iFk = new C23682iFk(this.$investmentId, this.$kind);
        iEM iem2 = this.this$0.OLrzqt;
        this.L$0 = list;
        this.L$1 = ratePercent$default;
        this.L$2 = ratePercent$default2;
        this.I$0 = i7;
        this.I$1 = i;
        this.label = 2;
        objKWHzl = iem2.KWHzl(c23682iFk, false, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        i2 = i;
        i3 = i7;
        str = ratePercent$default2;
        str2 = ratePercent$default;
        C56391yDq.AEQbTJ(objKWHzl);
        C23673iFb c23673iFb2 = (C23673iFb) objKWHzl;
        zKWHzl = C23677iFf.KWHzl(c23673iFb2);
        if (!zKWHzl) {
        }
        List<InvestKLineDataPoint> list22 = listAhwBna;
        C23949iPh c23949iPhEZpvd2 = C23951iPj.EZpvd((List<CandleResultInfo>) list);
        InvestKLineDataPoint investKLineDataPoint2 = (InvestKLineDataPoint) CollectionsKt___CollectionsKt.wlaJM(list22);
        return new C27398juT(this.$interval, c23949iPhEZpvd2, zKWHzl, list22, (investKLineDataPoint2 != null || (strAEQbTJ = investKLineDataPoint2.AEQbTJ()) == null) ? "" : strAEQbTJ, str2, i3, str, i2, list.size(), false, false, c23673iFb2.EZpvd().DbNXlk());
    }
}
