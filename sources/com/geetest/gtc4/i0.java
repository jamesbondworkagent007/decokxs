package com.geetest.gtc4;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes21.dex */
public abstract class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InputStream f459a;
    public final p1 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public i0(p1 p1Var, InputStream inputStream) {
        this.b = p1Var;
        this.f459a = inputStream;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a() throws q1 {
        try {
            int i = this.f459a.read();
            if (i != -1) {
                return i;
            }
            throw new IOException("Unexpected end of stream");
        } catch (IOException e) {
            throw new q1(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final BigInteger b(int i) throws q1 {
        switch (h0.f455a[k0.ofByte(i).ordinal()]) {
            case 1:
                return BigInteger.valueOf(i & 31);
            case 2:
                return BigInteger.valueOf(a());
            case 3:
                byte[] bArrC = c(2);
                return BigInteger.valueOf(((long) ((bArrC[0] & UnsignedBytes.MAX_VALUE) << 8)) | ((long) (bArrC[1] & UnsignedBytes.MAX_VALUE)));
            case 4:
                byte[] bArrC2 = c(4);
                return BigInteger.valueOf(((bArrC2[0] & UnsignedBytes.MAX_VALUE) << 24) | (((long) (bArrC2[1] & UnsignedBytes.MAX_VALUE)) << 16) | (((long) (bArrC2[2] & UnsignedBytes.MAX_VALUE)) << 8) | ((long) (bArrC2[3] & UnsignedBytes.MAX_VALUE)));
            case 5:
                BigInteger bigInteger = BigInteger.ZERO;
                byte[] bArrC3 = c(8);
                return bigInteger.or(BigInteger.valueOf(bArrC3[0] & UnsignedBytes.MAX_VALUE).shiftLeft(56)).or(BigInteger.valueOf(bArrC3[1] & UnsignedBytes.MAX_VALUE).shiftLeft(48)).or(BigInteger.valueOf(bArrC3[2] & UnsignedBytes.MAX_VALUE).shiftLeft(40)).or(BigInteger.valueOf(bArrC3[3] & UnsignedBytes.MAX_VALUE).shiftLeft(32)).or(BigInteger.valueOf(bArrC3[4] & UnsignedBytes.MAX_VALUE).shiftLeft(24)).or(BigInteger.valueOf(bArrC3[5] & UnsignedBytes.MAX_VALUE).shiftLeft(16)).or(BigInteger.valueOf(bArrC3[6] & UnsignedBytes.MAX_VALUE).shiftLeft(8)).or(BigInteger.valueOf(bArrC3[7] & UnsignedBytes.MAX_VALUE).shiftLeft(0));
            case 6:
                return BigInteger.valueOf(-1L);
            default:
                throw new q1("Reserved additional information");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte[] c(int i) throws q1 {
        try {
            byte[] bArr = new byte[i];
            int i2 = this.f459a.read(bArr);
            if (i2 == i) {
                return bArr;
            }
            if (i2 == -1) {
                throw new IOException("Unexpected end of stream");
            }
            int i3 = i - i2;
            while (i3 > 0) {
                int i4 = this.f459a.read(bArr, i - i3, i3);
                if (i4 == -1) {
                    throw new IOException("Unexpected end of stream");
                }
                i3 -= i4;
            }
            return bArr;
        } catch (IOException e) {
            throw new q1(e);
        }
    }

    public final byte[] a(long j) throws q1 {
        if (j <= 2147483647L) {
            int i = (int) j;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.abs(i));
            if (j > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
                j = 4096;
            }
            int i2 = (int) j;
            byte[] bArr = new byte[i2];
            while (i > 0) {
                try {
                    int i3 = this.f459a.read(bArr, 0, i > i2 ? i2 : i);
                    if (i3 != -1) {
                        byteArrayOutputStream.write(bArr, 0, i3);
                        i -= i3;
                    } else {
                        throw new IOException("Unexpected end of stream");
                    }
                } catch (IOException e) {
                    throw new q1(e);
                }
            }
            return byteArrayOutputStream.toByteArray();
        }
        throw new q1("Decoding fixed size items is limited to INTMAX");
    }

    public final long a(int i) throws q1 {
        switch (h0.f455a[k0.ofByte(i).ordinal()]) {
            case 1:
                return i & 31;
            case 2:
                return a();
            case 3:
                byte[] bArrC = c(2);
                return ((long) ((bArrC[0] & UnsignedBytes.MAX_VALUE) << 8)) | ((long) (bArrC[1] & UnsignedBytes.MAX_VALUE));
            case 4:
                byte[] bArrC2 = c(4);
                return ((long) (bArrC2[3] & UnsignedBytes.MAX_VALUE)) | ((bArrC2[0] & UnsignedBytes.MAX_VALUE) << 24) | (((long) (bArrC2[1] & UnsignedBytes.MAX_VALUE)) << 16) | (((long) (bArrC2[2] & UnsignedBytes.MAX_VALUE)) << 8);
            case 5:
                byte[] bArrC3 = c(8);
                long j = bArrC3[0] & UnsignedBytes.MAX_VALUE;
                long j2 = bArrC3[1] & UnsignedBytes.MAX_VALUE;
                long j3 = bArrC3[2] & UnsignedBytes.MAX_VALUE;
                long j4 = bArrC3[3] & UnsignedBytes.MAX_VALUE;
                return (((long) (bArrC3[5] & UnsignedBytes.MAX_VALUE)) << 16) | ((bArrC3[4] & UnsignedBytes.MAX_VALUE) << 24) | (j2 << 48) | (j << 56) | (j3 << 40) | (j4 << 32) | (((long) (bArrC3[6] & UnsignedBytes.MAX_VALUE)) << 8) | ((long) (bArrC3[7] & UnsignedBytes.MAX_VALUE));
            case 6:
                return -1L;
            default:
                throw new q1("Reserved additional information");
        }
    }
}
