package com.okinc.business.market.features.data.domain.usecase;

import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.ChartDataUIItem;
import com.okinc.business.market.data.model.LiquidityChartData;
import com.okinc.business.market.data.model.LiquidityData;
import com.okinc.business.market.data.model.LiquidityPoolChartConfig;
import com.okinc.business.market.data.model.PeriodConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.jQC;
import o.jQH;
import o.jQI;
import o.jQL;
import o.jQN;
import o.pUU;
import o.yDY;

/* JADX INFO: renamed from: com.okinc.business.market.features.data.domain.usecase.LiquidityDataUseCase$getLiquidityBarChartFromNative-BWLJW6A$$inlined$dexRunCatching$1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class LiquidityDataUseCase$getLiquidityBarChartFromNativeBWLJW6A$$inlined$dexRunCatching$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends jQC>>, Object> {
    final /* synthetic */ String $chainId$inlined;
    final /* synthetic */ String $periodType$inlined;
    final /* synthetic */ String $tokenAddress$inlined;
    Object L$0;
    int label;
    final /* synthetic */ jQN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiquidityDataUseCase$getLiquidityBarChartFromNativeBWLJW6A$$inlined$dexRunCatching$1(Continuation continuation, String str, jQN jqn, String str2, String str3) {
        super(2, continuation);
        this.$periodType$inlined = str;
        this.this$0 = jqn;
        this.$chainId$inlined = str2;
        this.$tokenAddress$inlined = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiquidityDataUseCase$getLiquidityBarChartFromNativeBWLJW6A$$inlined$dexRunCatching$1(continuation, this.$periodType$inlined, this.this$0, this.$chainId$inlined, this.$tokenAddress$inlined);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends jQC>> continuation) {
        return ((LiquidityDataUseCase$getLiquidityBarChartFromNativeBWLJW6A$$inlined$dexRunCatching$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b A[Catch: all -> 0x0146, CancellationException -> 0x015d, TryCatch #2 {CancellationException -> 0x015d, all -> 0x0146, blocks: (B:6:0x000f, B:18:0x0050, B:20:0x005a, B:22:0x0060, B:24:0x0066, B:27:0x006d, B:28:0x0071, B:30:0x0077, B:35:0x008b, B:36:0x0094, B:39:0x009f, B:41:0x00a5, B:42:0x00b2, B:44:0x00b8, B:46:0x00c2, B:48:0x00d5, B:51:0x00dc, B:54:0x00e3, B:47:0x00cb, B:57:0x00ed, B:58:0x00f1, B:60:0x00f8, B:62:0x00fe, B:63:0x010b, B:65:0x0111, B:69:0x0122, B:73:0x012b, B:75:0x0138, B:76:0x013c, B:11:0x001e, B:13:0x0024, B:14:0x002d), top: B:84:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009f A[Catch: all -> 0x0146, CancellationException -> 0x015d, TRY_ENTER, TryCatch #2 {CancellationException -> 0x015d, all -> 0x0146, blocks: (B:6:0x000f, B:18:0x0050, B:20:0x005a, B:22:0x0060, B:24:0x0066, B:27:0x006d, B:28:0x0071, B:30:0x0077, B:35:0x008b, B:36:0x0094, B:39:0x009f, B:41:0x00a5, B:42:0x00b2, B:44:0x00b8, B:46:0x00c2, B:48:0x00d5, B:51:0x00dc, B:54:0x00e3, B:47:0x00cb, B:57:0x00ed, B:58:0x00f1, B:60:0x00f8, B:62:0x00fe, B:63:0x010b, B:65:0x0111, B:69:0x0122, B:73:0x012b, B:75:0x0138, B:76:0x013c, B:11:0x001e, B:13:0x0024, B:14:0x002d), top: B:84:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fe A[Catch: all -> 0x0146, CancellationException -> 0x015d, TryCatch #2 {CancellationException -> 0x015d, all -> 0x0146, blocks: (B:6:0x000f, B:18:0x0050, B:20:0x005a, B:22:0x0060, B:24:0x0066, B:27:0x006d, B:28:0x0071, B:30:0x0077, B:35:0x008b, B:36:0x0094, B:39:0x009f, B:41:0x00a5, B:42:0x00b2, B:44:0x00b8, B:46:0x00c2, B:48:0x00d5, B:51:0x00dc, B:54:0x00e3, B:47:0x00cb, B:57:0x00ed, B:58:0x00f1, B:60:0x00f8, B:62:0x00fe, B:63:0x010b, B:65:0x0111, B:69:0x0122, B:73:0x012b, B:75:0x0138, B:76:0x013c, B:11:0x001e, B:13:0x0024, B:14:0x002d), top: B:84:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0138 A[Catch: all -> 0x0146, CancellationException -> 0x015d, TryCatch #2 {CancellationException -> 0x015d, all -> 0x0146, blocks: (B:6:0x000f, B:18:0x0050, B:20:0x005a, B:22:0x0060, B:24:0x0066, B:27:0x006d, B:28:0x0071, B:30:0x0077, B:35:0x008b, B:36:0x0094, B:39:0x009f, B:41:0x00a5, B:42:0x00b2, B:44:0x00b8, B:46:0x00c2, B:48:0x00d5, B:51:0x00dc, B:54:0x00e3, B:47:0x00cb, B:57:0x00ed, B:58:0x00f1, B:60:0x00f8, B:62:0x00fe, B:63:0x010b, B:65:0x0111, B:69:0x0122, B:73:0x012b, B:75:0x0138, B:76:0x013c, B:11:0x001e, B:13:0x0024, B:14:0x002d), top: B:84:0x0007 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        String str;
        LiquidityPoolChartConfig liquidityPoolChartConfig;
        List listAhwBna;
        jQI jqi;
        List<LiquidityData> results;
        List listAhwBna2;
        LiquidityPoolChartConfig liquidityPoolChartConfig2;
        List<PeriodConfig> periodConfigs;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        boolean z = true;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                String str2 = this.$periodType$inlined;
                if (str2 != null) {
                    this.this$0.KWHzl.AEQbTJ(str2);
                }
                String strKWHzl = this.this$0.KWHzl.KWHzl(this.$periodType$inlined);
                jQL jql = this.this$0.KWHzl;
                String str3 = this.$chainId$inlined;
                String str4 = this.$tokenAddress$inlined;
                this.L$0 = strKWHzl;
                this.label = 1;
                Object objAEQbTJ = jql.AEQbTJ(str3, str4, strKWHzl, this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                str = strKWHzl;
                obj = objAEQbTJ;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            LiquidityChartData liquidityChartData = (LiquidityChartData) ((AbstractC43419rot) obj).AEQbTJ();
            if (str == null || (liquidityPoolChartConfig2 = liquidityChartData.getLiquidityPoolChartConfig()) == null || (periodConfigs = liquidityPoolChartConfig2.getPeriodConfigs()) == null || periodConfigs.isEmpty()) {
                z = false;
                if (!z) {
                    this.this$0.KWHzl.EZpvd();
                }
                liquidityPoolChartConfig = liquidityChartData.getLiquidityPoolChartConfig();
                listAhwBna = null;
                if (liquidityPoolChartConfig == null) {
                    List<PeriodConfig> periodConfigs2 = liquidityPoolChartConfig.getPeriodConfigs();
                    if (periodConfigs2 != null) {
                        listAhwBna2 = new ArrayList(C56403yEb.AYXKKw(periodConfigs2, 10));
                        for (PeriodConfig periodConfig : periodConfigs2) {
                            boolean zEZpvd = z ? Intrinsics.EZpvd((Object) periodConfig.getPeriodType(), (Object) str) : Intrinsics.EZpvd((Object) periodConfig.isDefault(), (Object) "1");
                            String periodContent = periodConfig.getPeriodContent();
                            if (periodContent == null) {
                                periodContent = "";
                            }
                            String periodType = periodConfig.getPeriodType();
                            if (periodType == null) {
                                periodType = "";
                            }
                            listAhwBna2.add(new jQH(zEZpvd, periodContent, periodType));
                        }
                    } else {
                        listAhwBna2 = null;
                    }
                    if (listAhwBna2 == null) {
                        listAhwBna2 = yDY.AhwBna();
                    }
                    jqi = new jQI(listAhwBna2);
                } else {
                    jqi = null;
                }
                results = liquidityChartData.getResults();
                if (results != null) {
                    listAhwBna = new ArrayList(C56403yEb.AYXKKw(results, 10));
                    for (LiquidityData liquidityData : results) {
                        String timestamp = liquidityData.getTimestamp();
                        String str5 = timestamp == null ? "" : timestamp;
                        String value = liquidityData.getValue();
                        listAhwBna.add(new ChartDataUIItem(str5, value == null ? "" : value, null, 4, null));
                    }
                }
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                objM7377constructorimpl = Result.m7377constructorimpl(new jQC(jqi, listAhwBna));
            } else {
                Iterator<T> it = periodConfigs.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.EZpvd((Object) ((PeriodConfig) it.next()).getPeriodType(), (Object) str)) {
                        break;
                    }
                }
                z = false;
                if (!z) {
                }
                liquidityPoolChartConfig = liquidityChartData.getLiquidityPoolChartConfig();
                listAhwBna = null;
                if (liquidityPoolChartConfig == null) {
                }
                results = liquidityChartData.getResults();
                if (results != null) {
                }
                if (listAhwBna == null) {
                }
                objM7377constructorimpl = Result.m7377constructorimpl(new jQC(jqi, listAhwBna));
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            pUU.AEQbTJ("DEX", "dexRunCatching", th);
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        return Result.m7376boximpl(objM7377constructorimpl);
    }
}
