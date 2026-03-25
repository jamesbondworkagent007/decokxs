package o;

import androidx.camera.video.AudioStats;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.center.bean.enums.CategorySlug;
import com.okinc.okex.search.bean.SearchArticleBean;
import com.okinc.okex.search.bean.SearchHintResponse;
import com.okinc.okex.search.bean.SearchIntentHint;
import com.okinc.okex.search.usecase.SearchHintsUseCase$getSearchHints$1;
import com.okinc.okex.search.usecase.SearchHintsUseCase$getSearchHints$result$1$response$1$1;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import o.AbstractC44051sBn;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sBr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44055sBr {
    public final InterfaceC45301snH EZpvd;
    public final CoroutineDispatcher OLrzqt;
    public final InterfaceC33171mrS copydefault;

    @yCM
    public C44055sBr(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC45301snH interfaceC45301snH, @NotNull InterfaceC33171mrS interfaceC33171mrS) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC45301snH, "");
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        this.OLrzqt = coroutineDispatcher;
        this.EZpvd = interfaceC45301snH;
        this.copydefault = interfaceC33171mrS;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, java.util.List<? extends CategorySlug> list, java.lang.Integer num, java.lang.Integer num2, @NotNull Continuation<? super java.util.List<? extends AbstractC44051sBn>> continuation) throws java.lang.Throwable {
        SearchHintsUseCase$getSearchHints$1 searchHintsUseCase$getSearchHints$1;
        java.lang.Object objM7377constructorimpl;
        C44055sBr c44055sBr;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator;
        ResponseData responseData;
        if (continuation instanceof SearchHintsUseCase$getSearchHints$1) {
            searchHintsUseCase$getSearchHints$1 = (SearchHintsUseCase$getSearchHints$1) continuation;
            int i = searchHintsUseCase$getSearchHints$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                searchHintsUseCase$getSearchHints$1.label = i - Integer.MIN_VALUE;
            } else {
                searchHintsUseCase$getSearchHints$1 = new SearchHintsUseCase$getSearchHints$1(this, continuation);
            }
        }
        SearchHintsUseCase$getSearchHints$1 searchHintsUseCase$getSearchHints$12 = searchHintsUseCase$getSearchHints$1;
        java.lang.Object objWithContext = searchHintsUseCase$getSearchHints$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = searchHintsUseCase$getSearchHints$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                Result.Application application = Result.Companion;
                try {
                    boolean zFIwbmz = this.copydefault.fIwbmz();
                    CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
                    SearchHintsUseCase$getSearchHints$result$1$response$1$1 searchHintsUseCase$getSearchHints$result$1$response$1$1 = new SearchHintsUseCase$getSearchHints$result$1$response$1$1(this, str, list, num, num2, zFIwbmz, null);
                    searchHintsUseCase$getSearchHints$12.L$0 = this;
                    searchHintsUseCase$getSearchHints$12.label = 1;
                    objWithContext = BuildersKt.withContext(coroutineDispatcher, searchHintsUseCase$getSearchHints$result$1$response$1$1, searchHintsUseCase$getSearchHints$12);
                } catch (java.lang.Throwable th) {
                    th = th;
                    c44055sBr = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                c44055sBr = this;
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                }
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                stateListAnimator = actionBar;
                objM7377constructorimpl = Result.m7377constructorimpl(c44055sBr.AEQbTJ((SearchHintResponse) stateListAnimator.AEQbTJ()));
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c44055sBr = (C44055sBr) searchHintsUseCase$getSearchHints$12.L$0;
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
                    objM7377constructorimpl = Result.m7377constructorimpl(c44055sBr.AEQbTJ((SearchHintResponse) stateListAnimator.AEQbTJ()));
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    stateListAnimator = actionBar;
                    objM7377constructorimpl = Result.m7377constructorimpl(c44055sBr.AEQbTJ((SearchHintResponse) stateListAnimator.AEQbTJ()));
                }
            }
        } catch (java.lang.Throwable th3) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th3));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            C44760scx.log$default("getSearchHints failed: " + thM7380exceptionOrNullimpl, null, 2, null);
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        java.util.List list2 = (java.util.List) objM7377constructorimpl;
        return list2 == null ? yDY.AhwBna() : list2;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.sBl.toSearchArticleDisplayModel$default(com.okinc.okex.search.bean.SearchArticleBean, java.lang.String, int, java.lang.Object):com.okinc.okex.search.ui.displaymodels.SearchArticleDisplayModel */
    public final java.util.List<AbstractC44051sBn> AEQbTJ(SearchHintResponse searchHintResponse) {
        java.util.List listAhwBna;
        java.util.List listAhwBna2;
        java.util.List<SearchIntentHint> intentHints = searchHintResponse.getIntentHints();
        java.util.List listAhwBna3 = null;
        if (intentHints != null) {
            listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(intentHints, 10));
            int i = 0;
            for (java.lang.Object obj : intentHints) {
                int i2 = i + 1;
                if (i < 0) {
                    yDY.AYXKKw();
                }
                SearchIntentHint searchIntentHint = (SearchIntentHint) obj;
                java.lang.String id = searchIntentHint.getId();
                java.lang.String str = id == null ? "" : id;
                java.lang.String standardQuestion = searchIntentHint.getStandardQuestion();
                java.lang.String str2 = standardQuestion == null ? "" : standardQuestion;
                java.lang.Boolean confident = searchIntentHint.getConfident();
                boolean zBooleanValue = confident != null ? confident.booleanValue() : false;
                java.lang.Double score = searchIntentHint.getScore();
                listAhwBna.add(new AbstractC44051sBn.TaskDescription(str, str2, zBooleanValue, i2, score != null ? score.doubleValue() : AudioStats.AUDIO_AMPLITUDE_NONE));
                i = i2;
            }
        } else {
            listAhwBna = null;
        }
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        java.util.List<SearchArticleBean> articleHints = searchHintResponse.getArticleHints();
        if (articleHints != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(articleHints, 10));
            java.util.Iterator<T> it = articleHints.iterator();
            while (it.hasNext()) {
                arrayList.add(new AbstractC44051sBn.Application(C44049sBl.toSearchArticleDisplayModel$default((SearchArticleBean) it.next(), null, 1, null)));
            }
            listAhwBna3 = arrayList;
        }
        if (listAhwBna3 == null) {
            listAhwBna3 = yDY.AhwBna();
        }
        if (!listAhwBna3.isEmpty()) {
            listAhwBna2 = C56402yEa.EZpvd(new AbstractC44051sBn.Activity(C33070mpX.AYXKKw(C47315tni.PendingIntent.hlkKmr)));
        } else {
            listAhwBna2 = yDY.AhwBna();
        }
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listAhwBna, (java.lang.Iterable) listAhwBna2), (java.lang.Iterable) listAhwBna3);
    }
}
