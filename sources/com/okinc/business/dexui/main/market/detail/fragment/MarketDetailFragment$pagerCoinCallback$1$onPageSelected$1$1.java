package com.okinc.business.dexui.main.market.detail.fragment;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.business.dexlogic.main.market.bean.LatestMarketInfoBean;
import com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC21883hPw;
import o.C21986hTr;
import o.C56391yDq;
import o.C56442yFn;
import o.hAJ;
import o.hOR;

/* JADX INFO: loaded from: classes18.dex */
public final class MarketDetailFragment$pagerCoinCallback$1$onPageSelected$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewPager2 $pager;
    final /* synthetic */ int $position;
    int label;
    final /* synthetic */ MarketDetailFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketDetailFragment$pagerCoinCallback$1$onPageSelected$1$1(MarketDetailFragment marketDetailFragment, int i, ViewPager2 viewPager2, Continuation<? super MarketDetailFragment$pagerCoinCallback$1$onPageSelected$1$1> continuation) {
        super(2, continuation);
        this.this$0 = marketDetailFragment;
        this.$position = i;
        this.$pager = viewPager2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketDetailFragment$pagerCoinCallback$1$onPageSelected$1$1(this.this$0, this.$position, this.$pager, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketDetailFragment$pagerCoinCallback$1$onPageSelected$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C21986hTr c21986hTr;
        LatestMarketInfoBean second;
        C21986hTr c21986hTr2;
        C21986hTr c21986hTr3;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC21883hPw abstractC21883hPw = this.this$0.isConnected;
            Fragment fragmentKWHzl = abstractC21883hPw != null ? abstractC21883hPw.KWHzl(this.$position) : null;
            this.this$0.fetchVPNInfo();
            if (fragmentKWHzl instanceof ChartDetailFragment) {
                Pair<Boolean, LatestMarketInfoBean> value = this.this$0.iwGUEr().valueOf().getValue();
                if (value != null && (second = value.getSecond()) != null && !second.getNotSupportTxNativeToken()) {
                    AbstractC21883hPw abstractC21883hPw2 = this.this$0.isConnected;
                    Fragment fragmentKWHzl2 = abstractC21883hPw2 != null ? abstractC21883hPw2.KWHzl(this.$pager.getCurrentItem()) : null;
                    hOR hor = fragmentKWHzl2 instanceof hOR ? (hOR) fragmentKWHzl2 : null;
                    if (hor != null) {
                        MarketDetailFragment marketDetailFragment = this.this$0;
                        hAJ hajEjfBZ = MarketDetailFragment.ejfBZ(marketDetailFragment);
                        if (hajEjfBZ != null && (c21986hTr3 = hajEjfBZ.EZpvd) != null) {
                            c21986hTr3.AEQbTJ();
                        }
                        hAJ hajEjfBZ2 = MarketDetailFragment.ejfBZ(marketDetailFragment);
                        if (hajEjfBZ2 != null && (c21986hTr2 = hajEjfBZ2.EZpvd) != null) {
                            c21986hTr2.EZpvd(hor.KWHzl());
                        }
                    }
                }
            } else {
                hAJ hajEjfBZ3 = MarketDetailFragment.ejfBZ(this.this$0);
                if (hajEjfBZ3 != null && (c21986hTr = hajEjfBZ3.EZpvd) != null) {
                    c21986hTr.fetchVPNInfo();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
