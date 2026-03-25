package o;

import com.okinc.crcore.coreapi.net.responsebean.PositionSummaryResponse;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.mDe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC31768mDe {
    public static final TaskDescription Companion = TaskDescription.AEQbTJ;

    @GET("/priapi/v5/trade/onshore/orders-position-summary")
    java.lang.Object copydefault(@NotNull @Query("ccy") java.lang.String str, @NotNull Continuation<? super ResponseData<java.util.List<PositionSummaryResponse>>> continuation);

    /* JADX INFO: renamed from: o.mDe$TaskDescription */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
        }
    }
}
