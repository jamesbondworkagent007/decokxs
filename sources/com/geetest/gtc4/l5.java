package com.geetest.gtc4;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public final class l5 extends z {
    public byte[] b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l5(byte[] bArr) {
        this.b = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.z
    public final f a(int i) {
        n();
        return this.f540a[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.z, com.geetest.gtc4.w
    public final w g() {
        n();
        return new m2(this.f540a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.z, com.geetest.gtc4.w
    public final w h() {
        n();
        return new z2(this.f540a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.z, com.geetest.gtc4.w
    public final int hashCode() {
        n();
        return super.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.z, java.lang.Iterable
    public final Iterator iterator() {
        n();
        return new n0(this.f540a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.z
    public final int k() {
        n();
        return this.f540a.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.z
    public final b l() {
        return ((z) h()).l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.z
    public final s m() {
        return ((z) h()).m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void n() {
        g gVar;
        f[] fVarArr;
        synchronized (this) {
            if (this.b != null) {
                byte[] bArr = this.b;
                m mVar = new m(new ByteArrayInputStream(bArr), bArr.length, true);
                try {
                    w wVarA = mVar.a();
                    if (wVarA == null) {
                        gVar = new g(0);
                    } else {
                        g gVar2 = new g(10);
                        do {
                            gVar2.a(wVarA);
                            wVarA = mVar.a();
                        } while (wVarA != null);
                        gVar = gVar2;
                    }
                    mVar.close();
                    int i = gVar.b;
                    if (i == 0) {
                        fVarArr = g.d;
                    } else {
                        f[] fVarArr2 = gVar.f450a;
                        if (fVarArr2.length == i) {
                            gVar.c = true;
                            fVarArr = fVarArr2;
                        } else {
                            f[] fVarArr3 = new f[i];
                            System.arraycopy(fVarArr2, 0, fVarArr3, 0, i);
                            fVarArr = fVarArr3;
                        }
                    }
                    this.f540a = fVarArr;
                    this.b = null;
                } catch (IOException e) {
                    throw new v("malformed ASN.1: " + e, e);
                }
            }
        }
    }

    @Override // com.geetest.gtc4.w
    public final int a(boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.b;
        }
        if (bArr != null) {
            int length = bArr.length;
            return d.a(length, z ? 1 : 0, length);
        }
        return new z2(this.f540a).a(z);
    }

    @Override // com.geetest.gtc4.w
    public final void a(u uVar, boolean z) throws IOException {
        byte[] bArr;
        synchronized (this) {
            bArr = this.b;
        }
        if (bArr != null) {
            uVar.a(z, 48, bArr);
        } else {
            new z2(this.f540a).a(uVar, z);
        }
    }
}
