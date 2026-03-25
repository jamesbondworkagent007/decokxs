package o;

import com.okinc.business.market.features.chart.domain.ChartPriceLineMapper;
import com.okinc.business.market.features.chart.domain.ChartPriceLineUseCase$getAveragePrice$1;
import com.okinc.business.market.features.chart.domain.ChartPriceLineUseCase$getAveragePriceBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.chart.domain.ChartPriceLineUseCase$getOpenLimitOrders$1;
import com.okinc.business.market.features.chart.domain.ChartPriceLineUseCase$getOpenLimitOrders0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.kline.data.KlineOpenOrderBean;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jNs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25986jNs {
    public final jAH AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final ChartPriceLineMapper KWHzl;
    public final InterfaceC29133knr OLrzqt;
    public final InterfaceC28288kVw copydefault;
    public final kKG valueOf;

    /* JADX INFO: renamed from: o.jNs$Activity */
    public static final class Activity implements Function0<java.lang.String> {
        public final /* synthetic */ java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke() {
            return this.AEQbTJ;
        }
    }

    @yCM
    public C25986jNs(@NotNull InterfaceC28288kVw interfaceC28288kVw, @NotNull InterfaceC29133knr interfaceC29133knr, @NotNull kKG kkg, @NotNull jAH jah, @NotNull ChartPriceLineMapper chartPriceLineMapper, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28288kVw, "");
        Intrinsics.checkNotNullParameter(interfaceC29133knr, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(jah, "");
        Intrinsics.checkNotNullParameter(chartPriceLineMapper, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC28288kVw;
        this.OLrzqt = interfaceC29133knr;
        this.valueOf = kkg;
        this.AEQbTJ = jah;
        this.KWHzl = chartPriceLineMapper;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<? extends java.util.List<KlineOpenOrderBean>>> continuation) throws java.lang.Throwable {
        ChartPriceLineUseCase$getOpenLimitOrders$1 chartPriceLineUseCase$getOpenLimitOrders$1;
        if (continuation instanceof ChartPriceLineUseCase$getOpenLimitOrders$1) {
            chartPriceLineUseCase$getOpenLimitOrders$1 = (ChartPriceLineUseCase$getOpenLimitOrders$1) continuation;
            int i = chartPriceLineUseCase$getOpenLimitOrders$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chartPriceLineUseCase$getOpenLimitOrders$1.label = i - Integer.MIN_VALUE;
            } else {
                chartPriceLineUseCase$getOpenLimitOrders$1 = new ChartPriceLineUseCase$getOpenLimitOrders$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = chartPriceLineUseCase$getOpenLimitOrders$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = chartPriceLineUseCase$getOpenLimitOrders$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            ChartPriceLineUseCase$getOpenLimitOrders0E7RQCE$$inlined$dexRunCatching$1 chartPriceLineUseCase$getOpenLimitOrders0E7RQCE$$inlined$dexRunCatching$1 = new ChartPriceLineUseCase$getOpenLimitOrders0E7RQCE$$inlined$dexRunCatching$1(null, str, this, str2);
            chartPriceLineUseCase$getOpenLimitOrders$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, chartPriceLineUseCase$getOpenLimitOrders0E7RQCE$$inlined$dexRunCatching$1, chartPriceLineUseCase$getOpenLimitOrders$1);
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

    /* JADX INFO: renamed from: getAveragePrice-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8641getAveragePriceBWLJW6A$default(C25986jNs c25986jNs, java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        return c25986jNs.KWHzl(str, str2, str3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<C25982jNo>> continuation) throws java.lang.Throwable {
        ChartPriceLineUseCase$getAveragePrice$1 chartPriceLineUseCase$getAveragePrice$1;
        if (continuation instanceof ChartPriceLineUseCase$getAveragePrice$1) {
            chartPriceLineUseCase$getAveragePrice$1 = (ChartPriceLineUseCase$getAveragePrice$1) continuation;
            int i = chartPriceLineUseCase$getAveragePrice$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chartPriceLineUseCase$getAveragePrice$1.label = i - Integer.MIN_VALUE;
            } else {
                chartPriceLineUseCase$getAveragePrice$1 = new ChartPriceLineUseCase$getAveragePrice$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = chartPriceLineUseCase$getAveragePrice$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = chartPriceLineUseCase$getAveragePrice$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            ChartPriceLineUseCase$getAveragePriceBWLJW6A$$inlined$dexRunCatching$1 chartPriceLineUseCase$getAveragePriceBWLJW6A$$inlined$dexRunCatching$1 = new ChartPriceLineUseCase$getAveragePriceBWLJW6A$$inlined$dexRunCatching$1(null, str3, this, str, str2);
            chartPriceLineUseCase$getAveragePrice$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, chartPriceLineUseCase$getAveragePriceBWLJW6A$$inlined$dexRunCatching$1, chartPriceLineUseCase$getAveragePrice$1);
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

    /* JADX INFO: renamed from: o.jNs$ActionBar */
    public static final class ActionBar implements Function0<java.lang.String> {
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke() throws java.lang.Exception {
            java.lang.String strEZpvd;
            InterfaceC9738bbJ interfaceC9738bbJValueOf = C25986jNs.this.valueOf.valueOf();
            if (interfaceC9738bbJValueOf != null && (strEZpvd = interfaceC9738bbJValueOf.EZpvd(C33129mqd.valueOf(this.OLrzqt))) != null) {
                return strEZpvd;
            }
            throw new java.lang.Exception("Wallet address not found for chain " + this.OLrzqt);
        }
    }
}
