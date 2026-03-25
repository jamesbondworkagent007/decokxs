package o;

import com.okinc.wallet.core.keypair.KeyPair;
import com.okinc.wallet.core.keypair.KeyPairParams;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xYP {
    public static final xYP AEQbTJ = new xYP();

    private xYP() {
    }

    public final KeyPair OLrzqt(@NotNull KeyPairParams keyPairParams) {
        Intrinsics.checkNotNullParameter(keyPairParams, "");
        return xXV.KWHzl.OLrzqt(keyPairParams);
    }

    public final KeyPair AEQbTJ() {
        return xXV.KWHzl.EZpvd();
    }

    public final KeyPair copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xXV.KWHzl.fARcdN(str);
    }
}
