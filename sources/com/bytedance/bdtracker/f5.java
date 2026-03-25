package com.bytedance.bdtracker;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.applog.IAppLogInstance;
import com.bytedance.applog.InitConfig;
import com.bytedance.applog.encryptor.EncryptorUtil;
import com.bytedance.applog.encryptor.IEncryptorType;
import com.google.android.exoplayer2.C;
import com.google.common.primitives.UnsignedBytes;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f5 {
    public static final String[] b = {"tt_data", "device_platform"};
    public static final String[] c = {"aid", "version_code", "ab_version", "iid", "device_platform"};
    public static final String[] d = {"aid", "app_version", "tt_data", "device_id"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f176a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public f5(d dVar) {
        this.f176a = dVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; bArr != null && i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i] & UnsignedBytes.MAX_VALUE);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void a(IAppLogInstance iAppLogInstance, JSONObject jSONObject) {
        String[] strArrA;
        boolean encryptAndCompress = iAppLogInstance.getEncryptAndCompress();
        InitConfig initConfig = iAppLogInstance.getInitConfig();
        boolean zIsResponseEncryptEnabled = initConfig != null ? initConfig.isResponseEncryptEnabled() : true;
        if (encryptAndCompress && zIsResponseEncryptEnabled && (strArrA = a()) != null) {
            try {
                jSONObject.put(JwtUtilsKt.DID_METHOD_KEY, strArrA[0]);
                jSONObject.put("iv", strArrA[1]);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] a(byte[] bArr, String str, String str2) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            int length = str.length();
            byte[] bArr2 = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr2[i] = (byte) str.charAt(i);
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, BouncyCastleKeyManagementRepository.AES);
            int length2 = str2.length();
            byte[] bArr3 = new byte[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                bArr3[i2] = (byte) str2.charAt(i2);
            }
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String[] a() {
        String[] strArr = new String[2];
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(BouncyCastleKeyManagementRepository.AES);
            SecureRandom secureRandom = new SecureRandom();
            keyGenerator.init(128, secureRandom);
            strArr[0] = a(keyGenerator.generateKey().getEncoded());
            byte[] bArr = new byte[8];
            secureRandom.nextBytes(bArr);
            strArr[1] = a(bArr);
            if (TextUtils.isEmpty(strArr[0]) || strArr[0].length() != 32 || TextUtils.isEmpty(strArr[1])) {
                return null;
            }
            if (strArr[1].length() == 16) {
                return strArr;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte[] b(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream = null;
        try {
            if (this.f176a.E) {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(str.getBytes(C.UTF8_NAME));
                    gZIPOutputStream = gZIPOutputStream2;
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    try {
                        this.f176a.D.error(Collections.singletonList("EncryptUtils"), "Convert string to bytes failed", th, new Object[0]);
                        this.f176a.b().a(th, "transformStrToByte");
                    } finally {
                        r.a((Closeable) gZIPOutputStream);
                    }
                }
            } else {
                byteArrayOutputStream.write(str.getBytes(C.UTF8_NAME));
            }
        } catch (Throwable th2) {
            th = th2;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return this.f176a.E ? (this.f176a.getInitConfig() == null || this.f176a.getInitConfig().getEncryptor() == null) ? EncryptorUtil.encrypt(byteArray, byteArray.length) : this.f176a.getInitConfig().getEncryptor().encrypt(byteArray, byteArray.length) : byteArray;
    }

    public String a(String str) {
        if (TextUtils.isEmpty(str) || !this.f176a.E) {
            return str;
        }
        Uri uri = Uri.parse(str);
        String encodedQuery = uri.getEncodedQuery();
        ArrayList<Pair> arrayList = new ArrayList();
        for (String str2 : d) {
            String queryParameter = uri.getQueryParameter(str2);
            if (!TextUtils.isEmpty(queryParameter)) {
                arrayList.add(new Pair(str2, queryParameter));
            }
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (Pair pair : arrayList) {
            builderBuildUpon.appendQueryParameter((String) pair.first, (String) pair.second);
        }
        builderBuildUpon.appendQueryParameter("tt_info", new String(Base64.encode(b(encodedQuery), 8)));
        return builderBuildUpon.build().toString();
    }

    public static HashMap<String, String> a(HashMap<String, String> map, d dVar) {
        String str;
        String strEncryptorType = (dVar.getInitConfig() == null || dVar.getInitConfig().getEncryptor() == null || !(dVar.getInitConfig().getEncryptor() instanceof a0)) ? IEncryptorType.DEFAULT_ENCRYPTOR : ((a0) dVar.getInitConfig().getEncryptor()).encryptorType();
        if (dVar.E) {
            str = "application/octet-stream;tt-data=" + strEncryptorType;
        } else {
            str = EIP1271Verifier.mediaTypeString;
        }
        map.put("Content-Type", str);
        return map;
    }
}
