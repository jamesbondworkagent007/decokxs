package org.spongycastle.crypto.engines;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes25.dex */
public class Grain128Engine implements StreamCipher {
    private static final int STATE_SIZE = 4;
    private int index = 4;
    private boolean initialised = false;
    private int[] lfsr;
    private int[] nfsr;
    private byte[] out;
    private int output;
    private byte[] workingIV;
    private byte[] workingKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Grain-128";
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Grain-128 Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != 12) {
            throw new IllegalArgumentException("Grain-128  requires exactly 12 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("Grain-128 Init parameters must include a key");
        }
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        this.workingIV = new byte[keyParameter.getKey().length];
        this.workingKey = new byte[keyParameter.getKey().length];
        this.lfsr = new int[4];
        this.nfsr = new int[4];
        this.out = new byte[4];
        System.arraycopy(iv, 0, this.workingIV, 0, iv.length);
        System.arraycopy(keyParameter.getKey(), 0, this.workingKey, 0, keyParameter.getKey().length);
        reset();
    }

    private void initGrain() {
        for (int i = 0; i < 8; i++) {
            this.output = getOutput();
            this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) ^ this.output);
            this.lfsr = shift(this.lfsr, getOutputLFSR() ^ this.output);
        }
        this.initialised = true;
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        return (((i4 << 12) | (i3 >>> 20)) & ((i3 >>> 4) | (i4 << 28))) ^ ((((((i >>> 27) | (i2 << 5)) & ((i2 >>> 27) | (i3 << 5))) ^ (((((((((i >>> 26) | (i2 << 6)) ^ i) ^ ((i2 >>> 24) | (i3 << 8))) ^ ((i3 >>> 27) | (i4 << 5))) ^ i4) ^ (((i >>> 3) | (i2 << 29)) & ((i3 >>> 3) | (i4 << 29)))) ^ (((i >>> 11) | (i2 << 21)) & ((i >>> 13) | (i2 << 19)))) ^ (((i >>> 17) | (i2 << 15)) & ((i >>> 18) | (i2 << 14))))) ^ (((i2 >>> 8) | (i3 << 24)) & ((i2 >>> 16) | (i3 << 16)))) ^ (((i2 >>> 29) | (i3 << 3)) & ((i3 >>> 1) | (i4 << 31))));
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        return i4 ^ ((((i ^ ((i >>> 7) | (i2 << 25))) ^ ((i2 >>> 6) | (i3 << 26))) ^ ((i3 >>> 6) | (i4 << 26))) ^ ((i3 >>> 17) | (i4 << 15)));
    }

    private int getOutput() {
        int[] iArr = this.nfsr;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 12) | (i2 << 20);
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = (i5 << 1) | (i4 >>> 31);
        int[] iArr2 = this.lfsr;
        int i7 = iArr2[0];
        int i8 = iArr2[1];
        int i9 = iArr2[2];
        int i10 = iArr2[3];
        return ((i5 << 7) | (i4 >>> 25)) ^ ((((((((((((((i7 >>> 8) | (i8 << 24)) & i3) ^ (((i7 >>> 13) | (i8 << 19)) & ((i7 >>> 20) | (i8 << 12)))) ^ (((i8 >>> 10) | (i9 << 22)) & i6)) ^ (((i8 >>> 28) | (i9 << 4)) & ((i9 >>> 15) | (i10 << 17)))) ^ ((i6 & i3) & ((i10 << 1) | (i9 >>> 31)))) ^ ((i9 >>> 29) | (i10 << 3))) ^ ((i >>> 2) | (i2 << 30))) ^ ((i >>> 15) | (i2 << 17))) ^ ((i2 >>> 4) | (i4 << 28))) ^ ((i2 >>> 13) | (i4 << 19))) ^ i4) ^ ((i4 >>> 9) | (i5 << 23)));
    }

    private int[] shift(int[] iArr, int i) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = i;
        return iArr;
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        bArr2[12] = -1;
        bArr2[13] = -1;
        bArr2[14] = -1;
        bArr2[15] = -1;
        this.workingKey = bArr;
        this.workingIV = bArr2;
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.nfsr;
            if (i >= iArr.length) {
                return;
            }
            byte[] bArr3 = this.workingKey;
            int i3 = i2 + 3;
            int i4 = i2 + 2;
            int i5 = i2 + 1;
            iArr[i] = (bArr3[i2] & UnsignedBytes.MAX_VALUE) | (bArr3[i3] << Ascii.CAN) | ((bArr3[i4] << 16) & 16711680) | ((bArr3[i5] << 8) & 65280);
            int[] iArr2 = this.lfsr;
            byte[] bArr4 = this.workingIV;
            iArr2[i] = (bArr4[i2] & UnsignedBytes.MAX_VALUE) | (bArr4[i3] << Ascii.CAN) | ((bArr4[i4] << 16) & 16711680) | ((bArr4[i5] << 8) & 65280);
            i2 += 4;
            i++;
        }
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i3 + i4] = (byte) (bArr[i + i4] ^ getKeyStream());
        }
        return i2;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void reset() {
        this.index = 4;
        setKey(this.workingKey, this.workingIV);
        initGrain();
    }

    private void oneRound() {
        int output = getOutput();
        this.output = output;
        byte[] bArr = this.out;
        bArr[0] = (byte) output;
        bArr[1] = (byte) (output >> 8);
        bArr[2] = (byte) (output >> 16);
        bArr[3] = (byte) (output >> 24);
        this.nfsr = shift(this.nfsr, getOutputNFSR() ^ this.lfsr[0]);
        this.lfsr = shift(this.lfsr, getOutputLFSR());
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public byte returnByte(byte b) {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        return (byte) (b ^ getKeyStream());
    }

    private byte getKeyStream() {
        if (this.index > 3) {
            oneRound();
            this.index = 0;
        }
        byte[] bArr = this.out;
        int i = this.index;
        this.index = i + 1;
        return bArr[i];
    }
}
