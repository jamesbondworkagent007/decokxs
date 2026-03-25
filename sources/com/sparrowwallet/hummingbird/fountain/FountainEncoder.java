package com.sparrowwallet.hummingbird.fountain;

import co.nstant.in.cbor.CborException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.zip.CRC32;
import o.C5205It;
import o.C5210Iy;
import o.C5211Iz;
import o.HP;
import o.HS;
import o.HU;
import o.IL;

/* JADX INFO: loaded from: classes12.dex */
public class FountainEncoder {
    private final long checksum;
    private final int fragmentLen;
    private final List<byte[]> fragments;
    private final int messageLen;
    private List<Integer> partIndexes;
    private final int seqLen;
    private long seqNum;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public List<Integer> getPartIndexes() {
        return this.partIndexes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getSeqLen() {
        return this.seqLen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long getSeqNum() {
        return this.seqNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isComplete() {
        return this.seqNum >= ((long) this.seqLen);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isSinglePart() {
        return this.seqLen == 1;
    }

    public FountainEncoder(byte[] bArr, int i, int i2, long j) {
        if (bArr.length >= Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Message too long");
        }
        int length = bArr.length;
        this.messageLen = length;
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        this.checksum = crc32.getValue();
        int iFindNominalFragmentLength = findNominalFragmentLength(length, i2, i);
        this.fragmentLen = iFindNominalFragmentLength;
        List<byte[]> listPartitionMessage = partitionMessage(bArr, iFindNominalFragmentLength);
        this.fragments = listPartitionMessage;
        this.seqLen = listPartitionMessage.size();
        this.seqNum = j;
    }

    public Part nextPart() {
        long j = this.seqNum + 1;
        this.seqNum = j;
        List<Integer> listChooseFragments = FountainUtils.chooseFragments(j, this.seqLen, this.checksum);
        this.partIndexes = listChooseFragments;
        return new Part(this.seqNum, this.seqLen, this.messageLen, this.checksum, mix(listChooseFragments));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ byte[] lambda$mix$0(byte[] bArr, Integer num) {
        return xor(this.fragments.get(num.intValue()), bArr);
    }

    private byte[] mix(List<Integer> list) {
        return (byte[]) list.stream().reduce(new byte[this.fragmentLen], new BiFunction() { // from class: com.sparrowwallet.hummingbird.fountain.FountainEncoder$$ExternalSyntheticLambda0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return this.f$0.lambda$mix$0((byte[]) obj, (Integer) obj2);
            }
        }, new BinaryOperator() { // from class: com.sparrowwallet.hummingbird.fountain.FountainEncoder$$ExternalSyntheticLambda1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return FountainEncoder.xor((byte[]) obj, (byte[]) obj2);
            }
        });
    }

    public static byte[] xor(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    public static List<byte[]> partitionMessage(byte[] bArr, int i) {
        int iCeil = (int) Math.ceil(((double) bArr.length) / ((double) i));
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i2 < iCeil) {
            int i4 = i3 + i;
            arrayList.add(Arrays.copyOfRange(bArr, i3, i4));
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    public static int findNominalFragmentLength(int i, int i2, int i3) {
        int iMax = Math.max(1, i / i2);
        int iCeil = 0;
        for (int i4 = 1; i4 <= iMax; i4++) {
            iCeil = (int) Math.ceil(((double) i) / ((double) i4));
            if (iCeil <= i3) {
                break;
            }
        }
        return iCeil;
    }

    public static class Part {
        private final long checksum;
        private final byte[] data;
        private final int messageLen;
        private final int seqLen;
        private final long seqNum;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public long getChecksum() {
            return this.checksum;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public byte[] getData() {
            return this.data;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getMessageLen() {
            return this.messageLen;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int getSeqLen() {
            return this.seqLen;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public long getSeqNum() {
            return this.seqNum;
        }

        public Part(long j, int i, int i2, long j2, byte[] bArr) {
            this.seqNum = j;
            this.seqLen = i;
            this.messageLen = i2;
            this.checksum = j2;
            this.data = bArr;
        }

        public byte[] toCborBytes() {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new HS(byteArrayOutputStream).OLrzqt(((HP) new HP().copydefault().copydefault(new IL(this.seqNum)).copydefault(new IL(this.seqLen)).copydefault(new IL(this.messageLen)).copydefault(new IL(this.checksum)).OLrzqt(this.data).copydefault()).EZpvd());
                return byteArrayOutputStream.toByteArray();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public static Part fromCborBytes(byte[] bArr) throws CborException {
            List<C5211Iz> listAEQbTJ = ((C5205It) new HU(new ByteArrayInputStream(bArr)).EZpvd().get(0)).AEQbTJ();
            return new Part(((IL) listAEQbTJ.get(0)).KWHzl().longValue(), ((IL) listAEQbTJ.get(1)).KWHzl().intValue(), ((IL) listAEQbTJ.get(2)).KWHzl().intValue(), ((IL) listAEQbTJ.get(3)).KWHzl().longValue(), ((C5210Iy) listAEQbTJ.get(4)).KWHzl());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Part part = (Part) obj;
            if (this.seqNum == part.seqNum && this.seqLen == part.seqLen && this.messageLen == part.messageLen && this.checksum == part.checksum) {
                return Arrays.equals(this.data, part.data);
            }
            return false;
        }

        public int hashCode() {
            long j = this.seqNum;
            int i = (int) (j ^ (j >>> 32));
            int i2 = this.seqLen;
            int i3 = this.messageLen;
            long j2 = this.checksum;
            return (((((((i * 31) + i2) * 31) + i3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.data);
        }
    }
}
