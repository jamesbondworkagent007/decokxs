package o;

import com.okinc.buysell.domain.GetConvertFromListUseCase$invoke$2;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lyO {
    public final CoroutineDispatcher EZpvd;
    public final mCZ copydefault;

    @yCM
    public lyO(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull mCZ mcz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(mcz, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = mcz;
    }

    public static /* synthetic */ java.lang.Object invoke$default(lyO lyo, boolean z, java.lang.String str, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return lyo.KWHzl(z, str, continuation);
    }

    public final java.lang.Object KWHzl(boolean z, @NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ConvertCurrencyBean>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new GetConvertFromListUseCase$invoke$2(z, this, str, null), continuation);
    }
}
