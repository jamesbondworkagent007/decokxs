package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.center.bean.enums.CategorySlug;
import com.okinc.okex.search.bean.SearchSectionBean;
import com.okinc.okex.search.bean.SearchSectionResponse;
import com.okinc.okex.search.ui.displaymodels.SearchSectionDisplayModel;
import com.okinc.okex.search.usecase.SearchSectionChipsUseCase$getSearchSectionChips$1;
import com.okinc.okex.search.usecase.SearchSectionChipsUseCase$getSearchSectionChips$result$1$response$1$1;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sBx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class C44061sBx {
    public final java.util.Map<CategorySlug, java.util.Set<SearchSectionBean>> AEQbTJ;
    public final CoroutineDispatcher KWHzl;
    public final InterfaceC44921sfz copydefault;

    @yCM
    public C44061sBx(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC44921sfz interfaceC44921sfz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC44921sfz, "");
        this.KWHzl = coroutineDispatcher;
        this.copydefault = interfaceC44921sfz;
        this.AEQbTJ = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0086 A[Catch: all -> 0x00b6, TRY_LEAVE, TryCatch #2 {all -> 0x00b6, blocks: (B:24:0x006b, B:26:0x0073, B:28:0x0079, B:29:0x0086), top: B:59:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2 A[Catch: all -> 0x00f6, TryCatch #1 {all -> 0x00f6, blocks: (B:36:0x00d5, B:38:0x00e2, B:39:0x00eb, B:35:0x00ba, B:19:0x0054), top: B:56:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull CategorySlug categorySlug, @NotNull Continuation<? super java.util.List<SearchSectionDisplayModel>> continuation) throws java.lang.Throwable {
        SearchSectionChipsUseCase$getSearchSectionChips$1 searchSectionChipsUseCase$getSearchSectionChips$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        C44061sBx c44061sBx;
        AbstractC43419rot actionBar;
        java.util.List<SearchSectionBean> list;
        ResponseData responseData;
        CategorySlug categorySlug2 = categorySlug;
        if (continuation instanceof SearchSectionChipsUseCase$getSearchSectionChips$1) {
            searchSectionChipsUseCase$getSearchSectionChips$1 = (SearchSectionChipsUseCase$getSearchSectionChips$1) continuation;
            int i = searchSectionChipsUseCase$getSearchSectionChips$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchSectionChipsUseCase$getSearchSectionChips$1.label = i - Integer.MIN_VALUE;
            } else {
                searchSectionChipsUseCase$getSearchSectionChips$1 = new SearchSectionChipsUseCase$getSearchSectionChips$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = searchSectionChipsUseCase$getSearchSectionChips$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchSectionChipsUseCase$getSearchSectionChips$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                Result.Application application = Result.Companion;
                try {
                    CoroutineDispatcher coroutineDispatcher = this.KWHzl;
                    SearchSectionChipsUseCase$getSearchSectionChips$result$1$response$1$1 searchSectionChipsUseCase$getSearchSectionChips$result$1$response$1$1 = new SearchSectionChipsUseCase$getSearchSectionChips$result$1$response$1$1(this, categorySlug2, null);
                    searchSectionChipsUseCase$getSearchSectionChips$1.L$0 = categorySlug2;
                    searchSectionChipsUseCase$getSearchSectionChips$1.L$1 = this;
                    searchSectionChipsUseCase$getSearchSectionChips$1.label = 1;
                    objWithContext = BuildersKt.withContext(coroutineDispatcher, searchSectionChipsUseCase$getSearchSectionChips$result$1$response$1$1, searchSectionChipsUseCase$getSearchSectionChips$1);
                } catch (java.lang.Throwable th) {
                    th = th;
                    c44061sBx = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    java.lang.Object objAEQbTJ = actionBar.AEQbTJ();
                    list = ((SearchSectionResponse) objAEQbTJ).getList();
                    if (list != null) {
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(c44061sBx.AEQbTJ((SearchSectionResponse) objAEQbTJ));
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    java.util.List list2 = (java.util.List) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                    if (list2 == null) {
                    }
                }
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                c44061sBx = this;
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    java.lang.Object objAEQbTJ2 = actionBar.AEQbTJ();
                    list = ((SearchSectionResponse) objAEQbTJ2).getList();
                    if (list != null) {
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(c44061sBx.AEQbTJ((SearchSectionResponse) objAEQbTJ2));
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C44061sBx c44061sBx2 = (C44061sBx) searchSectionChipsUseCase$getSearchSectionChips$1.L$1;
                CategorySlug categorySlug3 = (CategorySlug) searchSectionChipsUseCase$getSearchSectionChips$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objWithContext);
                    c44061sBx = c44061sBx2;
                    categorySlug2 = categorySlug3;
                    try {
                        responseData = (ResponseData) objWithContext;
                        if (responseData.getCode() != 0 && responseData.getData() != null) {
                            java.lang.Object data = responseData.getData();
                            Intrinsics.copydefault(data);
                            actionBar = new AbstractC43419rot.StateListAnimator(data);
                        } else {
                            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                        actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    c44061sBx = c44061sBx2;
                    categorySlug2 = categorySlug3;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    java.lang.Object objAEQbTJ22 = actionBar.AEQbTJ();
                    list = ((SearchSectionResponse) objAEQbTJ22).getList();
                    if (list != null) {
                    }
                    objM7377constructorimpl = Result.m7377constructorimpl(c44061sBx.AEQbTJ((SearchSectionResponse) objAEQbTJ22));
                    thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                    if (thM7380exceptionOrNullimpl != null) {
                    }
                    java.util.List list22 = (java.util.List) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                    if (list22 == null) {
                    }
                }
                java.lang.Object objAEQbTJ222 = actionBar.AEQbTJ();
                list = ((SearchSectionResponse) objAEQbTJ222).getList();
                if (list != null) {
                    c44061sBx.AEQbTJ.put(categorySlug2, CollectionsKt___CollectionsKt.OqFWZa(list));
                }
                objM7377constructorimpl = Result.m7377constructorimpl(c44061sBx.AEQbTJ((SearchSectionResponse) objAEQbTJ222));
            }
        } catch (java.lang.Throwable th4) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th4));
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44760scx.log$default("getSearchSections failed: " + thM7380exceptionOrNullimpl, null, 2, null);
        }
        java.util.List list222 = (java.util.List) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        return list222 == null ? yDY.AhwBna() : list222;
    }

    public final java.lang.String OLrzqt(@NotNull CategorySlug categorySlug, @NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(categorySlug, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Set<SearchSectionBean> set = this.AEQbTJ.get(categorySlug);
        if (set == null) {
            return null;
        }
        java.util.Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((SearchSectionBean) next).getId(), (java.lang.Object) str)) {
                break;
            }
        }
        SearchSectionBean searchSectionBean = (SearchSectionBean) next;
        if (searchSectionBean != null) {
            return searchSectionBean.getTitle();
        }
        return null;
    }

    public final java.util.List<SearchSectionDisplayModel> AEQbTJ(SearchSectionResponse searchSectionResponse) {
        java.util.ArrayList arrayList;
        java.util.List<SearchSectionBean> list = searchSectionResponse.getList();
        if (list != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(C44054sBq.AEQbTJ((SearchSectionBean) it.next()));
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? yDY.AhwBna() : arrayList;
    }
}
