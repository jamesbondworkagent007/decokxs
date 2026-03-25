package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.center.bean.enums.CategorySlug;
import com.okinc.okex.search.bean.SearchArticleBean;
import com.okinc.okex.search.bean.SearchArticleResponse;
import com.okinc.okex.search.ui.displaymodels.SearchArticleDisplayModel;
import com.okinc.okex.search.usecase.SearchArticlesUseCase$getSearchArticles$1;
import com.okinc.okex.search.usecase.SearchArticlesUseCase$getSearchArticles$result$1$response$1$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sBv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44059sBv {
    public final InterfaceC44921sfz AEQbTJ;
    public final CoroutineDispatcher KWHzl;
    public final C44061sBx copydefault;

    @yCM
    public C44059sBv(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC44921sfz interfaceC44921sfz, @NotNull C44061sBx c44061sBx) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC44921sfz, "");
        Intrinsics.checkNotNullParameter(c44061sBx, "");
        this.KWHzl = coroutineDispatcher;
        this.AEQbTJ = interfaceC44921sfz;
        this.copydefault = c44061sBx;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.lang.String str, java.util.List<? extends CategorySlug> list, java.util.List<java.lang.String> list2, int i, int i2, @NotNull Continuation<? super java.util.List<SearchArticleDisplayModel>> continuation) throws java.lang.Throwable {
        SearchArticlesUseCase$getSearchArticles$1 searchArticlesUseCase$getSearchArticles$1;
        java.lang.Object objM7377constructorimpl;
        C44059sBv c44059sBv;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof SearchArticlesUseCase$getSearchArticles$1) {
            searchArticlesUseCase$getSearchArticles$1 = (SearchArticlesUseCase$getSearchArticles$1) continuation;
            int i3 = searchArticlesUseCase$getSearchArticles$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                searchArticlesUseCase$getSearchArticles$1.label = i3 - Integer.MIN_VALUE;
            } else {
                searchArticlesUseCase$getSearchArticles$1 = new SearchArticlesUseCase$getSearchArticles$1(this, continuation);
            }
        }
        SearchArticlesUseCase$getSearchArticles$1 searchArticlesUseCase$getSearchArticles$12 = searchArticlesUseCase$getSearchArticles$1;
        java.lang.Object objWithContext = searchArticlesUseCase$getSearchArticles$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = searchArticlesUseCase$getSearchArticles$12.label;
        try {
            if (i4 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                Result.Application application = Result.Companion;
                try {
                    CoroutineDispatcher coroutineDispatcher = this.KWHzl;
                    SearchArticlesUseCase$getSearchArticles$result$1$response$1$1 searchArticlesUseCase$getSearchArticles$result$1$response$1$1 = new SearchArticlesUseCase$getSearchArticles$result$1$response$1$1(this, str, list, list2, i, i2, null);
                    searchArticlesUseCase$getSearchArticles$12.L$0 = this;
                    searchArticlesUseCase$getSearchArticles$12.label = 1;
                    objWithContext = BuildersKt.withContext(coroutineDispatcher, searchArticlesUseCase$getSearchArticles$result$1$response$1$1, searchArticlesUseCase$getSearchArticles$12);
                } catch (java.lang.Throwable th) {
                    th = th;
                    c44059sBv = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                c44059sBv = this;
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                }
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                stateListAnimator = actionBar;
                objM7377constructorimpl = Result.m7377constructorimpl(c44059sBv.EZpvd((SearchArticleResponse) stateListAnimator.AEQbTJ()));
            } else {
                if (i4 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c44059sBv = (C44059sBv) searchArticlesUseCase$getSearchArticles$12.L$0;
                try {
                    C56391yDq.AEQbTJ(objWithContext);
                    responseData = (ResponseData) objWithContext;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    stateListAnimator = new AbstractC43419rot.StateListAnimator(data);
                    objM7377constructorimpl = Result.m7377constructorimpl(c44059sBv.EZpvd((SearchArticleResponse) stateListAnimator.AEQbTJ()));
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    stateListAnimator = actionBar;
                    objM7377constructorimpl = Result.m7377constructorimpl(c44059sBv.EZpvd((SearchArticleResponse) stateListAnimator.AEQbTJ()));
                }
            }
        } catch (java.lang.Throwable th3) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44760scx.log$default("getSearchArticles failed: " + thM7380exceptionOrNullimpl, null, 2, null);
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        java.util.List list3 = (java.util.List) objM7377constructorimpl;
        return list3 == null ? yDY.AhwBna() : list3;
    }

    public final java.util.List<SearchArticleDisplayModel> EZpvd(SearchArticleResponse searchArticleResponse) {
        java.util.ArrayList arrayList;
        java.util.List<SearchArticleBean> list = searchArticleResponse.getList();
        if (list != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (SearchArticleBean searchArticleBean : list) {
                CategorySlug categorySlug = searchArticleBean.getCategorySlug();
                java.lang.String rootSectionId = searchArticleBean.getRootSectionId();
                arrayList.add(C44049sBl.KWHzl(searchArticleBean, (categorySlug == null || rootSectionId == null) ? "" : this.copydefault.OLrzqt(categorySlug, rootSectionId)));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? yDY.AhwBna() : arrayList;
    }
}
