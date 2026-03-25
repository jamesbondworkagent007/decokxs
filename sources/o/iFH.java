package o;

import com.okinc.business.invest_biz.data.bean.AggregateData;
import com.okinc.business.invest_biz.data.usecase.V2ProductQuery;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface iFH {
    java.lang.Object OLrzqt(@NotNull V2ProductQuery v2ProductQuery, @NotNull Continuation<? super Result<AggregateData>> continuation);
}
