package o;

import com.okinc.business.invest_biz.data.logic.net.InvestServiceApiProviderImpl$getEncryptSignedApi$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@yCR
public final class iBG implements InterfaceC23589iBz {
    public final CoroutineDispatcher KWHzl;
    public final InterfaceC23916iOb OLrzqt;

    @yCM
    public iBG(@NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC23916iOb;
        this.KWHzl = coroutineDispatcher;
    }

    @Override // o.InterfaceC23589iBz
    public InterfaceC25472ixP OLrzqt() {
        return InterfaceC25472ixP.Companion.EZpvd(new iBA(null, null, null, 7, null));
    }

    @Override // o.InterfaceC23589iBz
    public java.lang.Object KWHzl(java.lang.String str, @NotNull Continuation<? super InterfaceC25472ixP> continuation) {
        return BuildersKt.withContext(this.KWHzl, new InvestServiceApiProviderImpl$getEncryptSignedApi$2(this.OLrzqt.g_(str == null ? "" : str), str, this, null), continuation);
    }
}
