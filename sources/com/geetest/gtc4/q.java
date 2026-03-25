package com.geetest.gtc4;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public final class q extends w {
    public static final ConcurrentHashMap c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f495a;
    public String b = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q(byte[] bArr) {
        this.f495a = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int a(boolean z) {
        int length = this.f495a.length;
        return d.a(length, z ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.w
    public final boolean f() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int hashCode() {
        return o0.b(this.f495a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str;
        synchronized (this) {
            if (this.b == null) {
                byte[] bArr = this.f495a;
                StringBuilder sb = new StringBuilder();
                boolean z = true;
                long j = 0;
                BigInteger bigIntegerShiftLeft = null;
                for (int i = 0; i != bArr.length; i++) {
                    byte b = bArr[i];
                    if (j <= 72057594037927808L) {
                        long j2 = j + ((long) (b & 127));
                        if ((b & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                            if (z) {
                                if (j2 < 40) {
                                    sb.append('0');
                                } else if (j2 < 80) {
                                    sb.append('1');
                                    j2 -= 40;
                                } else {
                                    sb.append('2');
                                    j2 -= 80;
                                }
                                z = false;
                            }
                            sb.append('.');
                            sb.append(j2);
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
                                sb.append('2');
                                bigIntegerOr = bigIntegerOr.subtract(BigInteger.valueOf(80L));
                                z = false;
                            }
                            sb.append('.');
                            sb.append(bigIntegerOr);
                            j = 0;
                            bigIntegerShiftLeft = null;
                        } else {
                            bigIntegerShiftLeft = bigIntegerOr.shiftLeft(7);
                        }
                    }
                }
                this.b = sb.toString();
            }
            str = this.b;
        }
        return str;
    }

    @Override // com.geetest.gtc4.w
    public final void a(u uVar, boolean z) throws IOException {
        uVar.a(z, 6, this.f495a);
    }

    @Override // com.geetest.gtc4.w
    public final boolean a(w wVar) {
        if (this == wVar) {
            return true;
        }
        if (wVar instanceof q) {
            return Arrays.equals(this.f495a, ((q) wVar).f495a);
        }
        return false;
    }
}
