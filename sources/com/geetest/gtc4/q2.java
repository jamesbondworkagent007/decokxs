package com.geetest.gtc4;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.util.Arrays;
import okio.Utf8;

/* JADX INFO: loaded from: classes21.dex */
public final class q2 extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f496a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q2(byte[] bArr) {
        this.f496a = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final boolean a(w wVar) {
        if (wVar instanceof q2) {
            return Arrays.equals(this.f496a, ((q2) wVar).f496a);
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
        return o0.b(this.f496a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        byte[] bArr = this.f496a;
        int i = n7.f482a;
        int length = bArr.length;
        char[] cArr = new char[length];
        short[] sArr = q7.f497a;
        int length2 = bArr.length;
        int i2 = 0;
        int i3 = 0;
        loop0: while (i3 < length2) {
            int i4 = i3 + 1;
            byte b = bArr[i3];
            if (b < 0) {
                short s = q7.f497a[b & 127];
                int i5 = s >>> 8;
                byte b2 = (byte) s;
                while (true) {
                    if (b2 >= 0) {
                        if (i4 >= length2) {
                            break loop0;
                        }
                        byte b3 = bArr[i4];
                        i5 = (i5 << 6) | (b3 & Utf8.REPLACEMENT_BYTE);
                        b2 = q7.b[b2 + ((b3 & UnsignedBytes.MAX_VALUE) >>> 4)];
                        i4++;
                    } else if (b2 != -2) {
                        if (i5 <= 65535) {
                            if (i2 < length) {
                                cArr[i2] = (char) i5;
                            }
                        } else if (i2 < length - 1) {
                            cArr[i2] = (char) ((i5 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                            cArr[i2 + 1] = (char) ((i5 & 1023) | Utf8.LOG_SURROGATE_HEADER);
                            i2 += 2;
                        }
                    }
                }
                i2 = -1;
                break;
            }
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            cArr[i2] = (char) b;
            i2++;
            i3 = i4;
        }
        if (i2 >= 0) {
            return new String(cArr, 0, i2);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    @Override // com.geetest.gtc4.w
    public final int a(boolean z) {
        int length = this.f496a.length;
        return d.a(length, z ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.w
    public final void a(u uVar, boolean z) throws IOException {
        uVar.a(z, 12, this.f496a);
    }
}
