package com.okinc.dexkline.market.features.coindetail.ui.snipers;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.dexkline.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.dexkline.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment;
import com.okinc.dexkline.market.features.coindetail.ui.snipers.SniperBottomSheet$adapter$2$1$1$1;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32167mRz;
import o.C32318mXo;
import o.C32866mlf;
import o.C56391yDq;
import o.C56442yFn;
import o.mQB;
import o.mXB;

/* JADX INFO: loaded from: classes15.dex */
public final class SniperBottomSheet$adapter$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ mXB $it;
    int label;
    final /* synthetic */ C32318mXo this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SniperBottomSheet$adapter$2$1$1$1(C32318mXo c32318mXo, mXB mxb, Continuation<? super SniperBottomSheet$adapter$2$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c32318mXo;
        this.$it = mxb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SniperBottomSheet$adapter$2$1$1$1(this.this$0, this.$it, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SniperBottomSheet$adapter$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iOrdinal;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.gEmmrt().AYXKKw()) {
                MarketCoinDetailViewModel marketCoinDetailViewModelAhwBna = this.this$0.AhwBna();
                if (this.this$0.gEmmrt().djBIcL()) {
                    iOrdinal = CoinDetailTabType.CHART.ordinal();
                } else {
                    iOrdinal = CoinDetailTabType.CHART.ordinal() - 1;
                }
                marketCoinDetailViewModelAhwBna.KWHzl(new mQB(iOrdinal, ChartDetailFragment.Companion.SubChartTabType.HOLDER.ordinal(), this.$it.EZpvd(), this.this$0.gEmmrt().AEQbTJ(), this.this$0.gEmmrt().KWHzl(), 0, this.$it.KWHzl(), 32, null));
                this.this$0.AYXKKw.invoke();
                TrackChannel[] trackChannelArrEZpvd = C32167mRz.OLrzqt.EZpvd();
                TrackChannel[] trackChannelArr = (TrackChannel[]) Arrays.copyOf(trackChannelArrEZpvd, trackChannelArrEZpvd.length);
                final mXB mxb = this.$it;
                C32866mlf.EZpvd("DEXMarket_Token_SniperPopUp_Click", trackChannelArr, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.mXx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return SniperBottomSheet$adapter$2$1$1$1.invokeSuspend$lambda$0(mxb, (EventParamsList) obj2);
                    }
                });
                this.this$0.dismiss();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(mXB mxb, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "buyer_info", mxb.EZpvd(), false, 4, null);
        return Unit.INSTANCE;
    }
}
