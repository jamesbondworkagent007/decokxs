package o;

import com.okinc.business.invest_biz.data.models.DetailOrderParam;
import com.okinc.business.invest_biz.data.models.InvestHomeOrderVo;
import com.okinc.business.invest_biz.data.models.InvestQaVo;
import com.okinc.business.invest_biz.ui.screens.eventpage.InvestMultiTabEventPageData;
import com.okinc.business.invest_biz.ui.screens.eventpage.SpecialZoneActivityParam;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iDx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC23641iDx {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull DetailOrderParam detailOrderParam, @NotNull Continuation<? super AbstractC43419rot<InvestHomeOrderVo, OKServerException>> continuation);

    java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<InvestQaVo>, OKServerException>> continuation);

    java.lang.Object KWHzl(@NotNull SpecialZoneActivityParam specialZoneActivityParam, @NotNull Continuation<? super AbstractC43419rot<InvestMultiTabEventPageData, OKServerException>> continuation);
}
