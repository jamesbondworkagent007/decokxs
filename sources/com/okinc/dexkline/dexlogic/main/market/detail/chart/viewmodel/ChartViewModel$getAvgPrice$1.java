package com.okinc.dexkline.dexlogic.main.market.detail.chart.viewmodel;

import com.okinc.dexkline.market.features.filter.ChartDetailSubTabName;
import com.okinc.kline.data.KlineDexAvgDataBean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.mVW;

/* JADX INFO: loaded from: classes8.dex */
public final class ChartViewModel$getAvgPrice$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ ChartDetailSubTabName $currentTab;
    final /* synthetic */ String $tokenContractAddress;
    final /* synthetic */ String $walletAddress;
    int label;
    final /* synthetic */ ChartViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartViewModel$getAvgPrice$1(ChartViewModel chartViewModel, String str, String str2, String str3, ChartDetailSubTabName chartDetailSubTabName, Continuation<? super ChartViewModel$getAvgPrice$1> continuation) {
        super(2, continuation);
        this.this$0 = chartViewModel;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
        this.$walletAddress = str3;
        this.$currentTab = chartDetailSubTabName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChartViewModel$getAvgPrice$1(this.this$0, this.$chainId, this.$tokenContractAddress, this.$walletAddress, this.$currentTab, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChartViewModel$getAvgPrice$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            mVW mvw = this.this$0.AYXKKw;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            String str3 = this.$walletAddress;
            this.label = 1;
            objOLrzqt = mvw.OLrzqt(str, str2, str3, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        ChartViewModel chartViewModel = this.this$0;
        ChartDetailSubTabName chartDetailSubTabName = this.$currentTab;
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            KlineDexAvgDataBean klineDexAvgDataBean = (KlineDexAvgDataBean) objOLrzqt;
            if (!Intrinsics.EZpvd((Object) klineDexAvgDataBean.getAccAvgPx(), (Object) "0") && !Intrinsics.EZpvd((Object) klineDexAvgDataBean.getAccAvgPx(), (Object) "")) {
                chartViewModel.gEmmrt.put(chartDetailSubTabName, klineDexAvgDataBean);
            }
        }
        this.this$0.OLrzqt(this.$currentTab);
        return Unit.INSTANCE;
    }
}
