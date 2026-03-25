package com.okinc.dexkline.dexui.main.market.detail.fragment;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.dexkline.dexui.main.market.detail.adapter.CoinDetailTabInfo;
import com.okinc.dexkline.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.dexkline.market.features.coindetail.ui.chart.ChartDetailFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.mRU;
import o.mRV;
import o.mRX;
import o.mUA;

/* JADX INFO: loaded from: classes18.dex */
public final class DexMarketDetailFragment$pagerCoinCallback$1$onPageSelected$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewPager2 $pager;
    final /* synthetic */ int $position;
    int label;
    final /* synthetic */ DexMarketDetailFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexMarketDetailFragment$pagerCoinCallback$1$onPageSelected$1$1(DexMarketDetailFragment dexMarketDetailFragment, int i, ViewPager2 viewPager2, Continuation<? super DexMarketDetailFragment$pagerCoinCallback$1$onPageSelected$1$1> continuation) {
        super(2, continuation);
        this.this$0 = dexMarketDetailFragment;
        this.$position = i;
        this.$pager = viewPager2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexMarketDetailFragment$pagerCoinCallback$1$onPageSelected$1$1(this.this$0, this.$position, this.$pager, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DexMarketDetailFragment$pagerCoinCallback$1$onPageSelected$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            mRV mrv = this.this$0.copydefault;
            Fragment fragmentCopydefault = mrv != null ? mrv.copydefault(this.$position) : null;
            this.this$0.iwGUEr();
            if (this.this$0.uzCIH().isConnected().getValue().booleanValue()) {
                mRV mrv2 = this.this$0.copydefault;
                mRU mru = mrv2 instanceof mRU ? (mRU) mrv2 : null;
                CoinDetailTabInfo coinDetailTabInfoAEQbTJ = mru != null ? mru.AEQbTJ(this.$position) : null;
                if ((coinDetailTabInfoAEQbTJ != null ? coinDetailTabInfoAEQbTJ.getTabType() : null) == CoinDetailTabType.FEEDS) {
                    this.this$0.uzCIH().copydefault();
                }
            }
            if (fragmentCopydefault instanceof ChartDetailFragment) {
                mRV mrv3 = this.this$0.copydefault;
                Fragment fragmentCopydefault2 = mrv3 != null ? mrv3.copydefault(this.$pager.getCurrentItem()) : null;
                mRX mrx = fragmentCopydefault2 instanceof mRX ? (mRX) fragmentCopydefault2 : null;
                if (mrx != null) {
                    DexMarketDetailFragment dexMarketDetailFragment = this.this$0;
                    mUA muaValueOf = dexMarketDetailFragment.valueOf();
                    if (muaValueOf != null) {
                        muaValueOf.copydefault();
                    }
                    mUA muaValueOf2 = dexMarketDetailFragment.valueOf();
                    if (muaValueOf2 != null) {
                        muaValueOf2.OLrzqt(mrx.AEQbTJ());
                    }
                }
            } else {
                mUA muaValueOf3 = this.this$0.valueOf();
                if (muaValueOf3 != null) {
                    muaValueOf3.OLrzqt();
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
