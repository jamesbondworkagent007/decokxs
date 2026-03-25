package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.extension.bean.TestAccountData;
import retrofit2.http.GET;

/* JADX INFO: renamed from: o.rCr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public interface InterfaceC42001rCr {
    public static final TaskDescription Companion = TaskDescription.AEQbTJ;

    @GET("/v3/users/support/common/test-account-list")
    AbstractC58185ywX<ResponseData<TestAccountData>> KWHzl();

    /* JADX INFO: renamed from: o.rCr$TaskDescription */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
        }

        public final InterfaceC42001rCr EZpvd() {
            return (InterfaceC42001rCr) C43393roT.httpService$default(C56524yIo.AEQbTJ(InterfaceC42001rCr.class), null, 1, null);
        }
    }
}
