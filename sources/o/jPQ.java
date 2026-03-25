package o;

import com.okinc.business.market.features.coindetail_liquidity.repo.LiquidityFilterConfigRepo$getPriceRangeConfig$1;
import com.okinc.business.market.features.coindetail_liquidity.repo.LiquidityFilterConfigRepo$getPriceRangeConfigIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class jPQ {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC27595jyE copydefault;

    public jPQ(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC27595jyE;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<? extends java.util.List<PriceRangeFilter>>> continuation) {
        LiquidityFilterConfigRepo$getPriceRangeConfig$1 liquidityFilterConfigRepo$getPriceRangeConfig$1;
        if (continuation instanceof LiquidityFilterConfigRepo$getPriceRangeConfig$1) {
            liquidityFilterConfigRepo$getPriceRangeConfig$1 = (LiquidityFilterConfigRepo$getPriceRangeConfig$1) continuation;
            int i = liquidityFilterConfigRepo$getPriceRangeConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                liquidityFilterConfigRepo$getPriceRangeConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                liquidityFilterConfigRepo$getPriceRangeConfig$1 = new LiquidityFilterConfigRepo$getPriceRangeConfig$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = liquidityFilterConfigRepo$getPriceRangeConfig$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = liquidityFilterConfigRepo$getPriceRangeConfig$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            LiquidityFilterConfigRepo$getPriceRangeConfigIoAF18A$$inlined$dexRunCatching$1 liquidityFilterConfigRepo$getPriceRangeConfigIoAF18A$$inlined$dexRunCatching$1 = new LiquidityFilterConfigRepo$getPriceRangeConfigIoAF18A$$inlined$dexRunCatching$1(null, this);
            liquidityFilterConfigRepo$getPriceRangeConfig$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, liquidityFilterConfigRepo$getPriceRangeConfigIoAF18A$$inlined$dexRunCatching$1, liquidityFilterConfigRepo$getPriceRangeConfig$1);
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
