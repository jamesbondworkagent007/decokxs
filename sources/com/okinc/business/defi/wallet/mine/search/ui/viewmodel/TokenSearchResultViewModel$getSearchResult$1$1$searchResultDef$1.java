package com.okinc.business.defi.wallet.mine.search.ui.viewmodel;

import com.okinc.business.defi.wallet.mine.search.data.model.DiscoverSearchParam;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchResponse;
import com.okinc.network.okg.response.OKServerException;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C18914frR;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class TokenSearchResultViewModel$getSearchResult$1$1$searchResultDef$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends WalletSearchResponse, ? extends OKServerException>>, Object> {
    final /* synthetic */ boolean $isFilter;
    final /* synthetic */ String $searchKeyword;
    int label;
    final /* synthetic */ TokenSearchResultViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenSearchResultViewModel$getSearchResult$1$1$searchResultDef$1(TokenSearchResultViewModel tokenSearchResultViewModel, String str, boolean z, Continuation<? super TokenSearchResultViewModel$getSearchResult$1$1$searchResultDef$1> continuation) {
        super(2, continuation);
        this.this$0 = tokenSearchResultViewModel;
        this.$searchKeyword = str;
        this.$isFilter = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenSearchResultViewModel$getSearchResult$1$1$searchResultDef$1(this.this$0, this.$searchKeyword, this.$isFilter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends WalletSearchResponse, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<WalletSearchResponse, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<WalletSearchResponse, OKServerException>> continuation) {
        return ((TokenSearchResultViewModel$getSearchResult$1$1$searchResultDef$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C18914frR c18914frR = this.this$0.isConnected;
            String str = this.$searchKeyword;
            Long lKWHzl = this.$isFilter ? C56443yFo.KWHzl(this.this$0.valueOf) : null;
            List<String> listGEmmrt = yDY.gEmmrt("token", WalletSearchRequest.SEARCH_SOURCE_ADDRESS, WalletSearchRequest.SEARCH_SOURCE_DISCOVER);
            DiscoverSearchParam discoverSearchParam = new DiscoverSearchParam(C56443yFo.KWHzl(1L), C56443yFo.KWHzl(15L));
            this.label = 1;
            obj = c18914frR.EZpvd(str, lKWHzl, listGEmmrt, discoverSearchParam, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
