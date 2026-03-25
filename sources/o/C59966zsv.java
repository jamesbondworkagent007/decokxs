package o;

import java.security.KeyException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zsv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59966zsv {
    public final C59926zsH AEQbTJ;
    public final byte[] AhwBna;
    public final int EZpvd;
    public final int KWHzl;
    public final byte OLrzqt;
    public final byte[] copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C59966zsv copy$default(C59966zsv c59966zsv, C59926zsH c59926zsH, byte[] bArr, byte b, int i, int i2, byte[] bArr2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            c59926zsH = c59966zsv.AEQbTJ;
        }
        if ((i3 & 2) != 0) {
            bArr = c59966zsv.copydefault;
        }
        byte[] bArr3 = bArr;
        if ((i3 & 4) != 0) {
            b = c59966zsv.OLrzqt;
        }
        byte b2 = b;
        if ((i3 & 8) != 0) {
            i = c59966zsv.KWHzl;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = c59966zsv.EZpvd;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            bArr2 = c59966zsv.AhwBna;
        }
        return c59966zsv.OLrzqt(c59926zsH, bArr3, b2, i4, i5, bArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59926zsH AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59966zsv OLrzqt(@NotNull C59926zsH c59926zsH, @NotNull byte[] bArr, byte b, int i, int i2, @NotNull byte[] bArr2) {
        Intrinsics.checkNotNullParameter(c59926zsH, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        return new C59966zsv(c59926zsH, bArr, b, i, i2, bArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ExtendedKey(keyPair=" + this.AEQbTJ + ", chainCode=" + java.util.Arrays.toString(this.copydefault) + ", depth=" + ((int) this.OLrzqt) + ", parentFingerprint=" + this.KWHzl + ", sequence=" + this.EZpvd + ", versionBytes=" + java.util.Arrays.toString(this.AhwBna) + ')';
    }

    public C59966zsv(@NotNull C59926zsH c59926zsH, @NotNull byte[] bArr, byte b, int i, int i2, @NotNull byte[] bArr2) {
        Intrinsics.checkNotNullParameter(c59926zsH, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        this.AEQbTJ = c59926zsH;
        this.copydefault = bArr;
        this.OLrzqt = b;
        this.KWHzl = i;
        this.EZpvd = i2;
        this.AhwBna = bArr2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(C59966zsv.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            C59966zsv c59966zsv = (C59966zsv) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, c59966zsv.AEQbTJ) && java.util.Arrays.equals(this.AhwBna, c59966zsv.AhwBna) && java.util.Arrays.equals(this.copydefault, c59966zsv.copydefault) && this.OLrzqt == c59966zsv.OLrzqt && this.KWHzl == c59966zsv.KWHzl && this.EZpvd == c59966zsv.EZpvd;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type org.kethereum.bip32.model.ExtendedKey");
    }

    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        return (((((((((iHashCode * 31) + java.util.Arrays.hashCode(this.AhwBna)) * 31) + java.util.Arrays.hashCode(this.copydefault)) * 31) + this.OLrzqt) * 31) + this.KWHzl) * 31) + this.EZpvd;
    }

    public static /* synthetic */ java.lang.String serialize$default(C59966zsv c59966zsv, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return c59966zsv.copydefault(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[Catch: IOException -> 0x00a0, TryCatch #0 {IOException -> 0x00a0, blocks: (B:4:0x0008, B:6:0x0014, B:9:0x0021, B:10:0x0028, B:12:0x002b, B:15:0x003a, B:16:0x0041, B:18:0x0044, B:20:0x0050, B:26:0x006a, B:28:0x0083, B:29:0x008d, B:22:0x0057, B:24:0x0063, B:25:0x0068), top: B:33:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[Catch: IOException -> 0x00a0, TryCatch #0 {IOException -> 0x00a0, blocks: (B:4:0x0008, B:6:0x0014, B:9:0x0021, B:10:0x0028, B:12:0x002b, B:15:0x003a, B:16:0x0041, B:18:0x0044, B:20:0x0050, B:26:0x006a, B:28:0x0083, B:29:0x008d, B:22:0x0057, B:24:0x0063, B:25:0x0068), top: B:33:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d A[Catch: IOException -> 0x00a0, TRY_LEAVE, TryCatch #0 {IOException -> 0x00a0, blocks: (B:4:0x0008, B:6:0x0014, B:9:0x0021, B:10:0x0028, B:12:0x002b, B:15:0x003a, B:16:0x0041, B:18:0x0044, B:20:0x0050, B:26:0x006a, B:28:0x0083, B:29:0x008d, B:22:0x0057, B:24:0x0063, B:25:0x0068), top: B:33:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String copydefault(boolean z) throws KeyException {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(78);
        if (z) {
            if (!z) {
                throw new KeyException("The extended key doesn't provide any private key. Suggest using publicKeyOnly mode");
            }
            if (z) {
                if (z) {
                    byteBufferAllocate.put((z || !java.util.Arrays.equals(this.AhwBna, C59957zsm.copydefault())) ? (z || !java.util.Arrays.equals(this.AhwBna, C59957zsm.KWHzl())) ? this.AhwBna : C59957zsm.AEQbTJ() : C59957zsm.OLrzqt());
                    byteBufferAllocate.put(this.OLrzqt);
                    byteBufferAllocate.putInt(this.KWHzl);
                    byteBufferAllocate.putInt(this.EZpvd);
                    byteBufferAllocate.put(this.copydefault);
                    if (!z) {
                    }
                }
            }
        } else {
            try {
                if (!java.util.Arrays.equals(this.AhwBna, C59957zsm.copydefault()) && !java.util.Arrays.equals(this.AhwBna, C59957zsm.KWHzl())) {
                    throw new KeyException("The extended version bytes dedicated to public keys. Suggest using publicKeyOnly mode");
                }
                if (!z && Intrinsics.EZpvd(this.AEQbTJ.OLrzqt(), java.math.BigInteger.ZERO)) {
                    throw new KeyException("The extended key doesn't provide any private key. Suggest using publicKeyOnly mode");
                }
                byteBufferAllocate.put((z || !java.util.Arrays.equals(this.AhwBna, C59957zsm.copydefault())) ? (z || !java.util.Arrays.equals(this.AhwBna, C59957zsm.KWHzl())) ? this.AhwBna : C59957zsm.AEQbTJ() : C59957zsm.OLrzqt());
                byteBufferAllocate.put(this.OLrzqt);
                byteBufferAllocate.putInt(this.KWHzl);
                byteBufferAllocate.putInt(this.EZpvd);
                byteBufferAllocate.put(this.copydefault);
                if (!z) {
                    byteBufferAllocate.put(C59970zsz.AEQbTJ(this.AEQbTJ));
                } else {
                    byteBufferAllocate.put((byte) 0);
                    byteBufferAllocate.put(C59927zsI.EZpvd(this.AEQbTJ.OLrzqt(), 32));
                }
            } catch (java.io.IOException unused) {
            }
        }
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "");
        return C60070zut.OLrzqt(bArrArray);
    }
}
