package o;

import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.ChartDataUIItem;
import com.okinc.dexkline.market.features.data.domain.usecase.LiquidityDataUseCase$getLiquidityBarChart$1;
import com.okinc.dexkline.market.features.data.domain.usecase.LiquidityDataUseCase$getLiquidityBarChart0E7RQCE$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mXR {
    public final mXP EZpvd;
    public final CoroutineDispatcher copydefault;

    @yCM
    public mXR(@NotNull mXP mxp, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(mxp, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = mxp;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<? extends java.util.List<ChartDataUIItem>>> continuation) throws java.lang.Throwable {
        LiquidityDataUseCase$getLiquidityBarChart$1 liquidityDataUseCase$getLiquidityBarChart$1;
        if (continuation instanceof LiquidityDataUseCase$getLiquidityBarChart$1) {
            liquidityDataUseCase$getLiquidityBarChart$1 = (LiquidityDataUseCase$getLiquidityBarChart$1) continuation;
            int i = liquidityDataUseCase$getLiquidityBarChart$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                liquidityDataUseCase$getLiquidityBarChart$1.label = i - Integer.MIN_VALUE;
            } else {
                liquidityDataUseCase$getLiquidityBarChart$1 = new LiquidityDataUseCase$getLiquidityBarChart$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = liquidityDataUseCase$getLiquidityBarChart$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = liquidityDataUseCase$getLiquidityBarChart$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            LiquidityDataUseCase$getLiquidityBarChart0E7RQCE$$inlined$dexRunCatching$1 liquidityDataUseCase$getLiquidityBarChart0E7RQCE$$inlined$dexRunCatching$1 = new LiquidityDataUseCase$getLiquidityBarChart0E7RQCE$$inlined$dexRunCatching$1(null, this, str, str2);
            liquidityDataUseCase$getLiquidityBarChart$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, liquidityDataUseCase$getLiquidityBarChart0E7RQCE$$inlined$dexRunCatching$1, liquidityDataUseCase$getLiquidityBarChart$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
