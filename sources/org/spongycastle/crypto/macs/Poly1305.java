package org.spongycastle.crypto.macs;

import org.spongycastle.asn1.cmc.BodyPartID;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Pack;

/* JADX INFO: loaded from: classes25.dex */
public class Poly1305 implements Mac {
    private static final int BLOCK_SIZE = 16;
    private final BlockCipher cipher;
    private final byte[] currentBlock;
    private int currentBlockOffset;
    private int h0;
    private int h1;
    private int h2;
    private int h3;
    private int h4;
    private int k0;
    private int k1;
    private int k2;
    private int k3;
    private int r0;
    private int r1;
    private int r2;
    private int r3;
    private int r4;
    private int s1;
    private int s2;
    private int s3;
    private int s4;
    private final byte[] singleByte;

    private static final long mul32x32_64(int i, int i2) {
        return (((long) i) & BodyPartID.bodyIdMax) * ((long) i2);
    }

    @Override // org.spongycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.spongycastle.crypto.Mac
    public void reset() {
        this.currentBlockOffset = 0;
        this.h4 = 0;
        this.h3 = 0;
        this.h2 = 0;
        this.h1 = 0;
        this.h0 = 0;
    }

    public Poly1305() {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        this.cipher = null;
    }

    public Poly1305(BlockCipher blockCipher) {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit block cipher.");
        }
        this.cipher = blockCipher;
    }

    @Override // org.spongycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] iv;
        if (this.cipher == null) {
            iv = null;
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException("Poly1305 requires an IV when used with a block cipher.");
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            iv = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        }
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("Poly1305 requires a key.");
        }
        setKey(((KeyParameter) cipherParameters).getKey(), iv);
        reset();
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Poly1305 key must be 256 bits.");
        }
        int i = 16;
        if (this.cipher != null && (bArr2 == null || bArr2.length != 16)) {
            throw new IllegalArgumentException("Poly1305 requires a 128 bit IV.");
        }
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
        this.r0 = 67108863 & iLittleEndianToInt;
        int i2 = ((iLittleEndianToInt >>> 26) | (iLittleEndianToInt2 << 6)) & 67108611;
        this.r1 = i2;
        int i3 = ((iLittleEndianToInt2 >>> 20) | (iLittleEndianToInt3 << 12)) & 67092735;
        this.r2 = i3;
        int i4 = ((iLittleEndianToInt3 >>> 14) | (iLittleEndianToInt4 << 18)) & 66076671;
        this.r3 = i4;
        int i5 = (iLittleEndianToInt4 >>> 8) & 1048575;
        this.r4 = i5;
        this.s1 = i2 * 5;
        this.s2 = i3 * 5;
        this.s3 = i4 * 5;
        this.s4 = i5 * 5;
        BlockCipher blockCipher = this.cipher;
        if (blockCipher != null) {
            byte[] bArr3 = new byte[16];
            blockCipher.init(true, new KeyParameter(bArr, 16, 16));
            this.cipher.processBlock(bArr2, 0, bArr3, 0);
            i = 0;
            bArr = bArr3;
        }
        this.k0 = Pack.littleEndianToInt(bArr, i);
        this.k1 = Pack.littleEndianToInt(bArr, i + 4);
        this.k2 = Pack.littleEndianToInt(bArr, i + 8);
        this.k3 = Pack.littleEndianToInt(bArr, i + 12);
    }

    @Override // org.spongycastle.crypto.Mac
    public String getAlgorithmName() {
        if (this.cipher == null) {
            return "Poly1305";
        }
        return "Poly1305-" + this.cipher.getAlgorithmName();
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte b) throws IllegalStateException {
        byte[] bArr = this.singleByte;
        bArr[0] = b;
        update(bArr, 0, 1);
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) throws IllegalStateException, DataLengthException {
        int i3 = 0;
        while (i2 > i3) {
            if (this.currentBlockOffset == 16) {
                processBlock();
                this.currentBlockOffset = 0;
            }
            int iMin = Math.min(i2 - i3, 16 - this.currentBlockOffset);
            System.arraycopy(bArr, i3 + i, this.currentBlock, this.currentBlockOffset, iMin);
            i3 += iMin;
            this.currentBlockOffset += iMin;
        }
    }

    private void processBlock() {
        int i = this.currentBlockOffset;
        if (i < 16) {
            this.currentBlock[i] = 1;
            for (int i2 = i + 1; i2 < 16; i2++) {
                this.currentBlock[i2] = 0;
            }
        }
        long jLittleEndianToInt = Pack.littleEndianToInt(this.currentBlock, 0);
        long jLittleEndianToInt2 = ((long) Pack.littleEndianToInt(this.currentBlock, 4)) & BodyPartID.bodyIdMax;
        long jLittleEndianToInt3 = ((long) Pack.littleEndianToInt(this.currentBlock, 8)) & BodyPartID.bodyIdMax;
        long jLittleEndianToInt4 = ((long) Pack.littleEndianToInt(this.currentBlock, 12)) & BodyPartID.bodyIdMax;
        int i3 = (int) (((long) this.h0) + (jLittleEndianToInt & 67108863));
        this.h0 = i3;
        this.h1 = (int) (((long) this.h1) + ((((jLittleEndianToInt2 << 32) | (jLittleEndianToInt & BodyPartID.bodyIdMax)) >>> 26) & 67108863));
        this.h2 = (int) (((long) this.h2) + (((jLittleEndianToInt2 | (jLittleEndianToInt3 << 32)) >>> 20) & 67108863));
        this.h3 = (int) (((long) this.h3) + ((((jLittleEndianToInt4 << 32) | jLittleEndianToInt3) >>> 14) & 67108863));
        int i4 = (int) (((long) this.h4) + (jLittleEndianToInt4 >>> 8));
        this.h4 = i4;
        if (this.currentBlockOffset == 16) {
            this.h4 = i4 + 16777216;
        }
        long jMul32x32_64 = mul32x32_64(i3, this.r0) + mul32x32_64(this.h1, this.s4) + mul32x32_64(this.h2, this.s3) + mul32x32_64(this.h3, this.s2) + mul32x32_64(this.h4, this.s1);
        long jMul32x32_642 = mul32x32_64(this.h0, this.r1);
        long jMul32x32_643 = mul32x32_64(this.h1, this.r0);
        long jMul32x32_644 = mul32x32_64(this.h2, this.s4);
        long jMul32x32_645 = mul32x32_64(this.h3, this.s3);
        long jMul32x32_646 = mul32x32_64(this.h4, this.s2);
        long jMul32x32_647 = mul32x32_64(this.h0, this.r2);
        long jMul32x32_648 = mul32x32_64(this.h1, this.r1);
        long jMul32x32_649 = mul32x32_64(this.h2, this.r0);
        long jMul32x32_6410 = mul32x32_64(this.h3, this.s4);
        long jMul32x32_6411 = mul32x32_64(this.h4, this.s3);
        long jMul32x32_6412 = mul32x32_64(this.h0, this.r3);
        long jMul32x32_6413 = mul32x32_64(this.h1, this.r2);
        long jMul32x32_6414 = mul32x32_64(this.h2, this.r1);
        long jMul32x32_6415 = mul32x32_64(this.h3, this.r0);
        long jMul32x32_6416 = mul32x32_64(this.h4, this.s4);
        long jMul32x32_6417 = mul32x32_64(this.h0, this.r4);
        long jMul32x32_6418 = mul32x32_64(this.h1, this.r3);
        long jMul32x32_6419 = mul32x32_64(this.h2, this.r2);
        long jMul32x32_6420 = mul32x32_64(this.h3, this.r1);
        long jMul32x32_6421 = mul32x32_64(this.h4, this.r0);
        long j = jMul32x32_642 + jMul32x32_643 + jMul32x32_644 + jMul32x32_645 + jMul32x32_646 + (jMul32x32_64 >>> 26);
        long j2 = (j >>> 26) + jMul32x32_647 + jMul32x32_648 + jMul32x32_649 + jMul32x32_6410 + jMul32x32_6411;
        this.h2 = ((int) j2) & 67108863;
        long j3 = jMul32x32_6412 + jMul32x32_6413 + jMul32x32_6414 + jMul32x32_6415 + jMul32x32_6416 + (j2 >>> 26);
        this.h3 = ((int) j3) & 67108863;
        long j4 = jMul32x32_6417 + jMul32x32_6418 + jMul32x32_6419 + jMul32x32_6420 + jMul32x32_6421 + (j3 >>> 26);
        this.h4 = ((int) j4) & 67108863;
        int i5 = (((int) jMul32x32_64) & 67108863) + (((int) (j4 >>> 26)) * 5);
        this.h1 = (((int) j) & 67108863) + (i5 >>> 26);
        this.h0 = i5 & 67108863;
    }

    @Override // org.spongycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, DataLengthException {
        if (i + 16 > bArr.length) {
            throw new OutputLengthException("Output buffer is too short.");
        }
        if (this.currentBlockOffset > 0) {
            processBlock();
        }
        int i2 = this.h1;
        int i3 = this.h0;
        int i4 = i2 + (i3 >>> 26);
        int i5 = this.h2 + (i4 >>> 26);
        int i6 = this.h3 + (i5 >>> 26);
        int i7 = i5 & 67108863;
        int i8 = this.h4 + (i6 >>> 26);
        int i9 = i6 & 67108863;
        int i10 = (i3 & 67108863) + ((i8 >>> 26) * 5);
        int i11 = i8 & 67108863;
        int i12 = (i4 & 67108863) + (i10 >>> 26);
        int i13 = i10 & 67108863;
        int i14 = i13 + 5;
        int i15 = (i14 >>> 26) + i12;
        int i16 = (i15 >>> 26) + i7;
        int i17 = (i16 >>> 26) + i9;
        int i18 = ((i17 >>> 26) + i11) - 67108864;
        int i19 = (i18 >>> 31) - 1;
        int i20 = ~i19;
        int i21 = (i13 & i20) | (i14 & 67108863 & i19);
        this.h0 = i21;
        int i22 = (i12 & i20) | (i15 & 67108863 & i19);
        this.h1 = i22;
        int i23 = (i7 & i20) | (i16 & 67108863 & i19);
        this.h2 = i23;
        int i24 = (i9 & i20) | (67108863 & i17 & i19);
        this.h3 = i24;
        int i25 = (i11 & i20) | (i18 & i19);
        this.h4 = i25;
        long j = (((long) (i21 | (i22 << 26))) & BodyPartID.bodyIdMax) + (((long) this.k0) & BodyPartID.bodyIdMax);
        long j2 = (i22 >>> 6) | (i23 << 20);
        long j3 = this.k1;
        long j4 = (i23 >>> 12) | (i24 << 14);
        long j5 = this.k2;
        long j6 = this.k3;
        Pack.intToLittleEndian((int) j, bArr, i);
        long j7 = (j2 & BodyPartID.bodyIdMax) + (j3 & BodyPartID.bodyIdMax) + (j >>> 32);
        Pack.intToLittleEndian((int) j7, bArr, i + 4);
        long j8 = (j4 & BodyPartID.bodyIdMax) + (j5 & BodyPartID.bodyIdMax) + (j7 >>> 32);
        Pack.intToLittleEndian((int) j8, bArr, i + 8);
        Pack.intToLittleEndian((int) ((((long) ((i24 >>> 18) | (i25 << 8))) & BodyPartID.bodyIdMax) + (j6 & BodyPartID.bodyIdMax) + (j8 >>> 32)), bArr, i + 12);
        reset();
        return 16;
    }
}
