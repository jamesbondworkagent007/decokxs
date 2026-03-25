package o;

/* JADX INFO: renamed from: o.awD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8088awD {
    private C8088awD() {
    }

    public static java.lang.String KWHzl(java.io.File file, int i) {
        byte[] bArrEZpvd = EZpvd(file, i);
        if (bArrEZpvd == null) {
            return null;
        }
        try {
            return new java.lang.String(bArrEZpvd, com.google.android.exoplayer2.C.UTF8_NAME);
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] EZpvd(java.io.File file, int i) {
        java.nio.ByteBuffer byteBuffer;
        java.util.Map<java.lang.Integer, java.nio.ByteBuffer> mapOLrzqt = OLrzqt(file);
        if (mapOLrzqt == null || (byteBuffer = mapOLrzqt.get(java.lang.Integer.valueOf(i))) == null) {
            return null;
        }
        return EZpvd(byteBuffer);
    }

    public static byte[] EZpvd(java.nio.ByteBuffer byteBuffer) {
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset();
        return java.util.Arrays.copyOfRange(bArrArray, byteBuffer.position() + iArrayOffset, iArrayOffset + byteBuffer.limit());
    }

    public static java.util.Map<java.lang.Integer, java.nio.ByteBuffer> OLrzqt(java.io.File file) {
        java.lang.Throwable th;
        java.nio.channels.FileChannel channel;
        java.io.RandomAccessFile randomAccessFile;
        java.util.Map<java.lang.Integer, java.nio.ByteBuffer> mapOLrzqt = null;
        try {
            try {
                randomAccessFile = new java.io.RandomAccessFile(file, "r");
                try {
                    channel = randomAccessFile.getChannel();
                } catch (java.io.IOException unused) {
                    channel = null;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    channel = null;
                }
            } catch (java.io.IOException unused2) {
                channel = null;
                randomAccessFile = null;
            } catch (java.lang.Throwable th3) {
                th = th3;
                channel = null;
                randomAccessFile = null;
            }
            try {
                mapOLrzqt = C8131awu.OLrzqt(C8131awu.AEQbTJ(channel).EZpvd());
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (java.io.IOException unused3) {
                    }
                }
            } catch (java.io.IOException unused4) {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (java.io.IOException unused5) {
                    }
                }
                if (randomAccessFile != null) {
                }
                return mapOLrzqt;
            } catch (java.lang.Throwable th4) {
                th = th4;
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (java.io.IOException unused6) {
                    }
                }
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (java.io.IOException unused7) {
                        throw th;
                    }
                }
                throw th;
            }
            randomAccessFile.close();
        } catch (com.meituan.android.walle.SignatureNotFoundException | java.io.IOException unused8) {
        }
        return mapOLrzqt;
    }
}
