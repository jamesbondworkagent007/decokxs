package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.bean.SelfServiceTools;
import com.okinc.okex.search.bean.SearchArticleBean;
import com.okinc.okex.search.bean.SearchArticleResponse;
import com.okinc.okex.search.bean.SearchIntentEntry;
import com.okinc.okex.search.bean.SearchIntentResponse;
import com.okinc.okex.search.usecase.SearchIntentsUseCase$getSearchIntents$1;
import com.okinc.okex.search.usecase.SearchIntentsUseCase$getSearchIntents$result$1$response$1$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import o.AbstractC44051sBn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sBA {
    public final InterfaceC45301snH EZpvd;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public sBA(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC45301snH interfaceC45301snH) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC45301snH, "");
        this.KWHzl = coroutineDispatcher;
        this.EZpvd = interfaceC45301snH;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #2 {all -> 0x0036, blocks: (B:12:0x0032, B:24:0x005b, B:26:0x0063, B:28:0x0069, B:29:0x0076), top: B:51:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super C44052sBo> continuation) throws java.lang.Throwable {
        SearchIntentsUseCase$getSearchIntents$1 searchIntentsUseCase$getSearchIntents$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        sBA sba;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        if (continuation instanceof SearchIntentsUseCase$getSearchIntents$1) {
            searchIntentsUseCase$getSearchIntents$1 = (SearchIntentsUseCase$getSearchIntents$1) continuation;
            int i = searchIntentsUseCase$getSearchIntents$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchIntentsUseCase$getSearchIntents$1.label = i - Integer.MIN_VALUE;
            } else {
                searchIntentsUseCase$getSearchIntents$1 = new SearchIntentsUseCase$getSearchIntents$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = searchIntentsUseCase$getSearchIntents$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchIntentsUseCase$getSearchIntents$1.label;
        try {
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            Result.Application application2 = Result.Companion;
            try {
                CoroutineDispatcher coroutineDispatcher = this.KWHzl;
                SearchIntentsUseCase$getSearchIntents$result$1$response$1$1 searchIntentsUseCase$getSearchIntents$result$1$response$1$1 = new SearchIntentsUseCase$getSearchIntents$result$1$response$1$1(this, str, null);
                searchIntentsUseCase$getSearchIntents$1.L$0 = this;
                searchIntentsUseCase$getSearchIntents$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, searchIntentsUseCase$getSearchIntents$result$1$response$1$1, searchIntentsUseCase$getSearchIntents$1);
            } catch (java.lang.Throwable th2) {
                th = th2;
                sba = this;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            sba = this;
            responseData = (ResponseData) objWithContext;
            if (responseData.getCode() != 0) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                C44760scx.log$default("getSearchIntents failed: " + thM7380exceptionOrNullimpl, null, 2, null);
            }
            return (C44052sBo) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        sba = (sBA) searchIntentsUseCase$getSearchIntents$1.L$0;
        try {
            C56391yDq.AEQbTJ(objWithContext);
            responseData = (ResponseData) objWithContext;
            if (responseData.getCode() != 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        objM7377constructorimpl = Result.m7377constructorimpl(sba.OLrzqt((SearchIntentResponse) actionBar.AEQbTJ()));
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return (C44052sBo) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public final C44052sBo OLrzqt(SearchIntentResponse searchIntentResponse) {
        java.util.List listAhwBna;
        java.util.List<SearchArticleBean> list;
        SearchIntentEntry intentEntry = searchIntentResponse.getIntentEntry();
        java.util.List listAhwBna2 = null;
        java.lang.String answer = intentEntry != null ? intentEntry.getAnswer() : null;
        if (answer == null) {
            answer = "";
        }
        SelfServiceTools selfServiceTools = searchIntentResponse.getSelfServiceTools();
        if (selfServiceTools != null) {
            java.util.List<SelfServiceToolBean> list2 = selfServiceTools.getList();
            if (list2 == null) {
                listAhwBna = yDY.AhwBna();
            } else {
                listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
                java.util.Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    listAhwBna.add(C44855sem.OLrzqt((SelfServiceToolBean) it.next()));
                }
            }
        } else {
            listAhwBna = null;
        }
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        SearchArticleResponse articles = searchIntentResponse.getArticles();
        if (articles != null && (list = articles.getList()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new AbstractC44051sBn.Application(C44049sBl.toSearchArticleDisplayModel$default((SearchArticleBean) it2.next(), null, 1, null)));
            }
            listAhwBna2 = arrayList;
        }
        if (listAhwBna2 == null) {
            listAhwBna2 = yDY.AhwBna();
        }
        return new C44052sBo(answer, listAhwBna, listAhwBna2);
    }
}
