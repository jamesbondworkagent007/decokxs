package com.okinc.business.market.features.home_favorite_list.ui;

import com.okinc.business.market.data.model.watchlist.FavoriteAction;
import com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$handleFavoriteStatusResult$1;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode;
import com.okinc.business.market.features.watch_list_groups.ui.models.TokenGroupSelectionParams;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23274hvD;
import o.C28425kaY;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28415kaO;
import o.kCM;
import o.kCW;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeFavoriteListFragment$handleFavoriteStatusResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FavoriteAction $action;
    final /* synthetic */ List<Integer> $selectedGroupIds;
    final /* synthetic */ List<HomeToken> $tokens;
    final /* synthetic */ List<Integer> $unSelectedGroupIds;
    int label;
    final /* synthetic */ C28425kaY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFavoriteListFragment$handleFavoriteStatusResult$1(C28425kaY c28425kaY, FavoriteAction favoriteAction, List<HomeToken> list, List<Integer> list2, List<Integer> list3, Continuation<? super HomeFavoriteListFragment$handleFavoriteStatusResult$1> continuation) {
        super(2, continuation);
        this.this$0 = c28425kaY;
        this.$action = favoriteAction;
        this.$tokens = list;
        this.$selectedGroupIds = list2;
        this.$unSelectedGroupIds = list3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeFavoriteListFragment$handleFavoriteStatusResult$1(this.this$0, this.$action, this.$tokens, this.$selectedGroupIds, this.$unSelectedGroupIds, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeFavoriteListFragment$handleFavoriteStatusResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            HomeFavoriteListViewModel homeFavoriteListViewModelDjBIcL = this.this$0.djBIcL();
            FavoriteAction favoriteAction = this.$action;
            List<HomeToken> list = this.$tokens;
            List<Integer> list2 = this.$selectedGroupIds;
            List<Integer> list3 = this.$unSelectedGroupIds;
            this.label = 1;
            objAEQbTJ = homeFavoriteListViewModelDjBIcL.AEQbTJ(favoriteAction, list, list2, list3, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        final C28425kaY c28425kaY = this.this$0;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            InterfaceC28415kaO interfaceC28415kaO = (InterfaceC28415kaO) objAEQbTJ;
            if (!(interfaceC28415kaO instanceof InterfaceC28415kaO.Dialog)) {
                kCM kcm = c28425kaY.values;
                if (kcm != null) {
                    kcm.OLrzqt(interfaceC28415kaO, new Function0() { // from class: o.kbz
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return HomeFavoriteListFragment$handleFavoriteStatusResult$1.invokeSuspend$lambda$1$lambda$0(c28425kaY);
                        }
                    });
                }
            } else {
                kCW.Companion.OLrzqt(new TokenGroupSelectionParams(((InterfaceC28415kaO.Dialog) interfaceC28415kaO).EZpvd(), GroupSelectionMode.INDIVIDUAL, null, 4, null)).show(c28425kaY.getChildFragmentManager(), "TokenGroupSelectionBottomSheet");
            }
        }
        if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
            C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.UscePu, 0, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(C28425kaY c28425kaY) {
        HomeFavoriteListViewModel.loadData$default(c28425kaY.djBIcL(), false, false, false, 3, null);
        return Unit.INSTANCE;
    }
}
