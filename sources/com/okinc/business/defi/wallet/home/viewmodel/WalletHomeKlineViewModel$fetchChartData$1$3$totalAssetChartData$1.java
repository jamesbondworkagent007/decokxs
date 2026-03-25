package com.okinc.business.defi.wallet.home.viewmodel;

import com.okinc.business.defi.api.bean.ChartData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.C10407bnq;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletHomeKlineViewModel$fetchChartData$1$3$totalAssetChartData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChartData>, Object> {
    final /* synthetic */ long $chainId;
    final /* synthetic */ AbstractC12782ctV $mainWallet;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletHomeKlineViewModel$fetchChartData$1$3$totalAssetChartData$1(long j, AbstractC12782ctV abstractC12782ctV, Continuation<? super WalletHomeKlineViewModel$fetchChartData$1$3$totalAssetChartData$1> continuation) {
        super(2, continuation);
        this.$chainId = j;
        this.$mainWallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletHomeKlineViewModel$fetchChartData$1$3$totalAssetChartData$1(this.$chainId, this.$mainWallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ChartData> continuation) {
        return ((WalletHomeKlineViewModel$fetchChartData$1$3$totalAssetChartData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strKWHzl;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            long j = this.$chainId;
            if (j == Long.MIN_VALUE) {
                strKWHzl = this.$mainWallet.KWHzl("opened", !C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).KWHzl(this.$mainWallet));
            } else {
                strKWHzl = this.$mainWallet.KWHzl("opened", j, true ^ C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).KWHzl(this.$mainWallet));
            }
            return new ChartData(strKWHzl, System.currentTimeMillis());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
