package o;

import com.okinc.business.defi.wallet.mine.walletmanage.usecases.ChangeMainWalletUseCaseImpl$invoke$2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fEc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17405fEc implements fDV {
    public final C12827cuN OLrzqt;

    @yCM
    public C17405fEc(@NotNull C12827cuN c12827cuN) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        this.OLrzqt = c12827cuN;
    }

    @Override // o.fDV
    public java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new ChangeMainWalletUseCaseImpl$invoke$2(this, str, null), continuation);
        return objCoroutineScope == C56442yFn.copydefault() ? objCoroutineScope : Unit.INSTANCE;
    }
}
