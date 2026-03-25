package o;

import com.okinc.business.invest_biz.data.bean.response.ProductDetailsResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iER {
    @yCM
    public iER() {
    }

    public final C23676iFe EZpvd(@NotNull ProductDetailsResponse productDetailsResponse) {
        Intrinsics.checkNotNullParameter(productDetailsResponse, "");
        return new C23676iFe(productDetailsResponse.fetchVPNInfo(), productDetailsResponse.DbNXlk(), productDetailsResponse.fFgQHt(), productDetailsResponse.DAIeex());
    }
}
