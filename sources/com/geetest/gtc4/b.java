package com.geetest.gtc4;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b extends w implements c {
    public static final a b = new a();
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f422a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        }
        if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = (byte) i;
        this.f422a = bArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.c
    public final InputStream a() {
        byte[] bArr = this.f422a;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    @Override // com.geetest.gtc4.i5
    public final w b() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.c
    public final int e() {
        return this.f422a[0] & UnsignedBytes.MAX_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public w g() {
        return new z1(this.f422a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public w h() {
        return new u2(this.f422a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int hashCode() {
        byte[] bArr = this.f422a;
        if (bArr.length < 2) {
            return 1;
        }
        byte b2 = bArr[0];
        int length = bArr.length;
        int i = length - 1;
        byte b3 = (byte) ((255 << (b2 & UnsignedBytes.MAX_VALUE)) & bArr[i]);
        while (true) {
            i--;
            if (i < 0) {
                return (length * 257) ^ b3;
            }
            length = (length * 257) ^ bArr[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            a(new u(byteArrayOutputStream), true);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            StringBuffer stringBuffer = new StringBuffer((byteArray.length * 2) + 1);
            stringBuffer.append('#');
            for (int i = 0; i != byteArray.length; i++) {
                byte b2 = byteArray[i];
                char[] cArr = c;
                stringBuffer.append(cArr[(b2 >>> 4) & 15]);
                stringBuffer.append(cArr[b2 & Ascii.SI]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new v("Internal error encoding BitString: " + e.getMessage(), e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.geetest.gtc4.w
    public final boolean a(w wVar) {
        if (!(wVar instanceof b)) {
            return false;
        }
        byte[] bArr = this.f422a;
        byte[] bArr2 = ((b) wVar).f422a;
        int length = bArr.length;
        if (bArr2.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i = length - 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        byte b2 = bArr[0];
        byte b3 = bArr[i];
        int i3 = 255 << (b2 & UnsignedBytes.MAX_VALUE);
        return ((byte) (b3 & i3)) == ((byte) (bArr2[i] & i3));
    }

    public b(byte[] bArr) {
        this.f422a = bArr;
    }

    public static b a(byte[] bArr) {
        int length = bArr.length;
        if (length >= 1) {
            int i = bArr[0] & UnsignedBytes.MAX_VALUE;
            if (i > 0) {
                if (i <= 7 && length >= 2) {
                    byte b2 = bArr[length - 1];
                    if (b2 != ((byte) ((255 << i) & b2))) {
                        return new u2(bArr);
                    }
                } else {
                    throw new IllegalArgumentException("invalid pad bits detected");
                }
            }
            return new z1(bArr);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }
}
