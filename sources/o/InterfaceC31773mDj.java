package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.crcore.coreapi.net.requestbean.transactions.trades.AssetActivityHistoryRequest;
import com.okinc.crcore.coreapi.net.responsebean.transactions.buysellothers.TransactionActivityList;
import com.okinc.crcore.coreapi.net.responsebean.transactions.filter.TransactionFilterData;
import com.okinc.crcore.coreapi.net.responsebean.transactions.trades.TransactionTradeItem;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: o.mDj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public interface InterfaceC31773mDj {
    public static final TaskDescription Companion = TaskDescription.OLrzqt;

    @GET("/priapi/v5/account/transaction/bills")
    java.lang.Object AEQbTJ(@Query("billType") java.lang.String str, @Query("ccy") java.lang.String str2, @Query(TtmlNode.START) java.lang.String str3, @Query(TtmlNode.END) java.lang.String str4, @Query("offsetId") java.lang.String str5, @Query("limit") java.lang.String str6, @NotNull Continuation<? super ResponseData<java.util.List<TransactionTradeItem>>> continuation);

    @GET("/priapi/v5/account/transaction/filter-info")
    java.lang.Object OLrzqt(@NotNull Continuation<? super ResponseData<java.util.List<TransactionFilterData>>> continuation);

    @POST("/v2/asset/activity/history")
    java.lang.Object copydefault(@Body @NotNull AssetActivityHistoryRequest assetActivityHistoryRequest, @NotNull Continuation<? super ResponseData<TransactionActivityList>> continuation);

    /* JADX INFO: renamed from: o.mDj$TaskDescription */
    public static final class TaskDescription {
        public static final /* synthetic */ TaskDescription OLrzqt = new TaskDescription();

        private TaskDescription() {
        }
    }
}
