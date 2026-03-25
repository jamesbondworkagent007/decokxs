package o;

import java.security.InvalidKeyException;
import java.security.KeyException;
import java.security.NoSuchProviderException;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59922zsD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zsq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59961zsq {
    /* JADX INFO: renamed from: toExtendedKey-oOkmR4Q$default, reason: not valid java name */
    public static /* synthetic */ C59966zsv m9314toExtendedKeyoOkmR4Q$default(byte[] bArr, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return copydefault(bArr, z, z2);
    }

    public static final C59966zsv copydefault(@NotNull byte[] bArr, boolean z, boolean z2) throws KeyException {
        Intrinsics.checkNotNullParameter(bArr, "");
        try {
            byte[] bArrAEQbTJ = InterfaceC59922zsD.Activity.init$default(C59964zst.OLrzqt.OLrzqt(), C59957zsm.EZpvd(), null, 2, null).AEQbTJ(bArr);
            byte[] bArrAEQbTJ2 = yDT.AEQbTJ(bArrAEQbTJ, 0, 32);
            byte[] bArrAEQbTJ3 = yDT.AEQbTJ(bArrAEQbTJ, 32, 64);
            if (new java.math.BigInteger(1, bArrAEQbTJ2).compareTo(C59919zsA.KWHzl().EZpvd()) >= 0) {
                throw new KeyException("Master key creation resulted in a key with higher modulus. Suggest deriving the next increment.");
            }
            C59926zsH c59926zsHCopydefault = C59963zss.copydefault(C59928zsJ.KWHzl(bArrAEQbTJ2));
            if (!z) {
                return new C59966zsv(c59926zsHCopydefault, bArrAEQbTJ3, (byte) 0, 0, 0, z2 ? C59957zsm.KWHzl() : C59957zsm.copydefault());
            }
            java.math.BigInteger bigInteger = java.math.BigInteger.ZERO;
            Intrinsics.checkNotNullExpressionValue(bigInteger, "");
            return new C59966zsv(new C59926zsH(C59928zsJ.AEQbTJ(bigInteger), c59926zsHCopydefault.AEQbTJ(), null), bArrAEQbTJ3, (byte) 0, 0, 0, z2 ? C59957zsm.AEQbTJ() : C59957zsm.OLrzqt());
        } catch (InvalidKeyException e) {
            throw new KeyException(e);
        } catch (java.security.NoSuchAlgorithmException e2) {
            throw new KeyException(e2);
        } catch (NoSuchProviderException e3) {
            throw new KeyException(e3);
        }
    }
}
