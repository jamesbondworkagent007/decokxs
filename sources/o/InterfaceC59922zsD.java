package o;

import org.jetbrains.annotations.NotNull;
import org.kethereum.crypto.impl.hashing.DigestParams;

/* JADX INFO: renamed from: o.zsD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC59922zsD {
    byte[] AEQbTJ(@NotNull byte[] bArr);

    InterfaceC59922zsD KWHzl(@NotNull byte[] bArr, @NotNull DigestParams digestParams);

    /* JADX INFO: renamed from: o.zsD$Activity */
    public static final class Activity {
        public static /* synthetic */ InterfaceC59922zsD init$default(InterfaceC59922zsD interfaceC59922zsD, byte[] bArr, DigestParams digestParams, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
            }
            if ((i & 2) != 0) {
                digestParams = DigestParams.Sha512.EZpvd;
            }
            return interfaceC59922zsD.KWHzl(bArr, digestParams);
        }
    }
}
