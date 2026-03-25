package o;

import java.nio.BufferUnderflowException;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: renamed from: o.awu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8131awu {
    private C8131awu() {
    }

    public static long KWHzl(java.nio.channels.FileChannel fileChannel) throws java.io.IOException {
        long size = fileChannel.size();
        if (size < 22) {
            throw new java.io.IOException("APK too small for ZIP End of Central Directory (EOCD) record");
        }
        long j = size - 22;
        long jMin = java.lang.Math.min(j, WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i = 0;
        while (true) {
            long j2 = i;
            if (j2 <= jMin) {
                long j3 = j - j2;
                java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(4);
                fileChannel.position(j3);
                fileChannel.read(byteBufferAllocate);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                if (byteBufferAllocate.getInt(0) == 101010256) {
                    java.nio.ByteBuffer byteBufferAllocate2 = java.nio.ByteBuffer.allocate(2);
                    fileChannel.position(j3 + 20);
                    fileChannel.read(byteBufferAllocate2);
                    byteBufferAllocate2.order(byteOrder);
                    short s = byteBufferAllocate2.getShort(0);
                    if (s == i) {
                        return s;
                    }
                }
                i++;
            } else {
                throw new java.io.IOException("ZIP End of Central Directory (EOCD) record not found");
            }
        }
    }

    public static long copydefault(java.nio.channels.FileChannel fileChannel) throws java.io.IOException {
        return KWHzl(fileChannel, KWHzl(fileChannel));
    }

    public static long KWHzl(java.nio.channels.FileChannel fileChannel, long j) throws java.io.IOException {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        fileChannel.position((fileChannel.size() - j) - 6);
        fileChannel.read(byteBufferAllocate);
        return byteBufferAllocate.getInt(0);
    }

    public static C8085awA<java.nio.ByteBuffer, java.lang.Long> AEQbTJ(java.nio.channels.FileChannel fileChannel) throws com.meituan.android.walle.SignatureNotFoundException, java.io.IOException {
        return OLrzqt(fileChannel, copydefault(fileChannel));
    }

    public static C8085awA<java.nio.ByteBuffer, java.lang.Long> OLrzqt(java.nio.channels.FileChannel fileChannel, long j) throws com.meituan.android.walle.SignatureNotFoundException, java.io.IOException {
        if (j < 32) {
            throw new com.meituan.android.walle.SignatureNotFoundException("APK too small for APK Signing Block. ZIP Central Directory offset: " + j);
        }
        fileChannel.position(j - 24);
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(24);
        fileChannel.read(byteBufferAllocate);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
            throw new com.meituan.android.walle.SignatureNotFoundException("No APK Signing Block before ZIP Central Directory");
        }
        long j2 = byteBufferAllocate.getLong(0);
        if (j2 < byteBufferAllocate.capacity() || j2 > 2147483639) {
            throw new com.meituan.android.walle.SignatureNotFoundException("APK Signing Block size out of range: " + j2);
        }
        int i = (int) (8 + j2);
        long j3 = j - ((long) i);
        if (j3 < 0) {
            throw new com.meituan.android.walle.SignatureNotFoundException("APK Signing Block offset out of range: " + j3);
        }
        fileChannel.position(j3);
        java.nio.ByteBuffer byteBufferAllocate2 = java.nio.ByteBuffer.allocate(i);
        fileChannel.read(byteBufferAllocate2);
        byteBufferAllocate2.order(byteOrder);
        long j4 = byteBufferAllocate2.getLong(0);
        if (j4 != j2) {
            throw new com.meituan.android.walle.SignatureNotFoundException("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
        }
        return C8085awA.copydefault(byteBufferAllocate2, java.lang.Long.valueOf(j3));
    }

    public static java.util.Map<java.lang.Integer, java.nio.ByteBuffer> OLrzqt(java.nio.ByteBuffer byteBuffer) throws com.meituan.android.walle.SignatureNotFoundException {
        KWHzl(byteBuffer);
        java.nio.ByteBuffer byteBufferAEQbTJ = AEQbTJ(byteBuffer, 8, byteBuffer.capacity() - 24);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (byteBufferAEQbTJ.hasRemaining()) {
            i++;
            if (byteBufferAEQbTJ.remaining() < 8) {
                throw new com.meituan.android.walle.SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #" + i);
            }
            long j = byteBufferAEQbTJ.getLong();
            if (j < 4 || j > 2147483647L) {
                throw new com.meituan.android.walle.SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + j);
            }
            int i2 = (int) j;
            int iPosition = byteBufferAEQbTJ.position();
            if (i2 > byteBufferAEQbTJ.remaining()) {
                throw new com.meituan.android.walle.SignatureNotFoundException("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + byteBufferAEQbTJ.remaining());
            }
            linkedHashMap.put(java.lang.Integer.valueOf(byteBufferAEQbTJ.getInt()), OLrzqt(byteBufferAEQbTJ, i2 - 4));
            byteBufferAEQbTJ.position(iPosition + i2);
        }
        return linkedHashMap;
    }

    public static java.nio.ByteBuffer AEQbTJ(java.nio.ByteBuffer byteBuffer, int i, int i2) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("start: " + i);
        }
        if (i2 < i) {
            throw new java.lang.IllegalArgumentException("end < start: " + i2 + " < " + i);
        }
        int iCapacity = byteBuffer.capacity();
        if (i2 > byteBuffer.capacity()) {
            throw new java.lang.IllegalArgumentException("end > capacity: " + i2 + " > " + iCapacity);
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i2);
            byteBuffer.position(i);
            java.nio.ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            return byteBufferSlice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(iLimit);
            byteBuffer.position(iPosition);
        }
    }

    public static java.nio.ByteBuffer OLrzqt(java.nio.ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("size: " + i);
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            java.nio.ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static void KWHzl(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new java.lang.IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
