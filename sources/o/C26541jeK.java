package o;

import com.okinc.business.invest_biz.data.bean.InvestDetailRate;
import com.okinc.business.invest_biz.data.contants.ChartInterval;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.LoadChartUseCase$invoke$1;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.use_case.LoadChartUseCase$invoke$2;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jeK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C26541jeK {
    public final CoroutineDispatcher EZpvd;
    public final iEM OLrzqt;

    @yCM
    public C26541jeK(@NotNull iEM iem, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(iem, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = iem;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(long j, @NotNull InvestmentKind investmentKind, @NotNull ChartInterval chartInterval, java.lang.String str, java.lang.String str2, java.util.List<InvestDetailRate> list, @NotNull Continuation<? super Result<C27398juT>> continuation) throws java.lang.Throwable {
        LoadChartUseCase$invoke$1 loadChartUseCase$invoke$1;
        if (continuation instanceof LoadChartUseCase$invoke$1) {
            loadChartUseCase$invoke$1 = (LoadChartUseCase$invoke$1) continuation;
            int i = loadChartUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                loadChartUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                loadChartUseCase$invoke$1 = new LoadChartUseCase$invoke$1(this, continuation);
            }
        }
        LoadChartUseCase$invoke$1 loadChartUseCase$invoke$12 = loadChartUseCase$invoke$1;
        java.lang.Object obj = loadChartUseCase$invoke$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = loadChartUseCase$invoke$12.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        CoroutineDispatcher coroutineDispatcher = this.EZpvd;
        LoadChartUseCase$invoke$2 loadChartUseCase$invoke$2 = new LoadChartUseCase$invoke$2(this, j, investmentKind, chartInterval, null);
        loadChartUseCase$invoke$12.label = 1;
        java.lang.Object objCopydefault2 = C27540jxC.copydefault(coroutineDispatcher, loadChartUseCase$invoke$2, loadChartUseCase$invoke$12);
        return objCopydefault2 == objCopydefault ? objCopydefault : objCopydefault2;
    }
}
