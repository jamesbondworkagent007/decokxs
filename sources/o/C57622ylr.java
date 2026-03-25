package o;

import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ylr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C57622ylr {
    public static final C57622ylr EZpvd = new C57622ylr();

    private C57622ylr() {
    }

    public final java.lang.String KWHzl(int i) {
        byte[] bArr = new byte[i];
        new java.security.SecureRandom().nextBytes(bArr);
        java.lang.String strEncodeToString = android.util.Base64.encodeToString(bArr, 2);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        return strEncodeToString;
    }

    public final java.lang.String EZpvd(java.lang.String str) throws java.security.NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        java.nio.charset.Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(charset, "");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.copydefault(bArrDigest);
        return EZpvd(bArrDigest);
    }

    public final java.lang.String EZpvd(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (byte b : bArr) {
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            java.lang.String str = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "");
            sb.append(str);
        }
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final Activity copydefault(@NotNull java.lang.String str) throws java.security.NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strEZpvd = EZpvd(str + "0C247A3E");
        java.lang.String strSubstring = strEZpvd.substring(0, 16);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        java.lang.String strSubstring2 = strEZpvd.substring(strEZpvd.length() - 16);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
        return new Activity(strSubstring, strSubstring2);
    }

    public final byte[] copydefault(byte[] bArr, @NotNull java.lang.String str, @NotNull java.lang.String str2) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.nio.charset.Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bytes, BouncyCastleKeyManagementRepository.AES);
        byte[] bytes2 = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bytes2);
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, ivParameterSpec);
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "");
        return bArrDoFinal;
    }

    /* JADX INFO: renamed from: o.ylr$Activity */
    public static final class Activity {
        public final java.lang.String EZpvd;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = str;
            this.EZpvd = str2;
        }
    }
}
