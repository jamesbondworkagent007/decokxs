package com.okinc.business.market.features.coindetail.ui.snipers;

import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment;
import com.okinc.business.market.features.coindetail.ui.snipers.SniperBottomSheet$adapter$2$1$1$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C22621hin;
import o.C26032jPk;
import o.C26041jPt;
import o.C32866mlf;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class SniperBottomSheet$adapter$2$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C26041jPt $it;
    int label;
    final /* synthetic */ C26032jPk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SniperBottomSheet$adapter$2$1$1$1(C26032jPk c26032jPk, C26041jPt c26041jPt, Continuation<? super SniperBottomSheet$adapter$2$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c26032jPk;
        this.$it = c26041jPt;
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
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.this$0.AhwBna().gEmmrt()) {
                this.this$0.valueOf().KWHzl(new C22621hin(CoinDetailTabType.CHART.ordinal(), ChartDetailFragment.Companion.SubChartTabType.HOLDER.ordinal(), this.$it.copydefault(), this.this$0.AhwBna().AEQbTJ(), this.this$0.AhwBna().copydefault(), 0, this.$it.EZpvd(), 32, null));
                this.this$0.djBIcL.invoke();
                final C26041jPt c26041jPt = this.$it;
                C32866mlf.onEvent$default("DEXMarket_Token_SniperPopUp_Click", (TrackChannel[]) null, new Function1() { // from class: o.jPu
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return SniperBottomSheet$adapter$2$1$1$1.invokeSuspend$lambda$0(c26041jPt, (EventParamsList) obj2);
                    }
                }, 1, (Object) null);
                this.this$0.dismiss();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C26041jPt c26041jPt, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "buyer_info", c26041jPt.copydefault(), false, 4, null);
        return Unit.INSTANCE;
    }
}
