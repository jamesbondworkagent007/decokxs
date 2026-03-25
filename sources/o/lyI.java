package o;

import com.okinc.buysell.domain.DeletePaymentMethodUseCase$deletePaymentMethod$2;
import com.okinc.crcore.shared.net.responsebean.bsc.DeletePaymentMethodBean;
import com.okinc.network.okg.response.OKServerException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class lyI {
    public final CoroutineDispatcher KWHzl;
    public final InterfaceC31764mDa copydefault;

    @yCM
    public lyI(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC31764mDa interfaceC31764mDa) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC31764mDa, "");
        this.KWHzl = coroutineDispatcher;
        this.copydefault = interfaceC31764mDa;
    }

    public final java.lang.Object OLrzqt(java.lang.Integer num, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, @NotNull Continuation<? super AbstractC43419rot<DeletePaymentMethodBean, OKServerException>> continuation) {
        return BuildersKt.withContext(this.KWHzl, new DeletePaymentMethodUseCase$deletePaymentMethod$2(this, str, str2, str3, str4, str5, num, null), continuation);
    }
}
