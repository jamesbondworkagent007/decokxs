package o;

import com.google.common.primitives.UnsignedBytes;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.Su, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5466Su {
    public static final AtomicReference<byte[]> EZpvd = new AtomicReference<>();

    private C5466Su() {
    }

    public static java.nio.ByteBuffer OLrzqt(@androidx.annotation.NonNull java.io.File file) throws java.lang.Throwable {
        java.io.RandomAccessFile randomAccessFile;
        java.lang.Throwable th;
        java.nio.channels.FileChannel channel;
        java.nio.channels.FileChannel fileChannel = null;
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new java.io.IOException("File too large to map into memory");
            }
            if (length == 0) {
                throw new java.io.IOException("File unsuitable for memory mapping");
            }
            randomAccessFile = new java.io.RandomAccessFile(file, "r");
            try {
                channel = randomAccessFile.getChannel();
            } catch (java.lang.Throwable th2) {
                th = th2;
                channel = null;
            }
            try {
                MappedByteBuffer mappedByteBufferLoad = channel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                try {
                    channel.close();
                } catch (java.io.IOException unused) {
                }
                try {
                    randomAccessFile.close();
                } catch (java.io.IOException unused2) {
                }
                return mappedByteBufferLoad;
            } catch (java.lang.Throwable th3) {
                th = th3;
                java.lang.Throwable th4 = th;
                fileChannel = channel;
                th = th4;
                if (fileChannel != null) {
                    try {
                        fileChannel.close();
                    } catch (java.io.IOException unused3) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (java.io.IOException unused4) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
            randomAccessFile = null;
        }
    }

    public static void AEQbTJ(@androidx.annotation.NonNull java.nio.ByteBuffer byteBuffer, @androidx.annotation.NonNull java.io.File file) throws java.lang.Throwable {
        java.io.RandomAccessFile randomAccessFile;
        java.nio.channels.FileChannel channel;
        OLrzqt(byteBuffer);
        java.nio.channels.FileChannel fileChannel = null;
        try {
            randomAccessFile = new java.io.RandomAccessFile(file, "rw");
            try {
                channel = randomAccessFile.getChannel();
            } catch (java.lang.Throwable th) {
                th = th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
        try {
            channel.write(byteBuffer);
            channel.force(false);
            channel.close();
            randomAccessFile.close();
            try {
                channel.close();
            } catch (java.io.IOException unused) {
            }
            try {
                randomAccessFile.close();
            } catch (java.io.IOException unused2) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            fileChannel = channel;
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (java.io.IOException unused3) {
                }
            }
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                    throw th;
                } catch (java.io.IOException unused4) {
                    throw th;
                }
            }
            throw th;
        }
    }

    public static byte[] copydefault(@androidx.annotation.NonNull java.nio.ByteBuffer byteBuffer) {
        Application applicationKWHzl = KWHzl(byteBuffer);
        if (applicationKWHzl != null && applicationKWHzl.AEQbTJ == 0 && applicationKWHzl.copydefault == applicationKWHzl.OLrzqt.length) {
            return byteBuffer.array();
        }
        java.nio.ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[byteBufferAsReadOnlyBuffer.limit()];
        OLrzqt(byteBufferAsReadOnlyBuffer);
        byteBufferAsReadOnlyBuffer.get(bArr);
        return bArr;
    }

    public static java.io.InputStream EZpvd(@androidx.annotation.NonNull java.nio.ByteBuffer byteBuffer) {
        return new TaskDescription(byteBuffer);
    }

    public static java.nio.ByteBuffer EZpvd(@androidx.annotation.NonNull java.io.InputStream inputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(16384);
        byte[] andSet = EZpvd.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[16384];
        }
        while (true) {
            int i = inputStream.read(andSet);
            if (i >= 0) {
                byteArrayOutputStream.write(andSet, 0, i);
            } else {
                EZpvd.set(andSet);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return OLrzqt(java.nio.ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
            }
        }
    }

    public static java.nio.ByteBuffer OLrzqt(java.nio.ByteBuffer byteBuffer) {
        return (java.nio.ByteBuffer) byteBuffer.position(0);
    }

    public static Application KWHzl(@androidx.annotation.NonNull java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new Application(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }

    /* JADX INFO: renamed from: o.Su$Application */
    public static final class Application {
        public final int AEQbTJ;
        public final byte[] OLrzqt;
        public final int copydefault;

        public Application(@androidx.annotation.NonNull byte[] bArr, int i, int i2) {
            this.OLrzqt = bArr;
            this.AEQbTJ = i;
            this.copydefault = i2;
        }
    }

    /* JADX INFO: renamed from: o.Su$TaskDescription */
    public static class TaskDescription extends java.io.InputStream {
        public final java.nio.ByteBuffer EZpvd;
        public int OLrzqt = -1;

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        public TaskDescription(@androidx.annotation.NonNull java.nio.ByteBuffer byteBuffer) {
            this.EZpvd = byteBuffer;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.EZpvd.remaining();
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.EZpvd.hasRemaining()) {
                return this.EZpvd.get() & UnsignedBytes.MAX_VALUE;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            synchronized (this) {
                this.OLrzqt = this.EZpvd.position();
            }
        }

        @Override // java.io.InputStream
        public int read(@androidx.annotation.NonNull byte[] bArr, int i, int i2) {
            if (!this.EZpvd.hasRemaining()) {
                return -1;
            }
            int iMin = java.lang.Math.min(i2, available());
            this.EZpvd.get(bArr, i, iMin);
            return iMin;
        }

        @Override // java.io.InputStream
        public void reset() throws java.io.IOException {
            synchronized (this) {
                int i = this.OLrzqt;
                if (i == -1) {
                    throw new java.io.IOException("Cannot reset to unset mark position");
                }
                this.EZpvd.position(i);
            }
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (!this.EZpvd.hasRemaining()) {
                return -1L;
            }
            long jMin = java.lang.Math.min(j, available());
            java.nio.ByteBuffer byteBuffer = this.EZpvd;
            byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
            return jMin;
        }
    }
}
