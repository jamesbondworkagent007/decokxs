package o;

import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import java.security.KeyException;
import java.security.NoSuchProviderException;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59922zsD;
import org.jetbrains.annotations.NotNull;
import org.komputing.khash.ripemd160.extensions.PublicExtensionsKt;

/* JADX INFO: renamed from: o.zsp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59960zsp {
    public static final C59966zsv EZpvd(@NotNull byte[] bArr, @NotNull java.lang.String str, boolean z) throws KeyException {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<C60076zuz> listOLrzqt = new C60074zux(str).OLrzqt();
        C59966zsv c59966zsvM9314toExtendedKeyoOkmR4Q$default = C59961zsq.m9314toExtendedKeyoOkmR4Q$default(bArr, false, z, 1, null);
        java.util.Iterator<T> it = listOLrzqt.iterator();
        while (it.hasNext()) {
            c59966zsvM9314toExtendedKeyoOkmR4Q$default = AEQbTJ(c59966zsvM9314toExtendedKeyoOkmR4Q$default, (C60076zuz) it.next());
        }
        return c59966zsvM9314toExtendedKeyoOkmR4Q$default;
    }

    /* JADX INFO: renamed from: toKey-oOkmR4Q$default, reason: not valid java name */
    public static /* synthetic */ C59966zsv m9313toKeyoOkmR4Q$default(byte[] bArr, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return EZpvd(bArr, str, z);
    }

    public static final int copydefault(C59926zsH c59926zsH) {
        byte[] bArrDigestRipemd160 = PublicExtensionsKt.digestRipemd160(C60028zuD.AEQbTJ(C59970zsz.AEQbTJ(c59926zsH)));
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (bArrDigestRipemd160[i2] & UnsignedBytes.MAX_VALUE);
        }
        return i;
    }

    public static final C59966zsv AEQbTJ(@NotNull C59966zsv c59966zsv, @NotNull C60076zuz c60076zuz) throws KeyException {
        byte[] bArrArray;
        Intrinsics.checkNotNullParameter(c59966zsv, "");
        Intrinsics.checkNotNullParameter(c60076zuz, "");
        try {
            if (c60076zuz.EZpvd() && Intrinsics.EZpvd(c59966zsv.AEQbTJ().OLrzqt(), java.math.BigInteger.ZERO)) {
                throw new java.lang.IllegalArgumentException("need private key for private generation using hardened paths".toString());
            }
            InterfaceC59922zsD interfaceC59922zsDInit$default = InterfaceC59922zsD.Activity.init$default(C59964zst.OLrzqt.OLrzqt(), c59966zsv.copydefault(), null, 2, null);
            byte[] bArrAEQbTJ = C59970zsz.AEQbTJ(c59966zsv.AEQbTJ());
            if (c60076zuz.EZpvd()) {
                byte[] bArrEZpvd = C59927zsI.EZpvd(c59966zsv.AEQbTJ().OLrzqt(), 32);
                bArrArray = java.nio.ByteBuffer.allocate(bArrEZpvd.length + 5).order(ByteOrder.BIG_ENDIAN).put((byte) 0).put(bArrEZpvd).putInt(c60076zuz.OLrzqt()).array();
                Intrinsics.checkNotNullExpressionValue(bArrArray, "");
            } else {
                bArrArray = java.nio.ByteBuffer.allocate(bArrAEQbTJ.length + 4).order(ByteOrder.BIG_ENDIAN).put(bArrAEQbTJ).putInt(c60076zuz.OLrzqt()).array();
                Intrinsics.checkNotNullExpressionValue(bArrArray, "");
            }
            byte[] bArrAEQbTJ2 = interfaceC59922zsDInit$default.AEQbTJ(bArrArray);
            byte[] bArrAEQbTJ3 = yDT.AEQbTJ(bArrAEQbTJ2, 0, 32);
            byte[] bArrAEQbTJ4 = yDT.AEQbTJ(bArrAEQbTJ2, 32, 64);
            java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArrAEQbTJ3);
            if (bigInteger.compareTo(C59919zsA.KWHzl().EZpvd()) >= 0) {
                throw new KeyException("Child key derivation resulted in a key with higher modulus. Suggest deriving the next increment.");
            }
            java.math.BigInteger bigIntegerOLrzqt = c59966zsv.AEQbTJ().OLrzqt();
            java.math.BigInteger bigInteger2 = java.math.BigInteger.ZERO;
            if (!Intrinsics.EZpvd(bigIntegerOLrzqt, bigInteger2)) {
                java.math.BigInteger bigIntegerMod = bigInteger.add(c59966zsv.AEQbTJ().OLrzqt()).mod(C59919zsA.KWHzl().EZpvd());
                if (Intrinsics.EZpvd(bigIntegerMod, bigInteger2)) {
                    throw new KeyException("Child key derivation resulted in zeros. Suggest deriving the next increment.");
                }
                Intrinsics.checkNotNullExpressionValue(bigIntegerMod, "");
                return new C59966zsv(C59963zss.copydefault(C59928zsJ.AEQbTJ(bigIntegerMod)), bArrAEQbTJ4, (byte) (c59966zsv.OLrzqt() + 1), copydefault(c59966zsv.AEQbTJ()), c60076zuz.OLrzqt(), c59966zsv.KWHzl());
            }
            InterfaceC59924zsF interfaceC59924zsFEZpvd = C59919zsA.KWHzl().AEQbTJ().AEQbTJ(bigInteger).copydefault(C59919zsA.KWHzl().KWHzl(bArrAEQbTJ)).EZpvd();
            if (interfaceC59924zsFEZpvd.AEQbTJ()) {
                throw new KeyException("Child key derivation resulted in zeros. Suggest deriving the next increment.");
            }
            InterfaceC59924zsF interfaceC59924zsFKWHzl = C59919zsA.KWHzl().KWHzl(interfaceC59924zsFEZpvd.copydefault(), interfaceC59924zsFEZpvd.KWHzl());
            Intrinsics.checkNotNullExpressionValue(bigInteger2, "");
            return new C59966zsv(new C59926zsH(C59928zsJ.AEQbTJ(bigInteger2), C59963zss.copydefault(interfaceC59924zsFKWHzl), null), bArrAEQbTJ4, (byte) (c59966zsv.OLrzqt() + 1), copydefault(c59966zsv.AEQbTJ()), c60076zuz.OLrzqt(), c59966zsv.KWHzl());
        } catch (InvalidKeyException e) {
            throw new KeyException(e);
        } catch (java.security.NoSuchAlgorithmException e2) {
            throw new KeyException(e2);
        } catch (NoSuchProviderException e3) {
            throw new KeyException(e3);
        }
    }
}
