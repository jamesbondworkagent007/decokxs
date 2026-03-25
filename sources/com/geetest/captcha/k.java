package com.geetest.captcha;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.base.Ascii;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes17.dex */
public final class k {
    public static void a(Context context, long j) {
        try {
            context.getSharedPreferences("gt_fp", 0).edit().putLong("gt_ts", j).apply();
        } catch (Exception unused) {
        }
    }

    public static String a(Context context, String str) {
        String string;
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bArrDigest.length; i++) {
                char[] cArr = s.f373a;
                sb.append(cArr[(bArrDigest[i] >> 4) & 15]);
                sb.append(cArr[bArrDigest[i] & Ascii.SI]);
            }
            string = sb.toString();
        } catch (Exception unused) {
            string = null;
        }
        if (TextUtils.isEmpty(string) || "$unknown".equals(string)) {
            return null;
        }
        try {
            context.getSharedPreferences("gt_fp", 0).edit().putString("gt_fp", string).apply();
        } catch (Exception unused2) {
        }
        return string;
    }
}
