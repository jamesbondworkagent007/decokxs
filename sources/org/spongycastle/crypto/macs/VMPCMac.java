package org.spongycastle.crypto.macs;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes25.dex */
public class VMPCMac implements Mac {
    private byte[] T;
    private byte g;
    private byte[] workingIV;
    private byte[] workingKey;
    private byte x1;
    private byte x2;
    private byte x3;
    private byte x4;
    private byte n = 0;
    private byte[] P = null;
    private byte s = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.spongycastle.crypto.Mac
    public String getAlgorithmName() {
        return "VMPC-MAC";
    }

    @Override // org.spongycastle.crypto.Mac
    public int getMacSize() {
        return 20;
    }

    @Override // org.spongycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, DataLengthException {
        for (int i2 = 1; i2 < 25; i2++) {
            byte[] bArr2 = this.P;
            byte b = this.s;
            byte b2 = this.n;
            int i3 = b2 & UnsignedBytes.MAX_VALUE;
            byte b3 = bArr2[(b + bArr2[i3]) & 255];
            this.s = b3;
            byte b4 = this.x4;
            byte b5 = this.x3;
            byte b6 = bArr2[(b4 + b5 + i2) & 255];
            this.x4 = b6;
            byte b7 = this.x2;
            byte b8 = bArr2[(b5 + b7 + i2) & 255];
            this.x3 = b8;
            byte b9 = this.x1;
            byte b10 = bArr2[(b7 + b9 + i2) & 255];
            this.x2 = b10;
            byte b11 = bArr2[(b9 + b3 + i2) & 255];
            this.x1 = b11;
            byte[] bArr3 = this.T;
            byte b12 = this.g;
            int i4 = b12 & Ascii.US;
            bArr3[i4] = (byte) (b11 ^ bArr3[i4]);
            int i5 = (b12 + 1) & 31;
            bArr3[i5] = (byte) (b10 ^ bArr3[i5]);
            int i6 = (b12 + 2) & 31;
            bArr3[i6] = (byte) (b8 ^ bArr3[i6]);
            int i7 = (b12 + 3) & 31;
            bArr3[i7] = (byte) (b6 ^ bArr3[i7]);
            this.g = (byte) ((b12 + 4) & 31);
            byte b13 = bArr2[i3];
            int i8 = b3 & UnsignedBytes.MAX_VALUE;
            bArr2[i3] = bArr2[i8];
            bArr2[i8] = b13;
            this.n = (byte) ((b2 + 1) & 255);
        }
        for (int i9 = 0; i9 < 768; i9++) {
            byte[] bArr4 = this.P;
            byte b14 = this.s;
            int i10 = i9 & 255;
            byte b15 = bArr4[i10];
            byte b16 = bArr4[(b14 + b15 + this.T[i9 & 31]) & 255];
            this.s = b16;
            int i11 = b16 & UnsignedBytes.MAX_VALUE;
            bArr4[i10] = bArr4[i11];
            bArr4[i11] = b15;
        }
        byte[] bArr5 = new byte[20];
        for (int i12 = 0; i12 < 20; i12++) {
            byte[] bArr6 = this.P;
            int i13 = i12 & 255;
            byte b17 = bArr6[(this.s + bArr6[i13]) & 255];
            this.s = b17;
            int i14 = b17 & UnsignedBytes.MAX_VALUE;
            bArr5[i12] = bArr6[(bArr6[bArr6[i14] & UnsignedBytes.MAX_VALUE] + 1) & 255];
            byte b18 = bArr6[i13];
            bArr6[i13] = bArr6[i14];
            bArr6[i14] = b18;
        }
        System.arraycopy(bArr5, 0, bArr, i, 20);
        reset();
        return 20;
    }

    @Override // org.spongycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        byte[] iv = parametersWithIV.getIV();
        this.workingIV = iv;
        if (iv == null || iv.length < 1 || iv.length > 768) {
            throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
        }
        this.workingKey = keyParameter.getKey();
        reset();
    }

    private void initKey(byte[] bArr, byte[] bArr2) {
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
        this.n = (byte) 0;
    }

    @Override // org.spongycastle.crypto.Mac
    public void reset() {
        initKey(this.workingKey, this.workingIV);
        this.n = (byte) 0;
        this.x4 = (byte) 0;
        this.x3 = (byte) 0;
        this.x2 = (byte) 0;
        this.x1 = (byte) 0;
        this.g = (byte) 0;
        this.T = new byte[32];
        for (int i = 0; i < 32; i++) {
            this.T[i] = 0;
        }
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte b) throws IllegalStateException {
        byte[] bArr = this.P;
        byte b2 = this.s;
        byte b3 = this.n;
        int i = b3 & UnsignedBytes.MAX_VALUE;
        byte b4 = bArr[(b2 + bArr[i]) & 255];
        this.s = b4;
        int i2 = b4 & UnsignedBytes.MAX_VALUE;
        byte b5 = (byte) (b ^ bArr[(bArr[bArr[i2] & UnsignedBytes.MAX_VALUE] + 1) & 255]);
        byte b6 = this.x4;
        byte b7 = this.x3;
        byte b8 = bArr[(b6 + b7) & 255];
        this.x4 = b8;
        byte b9 = this.x2;
        byte b10 = bArr[(b7 + b9) & 255];
        this.x3 = b10;
        byte b11 = this.x1;
        byte b12 = bArr[(b9 + b11) & 255];
        this.x2 = b12;
        byte b13 = bArr[(b11 + b4 + b5) & 255];
        this.x1 = b13;
        byte[] bArr2 = this.T;
        byte b14 = this.g;
        int i3 = b14 & Ascii.US;
        bArr2[i3] = (byte) (b13 ^ bArr2[i3]);
        int i4 = (b14 + 1) & 31;
        bArr2[i4] = (byte) (b12 ^ bArr2[i4]);
        int i5 = (b14 + 2) & 31;
        bArr2[i5] = (byte) (b10 ^ bArr2[i5]);
        int i6 = (b14 + 3) & 31;
        bArr2[i6] = (byte) (b8 ^ bArr2[i6]);
        this.g = (byte) ((b14 + 4) & 31);
        byte b15 = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b15;
        this.n = (byte) ((b3 + 1) & 255);
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) throws IllegalStateException, DataLengthException {
        if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            update(bArr[i + i3]);
        }
    }
}
