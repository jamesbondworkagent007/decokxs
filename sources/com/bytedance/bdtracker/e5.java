package com.bytedance.bdtracker;

import android.text.TextUtils;
import com.bytedance.applog.log.LoggerImpl;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.security.MessageDigest;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f166a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return b(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            if (bArr.length == 0) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            return b(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String b(byte[] bArr) {
        if (bArr == null) {
            LoggerImpl.global().warn(Collections.singletonList("DigestUtils"), "bytes is null", new Object[0]);
            return null;
        }
        int length = bArr.length;
        if (length > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i = length * 2;
        char[] cArr = new char[i];
        int i2 = 0;
        int i3 = 0;
        while (i3 < length) {
            byte b = bArr[i3];
            char[] cArr2 = f166a;
            cArr[i2] = cArr2[(b & UnsignedBytes.MAX_VALUE) >> 4];
            cArr[i2 + 1] = cArr2[b & Ascii.SI];
            i3++;
            i2 += 2;
        }
        return new String(cArr, 0, i);
    }
}
