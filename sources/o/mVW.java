package o;

import com.okinc.dexkline.market.features.chart.domain.ChartPriceLineMapper;
import com.okinc.dexkline.market.features.chart.domain.ChartPriceLineUseCase$getAveragePrice$1;
import com.okinc.dexkline.market.features.chart.domain.ChartPriceLineUseCase$getAveragePriceBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.kline.data.KlineDexAvgDataBean;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mVW {
    public final InterfaceC34472nci AEQbTJ;
    public final ChartPriceLineMapper EZpvd;
    public final CoroutineDispatcher OLrzqt;
    public final C34587ner copydefault;

    @yCM
    public mVW(@NotNull InterfaceC34472nci interfaceC34472nci, @NotNull C34587ner c34587ner, @NotNull ChartPriceLineMapper chartPriceLineMapper, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC34472nci, "");
        Intrinsics.checkNotNullParameter(c34587ner, "");
        Intrinsics.checkNotNullParameter(chartPriceLineMapper, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC34472nci;
        this.copydefault = c34587ner;
        this.EZpvd = chartPriceLineMapper;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: getAveragePrice-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8685getAveragePriceBWLJW6A$default(mVW mvw, java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        return mvw.OLrzqt(str, str2, str3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<KlineDexAvgDataBean>> continuation) {
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
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
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

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity implements Function0<java.lang.String> {
        public final /* synthetic */ java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke() {
            java.lang.String strKWHzl = mVW.this.copydefault.KWHzl(this.EZpvd);
            final java.lang.String str = this.EZpvd;
            return C34663ngO.AEQbTJ(strKWHzl, new Function0<java.lang.String>() { // from class: o.mVW.Activity.2
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() throws java.lang.Exception {
                    pUU.copydefault("getAveragePrice", "Wallet address not found for chain " + str);
                    throw new java.lang.Exception("Wallet address not found for chain " + str);
                }
            });
        }
    }
}
