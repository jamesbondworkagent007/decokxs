package o;

import com.okinc.business.defi.biz.rpc.RpcRequestBody;
import com.okinc.business.defi.biz.rpc.RpcRequestResponse;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Url;

/* JADX INFO: renamed from: o.dbS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC13906dbS {
    public static final TaskDescription Companion = TaskDescription.KWHzl;

    @POST
    AbstractC58260yxt<RpcRequestResponse> OLrzqt(@Url @NotNull java.lang.String str, @Body @NotNull RpcRequestBody rpcRequestBody);

    /* JADX INFO: renamed from: o.dbS$TaskDescription */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
        }

        public final InterfaceC13906dbS EZpvd() {
            return (InterfaceC13906dbS) C43393roT.EZpvd(C56524yIo.AEQbTJ(InterfaceC13906dbS.class), C13922dbi.AEQbTJ);
        }
    }
}
