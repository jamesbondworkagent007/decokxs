package o;

import com.okinc.business.invest_biz.data.bean.response.ProductDetailsResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iEX {
    @yCM
    public iEX() {
    }

    public final C23686iFo copydefault(@NotNull ProductDetailsResponse productDetailsResponse) {
        Intrinsics.checkNotNullParameter(productDetailsResponse, "");
        return new C23686iFo(productDetailsResponse.AuCTel(), productDetailsResponse.fIwbmz(), productDetailsResponse.fARcdN(), productDetailsResponse.fJNWhG());
    }
}
