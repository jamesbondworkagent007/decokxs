package o;

import com.okinc.business.invest_biz.data.bean.InvestDetailRate;
import com.okinc.business.invest_biz.data.contants.ChartInterval;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.mln.ui.kline.ChartDataFetcherImpl$fetchChartData$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class iOA implements InterfaceC23939iOy {
    public final C26541jeK AEQbTJ;
    public final iEM OLrzqt;

    public iOA(@NotNull iEM iem, @NotNull C26541jeK c26541jeK) {
        Intrinsics.checkNotNullParameter(iem, "");
        Intrinsics.checkNotNullParameter(c26541jeK, "");
        this.OLrzqt = iem;
        this.AEQbTJ = c26541jeK;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1 A[Catch: Exception -> 0x00e5, TryCatch #4 {Exception -> 0x00e5, blocks: (B:28:0x008b, B:31:0x0093, B:33:0x00a1, B:36:0x00aa, B:38:0x00b0, B:41:0x00b9, B:43:0x00bf, B:45:0x00c6), top: B:68:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC23939iOy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull InterfaceC23938iOx interfaceC23938iOx, @NotNull ChartInterval chartInterval, @NotNull Continuation<? super C27398juT> continuation) throws java.lang.Throwable {
        ChartDataFetcherImpl$fetchChartData$1 chartDataFetcherImpl$fetchChartData$1;
        ChartInterval chartInterval2;
        ChartInterval chartInterval3;
        C23682iFk c23682iFk;
        iEM iem;
        java.lang.Object objM7386unboximpl;
        InterfaceC23938iOx interfaceC23938iOx2;
        ChartInterval chartInterval4;
        iOA ioa;
        java.lang.Object objEZpvd;
        ChartInterval chartInterval5;
        java.lang.Object objM7386unboximpl2;
        C23684iFm c23684iFmEZpvd;
        C23684iFm c23684iFmEZpvd2;
        if (continuation instanceof ChartDataFetcherImpl$fetchChartData$1) {
            chartDataFetcherImpl$fetchChartData$1 = (ChartDataFetcherImpl$fetchChartData$1) continuation;
            int i = chartDataFetcherImpl$fetchChartData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chartDataFetcherImpl$fetchChartData$1.label = i - Integer.MIN_VALUE;
            } else {
                chartDataFetcherImpl$fetchChartData$1 = new ChartDataFetcherImpl$fetchChartData$1(this, continuation);
            }
        }
        ChartDataFetcherImpl$fetchChartData$1 chartDataFetcherImpl$fetchChartData$12 = chartDataFetcherImpl$fetchChartData$1;
        java.lang.Object obj = chartDataFetcherImpl$fetchChartData$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = chartDataFetcherImpl$fetchChartData$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                c23682iFk = new C23682iFk(interfaceC23938iOx.OLrzqt(), interfaceC23938iOx.EZpvd());
                iem = this.OLrzqt;
                chartDataFetcherImpl$fetchChartData$12.L$0 = this;
                chartDataFetcherImpl$fetchChartData$12.L$1 = interfaceC23938iOx;
                chartInterval2 = chartInterval;
            } catch (java.lang.Exception unused) {
                chartInterval2 = chartInterval;
            }
            try {
                chartDataFetcherImpl$fetchChartData$12.L$2 = chartInterval2;
                chartDataFetcherImpl$fetchChartData$12.label = 1;
                java.lang.Object objKWHzl = iem.KWHzl(c23682iFk, true, chartDataFetcherImpl$fetchChartData$12);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                objM7386unboximpl = objKWHzl;
                interfaceC23938iOx2 = interfaceC23938iOx;
                chartInterval4 = chartInterval2;
                ioa = this;
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                }
                C23673iFb c23673iFb = (C23673iFb) objM7386unboximpl;
                C26541jeK c26541jeK = ioa.AEQbTJ;
                long jOLrzqt = interfaceC23938iOx2.OLrzqt();
                InvestmentKind investmentKindEZpvd = interfaceC23938iOx2.EZpvd();
                if (c23673iFb == null) {
                }
                if (c23673iFb != null) {
                    if (c23673iFb != null) {
                        chartDataFetcherImpl$fetchChartData$12.L$0 = chartInterval4;
                        chartDataFetcherImpl$fetchChartData$12.L$1 = null;
                        chartDataFetcherImpl$fetchChartData$12.L$2 = null;
                        chartDataFetcherImpl$fetchChartData$12.label = 2;
                        objEZpvd = c26541jeK.EZpvd(jOLrzqt, investmentKindEZpvd, chartInterval4, strGEmmrt, strKWHzl, listDjBIcL, chartDataFetcherImpl$fetchChartData$12);
                        if (objEZpvd != objCopydefault) {
                        }
                    }
                }
            } catch (java.lang.Exception unused2) {
                chartInterval3 = chartInterval2;
                return new C27398juT(chartInterval3, new C23949iPh(yDY.AhwBna(), yDY.AhwBna(), yDY.AhwBna()), false, null, null, null, 0, null, 0, 0, false, true, null, 5116, null);
            }
        } else if (i2 == 1) {
            chartInterval3 = (ChartInterval) chartDataFetcherImpl$fetchChartData$12.L$2;
            interfaceC23938iOx2 = (InterfaceC23938iOx) chartDataFetcherImpl$fetchChartData$12.L$1;
            ioa = (iOA) chartDataFetcherImpl$fetchChartData$12.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                chartInterval4 = chartInterval3;
                try {
                    if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                        objM7386unboximpl = null;
                    }
                    C23673iFb c23673iFb2 = (C23673iFb) objM7386unboximpl;
                    C26541jeK c26541jeK2 = ioa.AEQbTJ;
                    long jOLrzqt2 = interfaceC23938iOx2.OLrzqt();
                    InvestmentKind investmentKindEZpvd2 = interfaceC23938iOx2.EZpvd();
                    java.util.List<InvestDetailRate> listDjBIcL = c23673iFb2 == null ? c23673iFb2.djBIcL() : null;
                    java.lang.String strGEmmrt = (c23673iFb2 != null || (c23684iFmEZpvd2 = c23673iFb2.EZpvd()) == null) ? null : c23684iFmEZpvd2.gEmmrt();
                    java.lang.String strKWHzl = (c23673iFb2 != null || (c23684iFmEZpvd = c23673iFb2.EZpvd()) == null) ? null : c23684iFmEZpvd.KWHzl();
                    chartDataFetcherImpl$fetchChartData$12.L$0 = chartInterval4;
                    chartDataFetcherImpl$fetchChartData$12.L$1 = null;
                    chartDataFetcherImpl$fetchChartData$12.L$2 = null;
                    chartDataFetcherImpl$fetchChartData$12.label = 2;
                    objEZpvd = c26541jeK2.EZpvd(jOLrzqt2, investmentKindEZpvd2, chartInterval4, strGEmmrt, strKWHzl, listDjBIcL, chartDataFetcherImpl$fetchChartData$12);
                    if (objEZpvd != objCopydefault) {
                        return objCopydefault;
                    }
                    chartInterval5 = chartInterval4;
                    objM7386unboximpl2 = objEZpvd;
                    C56391yDq.AEQbTJ(objM7386unboximpl2);
                    return (C27398juT) objM7386unboximpl2;
                } catch (java.lang.Exception unused3) {
                    chartInterval3 = chartInterval4;
                    return new C27398juT(chartInterval3, new C23949iPh(yDY.AhwBna(), yDY.AhwBna(), yDY.AhwBna()), false, null, null, null, 0, null, 0, 0, false, true, null, 5116, null);
                }
            } catch (java.lang.Exception unused4) {
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chartInterval5 = (ChartInterval) chartDataFetcherImpl$fetchChartData$12.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl2 = ((Result) obj).m7386unboximpl();
                try {
                    C56391yDq.AEQbTJ(objM7386unboximpl2);
                    return (C27398juT) objM7386unboximpl2;
                } catch (java.lang.Exception unused5) {
                    chartInterval4 = chartInterval5;
                    chartInterval3 = chartInterval4;
                    return new C27398juT(chartInterval3, new C23949iPh(yDY.AhwBna(), yDY.AhwBna(), yDY.AhwBna()), false, null, null, null, 0, null, 0, 0, false, true, null, 5116, null);
                }
            } catch (java.lang.Exception unused6) {
                chartInterval3 = chartInterval5;
            }
        }
        return new C27398juT(chartInterval3, new C23949iPh(yDY.AhwBna(), yDY.AhwBna(), yDY.AhwBna()), false, null, null, null, 0, null, 0, 0, false, true, null, 5116, null);
    }
}
