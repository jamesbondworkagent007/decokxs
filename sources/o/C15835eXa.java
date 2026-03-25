package o;

import com.okinc.business.defi.biz.net.bean.SupportPnlChainResponse;
import com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisResponse;
import com.okinc.business.defi.biz.net.bean.WalletPnlTokenListResponse;
import com.okinc.business.defi.biz.net.bean.WalletSupportPnlChainListResponse;
import com.okinc.business.defi.wallet.home.addressDetail.domain.usecase.WalletPnlDataUseCase$supportPnlChainList$1;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eXa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15835eXa {
    public final Flow<java.util.List<SupportPnlChainResponse>> EZpvd;
    public final eWV KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<java.util.List<SupportPnlChainResponse>> EZpvd() {
        return this.EZpvd;
    }

    @yCM
    public C15835eXa(@NotNull eWV ewv) {
        Intrinsics.checkNotNullParameter(ewv, "");
        this.KWHzl = ewv;
        this.EZpvd = FlowKt.flow(new WalletPnlDataUseCase$supportPnlChainList$1(this, null));
    }

    public final java.lang.Object EZpvd(@NotNull Continuation<? super AbstractC43419rot<WalletSupportPnlChainListResponse, OKServerException>> continuation) {
        return this.KWHzl.copydefault(Dispatchers.getIO(), continuation);
    }

    public final java.lang.Object EZpvd(@NotNull java.lang.String str, java.lang.Long l, int i, boolean z, int i2, int i3, @NotNull Continuation<? super AbstractC43419rot<WalletPnlTokenListResponse, OKServerException>> continuation) {
        return this.KWHzl.AEQbTJ(str, l, i, z, i2, i3, continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, java.lang.Long l, int i, boolean z, int i2, int i3, boolean z2, @NotNull Continuation<? super AbstractC43419rot<WalletPnlTokenListResponse, OKServerException>> continuation) {
        return this.KWHzl.EZpvd(str, l, i, z, i2, i3, z2, continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Long l, @NotNull Continuation<? super AbstractC43419rot<WalletPnlAnalysisResponse, OKServerException>> continuation) {
        return this.KWHzl.KWHzl(str, str3, l, str2, continuation);
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Long l, @NotNull Continuation<? super AbstractC43419rot<WalletPnlAnalysisResponse, OKServerException>> continuation) {
        return this.KWHzl.OLrzqt(str, str2, l, continuation);
    }
}
