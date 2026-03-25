package com.amplifyframework.auth.cognito.data;

import android.security.keystore.KeyGenParameterSpec;
import com.amplifyframework.statemachine.codegen.errors.CredentialStoreError;
import com.google.android.gms.stats.CodePackage;
import java.lang.reflect.Method;
import java.security.Key;
import java.security.KeyStore;
import javax.crypto.KeyGenerator;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.YY;
import o.Zi;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes2.dex */
public final class LegacyKeyProvider {
    private static long AEQbTJ = 0;
    private static final String AES_KEY_ALGORITHM = "AES";
    private static final String ANDROID_KEY_STORE_NAME = "AndroidKeyStore";
    private static final int CIPHER_AES_GCM_NOPADDING_KEY_LENGTH_IN_BITS = 256;
    public static final LegacyKeyProvider INSTANCE;
    private static int OLrzqt;
    private static final byte[] $$a = {1, -34, -12, 123};
    private static final int $$b = CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 0;
    private static int EZpvd = 1;
    private static int KWHzl = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(int i, int i2, short s) {
        int i3;
        int i4 = 4 - (s * 4);
        int i5 = (i * 2) + 98;
        int i6 = i2 * 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6 + 1];
        if (bArr == null) {
            int i7 = i6;
            int i8 = i4;
            int i9 = 0;
            i4++;
            i5 = i8 + i7;
            i3 = i9;
            int i10 = i4;
            int i11 = i5;
            bArr2[i3] = (byte) i11;
            i9 = i3 + 1;
            if (i3 == i6) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i10];
            i4 = i10;
            i8 = i11;
            i4++;
            i5 = i8 + i7;
            i3 = i9;
            int i102 = i4;
            int i112 = i5;
            bArr2[i3] = (byte) i112;
            i9 = i3 + 1;
            if (i3 == i6) {
            }
        } else {
            i3 = 0;
            int i1022 = i4;
            int i1122 = i5;
            bArr2[i3] = (byte) i1122;
            i9 = i3 + 1;
            if (i3 == i6) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        OLrzqt = 1;
        AEQbTJ();
        INSTANCE = new LegacyKeyProvider();
        int i = KWHzl + 75;
        OLrzqt = i % 128;
        if (i % 2 == 0) {
            int i2 = 54 / 0;
        }
    }

    private LegacyKeyProvider() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: generateKey-IoAF18A, reason: not valid java name */
    public final Object m5952generateKeyIoAF18A(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        EZpvd = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr = new Object[1];
        a(new char[]{39949, 9939, 59850, 44269, 30695, 14992, 64910, 32912, 19361, 3660, 53621, 37987, 24431, 57859, 42247}, 47857, objArr);
        KeyStore keyStore = KeyStore.getInstance(((String) objArr[0]).intern());
        Object obj = null;
        keyStore.load(null);
        if (!keyStore.containsAlias(str)) {
            KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(str, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).setRandomizedEncryptionRequired(false).build();
            Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "");
            Object[] objArr2 = new Object[1];
            a(new char[]{39949, 9939, 59850, 44269, 30695, 14992, 64910, 32912, 19361, 3660, 53621, 37987, 24431, 57859, 42247}, 47857, objArr2);
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", ((String) objArr2[0]).intern());
            keyGenerator.init(keyGenParameterSpecBuild);
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(keyGenerator.generateKey());
        }
        Result.Application application2 = Result.Companion;
        Object objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(new CredentialStoreError("Key already exists for the keyAlias: " + str + " in AndroidKeyStore", null, 2, null)));
        int i4 = EZpvd + 35;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return objM7377constructorimpl;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: retrieveKey-IoAF18A, reason: not valid java name */
    public final Object m5953retrieveKeyIoAF18A(@NotNull String str) throws Throwable {
        Object objM7377constructorimpl;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr = new Object[1];
        a(new char[]{39949, 9939, 59850, 44269, 30695, 14992, 64910, 32912, 19361, 3660, 53621, 37987, 24431, 57859, 42247}, 47857, objArr);
        KeyStore keyStore = KeyStore.getInstance(((String) objArr[0]).intern());
        keyStore.load(null);
        if (!keyStore.containsAlias(str)) {
            String str2 = "Key does not exists for the keyAlias: " + str + " in AndroidKeyStore";
            Result.Application application = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(new CredentialStoreError(str2, null, 2, null)));
        }
        Key key = keyStore.getKey(str, null);
        if (key != null) {
            int i2 = EZpvd + 79;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(key);
            int i4 = copydefault + 45;
            EZpvd = i4 % 128;
            int i5 = i4 % 2;
        } else {
            Result.Application application3 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(new CredentialStoreError("Key is null even though the keyAlias: " + str + " is present in AndroidKeyStore", null, 2, null)));
        }
        int i6 = copydefault + 97;
        EZpvd = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 33 / 0;
        }
        return objM7377constructorimpl;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        Zi zi = new Zi();
        zi.OLrzqt = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        zi.AEQbTJ = 0;
        while (zi.AEQbTJ < cArr.length) {
            int i3 = $10 + 117;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = zi.AEQbTJ;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[zi.AEQbTJ]), zi, zi};
                Object objEZpvd = YY.EZpvd(-295504478);
                if (objEZpvd == null) {
                    byte b = $$a[0];
                    byte b2 = (byte) (b - 1);
                    objEZpvd = YY.EZpvd(217, 4, (char) 0, -364758818, false, $$c(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objEZpvd).invoke(null, objArr2)).longValue() ^ (AEQbTJ ^ 5439468278228498061L);
                Object[] objArr3 = {zi, zi};
                Object objEZpvd2 = YY.EZpvd(1444313200);
                if (objEZpvd2 == null) {
                    byte b3 = (byte) ($$a[0] - 1);
                    byte b4 = b3;
                    objEZpvd2 = YY.EZpvd(615, 5, (char) 1207, 1379317004, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objEZpvd2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        zi.AEQbTJ = 0;
        while (zi.AEQbTJ < cArr.length) {
            cArr2[zi.AEQbTJ] = (char) jArr[zi.AEQbTJ];
            try {
                Object[] objArr4 = {zi, zi};
                Object objEZpvd3 = YY.EZpvd(1444313200);
                if (objEZpvd3 == null) {
                    byte b5 = (byte) ($$a[0] - 1);
                    byte b6 = b5;
                    objEZpvd3 = YY.EZpvd(615, 5, (char) 1207, 1379317004, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objEZpvd3).invoke(null, objArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        String str = new String(cArr2);
        int i6 = $11 + 119;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i7 = 77 / 0;
            objArr[0] = str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void deleteKey(@NotNull String str) throws Throwable {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        EZpvd = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Object[] objArr = new Object[1];
            a(new char[]{39949, 9939, 59850, 44269, 30695, 14992, 64910, 32912, 19361, 3660, 53621, 37987, 24431, 57859, 42247}, 47857, objArr);
            KeyStore keyStore = KeyStore.getInstance(((String) objArr[0]).intern());
            keyStore.load(null);
            keyStore.deleteEntry(str);
            return;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArr2 = new Object[1];
        a(new char[]{39949, 9939, 59850, 44269, 30695, 14992, 64910, 32912, 19361, 3660, 53621, 37987, 24431, 57859, 42247}, 47857, objArr2);
        KeyStore keyStore2 = KeyStore.getInstance(((String) objArr2[0]).intern());
        keyStore2.load(null);
        keyStore2.deleteEntry(str);
        obj.hashCode();
        throw null;
    }

    static void AEQbTJ() {
        AEQbTJ = -531940339629872447L;
    }
}
