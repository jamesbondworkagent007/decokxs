package o;

import com.okinc.business.invest_biz.data.models.DetailOrderParam;
import com.okinc.business.invest_biz.data.models.InvestHomeOrderVo;
import com.okinc.business.invest_biz.data.models.InvestQaVo;
import com.okinc.business.invest_biz.ui.screens.eventpage.InvestMultiTabEventPageData;
import com.okinc.business.invest_biz.ui.screens.eventpage.SpecialZoneActivityParam;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iDw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23640iDw implements InterfaceC23641iDx {
    public final InterfaceC23683iFl OLrzqt;

    @yCM
    public C23640iDw(@NotNull InterfaceC23683iFl interfaceC23683iFl) {
        Intrinsics.checkNotNullParameter(interfaceC23683iFl, "");
        this.OLrzqt = interfaceC23683iFl;
    }

    @Override // o.InterfaceC23641iDx
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<InvestQaVo>, OKServerException>> continuation) {
        return this.OLrzqt.AEQbTJ(continuation);
    }

    @Override // o.InterfaceC23641iDx
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull DetailOrderParam detailOrderParam, @NotNull Continuation<? super AbstractC43419rot<InvestHomeOrderVo, OKServerException>> continuation) {
        return this.OLrzqt.EZpvd(str, detailOrderParam, continuation);
    }

    @Override // o.InterfaceC23641iDx
    public java.lang.Object KWHzl(@NotNull SpecialZoneActivityParam specialZoneActivityParam, @NotNull Continuation<? super AbstractC43419rot<InvestMultiTabEventPageData, OKServerException>> continuation) {
        return this.OLrzqt.copydefault(specialZoneActivityParam, continuation);
    }
}
