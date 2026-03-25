package o;

import com.okinc.buysell.domain.GetConvertToListUseCase$invoke$2;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lyV {
    public final CoroutineDispatcher EZpvd;
    public final mCZ KWHzl;

    @yCM
    public lyV(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull mCZ mcz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(mcz, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = mcz;
    }

    public static /* synthetic */ java.lang.Object invoke$default(lyV lyv, boolean z, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return lyv.OLrzqt(z, str, str2, continuation);
    }

    public final java.lang.Object OLrzqt(boolean z, java.lang.String str, java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<? extends java.util.List<ConvertCurrencyBean>, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new GetConvertToListUseCase$invoke$2(str, z, this, str2, null), continuation);
    }
}
