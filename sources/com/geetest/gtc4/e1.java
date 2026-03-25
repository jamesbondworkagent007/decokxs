package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public final class e1 extends s {
    public final int d;
    public final s[] e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e1(s[] sVarArr) {
        super(a(sVarArr));
        this.e = sVarArr;
        this.d = 1000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] a(s[] sVarArr) {
        int length = sVarArr.length;
        if (length == 0) {
            return s.c;
        }
        if (length == 1) {
            return sVarArr[0].f501a;
        }
        int length2 = 0;
        for (s sVar : sVarArr) {
            length2 += sVar.f501a.length;
        }
        byte[] bArr = new byte[length2];
        int length3 = 0;
        for (s sVar2 : sVarArr) {
            byte[] bArr2 = sVar2.f501a;
            System.arraycopy(bArr2, 0, bArr, length3, bArr2.length);
            length3 += bArr2.length;
        }
        return bArr;
    }

    @Override // com.geetest.gtc4.w
    public final boolean f() {
        return true;
    }

    public e1(byte[] bArr) {
        super(bArr);
        this.e = null;
        this.d = 1000;
    }

    @Override // com.geetest.gtc4.w
    public final int a(boolean z) {
        int iA = z ? 4 : 3;
        if (this.e == null) {
            int length = this.f501a.length;
            int i = this.d;
            int i2 = length / i;
            int iA2 = iA + ((u.a(i) + 1 + i) * i2);
            int length2 = this.f501a.length - (i2 * this.d);
            return length2 > 0 ? iA2 + u.a(length2) + 1 + length2 : iA2;
        }
        int i3 = 0;
        while (true) {
            s[] sVarArr = this.e;
            if (i3 >= sVarArr.length) {
                return iA;
            }
            iA += sVarArr[i3].a(true);
            i3++;
        }
    }

    @Override // com.geetest.gtc4.w
    public final void a(u uVar, boolean z) throws IOException {
        uVar.a(z, 36);
        uVar.f516a.write(128);
        s[] sVarArr = this.e;
        if (sVarArr == null) {
            int i = 0;
            while (true) {
                byte[] bArr = this.f501a;
                if (i >= bArr.length) {
                    break;
                }
                int iMin = Math.min(bArr.length - i, this.d);
                byte[] bArr2 = this.f501a;
                uVar.a(true, 4);
                uVar.b(iMin);
                uVar.f516a.write(bArr2, i, iMin);
                i += iMin;
            }
        } else {
            uVar.a((w[]) sVarArr);
        }
        uVar.f516a.write(0);
        uVar.f516a.write(0);
    }
}
