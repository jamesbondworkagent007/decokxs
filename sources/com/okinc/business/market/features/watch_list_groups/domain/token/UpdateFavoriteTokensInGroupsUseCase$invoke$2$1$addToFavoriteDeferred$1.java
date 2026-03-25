package com.okinc.business.market.features.watch_list_groups.domain.token;

import com.okinc.business.market.data.model.watchlist.FavoriteAction;
import com.okinc.business.market.data.model.watchlist.UpdateFavoriteTokensRequest;
import com.okinc.business.market.features.group.domain.CommonGroupData;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27770kCs;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC27771kCt;
import o.InterfaceC28415kaO;

/* JADX INFO: loaded from: classes7.dex */
public final class UpdateFavoriteTokensInGroupsUseCase$invoke$2$1$addToFavoriteDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super InterfaceC28415kaO>, Object> {
    final /* synthetic */ FavoriteAction $action;
    final /* synthetic */ List<Integer> $addedGroupIds;
    final /* synthetic */ List<HomeToken> $tokens;
    final /* synthetic */ List<CommonGroupData> $watchlistGroups;
    Object L$0;
    int label;
    final /* synthetic */ C27770kCs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateFavoriteTokensInGroupsUseCase$invoke$2$1$addToFavoriteDeferred$1(List<Integer> list, FavoriteAction favoriteAction, C27770kCs c27770kCs, List<HomeToken> list2, List<CommonGroupData> list3, Continuation<? super UpdateFavoriteTokensInGroupsUseCase$invoke$2$1$addToFavoriteDeferred$1> continuation) {
        super(2, continuation);
        this.$addedGroupIds = list;
        this.$action = favoriteAction;
        this.this$0 = c27770kCs;
        this.$tokens = list2;
        this.$watchlistGroups = list3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpdateFavoriteTokensInGroupsUseCase$invoke$2$1$addToFavoriteDeferred$1(this.$addedGroupIds, this.$action, this.this$0, this.$tokens, this.$watchlistGroups, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super InterfaceC28415kaO> continuation) {
        return ((UpdateFavoriteTokensInGroupsUseCase$invoke$2$1$addToFavoriteDeferred$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<Integer> list;
        List<Integer> list2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if ((!this.$addedGroupIds.isEmpty()) || this.$action == FavoriteAction.AddToWatchList) {
                List<Integer> listEZpvd = this.$addedGroupIds;
                List<CommonGroupData> list3 = this.$watchlistGroups;
                if (listEZpvd.isEmpty()) {
                    listEZpvd = C56402yEa.EZpvd(C56443yFo.AEQbTJ(((CommonGroupData) CollectionsKt___CollectionsKt.AuCTelauCTel(list3)).OLrzqt()));
                }
                C27770kCs c27770kCs = this.this$0;
                List<HomeToken> list4 = this.$tokens;
                this.L$0 = listEZpvd;
                this.label = 1;
                Object objOLrzqt = c27770kCs.OLrzqt(list4, listEZpvd, this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                list = listEZpvd;
                obj = objOLrzqt;
            } else {
                return InterfaceC28415kaO.Activity.KWHzl;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) this.L$0;
                C56391yDq.AEQbTJ(obj);
                int iIntValue = ((Number) obj).intValue();
                C27770kCs c27770kCs2 = this.this$0;
                FavoriteAction favoriteAction = FavoriteAction.AddToWatchList;
                List<CommonGroupData> list5 = this.$watchlistGroups;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list5) {
                    if (list2.contains(C56443yFo.AEQbTJ(((CommonGroupData) obj2).OLrzqt()))) {
                        arrayList.add(obj2);
                    }
                }
                return c27770kCs2.AEQbTJ(favoriteAction, iIntValue, (List<CommonGroupData>) arrayList);
            }
            list = (List) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC27771kCt interfaceC27771kCt = this.this$0.AEQbTJ;
        this.L$0 = list;
        this.label = 2;
        obj = interfaceC27771kCt.KWHzl((UpdateFavoriteTokensRequest) obj, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        list2 = list;
        int iIntValue2 = ((Number) obj).intValue();
        C27770kCs c27770kCs22 = this.this$0;
        FavoriteAction favoriteAction2 = FavoriteAction.AddToWatchList;
        List<CommonGroupData> list52 = this.$watchlistGroups;
        ArrayList arrayList2 = new ArrayList();
        while (r3.hasNext()) {
        }
        return c27770kCs22.AEQbTJ(favoriteAction2, iIntValue2, (List<CommonGroupData>) arrayList2);
    }
}
