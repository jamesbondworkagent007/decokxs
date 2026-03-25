package o;

import com.okinc.buysell.domain.GetAssetsQuoteUseCase$invoke$2;
import com.okinc.buysell.domain.GetAssetsQuoteUseCase$invoke$4;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.network.okg.response.OKServerException;
import java.math.RoundingMode;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lyP {
    public final CoroutineDispatcher EZpvd;
    public final mCZ KWHzl;

    @yCM
    public lyP(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull mCZ mcz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(mcz, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = mcz;
    }

    public final java.lang.Object copydefault(@NotNull ConvertCurrencyBean convertCurrencyBean, @NotNull ConvertCurrencyBean convertCurrencyBean2, @NotNull Continuation<? super AbstractC43419rot<C31389ltB, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new GetAssetsQuoteUseCase$invoke$2(this, convertCurrencyBean, convertCurrencyBean2, null), continuation);
    }

    public final java.lang.Object KWHzl(@NotNull ConvertCurrencyBean convertCurrencyBean, @NotNull ConvertCurrencyBean convertCurrencyBean2, @NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<C31435ltv, OKServerException>> continuation) {
        return BuildersKt.withContext(this.EZpvd, new GetAssetsQuoteUseCase$invoke$4(this, convertCurrencyBean, convertCurrencyBean2, str, null), continuation);
    }

    public final java.lang.String copydefault(java.lang.String str) {
        return C33129mqd.OLrzqt(1, str, 16, java.lang.Boolean.TRUE, RoundingMode.DOWN);
    }
}
