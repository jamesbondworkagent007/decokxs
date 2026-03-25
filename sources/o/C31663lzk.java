package o;

import com.okinc.buysell.domain.ToTokenSwitchedUseCase$invoke$2;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lzk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C31663lzk {
    public final CoroutineDispatcher OLrzqt;
    public final lyO copydefault;

    @yCM
    public C31663lzk(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull lyO lyo) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(lyo, "");
        this.OLrzqt = coroutineDispatcher;
        this.copydefault = lyo;
    }

    public final java.lang.Object copydefault(@NotNull ConvertCurrencyBean convertCurrencyBean, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super AbstractC43419rot<C31394ltG, OKServerException>> continuation) {
        return BuildersKt.withContext(this.OLrzqt, new ToTokenSwitchedUseCase$invoke$2(this, str2, convertCurrencyBean, null), continuation);
    }
}
