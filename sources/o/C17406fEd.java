package o;

import com.okinc.business.defi.wallet.mine.walletmanage.usecases.GetRootWalletsSearchResultUseCaseImpl$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fEd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17406fEd implements InterfaceC17404fEb {
    public final C12827cuN AEQbTJ;
    public final C17412fEj KWHzl;

    @yCM
    public C17406fEd(@NotNull C12827cuN c12827cuN, @NotNull C17412fEj c17412fEj) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c17412fEj, "");
        this.AEQbTJ = c12827cuN;
        this.KWHzl = c17412fEj;
    }

    @Override // o.InterfaceC17404fEb
    public java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super java.util.List<fDU>> continuation) {
        return CoroutineScopeKt.coroutineScope(new GetRootWalletsSearchResultUseCaseImpl$invoke$2(this, z, null), continuation);
    }
}
