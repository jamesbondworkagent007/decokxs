package com.geetest.gtc4;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public final class x extends w {
    public static final ConcurrentHashMap c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f530a;
    public String b = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x(byte[] bArr) {
        this.f530a = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final boolean a(w wVar) {
        if (this == wVar) {
            return true;
        }
        if (wVar instanceof x) {
            return Arrays.equals(this.f530a, ((x) wVar).f530a);
        }
        return false;
    }

    @Override // com.geetest.gtc4.w
    public final boolean f() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int hashCode() {
        return o0.b(this.f530a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str;
        synchronized (this) {
            if (this.b == null) {
                byte[] bArr = this.f530a;
                StringBuffer stringBuffer = new StringBuffer();
                boolean z = true;
                BigInteger bigIntegerShiftLeft = null;
                long j = 0;
                for (int i = 0; i != bArr.length; i++) {
                    byte b = bArr[i];
                    if (j <= 72057594037927808L) {
                        long j2 = j + ((long) (b & 127));
                        if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                            if (z) {
                                z = false;
                            } else {
                                stringBuffer.append('.');
                            }
                            stringBuffer.append(j2);
                            j = 0;
                        } else {
                            j = j2 << 7;
                        }
                    } else {
                        if (bigIntegerShiftLeft == null) {
                            bigIntegerShiftLeft = BigInteger.valueOf(j);
                        }
                        BigInteger bigIntegerOr = bigIntegerShiftLeft.or(BigInteger.valueOf(b & 127));
                        if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                            if (z) {
                                z = false;
                            } else {
                                stringBuffer.append('.');
                            }
                            stringBuffer.append(bigIntegerOr);
                            bigIntegerShiftLeft = null;
                            j = 0;
                        } else {
                            bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                        }
                    }
                }
                this.b = stringBuffer.toString();
            }
            str = this.b;
        }
        return str;
    }

    @Override // com.geetest.gtc4.w
    public final int a(boolean z) {
        int length = this.f530a.length;
        return d.a(length, z ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.w
    public final void a(u uVar, boolean z) throws IOException {
        uVar.a(z, 13, this.f530a);
    }

    public static boolean a(byte[] bArr) {
        if (bArr.length < 1) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < bArr.length; i++) {
            if (z && (bArr[i] & UnsignedBytes.MAX_VALUE) == 128) {
                return false;
            }
            z = (bArr[i] & UnsignedBytes.MAX_POWER_OF_TWO) == 0;
        }
        return z;
    }
}
