package o;

import com.okinc.business.market.features.meme.bundle_detail.domain.model.BundleDetailData;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.keH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28620keH {
    public final InterfaceC28619keG EZpvd;

    @yCM
    public C28620keH(@NotNull InterfaceC28619keG interfaceC28619keG) {
        Intrinsics.checkNotNullParameter(interfaceC28619keG, "");
        this.EZpvd = interfaceC28619keG;
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<BundleDetailData, OKServerException>> continuation) {
        return this.EZpvd.OLrzqt(str, str2, continuation);
    }
}
