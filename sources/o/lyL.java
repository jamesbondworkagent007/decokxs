package o;

import com.okinc.buysell.domain.FiatListUseCase$getFiatList$2;
import com.okinc.crcore.shared.net.responsebean.bsc.SupportCurrenciesBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lyL {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC31764mDa copydefault;

    @yCM
    public lyL(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC31764mDa interfaceC31764mDa) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC31764mDa, "");
        this.AEQbTJ = coroutineDispatcher;
        this.copydefault = interfaceC31764mDa;
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43419rot<SupportCurrenciesBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.AEQbTJ, new FiatListUseCase$getFiatList$2(this, str, null), continuation);
    }
}
