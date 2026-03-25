package o;

import com.okinc.buysell.domain.GetDexQuoteUseCase$invoke$2;
import com.okinc.crcore.shared.net.responsebean.DexQuoteBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lyT {
    public final InterfaceC31764mDa KWHzl;

    @yCM
    public lyT(@NotNull InterfaceC31764mDa interfaceC31764mDa) {
        Intrinsics.checkNotNullParameter(interfaceC31764mDa, "");
        this.KWHzl = interfaceC31764mDa;
    }

    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, int i, java.lang.String str7, boolean z, java.lang.String str8, java.lang.Integer num, @NotNull Continuation<? super AbstractC43419rot<DexQuoteBean, OKServerException>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GetDexQuoteUseCase$invoke$2(this, str, str2, str3, str4, str5, str6, num, i, str7, z, str8, null), continuation);
    }
}
