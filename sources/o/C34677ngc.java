package o;

import com.okinc.dexkline.trade.features.home.advanced.usecase.AdvancedWalletUseCase$ensureInitForTradeDex$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ngc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@yCR
public final class C34677ngc {
    public final java.lang.String AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public InterfaceC54572xNi copydefault;

    @yCM
    public C34677ngc(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = coroutineDispatcher;
        this.AEQbTJ = "AdvancedWalletUseCase";
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super java.lang.Boolean> continuation) {
        return BuildersKt.withContext(this.EZpvd, new AdvancedWalletUseCase$ensureInitForTradeDex$2(this, null), continuation);
    }

    public final java.lang.String copydefault() {
        java.lang.String strKWHzl;
        InterfaceC54572xNi interfaceC54572xNi = this.copydefault;
        return (interfaceC54572xNi == null || (strKWHzl = interfaceC54572xNi.KWHzl()) == null) ? "" : strKWHzl;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54572xNi interfaceC54572xNi = this.copydefault;
        return (interfaceC54572xNi == null || (strOLrzqt = interfaceC54572xNi.OLrzqt(str)) == null) ? "" : strOLrzqt;
    }
}
