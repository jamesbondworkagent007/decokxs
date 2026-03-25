package org.apache.http.impl.auth;

import androidx.work.WorkRequest;
import com.google.common.primitives.UnsignedBytes;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import o.C59497ziE;
import o.C59514ziV;
import o.InterfaceC59685zlh;

/* JADX INFO: loaded from: classes13.dex */
public final class NTLMEngineImpl implements InterfaceC59685zlh {
    public static final byte[] AEQbTJ;
    public static final String AYXKKw;
    public static final byte[] AhwBna;
    public static final byte[] EZpvd;
    public static final SecureRandom KWHzl;
    public static final byte[] OLrzqt;
    public static final byte[] gEmmrt;
    public static final byte[] valueOf;
    public static final Charset djBIcL = Charset.forName("UnicodeLittleUnmarked");
    public static final Charset copydefault = C59514ziV.EZpvd;

    /* JADX INFO: loaded from: classes17.dex */
    public enum Mode {
        CLIENT,
        SERVER
    }

    public static int AEQbTJ(int i, int i2, int i3) {
        return (i & i2) | (i & i3) | (i2 & i3);
    }

    public static int EZpvd(int i, int i2) {
        return (i << i2) | (i >>> (32 - i2));
    }

    public static int KWHzl(int i, int i2, int i3) {
        return (i & i2) | (i3 & (~i));
    }

