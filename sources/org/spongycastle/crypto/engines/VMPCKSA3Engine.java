package org.spongycastle.crypto.engines;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes25.dex */
public class VMPCKSA3Engine extends VMPCEngine {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.spongycastle.crypto.engines.VMPCEngine, org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "VMPC-KSA3";
    }

    @Override // org.spongycastle.crypto.engines.VMPCEngine
    public void initKey(byte[] bArr, byte[] bArr2) {
        this.s = (byte) 0;
        this.P = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.P[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = this.P;
            byte b = this.s;
            int i3 = i2 & 255;
            byte b2 = bArr3[i3];
            byte b3 = bArr3[(b + b2 + bArr[i2 % bArr.length]) & 255];
            this.s = b3;
            int i4 = b3 & UnsignedBytes.MAX_VALUE;
            bArr3[i3] = bArr3[i4];
            bArr3[i4] = b2;
        }
        for (int i5 = 0; i5 < 768; i5++) {
            byte[] bArr4 = this.P;
            byte b4 = this.s;
            int i6 = i5 & 255;
            byte b5 = bArr4[i6];
            byte b6 = bArr4[(b4 + b5 + bArr2[i5 % bArr2.length]) & 255];
            this.s = b6;
            int i7 = b6 & UnsignedBytes.MAX_VALUE;
            bArr4[i6] = bArr4[i7];
            bArr4[i7] = b5;
        }
        for (int i8 = 0; i8 < 768; i8++) {
            byte[] bArr5 = this.P;
            byte b7 = this.s;
            int i9 = i8 & 255;
            byte b8 = bArr5[i9];
            byte b9 = bArr5[(b7 + b8 + bArr[i8 % bArr.length]) & 255];
            this.s = b9;
            int i10 = b9 & UnsignedBytes.MAX_VALUE;
            bArr5[i9] = bArr5[i10];
            bArr5[i10] = b8;
        }
        this.n = (byte) 0;
    }
}
