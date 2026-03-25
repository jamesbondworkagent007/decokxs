package com.okinc.business.defi.biz.net.loader;

import com.okinc.business.defi.api.bean.ChartData;
import com.okinc.business.defi.api.bean.ChartDataReq;
import com.okinc.network.okg.response.ResponseData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C11600cUg;
import o.C13894dbG;
import o.C13934dbu;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC13915dbb;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletLoader$getChartTypeData$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ResponseData<List<? extends ChartData>>>, Object> {
    final /* synthetic */ List<String> $accountIds;
    final /* synthetic */ Long $chainId;
    final /* synthetic */ int $chartType;
    final /* synthetic */ boolean $hasNft;
    final /* synthetic */ List<Long> $hideCoinList;
    final /* synthetic */ String $privKey;
    final /* synthetic */ C13934dbu $this_runOrErrorResponse;
    final /* synthetic */ Double $tinyThreshold;
    final /* synthetic */ String $userUniqueId;
    final /* synthetic */ String $walletId;
    final /* synthetic */ String $xpub;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletLoader$getChartTypeData$2$1(C13934dbu c13934dbu, String str, String str2, String str3, List<String> list, String str4, int i, Long l, boolean z, Double d, List<Long> list2, Continuation<? super WalletLoader$getChartTypeData$2$1> continuation) {
        super(2, continuation);
        this.$this_runOrErrorResponse = c13934dbu;
        this.$privKey = str;
        this.$walletId = str2;
        this.$xpub = str3;
        this.$accountIds = list;
        this.$userUniqueId = str4;
        this.$chartType = i;
        this.$chainId = l;
        this.$hasNft = z;
        this.$tinyThreshold = d;
        this.$hideCoinList = list2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletLoader$getChartTypeData$2$1(this.$this_runOrErrorResponse, this.$privKey, this.$walletId, this.$xpub, this.$accountIds, this.$userUniqueId, this.$chartType, this.$chainId, this.$hasNft, this.$tinyThreshold, this.$hideCoinList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<? extends ChartData>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super ResponseData<List<ChartData>>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super ResponseData<List<ChartData>>> continuation) {
        return ((WalletLoader$getChartTypeData$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC13915dbb interfaceC13915dbbEZpvd = this.$this_runOrErrorResponse.EZpvd();
            C13894dbG c13894dbG = new C13894dbG(this.$privKey, this.$walletId, this.$xpub);
            ChartDataReq chartDataReq = new ChartDataReq(this.$accountIds, this.$userUniqueId, C56443yFo.AEQbTJ(this.$chartType), this.$chainId, C56443yFo.AEQbTJ(C11600cUg.OLrzqt(this.$hasNft)), this.$tinyThreshold, this.$hideCoinList);
            this.label = 1;
            obj = InterfaceC13915dbb.Application.getKlineChartData$default(interfaceC13915dbbEZpvd, c13894dbG, chartDataReq, null, this, 4, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
