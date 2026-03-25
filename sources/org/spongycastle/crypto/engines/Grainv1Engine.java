package org.spongycastle.crypto.engines;

import com.google.common.primitives.UnsignedBytes;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes25.dex */
public class Grainv1Engine implements StreamCipher {
    private static final int STATE_SIZE = 5;
    private int index = 2;
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
        return "Grain v1";
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Grain v1 Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv = parametersWithIV.getIV();
        if (iv == null || iv.length != 8) {
            throw new IllegalArgumentException("Grain v1 requires exactly 8 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("Grain v1 Init parameters must include a key");
        }
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        this.workingIV = new byte[keyParameter.getKey().length];
        this.workingKey = new byte[keyParameter.getKey().length];
        this.lfsr = new int[5];
        this.nfsr = new int[5];
        this.out = new byte[2];
        System.arraycopy(iv, 0, this.workingIV, 0, iv.length);
        System.arraycopy(keyParameter.getKey(), 0, this.workingKey, 0, keyParameter.getKey().length);
        reset();
    }

    private void initGrain() {
        for (int i = 0; i < 10; i++) {
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
        int i3 = (i >>> 9) | (i2 << 7);
        int i4 = (i >>> 15) | (i2 << 1);
        int i5 = iArr[2];
        int i6 = (i2 >>> 5) | (i5 << 11);
        int i7 = (i2 >>> 12) | (i5 << 4);
        int i8 = iArr[3];
        int i9 = (i5 >>> 1) | (i8 << 15);
        int i10 = (i5 >>> 5) | (i8 << 11);
        int i11 = (i5 >>> 13) | (i8 << 3);
        int i12 = iArr[4];
        int i13 = (i8 >>> 4) | (i12 << 12);
        int i14 = (i8 >>> 12) | (i12 << 4);
        int i15 = (i12 << 1) | (i8 >>> 15);
        int i16 = i15 & i14;
        int i17 = i14 & i13;
        int i18 = i9 & i7 & i6;
        return (((((((((((((((((((((((i12 << 2) | (i8 >>> 14)) ^ i14) ^ i13) ^ i11) ^ i10) ^ i9) ^ i7) ^ i6) ^ ((i2 << 2) | (i >>> 14))) ^ i3) ^ i) ^ i16) ^ (i10 & i9)) ^ (i4 & i3)) ^ (i17 & i11)) ^ i18) ^ (((i15 & i11) & i7) & i3)) ^ ((i17 & i10) & i9)) ^ ((i16 & i6) & i4)) ^ (((i16 & i13) & i11) & i10)) ^ ((i18 & i4) & i3)) ^ (((((i13 & i11) & i10) & i9) & i7) & i6)) & 65535;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        return ((((i5 << 13) | (i4 >>> 3)) ^ (((i ^ ((i >>> 13) | (i2 << 3))) ^ ((i2 >>> 7) | (i3 << 9))) ^ ((i3 >>> 6) | (i4 << 10)))) ^ ((i5 << 2) | (i4 >>> 14))) & 65535;
    }

    private int getOutput() {
        int[] iArr = this.nfsr;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = (i5 << 1) | (i4 >>> 15);
        int[] iArr2 = this.lfsr;
        int i7 = iArr2[0];
        int i8 = iArr2[1];
        int i9 = (i7 >>> 3) | (i8 << 13);
        int i10 = iArr2[2];
        int i11 = (i8 >>> 9) | (i10 << 7);
        int i12 = (iArr2[3] << 2) | (i10 >>> 14);
        int i13 = iArr2[4];
        int i14 = i12 & i13;
        int i15 = i9 & i12;
        int i16 = i14 ^ ((i11 ^ i6) ^ (i9 & i13));
        return (((i5 << 8) | (i4 >>> 8)) ^ (((((((((((((i9 & i11) & i12) ^ ((i13 & i6) ^ i16)) ^ (i15 & i13)) ^ (i15 & i6)) ^ ((i11 & i12) & i6)) ^ (i6 & i14)) ^ ((i >>> 1) | (i2 << 15))) ^ ((i >>> 2) | (i2 << 14))) ^ ((i >>> 4) | (i2 << 12))) ^ ((i >>> 10) | (i2 << 6))) ^ ((i2 >>> 15) | (i3 << 1))) ^ ((i3 >>> 11) | (i4 << 5)))) & 65535;
    }

    private int[] shift(int[] iArr, int i) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = i;
        return iArr;
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        bArr2[8] = -1;
        bArr2[9] = -1;
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
            int i3 = i2 + 1;
            iArr[i] = ((bArr3[i2] & UnsignedBytes.MAX_VALUE) | (bArr3[i3] << 8)) & 65535;
            int[] iArr2 = this.lfsr;
            byte[] bArr4 = this.workingIV;
            iArr2[i] = ((bArr4[i2] & UnsignedBytes.MAX_VALUE) | (bArr4[i3] << 8)) & 65535;
            i2 += 2;
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
        this.index = 2;
        setKey(this.workingKey, this.workingIV);
        initGrain();
    }

    private void oneRound() {
        int output = getOutput();
        this.output = output;
        byte[] bArr = this.out;
        bArr[0] = (byte) output;
        bArr[1] = (byte) (output >> 8);
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
        if (this.index > 1) {
            oneRound();
            this.index = 0;
        }
        byte[] bArr = this.out;
        int i = this.index;
        this.index = i + 1;
        return bArr[i];
    }
}
