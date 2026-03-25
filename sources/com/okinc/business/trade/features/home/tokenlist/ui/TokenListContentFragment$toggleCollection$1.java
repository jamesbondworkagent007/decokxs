package com.okinc.business.trade.features.home.tokenlist.ui;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.market.data.model.watchlist.FavoriteAction;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.kZJ;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenListContentFragment$toggleCollection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DexMultiTokenInfoBean $dexToken;
    int label;
    final /* synthetic */ kZJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenListContentFragment$toggleCollection$1(DexMultiTokenInfoBean dexMultiTokenInfoBean, kZJ kzj, Continuation<? super TokenListContentFragment$toggleCollection$1> continuation) {
        super(2, continuation);
        this.$dexToken = dexMultiTokenInfoBean;
        this.this$0 = kzj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenListContentFragment$toggleCollection$1(this.$dexToken, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenListContentFragment$toggleCollection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            kZJ.handleFavoriteStatusResult$default(this.this$0, this.$dexToken.isCollect() ? FavoriteAction.RemoveFromWatchList : FavoriteAction.AddToWatchList, C56402yEa.EZpvd(new HomeToken(this.$dexToken.getChainId(), null, this.$dexToken.getTokenContractAddress(), this.$dexToken.getTokenSymbol(), null, null, null, null, null, null, null, null, null, null, null, null, this.$dexToken.isCollect(), null, null, null, 983026, null)), null, null, this.$dexToken, 12, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
