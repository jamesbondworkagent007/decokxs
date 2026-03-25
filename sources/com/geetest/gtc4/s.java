package com.geetest.gtc4;

import com.amplifyframework.core.model.ModelIdentifier;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes21.dex */
public abstract class s extends w implements t {
    public static final r b = new r();
    public static final byte[] c = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f501a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("'string' cannot be null");
        }
        this.f501a = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final boolean a(w wVar) {
        if (wVar instanceof s) {
            return Arrays.equals(this.f501a, ((s) wVar).f501a);
        }
        return false;
    }

    @Override // com.geetest.gtc4.i5
    public final w b() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.t
    public final InputStream c() {
        return new ByteArrayInputStream(this.f501a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public w g() {
        return new i2(this.f501a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public w h() {
        return new i2(this.f501a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder(ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER);
        byte[] bArr = this.f501a;
        c4 c4Var = b4.f425a;
        int length = bArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c4Var.getClass();
            if (length >= 0) {
                byte[] bArr2 = new byte[72];
                int i = 0;
                while (length > 0) {
                    int iMin = Math.min(36, length);
                    int i2 = i + iMin;
                    int i3 = 0;
                    while (i < i2) {
                        byte b2 = bArr[i];
                        byte[] bArr3 = c4Var.f432a;
                        bArr2[i3] = bArr3[(b2 & UnsignedBytes.MAX_VALUE) >>> 4];
                        bArr2[i3 + 1] = bArr3[b2 & Ascii.SI];
                        i++;
                        i3 += 2;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i3);
                    length -= iMin;
                    i = i2;
                }
            }
            sb.append(n7.a(byteArrayOutputStream.toByteArray()));
            return sb.toString();
        } catch (Exception e) {
            throw new m3("exception encoding Hex string: " + e.getMessage(), e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.geetest.gtc4.w
    public final int hashCode() {
        return o0.b(this.f501a);
    }
}
