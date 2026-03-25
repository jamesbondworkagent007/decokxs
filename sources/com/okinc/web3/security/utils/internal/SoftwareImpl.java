package com.okinc.web3.security.utils.internal;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.web3.security.bridge.Web3SecurityBridge;
import com.okinc.web3.security.utils.RetryConfig;
import com.okinc.web3.security.utils.RetryUtils;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C56390yDp;
import o.C56402yEa;
import o.C56424yEw;
import o.YY;
import o.Zi;
import o.pUU;
import o.yDT;
import o.yDY;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes12.dex */
public final class SoftwareImpl implements WrapUtilsBase {
    public static final int $stable;
    private static final Companion Companion;
    private static final String ECC_ALIAS = "ecdh_alias";
    private static final String EC_CURVE = "secp256r1";
    private static final List<String> EC_CURVE_NAMES;
    private static long EZpvd = 0;
    private static int OLrzqt = 0;
    private static final String TAG = "SoftwareImpl";
    private static final String sharedMessage = "wallet-core-ecdh-aes";
    private static final AtomicReference<SecretKey> softwareKeyCache;
    private static final byte[] $$a = {84, -105, -74, -16};
    private static final int $$b = CipherSuite.TLS_DHE_DSS_WITH_SEED_CBC_SHA;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AEQbTJ = 1;
    private static int copydefault = 0;
    private static int KWHzl = 1;
    private final AtomicReference<byte[]> wrappedSecretCache = new AtomicReference<>(null);
    private final Object mSecretCacheLock = new Object();

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, short s) {
        int i2;
        int i3;
        int i4 = b * 2;
        int i5 = (s * 4) + 4;
        byte[] bArr = $$a;
        int i6 = 100 - (i * 2);
        byte[] bArr2 = new byte[1 - i4];
        int i7 = 0 - i4;
        if (bArr == null) {
            int i8 = i7;
            i3 = i5;
            int i9 = 0;
            i5 += -i8;
            i3++;
            i2 = i9;
            bArr2[i2] = (byte) i5;
            i9 = i2 + 1;
            if (i2 == i7) {
                return new String(bArr2, 0);
            }
            i8 = bArr[i3];
            i5 += -i8;
            i3++;
            i2 = i9;
            bArr2[i2] = (byte) i5;
            i9 = i2 + 1;
            if (i2 == i7) {
            }
        } else {
            i2 = 0;
            i5 = i6;
            i3 = i5;
            bArr2[i2] = (byte) i5;
            i9 = i2 + 1;
            if (i2 == i7) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ boolean $r8$lambda$2fgTSq0iq1m9p440UeF_neNcUbo(Exception exc) {
        int i = 2 % 2;
        int i2 = copydefault + 71;
        KWHzl = i2 % 128;
        int i3 = i2 % 2;
        boolean zDeriveAndWrapSharedSecret$lambda$17 = deriveAndWrapSharedSecret$lambda$17(exc);
        if (i3 == 0) {
            int i4 = 95 / 0;
        }
        int i5 = copydefault + 53;
        KWHzl = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return zDeriveAndWrapSharedSecret$lambda$17;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: $r8$lambda$ORcOIwvXfV6keM-Cif-8zkRTlc8, reason: not valid java name */
    public static /* synthetic */ boolean m7168$r8$lambda$ORcOIwvXfV6keMCif8zkRTlc8(Exception exc) {
        int i = 2 % 2;
        int i2 = KWHzl + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zCreateSoftwareKeyPair$lambda$13 = createSoftwareKeyPair$lambda$13(exc);
        int i4 = KWHzl + 107;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return zCreateSoftwareKeyPair$lambda$13;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: $r8$lambda$RHxRVDYM5f1vNzn-OEYHBkZWY8I, reason: not valid java name */
    public static /* synthetic */ byte[] m7169$r8$lambda$RHxRVDYM5f1vNznOEYHBkZWY8I(SoftwareImpl softwareImpl, KeyPair keyPair) {
        int i = 2 % 2;
        int i2 = KWHzl + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            deriveAndWrapSharedSecret$lambda$16(softwareImpl, keyPair);
            throw null;
        }
        byte[] bArrDeriveAndWrapSharedSecret$lambda$16 = deriveAndWrapSharedSecret$lambda$16(softwareImpl, keyPair);
        int i3 = copydefault + 23;
        KWHzl = i3 % 128;
        if (i3 % 2 != 0) {
            return bArrDeriveAndWrapSharedSecret$lambda$16;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KeyPair $r8$lambda$rLIyPI2xOljKEQYRPCPyPT6HDHA(SoftwareImpl softwareImpl) throws InvalidAlgorithmParameterException {
        int i = 2 % 2;
        int i2 = KWHzl + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        KeyPair keyPairCreateSoftwareKeyPair$lambda$12 = createSoftwareKeyPair$lambda$12(softwareImpl);
        int i4 = copydefault + 53;
        KWHzl = i4 % 128;
        if (i4 % 2 != 0) {
            return keyPairCreateSoftwareKeyPair$lambda$12;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.web3.security.utils.internal.WrapUtilsBase
    public boolean isHardwareBacked() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        int i3 = i2 % 128;
        KWHzl = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 103;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 20 / 0;
        }
        return false;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.utils.internal.SoftwareImpl.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    static {
        OLrzqt = 0;
        EZpvd();
        DefaultConstructorMarker defaultConstructorMarker = null;
        Companion = new Companion(defaultConstructorMarker);
        $stable = 8;
        EC_CURVE_NAMES = yDY.gEmmrt(EC_CURVE, "P-256", "prime256v1");
        softwareKeyCache = new AtomicReference<>(null);
        int i = AEQbTJ + 89;
        OLrzqt = i % 128;
        if (i % 2 == 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public static final class ECCProviderConfig {
        private final String curveName;
        private final String providerName;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ECCProviderConfig copy$default(ECCProviderConfig eCCProviderConfig, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eCCProviderConfig.providerName;
            }
            if ((i & 2) != 0) {
                str2 = eCCProviderConfig.curveName;
            }
            return eCCProviderConfig.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.providerName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.curveName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ECCProviderConfig copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new ECCProviderConfig(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ECCProviderConfig)) {
                return false;
            }
            ECCProviderConfig eCCProviderConfig = (ECCProviderConfig) obj;
            return Intrinsics.EZpvd((Object) this.providerName, (Object) eCCProviderConfig.providerName) && Intrinsics.EZpvd((Object) this.curveName, (Object) eCCProviderConfig.curveName);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCurveName() {
            return this.curveName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getProviderName() {
            return this.providerName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.providerName.hashCode() * 31) + this.curveName.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ECCProviderConfig(providerName=" + this.providerName + ", curveName=" + this.curveName + ")";
        }

        public ECCProviderConfig(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.providerName = str;
            this.curveName = str2;
        }
    }

    @Override // com.okinc.web3.security.utils.internal.WrapUtilsBase
    public SupportLevel getSupportLevel() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        KWHzl = i2 % 128;
        int i3 = i2 % 2;
        SupportLevel supportLevel = SupportLevel.SOFTWARE_ONLY;
        int i4 = copydefault + 41;
        KWHzl = i4 % 128;
        if (i4 % 2 != 0) {
            return supportLevel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.okinc.web3.security.utils.internal.WrapUtilsBase
    public void init() {
        int i = 2 % 2;
        pUU.KWHzl(TAG, "SoftwareImpl init start[" + Thread.currentThread().getName() + "]");
        retrieveWrappedSecretCache();
        pUU.KWHzl(TAG, "SoftwareImpl init end[" + Thread.currentThread().getName() + "] - supportLevel: " + getSupportLevel());
        int i2 = KWHzl + 85;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [73=4] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        Zi zi = new Zi();
        zi.OLrzqt = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        zi.AEQbTJ = 0;
        while (zi.AEQbTJ < cArr.length) {
            int i3 = $10 + 125;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = zi.AEQbTJ;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[zi.AEQbTJ]), zi, zi};
                    Object objEZpvd = YY.EZpvd(-295504478);
                    if (objEZpvd == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objEZpvd = YY.EZpvd(217, 4, (char) 0, -364758818, false, $$c(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objEZpvd).invoke(null, objArr2)).longValue() % (EZpvd + 5439468278228498061L);
                    Object[] objArr3 = {zi, zi};
                    Object objEZpvd2 = YY.EZpvd(1444313200);
                    if (objEZpvd2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 1);
                        objEZpvd2 = YY.EZpvd(615, 5, (char) 1207, 1379317004, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objEZpvd2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = zi.AEQbTJ;
                Object[] objArr4 = {Integer.valueOf(cArr[zi.AEQbTJ]), zi, zi};
                Object objEZpvd3 = YY.EZpvd(-295504478);
                if (objEZpvd3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objEZpvd3 = YY.EZpvd(217, 4, (char) 0, -364758818, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objEZpvd3).invoke(null, objArr4)).longValue() ^ (5439468278228498061L ^ EZpvd);
                Object[] objArr5 = {zi, zi};
                Object objEZpvd4 = YY.EZpvd(1444313200);
                if (objEZpvd4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 1);
                    objEZpvd4 = YY.EZpvd(615, 5, (char) 1207, 1379317004, false, $$c(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objEZpvd4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        zi.AEQbTJ = 0;
        while (zi.AEQbTJ < cArr.length) {
            int i6 = $10 + 121;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[zi.AEQbTJ] = (char) jArr[zi.AEQbTJ];
                Object[] objArr6 = {zi, zi};
                Object objEZpvd5 = YY.EZpvd(1444313200);
                if (objEZpvd5 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = (byte) (b9 + 1);
                    objEZpvd5 = YY.EZpvd(615, 5, (char) 1207, 1379317004, false, $$c(b9, b10, (byte) (b10 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objEZpvd5).invoke(null, objArr6);
                throw null;
            }
            cArr2[zi.AEQbTJ] = (char) jArr[zi.AEQbTJ];
            Object[] objArr7 = {zi, zi};
            Object objEZpvd6 = YY.EZpvd(1444313200);
            if (objEZpvd6 == null) {
                byte b11 = (byte) 0;
                byte b12 = (byte) (b11 + 1);
                objEZpvd6 = YY.EZpvd(615, 5, (char) 1207, 1379317004, false, $$c(b11, b12, (byte) (b12 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objEZpvd6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.web3.security.utils.internal.WrapUtilsBase
    public byte[] wrap(@NotNull byte[] bArr) throws Exception {
        String str = "";
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        try {
            byte[] bArrWrapDirect = wrapDirect(bArr);
            int i2 = KWHzl + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return bArrWrapDirect;
        } catch (Exception e) {
            WrapUtilsImpl wrapUtilsImpl = WrapUtilsImpl.INSTANCE;
            String message = e.getMessage();
            if (message == null) {
                int i4 = KWHzl + 101;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 4 / 5;
                }
            } else {
                str = message;
            }
            wrapUtilsImpl.monitorCallError("wrap (Software)", str);
            throw e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r2.isCallerCheckHitGray() == false) goto L20;
     */
    @Override // com.okinc.web3.security.utils.internal.WrapUtilsBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] unwrap(@NotNull byte[] bArr) throws Exception {
        int i = 2 % 2;
        int i2 = KWHzl + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(bArr, "");
        try {
            WrapUtilsImpl wrapUtilsImpl = WrapUtilsImpl.INSTANCE;
            if (!wrapUtilsImpl.isAuthorizedUnwrapCaller()) {
                int i4 = KWHzl + 35;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    wrapUtilsImpl.monitorSecurityAttack("Unauthorized access attempt to unwrap method (Software)", wrapUtilsImpl.getSecureStackTrace());
                    if (!wrapUtilsImpl.isCallerCheckHitGray()) {
                    }
                    throw new SecurityException("Unauthorized caller for unwrap operation (Software)");
                }
                wrapUtilsImpl.monitorSecurityAttack("Unauthorized access attempt to unwrap method (Software)", wrapUtilsImpl.getSecureStackTrace());
                int i5 = 16 / 0;
            }
            return unwrapDirect(bArr);
        } catch (Exception e) {
            WrapUtilsImpl wrapUtilsImpl2 = WrapUtilsImpl.INSTANCE;
            String message = e.getMessage();
            if (message == null) {
                int i6 = copydefault + 21;
                KWHzl = i6 % 128;
                if (i6 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            } else {
                str = message;
            }
            wrapUtilsImpl2.monitorCallError("unwrap (Software)", str);
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final byte[] wrapDirect(byte[] bArr) throws Throwable {
        byte[] cachesAtomically;
        int i = 2 % 2;
        int i2 = copydefault + 5;
        KWHzl = i2 % 128;
        if (i2 % 2 == 0) {
            cachesAtomically = readCachesAtomically();
            int i3 = 92 / 0;
            if (cachesAtomically == null) {
                int i4 = copydefault + 5;
                KWHzl = i4 % 128;
                int i5 = i4 % 2;
                cachesAtomically = retrieveWrappedSecretCache();
            }
        } else {
            cachesAtomically = readCachesAtomically();
            if (cachesAtomically == null) {
            }
        }
        byte[] bArrUnwrapSecret = unwrapSecret(cachesAtomically);
        try {
            CryptoUtilities cryptoUtilities = CryptoUtilities.INSTANCE;
            byte[] bArrEncryptAESGCM = cryptoUtilities.encryptAESGCM(bArr, cryptoUtilities.createAESKey(bArrUnwrapSecret));
            cryptoUtilities.secureCleanup(bArrUnwrapSecret);
            return bArrEncryptAESGCM;
        } catch (Throwable th) {
            CryptoUtilities.INSTANCE.secureCleanup(bArrUnwrapSecret);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [141=4] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final byte[] unwrapDirect(byte[] bArr) throws Throwable {
        int i = 2 % 2;
        int i2 = KWHzl + 95;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
            if (!isCalledFromUnwrap()) {
                WrapUtilsImpl wrapUtilsImpl = WrapUtilsImpl.INSTANCE;
                wrapUtilsImpl.monitorSecurityAttack("Direct unauthorized access attempt to unwrapDirect method (Software)", wrapUtilsImpl.getSecureStackTrace());
                if (wrapUtilsImpl.isCallerCheckHitGray()) {
                    throw new SecurityException("unwrapDirect can only be called from unwrap method (Software)");
                }
            }
        } else if (!isCalledFromUnwrap()) {
        }
        byte[] cachesAtomically = readCachesAtomically();
        if (cachesAtomically == null) {
            int i4 = copydefault + 41;
            KWHzl = i4 % 128;
            if (i4 % 2 == 0) {
                retrieveWrappedSecretCache();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            cachesAtomically = retrieveWrappedSecretCache();
            int i5 = KWHzl + 61;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 4;
            }
        }
        byte[] bArrUnwrapSecret = unwrapSecret(cachesAtomically);
        try {
            CryptoUtilities cryptoUtilities = CryptoUtilities.INSTANCE;
            byte[] bArrDecryptAESGCM = cryptoUtilities.decryptAESGCM(bArr, cryptoUtilities.createAESKey(bArrUnwrapSecret));
            cryptoUtilities.secureCleanup(bArrUnwrapSecret);
            return bArrDecryptAESGCM;
        } catch (Throwable th) {
            CryptoUtilities.INSTANCE.secureCleanup(bArrUnwrapSecret);
            throw th;
        }
    }

    private final SecretKey getOrCreateAesKey() throws Exception {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        KWHzl = i2 % 128;
        int i3 = i2 % 2;
        try {
            SecretKey orCreateAesKeyDirect = getOrCreateAesKeyDirect();
            int i4 = KWHzl + 57;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return orCreateAesKeyDirect;
            }
            throw null;
        } catch (Exception e) {
            WrapUtilsImpl wrapUtilsImpl = WrapUtilsImpl.INSTANCE;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            wrapUtilsImpl.monitorCallError("getOrCreateAesKey", message);
            throw e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final SecretKey getOrCreateAesKeyDirect() throws NoSuchAlgorithmException {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        KWHzl = i2 % 128;
        int i3 = i2 % 2;
        AtomicReference<SecretKey> atomicReference = softwareKeyCache;
        SecretKey secretKeyGenerateKey = atomicReference.get();
        if (secretKeyGenerateKey == null) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(BouncyCastleKeyManagementRepository.AES);
            keyGenerator.init(256, new SecureRandom());
            secretKeyGenerateKey = keyGenerator.generateKey();
            if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, secretKeyGenerateKey)) {
                int i4 = KWHzl + 37;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                pUU.EZpvd(TAG, "Created new static software AES key");
                int i6 = copydefault + 11;
                KWHzl = i6 % 128;
                int i7 = i6 % 2;
            } else {
                pUU.EZpvd(TAG, "Using software AES key created by another thread");
                SecretKey secretKey = atomicReference.get();
                Intrinsics.copydefault(secretKey);
                secretKeyGenerateKey = secretKey;
            }
            Intrinsics.checkNotNullExpressionValue(secretKeyGenerateKey, "");
        }
        return secretKeyGenerateKey;
    }

    private final byte[] wrapSecret(byte[] bArr) throws Exception {
        int i = 2 % 2;
        int i2 = KWHzl + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        try {
            return wrapSecretDirect(bArr);
        } catch (Exception e) {
            WrapUtilsImpl wrapUtilsImpl = WrapUtilsImpl.INSTANCE;
            String message = e.getMessage();
            if (message == null) {
                int i4 = KWHzl + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                message = "";
            }
            wrapUtilsImpl.monitorCallError("wrapSecret", message);
            throw e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [206=4] */
    private final byte[] wrapSecretDirect(byte[] bArr) throws Exception {
        Exception e;
        byte[] bArrDoFinal;
        byte[] iv;
        Object objValueOf;
        int i = 2 % 2;
        int i2 = KWHzl + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SecretKey orCreateAesKey = getOrCreateAesKey();
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, orCreateAesKey);
            iv = cipher.getIV();
            try {
                bArrDoFinal = cipher.doFinal(bArr);
            } catch (Exception e2) {
                e = e2;
                bArrDoFinal = null;
            }
        } catch (Exception e3) {
            e = e3;
            bArrDoFinal = null;
            iv = null;
        }
        try {
            Intrinsics.checkNotNullExpressionValue(iv, "");
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "");
            return yDT.copydefault(iv, bArrDoFinal);
        } catch (Exception e4) {
            e = e4;
            StringBuilder sb = new StringBuilder();
            sb.append("wrapSecretDirect (Software) failed: " + e.getMessage());
            Object objValueOf2 = AbstractJsonLexerKt.NULL;
            if (iv != null) {
                int i4 = copydefault + 85;
                KWHzl = i4 % 128;
                if (i4 % 2 == 0) {
                    Integer.valueOf(iv.length);
                    throw null;
                }
                objValueOf = Integer.valueOf(iv.length);
            } else {
                objValueOf = AbstractJsonLexerKt.NULL;
            }
            sb.append(" | iv_length=" + objValueOf);
            if (bArrDoFinal != null) {
                int i5 = copydefault + 119;
                KWHzl = i5 % 128;
                int i6 = i5 % 2;
                objValueOf2 = Integer.valueOf(bArrDoFinal.length);
            }
            sb.append(" | ct_length=" + objValueOf2);
            WrapUtilsImpl.INSTANCE.monitorCallError("wrapSecretDirect (Software)", sb.toString());
            throw e;
        }
    }

    private final byte[] unwrapSecret(byte[] bArr) throws Throwable {
        int i = 2 % 2;
        int i2 = KWHzl + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrUnwrapSecretDirect = unwrapSecretDirect(bArr);
        int i4 = KWHzl + 63;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return bArrUnwrapSecretDirect;
    }

    private final byte[] unwrapSecretDirect(byte[] bArr) throws Throwable {
        int i = 2 % 2;
        byte[] bArr2 = null;
        try {
            try {
                SecretKey orCreateAesKeyDirect = getOrCreateAesKeyDirect();
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                byte[] bArrAEQbTJ = yDT.AEQbTJ(bArr, 0, 12);
                try {
                    byte[] bArrAEQbTJ2 = yDT.AEQbTJ(bArr, 12, bArr.length);
                    cipher.init(2, orCreateAesKeyDirect, new GCMParameterSpec(128, bArrAEQbTJ));
                    byte[] bArrDoFinal = cipher.doFinal(bArrAEQbTJ2);
                    Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "");
                    if (bArrAEQbTJ != null) {
                        int i2 = copydefault + 39;
                        KWHzl = i2 % 128;
                        int i3 = i2 % 2;
                        yDT.fill$default(bArrAEQbTJ, (byte) 0, 0, 0, 6, (Object) null);
                        int i4 = KWHzl + 79;
                        copydefault = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 4 % 3;
                        }
                    }
                    return bArrDoFinal;
                } catch (Exception e) {
                    e = e;
                    StringBuilder sb = new StringBuilder();
                    sb.append("unwrapSecretDirect (Software) failed: " + e.getMessage());
                    sb.append(" | wrapped_size=" + bArr.length);
                    WrapUtilsImpl.INSTANCE.monitorCallError("unwrapSecretDirect", sb.toString());
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    bArr2 = bArrAEQbTJ;
                    byte[] bArr3 = bArr2;
                    if (bArr3 != null) {
                        yDT.fill$default(bArr3, (byte) 0, 0, 0, 6, (Object) null);
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final void updateCachesAtomically(byte[] bArr) {
        synchronized (this.mSecretCacheLock) {
            getOrCreateAesKeyDirect();
            this.wrappedSecretCache.set(bArr);
            pUU.EZpvd(TAG, "Caches updated atomically - AES key type: Software");
            Unit unit = Unit.INSTANCE;
        }
    }

    private final byte[] readCachesAtomically() {
        byte[] bArr;
        synchronized (this.mSecretCacheLock) {
            byte[] bArr2 = this.wrappedSecretCache.get();
            bArr = null;
            if (bArr2 != null) {
                try {
                    getOrCreateAesKeyDirect();
                    pUU.EZpvd(TAG, "Caches read atomically - both wrappedSecret and AES key available");
                } catch (Exception e) {
                    pUU.valueOf(TAG, "Cache inconsistency detected during atomic read: " + e.getMessage());
                    if (MemoryReclaimDetector.INSTANCE.isMemoryReclaimed()) {
                        pUU.valueOf(TAG, "Memory reclaim detected for software cache");
                        WrapUtilsImpl.INSTANCE.monitorCallError("software_memory_reclaim_detected", "Software cache AES key unavailable due to memory reclaim: " + e.getMessage());
                    }
                    bArr2 = null;
                }
                bArr = bArr2;
            } else if (MemoryReclaimDetector.INSTANCE.isMemoryReclaimed()) {
                pUU.valueOf(TAG, "Memory reclaim detected - software cache is null");
                WrapUtilsImpl.INSTANCE.monitorCallError("software_memory_reclaim_detected", "Software wrappedSecretCache is null due to memory reclaim");
            }
        }
        return bArr;
    }

    private final void getOrCreateSharedKey(String str, String str2) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        KWHzl = i2 % 128;
        int i3 = i2 % 2;
        updateCachesAtomically(deriveAndWrapSharedSecret(createSoftwareKeyPair()));
        int i4 = copydefault + 97;
        KWHzl = i4 % 128;
        int i5 = i4 % 2;
    }

    private final boolean isProviderAvailable(String str) {
        int i = 2 % 2;
        Provider[] providers = Security.getProviders();
        Intrinsics.checkNotNullExpressionValue(providers, "");
        int length = providers.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (Intrinsics.EZpvd((Object) providers[i2].getName(), (Object) str)) {
                int i3 = KWHzl;
                int i4 = i3 + 45;
                copydefault = i4 % 128;
                z = i4 % 2 == 0;
                int i5 = i3 + 45;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            } else {
                i2++;
                int i7 = KWHzl + 101;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final ECCProviderConfig getBestECCProvider() {
        int i = 2 % 2;
        List<String> listGEmmrt = yDY.gEmmrt("AndroidOpenSSL", BouncyCastleProvider.PROVIDER_NAME);
        for (String str : listGEmmrt) {
            if (isProviderAvailable(str)) {
                int i2 = copydefault + 53;
                KWHzl = i2 % 128;
                int i3 = i2 % 2;
                int i4 = KWHzl + 41;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                for (String str2 : EC_CURVE_NAMES) {
                    try {
                        KeyPairGenerator.getInstance("EC", str).initialize(new ECGenParameterSpec(str2));
                        pUU.EZpvd(TAG, "Selected preferred ECC provider: " + str + " with curve: " + str2);
                        return new ECCProviderConfig(str, str2);
                    } catch (Exception e) {
                        pUU.EZpvd(TAG, "Provider " + str + " doesn't support curve " + str2 + ": " + e.getMessage());
                    }
                }
                pUU.valueOf(TAG, "Preferred provider " + str + " exists but doesn't support any curve names");
            }
        }
        Provider[] providers = Security.getProviders();
        Intrinsics.checkNotNullExpressionValue(providers, "");
        ArrayList arrayList = new ArrayList(providers.length);
        int length = providers.length;
        int i6 = 0;
        while (i6 < length) {
            int i7 = copydefault + 25;
            KWHzl = i7 % 128;
            if (i7 % 2 == 0) {
                arrayList.add(providers[i6].getName());
                i6 += 13;
            } else {
                arrayList.add(providers[i6].getName());
                i6++;
            }
        }
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (true ^ listGEmmrt.contains((String) obj)) {
                arrayList2.add(obj);
            }
        }
        pUU.EZpvd(TAG, "Preferred providers failed, trying remaining providers: " + CollectionsKt___CollectionsKt.joinToString$default(arrayList2, ",", null, null, 0, null, null, 62, null));
        for (String str3 : arrayList2) {
            Intrinsics.copydefault((Object) str3);
            if (StringsKt__StringsKt.AhwBna((CharSequence) str3, (CharSequence) "KeyStore", true) || StringsKt__StringsKt.AhwBna((CharSequence) str3, (CharSequence) "Hardware", true)) {
                pUU.EZpvd(TAG, "Skipping hardware provider " + str3 + " for software implementation");
                int i8 = copydefault + 63;
                KWHzl = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 5 % 3;
                }
            } else {
                for (String str4 : EC_CURVE_NAMES) {
                    try {
                        KeyPairGenerator.getInstance("EC", str3).initialize(new ECGenParameterSpec(str4));
                        pUU.EZpvd(TAG, "Selected fallback ECC provider: " + str3 + " with curve: " + str4);
                        return new ECCProviderConfig(str3, str4);
                    } catch (Exception e2) {
                        pUU.EZpvd(TAG, "Provider " + str3 + " doesn't support curve " + str4 + ": " + e2.getMessage());
                    }
                }
            }
        }
        pUU.valueOf(TAG, "All available providers tested - no suitable provider/curve combination found");
        return null;
    }

    private final KeyPairGenerator createBouncyCastleKeyPairGenerator() {
        int i = 2 % 2;
        int i2 = KWHzl + 69;
        copydefault = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
                throw null;
            }
            if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
                Security.addProvider(new BouncyCastleProvider());
                pUU.EZpvd(TAG, "Added BouncyCastle provider to Security");
                int i3 = copydefault + 17;
                KWHzl = i3 % 128;
                int i4 = i3 % 2;
            }
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", BouncyCastleProvider.PROVIDER_NAME);
            pUU.EZpvd(TAG, "Created BouncyCastle KeyPairGenerator as ultimate fallback");
            Intrinsics.copydefault(keyPairGenerator);
            int i5 = copydefault + 15;
            KWHzl = i5 % 128;
            int i6 = i5 % 2;
            return keyPairGenerator;
        } catch (Exception e) {
            pUU.AEQbTJ(TAG, "BouncyCastle fallback failed: " + e.getMessage(), e);
            throw new IllegalStateException("All ECC providers failed, including BouncyCastle fallback", e);
        }
    }

    private static final KeyPair createSoftwareKeyPair$lambda$12(SoftwareImpl softwareImpl) throws InvalidAlgorithmParameterException {
        Pair pair;
        int i = 2 % 2;
        int i2 = KWHzl + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ECCProviderConfig bestECCProvider = softwareImpl.getBestECCProvider();
        if (bestECCProvider != null) {
            pair = new Pair(KeyPairGenerator.getInstance("EC", bestECCProvider.getProviderName()), bestECCProvider.getCurveName());
        } else {
            pUU.valueOf(TAG, "All system providers failed, using BouncyCastle fallback");
            pair = new Pair(softwareImpl.createBouncyCastleKeyPairGenerator(), EC_CURVE);
        }
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) pair.component1();
        keyPairGenerator.initialize(new ECGenParameterSpec((String) pair.component2()));
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        int i4 = copydefault + 37;
        KWHzl = i4 % 128;
        if (i4 % 2 != 0) {
            return keyPairGenerateKeyPair;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final boolean createSoftwareKeyPair$lambda$13(Exception exc) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(exc, "");
        if (exc instanceof NoSuchProviderException) {
            pUU.valueOf(TAG, "Provider not available, will retry with different provider: " + exc.getMessage());
        } else if (exc instanceof InvalidAlgorithmParameterException) {
            pUU.valueOf(TAG, "Provider corruption detected (" + exc.getMessage() + "), will retry");
        } else {
            if (!(exc instanceof GeneralSecurityException)) {
                int i2 = copydefault + 55;
                KWHzl = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = KWHzl + 85;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 % 3;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [694=4] */
    private final KeyPair createSoftwareKeyPair() throws Exception {
        String providerName;
        int i = 2 % 2;
        try {
            Object objExecuteWithRetry = RetryUtils.Companion.executeWithRetry(RetryConfig.Companion.getRetryConfig(), "Software ECC KeyPair Generation", new Function0() { // from class: com.okinc.web3.security.utils.internal.SoftwareImpl$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SoftwareImpl.$r8$lambda$rLIyPI2xOljKEQYRPCPyPT6HDHA(this.f$0);
                }
            }, new Function1() { // from class: com.okinc.web3.security.utils.internal.SoftwareImpl$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(SoftwareImpl.m7168$r8$lambda$ORcOIwvXfV6keMCif8zkRTlc8((Exception) obj));
                }
            });
            Intrinsics.checkNotNullExpressionValue(objExecuteWithRetry, "");
            return (KeyPair) objExecuteWithRetry;
        } catch (Exception e) {
            ECCProviderConfig bestECCProvider = getBestECCProvider();
            Provider[] providers = Security.getProviders();
            Intrinsics.checkNotNullExpressionValue(providers, "");
            ArrayList arrayList = new ArrayList(providers.length);
            int length = providers.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = KWHzl + 17;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    arrayList.add(providers[i2].getName());
                    i2 += 10;
                } else {
                    arrayList.add(providers[i2].getName());
                    i2++;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("createSoftwareKeyPair (Software) failed: " + e.getMessage());
            sb.append(" | tested_curve_names=" + CollectionsKt___CollectionsKt.joinToString$default(EC_CURVE_NAMES, ",", null, null, 0, null, null, 62, null));
            sb.append(" | algorithm=EC");
            sb.append(" | key_type=software");
            String str = "none";
            if (bestECCProvider == null || (providerName = bestECCProvider.getProviderName()) == null) {
                int i4 = KWHzl + 75;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                providerName = "none";
            }
            sb.append(" | selected_provider=" + providerName);
            if (bestECCProvider != null) {
                int i6 = KWHzl + 71;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                String curveName = bestECCProvider.getCurveName();
                if (curveName != null) {
                    str = curveName;
                }
            }
            sb.append(" | selected_curve=" + str);
            sb.append(" | retry_config=" + RetryConfig.Companion.getRetryConfig());
            sb.append(" | available_providers=" + CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
            sb.append(" | AndroidOpenSSL_available=" + isProviderAvailable("AndroidOpenSSL"));
            sb.append(" | BC_available=" + isProviderAvailable(BouncyCastleProvider.PROVIDER_NAME));
            Object[] objArr = new Object[1];
            a(new char[]{39881, 65019, 22486, 43437, 915, 25968, 65346, 20744, 43781, 3316, 26361, 63683, 21179, 46211, 3707}, 26141, objArr);
            sb.append(" | AndroidKeyStore_available=" + isProviderAvailable(((String) objArr[0]).intern()));
            sb.append(" | BouncyCastle_fallback_available=" + (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) != null));
            WrapUtilsImpl.INSTANCE.monitorCallError("createSoftwareKeyPair (Software)", sb.toString());
            throw e;
        }
    }

    private static final byte[] deriveAndWrapSharedSecret$lambda$16(SoftwareImpl softwareImpl, KeyPair keyPair) {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        KWHzl = i2 % 128;
        int i3 = i2 % 2;
        byte[] encoded = softwareImpl.deriveSharedSecretDirect(keyPair).getEncoded();
        try {
            Intrinsics.copydefault(encoded);
            byte[] bArrWrapSecret = softwareImpl.wrapSecret(encoded);
            yDT.fill$default(encoded, (byte) 0, 0, 0, 6, (Object) null);
            int i4 = KWHzl + 123;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return bArrWrapSecret;
        } catch (Throwable th) {
            Intrinsics.copydefault(encoded);
            yDT.fill$default(encoded, (byte) 0, 0, 0, 6, (Object) null);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final boolean deriveAndWrapSharedSecret$lambda$17(Exception exc) {
        int i = 2 % 2;
        int i2 = KWHzl + 15;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(exc, "");
            boolean z = exc instanceof GeneralSecurityException;
            throw null;
        }
        Intrinsics.checkNotNullParameter(exc, "");
        if ((exc instanceof GeneralSecurityException) || (exc instanceof IllegalStateException)) {
            return true;
        }
        int i3 = copydefault + 35;
        KWHzl = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [521=4] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x00db -> B:22:0x00fc). Please report as a decompilation issue!!! */
    private final byte[] deriveAndWrapSharedSecret(final KeyPair keyPair) throws Exception {
        int i = 2 % 2;
        try {
            return (byte[]) RetryUtils.Companion.executeWithRetry(RetryConfig.Companion.getRetryConfig(), "Derive and Wrap Shared Secret (Software)", new Function0() { // from class: com.okinc.web3.security.utils.internal.SoftwareImpl$$ExternalSyntheticLambda2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SoftwareImpl.m7169$r8$lambda$RHxRVDYM5f1vNznOEYHBkZWY8I(this.f$0, keyPair);
                }
            }, new Function1() { // from class: com.okinc.web3.security.utils.internal.SoftwareImpl$$ExternalSyntheticLambda3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(SoftwareImpl.$r8$lambda$2fgTSq0iq1m9p440UeF_neNcUbo((Exception) obj));
                }
            });
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("deriveAndWrapSharedSecret (Software) failed: " + e.getMessage());
            sb.append(" | keypair_algorithm=" + keyPair.getPrivate().getAlgorithm());
            sb.append(" | private_key_format=" + keyPair.getPrivate().getFormat());
            sb.append(" | public_key_format=" + keyPair.getPublic().getFormat());
            sb.append(" | public_key_algorithm=" + keyPair.getPublic().getAlgorithm());
            try {
                if (keyPair.getPublic().getEncoded() != null) {
                    sb.append(" | public_key_encoded_length=" + keyPair.getPublic().getEncoded().length);
                } else {
                    sb.append(" | public_key_encoded=null");
                }
            } catch (Exception e2) {
                sb.append(" | public_key_encoded=access_error:" + e2.getMessage());
                int i2 = KWHzl + 51;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
            }
            try {
                if (keyPair.getPublic() instanceof ECPublicKey) {
                    PublicKey publicKey = keyPair.getPublic();
                    Intrinsics.copydefault(publicKey);
                    sb.append(" | ec_curve_field_size=" + ((ECPublicKey) publicKey).getParams().getCurve().getField().getFieldSize());
                    sb.append(" | ec_point_available=true");
                    int i4 = KWHzl + 59;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                }
            } catch (Exception e3) {
                sb.append(" | ec_info=access_error:" + e3.getMessage());
            }
            sb.append(" | retry_config=" + RetryConfig.Companion.getRetryConfig());
            sb.append(" | operation_step=derive_and_wrap");
            sb.append(" | ec_curve=secp256r1");
            sb.append(" | shared_message=wallet-core-ecdh-aes");
            WrapUtilsImpl.INSTANCE.monitorCallError("deriveAndWrapSharedSecret (Software)", sb.toString());
            throw e;
        }
    }

    private final String ecPublicKeyToHex(PublicKey publicKey) {
        int i = 2 % 2;
        int i2 = KWHzl + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String strEcPublicKeyToHex = CryptoUtilities.INSTANCE.ecPublicKeyToHex(publicKey);
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
        return strEcPublicKeyToHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PublicKey decodePublicKeyHex(@NotNull String str) {
        PublicKey publicKeyDecodePublicKeyHex;
        int i = 2 % 2;
        int i2 = KWHzl + 117;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            publicKeyDecodePublicKeyHex = CryptoUtilities.INSTANCE.decodePublicKeyHex(str);
            int i3 = 81 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            publicKeyDecodePublicKeyHex = CryptoUtilities.INSTANCE.decodePublicKeyHex(str);
        }
        int i4 = KWHzl + 25;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return publicKeyDecodePublicKeyHex;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ SecretKeySpec hkdfDerivedSymmetricKey$default(SoftwareImpl softwareImpl, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = KWHzl + 123;
        int i5 = i4 % 128;
        copydefault = i5;
        int i6 = i4 % 2;
        Object obj2 = null;
        if ((i2 & 2) != 0) {
            bArr2 = null;
        }
        if ((i2 & 4) != 0) {
            int i7 = i5 + 69;
            KWHzl = i7 % 128;
            if (i7 % 2 == 0) {
                obj2.hashCode();
                throw null;
            }
            bArr3 = null;
        }
        if ((i2 & 8) != 0) {
            int i8 = i5 + 81;
            KWHzl = i8 % 128;
            i = i8 % 2 == 0 ? 59 : 32;
        }
        return softwareImpl.hkdfDerivedSymmetricKey(bArr, bArr2, bArr3, i);
    }

    private final SecretKeySpec hkdfDerivedSymmetricKey(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 97;
        KWHzl = i3 % 128;
        int i4 = i3 % 2;
        SecretKeySpec secretKeySpecHkdfDerivedSymmetricKey = CryptoUtilities.INSTANCE.hkdfDerivedSymmetricKey(bArr, bArr2, bArr3, i);
        int i5 = KWHzl + 103;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return secretKeySpecHkdfDerivedSymmetricKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [577=5] */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:51:0x026d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:55:0x02b7 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:62:0x004f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069 A[PHI: r2
  0x0069: PHI (r2v21 java.lang.String) = (r2v61 java.lang.String), (r2v62 java.lang.String) binds: [B:15:0x0067, B:11:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final SecretKeySpec deriveSharedSecretDirect(KeyPair keyPair) throws Exception {
        ?? r2;
        ?? r1;
        String strEcPublicKeyToHex;
        Object objDispatch$default;
        String str;
        byte[] bArrPerformECDH;
        ?? r12 = "";
        int i = 2 % 2;
        try {
            PublicKey publicKey = keyPair.getPublic();
            Intrinsics.checkNotNullExpressionValue(publicKey, "");
            strEcPublicKeyToHex = ecPublicKeyToHex(publicKey);
            try {
                objDispatch$default = Web3SecurityBridge.dispatch$default(Web3SecurityBridge.INSTANCE, "init_get_comm_publickey", C56424yEw.gEmmrt(C56390yDp.OLrzqt("peerPublicKey", strEcPublicKeyToHex), C56390yDp.OLrzqt("forceRefresh", Boolean.TRUE)), false, 4, null);
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            r2 = "";
            r1 = r12;
        }
        if (objDispatch$default == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Web3SecurityBridge.dispatch returned null response for init_get_comm_publickey");
            StringBuilder sb = new StringBuilder();
            sb.append("deriveSharedSecretDirect (Software) failed: " + illegalStateException.getMessage());
            sb.append(" | mobilePubHexLength=" + strEcPublicKeyToHex.length());
            sb.append(" | rawString=null");
            WrapUtilsImpl.INSTANCE.monitorCallError("deriveSharedSecretDirect (Software)", sb.toString());
            throw illegalStateException;
        }
        int i2 = copydefault + 21;
        KWHzl = i2 % 128;
        ?? r22 = i2 % 2;
        try {
            if (r22 != 0) {
                String string = objDispatch$default.toString();
                boolean zFARcdN = StringsKt__StringsKt.fARcdN((CharSequence) string);
                r22 = string;
                str = string;
                if (!zFARcdN) {
                }
                IllegalStateException illegalStateException2 = new IllegalStateException("Web3SecurityBridge.dispatch returned invalid response: '" + r22 + "'");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("deriveSharedSecretDirect (Software) failed: " + illegalStateException2.getMessage());
                sb2.append(" | mobilePubHexLength=" + strEcPublicKeyToHex.length());
                sb2.append(" | rawStringLength=" + r22.length());
                WrapUtilsImpl.INSTANCE.monitorCallError("deriveSharedSecretDirect (Software)", sb2.toString());
                throw illegalStateException2;
            }
            String string2 = objDispatch$default.toString();
            boolean zFARcdN2 = StringsKt__StringsKt.fARcdN((CharSequence) string2);
            int i3 = 54 / 0;
            r22 = string2;
            str = string2;
            if (!zFARcdN2) {
                String str2 = str;
                try {
                    if (!Intrinsics.EZpvd((Object) str2, (Object) AbstractJsonLexerKt.NULL)) {
                        try {
                            Json.Default r0 = Json.Default;
                            r0.getSerializersModule();
                            JsonElement jsonElement = (JsonElement) ((JsonObject) r0.decodeFromString(JsonObject.Companion.serializer(), str2)).get((Object) "publicKey");
                            if (jsonElement == null) {
                                IllegalStateException illegalStateException3 = new IllegalStateException("Response JSON missing 'publicKey' field: " + ((Object) str2));
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("deriveSharedSecretDirect (Software) failed: " + illegalStateException3.getMessage());
                                sb3.append(" | mobilePubHexLength=" + strEcPublicKeyToHex.length());
                                sb3.append(" | rawStringLength=" + str2.length());
                                WrapUtilsImpl.INSTANCE.monitorCallError("deriveSharedSecretDirect (Software)", sb3.toString());
                                throw illegalStateException3;
                            }
                            int i4 = copydefault + 89;
                            KWHzl = i4 % 128;
                            int i5 = i4 % 2;
                            PublicKey publicKeyDecodePublicKeyHex = decodePublicKeyHex(JsonElementKt.getJsonPrimitive(jsonElement).getContent());
                            try {
                                KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
                                keyAgreement.init(keyPair.getPrivate());
                                keyAgreement.doPhase(publicKeyDecodePublicKeyHex, true);
                                bArrPerformECDH = keyAgreement.generateSecret();
                            } catch (Exception unused) {
                                BouncyCastleCryptoUtilities bouncyCastleCryptoUtilities = BouncyCastleCryptoUtilities.INSTANCE;
                                PrivateKey privateKey = keyPair.getPrivate();
                                Intrinsics.checkNotNullExpressionValue(privateKey, "");
                                bArrPerformECDH = bouncyCastleCryptoUtilities.performECDH(privateKey, publicKeyDecodePublicKeyHex);
                            }
                            byte[] bArr = bArrPerformECDH;
                            int i6 = copydefault + 109;
                            KWHzl = i6 % 128;
                            try {
                                if (i6 % 2 == 0) {
                                    Intrinsics.copydefault(bArr);
                                    byte[] bytes = sharedMessage.getBytes(Charsets.UTF_8);
                                    Intrinsics.checkNotNullExpressionValue(bytes, "");
                                    SecretKeySpec secretKeySpecHkdfDerivedSymmetricKey$default = hkdfDerivedSymmetricKey$default(this, bArr, null, bytes, 1, 73, null);
                                    yDT.fill$default(bArr, (byte) 1, 1, 1, 68, (Object) null);
                                    return secretKeySpecHkdfDerivedSymmetricKey$default;
                                }
                                Intrinsics.copydefault(bArr);
                                byte[] bytes2 = sharedMessage.getBytes(Charsets.UTF_8);
                                Intrinsics.checkNotNullExpressionValue(bytes2, "");
                                SecretKeySpec secretKeySpecHkdfDerivedSymmetricKey$default2 = hkdfDerivedSymmetricKey$default(this, bArr, null, bytes2, 0, 10, null);
                                yDT.fill$default(bArr, (byte) 0, 0, 0, 6, (Object) null);
                                return secretKeySpecHkdfDerivedSymmetricKey$default2;
                            } catch (Throwable th) {
                                Intrinsics.copydefault(bArr);
                                yDT.fill$default(bArr, (byte) 0, 0, 0, 6, (Object) null);
                                throw th;
                            }
                        } catch (Exception e3) {
                            IllegalStateException illegalStateException4 = new IllegalStateException("Failed to parse JSON response from Web3SecurityBridge: '" + ((Object) str2) + "'", e3);
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("deriveSharedSecretDirect (Software) failed: " + illegalStateException4.getMessage());
                            sb4.append(" | mobilePubHexLength=" + strEcPublicKeyToHex.length());
                            sb4.append(" | rawStringLength=" + str2.length());
                            WrapUtilsImpl.INSTANCE.monitorCallError("deriveSharedSecretDirect (Software)", sb4.toString());
                            throw illegalStateException4;
                        }
                    }
                    r22 = str2;
                } catch (Exception e4) {
                    e = e4;
                    r22 = str2;
                    r12 = r22;
                    int i7 = KWHzl + 93;
                    copydefault = i7 % 128;
                    int i8 = i7 % 2;
                    r2 = r12;
                    r1 = strEcPublicKeyToHex;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("deriveSharedSecretDirect (Software) failed: " + e.getMessage());
                    sb5.append(" | mobilePubHexLength=" + r1.length());
                    sb5.append(" | rawStringLength=" + r2.length());
                    WrapUtilsImpl.INSTANCE.monitorCallError("deriveSharedSecretDirect (Software)", sb5.toString());
                    throw e;
                }
            }
            IllegalStateException illegalStateException22 = new IllegalStateException("Web3SecurityBridge.dispatch returned invalid response: '" + r22 + "'");
            StringBuilder sb22 = new StringBuilder();
            sb22.append("deriveSharedSecretDirect (Software) failed: " + illegalStateException22.getMessage());
            sb22.append(" | mobilePubHexLength=" + strEcPublicKeyToHex.length());
            sb22.append(" | rawStringLength=" + r22.length());
            WrapUtilsImpl.INSTANCE.monitorCallError("deriveSharedSecretDirect (Software)", sb22.toString());
            throw illegalStateException22;
        } catch (Exception e5) {
            e = e5;
        }
        int i72 = KWHzl + 93;
        copydefault = i72 % 128;
        int i82 = i72 % 2;
        r2 = r12;
        r1 = strEcPublicKeyToHex;
        StringBuilder sb52 = new StringBuilder();
        sb52.append("deriveSharedSecretDirect (Software) failed: " + e.getMessage());
        sb52.append(" | mobilePubHexLength=" + r1.length());
        sb52.append(" | rawStringLength=" + r2.length());
        WrapUtilsImpl.INSTANCE.monitorCallError("deriveSharedSecretDirect (Software)", sb52.toString());
        throw e;
    }

    private final byte[] retrieveWrappedSecretCache() {
        pUU.KWHzl(TAG, "retrieveWrappedSecretCache (Software) start[" + Thread.currentThread().getName() + "]");
        byte[] cachesAtomically = readCachesAtomically();
        if (cachesAtomically != null) {
            return cachesAtomically;
        }
        synchronized (this.mSecretCacheLock) {
            byte[] cachesAtomically2 = readCachesAtomically();
            if (cachesAtomically2 != null) {
                return cachesAtomically2;
            }
            getOrCreateSharedKey(ECC_ALIAS, EC_CURVE);
            byte[] bArr = this.wrappedSecretCache.get();
            if (bArr == null) {
                IllegalStateException illegalStateException = new IllegalStateException("No wrapped secret available after atomic initialization");
                WrapUtilsImpl wrapUtilsImpl = WrapUtilsImpl.INSTANCE;
                String message = illegalStateException.getMessage();
                if (message == null) {
                    message = "";
                }
                wrapUtilsImpl.monitorCallError("retrieveWrappedSecretCache", message);
                throw illegalStateException;
            }
            pUU.KWHzl(TAG, "init getOrCreateSharedKey end[" + Thread.currentThread().getName() + "] - caches atomically initialized");
            return bArr;
        }
    }

    private final boolean isCalledFromUnwrap() throws Throwable {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        KWHzl = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsAuthorizedCaller = WrapUtilsImpl.INSTANCE.isAuthorizedCaller(C56402yEa.EZpvd("com.okinc.web3.security.utils.internal.SoftwareImpl.unwrap"));
        int i4 = KWHzl + 9;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return zIsAuthorizedCaller;
    }

    static void EZpvd() {
        EZpvd = 3277242356453682437L;
    }
}
