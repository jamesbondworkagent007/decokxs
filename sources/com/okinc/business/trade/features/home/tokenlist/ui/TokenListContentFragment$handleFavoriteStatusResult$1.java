package com.okinc.business.trade.features.home.tokenlist.ui;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.market.data.model.watchlist.FavoriteAction;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode;
import com.okinc.business.market.features.watch_list_groups.ui.models.TokenGroupSelectionParams;
import com.okinc.business.trade.features.home.tokenlist.ui.TokenListContentFragment$handleFavoriteStatusResult$1;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C23274hvD;
import o.C30429law;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28415kaO;
import o.kCW;
import o.kZJ;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenListContentFragment$handleFavoriteStatusResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FavoriteAction $action;
    final /* synthetic */ DexMultiTokenInfoBean $item;
    final /* synthetic */ List<Integer> $selectedGroupIds;
    final /* synthetic */ List<HomeToken> $tokens;
    final /* synthetic */ List<Integer> $unSelectedGroupIds;
    int label;
    final /* synthetic */ kZJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenListContentFragment$handleFavoriteStatusResult$1(kZJ kzj, FavoriteAction favoriteAction, List<HomeToken> list, List<Integer> list2, List<Integer> list3, DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super TokenListContentFragment$handleFavoriteStatusResult$1> continuation) {
        super(2, continuation);
        this.this$0 = kzj;
        this.$action = favoriteAction;
        this.$tokens = list;
        this.$selectedGroupIds = list2;
        this.$unSelectedGroupIds = list3;
        this.$item = dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenListContentFragment$handleFavoriteStatusResult$1(this.this$0, this.$action, this.$tokens, this.$selectedGroupIds, this.$unSelectedGroupIds, this.$item, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenListContentFragment$handleFavoriteStatusResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C30429law c30429lawValues = this.this$0.values();
            FavoriteAction favoriteAction = this.$action;
            List<HomeToken> list = this.$tokens;
            List<Integer> list2 = this.$selectedGroupIds;
            List<Integer> list3 = this.$unSelectedGroupIds;
            this.label = 1;
            objKWHzl = c30429lawValues.KWHzl(favoriteAction, list, list2, list3, this);
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
        final kZJ kzj = this.this$0;
        final DexMultiTokenInfoBean dexMultiTokenInfoBean = this.$item;
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            final InterfaceC28415kaO interfaceC28415kaO = (InterfaceC28415kaO) objKWHzl;
            if (interfaceC28415kaO instanceof InterfaceC28415kaO.Dialog) {
                kzj.values().AEQbTJ(dexMultiTokenInfoBean);
                kCW.Companion.OLrzqt(new TokenGroupSelectionParams(((InterfaceC28415kaO.Dialog) interfaceC28415kaO).EZpvd(), GroupSelectionMode.INDIVIDUAL, null, 4, null)).show(kzj.getChildFragmentManager(), "TokenGroupSelectionBottomSheet");
            } else {
                kzj.gEmmrt().OLrzqt(interfaceC28415kaO, new Function0() { // from class: o.kZZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return TokenListContentFragment$handleFavoriteStatusResult$1.invokeSuspend$lambda$1$lambda$0(kzj, dexMultiTokenInfoBean, interfaceC28415kaO);
                    }
                });
            }
        }
        if (Result.m7380exceptionOrNullimpl(objKWHzl) != null) {
            C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.UscePu, 0, 1, (Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(kZJ kzj, DexMultiTokenInfoBean dexMultiTokenInfoBean, InterfaceC28415kaO interfaceC28415kaO) {
        kzj.values().AhwBna();
        kzj.valueOf().AEQbTJ(dexMultiTokenInfoBean, Intrinsics.EZpvd(interfaceC28415kaO, InterfaceC28415kaO.LoaderManager.OLrzqt));
        return Unit.INSTANCE;
    }
}
