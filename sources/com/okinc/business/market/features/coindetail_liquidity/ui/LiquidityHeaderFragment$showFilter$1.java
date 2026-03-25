package com.okinc.business.market.features.coindetail_liquidity.ui;

import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.filter.ui.CommonTrackData;
import com.okinc.business.market.features.filter.ui.FilterBottomSheetParams;
import com.okinc.business.market.features.filter.ui.FilterSheetTrackParams;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23274hvD;
import o.C26052jQd;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.jUM;

/* JADX INFO: loaded from: classes6.dex */
public final class LiquidityHeaderFragment$showFilter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C26052jQd this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiquidityHeaderFragment$showFilter$1(C26052jQd c26052jQd, Continuation<? super LiquidityHeaderFragment$showFilter$1> continuation) {
        super(2, continuation);
        this.this$0 = c26052jQd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LiquidityHeaderFragment$showFilter$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LiquidityHeaderFragment$showFilter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            TokenFilter tokenFilterKWHzl = this.this$0.gEmmrt().KWHzl();
            jUM.StateListAnimator stateListAnimator = jUM.Companion;
            String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.addContentView);
            List<PriceRangeFilter> listValueOf = this.this$0.gEmmrt().valueOf();
            TokenFilter tokenFilterEZpvd = this.this$0.gEmmrt().EZpvd();
            stateListAnimator.KWHzl(new FilterBottomSheetParams(strAYXKKw, null, listValueOf, null, tokenFilterEZpvd.OLrzqt((6143 & 1) != 0 ? tokenFilterEZpvd.AEQbTJ : null, (6143 & 2) != 0 ? tokenFilterEZpvd.isConnected : null, (6143 & 4) != 0 ? tokenFilterEZpvd.AkhnZx : tokenFilterKWHzl.DbNXlk(), (6143 & 8) != 0 ? tokenFilterEZpvd.AhwBna : null, (6143 & 16) != 0 ? tokenFilterEZpvd.KWHzl : null, (6143 & 32) != 0 ? tokenFilterEZpvd.AYXKKw : false, (6143 & 64) != 0 ? tokenFilterEZpvd.valueOf : false, (6143 & 128) != 0 ? tokenFilterEZpvd.EZpvd : null, (6143 & 256) != 0 ? tokenFilterEZpvd.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterEZpvd.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilterEZpvd.copydefault : null, (6143 & 2048) != 0 ? tokenFilterEZpvd.djBIcL : null, (6143 & 4096) != 0 ? tokenFilterEZpvd.fetchVPNInfo : null), tokenFilterKWHzl, this.this$0.fetchVPNInfo().OLrzqt(), this.this$0.fetchVPNInfo().EZpvd(), new FilterSheetTrackParams("DEXMarket_Token_PoolFilter_Custom_Click", new CommonTrackData("DEXMarket_Token_Liquidity_Filter_View", "token_symbol", this.this$0.fetchVPNInfo().OLrzqt())), null, null, null, null, false, false, false, false, 130570, null)).show(this.this$0.getChildFragmentManager(), "tag.FilterBottomSheet");
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
