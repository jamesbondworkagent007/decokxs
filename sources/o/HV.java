package o;

import android.support.v4.media.session.PlaybackStateCompat;
import co.nstant.in.cbor.CborException;
import co.nstant.in.cbor.model.AdditionalInformation;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes2.dex */
public abstract class HV<T> {
    public int AEQbTJ;
    public final java.io.InputStream KWHzl;
    public final HU OLrzqt;

    public HV(HU hu, java.io.InputStream inputStream) {
        this.OLrzqt = hu;
        this.KWHzl = inputStream;
    }

    public int OLrzqt() throws CborException {
        try {
            int i = this.KWHzl.read();
            if (i != -1) {
                return i;
            }
            throw new java.io.IOException("Unexpected end of stream");
        } catch (java.io.IOException e) {
            throw new CborException(e);
        }
    }

    public byte[] copydefault(int i) throws CborException {
        try {
            byte[] bArr = new byte[i];
            int i2 = this.KWHzl.read(bArr);
            if (i2 == i) {
                return bArr;
            }
            if (i2 == -1) {
                throw new java.io.IOException("Unexpected end of stream");
            }
            int i3 = i - i2;
            while (i3 > 0) {
                int i4 = this.KWHzl.read(bArr, i - i3, i3);
                if (i4 == -1) {
                    throw new java.io.IOException("Unexpected end of stream");
                }
                i3 -= i4;
            }
            return bArr;
        } catch (java.io.IOException e) {
            throw new CborException(e);
        }
    }

    public byte[] copydefault(long j) throws CborException {
        if (j > 2147483647L) {
            throw new CborException("Decoding fixed size items is limited to INTMAX");
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(OLrzqt(j));
        long j2 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (j <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j2 = j;
        }
        int i = (int) j2;
        int i2 = (int) j;
        byte[] bArr = new byte[i];
        while (i2 > 0) {
            try {
                int i3 = this.KWHzl.read(bArr, 0, i2 > i ? i : i2);
                if (i3 == -1) {
                    throw new java.io.IOException("Unexpected end of stream");
                }
                byteArrayOutputStream.write(bArr, 0, i3);
                i2 -= i3;
            } catch (java.io.IOException e) {
                throw new CborException(e);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: o.HV$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[AdditionalInformation.values().length];
            OLrzqt = iArr;
            try {
                iArr[AdditionalInformation.DIRECT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                OLrzqt[AdditionalInformation.ONE_BYTE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                OLrzqt[AdditionalInformation.TWO_BYTES.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                OLrzqt[AdditionalInformation.FOUR_BYTES.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                OLrzqt[AdditionalInformation.EIGHT_BYTES.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                OLrzqt[AdditionalInformation.INDEFINITE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                OLrzqt[AdditionalInformation.RESERVED.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
        }
    }

    public long EZpvd(int i) throws CborException {
        switch (AnonymousClass1.OLrzqt[AdditionalInformation.ofByte(i).ordinal()]) {
            case 1:
                return i & 31;
            case 2:
                return OLrzqt();
            case 3:
                byte[] bArrCopydefault = copydefault(2);
                return ((long) ((bArrCopydefault[0] & UnsignedBytes.MAX_VALUE) << 8)) | ((long) (bArrCopydefault[1] & UnsignedBytes.MAX_VALUE));
            case 4:
                byte[] bArrCopydefault2 = copydefault(4);
                return ((long) (bArrCopydefault2[3] & UnsignedBytes.MAX_VALUE)) | ((bArrCopydefault2[0] & UnsignedBytes.MAX_VALUE) << 24) | (((long) (bArrCopydefault2[1] & UnsignedBytes.MAX_VALUE)) << 16) | (((long) (bArrCopydefault2[2] & UnsignedBytes.MAX_VALUE)) << 8);
            case 5:
                byte[] bArrCopydefault3 = copydefault(8);
                long j = bArrCopydefault3[0] & UnsignedBytes.MAX_VALUE;
                long j2 = bArrCopydefault3[1] & UnsignedBytes.MAX_VALUE;
                long j3 = bArrCopydefault3[2] & UnsignedBytes.MAX_VALUE;
                long j4 = bArrCopydefault3[3] & UnsignedBytes.MAX_VALUE;
                return (((long) (bArrCopydefault3[5] & UnsignedBytes.MAX_VALUE)) << 16) | ((bArrCopydefault3[4] & UnsignedBytes.MAX_VALUE) << 24) | (j2 << 48) | (j << 56) | (j3 << 40) | (j4 << 32) | (((long) (bArrCopydefault3[6] & UnsignedBytes.MAX_VALUE)) << 8) | ((long) (bArrCopydefault3[7] & UnsignedBytes.MAX_VALUE));
            case 6:
                return -1L;
            default:
                throw new CborException("Reserved additional information");
        }
    }

    public java.math.BigInteger AEQbTJ(int i) throws CborException {
        switch (AnonymousClass1.OLrzqt[AdditionalInformation.ofByte(i).ordinal()]) {
            case 1:
                return java.math.BigInteger.valueOf(i & 31);
            case 2:
                return java.math.BigInteger.valueOf(OLrzqt());
            case 3:
                byte[] bArrCopydefault = copydefault(2);
                return java.math.BigInteger.valueOf(((long) ((bArrCopydefault[0] & UnsignedBytes.MAX_VALUE) << 8)) | ((long) (bArrCopydefault[1] & UnsignedBytes.MAX_VALUE)));
            case 4:
                byte[] bArrCopydefault2 = copydefault(4);
                return java.math.BigInteger.valueOf(((bArrCopydefault2[0] & UnsignedBytes.MAX_VALUE) << 24) | (((long) (bArrCopydefault2[1] & UnsignedBytes.MAX_VALUE)) << 16) | (((long) (bArrCopydefault2[2] & UnsignedBytes.MAX_VALUE)) << 8) | ((long) (bArrCopydefault2[3] & UnsignedBytes.MAX_VALUE)));
            case 5:
                java.math.BigInteger bigInteger = java.math.BigInteger.ZERO;
                byte[] bArrCopydefault3 = copydefault(8);
                return bigInteger.or(java.math.BigInteger.valueOf(bArrCopydefault3[0] & UnsignedBytes.MAX_VALUE).shiftLeft(56)).or(java.math.BigInteger.valueOf(bArrCopydefault3[1] & UnsignedBytes.MAX_VALUE).shiftLeft(48)).or(java.math.BigInteger.valueOf(bArrCopydefault3[2] & UnsignedBytes.MAX_VALUE).shiftLeft(40)).or(java.math.BigInteger.valueOf(bArrCopydefault3[3] & UnsignedBytes.MAX_VALUE).shiftLeft(32)).or(java.math.BigInteger.valueOf(bArrCopydefault3[4] & UnsignedBytes.MAX_VALUE).shiftLeft(24)).or(java.math.BigInteger.valueOf(bArrCopydefault3[5] & UnsignedBytes.MAX_VALUE).shiftLeft(16)).or(java.math.BigInteger.valueOf(bArrCopydefault3[6] & UnsignedBytes.MAX_VALUE).shiftLeft(8)).or(java.math.BigInteger.valueOf(bArrCopydefault3[7] & UnsignedBytes.MAX_VALUE).shiftLeft(0));
            case 6:
                return java.math.BigInteger.valueOf(-1L);
            default:
                throw new CborException("Reserved additional information");
        }
    }

    public int OLrzqt(long j) {
        int iAbs = java.lang.Math.abs((int) j);
        int i = this.AEQbTJ;
        return i > 0 ? java.lang.Math.min(i, iAbs) : iAbs;
    }
}
