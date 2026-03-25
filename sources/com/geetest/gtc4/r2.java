package com.geetest.gtc4;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public final class r2 extends w {
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f498a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r2(byte[] bArr) {
        this.f498a = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int a(boolean z) {
        int length = this.f498a.length;
        return d.a(length, z ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.w
    public final boolean f() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int hashCode() {
        return o0.b(this.f498a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i;
        int length = this.f498a.length;
        StringBuffer stringBuffer = new StringBuffer(((u.a(length) + length) * 2) + 3);
        stringBuffer.append("#1C");
        if (length < 128) {
            char[] cArr = b;
            stringBuffer.append(cArr[(length >>> 4) & 15]);
            stringBuffer.append(cArr[length & 15]);
        } else {
            byte[] bArr = new byte[5];
            int i2 = length;
            int i3 = 5;
            while (true) {
                i = i3 - 1;
                bArr[i] = (byte) i2;
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3 = i;
            }
            int i4 = i3 - 2;
            bArr[i4] = (byte) (128 | (5 - i));
            while (true) {
                int i5 = i4 + 1;
                byte b2 = bArr[i4];
                char[] cArr2 = b;
                stringBuffer.append(cArr2[(b2 >>> 4) & 15]);
                stringBuffer.append(cArr2[b2 & Ascii.SI]);
                if (i5 >= 5) {
                    break;
                }
                i4 = i5;
            }
        }
        for (int i6 = 0; i6 < length; i6++) {
            byte b3 = this.f498a[i6];
            char[] cArr3 = b;
            stringBuffer.append(cArr3[(b3 >>> 4) & 15]);
            stringBuffer.append(cArr3[b3 & Ascii.SI]);
        }
        return stringBuffer.toString();
    }

    @Override // com.geetest.gtc4.w
    public final void a(u uVar, boolean z) throws IOException {
        uVar.a(z, 28, this.f498a);
    }

    @Override // com.geetest.gtc4.w
    public final boolean a(w wVar) {
        if (wVar instanceof r2) {
            return Arrays.equals(this.f498a, ((r2) wVar).f498a);
        }
        return false;
    }
}
