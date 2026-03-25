package com.geetest.gtc4;

import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes21.dex */
public abstract class z extends w implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f[] f540a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z() {
        this.f540a = g.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f a(int i) {
        return this.f540a[i];
    }

    @Override // com.geetest.gtc4.w
    public final boolean f() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public w g() {
        return new m2(this.f540a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public w h() {
        return new z2(this.f540a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public int hashCode() {
        int length = this.f540a.length;
        int iHashCode = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return iHashCode;
            }
            iHashCode = (iHashCode * 257) ^ this.f540a[length].d().hashCode();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:15:0x0036 */
    public final b[] i() {
        f fVarD;
        int iK = k();
        b[] bVarArr = new b[iK];
        for (int i = 0; i < iK; i++) {
            f fVar = this.f540a[i];
            if (fVar == null || (fVar instanceof b)) {
                fVarD = fVar;
            } else {
                fVarD = fVar.d();
                if (!(fVarD instanceof b)) {
                    throw new IllegalArgumentException("illegal object in getInstance: ".concat(fVar.getClass().getName()));
                }
            }
            bVarArr[i] = (b) fVarD;
        }
        return bVarArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Iterator iterator() {
        return new n0(this.f540a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:15:0x0036 */
    public final s[] j() {
        f fVarD;
        int iK = k();
        s[] sVarArr = new s[iK];
        for (int i = 0; i < iK; i++) {
            f fVar = this.f540a[i];
            if (fVar == null || (fVar instanceof s)) {
                fVarD = fVar;
            } else {
                fVarD = fVar.d();
                if (!(fVarD instanceof s)) {
                    throw new IllegalArgumentException("illegal object in getInstance: ".concat(fVar.getClass().getName()));
                }
            }
            sVarArr[i] = (s) fVarD;
        }
        return sVarArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int k() {
        return this.f540a.length;
    }

    public abstract b l();

    public abstract s m();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int iK = k();
        if (iK == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        int i = 0;
        while (true) {
            stringBuffer.append(this.f540a[i]);
            i++;
            if (i >= iK) {
                stringBuffer.append(AbstractJsonLexerKt.END_LIST);
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.geetest.gtc4.w
    public final boolean a(w wVar) {
        if (!(wVar instanceof z)) {
            return false;
        }
        z zVar = (z) wVar;
        int iK = k();
        if (zVar.k() != iK) {
            return false;
        }
        for (int i = 0; i < iK; i++) {
            w wVarD = this.f540a[i].d();
            w wVarD2 = zVar.f540a[i].d();
            if (wVarD != wVarD2 && !wVarD.a(wVarD2)) {
                return false;
            }
        }
        return true;
    }

    public z(w wVar) {
        if (wVar == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.f540a = new f[]{wVar};
    }

    public z(g gVar) {
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
            this.f540a = fVarArr;
            return;
        }
        throw new NullPointerException("'elementVector' cannot be null");
    }

    public z(f[] fVarArr) {
        this.f540a = fVarArr;
    }
}
