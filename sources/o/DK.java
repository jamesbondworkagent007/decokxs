package o;

import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: loaded from: classes2.dex */
public final class DK {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final byte[] AEQbTJ(short s, short s2, short s3, short s4, short s5, short s6, short s7, short s8) {
        return new byte[]{(byte) (((s & HPKE.aead_EXPORT_ONLY) >>> 8) & 255), (byte) (s & 255), (byte) (((s2 & HPKE.aead_EXPORT_ONLY) >>> 8) & 255), (byte) (s2 & 255), (byte) (((s3 & HPKE.aead_EXPORT_ONLY) >>> 8) & 255), (byte) (s3 & 255), (byte) (((s4 & HPKE.aead_EXPORT_ONLY) >>> 8) & 255), (byte) (s4 & 255), (byte) (((s5 & HPKE.aead_EXPORT_ONLY) >>> 8) & 255), (byte) (s5 & 255), (byte) (((s6 & HPKE.aead_EXPORT_ONLY) >>> 8) & 255), (byte) (s6 & 255), (byte) (((s7 & HPKE.aead_EXPORT_ONLY) >>> 8) & 255), (byte) (s7 & 255), (byte) (((s8 & HPKE.aead_EXPORT_ONLY) >>> 8) & 255), (byte) (s8 & 255)};
    }
}
