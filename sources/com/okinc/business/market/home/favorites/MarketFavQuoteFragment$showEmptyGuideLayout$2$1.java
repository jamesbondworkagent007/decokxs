package com.okinc.business.market.home.favorites;

import android.content.Context;
import com.okinc.business.market.market.fragment.watchlist.UserGroupEditJumpData;
import com.okinc.market.search.features.favorite.ui.FavoriteSearchActivity;
import com.okinc.market.watch.data.UserGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketFavQuoteFragment$showEmptyGuideLayout$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UserGroup $userGroup;
    int label;
    final /* synthetic */ MarketFavQuoteFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavQuoteFragment$showEmptyGuideLayout$2$1(UserGroup userGroup, MarketFavQuoteFragment marketFavQuoteFragment, Continuation<? super MarketFavQuoteFragment$showEmptyGuideLayout$2$1> continuation) {
        super(2, continuation);
        this.$userGroup = userGroup;
        this.this$0 = marketFavQuoteFragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketFavQuoteFragment$showEmptyGuideLayout$2$1(this.$userGroup, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketFavQuoteFragment$showEmptyGuideLayout$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            UserGroup userGroup = this.$userGroup;
            if (userGroup != null) {
                MarketFavQuoteFragment marketFavQuoteFragment = this.this$0;
                FavoriteSearchActivity.Activity activity = FavoriteSearchActivity.Companion;
                Context context = marketFavQuoteFragment.getContext();
                if (context != null) {
                    activity.AEQbTJ(context, new UserGroupEditJumpData(userGroup.getGroupName(), userGroup.getTranslatedGroupName(), "Discover_Fav", userGroup.isPreset()));
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
