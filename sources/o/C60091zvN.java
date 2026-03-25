package o;

import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.StandardCharsets;
import java.security.SignatureException;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.asn1.x9.X9IntegerConverter;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.FixedPointCombMultiplier;
import org.bouncycastle.math.ec.custom.sec.SecP256K1Curve;

/* JADX INFO: renamed from: o.zvN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60091zvN {
    public static final java.math.BigInteger AEQbTJ;
    public static final ECDomainParameters KWHzl;
    public static final X9ECParameters OLrzqt;

    static {
        X9ECParameters byName = CustomNamedCurves.getByName("secp256k1");
        OLrzqt = byName;
        KWHzl = new ECDomainParameters(byName.getCurve(), byName.getG(), byName.getN(), byName.getH());
        AEQbTJ = byName.getN().shiftRight(1);
    }

    public static byte[] AEQbTJ(int i) {
        return "\u0019Ethereum Signed Message:\n".concat(java.lang.String.valueOf(i)).getBytes(StandardCharsets.UTF_8);
    }

    public static byte[] EZpvd(byte[] bArr) {
        byte[] bArrAEQbTJ = AEQbTJ(bArr.length);
        byte[] bArr2 = new byte[bArrAEQbTJ.length + bArr.length];
        java.lang.System.arraycopy(bArrAEQbTJ, 0, bArr2, 0, bArrAEQbTJ.length);
        java.lang.System.arraycopy(bArr, 0, bArr2, bArrAEQbTJ.length, bArr.length);
        return C60086zvI.AEQbTJ(bArr2);
    }

    public static TaskDescription KWHzl(byte[] bArr, C60087zvJ c60087zvJ) {
        return EZpvd(EZpvd(bArr), c60087zvJ, false);
    }

    public static TaskDescription AEQbTJ(byte[] bArr, C60087zvJ c60087zvJ) {
        return EZpvd(bArr, c60087zvJ, true);
    }

    public static TaskDescription EZpvd(byte[] bArr, C60087zvJ c60087zvJ, boolean z) {
        java.math.BigInteger bigIntegerCopydefault = c60087zvJ.copydefault();
        if (z) {
            bArr = C60086zvI.AEQbTJ(bArr);
        }
        return EZpvd(c60087zvJ.copydefault(bArr), bigIntegerCopydefault, bArr);
    }

    public static TaskDescription EZpvd(C60084zvG c60084zvG, java.math.BigInteger bigInteger, byte[] bArr) {
        int i = 0;
        while (true) {
            if (i >= 4) {
                i = -1;
                break;
            }
            java.math.BigInteger bigIntegerOLrzqt = OLrzqt(i, c60084zvG, bArr);
            if (bigIntegerOLrzqt != null && bigIntegerOLrzqt.equals(bigInteger)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new java.lang.RuntimeException("Could not construct a recoverable key. Are your credentials valid?");
        }
        return new TaskDescription(new byte[]{(byte) (i + 27)}, C60088zvK.AEQbTJ(c60084zvG.AEQbTJ, 32), C60088zvK.AEQbTJ(c60084zvG.KWHzl, 32));
    }

    public static java.math.BigInteger OLrzqt(int i, C60084zvG c60084zvG, byte[] bArr) {
        C60092zvO.AEQbTJ(i >= 0 && i <= 3, "recId must be in the range of [0, 3]");
        C60092zvO.AEQbTJ(c60084zvG.AEQbTJ.signum() >= 0, "r must be positive");
        C60092zvO.AEQbTJ(c60084zvG.KWHzl.signum() >= 0, "s must be positive");
        C60092zvO.AEQbTJ(bArr != null, "message cannot be null");
        ECDomainParameters eCDomainParameters = KWHzl;
        java.math.BigInteger n = eCDomainParameters.getN();
        java.math.BigInteger bigIntegerAdd = c60084zvG.AEQbTJ.add(java.math.BigInteger.valueOf(((long) i) / 2).multiply(n));
        if (bigIntegerAdd.compareTo(SecP256K1Curve.q) >= 0) {
            return null;
        }
        org.bouncycastle.math.ec.ECPoint eCPointAEQbTJ = AEQbTJ(bigIntegerAdd, (i & 1) == 1);
        if (!eCPointAEQbTJ.multiply(n).isInfinity()) {
            return null;
        }
        java.math.BigInteger bigIntegerMod = java.math.BigInteger.ZERO.subtract(new java.math.BigInteger(1, bArr)).mod(n);
        java.math.BigInteger bigIntegerModInverse = c60084zvG.AEQbTJ.modInverse(n);
        byte[] encoded = ECAlgorithms.sumOfTwoMultiplies(eCDomainParameters.getG(), bigIntegerModInverse.multiply(bigIntegerMod).mod(n), eCPointAEQbTJ, bigIntegerModInverse.multiply(c60084zvG.KWHzl).mod(n)).getEncoded(false);
        return new java.math.BigInteger(1, java.util.Arrays.copyOfRange(encoded, 1, encoded.length));
    }

    public static org.bouncycastle.math.ec.ECPoint AEQbTJ(java.math.BigInteger bigInteger, boolean z) {
        X9IntegerConverter x9IntegerConverter = new X9IntegerConverter();
        ECDomainParameters eCDomainParameters = KWHzl;
        byte[] bArrIntegerToBytes = x9IntegerConverter.integerToBytes(bigInteger, x9IntegerConverter.getByteLength(eCDomainParameters.getCurve()) + 1);
        bArrIntegerToBytes[0] = (byte) (z ? 3 : 2);
        return eCDomainParameters.getCurve().decodePoint(bArrIntegerToBytes);
    }

    public static java.math.BigInteger KWHzl(byte[] bArr, TaskDescription taskDescription) throws SignatureException {
        return OLrzqt(C60086zvI.AEQbTJ(bArr), taskDescription);
    }

    public static java.math.BigInteger EZpvd(byte[] bArr, TaskDescription taskDescription) throws SignatureException {
        return OLrzqt(EZpvd(bArr), taskDescription);
    }

    public static java.math.BigInteger OLrzqt(byte[] bArr, TaskDescription taskDescription) throws SignatureException {
        byte[] bArrEZpvd = taskDescription.EZpvd();
        byte[] bArrKWHzl = taskDescription.KWHzl();
        C60092zvO.AEQbTJ(bArrEZpvd != null && bArrEZpvd.length == 32, "r must be 32 bytes");
        C60092zvO.AEQbTJ(bArrKWHzl != null && bArrKWHzl.length == 32, "s must be 32 bytes");
        int i = taskDescription.copydefault()[0] & UnsignedBytes.MAX_VALUE;
        if (i < 27 || i > 34) {
            throw new SignatureException("Header byte out of range: " + i);
        }
        java.math.BigInteger bigIntegerOLrzqt = OLrzqt(i - 27, new C60084zvG(new java.math.BigInteger(1, taskDescription.EZpvd()), new java.math.BigInteger(1, taskDescription.KWHzl())), bArr);
        if (bigIntegerOLrzqt != null) {
            return bigIntegerOLrzqt;
        }
        throw new SignatureException("Could not recover public key from signature");
    }

    public static java.math.BigInteger EZpvd(java.math.BigInteger bigInteger) {
        byte[] encoded = AEQbTJ(bigInteger).getEncoded(false);
        return new java.math.BigInteger(1, java.util.Arrays.copyOfRange(encoded, 1, encoded.length));
    }

    public static org.bouncycastle.math.ec.ECPoint AEQbTJ(java.math.BigInteger bigInteger) {
        int iBitLength = bigInteger.bitLength();
        ECDomainParameters eCDomainParameters = KWHzl;
        if (iBitLength > eCDomainParameters.getN().bitLength()) {
            bigInteger = bigInteger.mod(eCDomainParameters.getN());
        }
        return new FixedPointCombMultiplier().multiply(eCDomainParameters.getG(), bigInteger);
    }

    /* JADX INFO: renamed from: o.zvN$TaskDescription */
    public static class TaskDescription {
        public final byte[] EZpvd;
        public final byte[] KWHzl;
        public final byte[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public byte[] EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public byte[] KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public byte[] copydefault() {
            return this.OLrzqt;
        }

        public TaskDescription(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            this.OLrzqt = bArr;
            this.EZpvd = bArr2;
            this.KWHzl = bArr3;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            if (java.util.Arrays.equals(this.OLrzqt, taskDescription.OLrzqt) && java.util.Arrays.equals(this.EZpvd, taskDescription.EZpvd)) {
                return java.util.Arrays.equals(this.KWHzl, taskDescription.KWHzl);
            }
            return false;
        }

        public int hashCode() {
            int iHashCode = java.util.Arrays.hashCode(this.OLrzqt);
            return (((iHashCode * 31) + java.util.Arrays.hashCode(this.EZpvd)) * 31) + java.util.Arrays.hashCode(this.KWHzl);
        }
    }
}
