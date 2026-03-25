package o;

import android.content.SharedPreferences;
import com.google.common.base.Ascii;
import java.security.MessageDigest;

/* JADX INFO: renamed from: o.mxO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33485mxO {
    public static final char[] KWHzl = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static android.content.SharedPreferences EZpvd(android.content.Context context, java.lang.String str) {
        return context.getSharedPreferences(str, 0);
    }

    public static java.lang.String AEQbTJ(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return EZpvd(context, str).getString(str2, str3);
    }

    public static boolean KWHzl(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        SharedPreferences.Editor editorEdit = EZpvd(context, str).edit();
        editorEdit.putString(str2, str3);
        return editorEdit.commit();
    }

    public static boolean EZpvd(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z) {
        return EZpvd(context, str).getBoolean(str2, z);
    }

    public static boolean OLrzqt(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        SharedPreferences.Editor editorEdit = EZpvd(context, str).edit();
        editorEdit.putBoolean(str2, bool.booleanValue());
        return editorEdit.commit();
    }

    public static int OLrzqt(android.content.Context context, java.lang.String str, java.lang.String str2, int i) {
        return EZpvd(context, str).getInt(str2, i);
    }

    public static boolean EZpvd(android.content.Context context, java.lang.String str, java.lang.String str2, int i) {
        SharedPreferences.Editor editorEdit = EZpvd(context, str).edit();
        editorEdit.putInt(str2, i);
        return editorEdit.commit();
    }

    public static java.lang.String AEQbTJ(java.lang.String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (int i = 0; i < bArrDigest.length; i++) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                char[] cArr = KWHzl;
                sb2.append(cArr[(bArrDigest[i] & 240) >> 4]);
                sb2.append("");
                sb2.append(cArr[bArrDigest[i] & Ascii.SI]);
                sb.append(sb2.toString());
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            pUU.AEQbTJ("tag", e);
            return str;
        }
    }
}