    public static int copydefault(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String copydefault(String str, String str2) {
        return AYXKKw;
    }

    static {
        SecureRandom secureRandom;
        try {
            secureRandom = SecureRandom.getInstance("SHA1PRNG");
        } catch (Exception unused) {
            secureRandom = null;
        }
        KWHzl = secureRandom;
        AhwBna = gEmmrt("NTLMSSP");
        valueOf = gEmmrt("session key to server-to-client signing key magic constant");
        gEmmrt = gEmmrt("session key to client-to-server signing key magic constant");
        EZpvd = gEmmrt("session key to server-to-client sealing key magic constant");
        OLrzqt = gEmmrt("session key to client-to-server sealing key magic constant");
        AEQbTJ = "tls-server-end-point:".getBytes(C59514ziV.EZpvd);
        AYXKKw = new Application().KWHzl();
    }

    public static byte[] gEmmrt(String str) {
        byte[] bytes = str.getBytes(C59514ziV.EZpvd);
        byte[] bArr = new byte[bytes.length + 1];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        bArr[bytes.length] = 0;
        return bArr;
    }

    public static String EZpvd(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) throws NTLMEngineException {
        return new LoaderManager(str4, str3, str, str2, bArr, i, str5, bArr2).KWHzl();
    }

    public static int djBIcL(byte[] bArr, int i) throws NTLMEngineException {
        if (bArr.length < i + 4) {
            return 0;
        }
        return ((bArr[i + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i] & UnsignedBytes.MAX_VALUE) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    public static int valueOf(byte[] bArr, int i) throws NTLMEngineException {
        if (bArr.length < i + 2) {
            return 0;
        }
        return ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[i] & UnsignedBytes.MAX_VALUE);
    }

    public static byte[] EZpvd(byte[] bArr, int i) throws NTLMEngineException {
        int iValueOf = valueOf(bArr, i);
        int iDjBIcL = djBIcL(bArr, i + 4);
        if (bArr.length < iDjBIcL + iValueOf) {
            return new byte[iValueOf];
        }
        byte[] bArr2 = new byte[iValueOf];
        System.arraycopy(bArr, iDjBIcL, bArr2, 0, iValueOf);
        return bArr2;
    }

    public static byte[] OLrzqt(Random random) throws NTLMEngineException {
        byte[] bArr = new byte[8];
        synchronized (random) {
            random.nextBytes(bArr);
        }
        return bArr;
    }

    public static byte[] copydefault(Random random) throws NTLMEngineException {
        byte[] bArr = new byte[16];
        synchronized (random) {
            random.nextBytes(bArr);
        }
        return bArr;
    }

    public static class Activity {
        public final byte[] AEQbTJ;
        public byte[] AYXKKw;
        public byte[] AhwBna;
        public byte[] AkhnZx;
        public byte[] AuCTel;
        public final byte[] AuCTelauCTel;
        public byte[] DbNXlk;
        public byte[] EZpvd;
        public byte[] KWHzl;
        public final long OLrzqt;
        public final String copydefault;
        public byte[] djBIcL;
        public byte[] ejfBZ;
        public byte[] fARcdN;
        public byte[] fIwbmz;
        public byte[] fJNWhG;
        public byte[] fetchVPNInfo;
        public byte[] gEmmrt;
        public final String getFieldNames;
        public final String getNewProxyInstance;
        public final Random hDKMBd;
        public byte[] isConnected;
        public byte[] iwGUEr;
        public byte[] uzCIH;
        public byte[] valueOf;
        public byte[] values;
        public byte[] zLjUOn;
        public final String zsXlph;

        public Activity(Random random, long j, String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
            this.AYXKKw = null;
            this.gEmmrt = null;
            this.DbNXlk = null;
            this.fARcdN = null;
            this.AuCTel = null;
            this.values = null;
            this.AkhnZx = null;
            this.fIwbmz = null;
            this.fJNWhG = null;
            this.fetchVPNInfo = null;
            this.valueOf = null;
            this.AhwBna = null;
            this.ejfBZ = null;
            this.uzCIH = null;
            this.isConnected = null;
            this.djBIcL = null;
            this.hDKMBd = random;
            this.OLrzqt = j;
            this.copydefault = str;
            this.getNewProxyInstance = str4;
            this.zsXlph = str2;
            this.getFieldNames = str3;
            this.AEQbTJ = bArr;
            this.AuCTelauCTel = bArr2;
            this.KWHzl = bArr3;
            this.EZpvd = bArr4;
            this.iwGUEr = bArr5;
            this.zLjUOn = bArr6;
        }

        public Activity(Random random, long j, String str, String str2, String str3, byte[] bArr, String str4, byte[] bArr2) {
            this(random, j, str, str2, str3, bArr, str4, bArr2, null, null, null, null);
        }

        public byte[] KWHzl() throws NTLMEngineException {
            if (this.KWHzl == null) {
                this.KWHzl = NTLMEngineImpl.OLrzqt(this.hDKMBd);
            }
            return this.KWHzl;
        }

        public byte[] copydefault() throws NTLMEngineException {
            if (this.EZpvd == null) {
                this.EZpvd = NTLMEngineImpl.OLrzqt(this.hDKMBd);
            }
            return this.EZpvd;
        }

        public byte[] AuCTel() throws NTLMEngineException {
            if (this.iwGUEr == null) {
                this.iwGUEr = NTLMEngineImpl.copydefault(this.hDKMBd);
            }
            return this.iwGUEr;
        }

        public byte[] AEQbTJ() throws NTLMEngineException {
            if (this.AYXKKw == null) {
                this.AYXKKw = NTLMEngineImpl.djBIcL(this.getFieldNames);
            }
            return this.AYXKKw;
        }

        public byte[] OLrzqt() throws NTLMEngineException {
            if (this.gEmmrt == null) {
                this.gEmmrt = NTLMEngineImpl.EZpvd(AEQbTJ(), this.AEQbTJ);
            }
            return this.gEmmrt;
        }

        public byte[] DbNXlk() throws NTLMEngineException {
            if (this.DbNXlk == null) {
                this.DbNXlk = NTLMEngineImpl.AYXKKw(this.getFieldNames);
            }
            return this.DbNXlk;
        }

        public byte[] values() throws NTLMEngineException {
            if (this.fARcdN == null) {
                this.fARcdN = NTLMEngineImpl.EZpvd(DbNXlk(), this.AEQbTJ);
            }
            return this.fARcdN;
        }

        public byte[] djBIcL() throws NTLMEngineException {
            if (this.values == null) {
                this.values = NTLMEngineImpl.copydefault(this.copydefault, this.zsXlph, DbNXlk());
            }
            return this.values;
        }

        public byte[] fIwbmz() throws NTLMEngineException {
            if (this.AuCTel == null) {
                this.AuCTel = NTLMEngineImpl.KWHzl(this.copydefault, this.zsXlph, DbNXlk());
            }
            return this.AuCTel;
        }

        public byte[] ejfBZ() {
            if (this.zLjUOn == null) {
                long j = (this.OLrzqt + 11644473600000L) * WorkRequest.MIN_BACKOFF_MILLIS;
                this.zLjUOn = new byte[8];
                for (int i = 0; i < 8; i++) {
                    this.zLjUOn[i] = (byte) j;
                    j >>>= 8;
                }
            }
            return this.zLjUOn;
        }

        public byte[] fetchVPNInfo() throws NTLMEngineException {
            if (this.fIwbmz == null) {
                this.fIwbmz = NTLMEngineImpl.AEQbTJ(copydefault(), this.AuCTelauCTel, ejfBZ());
            }
            return this.fIwbmz;
        }

        public byte[] fARcdN() throws NTLMEngineException {
            if (this.fJNWhG == null) {
                this.fJNWhG = NTLMEngineImpl.EZpvd(fIwbmz(), this.AEQbTJ, fetchVPNInfo());
            }
            return this.fJNWhG;
        }

        public byte[] AhwBna() throws NTLMEngineException {
            if (this.AkhnZx == null) {
                this.AkhnZx = NTLMEngineImpl.EZpvd(djBIcL(), this.AEQbTJ, KWHzl());
            }
            return this.AkhnZx;
        }

        public byte[] valueOf() throws NTLMEngineException {
            if (this.fetchVPNInfo == null) {
                this.fetchVPNInfo = NTLMEngineImpl.KWHzl(DbNXlk(), this.AEQbTJ, KWHzl());
            }
            return this.fetchVPNInfo;
        }

        public byte[] EZpvd() throws NTLMEngineException {
            if (this.valueOf == null) {
                byte[] bArrKWHzl = KWHzl();
                byte[] bArr = new byte[24];
                this.valueOf = bArr;
                System.arraycopy(bArrKWHzl, 0, bArr, 0, bArrKWHzl.length);
                byte[] bArr2 = this.valueOf;
                Arrays.fill(bArr2, bArrKWHzl.length, bArr2.length, (byte) 0);
            }
            return this.valueOf;
        }

        public byte[] AYXKKw() throws NTLMEngineException {
            if (this.AhwBna == null) {
                this.AhwBna = new byte[16];
                System.arraycopy(AEQbTJ(), 0, this.AhwBna, 0, 8);
                Arrays.fill(this.AhwBna, 8, 16, (byte) 0);
            }
            return this.AhwBna;
        }

        public byte[] AkhnZx() throws NTLMEngineException {
            if (this.ejfBZ == null) {
                ActionBar actionBar = new ActionBar();
                actionBar.OLrzqt(DbNXlk());
                this.ejfBZ = actionBar.OLrzqt();
            }
            return this.ejfBZ;
        }

        public byte[] fJNWhG() throws NTLMEngineException {
            if (this.uzCIH == null) {
                byte[] bArrFIwbmz = fIwbmz();
                byte[] bArr = new byte[16];
                System.arraycopy(fARcdN(), 0, bArr, 0, 16);
                this.uzCIH = NTLMEngineImpl.copydefault(bArr, bArrFIwbmz);
            }
            return this.uzCIH;
        }

        public byte[] isConnected() throws NTLMEngineException {
            if (this.isConnected == null) {
                byte[] bArrEZpvd = EZpvd();
                byte[] bArr = this.AEQbTJ;
                byte[] bArr2 = new byte[bArr.length + bArrEZpvd.length];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                System.arraycopy(bArrEZpvd, 0, bArr2, this.AEQbTJ.length, bArrEZpvd.length);
                this.isConnected = NTLMEngineImpl.copydefault(bArr2, AkhnZx());
            }
            return this.isConnected;
        }

        public byte[] gEmmrt() throws NTLMEngineException {
            if (this.djBIcL == null) {
                try {
                    byte[] bArr = new byte[14];
                    System.arraycopy(AEQbTJ(), 0, bArr, 0, 8);
                    Arrays.fill(bArr, 8, 14, (byte) -67);
                    Key keyKWHzl = NTLMEngineImpl.KWHzl(bArr, 0);
                    Key keyKWHzl2 = NTLMEngineImpl.KWHzl(bArr, 7);
                    byte[] bArr2 = new byte[8];
                    System.arraycopy(OLrzqt(), 0, bArr2, 0, 8);
                    Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
                    cipher.init(1, keyKWHzl);
                    byte[] bArrDoFinal = cipher.doFinal(bArr2);
                    Cipher cipher2 = Cipher.getInstance("DES/ECB/NoPadding");
                    cipher2.init(1, keyKWHzl2);
                    byte[] bArrDoFinal2 = cipher2.doFinal(bArr2);
                    byte[] bArr3 = new byte[16];
                    this.djBIcL = bArr3;
                    System.arraycopy(bArrDoFinal, 0, bArr3, 0, bArrDoFinal.length);
                    System.arraycopy(bArrDoFinal2, 0, this.djBIcL, bArrDoFinal.length, bArrDoFinal2.length);
                } catch (Exception e) {
                    throw new NTLMEngineException(e.getMessage(), e);
                }
            }
            return this.djBIcL;
        }
    }

    public static byte[] copydefault(byte[] bArr, byte[] bArr2) throws NTLMEngineException {
        StateListAnimator stateListAnimator = new StateListAnimator(bArr2);
        stateListAnimator.KWHzl(bArr);
        return stateListAnimator.copydefault();
    }

    public static byte[] KWHzl(byte[] bArr, byte[] bArr2) throws NTLMEngineException {
        try {
            Cipher cipher = Cipher.getInstance("RC4");
            cipher.init(1, new SecretKeySpec(bArr2, "RC4"));
            return cipher.doFinal(bArr);
        } catch (Exception e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    public static byte[] KWHzl(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NTLMEngineException {
        try {
            MessageDigest messageDigestAEQbTJ = AEQbTJ();
            messageDigestAEQbTJ.update(bArr2);
            messageDigestAEQbTJ.update(bArr3);
            byte[] bArrDigest = messageDigestAEQbTJ.digest();
            byte[] bArr4 = new byte[8];
            System.arraycopy(bArrDigest, 0, bArr4, 0, 8);
            return EZpvd(bArr, bArr4);
        } catch (Exception e) {
            if (e instanceof NTLMEngineException) {
                throw ((NTLMEngineException) e);
            }
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    public static byte[] djBIcL(String str) throws NTLMEngineException {
        try {
            String upperCase = str.toUpperCase(Locale.ROOT);
            Charset charset = C59514ziV.EZpvd;
            byte[] bytes = upperCase.getBytes(charset);
            byte[] bArr = new byte[14];
            System.arraycopy(bytes, 0, bArr, 0, Math.min(bytes.length, 14));
            Key keyKWHzl = KWHzl(bArr, 0);
            Key keyKWHzl2 = KWHzl(bArr, 7);
            byte[] bytes2 = "KGS!@#$%".getBytes(charset);
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, keyKWHzl);
            byte[] bArrDoFinal = cipher.doFinal(bytes2);
            cipher.init(1, keyKWHzl2);
            byte[] bArrDoFinal2 = cipher.doFinal(bytes2);
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArrDoFinal, 0, bArr2, 0, 8);
            System.arraycopy(bArrDoFinal2, 0, bArr2, 8, 8);
            return bArr2;
        } catch (Exception e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    public static byte[] AYXKKw(String str) throws NTLMEngineException {
        Charset charset = djBIcL;
        if (charset == null) {
            throw new NTLMEngineException("Unicode not supported");
        }
        byte[] bytes = str.getBytes(charset);
        ActionBar actionBar = new ActionBar();
        actionBar.OLrzqt(bytes);
        return actionBar.OLrzqt();
    }

    public static byte[] copydefault(String str, String str2, byte[] bArr) throws NTLMEngineException {
        Charset charset = djBIcL;
        if (charset == null) {
            throw new NTLMEngineException("Unicode not supported");
        }
        StateListAnimator stateListAnimator = new StateListAnimator(bArr);
        Locale locale = Locale.ROOT;
        stateListAnimator.KWHzl(str2.toUpperCase(locale).getBytes(charset));
        if (str != null) {
            stateListAnimator.KWHzl(str.toUpperCase(locale).getBytes(charset));
        }
        return stateListAnimator.copydefault();
    }

    public static byte[] KWHzl(String str, String str2, byte[] bArr) throws NTLMEngineException {
        Charset charset = djBIcL;
        if (charset == null) {
            throw new NTLMEngineException("Unicode not supported");
        }
        StateListAnimator stateListAnimator = new StateListAnimator(bArr);
        stateListAnimator.KWHzl(str2.toUpperCase(Locale.ROOT).getBytes(charset));
        if (str != null) {
            stateListAnimator.KWHzl(str.getBytes(charset));
        }
        return stateListAnimator.copydefault();
    }

    public static byte[] EZpvd(byte[] bArr, byte[] bArr2) throws NTLMEngineException {
        try {
            byte[] bArr3 = new byte[21];
            System.arraycopy(bArr, 0, bArr3, 0, 16);
            Key keyKWHzl = KWHzl(bArr3, 0);
            Key keyKWHzl2 = KWHzl(bArr3, 7);
            Key keyKWHzl3 = KWHzl(bArr3, 14);
            Cipher cipher = Cipher.getInstance("DES/ECB/NoPadding");
            cipher.init(1, keyKWHzl);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            cipher.init(1, keyKWHzl2);
            byte[] bArrDoFinal2 = cipher.doFinal(bArr2);
            cipher.init(1, keyKWHzl3);
            byte[] bArrDoFinal3 = cipher.doFinal(bArr2);
            byte[] bArr4 = new byte[24];
            System.arraycopy(bArrDoFinal, 0, bArr4, 0, 8);
            System.arraycopy(bArrDoFinal2, 0, bArr4, 8, 8);
            System.arraycopy(bArrDoFinal3, 0, bArr4, 16, 8);
            return bArr4;
        } catch (Exception e) {
            throw new NTLMEngineException(e.getMessage(), e);
        }
    }

    public static byte[] EZpvd(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NTLMEngineException {
        StateListAnimator stateListAnimator = new StateListAnimator(bArr);
        stateListAnimator.KWHzl(bArr2);
        stateListAnimator.KWHzl(bArr3);
        byte[] bArrCopydefault = stateListAnimator.copydefault();
        byte[] bArr4 = new byte[bArrCopydefault.length + bArr3.length];
        System.arraycopy(bArrCopydefault, 0, bArr4, 0, bArrCopydefault.length);
        System.arraycopy(bArr3, 0, bArr4, bArrCopydefault.length, bArr3.length);
        return bArr4;
    }

    public static byte[] AEQbTJ(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[bArr3.length + 20 + bArr2.length + 4];
        System.arraycopy(new byte[]{1, 1, 0, 0}, 0, bArr4, 0, 4);
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, bArr4, 4, 4);
        System.arraycopy(bArr3, 0, bArr4, 8, bArr3.length);
        int length = bArr3.length;
        System.arraycopy(bArr, 0, bArr4, length + 8, 8);
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, bArr4, length + 16, 4);
        int i = length + 20;
        System.arraycopy(bArr2, 0, bArr4, i, bArr2.length);
        System.arraycopy(new byte[]{0, 0, 0, 0}, 0, bArr4, i + bArr2.length, 4);
        return bArr4;
    }

    public static Key KWHzl(byte[] bArr, int i) {
        byte[] bArr2 = new byte[7];
        System.arraycopy(bArr, i, bArr2, 0, 7);
        byte b = bArr2[0];
        byte b2 = bArr2[1];
        byte b3 = (byte) ((b << 7) | ((b2 & UnsignedBytes.MAX_VALUE) >>> 1));
        byte b4 = bArr2[2];
        byte b5 = (byte) ((b2 << 6) | ((b4 & UnsignedBytes.MAX_VALUE) >>> 2));
        byte b6 = bArr2[3];
        byte b7 = (byte) ((b4 << 5) | ((b6 & UnsignedBytes.MAX_VALUE) >>> 3));
        byte b8 = bArr2[4];
        byte b9 = (byte) ((b6 << 4) | ((b8 & UnsignedBytes.MAX_VALUE) >>> 4));
        byte b10 = bArr2[5];
        byte b11 = (byte) (((b10 & UnsignedBytes.MAX_VALUE) >>> 5) | (b8 << 3));
        byte b12 = bArr2[6];
        byte[] bArr3 = {b, b3, b5, b7, b9, b11, (byte) ((b10 << 2) | ((b12 & UnsignedBytes.MAX_VALUE) >>> 6)), (byte) (b12 << 1)};
        OLrzqt(bArr3);
        return new SecretKeySpec(bArr3, "DES");
    }

    public static void OLrzqt(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            if (((((((((b >>> 7) ^ (b >>> 6)) ^ (b >>> 5)) ^ (b >>> 4)) ^ (b >>> 3)) ^ (b >>> 2)) ^ (b >>> 1)) & 1) == 0) {
                bArr[i] = (byte) (b | 1);
            } else {
                bArr[i] = (byte) (b & (-2));
            }
        }
    }

    public static Charset EZpvd(int i) throws NTLMEngineException {
        if ((i & 1) == 0) {
            return copydefault;
        }
        Charset charset = djBIcL;
        if (charset != null) {
            return charset;
        }
        throw new NTLMEngineException("Unicode not supported");
    }

    public static String valueOf(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(46);
        return iIndexOf != -1 ? str.substring(0, iIndexOf) : str;
    }

    public static String AhwBna(String str) {
        return valueOf(str);
    }

    public static String OLrzqt(String str) {
        return valueOf(str);
    }

    public static class TaskDescription {
        public byte[] EZpvd;
        public int KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int copydefault() {
            return this.KWHzl;
        }

        public TaskDescription() {
            this.EZpvd = null;
            this.KWHzl = 0;
        }

        public TaskDescription(byte[] bArr, int i) throws NTLMEngineException {
            this.KWHzl = 0;
            this.EZpvd = bArr;
            if (bArr.length < NTLMEngineImpl.AhwBna.length) {
                throw new NTLMEngineException("NTLM message decoding error - packet too short");
            }
            for (int i2 = 0; i2 < NTLMEngineImpl.AhwBna.length; i2++) {
                if (this.EZpvd[i2] != NTLMEngineImpl.AhwBna[i2]) {
                    throw new NTLMEngineException("NTLM message expected - instead got unrecognized bytes");
                }
            }
            int iAEQbTJ = AEQbTJ(NTLMEngineImpl.AhwBna.length);
            if (iAEQbTJ != i) {
                throw new NTLMEngineException("NTLM type " + Integer.toString(i) + " message expected - instead got type " + Integer.toString(iAEQbTJ));
            }
            this.KWHzl = this.EZpvd.length;
        }

        public void AEQbTJ(byte[] bArr, int i) throws NTLMEngineException {
            byte[] bArr2 = this.EZpvd;
            if (bArr2.length < bArr.length + i) {
                throw new NTLMEngineException("NTLM: Message too short");
            }
            System.arraycopy(bArr2, i, bArr, 0, bArr.length);
        }

        public int AEQbTJ(int i) throws NTLMEngineException {
            return NTLMEngineImpl.djBIcL(this.EZpvd, i);
        }

        public byte[] OLrzqt(int i) throws NTLMEngineException {
            return NTLMEngineImpl.EZpvd(this.EZpvd, i);
        }

        public void EZpvd(int i, int i2) {
            this.EZpvd = new byte[i];
            this.KWHzl = 0;
            copydefault(NTLMEngineImpl.AhwBna);
            copydefault(i2);
        }

        public void EZpvd(byte b) {
            byte[] bArr = this.EZpvd;
            int i = this.KWHzl;
            bArr[i] = b;
            this.KWHzl = i + 1;
        }

        public void copydefault(byte[] bArr) {
            if (bArr == null) {
                return;
            }
            for (byte b : bArr) {
                byte[] bArr2 = this.EZpvd;
                int i = this.KWHzl;
                bArr2[i] = b;
                this.KWHzl = i + 1;
            }
        }

        public void EZpvd(int i) {
            EZpvd((byte) (i & 255));
            EZpvd((byte) ((i >> 8) & 255));
        }

        public void copydefault(int i) {
            EZpvd((byte) (i & 255));
            EZpvd((byte) ((i >> 8) & 255));
            EZpvd((byte) ((i >> 16) & 255));
            EZpvd((byte) ((i >> 24) & 255));
        }

        public String KWHzl() {
            return new String(C59497ziE.OLrzqt(EZpvd()), C59514ziV.EZpvd);
        }

        public byte[] EZpvd() {
            if (this.EZpvd == null) {
                OLrzqt();
            }
            byte[] bArr = this.EZpvd;
            int length = bArr.length;
            int i = this.KWHzl;
            if (length > i) {
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, i);
                this.EZpvd = bArr2;
            }
            return this.EZpvd;
        }

        public void OLrzqt() {
            throw new RuntimeException("Message builder not implemented for " + getClass().getName());
        }
    }

    public static class Application extends TaskDescription {
        public final byte[] AEQbTJ = null;
        public final byte[] copydefault = null;
        public final int OLrzqt = AEQbTJ();

        public final int AEQbTJ() {
            return -1576500735;
        }

        @Override // org.apache.http.impl.auth.NTLMEngineImpl.TaskDescription
        public void OLrzqt() {
            byte[] bArr = this.copydefault;
            int length = bArr != null ? bArr.length : 0;
            byte[] bArr2 = this.AEQbTJ;
            int length2 = bArr2 != null ? bArr2.length : 0;
            int i = length2 + 40;
            EZpvd(i + length, 1);
            copydefault(this.OLrzqt);
            EZpvd(length);
            EZpvd(length);
            copydefault(i);
            EZpvd(length2);
            EZpvd(length2);
            copydefault(40);
            EZpvd(261);
            copydefault(2600);
            EZpvd(3840);
            byte[] bArr3 = this.AEQbTJ;
            if (bArr3 != null) {
                copydefault(bArr3);
            }
            byte[] bArr4 = this.copydefault;
            if (bArr4 != null) {
                copydefault(bArr4);
            }
        }
    }

    public static class PendingIntent extends TaskDescription {
        public final int AEQbTJ;
        public final byte[] OLrzqt;
        public String copydefault;
        public byte[] gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public byte[] AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String AYXKKw() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int gEmmrt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public byte[] valueOf() {
            return this.gEmmrt;
        }

        public PendingIntent(String str) throws NTLMEngineException {
            this(C59497ziE.copydefault(str.getBytes(NTLMEngineImpl.copydefault)));
        }

        public PendingIntent(byte[] bArr) throws NTLMEngineException {
            super(bArr, 2);
            byte[] bArr2 = new byte[8];
            this.OLrzqt = bArr2;
            AEQbTJ(bArr2, 24);
            int iAEQbTJ = AEQbTJ(20);
            this.AEQbTJ = iAEQbTJ;
            this.copydefault = null;
            if (copydefault() >= 20) {
                byte[] bArrOLrzqt = OLrzqt(12);
                if (bArrOLrzqt.length != 0) {
                    this.copydefault = new String(bArrOLrzqt, NTLMEngineImpl.EZpvd(iAEQbTJ));
                }
            }
            this.gEmmrt = null;
            if (copydefault() >= 48) {
                byte[] bArrOLrzqt2 = OLrzqt(40);
                if (bArrOLrzqt2.length != 0) {
                    this.gEmmrt = bArrOLrzqt2;
                }
            }
        }
    }

    public static class LoaderManager extends TaskDescription {
        public final byte[] AEQbTJ;
        public byte[] AYXKKw;
        public final byte[] AhwBna;
        public final byte[] AkhnZx;
        public final int DbNXlk;
        public final boolean OLrzqt;
        public final byte[] copydefault;
        public final byte[] djBIcL;
        public final byte[] fetchVPNInfo;
        public final byte[] gEmmrt;
        public byte[] valueOf;

        public LoaderManager(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2) throws NTLMEngineException {
            this(str, str2, str3, str4, bArr, i, str5, bArr2, null, null, null);
        }

        public LoaderManager(String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2, Certificate certificate, byte[] bArr3, byte[] bArr4) throws NTLMEngineException {
            this(NTLMEngineImpl.KWHzl, System.currentTimeMillis(), str, str2, str3, str4, bArr, i, str5, bArr2, certificate, bArr3, bArr4);
        }

        public LoaderManager(Random random, long j, String str, String str2, String str3, String str4, byte[] bArr, int i, String str5, byte[] bArr2, Certificate certificate, byte[] bArr3, byte[] bArr4) throws NTLMEngineException {
            byte[] bArr5;
            byte[] bArrAYXKKw;
            if (random != null) {
                this.DbNXlk = i;
                this.AhwBna = bArr3;
                this.fetchVPNInfo = bArr4;
                String strAhwBna = NTLMEngineImpl.AhwBna(str2);
                String strOLrzqt = NTLMEngineImpl.OLrzqt(str);
                if (certificate != null) {
                    byte[] bArrEZpvd = EZpvd(bArr2, certificate);
                    this.OLrzqt = true;
                    bArr5 = bArrEZpvd;
                } else {
                    this.OLrzqt = false;
                    bArr5 = bArr2;
                }
                Activity activity = new Activity(random, j, strOLrzqt, str3, str4, bArr, str5, bArr5);
                try {
                    if ((8388608 & i) != 0 && bArr2 != null && str5 != null) {
                        this.valueOf = activity.fARcdN();
                        this.AYXKKw = activity.AhwBna();
                        if ((i & 128) != 0) {
                            bArrAYXKKw = activity.gEmmrt();
                        } else {
                            bArrAYXKKw = activity.fJNWhG();
                        }
                    } else if ((524288 & i) != 0) {
                        this.valueOf = activity.valueOf();
                        this.AYXKKw = activity.EZpvd();
                        if ((i & 128) != 0) {
                            bArrAYXKKw = activity.gEmmrt();
                        } else {
                            bArrAYXKKw = activity.isConnected();
                        }
                    } else {
                        this.valueOf = activity.values();
                        this.AYXKKw = activity.OLrzqt();
                        if ((i & 128) != 0) {
                            bArrAYXKKw = activity.gEmmrt();
                        } else {
                            bArrAYXKKw = activity.AkhnZx();
                        }
                    }
                } catch (NTLMEngineException unused) {
                    this.valueOf = new byte[0];
                    this.AYXKKw = activity.OLrzqt();
                    if ((i & 128) != 0) {
                        bArrAYXKKw = activity.gEmmrt();
                    } else {
                        bArrAYXKKw = activity.AYXKKw();
                    }
                }
                if ((i & 16) != 0) {
                    if ((1073741824 & i) != 0) {
                        byte[] bArrAuCTel = activity.AuCTel();
                        this.AEQbTJ = bArrAuCTel;
                        this.djBIcL = NTLMEngineImpl.KWHzl(bArrAuCTel, bArrAYXKKw);
                    } else {
                        this.djBIcL = bArrAYXKKw;
                        this.AEQbTJ = bArrAYXKKw;
                    }
                } else {
                    if (this.OLrzqt) {
                        throw new NTLMEngineException("Cannot sign/seal: no exported session key");
                    }
                    this.djBIcL = null;
                    this.AEQbTJ = null;
                }
                Charset charsetEZpvd = NTLMEngineImpl.EZpvd(i);
                this.gEmmrt = strAhwBna != null ? strAhwBna.getBytes(charsetEZpvd) : null;
                this.copydefault = strOLrzqt != null ? strOLrzqt.toUpperCase(Locale.ROOT).getBytes(charsetEZpvd) : null;
                this.AkhnZx = str3.getBytes(charsetEZpvd);
                return;
            }
            throw new NTLMEngineException("Random generator not available");
        }

        @Override // org.apache.http.impl.auth.NTLMEngineImpl.TaskDescription
        public void OLrzqt() {
            int i;
            int length = this.valueOf.length;
            int length2 = this.AYXKKw.length;
            byte[] bArr = this.copydefault;
            int length3 = bArr != null ? bArr.length : 0;
            byte[] bArr2 = this.gEmmrt;
            int length4 = bArr2 != null ? bArr2.length : 0;
            int length5 = this.AkhnZx.length;
            byte[] bArr3 = this.djBIcL;
            int length6 = bArr3 != null ? bArr3.length : 0;
            int i2 = (this.OLrzqt ? 16 : 0) + 72;
            int i3 = i2 + length2;
            int i4 = i3 + length;
            int i5 = i4 + length3;
            int i6 = i5 + length5;
            int i7 = i6 + length4;
            EZpvd(i7 + length6, 3);
            EZpvd(length2);
            EZpvd(length2);
            copydefault(i2);
            EZpvd(length);
            EZpvd(length);
            copydefault(i3);
            EZpvd(length3);
            EZpvd(length3);
            copydefault(i4);
            EZpvd(length5);
            EZpvd(length5);
            copydefault(i5);
            EZpvd(length4);
            EZpvd(length4);
            copydefault(i6);
            EZpvd(length6);
            EZpvd(length6);
            copydefault(i7);
            copydefault(this.DbNXlk);
            EZpvd(261);
            copydefault(2600);
            EZpvd(3840);
            if (this.OLrzqt) {
                i = this.KWHzl;
                this.KWHzl = i + 16;
            } else {
                i = -1;
            }
            copydefault(this.AYXKKw);
            copydefault(this.valueOf);
            copydefault(this.copydefault);
            copydefault(this.AkhnZx);
            copydefault(this.gEmmrt);
            byte[] bArr4 = this.djBIcL;
            if (bArr4 != null) {
                copydefault(bArr4);
            }
            if (this.OLrzqt) {
                StateListAnimator stateListAnimator = new StateListAnimator(this.AEQbTJ);
                stateListAnimator.KWHzl(this.AhwBna);
                stateListAnimator.KWHzl(this.fetchVPNInfo);
                stateListAnimator.KWHzl(this.EZpvd);
                byte[] bArrCopydefault = stateListAnimator.copydefault();
                System.arraycopy(bArrCopydefault, 0, this.EZpvd, i, bArrCopydefault.length);
            }
        }

        public final byte[] EZpvd(byte[] bArr, Certificate certificate) throws NTLMEngineException {
            byte[] bArr2 = new byte[bArr.length + 28];
            int length = bArr.length;
            int i = length - 4;
            System.arraycopy(bArr, 0, bArr2, 0, i);
            NTLMEngineImpl.EZpvd(bArr2, 6, i);
            NTLMEngineImpl.EZpvd(bArr2, 4, length - 2);
            NTLMEngineImpl.AEQbTJ(bArr2, 2, length);
            NTLMEngineImpl.EZpvd(bArr2, 10, length + 4);
            NTLMEngineImpl.EZpvd(bArr2, 16, length + 6);
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(certificate.getEncoded());
                byte[] bArr3 = new byte[NTLMEngineImpl.AEQbTJ.length + 20 + bArrDigest.length];
                NTLMEngineImpl.AEQbTJ(bArr3, 53, 16);
                System.arraycopy(NTLMEngineImpl.AEQbTJ, 0, bArr3, 20, NTLMEngineImpl.AEQbTJ.length);
                System.arraycopy(bArrDigest, 0, bArr3, NTLMEngineImpl.AEQbTJ.length + 20, bArrDigest.length);
                System.arraycopy(NTLMEngineImpl.AEQbTJ().digest(bArr3), 0, bArr2, length + 8, 16);
                return bArr2;
            } catch (NoSuchAlgorithmException e) {
                throw new NTLMEngineException(e.getMessage(), e);
            } catch (CertificateEncodingException e2) {
                throw new NTLMEngineException(e2.getMessage(), e2);
            }
        }
    }

    public static void EZpvd(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
    }

    public static void AEQbTJ(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    public static MessageDigest AEQbTJ() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 message digest doesn't seem to exist - fatal error: " + e.getMessage(), e);
        }
    }

    public static class ActionBar {
        public int copydefault = 1732584193;
        public int AEQbTJ = -271733879;
        public int KWHzl = -1732584194;
        public int OLrzqt = 271733878;
        public long EZpvd = 0;
        public final byte[] AhwBna = new byte[64];

        public void OLrzqt(byte[] bArr) {
            byte[] bArr2;
            int i = (int) (this.EZpvd & 63);
            int i2 = 0;
            while (true) {
                int length = bArr.length;
                bArr2 = this.AhwBna;
                if ((length - i2) + i < bArr2.length) {
                    break;
                }
                int length2 = bArr2.length - i;
                System.arraycopy(bArr, i2, bArr2, i, length2);
                this.EZpvd += (long) length2;
                i2 += length2;
                EZpvd();
                i = 0;
            }
            if (i2 < bArr.length) {
                int length3 = bArr.length - i2;
                System.arraycopy(bArr, i2, bArr2, i, length3);
                this.EZpvd += (long) length3;
            }
        }

        public byte[] OLrzqt() {
            int i = (int) (this.EZpvd & 63);
            int i2 = i < 56 ? 56 - i : 120 - i;
            byte[] bArr = new byte[i2 + 8];
            bArr[0] = UnsignedBytes.MAX_POWER_OF_TWO;
            for (int i3 = 0; i3 < 8; i3++) {
                bArr[i2 + i3] = (byte) ((this.EZpvd * 8) >>> (i3 * 8));
            }
            OLrzqt(bArr);
            byte[] bArr2 = new byte[16];
            NTLMEngineImpl.AEQbTJ(bArr2, this.copydefault, 0);
            NTLMEngineImpl.AEQbTJ(bArr2, this.AEQbTJ, 4);
            NTLMEngineImpl.AEQbTJ(bArr2, this.KWHzl, 8);
            NTLMEngineImpl.AEQbTJ(bArr2, this.OLrzqt, 12);
            return bArr2;
        }

        public void EZpvd() {
            int[] iArr = new int[16];
            for (int i = 0; i < 16; i++) {
                byte[] bArr = this.AhwBna;
                int i2 = i * 4;
                iArr[i] = (bArr[i2] & UnsignedBytes.MAX_VALUE) + ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) << 8) + ((bArr[i2 + 2] & UnsignedBytes.MAX_VALUE) << 16) + ((bArr[i2 + 3] & UnsignedBytes.MAX_VALUE) << 24);
            }
            int i3 = this.copydefault;
            int i4 = this.AEQbTJ;
            int i5 = this.KWHzl;
            int i6 = this.OLrzqt;
            copydefault(iArr);
            OLrzqt(iArr);
            EZpvd(iArr);
            this.copydefault += i3;
            this.AEQbTJ += i4;
            this.KWHzl += i5;
            this.OLrzqt += i6;
        }

        public void copydefault(int[] iArr) {
            int iEZpvd = NTLMEngineImpl.EZpvd(this.copydefault + NTLMEngineImpl.KWHzl(this.AEQbTJ, this.KWHzl, this.OLrzqt) + iArr[0], 3);
            this.copydefault = iEZpvd;
            int iEZpvd2 = NTLMEngineImpl.EZpvd(this.OLrzqt + NTLMEngineImpl.KWHzl(iEZpvd, this.AEQbTJ, this.KWHzl) + iArr[1], 7);
            this.OLrzqt = iEZpvd2;
            int iEZpvd3 = NTLMEngineImpl.EZpvd(this.KWHzl + NTLMEngineImpl.KWHzl(iEZpvd2, this.copydefault, this.AEQbTJ) + iArr[2], 11);
            this.KWHzl = iEZpvd3;
            int iEZpvd4 = NTLMEngineImpl.EZpvd(this.AEQbTJ + NTLMEngineImpl.KWHzl(iEZpvd3, this.OLrzqt, this.copydefault) + iArr[3], 19);
            this.AEQbTJ = iEZpvd4;
            int iEZpvd5 = NTLMEngineImpl.EZpvd(this.copydefault + NTLMEngineImpl.KWHzl(iEZpvd4, this.KWHzl, this.OLrzqt) + iArr[4], 3);
            this.copydefault = iEZpvd5;
            int iEZpvd6 = NTLMEngineImpl.EZpvd(this.OLrzqt + NTLMEngineImpl.KWHzl(iEZpvd5, this.AEQbTJ, this.KWHzl) + iArr[5], 7);
            this.OLrzqt = iEZpvd6;
            int iEZpvd7 = NTLMEngineImpl.EZpvd(this.KWHzl + NTLMEngineImpl.KWHzl(iEZpvd6, this.copydefault, this.AEQbTJ) + iArr[6], 11);
            this.KWHzl = iEZpvd7;
            int iEZpvd8 = NTLMEngineImpl.EZpvd(this.AEQbTJ + NTLMEngineImpl.KWHzl(iEZpvd7, this.OLrzqt, this.copydefault) + iArr[7], 19);
            this.AEQbTJ = iEZpvd8;
            int iEZpvd9 = NTLMEngineImpl.EZpvd(this.copydefault + NTLMEngineImpl.KWHzl(iEZpvd8, this.KWHzl, this.OLrzqt) + iArr[8], 3);
            this.copydefault = iEZpvd9;
            int iEZpvd10 = NTLMEngineImpl.EZpvd(this.OLrzqt + NTLMEngineImpl.KWHzl(iEZpvd9, this.AEQbTJ, this.KWHzl) + iArr[9], 7);
            this.OLrzqt = iEZpvd10;
            int iEZpvd11 = NTLMEngineImpl.EZpvd(this.KWHzl + NTLMEngineImpl.KWHzl(iEZpvd10, this.copydefault, this.AEQbTJ) + iArr[10], 11);
            this.KWHzl = iEZpvd11;
            int iEZpvd12 = NTLMEngineImpl.EZpvd(this.AEQbTJ + NTLMEngineImpl.KWHzl(iEZpvd11, this.OLrzqt, this.copydefault) + iArr[11], 19);
            this.AEQbTJ = iEZpvd12;
            int iEZpvd13 = NTLMEngineImpl.EZpvd(this.copydefault + NTLMEngineImpl.KWHzl(iEZpvd12, this.KWHzl, this.OLrzqt) + iArr[12], 3);
            this.copydefault = iEZpvd13;
            int iEZpvd14 = NTLMEngineImpl.EZpvd(this.OLrzqt + NTLMEngineImpl.KWHzl(iEZpvd13, this.AEQbTJ, this.KWHzl) + iArr[13], 7);
            this.OLrzqt = iEZpvd14;
            int iEZpvd15 = NTLMEngineImpl.EZpvd(this.KWHzl + NTLMEngineImpl.KWHzl(iEZpvd14, this.copydefault, this.AEQbTJ) + iArr[14], 11);
            this.KWHzl = iEZpvd15;
            this.AEQbTJ = NTLMEngineImpl.EZpvd(this.AEQbTJ + NTLMEngineImpl.KWHzl(iEZpvd15, this.OLrzqt, this.copydefault) + iArr[15], 19);
        }

        public void OLrzqt(int[] iArr) {
            int iEZpvd = NTLMEngineImpl.EZpvd(this.copydefault + NTLMEngineImpl.AEQbTJ(this.AEQbTJ, this.KWHzl, this.OLrzqt) + iArr[0] + 1518500249, 3);
            this.copydefault = iEZpvd;
            int iEZpvd2 = NTLMEngineImpl.EZpvd(this.OLrzqt + NTLMEngineImpl.AEQbTJ(iEZpvd, this.AEQbTJ, this.KWHzl) + iArr[4] + 1518500249, 5);
            this.OLrzqt = iEZpvd2;
            int iEZpvd3 = NTLMEngineImpl.EZpvd(this.KWHzl + NTLMEngineImpl.AEQbTJ(iEZpvd2, this.copydefault, this.AEQbTJ) + iArr[8] + 1518500249, 9);
            this.KWHzl = iEZpvd3;
            int iEZpvd4 = NTLMEngineImpl.EZpvd(this.AEQbTJ + NTLMEngineImpl.AEQbTJ(iEZpvd3, this.OLrzqt, this.copydefault) + iArr[12] + 1518500249, 13);
            this.AEQbTJ = iEZpvd4;
            int iEZpvd5 = NTLMEngineImpl.EZpvd(this.copydefault + NTLMEngineImpl.AEQbTJ(iEZpvd4, this.KWHzl, this.OLrzqt) + iArr[1] + 1518500249, 3);
            this.copydefault = iEZpvd5;
            int iEZpvd6 = NTLMEngineImpl.EZpvd(this.OLrzqt + NTLMEngineImpl.AEQbTJ(iEZpvd5, this.AEQbTJ, this.KWHzl) + iArr[5] + 1518500249, 5);
            this.OLrzqt = iEZpvd6;
            int iEZpvd7 = NTLMEngineImpl.EZpvd(this.KWHzl + NTLMEngineImpl.AEQbTJ(iEZpvd6, this.copydefault, this.AEQbTJ) + iArr[9] + 1518500249, 9);
            this.KWHzl = iEZpvd7;
            int iEZpvd8 = NTLMEngineImpl.EZpvd(this.AEQbTJ + NTLMEngineImpl.AEQbTJ(iEZpvd7, this.OLrzqt, this.copydefault) + iArr[13] + 1518500249, 13);
            this.AEQbTJ = iEZpvd8;
            int iEZpvd9 = NTLMEngineImpl.EZpvd(this.copydefault + NTLMEngineImpl.AEQbTJ(iEZpvd8, this.KWHzl, this.OLrzqt) + iArr[2] + 1518500249, 3);
            this.copydefault = iEZpvd9;
            int iEZpvd10 = NTLMEngineImpl.EZpvd(this.OLrzqt + NTLMEngineImpl.AEQbTJ(iEZpvd9, this.AEQbTJ, this.KWHzl) + iArr[6] + 1518500249, 5);
            this.OLrzqt = iEZpvd10;
            int iEZpvd11 = NTLMEngineImpl.EZpvd(this.KWHzl + NTLMEngineImpl.AEQbTJ(iEZpvd10, this.copydefault, this.AEQbTJ) + iArr[10] + 1518500249, 9);
            this.KWHzl = iEZpvd11;
            int iEZpvd12 = NTLMEngineImpl.EZpvd(this.AEQbTJ + NTLMEngineImpl.AEQbTJ(iEZpvd11, this.OLrzqt, this.copydefault) + iArr[14] + 1518500249, 13);
            this.AEQbTJ = iEZpvd12;
            int iEZpvd13 = NTLMEngineImpl.EZpvd(this.copydefault + NTLMEngineImpl.AEQbTJ(iEZpvd12, this.KWHzl, this.OLrzqt) + iArr[3] + 1518500249, 3);
            this.copydefault = iEZpvd13;
            int iEZpvd14 = NTLMEngineImpl.EZpvd(this.OLrzqt + NTLMEngineImpl.AEQbTJ(iEZpvd13, this.AEQbTJ, this.KWHzl) + iArr[7] + 1518500249, 5);
            this.OLrzqt = iEZpvd14;
            int iEZpvd15 = NTLMEngineImpl.EZpvd(this.KWHzl + NTLMEngineImpl.AEQbTJ(iEZpvd14, this.copydefault, this.AEQbTJ) + iArr[11] + 1518500249, 9);
            this.KWHzl = iEZpvd15;
            this.AEQbTJ = NTLMEngineImpl.EZpvd(this.AEQbTJ + NTLMEngineImpl.AEQbTJ(iEZpvd15, this.OLrzqt, this.copydefault) + iArr[15] + 1518500249, 13);
        }

        public void EZpvd(int[] iArr) {
            int iEZpvd = NTLMEngineImpl.EZpvd(this.copydefault + NTLMEngineImpl.copydefault(this.AEQbTJ, this.KWHzl, this.OLrzqt) + iArr[0] + 1859775393, 3);
            this.copydefault = iEZpvd;
            int iEZpvd2 = NTLMEngineImpl.EZpvd(this.OLrzqt + NTLMEngineImpl.copydefault(iEZpvd, this.AEQbTJ, this.KWHzl) + iArr[8] + 1859775393, 9);
            this.OLrzqt = iEZpvd2;
            int iEZpvd3 = NTLMEngineImpl.EZpvd(this.KWHzl + NTLMEngineImpl.copydefault(iEZpvd2, this.copydefault, this.AEQbTJ) + iArr[4] + 1859775393, 11);
            this.KWHzl = iEZpvd3;
            int iEZpvd4 = NTLMEngineImpl.EZpvd(this.AEQbTJ + NTLMEngineImpl.copydefault(iEZpvd3, this.OLrzqt, this.copydefault) + iArr[12] + 1859775393, 15);
            this.AEQbTJ = iEZpvd4;
            int iEZpvd5 = NTLMEngineImpl.EZpvd(this.copydefault + NTLMEngineImpl.copydefault(iEZpvd4, this.KWHzl, this.OLrzqt) + iArr[2] + 1859775393, 3);
            this.copydefault = iEZpvd5;
            int iEZpvd6 = NTLMEngineImpl.EZpvd(this.OLrzqt + NTLMEngineImpl.copydefault(iEZpvd5, this.AEQbTJ, this.KWHzl) + iArr[10] + 1859775393, 9);
            this.OLrzqt = iEZpvd6;
            int iEZpvd7 = NTLMEngineImpl.EZpvd(this.KWHzl + NTLMEngineImpl.copydefault(iEZpvd6, this.copydefault, this.AEQbTJ) + iArr[6] + 1859775393, 11);
            this.KWHzl = iEZpvd7;
            int iEZpvd8 = NTLMEngineImpl.EZpvd(this.AEQbTJ + NTLMEngineImpl.copydefault(iEZpvd7, this.OLrzqt, this.copydefault) + iArr[14] + 1859775393, 15);
            this.AEQbTJ = iEZpvd8;
            int iEZpvd9 = NTLMEngineImpl.EZpvd(this.copydefault + NTLMEngineImpl.copydefault(iEZpvd8, this.KWHzl, this.OLrzqt) + iArr[1] + 1859775393, 3);
            this.copydefault = iEZpvd9;
            int iEZpvd10 = NTLMEngineImpl.EZpvd(this.OLrzqt + NTLMEngineImpl.copydefault(iEZpvd9, this.AEQbTJ, this.KWHzl) + iArr[9] + 1859775393, 9);
            this.OLrzqt = iEZpvd10;
            int iEZpvd11 = NTLMEngineImpl.EZpvd(this.KWHzl + NTLMEngineImpl.copydefault(iEZpvd10, this.copydefault, this.AEQbTJ) + iArr[5] + 1859775393, 11);
            this.KWHzl = iEZpvd11;
            int iEZpvd12 = NTLMEngineImpl.EZpvd(this.AEQbTJ + NTLMEngineImpl.copydefault(iEZpvd11, this.OLrzqt, this.copydefault) + iArr[13] + 1859775393, 15);
            this.AEQbTJ = iEZpvd12;
            int iEZpvd13 = NTLMEngineImpl.EZpvd(this.copydefault + NTLMEngineImpl.copydefault(iEZpvd12, this.KWHzl, this.OLrzqt) + iArr[3] + 1859775393, 3);
            this.copydefault = iEZpvd13;
            int iEZpvd14 = NTLMEngineImpl.EZpvd(this.OLrzqt + NTLMEngineImpl.copydefault(iEZpvd13, this.AEQbTJ, this.KWHzl) + iArr[11] + 1859775393, 9);
            this.OLrzqt = iEZpvd14;
            int iEZpvd15 = NTLMEngineImpl.EZpvd(this.KWHzl + NTLMEngineImpl.copydefault(iEZpvd14, this.copydefault, this.AEQbTJ) + iArr[7] + 1859775393, 11);
            this.KWHzl = iEZpvd15;
            this.AEQbTJ = NTLMEngineImpl.EZpvd(this.AEQbTJ + NTLMEngineImpl.copydefault(iEZpvd15, this.OLrzqt, this.copydefault) + iArr[15] + 1859775393, 15);
        }
    }

