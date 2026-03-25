package o;

import com.okinc.market.common.biz_spot.bean.AlertRemindPo;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;

/* JADX INFO: loaded from: classes8.dex */
public interface mVS {
    @GET("/priapi/v5/rubik/alert-common/rule/unified/list")
    java.lang.Object copydefault(@NotNull Continuation<? super ResponseData<java.util.List<AlertRemindPo>>> continuation);
}
