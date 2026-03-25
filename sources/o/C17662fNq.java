package o;

import com.okinc.business.defi.api.bean.passkeywallet.cedefi.PasskeyFromSource;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fNq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C17662fNq {
    public static final C17662fNq KWHzl = new C17662fNq();
    public static PasskeyFromSource EZpvd = PasskeyFromSource.UNKNOWN;
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyFromSource AEQbTJ() {
        return EZpvd;
    }

    private C17662fNq() {
    }

    public final void OLrzqt(@NotNull PasskeyFromSource passkeyFromSource) {
        Intrinsics.checkNotNullParameter(passkeyFromSource, "");
        EZpvd = passkeyFromSource;
        pUU.EZpvd("PasskeySourceManager", "Passkey source set to: " + passkeyFromSource);
    }

    public final void OLrzqt() {
        EZpvd = PasskeyFromSource.UNKNOWN;
    }
}
