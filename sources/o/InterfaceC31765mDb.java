package o;

import com.okinc.crcore.coreapi.net.responsebean.TradingBotStrategyListResponseBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

/* JADX INFO: renamed from: o.mDb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC31765mDb {
    public static final TaskDescription Companion = TaskDescription.OLrzqt;

    @GET("priapi/v5/algo/public/strategy-type")
    java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<java.util.List<TradingBotStrategyListResponseBean>>> continuation);

    /* JADX INFO: renamed from: o.mDb$TaskDescription */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription OLrzqt = new TaskDescription();

        private TaskDescription() {
        }
    }
}
