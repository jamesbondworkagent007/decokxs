package o;

import com.okinc.buysell.domain.QuotedPriceUseCase$invoke$2;
import com.okinc.crcore.shared.net.responsebean.B2CQuotePriceBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31657lze {
    public final InterfaceC31764mDa copydefault;

    @yCM
    public C31657lze(@NotNull InterfaceC31764mDa interfaceC31764mDa) {
        Intrinsics.checkNotNullParameter(interfaceC31764mDa, "");
        this.copydefault = interfaceC31764mDa;
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, @NotNull java.lang.String str5, java.lang.String str6, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<B2CQuotePriceBean>, OKServerException>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new QuotedPriceUseCase$invoke$2(this, str, str2, str4, str3, i, str5, str6, null), continuation);
    }
}
