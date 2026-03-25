package com.geetest.gtc4;

import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public final class z1 extends b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z1(byte[] bArr) {
        super(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.geetest.gtc4.w
    public final int a(boolean z) {
        int length = this.f422a.length;
        return d.a(length, z ? 1 : 0, length);
    }

    @Override // com.geetest.gtc4.w
    public final boolean f() {
        return false;
    }

    @Override // com.geetest.gtc4.b, com.geetest.gtc4.w
    public final w g() {
        return this;
    }

    @Override // com.geetest.gtc4.b, com.geetest.gtc4.w
    public final w h() {
        return this;
    }

    @Override // com.geetest.gtc4.w
    public final void a(u uVar, boolean z) throws IOException {
        byte[] bArr = this.f422a;
        byte b = bArr[0];
        int length = bArr.length;
        int i = length - 1;
        byte b2 = bArr[i];
        byte b3 = (byte) ((255 << (b & UnsignedBytes.MAX_VALUE)) & b2);
        if (b2 == b3) {
            uVar.a(z, 3, bArr);
            return;
        }
        uVar.a(z, 3);
        uVar.b(length);
        uVar.f516a.write(bArr, 0, i);
        uVar.f516a.write(b3);
    }
}
