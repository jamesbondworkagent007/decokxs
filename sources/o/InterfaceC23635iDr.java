package o;

import com.okinc.business.invest_api.bean.EarnRecommendApyBean;
import com.okinc.business.invest_biz.data.bean.AggregateData;
import com.okinc.business.invest_biz.data.bean.SearchHeaderInfoResponse;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iDr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC23635iDr {
    java.lang.Object OLrzqt(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<? extends java.util.List<EarnRecommendApyBean>>> continuation);

    java.lang.Object OLrzqt(long j, @NotNull java.lang.String str, @NotNull Continuation<? super Result<SearchHeaderInfoResponse>> continuation);

    java.lang.Object copydefault(int i, long j, @NotNull java.lang.String str, java.lang.Integer num, @NotNull java.lang.String str2, java.lang.String str3, @NotNull Continuation<? super Result<AggregateData>> continuation);
}
