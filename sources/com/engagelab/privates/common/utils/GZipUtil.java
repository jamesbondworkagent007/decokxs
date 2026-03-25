package com.engagelab.privates.common.utils;

import com.engagelab.privates.common.log.MTCommonLog;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes14.dex */
public class GZipUtil {
    private static final String TAG = "GZipUtil";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                MTCommonLog.w(TAG, "closeQuietly failed " + th.getMessage());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] unzip(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        try {
            byte[] bArr2 = new byte[256];
            while (true) {
                int i = gZIPInputStream.read(bArr2);
                if (i < 0) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr2, 0, i);
            }
        } catch (Throwable th) {
            try {
                MTCommonLog.w(TAG, "unzip failed " + th.getMessage());
                closeQuietly(byteArrayOutputStream);
                closeQuietly(byteArrayInputStream);
                closeQuietly(gZIPInputStream);
                return null;
            } finally {
                closeQuietly(byteArrayOutputStream);
                closeQuietly(byteArrayInputStream);
                closeQuietly(gZIPInputStream);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] zip(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                MTCommonLog.w(TAG, "zip failed " + th.getMessage());
                closeQuietly(byteArrayOutputStream);
                closeQuietly(gZIPOutputStream);
                return null;
            } finally {
                closeQuietly(byteArrayOutputStream);
                closeQuietly(gZIPOutputStream);
            }
        }
    }
}
