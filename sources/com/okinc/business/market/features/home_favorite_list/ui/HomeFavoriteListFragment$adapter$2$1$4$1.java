package com.okinc.business.market.features.home_favorite_list.ui;

import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C21847hOn;
import o.C28425kaY;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeFavoriteListFragment$adapter$2$1$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeToken $item;
    int label;
    final /* synthetic */ C28425kaY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFavoriteListFragment$adapter$2$1$4$1(C28425kaY c28425kaY, HomeToken homeToken, Continuation<? super HomeFavoriteListFragment$adapter$2$1$4$1> continuation) {
        super(2, continuation);
        this.this$0 = c28425kaY;
        this.$item = homeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeFavoriteListFragment$adapter$2$1$4$1(this.this$0, this.$item, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeFavoriteListFragment$adapter$2$1$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String strEZpvd = this.this$0.AYXKKw().EZpvd();
            String strOLrzqt = this.$item.OLrzqt();
            C21847hOn.EZpvd(strEZpvd, (114682 & 2) != 0 ? null : null, (114682 & 4) != 0 ? null : "market_watchlist", (114682 & 8) != 0 ? null : null, (114682 & 16) != 0 ? null : null, (114682 & 32) != 0 ? null : this.$item.EZpvd(), (114682 & 64) != 0 ? null : null, (114682 & 128) != 0 ? null : null, (114682 & 256) != 0 ? null : null, (114682 & 512) != 0 ? null : null, (114682 & 1024) != 0 ? null : strOLrzqt, (114682 & 2048) != 0 ? null : this.$item.AYXKKw(), (114682 & 4096) != 0 ? null : this.$item.values(), (114682 & 8192) != 0 ? null : "xboost_launch_tag", this.this$0.djBIcL().AhwBna(), (32768 & 114682) != 0 ? null : null, (114682 & 65536) != 0 ? null : null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
