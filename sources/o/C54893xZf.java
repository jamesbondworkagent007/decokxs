package o;

import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.TransactionParams;
import com.okinc.wallet.core.sign.pi.PiBaseTransaction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xZf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54893xZf {
    public static final C54893xZf KWHzl = new C54893xZf();

    private C54893xZf() {
    }

    public final SignedTx EZpvd(@NotNull SignParams signParams, @NotNull PiBaseTransaction piBaseTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(piBaseTransaction, "");
        return SignedTx.Companion.KWHzl(xYU.copydefault.AYXKKw(TransactionParams.Companion.AEQbTJ(signParams, piBaseTransaction)));
    }
}
