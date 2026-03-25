package o;

import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.signers.ECDSASigner;
import org.bouncycastle.crypto.signers.HMacDSAKCalculator;

/* JADX INFO: renamed from: o.zvJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C60087zvJ {
    public final java.math.BigInteger AEQbTJ;
    public final java.math.BigInteger KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.math.BigInteger copydefault() {
        return this.AEQbTJ;
    }

    public C60087zvJ(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        this.KWHzl = bigInteger;
        this.AEQbTJ = bigInteger2;
    }

    public C60084zvG copydefault(byte[] bArr) {
        ECDSASigner eCDSASigner = new ECDSASigner(new HMacDSAKCalculator(new SHA256Digest()));
        eCDSASigner.init(true, new ECPrivateKeyParameters(this.KWHzl, C60091zvN.KWHzl));
        java.math.BigInteger[] bigIntegerArrGenerateSignature = eCDSASigner.generateSignature(bArr);
        return new C60084zvG(bigIntegerArrGenerateSignature[0], bigIntegerArrGenerateSignature[1]).copydefault();
    }

    public static C60087zvJ OLrzqt(java.math.BigInteger bigInteger) {
        return new C60087zvJ(bigInteger, C60091zvN.EZpvd(bigInteger));
    }

    public static C60087zvJ KWHzl(byte[] bArr) {
        return OLrzqt(C60088zvK.OLrzqt(bArr));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C60087zvJ c60087zvJ = (C60087zvJ) obj;
        java.math.BigInteger bigInteger = this.KWHzl;
        if (bigInteger == null ? c60087zvJ.KWHzl != null : !bigInteger.equals(c60087zvJ.KWHzl)) {
            return false;
        }
        java.math.BigInteger bigInteger2 = this.AEQbTJ;
        if (bigInteger2 != null) {
            return bigInteger2.equals(c60087zvJ.AEQbTJ);
        }
        return c60087zvJ.AEQbTJ == null;
    }

    public int hashCode() {
        java.math.BigInteger bigInteger = this.KWHzl;
        int iHashCode = bigInteger != null ? bigInteger.hashCode() : 0;
        java.math.BigInteger bigInteger2 = this.AEQbTJ;
        return (iHashCode * 31) + (bigInteger2 != null ? bigInteger2.hashCode() : 0);
    }
}
