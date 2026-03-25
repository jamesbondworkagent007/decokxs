package o;

import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.TransactionParams;
import com.okinc.wallet.core.sign.kaspa.KaspaTransaction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xZa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54888xZa {
    public static final C54888xZa copydefault = new C54888xZa();

    private C54888xZa() {
    }

    public final SignedTx KWHzl(@NotNull SignParams signParams, @NotNull KaspaTransaction kaspaTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(kaspaTransaction, "");
        return SignedTx.Companion.KWHzl(xYU.copydefault.AYXKKw(TransactionParams.Companion.AEQbTJ(signParams, kaspaTransaction)));
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return xXV.KWHzl.valueOf(str, str2);
    }
}
