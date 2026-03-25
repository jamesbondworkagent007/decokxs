package com.okinc.business.defi.wallet.mine.search.ui.viewmodel;

import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchResultBean;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C18898frB;
import o.C18916frT;
import o.C19000fsy;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchWalletAssetResultViewModel$getSearchResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $searchKeyword;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SearchWalletAssetResultViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchWalletAssetResultViewModel$getSearchResult$1(SearchWalletAssetResultViewModel searchWalletAssetResultViewModel, String str, Continuation<? super SearchWalletAssetResultViewModel$getSearchResult$1> continuation) {
        super(2, continuation);
        this.this$0 = searchWalletAssetResultViewModel;
        this.$searchKeyword = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchWalletAssetResultViewModel$getSearchResult$1(this.this$0, this.$searchKeyword, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchWalletAssetResultViewModel$getSearchResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0121 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Throwable thM7380exceptionOrNullimpl;
        Object obj2;
        SearchWalletAssetResultViewModel searchWalletAssetResultViewModel;
        MutableSharedFlow mutableSharedFlow;
        C19000fsy c19000fsy;
        SearchWalletAssetResultViewModel searchWalletAssetResultViewModel2;
        Object objAEQbTJ;
        SearchWalletAssetResultViewModel searchWalletAssetResultViewModel3;
        C19000fsy c19000fsy2;
        MutableSharedFlow mutableSharedFlow2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            searchWalletAssetResultViewModel2 = this.this$0;
            String str = this.$searchKeyword;
            Result.Application application2 = Result.Companion;
            C18916frT c18916frT = searchWalletAssetResultViewModel2.EZpvd;
            this.L$0 = searchWalletAssetResultViewModel2;
            this.label = 1;
            objAEQbTJ = c18916frT.AEQbTJ(str, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    c19000fsy2 = (C19000fsy) this.L$1;
                    searchWalletAssetResultViewModel3 = (SearchWalletAssetResultViewModel) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    mutableSharedFlow2 = searchWalletAssetResultViewModel3.KWHzl;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    if (mutableSharedFlow2.emit(c19000fsy2, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                    SearchWalletAssetResultViewModel searchWalletAssetResultViewModel4 = this.this$0;
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    searchWalletAssetResultViewModel = (SearchWalletAssetResultViewModel) this.L$1;
                    obj2 = this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    mutableSharedFlow = searchWalletAssetResultViewModel.KWHzl;
                    c19000fsy = new C19000fsy(null, null, null, null, 15, null);
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.label = 5;
                    if (mutableSharedFlow.emit(c19000fsy, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
                SearchWalletAssetResultViewModel searchWalletAssetResultViewModel42 = this.this$0;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.copydefault("SearchWalletAssetResultViewModel", "SearchWalletAssetResultViewModel getSearchResult error message = " + thM7380exceptionOrNullimpl.getMessage());
                    MutableStateFlow mutableStateFlow = searchWalletAssetResultViewModel42.OLrzqt;
                    C19000fsy c19000fsy3 = new C19000fsy(null, null, null, null, 15, null);
                    this.L$0 = objM7377constructorimpl;
                    this.L$1 = searchWalletAssetResultViewModel42;
                    this.label = 4;
                    if (mutableStateFlow.emit(c19000fsy3, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objM7377constructorimpl;
                    searchWalletAssetResultViewModel = searchWalletAssetResultViewModel42;
                    mutableSharedFlow = searchWalletAssetResultViewModel.KWHzl;
                    c19000fsy = new C19000fsy(null, null, null, null, 15, null);
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.label = 5;
                    if (mutableSharedFlow.emit(c19000fsy, this) == objCopydefault) {
                    }
                }
                return Unit.INSTANCE;
            }
            searchWalletAssetResultViewModel2 = (SearchWalletAssetResultViewModel) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        }
        WalletSearchResultBean walletSearchResultBean = (WalletSearchResultBean) objAEQbTJ;
        C19000fsy c19000fsy4 = new C19000fsy(C18898frB.AEQbTJ(walletSearchResultBean.getCoinAssets()), C18898frB.EZpvd(walletSearchResultBean.getCustomCoinAsset()), C18898frB.OLrzqt(walletSearchResultBean.getDefiAssets()), C18898frB.copydefault(walletSearchResultBean.getNftAssets()));
        MutableStateFlow mutableStateFlow2 = searchWalletAssetResultViewModel2.OLrzqt;
        this.L$0 = searchWalletAssetResultViewModel2;
        this.L$1 = c19000fsy4;
        this.label = 2;
        if (mutableStateFlow2.emit(c19000fsy4, this) == objCopydefault) {
            return objCopydefault;
        }
        searchWalletAssetResultViewModel3 = searchWalletAssetResultViewModel2;
        c19000fsy2 = c19000fsy4;
        mutableSharedFlow2 = searchWalletAssetResultViewModel3.KWHzl;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        if (mutableSharedFlow2.emit(c19000fsy2, this) == objCopydefault) {
        }
        objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        SearchWalletAssetResultViewModel searchWalletAssetResultViewModel422 = this.this$0;
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
