package com.okinc.business.dexui.main.market.detail.fragment;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import com.okinc.business.market.data.model.watchlist.FavoriteAction;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes15.dex */
public final class MarketDetailFragment$initListener$1$11$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TokenBase $token;
    boolean Z$0;
    int label;
    final /* synthetic */ MarketDetailFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketDetailFragment$initListener$1$11$1$1(MarketDetailFragment marketDetailFragment, TokenBase tokenBase, Continuation<? super MarketDetailFragment$initListener$1$11$1$1> continuation) {
        super(2, continuation);
        this.this$0 = marketDetailFragment;
        this.$token = tokenBase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketDetailFragment$initListener$1$11$1$1(this.this$0, this.$token, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketDetailFragment$initListener$1$11$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FavoriteAction favoriteAction;
        Object objM6503updateFavoriteStatusyxL6bBk$default;
        boolean z;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            boolean zEZpvd = Intrinsics.EZpvd(this.this$0.iwGUEr().AhwBna().getValue(), C56443yFo.KWHzl(true));
            if (zEZpvd) {
                favoriteAction = FavoriteAction.RemoveFromWatchList;
            } else {
                favoriteAction = FavoriteAction.AddToWatchList;
            }
            FavoriteAction favoriteAction2 = favoriteAction;
            List listEZpvd = C56402yEa.EZpvd(new HomeToken(this.$token.getChainId(), null, this.$token.getTokenContractAddress(), this.$token.getTokenSymbol(), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, 1048562, null));
            MarketCoinDetailViewModel marketCoinDetailViewModelIwGUEr = this.this$0.iwGUEr();
            this.Z$0 = zEZpvd;
            this.label = 1;
            objM6503updateFavoriteStatusyxL6bBk$default = MarketCoinDetailViewModel.m6503updateFavoriteStatusyxL6bBk$default(marketCoinDetailViewModelIwGUEr, favoriteAction2, listEZpvd, null, null, this, 12, null);
            if (objM6503updateFavoriteStatusyxL6bBk$default == objCopydefault) {
                return objCopydefault;
            }
            z = zEZpvd;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.Z$0;
            C56391yDq.AEQbTJ(obj);
            objM6503updateFavoriteStatusyxL6bBk$default = ((Result) obj).m7386unboximpl();
        }
        this.this$0.OLrzqt(objM6503updateFavoriteStatusyxL6bBk$default);
        MarketDetailFragment.trackPageClick$default(this.this$0, null, null, null, null, null, null, null, null, null, TokenDetailClickLayer.GLOBAL, TokenDetailButtonName.ADD_TO_WATCHLIST, C56443yFo.KWHzl(z), FrameMetricsAggregator.EVERY_DURATION, null);
        return Unit.INSTANCE;
    }
}
