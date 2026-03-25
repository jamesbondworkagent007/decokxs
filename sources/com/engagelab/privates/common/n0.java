package com.engagelab.privates.common;

import android.text.TextUtils;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.engagelab.privates.common.log.MTCommonLog;
import com.engagelab.privates.core.api.Outputer;

/* JADX INFO: loaded from: classes14.dex */
public class n0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] b(String str) {
        try {
            byte[] bytes = str.getBytes(MTCommonConstants.UTF_8);
            Outputer outputer = new Outputer(bytes.length);
            outputer.writeByteArrayIncludeLength(bytes);
            return outputer.toByteArray();
        } catch (Throwable th) {
            MTCommonLog.w("MTPushProtocol", "packageAliasRequest failed " + th.getMessage());
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static byte[] a(int i, long j, String str) {
        Throwable th;
        byte[] bytes;
        int length;
        byte[] bArr = new byte[0];
        if (TextUtils.isEmpty(str)) {
            bytes = bArr;
            length = 0;
        } else {
            try {
                bytes = str.getBytes(MTCommonConstants.UTF_8);
            } catch (Throwable th2) {
                th = th2;
                bytes = bArr;
            }
            try {
                length = bytes.length;
            } catch (Throwable th3) {
                th = th3;
                MTCommonLog.e("MTPushProtocol", "jData failed " + th.getMessage());
                bArr = bytes;
                bytes = bArr;
                length = 0;
            }
        }
        Outputer outputer = new Outputer(length + 11);
        outputer.writeU16(0);
        outputer.writeU8((byte) i);
        outputer.writeU64(j);
        if (length > 0) {
            outputer.writeByteArrayIncludeLength(bytes);
        }
        return outputer.toByteArray();
    }

    public static byte[] a(byte b, String str, String str2) {
        int length;
        try {
            byte[] bytes = str.getBytes(MTCommonConstants.UTF_8);
            byte[] bytes2 = !TextUtils.isEmpty(str2) ? str2.getBytes(MTCommonConstants.UTF_8) : null;
            if (bytes2 != null && bytes2.length > 0) {
                length = bytes.length + 1 + bytes2.length;
            } else {
                length = bytes.length + 1;
            }
            Outputer outputer = new Outputer(length);
            outputer.writeByteArrayIncludeLength(bytes);
            outputer.writeU8(b);
            if (bytes2 != null && bytes2.length > 0) {
                outputer.writeByteArrayIncludeLength(bytes2);
            }
            return outputer.toByteArray();
        } catch (Throwable th) {
            MTCommonLog.w("MTPushProtocol", "packagePlatformTokenBody failed " + th.getMessage());
            return null;
        }
    }

    public static byte[] a(String str) {
        try {
            byte[] bytes = str.getBytes(MTCommonConstants.UTF_8);
            Outputer outputer = new Outputer(bytes.length + 2);
            outputer.writeU8(7);
            outputer.writeU8(1);
            outputer.writeByteArrayIncludeLength(bytes);
            return outputer.toByteArray();
        } catch (Throwable th) {
            MTCommonLog.w("MTPushProtocol", "packageMobileNumberBody failed " + th.getMessage());
            return null;
        }
    }
}
