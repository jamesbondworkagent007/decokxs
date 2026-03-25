package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.KycExperimentResponse;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.ruM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC43704ruM {
    public static final Application Companion = Application.KWHzl;

    @GET("/v3/comp/kyc/support/experiment")
    java.lang.Object EZpvd(@Query(OtcExtraKeys.SESSIONID) java.lang.String str, @NotNull Continuation<? super ResponseData<KycExperimentResponse>> continuation);

    /* JADX INFO: renamed from: o.ruM$Application */
    public static final class Application {
        public static final /* synthetic */ Application KWHzl = new Application();

        private Application() {
        }

        public final InterfaceC43704ruM KWHzl() {
            return (InterfaceC43704ruM) C43393roT.httpService$default(C56524yIo.AEQbTJ(InterfaceC43704ruM.class), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: o.ruM$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ java.lang.Object getExperiment$default(InterfaceC43704ruM interfaceC43704ruM, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getExperiment");
            }
            if ((i & 1) != 0) {
                str = null;
            }
            return interfaceC43704ruM.EZpvd(str, continuation);
        }
    }
}
