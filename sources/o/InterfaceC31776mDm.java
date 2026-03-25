package o;

import com.okinc.crcore.coreapi.net.requestbean.PMSQuestionnaireEvaluationRequest;
import com.okinc.crcore.coreapi.net.responsebean.PMSAssessmentProgressBean;
import com.okinc.crcore.coreapi.net.responsebean.PMSProduct;
import com.okinc.crcore.coreapi.net.responsebean.PMSQuestionnaireResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.PMSQuestionsBean;
import com.okinc.crcore.coreapi.net.responsebean.ProfileRiskAssessmentBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.mDm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC31776mDm {
    public static final Activity Companion = Activity.copydefault;

    @GET("/priapi/v5/pms/profile")
    java.lang.Object AEQbTJ(@NotNull @Query("productType") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<ProfileRiskAssessmentBean>>> continuation);

    @GET("/priapi/v5/pms/products")
    java.lang.Object EZpvd(@Query("productType") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<PMSProduct>>> continuation);

    @POST("/priapi/v5/pms/questionnaire")
    java.lang.Object OLrzqt(@Body @NotNull PMSQuestionnaireEvaluationRequest pMSQuestionnaireEvaluationRequest, @NotNull Continuation<? super ResponseData<java.util.List<PMSQuestionnaireResponseBean>>> continuation);

    @GET("/priapi/v5/pms/questionnaire/progress")
    java.lang.Object OLrzqt(@Query("pillarType") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<PMSAssessmentProgressBean>>> continuation);

    @GET("/priapi/v5/pms/questionnaire/content")
    java.lang.Object copydefault(@NotNull @Query("pillarType") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<PMSQuestionsBean>>> continuation);

    /* JADX INFO: renamed from: o.mDm$Activity */
    public static final class Activity {
        public static final /* synthetic */ Activity copydefault = new Activity();

        private Activity() {
        }
    }
}
