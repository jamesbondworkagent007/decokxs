package com.geetest.gtc4;

import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public final class d2 extends k {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d2(byte[] bArr) {
        super(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.k, com.geetest.gtc4.w
    public final int a(boolean z) {
        int length = i().length;
        return d.a(length, z ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.k, com.geetest.gtc4.w
    public final w g() {
        return this;
    }

    @Override // com.geetest.gtc4.w
    public final w h() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte[] i() {
        byte[] bArr = this.f469a;
        if (bArr[bArr.length - 1] != 90) {
            return bArr;
        }
        if (!a(10) || !a(11)) {
            byte[] bArr2 = this.f469a;
            byte[] bArr3 = new byte[bArr2.length + 4];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
            int i = n7.f482a;
            byte[] bArr4 = new byte[5];
            for (int i2 = 0; i2 != 5; i2++) {
                bArr4[i2] = (byte) "0000Z".charAt(i2);
            }
            System.arraycopy(bArr4, 0, bArr3, this.f469a.length - 1, 5);
            return bArr3;
        }
        if (!a(12) || !a(13)) {
            byte[] bArr5 = this.f469a;
            byte[] bArr6 = new byte[bArr5.length + 2];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length - 1);
            int i3 = n7.f482a;
            byte[] bArr7 = new byte[3];
            for (int i4 = 0; i4 != 3; i4++) {
                bArr7[i4] = (byte) "00Z".charAt(i4);
            }
            System.arraycopy(bArr7, 0, bArr6, this.f469a.length - 1, 3);
            return bArr6;
        }
        int i5 = 0;
        while (true) {
            byte[] bArr8 = this.f469a;
            if (i5 == bArr8.length) {
                return bArr8;
            }
            if (bArr8[i5] == 46 && i5 == 14) {
                int length = bArr8.length - 2;
                while (length > 0 && this.f469a[length] == 48) {
                    length--;
                }
                byte[] bArr9 = this.f469a;
                if (bArr9[length] == 46) {
                    byte[] bArr10 = new byte[length + 1];
                    System.arraycopy(bArr9, 0, bArr10, 0, length);
                    bArr10[length] = 90;
                    return bArr10;
                }
                byte[] bArr11 = new byte[length + 2];
                int i6 = length + 1;
                System.arraycopy(bArr9, 0, bArr11, 0, i6);
                bArr11[i6] = 90;
                return bArr11;
            }
            i5++;
        }
    }

    @Override // com.geetest.gtc4.k, com.geetest.gtc4.w
    public final void a(u uVar, boolean z) throws IOException {
        uVar.a(z, 24, i());
    }
}
