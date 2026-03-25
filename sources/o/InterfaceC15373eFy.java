package o;

import com.okinc.business.defi.wallet.hardware.HardwareWalletDerivationPath;
import com.okinc.wallet.core.other.DerivePath;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eFy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC15373eFy {
    java.lang.Object AEQbTJ(long j, @NotNull java.util.List<java.lang.Integer> list, int i, int i2, @NotNull Continuation<? super java.util.List<DerivePath>> continuation);

    java.lang.Object AEQbTJ(@NotNull C10854bwM c10854bwM, @NotNull Continuation<? super java.util.ArrayList<HardwareWalletDerivationPath>> continuation);

    java.lang.Object KWHzl(long j, @NotNull Continuation<? super C10854bwM> continuation);

    java.lang.Object KWHzl(@NotNull java.util.List<DerivePath> list, C10854bwM c10854bwM, @NotNull Continuation<? super java.util.List<eFI>> continuation);
}
