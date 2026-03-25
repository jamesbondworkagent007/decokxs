package com.okinc.business.defi.wallet.mine.search.ui.viewmodel;

import com.okinc.business.defi.wallet.mine.search.data.model.SearchDAppInfo;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchTokenModel;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletHotSearchResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C11600cUg;
import o.C18904frH;
import o.C18913frQ;
import o.C18981fsf;
import o.C18987fsl;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchMainViewModel$getHotSearchList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ SearchMainViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchMainViewModel$getHotSearchList$1(SearchMainViewModel searchMainViewModel, Continuation<? super SearchMainViewModel$getHotSearchList$1> continuation) {
        super(2, continuation);
        this.this$0 = searchMainViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchMainViewModel$getHotSearchList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SearchMainViewModel$getHotSearchList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objWithContext;
        AbstractC43419rot abstractC43419rot;
        WalletHotSearchResponse walletHotSearchResponse;
        Object objOLrzqt;
        MutableStateFlow mutableStateFlow;
        int i;
        AbstractC43419rot abstractC43419rot2;
        List<SearchDAppInfo> discovers;
        ArrayList arrayList;
        C18981fsf c18981fsf;
        AbstractC43419rot abstractC43419rot3;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow2 = this.this$0.EZpvd;
            C18981fsf c18981fsf2 = new C18981fsf(true, null, null, false, 14, null);
            this.label = 1;
            if (mutableStateFlow2.emit(c18981fsf2, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(obj);
                    objWithContext = obj;
                    abstractC43419rot = (AbstractC43419rot) objWithContext;
                    SearchMainViewModel searchMainViewModel = this.this$0;
                    if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                        walletHotSearchResponse = (WalletHotSearchResponse) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                        MutableStateFlow mutableStateFlow3 = searchMainViewModel.EZpvd;
                        List<SearchTokenModel> tokens = walletHotSearchResponse.getTokens();
                        C18913frQ c18913frQ = searchMainViewModel.valueOf;
                        this.L$0 = abstractC43419rot;
                        this.L$1 = abstractC43419rot;
                        this.L$2 = walletHotSearchResponse;
                        this.L$3 = mutableStateFlow3;
                        this.I$0 = 0;
                        this.label = 3;
                        objOLrzqt = C18904frH.OLrzqt(tokens, c18913frQ, this);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        mutableStateFlow = mutableStateFlow3;
                        i = 0;
                        abstractC43419rot2 = abstractC43419rot;
                        List list = (List) objOLrzqt;
                        discovers = walletHotSearchResponse.getDiscovers();
                        if (discovers == null) {
                        }
                        c18981fsf = new C18981fsf(i == 0, list, arrayList, false, 9, null);
                        this.L$0 = abstractC43419rot;
                        this.L$1 = abstractC43419rot2;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 4;
                        if (mutableStateFlow.emit(c18981fsf, this) != objCopydefault) {
                        }
                    }
                    SearchMainViewModel searchMainViewModel2 = this.this$0;
                    if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    abstractC43419rot3 = (AbstractC43419rot) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    abstractC43419rot = abstractC43419rot3;
                    SearchMainViewModel searchMainViewModel22 = this.this$0;
                    if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                        MutableStateFlow mutableStateFlow4 = searchMainViewModel22.EZpvd;
                        C18981fsf c18981fsf3 = new C18981fsf(false, null, null, true, 7, null);
                        this.L$0 = abstractC43419rot;
                        this.L$1 = null;
                        this.label = 5;
                        if (mutableStateFlow4.emit(c18981fsf3, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                int i3 = this.I$0;
                mutableStateFlow = (MutableStateFlow) this.L$3;
                walletHotSearchResponse = (WalletHotSearchResponse) this.L$2;
                AbstractC43419rot abstractC43419rot4 = (AbstractC43419rot) this.L$1;
                AbstractC43419rot abstractC43419rot5 = (AbstractC43419rot) this.L$0;
                C56391yDq.AEQbTJ(obj);
                i = i3;
                objOLrzqt = obj;
                abstractC43419rot2 = abstractC43419rot4;
                abstractC43419rot = abstractC43419rot5;
                List list2 = (List) objOLrzqt;
                discovers = walletHotSearchResponse.getDiscovers();
                if (discovers == null) {
                    ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(discovers, 10));
                    for (SearchDAppInfo searchDAppInfo : discovers) {
                        long jCopydefault = C11600cUg.copydefault(searchDAppInfo.getId());
                        String logo = searchDAppInfo.getLogo();
                        String str = logo == null ? "" : logo;
                        String name = searchDAppInfo.getName();
                        String str2 = name == null ? "" : name;
                        String url = searchDAppInfo.getUrl();
                        arrayList2.add(new C18987fsl(jCopydefault, str2, str, url == null ? "" : url));
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                c18981fsf = new C18981fsf(i == 0, list2, arrayList, false, 9, null);
                this.L$0 = abstractC43419rot;
                this.L$1 = abstractC43419rot2;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 4;
                if (mutableStateFlow.emit(c18981fsf, this) != objCopydefault) {
                    return objCopydefault;
                }
                abstractC43419rot3 = abstractC43419rot;
                abstractC43419rot = abstractC43419rot3;
                SearchMainViewModel searchMainViewModel222 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        CoroutineDispatcher coroutineDispatcher = this.this$0.copydefault;
        SearchMainViewModel$getHotSearchList$1$hotSearchResult$1 searchMainViewModel$getHotSearchList$1$hotSearchResult$1 = new SearchMainViewModel$getHotSearchList$1$hotSearchResult$1(this.this$0, null);
        this.label = 2;
        objWithContext = BuildersKt.withContext(coroutineDispatcher, searchMainViewModel$getHotSearchList$1$hotSearchResult$1, this);
        if (objWithContext == objCopydefault) {
            return objCopydefault;
        }
        abstractC43419rot = (AbstractC43419rot) objWithContext;
        SearchMainViewModel searchMainViewModel3 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
        }
        SearchMainViewModel searchMainViewModel2222 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
