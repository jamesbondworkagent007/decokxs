package o;

import com.okinc.business.invest_biz.data.bean.request.DashboardTokenDetailReq;
import com.okinc.business.invest_biz.data.bean.response.DashboardTokenListResponse;
import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.ProtocolDetailsParams;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iDL {
    java.lang.Object EZpvd(long j, @NotNull Continuation<? super Result<C23666iEv>> continuation);

    java.lang.Object KWHzl(@NotNull ProtocolDetailsParams protocolDetailsParams, @NotNull Continuation<? super Result<iDV>> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<DashboardTokenDetailReq> list, @NotNull Continuation<? super Result<iEC>> continuation);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super iDV> continuation);

    java.lang.Object OLrzqt(@NotNull ProtocolDetailsParams protocolDetailsParams, @NotNull Continuation<? super Result<? extends java.util.Map<java.lang.String, iDV>>> continuation);

    java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends java.util.List<DashboardTokenListResponse>>> continuation);

    java.lang.Object copydefault(@NotNull Continuation<? super Result<java.lang.Boolean>> continuation);
}
