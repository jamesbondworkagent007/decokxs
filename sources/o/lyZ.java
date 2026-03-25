package o;

import com.okinc.buysell.domain.GetPairSuggestionUseCase$invoke$2;
import com.okinc.crcore.shared.net.responsebean.CurrencySuggestionPairsBean;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lyZ {
    public final CoroutineDispatcher EZpvd;
    public final mCZ KWHzl;

    @yCM
    public lyZ(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull mCZ mcz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(mcz, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = mcz;
    }

    public static /* synthetic */ java.lang.Object invoke$default(lyZ lyz, boolean z, java.lang.String str, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return lyz.copydefault(z, str, str2, continuation);
    }

    public final java.lang.Object copydefault(boolean z, java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super CurrencySuggestionPairsBean> continuation) {
        return BuildersKt.withContext(this.EZpvd, new GetPairSuggestionUseCase$invoke$2(str, z, this, str2, null), continuation);
    }
}