    public static class StateListAnimator {
        public final byte[] AEQbTJ;
        public final MessageDigest EZpvd;
        public final byte[] copydefault;

        public StateListAnimator(byte[] bArr) {
            MessageDigest messageDigestAEQbTJ = NTLMEngineImpl.AEQbTJ();
            this.EZpvd = messageDigestAEQbTJ;
            this.copydefault = new byte[64];
            this.AEQbTJ = new byte[64];
            int length = bArr.length;
            if (length > 64) {
                messageDigestAEQbTJ.update(bArr);
                bArr = messageDigestAEQbTJ.digest();
                length = bArr.length;
            }
            int i = 0;
            while (i < length) {
                this.copydefault[i] = (byte) (54 ^ bArr[i]);
                this.AEQbTJ[i] = (byte) (92 ^ bArr[i]);
                i++;
            }
            while (i < 64) {
                this.copydefault[i] = 54;
                this.AEQbTJ[i] = 92;
                i++;
            }
            this.EZpvd.reset();
            this.EZpvd.update(this.copydefault);
        }

        public byte[] copydefault() {
            byte[] bArrDigest = this.EZpvd.digest();
            this.EZpvd.update(this.AEQbTJ);
            return this.EZpvd.digest(bArrDigest);
        }

        public void KWHzl(byte[] bArr) {
            this.EZpvd.update(bArr);
        }
    }

    @Override // o.InterfaceC59685zlh
    public String EZpvd(String str, String str2) throws NTLMEngineException {
        return copydefault(str2, str);
    }

    @Override // o.InterfaceC59685zlh
    public String OLrzqt(String str, String str2, String str3, String str4, String str5) throws NTLMEngineException {
        PendingIntent pendingIntent = new PendingIntent(str5);
        return EZpvd(str, str2, str4, str3, pendingIntent.AEQbTJ(), pendingIntent.gEmmrt(), pendingIntent.AYXKKw(), pendingIntent.valueOf());
    }
}
