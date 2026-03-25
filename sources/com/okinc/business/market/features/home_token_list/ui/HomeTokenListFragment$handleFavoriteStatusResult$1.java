package com.okinc.business.market.features.home_token_list.ui;

import com.okinc.business.market.data.model.watchlist.FavoriteAction;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import com.okinc.business.market.features.home_token_list.ui.HomeTokenListFragment$handleFavoriteStatusResult$1;
import com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode;
import com.okinc.business.market.features.watch_list_groups.ui.models.TokenGroupSelectionParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23274hvD;
import o.C28558kcz;
import o.C55326xho;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC28415kaO;
import o.kCM;
import o.kCW;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeTokenListFragment$handleFavoriteStatusResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FavoriteAction $action;
    final /* synthetic */ List<Integer> $selectedGroupIds;
    final /* synthetic */ List<HomeToken> $tokens;
    final /* synthetic */ List<Integer> $unSelectedGroupIds;
    int label;
    final /* synthetic */ C28558kcz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeTokenListFragment$handleFavoriteStatusResult$1(C28558kcz c28558kcz, FavoriteAction favoriteAction, List<HomeToken> list, List<Integer> list2, List<Integer> list3, Continuation<? super HomeTokenListFragment$handleFavoriteStatusResult$1> continuation) {
        super(2, continuation);
        this.this$0 = c28558kcz;
        this.$action = favoriteAction;
        this.$tokens = list;
        this.$selectedGroupIds = list2;
        this.$unSelectedGroupIds = list3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeTokenListFragment$handleFavoriteStatusResult$1(this.this$0, this.$action, this.$tokens, this.$selectedGroupIds, this.$unSelectedGroupIds, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeTokenListFragment$handleFavoriteStatusResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            HomeTokenListViewModel homeTokenListViewModelAYXKKw = this.this$0.AYXKKw();
            FavoriteAction favoriteAction = this.$action;
            List<HomeToken> list = this.$tokens;
            List<Integer> list2 = this.$selectedGroupIds;
            List<Integer> list3 = this.$unSelectedGroupIds;
            this.label = 1;
            objKWHzl = homeTokenListViewModelAYXKKw.KWHzl(favoriteAction, list, list2, list3, this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        final C28558kcz c28558kcz = this.this$0;
        final List<HomeToken> list4 = this.$tokens;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            final InterfaceC28415kaO interfaceC28415kaO = (InterfaceC28415kaO) objKWHzl;
            if (!(interfaceC28415kaO instanceof InterfaceC28415kaO.Dialog)) {
                kCM kcm = c28558kcz.valueOf;
                if (kcm != null) {
                    kcm.OLrzqt(interfaceC28415kaO, new Function0() { // from class: o.kcK
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return HomeTokenListFragment$handleFavoriteStatusResult$1.invokeSuspend$lambda$2$lambda$1(c28558kcz, interfaceC28415kaO, list4);
                        }
                    });
                }
            } else {
                kCW.Companion.OLrzqt(new TokenGroupSelectionParams(((InterfaceC28415kaO.Dialog) interfaceC28415kaO).EZpvd(), GroupSelectionMode.INDIVIDUAL, null, 4, null)).show(c28558kcz.getChildFragmentManager(), "TokenGroupSelectionBottomSheet");
            }
        }
        if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
            C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.UscePu, 0, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$2$lambda$1(C28558kcz c28558kcz, InterfaceC28415kaO interfaceC28415kaO, List list) {
        c28558kcz.AYXKKw().AEQbTJ();
        boolean z = interfaceC28415kaO instanceof InterfaceC28415kaO.ActionBar;
        if (z || (interfaceC28415kaO instanceof InterfaceC28415kaO.LoaderManager)) {
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((HomeToken) it.next()).AYXKKw());
            }
            c28558kcz.EZpvd((List<String>) arrayList, z);
        }
        return Unit.INSTANCE;
    }
}
