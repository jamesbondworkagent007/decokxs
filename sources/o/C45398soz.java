package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.okex.center.bean.HotTopicsResponse;
import com.okinc.okex.center.bean.RecommendTopicPageData;
import com.okinc.okex.center.bean.TopicBean;
import com.okinc.okex.common.usecase.SupportHotTopicsUseCase$getHotTopicList$1;
import com.okinc.okex.common.usecase.SupportHotTopicsUseCase$getHotTopicList$result$1$1$1;
import com.okinc.okex.rating.bean.GetSupportRatingBean;
import com.okinc.okex.rating.net.RatingResult;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.AbstractC43419rot;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.soz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45398soz {
    public final InterfaceC44921sfz OLrzqt;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C45398soz(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC44921sfz interfaceC44921sfz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC44921sfz, "");
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = interfaceC44921sfz;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.sxK.toRatingResult$default(o.sxK, com.okinc.okex.rating.bean.GetSupportRatingBean, java.lang.String, kotlinx.serialization.json.JsonObject, java.lang.String, int, java.lang.Object):com.okinc.okex.rating.net.RatingResult */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull Continuation<? super Result<RecommendTopicPageData>> continuation) throws java.lang.Throwable {
        SupportHotTopicsUseCase$getHotTopicList$1 supportHotTopicsUseCase$getHotTopicList$1;
        AbstractC43419rot actionBar;
        java.lang.Object objM7377constructorimpl;
        java.util.List listAhwBna;
        if (continuation instanceof SupportHotTopicsUseCase$getHotTopicList$1) {
            supportHotTopicsUseCase$getHotTopicList$1 = (SupportHotTopicsUseCase$getHotTopicList$1) continuation;
            int i = supportHotTopicsUseCase$getHotTopicList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                supportHotTopicsUseCase$getHotTopicList$1.label = i - Integer.MIN_VALUE;
            } else {
                supportHotTopicsUseCase$getHotTopicList$1 = new SupportHotTopicsUseCase$getHotTopicList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = supportHotTopicsUseCase$getHotTopicList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = supportHotTopicsUseCase$getHotTopicList$1.label;
        try {
            try {
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(objWithContext);
                    Result.Application application = Result.Companion;
                    CoroutineDispatcher coroutineDispatcher = this.copydefault;
                    SupportHotTopicsUseCase$getHotTopicList$result$1$1$1 supportHotTopicsUseCase$getHotTopicList$result$1$1$1 = new SupportHotTopicsUseCase$getHotTopicList$result$1$1$1(this, null);
                    supportHotTopicsUseCase$getHotTopicList$1.label = 1;
                    objWithContext = BuildersKt.withContext(coroutineDispatcher, supportHotTopicsUseCase$getHotTopicList$result$1$1$1, supportHotTopicsUseCase$getHotTopicList$1);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(objWithContext);
                }
                ResponseData responseData = (ResponseData) objWithContext;
                if (responseData.getCode() == 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
            objM7377constructorimpl = Result.m7377constructorimpl((HotTopicsResponse) actionBar.AEQbTJ());
        } catch (java.lang.Throwable th2) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            HotTopicsResponse hotTopicsResponse = (HotTopicsResponse) objM7377constructorimpl;
            java.util.List<TopicBean> list = hotTopicsResponse.getList();
            if (list != null) {
                listAhwBna = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    listAhwBna.add(C44860ser.AEQbTJ((TopicBean) it.next()));
                }
            } else {
                listAhwBna = null;
            }
            GetSupportRatingBean rating = hotTopicsResponse.getRating();
            RatingResult ratingResult$default = rating != null ? sxK.toRatingResult$default(sxK.copydefault, rating, null, null, null, 7, null) : null;
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            RecommendTopicPageData recommendTopicPageData = new RecommendTopicPageData(listAhwBna, ratingResult$default);
            Result.Application application3 = Result.Companion;
            return Result.m7377constructorimpl(recommendTopicPageData);
        }
        Result.Application application4 = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl));
    }
}
