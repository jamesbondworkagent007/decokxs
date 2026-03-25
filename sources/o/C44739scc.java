package o;

import com.okinc.assets.api.model.GoToWithdrawFromWalletResultContractArgs;
import com.okinc.okcomponents.feature.okwalletdefi.standalone.mock.external.impl.account.OKXWeb3DependencyException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.scc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44739scc implements InterfaceC8223ayg {
    public final java.lang.String OLrzqt = C44739scc.class.getSimpleName();

    @Override // o.InterfaceC8223ayg
    public void KWHzl(@NotNull GoToWithdrawFromWalletResultContractArgs goToWithdrawFromWalletResultContractArgs) {
        Intrinsics.checkNotNullParameter(goToWithdrawFromWalletResultContractArgs, "");
        java.lang.String str = this.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
    }

    @Override // o.InterfaceC8223ayg
    public void AEQbTJ(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        java.lang.String str = this.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(str, "");
        C44758scv.OLrzqt(new OKXWeb3DependencyException(str));
    }
}
