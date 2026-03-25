package com.okinc.business.defi.wallet.mine.search.ui.viewmodel;

import com.okinc.business.defi.wallet.mine.search.data.model.DiscoverSearchParam;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchDAppModel;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchResponse;
import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import o.AbstractC43419rot;
import o.C18902frF;
import o.C18914frR;
import o.C18977fsb;
import o.C33129mqd;
import o.C56391yDq;
import o.C56402yEa;
import o.C56442yFn;
import o.C56443yFo;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class DAppSearchResultViewModel$getSearchResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $searchKeyword;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DAppSearchResultViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppSearchResultViewModel$getSearchResult$1(DAppSearchResultViewModel dAppSearchResultViewModel, String str, Continuation<? super DAppSearchResultViewModel$getSearchResult$1> continuation) {
        super(2, continuation);
        this.this$0 = dAppSearchResultViewModel;
        this.$searchKeyword = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DAppSearchResultViewModel$getSearchResult$1 dAppSearchResultViewModel$getSearchResult$1 = new DAppSearchResultViewModel$getSearchResult$1(this.this$0, this.$searchKeyword, continuation);
        dAppSearchResultViewModel$getSearchResult$1.L$0 = obj;
        return dAppSearchResultViewModel$getSearchResult$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DAppSearchResultViewModel$getSearchResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        DAppSearchResultViewModel dAppSearchResultViewModel;
        String str;
        List<C18977fsb> listAhwBna;
        List<SearchDAppModel> discovers;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            dAppSearchResultViewModel = this.this$0;
            str = this.$searchKeyword;
            Result.Application application2 = Result.Companion;
            C18914frR c18914frR = dAppSearchResultViewModel.OLrzqt;
            List<String> listEZpvd = C56402yEa.EZpvd(WalletSearchRequest.SEARCH_SOURCE_DISCOVER);
            DiscoverSearchParam discoverSearchParam = new DiscoverSearchParam(C56443yFo.KWHzl(dAppSearchResultViewModel.EZpvd), C56443yFo.KWHzl(15L));
            this.L$0 = dAppSearchResultViewModel;
            this.L$1 = str;
            this.label = 1;
            obj = c18914frR.EZpvd(str, null, listEZpvd, discoverSearchParam, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                DAppSearchResultViewModel dAppSearchResultViewModel2 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                    MutableSharedFlow mutableSharedFlow = dAppSearchResultViewModel2.AEQbTJ;
                    List listAhwBna2 = yDY.AhwBna();
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = null;
                    this.label = 4;
                    if (mutableSharedFlow.emit(listAhwBna2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
            str = (String) this.L$1;
            dAppSearchResultViewModel = (DAppSearchResultViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        WalletSearchResponse walletSearchResponse = (WalletSearchResponse) ((AbstractC43419rot) obj).copydefault();
        if (!C33129mqd.KWHzl((Collection) (walletSearchResponse != null ? walletSearchResponse.getDiscovers() : null))) {
            MutableSharedFlow mutableSharedFlow2 = dAppSearchResultViewModel.AEQbTJ;
            List listAhwBna3 = yDY.AhwBna();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            if (mutableSharedFlow2.emit(listAhwBna3, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (walletSearchResponse == null || (discovers = walletSearchResponse.getDiscovers()) == null || (listAhwBna = C18902frF.OLrzqt(discovers, str)) == null) {
                listAhwBna = yDY.AhwBna();
            }
            if (!listAhwBna.isEmpty()) {
                dAppSearchResultViewModel.EZpvd++;
            }
            MutableSharedFlow mutableSharedFlow3 = dAppSearchResultViewModel.AEQbTJ;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (mutableSharedFlow3.emit(listAhwBna, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        DAppSearchResultViewModel dAppSearchResultViewModel22 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
        }
        return Unit.INSTANCE;
    }
}
