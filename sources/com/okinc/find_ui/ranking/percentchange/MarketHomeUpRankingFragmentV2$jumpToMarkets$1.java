package com.okinc.find_ui.ranking.percentchange;

import android.content.Context;
import android.content.Intent;
import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC34993nmt;
import o.C27563jxZ;
import o.C35022nnV;
import o.C56391yDq;
import o.C56442yFn;
import o.sZQ;

/* JADX INFO: loaded from: classes15.dex */
public final class MarketHomeUpRankingFragmentV2$jumpToMarkets$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $position;
    int label;
    final /* synthetic */ C35022nnV this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeUpRankingFragmentV2$jumpToMarkets$1(C35022nnV c35022nnV, int i, Continuation<? super MarketHomeUpRankingFragmentV2$jumpToMarkets$1> continuation) {
        super(2, continuation);
        this.this$0 = c35022nnV;
        this.$position = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeUpRankingFragmentV2$jumpToMarkets$1(this.this$0, this.$position, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeUpRankingFragmentV2$jumpToMarkets$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketHomeV2ViewModel marketHomeV2ViewModelSSMYrx = this.this$0.sSMYrx();
            this.label = 1;
            obj = marketHomeV2ViewModelSSMYrx.KWHzl(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        String str = (String) obj;
        if (C27563jxZ.OLrzqt.fetchVPNInfo()) {
            Context context = this.this$0.getContext();
            if (context != null) {
                if (Intrinsics.EZpvd((Object) str, (Object) "SWAP")) {
                    sZQ.EZpvd.AEQbTJ(context, "gainers");
                } else {
                    sZQ.EZpvd.EZpvd(context, "gainers");
                }
            }
        } else {
            Intent intent = new Intent(this.this$0.getContext(), (Class<?>) ActivityC34993nmt.class);
            intent.putExtra("ranking_id", this.$position);
            intent.putExtra("ranking_tab_key", "RANKING_TOP_GAINERS");
            intent.putExtra("ranking_biz_type", str);
            this.this$0.startActivity(intent);
        }
        return Unit.INSTANCE;
    }
}
