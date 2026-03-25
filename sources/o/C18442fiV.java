package o;

import android.security.keystore.KeyGenParameterSpec;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.stats.CodePackage;
import com.google.common.base.Ascii;
import com.okinc.business.defi.wallet.jwt.WalletJwtErrorCode;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import java.security.KeyStore;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.fiV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18442fiV {
    public static final C18442fiV AEQbTJ;
    private static char[] EZpvd;
    public static final int KWHzl;
    public static KeyStore OLrzqt;
    private static long copydefault;
    private static int gEmmrt;
    private static final byte[] $$a = {Ascii.SI, -70, 87, 62};
    private static final int $$b = CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AhwBna = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(byte b, int i, byte b2) {
        int i2;
        int i3 = 114 - b;
        int i4 = i + 4;
        int i5 = b2 * 3;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            int i6 = i4;
            i3 = i5;
            int i7 = 0;
            i3 += i4;
            i4 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            int i8 = i4 + 1;
            i7 = i2 + 1;
            if (i2 == i5) {
                return new java.lang.String(bArr2, 0);
            }
            i6 = i8;
            i4 = bArr[i8];
            i3 += i4;
            i4 = i6;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            int i82 = i4 + 1;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            int i822 = i4 + 1;
            i7 = i2 + 1;
            if (i2 == i5) {
            }
        }
    }

    private C18442fiV() {
    }

    static {
        gEmmrt = 1;
        EZpvd();
        C18442fiV c18442fiV = new C18442fiV();
        AEQbTJ = c18442fiV;
        c18442fiV.KWHzl();
        KWHzl = 8;
        int i = AhwBna + 101;
        gEmmrt = i % 128;
        if (i % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 0, expect 1 */
    public final java.lang.Object KWHzl() {
        java.lang.Object objM7377constructorimpl;
        synchronized (this) {
            try {
                Result.Application application = Result.Companion;
                KeyStore keyStoreCopydefault = C47235tmH.OLrzqt.copydefault();
                if (keyStoreCopydefault != null) {
                    OLrzqt = keyStoreCopydefault;
                    if (!keyStoreCopydefault.containsAlias("okx_wallet_jwt_key")) {
                        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("okx_wallet_jwt_key", 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).setUserAuthenticationRequired(false).build();
                        Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "");
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        a((char) 35719, 0, 15, objArr);
                        javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance(BouncyCastleKeyManagementRepository.AES, ((java.lang.String) objArr[0]).intern());
                        keyGenerator.init(keyGenParameterSpecBuild);
                        keyGenerator.generateKey();
                    }
                }
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } finally {
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("JwtKeystoreUtil", "Create key failed", thM7380exceptionOrNullimpl);
            }
        }
        return objM7377constructorimpl;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        java.lang.String str2;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                Result.Application application = Result.Companion;
                KeyStore keyStore = OLrzqt;
                java.security.Key key = keyStore != null ? keyStore.getKey("okx_wallet_jwt_key", null) : null;
                javax.crypto.SecretKey secretKey = key instanceof javax.crypto.SecretKey ? (javax.crypto.SecretKey) key : null;
                javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(1, secretKey);
                byte[] bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                byte[] bArrDoFinal = cipher.doFinal(bytes);
                byte[] iv = cipher.getIV();
                Intrinsics.copydefault(iv);
                Intrinsics.copydefault(bArrDoFinal);
                objM7377constructorimpl = Result.m7377constructorimpl(android.util.Base64.encodeToString(yDT.copydefault(iv, bArrDoFinal), 0));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                java.lang.String message = thM7380exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "";
                }
                java.lang.Throwable cause = thM7380exceptionOrNullimpl.getCause();
                java.lang.String message2 = cause != null ? cause.getMessage() : null;
                if (message2 == null) {
                    message2 = "";
                }
                C18443fiW.trackWalletJwtError$default(WalletJwtErrorCode.GENERATE_JWT_ERROR, "encrypt failed. [message]" + message + "-[originMessage]" + message2, 0, 4, null);
                pUU.AEQbTJ("JwtKeystoreUtil", "Encrypt failed", thM7380exceptionOrNullimpl);
                objM7377constructorimpl = "";
            }
            str2 = (java.lang.String) objM7377constructorimpl;
        }
        return str2;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.fiW.trackWalletJwtError$default(com.okinc.business.defi.wallet.jwt.WalletJwtErrorCode, java.lang.String, int, int, java.lang.Object):void */
    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        java.lang.String str2;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                Result.Application application = Result.Companion;
                KeyStore keyStore = OLrzqt;
                java.security.Key key = keyStore != null ? keyStore.getKey("okx_wallet_jwt_key", null) : null;
                javax.crypto.SecretKey secretKey = key instanceof javax.crypto.SecretKey ? (javax.crypto.SecretKey) key : null;
                javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
                byte[] bArrDecode = android.util.Base64.decode(str, 0);
                Intrinsics.copydefault(bArrDecode);
                byte[] bArrEZpvd = yDV.EZpvd(bArrDecode, C56548yJl.AhwBna(0, 12));
                byte[] bArrEZpvd2 = yDV.EZpvd(bArrDecode, C56548yJl.AhwBna(12, bArrDecode.length));
                cipher.init(2, secretKey, new javax.crypto.spec.GCMParameterSpec(128, bArrEZpvd));
                byte[] bArrDoFinal = cipher.doFinal(bArrEZpvd2);
                Intrinsics.copydefault(bArrDoFinal);
                objM7377constructorimpl = Result.m7377constructorimpl(new java.lang.String(bArrDoFinal, Charsets.UTF_8));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                java.lang.String message = thM7380exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "";
                }
                java.lang.Throwable cause = thM7380exceptionOrNullimpl.getCause();
                java.lang.String message2 = cause != null ? cause.getMessage() : null;
                if (message2 == null) {
                    message2 = "";
                }
                C18443fiW.trackWalletJwtError$default(WalletJwtErrorCode.GENERATE_JWT_ERROR, "decrypt failed. [message]" + message + "-[originMessage]" + message2, 0, 4, null);
                pUU.AEQbTJ("JwtKeystoreUtil", "Decrypt failed", thM7380exceptionOrNullimpl);
                objM7377constructorimpl = "";
            }
            str2 = (java.lang.String) objM7377constructorimpl;
        }
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [82=5] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(char c, int i, int i2, java.lang.Object[] objArr) throws java.lang.Throwable {
        int i3 = 2 % 2;
        Zn zn = new Zn();
        long[] jArr = new long[i2];
        zn.EZpvd = 0;
        while (zn.EZpvd < i2) {
            int i4 = $10 + 59;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = zn.EZpvd;
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(EZpvd[i >> i5])};
                    java.lang.Object objEZpvd = YY.EZpvd(927695670);
                    if (objEZpvd == null) {
                        byte b = (byte) 2;
                        byte b2 = (byte) (b - 3);
                        objEZpvd = YY.EZpvd(217, 4, (char) 0, 862670410, false, $$c(b, b2, (byte) (b2 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    java.lang.Object[] objArr3 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).longValue()), java.lang.Long.valueOf(i5), java.lang.Long.valueOf(copydefault), java.lang.Integer.valueOf(c)};
                    java.lang.Object objEZpvd2 = YY.EZpvd(-297691357);
                    if (objEZpvd2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objEZpvd2 = YY.EZpvd(TypedValues.CycleType.TYPE_WAVE_PERIOD, 5, (char) 0, -362718625, false, $$c(b3, b4, (byte) (b4 + 1)), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                    }
                    jArr[i5] = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).longValue();
                    java.lang.Object[] objArr4 = {zn, zn};
                    java.lang.Object objEZpvd3 = YY.EZpvd(1191971121);
                    if (objEZpvd3 == null) {
                        byte b5 = (byte) ($$b & 7);
                        byte b6 = (byte) (-b5);
                        objEZpvd3 = YY.EZpvd(226, 4, (char) 0, 1127007309, false, $$c(b5, b6, (byte) (b6 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                    }
                    ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = zn.EZpvd;
                try {
                    java.lang.Object[] objArr5 = {java.lang.Integer.valueOf(EZpvd[i + i6])};
                    java.lang.Object objEZpvd4 = YY.EZpvd(927695670);
                    if (objEZpvd4 == null) {
                        byte b7 = (byte) 2;
                        byte b8 = (byte) (b7 - 3);
                        objEZpvd4 = YY.EZpvd(217, 4, (char) 0, 862670410, false, $$c(b7, b8, (byte) (b8 + 1)), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    try {
                        java.lang.Object[] objArr6 = {java.lang.Long.valueOf(((java.lang.Long) ((java.lang.reflect.Method) objEZpvd4).invoke(null, objArr5)).longValue()), java.lang.Long.valueOf(i6), java.lang.Long.valueOf(copydefault), java.lang.Integer.valueOf(c)};
                        java.lang.Object objEZpvd5 = YY.EZpvd(-297691357);
                        if (objEZpvd5 == null) {
                            byte b9 = (byte) 0;
                            byte b10 = (byte) (b9 - 1);
                            objEZpvd5 = YY.EZpvd(TypedValues.CycleType.TYPE_WAVE_PERIOD, 5, (char) 0, -362718625, false, $$c(b9, b10, (byte) (b10 + 1)), new java.lang.Class[]{java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Long.TYPE, java.lang.Integer.TYPE});
                        }
                        jArr[i6] = ((java.lang.Long) ((java.lang.reflect.Method) objEZpvd5).invoke(null, objArr6)).longValue();
                        try {
                            java.lang.Object[] objArr7 = {zn, zn};
                            java.lang.Object objEZpvd6 = YY.EZpvd(1191971121);
                            if (objEZpvd6 == null) {
                                byte b11 = (byte) ($$b & 7);
                                byte b12 = (byte) (-b11);
                                objEZpvd6 = YY.EZpvd(226, 4, (char) 0, 1127007309, false, $$c(b11, b12, (byte) (b12 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                            }
                            ((java.lang.reflect.Method) objEZpvd6).invoke(null, objArr7);
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (java.lang.Throwable th4) {
                    java.lang.Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        }
        char[] cArr = new char[i2];
        zn.EZpvd = 0;
        while (zn.EZpvd < i2) {
            int i7 = $10 + 45;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[zn.EZpvd] = (char) jArr[zn.EZpvd];
            java.lang.Object[] objArr8 = {zn, zn};
            java.lang.Object objEZpvd7 = YY.EZpvd(1191971121);
            if (objEZpvd7 == null) {
                byte b13 = (byte) ($$b & 7);
                byte b14 = (byte) (-b13);
                objEZpvd7 = YY.EZpvd(226, 4, (char) 0, 1127007309, false, $$c(b13, b14, (byte) (b14 + 1)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) objEZpvd7).invoke(null, objArr8);
            int i9 = $10 + 119;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void EZpvd() {
        EZpvd = new char[]{34624, 12023, 54357, 31675, 8462, 51344, 32501, 9314, 52132, 28960, 6306, 52989, 29774, 7115, 49460};
        copydefault = 4051960452723746078L;
    }
}
