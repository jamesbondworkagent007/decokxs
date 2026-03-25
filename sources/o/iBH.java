package o;

import com.okinc.business.invest_biz.data.bean.InvestOrderDetailsInfoVo;
import com.okinc.business.invest_biz.data.bean.request.InvestOrderDetailsPageParam;
import com.okinc.network.okg.response.ResponseData;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iBH {
    java.lang.Object copydefault(@NotNull InvestOrderDetailsPageParam investOrderDetailsPageParam, @NotNull Continuation<? super ResponseData<InvestOrderDetailsInfoVo>> continuation);
}
