package com.geetest.gtc4;

import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b0 extends w implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f[] f423a;
    public f[] b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b0() {
        f[] fVarArr = g.d;
        this.f423a = fVarArr;
        this.b = fVarArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final boolean a(w wVar) {
        if (!(wVar instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) wVar;
        int length = this.f423a.length;
        if (b0Var.f423a.length != length) {
            return false;
        }
        n2 n2Var = (n2) g();
        n2 n2Var2 = (n2) b0Var.g();
        for (int i = 0; i < length; i++) {
            w wVarD = n2Var.f423a[i].d();
            w wVarD2 = n2Var2.f423a[i].d();
            if (wVarD != wVarD2 && !wVarD.a(wVarD2)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.geetest.gtc4.w
    public final boolean f() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public w h() {
        return new b3(this.f423a, this.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int hashCode() {
        int length = this.f423a.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode += this.f423a[length].d().hashCode();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        f[] fVarArr = this.f423a;
        return new n0(fVarArr.length < 1 ? g.d : (f[]) fVarArr.clone());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int length = this.f423a.length;
        if (length == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(this.f423a[i]);
            i++;
            if (i >= length) {
                stringBuffer.append(AbstractJsonLexerKt.END_LIST);
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.geetest.gtc4.w
    public w g() {
        int i;
        if (this.b == null) {
            f[] fVarArr = (f[]) this.f423a.clone();
            this.b = fVarArr;
            int length = fVarArr.length;
            if (length >= 2) {
                f fVar = fVarArr[0];
                f fVar2 = fVarArr[1];
                byte[] bArrA = a(fVar);
                byte[] bArrA2 = a(fVar2);
                if (a(bArrA2, bArrA)) {
                    fVar2 = fVar;
                    fVar = fVar2;
                } else {
                    bArrA2 = bArrA;
                    bArrA = bArrA2;
                }
                for (int i2 = 2; i2 < length; i2++) {
                    f fVar3 = fVarArr[i2];
                    byte[] bArrA3 = a(fVar3);
                    if (a(bArrA, bArrA3)) {
                        fVarArr[i2 - 2] = fVar;
                        fVar = fVar2;
                        bArrA2 = bArrA;
                        fVar2 = fVar3;
                        bArrA = bArrA3;
                    } else if (a(bArrA2, bArrA3)) {
                        fVarArr[i2 - 2] = fVar;
                        fVar = fVar3;
                        bArrA2 = bArrA3;
                    } else {
                        int i3 = i2 - 1;
                        while (true) {
                            i = i3 - 1;
                            if (i <= 0) {
                                break;
                            }
                            f fVar4 = fVarArr[i3 - 2];
                            if (a(a(fVar4), bArrA3)) {
                                break;
                            }
                            fVarArr[i] = fVar4;
                            i3 = i;
                        }
                        fVarArr[i] = fVar3;
                    }
                }
                fVarArr[length - 2] = fVar;
                fVarArr[length - 1] = fVar2;
            }
        }
        return new n2(this.b);
    }

    public b0(g gVar) {
        f[] fVarArr;
        if (gVar != null) {
            int i = gVar.b;
            if (i == 0) {
                fVarArr = g.d;
            } else {
                f[] fVarArr2 = gVar.f450a;
                if (fVarArr2.length == i) {
                    gVar.c = true;
                    fVarArr = fVarArr2;
                } else {
                    fVarArr = new f[i];
                    System.arraycopy(fVarArr2, 0, fVarArr, 0, i);
                }
            }
            this.f423a = fVarArr;
            this.b = fVarArr.length >= 2 ? null : fVarArr;
            return;
        }
        throw new NullPointerException("'elementVector' cannot be null");
    }

    public static byte[] a(f fVar) {
        try {
            w wVarD = fVar.d();
            wVarD.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new k2(byteArrayOutputStream).a(wVarD);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public b0(boolean z, f[] fVarArr) {
        this.f423a = fVarArr;
        if (!z && fVarArr.length >= 2) {
            fVarArr = null;
        }
        this.b = fVarArr;
    }

    public b0(f[] fVarArr, f[] fVarArr2) {
        this.f423a = fVarArr;
        this.b = fVarArr2;
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        int i = bArr[0] & 223;
        int i2 = bArr2[0] & 223;
        if (i != i2) {
            return i < i2;
        }
        int iMin = Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < iMin; i3++) {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            if (b != b2) {
                return (b & UnsignedBytes.MAX_VALUE) < (b2 & UnsignedBytes.MAX_VALUE);
            }
        }
        return (bArr[iMin] & UnsignedBytes.MAX_VALUE) <= (bArr2[iMin] & UnsignedBytes.MAX_VALUE);
    }
}
