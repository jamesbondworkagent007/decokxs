package com.okinc.web3.security.utils.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.security.keystore.KeyProperties;
import com.amplifyframework.core.model.ModelIdentifier;
import com.google.android.gms.stats.CodePackage;
import com.google.common.base.Ascii;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.ibm.icu.text.DateFormat;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.web3.security.bridge.Web3SecurityBridge;
import com.okinc.web3.security.utils.RetryConfig;
import com.okinc.web3.security.utils.RetryUtils;
import com.okinc.web3.security.utils.internal.HardwareImpl;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.KeySpec;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
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
import o.C43296rmc;
import o.C56390yDp;
import o.C56402yEa;
import o.C56423yEv;
import o.C56424yEw;
import o.YY;
import o.Zj;
import o.Zo;
import o.pUU;
import o.yDT;
import o.yDV;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes12.dex */
public final class HardwareImpl implements WrapUtilsBase {
    public static final int $stable;
    private static short[] AEQbTJ = null;
    private static final String ANDROID_KEYSTORE = "AndroidKeyStore";
    private static int AYXKKw = 0;
    public static final Companion Companion;
    private static final String ECC_ALIAS = "ecdh_alias";
    private static final String EC_CURVE = "secp256r1";
    private static byte[] EZpvd = null;
    private static int KWHzl = 0;
    private static int OLrzqt = 0;
    private static final String SB_TEST_ALIAS = "strongbox_capability_test_key";
    private static final String TAG = "HardwareImpl";
    private static final String TEE_TEST_ALIAS = "tee_capability_test_key";
    private static final String WRAP_ALIAS = "ecdh_wrap_key";
    private static int copydefault = 0;
    private static final String sharedMessage = "wallet-core-ecdh-aes";
    private final Object mSecretCacheLock;
    private final SupportLevel supportLevel;
    private final AtomicReference<byte[]> wrappedSecretCache;
    private static final byte[] $$a = {73, -5, -69, 92};
    private static final int $$b = CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int gEmmrt = 0;
    private static int AhwBna = 0;
    private static int valueOf = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, short s2) {
        int i;
        byte[] bArr = $$a;
        int i2 = (s * 3) + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        int i3 = s2 * 3;
        int i4 = b + 4;
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i5 = i4;
            int i6 = 0;
            i2 += i4;
            i4 = i5;
            i = i6;
            int i7 = i4 + 1;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i3) {
                return new String(bArr2, 0);
            }
            i5 = i7;
            i4 = bArr[i7];
            i2 += i4;
            i4 = i5;
            i = i6;
            int i72 = i4 + 1;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i3) {
            }
        } else {
            i = 0;
            int i722 = i4 + 1;
            bArr2[i] = (byte) i2;
            i6 = i + 1;
            if (i == i3) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ boolean $r8$lambda$_0U8G_JdOnxxieraFYswhWDnsPc(Exception exc) {
        int i = 2 % 2;
        int i2 = valueOf + 67;
        AhwBna = i2 % 128;
        int i3 = i2 % 2;
        boolean zCreateEccKeyPair$lambda$4 = createEccKeyPair$lambda$4(exc);
        int i4 = valueOf + 69;
        AhwBna = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return zCreateEccKeyPair$lambda$4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: $r8$lambda$npro0bDDFypAy-RAe3CVl_nQIPc, reason: not valid java name */
    public static /* synthetic */ boolean m7165$r8$lambda$npro0bDDFypAyRAe3CVl_nQIPc(Exception exc) {
        int i = 2 % 2;
        int i2 = AhwBna + 125;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        boolean zDeriveAndWrapSharedSecret$lambda$6 = deriveAndWrapSharedSecret$lambda$6(exc);
        int i4 = AhwBna + 69;
        valueOf = i4 % 128;
        int i5 = i4 % 2;
        return zDeriveAndWrapSharedSecret$lambda$6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: $r8$lambda$oHOC1iHkqJ-wT6c6HBhYo7AJd8s, reason: not valid java name */
    public static /* synthetic */ KeyPair m7166$r8$lambda$oHOC1iHkqJwT6c6HBhYo7AJd8s(String str, String str2, boolean z) throws Throwable {
        int i = 2 % 2;
        int i2 = valueOf + 117;
        AhwBna = i2 % 128;
        if (i2 % 2 != 0) {
            createEccKeyPair$lambda$3(str, str2, z);
            throw null;
        }
        KeyPair keyPairCreateEccKeyPair$lambda$3 = createEccKeyPair$lambda$3(str, str2, z);
        int i3 = valueOf + 71;
        AhwBna = i3 % 128;
        int i4 = i3 % 2;
        return keyPairCreateEccKeyPair$lambda$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ byte[] $r8$lambda$rMU7WHx5E1k9bELAJA6K1A_0zMs(HardwareImpl hardwareImpl, KeyPair keyPair) {
        int i = 2 % 2;
        int i2 = AhwBna + 121;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            return deriveAndWrapSharedSecret$lambda$5(hardwareImpl, keyPair);
        }
        deriveAndWrapSharedSecret$lambda$5(hardwareImpl, keyPair);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        AYXKKw = 1;
        EZpvd();
        Companion = new Companion(null);
        $stable = 8;
        int i = gEmmrt + 21;
        AYXKKw = i % 128;
        int i2 = i % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.web3.security.utils.internal.WrapUtilsBase
    public SupportLevel getSupportLevel() {
        int i = 2 % 2;
        int i2 = AhwBna;
        int i3 = i2 + 9;
        valueOf = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        SupportLevel supportLevel = this.supportLevel;
        int i4 = i2 + 89;
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return supportLevel;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.web3.security.utils.internal.WrapUtilsBase
    public boolean isHardwareBacked() {
        int i = 2 % 2;
        int i2 = valueOf + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        AhwBna = i2 % 128;
        return i2 % 2 == 0;
    }

    public HardwareImpl(@NotNull SupportLevel supportLevel) {
        Intrinsics.checkNotNullParameter(supportLevel, "");
        this.supportLevel = supportLevel;
        if (!yDY.gEmmrt(SupportLevel.TEE, SupportLevel.STRONGBOX).contains(supportLevel)) {
            throw new IllegalArgumentException(("HardwareImpl requires supportLevel TEE or STRONGBOX, got: " + supportLevel).toString());
        }
        Object obj = null;
        this.wrappedSecretCache = new AtomicReference<>(null);
        this.mSecretCacheLock = new Object();
        int i = valueOf + 49;
        AhwBna = i % 128;
        if (i % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final class Companion {
        private static final byte[] $$a = {Ascii.SI, -70, 87, 62};
        private static final int $$b = 247;
        private static int $10 = 0;
        private static int $11 = 1;
        private static int copydefault = 0;
        private static int OLrzqt = 1;
        private static long AEQbTJ = 6963997137236707400L;

        /* JADX DEBUG: Duplicate block (B:10:0x0029) to fix multi-entry loop: BACK_EDGE: B:9:0x0027 -> B:10:0x0029 */
        private static String $$c(int i, int i2, short s) {
            int i3 = 3 - (i * 2);
            byte[] bArr = $$a;
            int i4 = s * 4;
            int i5 = 117 - (i2 * 2);
            byte[] bArr2 = new byte[1 - i4];
            int i6 = 0 - i4;
            int i7 = -1;
            if (bArr == null) {
                i5 += -i6;
            }
            while (true) {
                i7++;
                bArr2[i7] = (byte) i5;
                i3++;
                if (i7 == i6) {
                    return new String(bArr2, 0);
                }
                i5 += -bArr[i3];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void $r8$lambda$Ul4VJKtOGzJMK0B4DB4nrBWNHxU(Context context) throws Throwable {
            int i = 2 % 2;
            int i2 = OLrzqt + 35;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            runHardwareCompatibilityTestsForTelemetry$lambda$1(context);
            if (i3 != 0) {
                int i4 = 39 / 0;
            }
            int i5 = OLrzqt + 37;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 46 / 0;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: $r8$lambda$b9eBPHmuLPfcukZPm1jEFl-K9iY, reason: not valid java name */
        public static /* synthetic */ CharSequence m7167$r8$lambda$b9eBPHmuLPfcukZPm1jEFlK9iY(StackTraceElement stackTraceElement) {
            int i = 2 % 2;
            int i2 = copydefault + 99;
            OLrzqt = i2 % 128;
            if (i2 % 2 != 0) {
                return getSecureStackTrace$lambda$8(stackTraceElement);
            }
            getSecureStackTrace$lambda$8(stackTraceElement);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.web3.security.utils.internal.HardwareImpl.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [65=4] */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            Zo zo = new Zo();
            char[] cArrOLrzqt = Zo.OLrzqt(AEQbTJ ^ (-5747691001614856746L), cArr, i);
            zo.KWHzl = 4;
            while (zo.KWHzl < cArrOLrzqt.length) {
                int i3 = $11 + 125;
                $10 = i3 % 128;
                int i4 = i3 % 2;
                zo.OLrzqt = zo.KWHzl - 4;
                int i5 = zo.KWHzl;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrOLrzqt[zo.KWHzl] ^ cArrOLrzqt[zo.KWHzl % 4]), Long.valueOf(zo.OLrzqt), Long.valueOf(AEQbTJ)};
                    Object objEZpvd = YY.EZpvd(1769962791);
                    if (objEZpvd == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objEZpvd = YY.EZpvd(368, 5, (char) 0, 1834987611, false, $$c(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrOLrzqt[i5] = ((Character) ((Method) objEZpvd).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {zo, zo};
                        Object objEZpvd2 = YY.EZpvd(-1024411099);
                        if (objEZpvd2 == null) {
                            objEZpvd2 = YY.EZpvd(81, 4, (char) 0, -959416487, false, DateFormat.YEAR, new Class[]{Object.class, Object.class});
                        }
                        ((Method) objEZpvd2).invoke(null, objArr3);
                        int i6 = $10 + 101;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            objArr[0] = new String(cArrOLrzqt, 4, cArrOLrzqt.length - 4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [104=4] */
        private static final void runHardwareCompatibilityTestsForTelemetry$lambda$1(Context context) throws Throwable {
            boolean zDetectStrongBoxSupport;
            boolean zDetectTEESupport;
            int i = 2 % 2;
            int i2 = copydefault + 13;
            OLrzqt = i2 % 128;
            int i3 = i2 % 2;
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (Build.VERSION.SDK_INT < 28 || !context.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                    int i4 = copydefault + 33;
                    OLrzqt = i4 % 128;
                    int i5 = i4 % 2;
                    zDetectStrongBoxSupport = false;
                } else {
                    zDetectStrongBoxSupport = HardwareImpl.Companion.detectStrongBoxSupport(context);
                }
                try {
                    Companion companion = HardwareImpl.Companion;
                    zDetectTEESupport = companion.detectTEESupport();
                    try {
                        pUU.KWHzl(HardwareImpl.TAG, "Hardware compatibility tests completed: StrongBox=" + zDetectStrongBoxSupport + ", TEE=" + zDetectTEESupport + ", duration=" + (System.currentTimeMillis() - jCurrentTimeMillis) + DateFormat.MINUTE_SECOND);
                        companion.markHardwareCompatibilityTestComplete(context, true);
                        int i6 = OLrzqt + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
                        copydefault = i6 % 128;
                        int i7 = i6 % 2;
                    } catch (Exception e) {
                        e = e;
                        pUU.OLrzqt(HardwareImpl.TAG, "Hardware compatibility testing failed for telemetry", e);
                        StringBuilder sb = new StringBuilder();
                        sb.append("Hardware compatibility testing failed for telemetry: " + e.getMessage());
                        sb.append(" | strongBoxSupported=" + zDetectStrongBoxSupport);
                        sb.append(" | teeSupported=" + zDetectTEESupport);
                        WrapUtilsImpl.INSTANCE.monitorCallError("runHardwareCompatibilityTestsForTelemetry", sb.toString());
                        HardwareImpl.Companion.markHardwareCompatibilityTestComplete(context, false);
                    }
                } catch (Exception e2) {
                    e = e2;
                    zDetectTEESupport = false;
                }
            } catch (Exception e3) {
                e = e3;
                zDetectStrongBoxSupport = false;
                zDetectTEESupport = false;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void runHardwareCompatibilityTestsForTelemetry(@NotNull final Context context) {
            int i = 2 % 2;
            int i2 = OLrzqt + 49;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            try {
                if (shouldRunHardwareCompatibilityTest(context)) {
                    Thread thread = new Thread(new Runnable() { // from class: com.okinc.web3.security.utils.internal.HardwareImpl$Companion$$ExternalSyntheticLambda0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            HardwareImpl.Companion.$r8$lambda$Ul4VJKtOGzJMK0B4DB4nrBWNHxU(context);
                        }
                    });
                    thread.setName("HardwareCompatibilityTest");
                    thread.setDaemon(true);
                    thread.start();
                    return;
                }
                int i4 = OLrzqt + 33;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    pUU.EZpvd(HardwareImpl.TAG, "Skipping hardware compatibility test - no version change and previous test successful");
                } else {
                    pUU.EZpvd(HardwareImpl.TAG, "Skipping hardware compatibility test - no version change and previous test successful");
                    int i5 = 29 / 0;
                }
            } catch (Exception e) {
                pUU.OLrzqt(HardwareImpl.TAG, "Failed to start hardware compatibility testing thread", e);
                markHardwareCompatibilityTestComplete(context, false);
                WrapUtilsImpl.INSTANCE.monitorCallError("runHardwareCompatibilityTestsForTelemetry", "Failed to start telemetry thread: " + e.getMessage());
                int i6 = copydefault + 9;
                OLrzqt = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 % 3;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [153=4] */
        private final boolean shouldRunHardwareCompatibilityTest(Context context) {
            String str;
            int i = 2 % 2;
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("web3_hardware_test_prefs", 0);
                try {
                    str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (Exception unused) {
                }
                if (str == null) {
                    int i2 = OLrzqt + 69;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    str = "unknown";
                }
                String str2 = str + "_" + Build.VERSION.RELEASE;
                String string = sharedPreferences.getString("last_tested_version_key", "");
                boolean z = sharedPreferences.getBoolean("last_test_successful", false);
                boolean z2 = (Intrinsics.EZpvd((Object) str2, (Object) string) && z) ? false : true;
                if (z2) {
                    pUU.KWHzl(HardwareImpl.TAG, "Hardware compatibility test needed - current: " + str2 + ", last: " + string + ", lastSuccess: " + z);
                    int i4 = copydefault + 123;
                    OLrzqt = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    pUU.EZpvd(HardwareImpl.TAG, "Hardware compatibility test not needed - version: " + str2 + ", lastSuccess: " + z);
                }
                return z2;
            } catch (Exception e) {
                pUU.OLrzqt(HardwareImpl.TAG, "Error checking if hardware test should run, defaulting to run", e);
                return true;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [188=4] */
        private final void markHardwareCompatibilityTestComplete(Context context, boolean z) {
            String str;
            int i = 2 % 2;
            int i2 = copydefault + 57;
            OLrzqt = i2 % 128;
            int i3 = i2 % 2;
            try {
                SharedPreferences.Editor editorEdit = context.getSharedPreferences("web3_hardware_test_prefs", 0).edit();
                editorEdit.putBoolean("last_test_successful", z);
                editorEdit.putLong("last_test_timestamp", System.currentTimeMillis());
                if (!(!z)) {
                    try {
                        str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                    } catch (Exception unused) {
                    }
                    if (str == null) {
                        int i4 = OLrzqt + 27;
                        copydefault = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 84 / 0;
                        }
                        str = "unknown";
                    }
                    String str2 = str + "_" + Build.VERSION.RELEASE;
                    editorEdit.putString("last_tested_version_key", str2);
                    pUU.KWHzl(HardwareImpl.TAG, "Hardware compatibility test marked as successful for version: " + str2);
                } else {
                    pUU.valueOf(HardwareImpl.TAG, "Hardware compatibility test marked as failed - will retry on next init");
                    int i6 = copydefault + 109;
                    OLrzqt = i6 % 128;
                    int i7 = i6 % 2;
                }
                editorEdit.apply();
            } catch (Exception e) {
                pUU.OLrzqt(HardwareImpl.TAG, "Error saving hardware test completion status", e);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean detectStrongBoxSupport(@NotNull Context context) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            if (Build.VERSION.SDK_INT < 28) {
                int i2 = OLrzqt + 59;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            try {
                if (!context.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                    return false;
                }
                int i4 = OLrzqt + 81;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return !(testStrongBoxFunctionality() ^ true);
                }
                testStrongBoxFunctionality();
                throw null;
            } catch (Exception unused) {
                return false;
            }
        }

        public final boolean detectTEESupport() throws Throwable {
            boolean zTestBasicAndroidKeyStoreFunction;
            int i = 2 % 2;
            int i2 = OLrzqt + 87;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            try {
                zTestBasicAndroidKeyStoreFunction = testBasicAndroidKeyStoreFunction();
            } catch (Exception unused) {
                zTestBasicAndroidKeyStoreFunction = false;
            }
            int i4 = OLrzqt + 17;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return zTestBasicAndroidKeyStoreFunction;
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [282=5] */
        private final boolean testBasicAndroidKeyStoreFunction() throws Throwable {
            int i = 2 % 2;
            try {
                Object[] objArr = new Object[1];
                a(new char[]{39654, 39591, 53804, 34200, 3095, 38876, 3776, 36081, 52131, 56511, 44816, 15270, 46707, 58667, 46783, 8449, 55777, 7848, 49153}, 0, objArr);
                KeyStore keyStore = KeyStore.getInstance(((String) objArr[0]).intern());
                keyStore.load(null);
                if (keyStore.containsAlias(HardwareImpl.TEE_TEST_ALIAS)) {
                    int i2 = copydefault + 57;
                    OLrzqt = i2 % 128;
                    try {
                        if (i2 % 2 == 0) {
                            keyStore.deleteEntry(HardwareImpl.TEE_TEST_ALIAS);
                            int i3 = 86 / 0;
                        } else {
                            keyStore.deleteEntry(HardwareImpl.TEE_TEST_ALIAS);
                        }
                    } catch (Exception e) {
                        e.getMessage();
                        monitorCapabilityTestFailure("TEE", "pre_cleanup", e, C56423yEv.EZpvd(C56390yDp.OLrzqt("test_alias", HardwareImpl.TEE_TEST_ALIAS)));
                        return false;
                    }
                }
                KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(HardwareImpl.TEE_TEST_ALIAS, 3).setKeySize(256).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").build();
                Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "");
                Object[] objArr2 = new Object[1];
                a(new char[]{39654, 39591, 53804, 34200, 3095, 38876, 3776, 36081, 52131, 56511, 44816, 15270, 46707, 58667, 46783, 8449, 55777, 7848, 49153}, 0, objArr2);
                KeyGenerator keyGenerator = KeyGenerator.getInstance(BouncyCastleKeyManagementRepository.AES, ((String) objArr2[0]).intern());
                keyGenerator.init(keyGenParameterSpecBuild);
                SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
                Intrinsics.copydefault(secretKeyGenerateKey);
                if (!isHardwareBacked(secretKeyGenerateKey)) {
                    int i4 = OLrzqt + 17;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    return false;
                }
                byte[] bytes = "test".getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                try {
                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    cipher.init(1, secretKeyGenerateKey);
                    byte[] iv = cipher.getIV();
                    cipher.getProvider().getName();
                    byte[] bArrDoFinal = cipher.doFinal(bytes);
                    cipher.init(2, secretKeyGenerateKey, new GCMParameterSpec(128, iv));
                    byte[] bArrDoFinal2 = cipher.doFinal(bArrDoFinal);
                    boolean zEquals = Arrays.equals(bytes, bArrDoFinal2);
                    Intrinsics.copydefault(bArrDoFinal);
                    yDT.fill$default(bArrDoFinal, (byte) 0, 0, 0, 6, (Object) null);
                    Intrinsics.copydefault(bArrDoFinal2);
                    yDT.fill$default(bArrDoFinal2, (byte) 0, 0, 0, 6, (Object) null);
                    yDT.fill$default(bytes, (byte) 0, 0, 0, 6, (Object) null);
                    try {
                        Object[] objArr3 = new Object[1];
                        a(new char[]{39654, 39591, 53804, 34200, 3095, 38876, 3776, 36081, 52131, 56511, 44816, 15270, 46707, 58667, 46783, 8449, 55777, 7848, 49153}, 0, objArr3);
                        KeyStore keyStore2 = KeyStore.getInstance(((String) objArr3[0]).intern());
                        keyStore2.load(null);
                        if (keyStore2.containsAlias(HardwareImpl.TEE_TEST_ALIAS)) {
                            keyStore2.deleteEntry(HardwareImpl.TEE_TEST_ALIAS);
                        }
                        return zEquals;
                    } catch (Exception e2) {
                        monitorCapabilityTestFailure("TEE", "key_cleanup", e2, C56424yEw.gEmmrt(C56390yDp.OLrzqt("test_alias", HardwareImpl.TEE_TEST_ALIAS), C56390yDp.OLrzqt("cleanup_stage", "post_test")));
                        return false;
                    }
                } catch (Throwable th) {
                    yDT.fill$default(bytes, (byte) 0, 0, 0, 6, (Object) null);
                    throw th;
                }
            } catch (Exception unused) {
                return false;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isHardwareBacked(@NotNull SecretKey secretKey) throws Throwable {
            KeySpec keySpec;
            int i = 2 % 2;
            int i2 = OLrzqt + 73;
            copydefault = i2 % 128;
            boolean zIsInsideSecureHardware = false;
            try {
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(secretKey, "");
                    String algorithm = secretKey.getAlgorithm();
                    Object[] objArr = new Object[1];
                    a(new char[]{39654, 39591, 53804, 34200, 3095, 38876, 3776, 36081, 52131, 56511, 44816, 15270, 46707, 58667, 46783, 8449, 55777, 7848, 49153}, 1, objArr);
                    keySpec = SecretKeyFactory.getInstance(algorithm, ((String) objArr[0]).intern()).getKeySpec(secretKey, KeyInfo.class);
                    Intrinsics.copydefault(keySpec);
                } else {
                    Intrinsics.checkNotNullParameter(secretKey, "");
                    String algorithm2 = secretKey.getAlgorithm();
                    Object[] objArr2 = new Object[1];
                    a(new char[]{39654, 39591, 53804, 34200, 3095, 38876, 3776, 36081, 52131, 56511, 44816, 15270, 46707, 58667, 46783, 8449, 55777, 7848, 49153}, 0, objArr2);
                    keySpec = SecretKeyFactory.getInstance(algorithm2, ((String) objArr2[0]).intern()).getKeySpec(secretKey, KeyInfo.class);
                    Intrinsics.copydefault(keySpec);
                }
                zIsInsideSecureHardware = ((KeyInfo) keySpec).isInsideSecureHardware();
            } catch (Exception unused) {
            }
            int i3 = OLrzqt + 117;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                return zIsInsideSecureHardware;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final KeyInfo tryGetKeyInfo(@NotNull SecretKey secretKey) throws Throwable {
            KeySpec keySpec;
            int i = 2 % 2;
            int i2 = OLrzqt + 95;
            copydefault = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(secretKey, "");
                    String algorithm = secretKey.getAlgorithm();
                    Object[] objArr = new Object[1];
                    a(new char[]{39654, 39591, 53804, 34200, 3095, 38876, 3776, 36081, 52131, 56511, 44816, 15270, 46707, 58667, 46783, 8449, 55777, 7848, 49153}, 0, objArr);
                    keySpec = SecretKeyFactory.getInstance(algorithm, ((String) objArr[0]).intern()).getKeySpec(secretKey, KeyInfo.class);
                } else {
                    Intrinsics.checkNotNullParameter(secretKey, "");
                    String algorithm2 = secretKey.getAlgorithm();
                    Object[] objArr2 = new Object[1];
                    a(new char[]{39654, 39591, 53804, 34200, 3095, 38876, 3776, 36081, 52131, 56511, 44816, 15270, 46707, 58667, 46783, 8449, 55777, 7848, 49153}, 0, objArr2);
                    keySpec = SecretKeyFactory.getInstance(algorithm2, ((String) objArr2[0]).intern()).getKeySpec(secretKey, KeyInfo.class);
                }
                Intrinsics.copydefault(keySpec);
                KeyInfo keyInfo = (KeyInfo) keySpec;
                int i3 = copydefault + 103;
                OLrzqt = i3 % 128;
                int i4 = i3 % 2;
                return keyInfo;
            } catch (Exception unused) {
                return null;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isStrongBoxBacked(@NotNull SecretKey secretKey) throws Throwable {
            int i;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(secretKey, "");
            KeyInfo keyInfoTryGetKeyInfo = tryGetKeyInfo(secretKey);
            if (keyInfoTryGetKeyInfo == null) {
                return false;
            }
            Boolean bool = null;
            try {
                Object objInvoke = keyInfoTryGetKeyInfo.getClass().getMethod("getSecurityLevel", new Class[0]).invoke(keyInfoTryGetKeyInfo, new Object[0]);
                Intrinsics.copydefault(objInvoke);
                int iIntValue = ((Integer) objInvoke).intValue();
                try {
                    i = KeyProperties.class.getField("SECURITY_LEVEL_STRONGBOX").getInt(null);
                } catch (Exception unused) {
                    i = 2;
                }
                if (iIntValue == i) {
                    return true;
                }
            } catch (Exception unused2) {
            }
            try {
                Object objInvoke2 = keyInfoTryGetKeyInfo.getClass().getMethod("isStrongBoxBacked", new Class[0]).invoke(keyInfoTryGetKeyInfo, new Object[0]);
                if (!(!(objInvoke2 instanceof Boolean))) {
                    int i3 = copydefault + 121;
                    int i4 = i3 % 128;
                    OLrzqt = i4;
                    int i5 = i3 % 2;
                    bool = (Boolean) objInvoke2;
                    int i6 = i4 + 87;
                    copydefault = i6 % 128;
                    int i7 = i6 % 2;
                }
                return Intrinsics.EZpvd(bool, Boolean.TRUE);
            } catch (Exception unused3) {
                return false;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [429=6] */
        public final boolean testStrongBoxFunctionality() throws Throwable {
            int i = 2 % 2;
            try {
                Object[] objArr = new Object[1];
                a(new char[]{39654, 39591, 53804, 34200, 3095, 38876, 3776, 36081, 52131, 56511, 44816, 15270, 46707, 58667, 46783, 8449, 55777, 7848, 49153}, 0, objArr);
                KeyStore keyStore = KeyStore.getInstance(((String) objArr[0]).intern());
                keyStore.load(null);
                if (!(!keyStore.containsAlias(HardwareImpl.SB_TEST_ALIAS))) {
                    int i2 = copydefault + 93;
                    OLrzqt = i2 % 128;
                    int i3 = i2 % 2;
                    try {
                        keyStore.deleteEntry(HardwareImpl.SB_TEST_ALIAS);
                    } catch (Exception e) {
                        e.getMessage();
                        WrapUtilsImpl.INSTANCE.monitorCallError("testStrongBoxFunctionality", "Pre-cleanup failed: " + e.getMessage());
                        return false;
                    }
                }
                KeyGenParameterSpec.Builder encryptionPaddings = new KeyGenParameterSpec.Builder(HardwareImpl.SB_TEST_ALIAS, 3).setKeySize(256).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding");
                Intrinsics.checkNotNullExpressionValue(encryptionPaddings, "");
                if (Build.VERSION.SDK_INT >= 28) {
                    encryptionPaddings.setIsStrongBoxBacked(true);
                    KeyGenParameterSpec keyGenParameterSpecBuild = encryptionPaddings.build();
                    Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "");
                    Object[] objArr2 = new Object[1];
                    a(new char[]{39654, 39591, 53804, 34200, 3095, 38876, 3776, 36081, 52131, 56511, 44816, 15270, 46707, 58667, 46783, 8449, 55777, 7848, 49153}, 0, objArr2);
                    KeyGenerator keyGenerator = KeyGenerator.getInstance(BouncyCastleKeyManagementRepository.AES, ((String) objArr2[0]).intern());
                    keyGenerator.init(keyGenParameterSpecBuild);
                    SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
                    Intrinsics.copydefault(secretKeyGenerateKey);
                    try {
                        if (!isStrongBoxBacked(secretKeyGenerateKey)) {
                            int i4 = OLrzqt + 125;
                            copydefault = i4 % 128;
                            int i5 = i4 % 2;
                            return false;
                        }
                        byte[] bytes = "test".getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "");
                        try {
                            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                            cipher.init(1, secretKeyGenerateKey);
                            byte[] iv = cipher.getIV();
                            byte[] bArrDoFinal = cipher.doFinal(bytes);
                            cipher.init(2, secretKeyGenerateKey, new GCMParameterSpec(128, iv));
                            byte[] bArrDoFinal2 = cipher.doFinal(bArrDoFinal);
                            boolean zEquals = Arrays.equals(bytes, bArrDoFinal2);
                            Intrinsics.copydefault(bArrDoFinal);
                            yDT.fill$default(bArrDoFinal, (byte) 0, 0, 0, 6, (Object) null);
                            Intrinsics.copydefault(bArrDoFinal2);
                            yDT.fill$default(bArrDoFinal2, (byte) 0, 0, 0, 6, (Object) null);
                            Intrinsics.copydefault(iv);
                            yDT.fill$default(iv, (byte) 0, 0, 0, 6, (Object) null);
                            yDT.fill$default(bytes, (byte) 0, 0, 0, 6, (Object) null);
                            try {
                                Object[] objArr3 = new Object[1];
                                a(new char[]{39654, 39591, 53804, 34200, 3095, 38876, 3776, 36081, 52131, 56511, 44816, 15270, 46707, 58667, 46783, 8449, 55777, 7848, 49153}, 0, objArr3);
                                KeyStore keyStore2 = KeyStore.getInstance(((String) objArr3[0]).intern());
                                keyStore2.load(null);
                                if (keyStore2.containsAlias(HardwareImpl.SB_TEST_ALIAS)) {
                                    int i6 = copydefault + 83;
                                    OLrzqt = i6 % 128;
                                    int i7 = i6 % 2;
                                    keyStore2.deleteEntry(HardwareImpl.SB_TEST_ALIAS);
                                }
                                return zEquals;
                            } catch (Exception unused) {
                                WrapUtilsImpl.INSTANCE.monitorCallError("testStrongBoxFunctionality", "Key deletion failed");
                                return false;
                            }
                        } catch (Throwable th) {
                            yDT.fill$default(bytes, (byte) 0, 0, 0, 6, (Object) null);
                            throw th;
                        }
                    } catch (Exception unused2) {
                        return false;
                    }
                }
            } catch (Exception unused3) {
            }
            return false;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.web3.security.utils.internal.HardwareImpl$Companion */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void monitorCapabilityTestFailure$default(Companion companion, String str, String str2, Throwable th, Map map, int i, Object obj) {
            int i2 = 2 % 2;
            Object obj2 = null;
            if ((i & 4) != 0) {
                int i3 = OLrzqt;
                int i4 = i3 + 23;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                int i5 = i3 + 7;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                th = null;
            }
            if ((i & 8) != 0) {
                int i7 = copydefault + 31;
                OLrzqt = i7 % 128;
                if (i7 % 2 == 0) {
                    C56424yEw.KWHzl();
                    obj2.hashCode();
                    throw null;
                }
                map = C56424yEw.KWHzl();
            }
            companion.monitorCapabilityTestFailure(str, str2, th, map);
        }

        private final void monitorCapabilityTestFailure(String str, String str2, Throwable th, Map<String, String> map) {
            int i = 2 % 2;
            try {
                EventData eventData = new EventData();
                eventData.setAct("web3_hardware_capability_test_failure");
                eventData.setMsg(str + " - " + str2);
                Map mapOLrzqt = C56423yEv.OLrzqt();
                mapOLrzqt.put("test_type", str);
                mapOLrzqt.put("failure_phase", str2);
                mapOLrzqt.put(CrashHianalyticsData.THREAD_NAME, Thread.currentThread().getName());
                mapOLrzqt.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
                mapOLrzqt.put("device_model", Build.MODEL);
                mapOLrzqt.put("device_manufacturer", Build.MANUFACTURER);
                mapOLrzqt.put("android_version", Build.VERSION.RELEASE);
                mapOLrzqt.put("security_patch", Build.VERSION.SECURITY_PATCH);
                if (th != null) {
                    mapOLrzqt.put("exception_type", th.getClass().getSimpleName());
                    String message = th.getMessage();
                    if (message == null) {
                        message = "No message";
                        int i2 = OLrzqt + 61;
                        copydefault = i2 % 128;
                        int i3 = i2 % 2;
                    }
                    mapOLrzqt.put("exception_message", message);
                }
                mapOLrzqt.putAll(map);
                eventData.setAttrs(C56423yEv.AYXKKw(mapOLrzqt));
                pUU.valueOf(HardwareImpl.TAG, "monitorCapabilityTestFailure: " + str + " - " + str2);
                ReportManager.AEQbTJ.EZpvd(eventData);
            } catch (Exception e) {
                pUU.OLrzqt(HardwareImpl.TAG, "Failed to report capability test failure", e);
                int i4 = copydefault + 29;
                OLrzqt = i4 % 128;
                int i5 = i4 % 2;
            }
        }

        public static /* synthetic */ String getSecureStackTrace$default(Companion companion, Throwable th, int i, int i2, Object obj) {
            int i3 = 2 % 2;
            if ((i2 & 2) != 0) {
                int i4 = OLrzqt + 93;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                i = 10;
            }
            String secureStackTrace = companion.getSecureStackTrace(th, i);
            int i6 = OLrzqt + 107;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                return secureStackTrace;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        private static final CharSequence getSecureStackTrace$lambda$8(StackTraceElement stackTraceElement) {
            int i = 2 % 2;
            String str = stackTraceElement.getClassName() + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + stackTraceElement.getMethodName() + "(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
            int i2 = copydefault + 99;
            OLrzqt = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 38 / 0;
            }
            return str;
        }

        private final String getSecureStackTrace(Throwable th, int i) {
            int i2 = 2 % 2;
            try {
                StackTraceElement[] stackTrace = th.getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace, "");
                String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(yDV.AhwBna(stackTrace, i), "\n", null, null, 0, null, new Function1() { // from class: com.okinc.web3.security.utils.internal.HardwareImpl$Companion$$ExternalSyntheticLambda1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HardwareImpl.Companion.m7167$r8$lambda$b9eBPHmuLPfcukZPm1jEFlK9iY((StackTraceElement) obj);
                    }
                }, 30, null);
                int i3 = copydefault + 23;
                OLrzqt = i3 % 128;
                int i4 = i3 % 2;
                return strJoinToString$default;
            } catch (Exception e) {
                return "Stack trace unavailable: " + e.getMessage();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [235=7] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(int i, int i2, byte b, short s, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        boolean z2;
        int i5 = 2 % 2;
        Zj zj = new Zj();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(copydefault)};
            Object objEZpvd = YY.EZpvd(-1048485176);
            if (objEZpvd == null) {
                objEZpvd = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objEZpvd).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i6 = $10 + 41;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = EZpvd;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i8 = 0; i8 < length; i8++) {
                        int i9 = $11 + 27;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                        Object objEZpvd2 = YY.EZpvd(1815080187);
                        if (objEZpvd2 == null) {
                            objEZpvd2 = YY.EZpvd(49, 4, (char) 14683, 1745822087, false, "l", new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objEZpvd2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = EZpvd;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(KWHzl)};
                    Object objEZpvd3 = YY.EZpvd(-1048485176);
                    if (objEZpvd3 == null) {
                        objEZpvd3 = YY.EZpvd(1075, 5, (char) 0, -979259468, false, "g", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objEZpvd3).invoke(null, objArr4)).intValue()]) ^ (-2166281683126510581L))) + ((int) (((long) copydefault) ^ (-2166281683126510581L))));
                } else {
                    iIntValue = (short) (((short) (((long) AEQbTJ[i3 + ((int) (((long) KWHzl) ^ (-2166281683126510581L)))]) ^ (-2166281683126510581L))) + ((int) (((long) copydefault) ^ (-2166281683126510581L))));
                }
            }
            if (iIntValue > 0) {
                int i11 = ((i3 + iIntValue) - 2) + ((int) (((long) KWHzl) ^ (-2166281683126510581L)));
                if (z) {
                    int i12 = $10 + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                zj.OLrzqt = i11 + i4;
                Object[] objArr5 = {zj, Integer.valueOf(i), Integer.valueOf(OLrzqt), sb};
                Object objEZpvd4 = YY.EZpvd(-2015189563);
                if (objEZpvd4 == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 - 1);
                    objEZpvd4 = YY.EZpvd(180, 4, (char) 19181, -2084411207, false, $$c(b2, b3, (byte) (b3 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objEZpvd4).invoke(null, objArr5)).append(zj.EZpvd);
                zj.AEQbTJ = zj.EZpvd;
                byte[] bArr4 = EZpvd;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr5[i14] = (byte) (((long) bArr4[i14]) ^ (-2166281683126510581L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i15 = $11 + 15;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                zj.KWHzl = 1;
                while (zj.KWHzl < iIntValue) {
                    if (!(!z2)) {
                        int i17 = $10 + 25;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                        byte[] bArr6 = EZpvd;
                        zj.OLrzqt = zj.OLrzqt - 1;
                        zj.EZpvd = (char) (zj.AEQbTJ + (((byte) (((byte) (((long) bArr6[r8]) ^ (-2166281683126510581L))) + s)) ^ b));
                    } else {
                        short[] sArr = AEQbTJ;
                        zj.OLrzqt = zj.OLrzqt - 1;
                        zj.EZpvd = (char) (zj.AEQbTJ + (((short) (((short) (((long) sArr[r8]) ^ (-2166281683126510581L))) + s)) ^ b));
                    }
                    sb.append(zj.EZpvd);
                    zj.AEQbTJ = zj.EZpvd;
                    zj.KWHzl++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // com.okinc.web3.security.utils.internal.WrapUtilsBase
    public void init() {
        int i = 2 % 2;
        try {
            pUU.KWHzl(TAG, "HardwareImpl init start[" + Thread.currentThread().getName() + "] - supportLevel: " + this.supportLevel);
            retrieveWrappedSecretCache();
            pUU.KWHzl(TAG, "HardwareImpl init end[" + Thread.currentThread().getName() + "] - supportLevel: " + this.supportLevel);
            int i2 = valueOf + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
            AhwBna = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (Exception e) {
            monitorHardwareOperationException$default(this, "init", e, "hardware_initialization", null, 8, null);
            throw e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.web3.security.utils.internal.WrapUtilsBase
    public byte[] wrap(@NotNull byte[] bArr) throws Exception {
        int i = 2 % 2;
        int i2 = valueOf + 67;
        AhwBna = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(bArr, "");
                wrapDirect(bArr);
                throw null;
            }
            Intrinsics.checkNotNullParameter(bArr, "");
            byte[] bArrWrapDirect = wrapDirect(bArr);
            int i3 = AhwBna + 81;
            valueOf = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 38 / 0;
            }
            return bArrWrapDirect;
        } catch (Exception e) {
            monitorHardwareOperationException("wrap", e, "core_crypto_operation", C56423yEv.EZpvd(C56390yDp.OLrzqt("input_size", String.valueOf(bArr.length))));
            throw e;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.web3.security.utils.internal.WrapUtilsBase
    public byte[] unwrap(@NotNull byte[] bArr) throws Exception {
        int i = 2 % 2;
        int i2 = valueOf + 97;
        AhwBna = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        WrapUtilsImpl wrapUtilsImpl = WrapUtilsImpl.INSTANCE;
        if (!wrapUtilsImpl.isAuthorizedUnwrapCaller()) {
            int i4 = valueOf + 91;
            AhwBna = i4 % 128;
            if (i4 % 2 != 0) {
                wrapUtilsImpl.monitorSecurityAttack("Unauthorized access attempt to unwrap method (Hardware)", wrapUtilsImpl.getSecureStackTrace());
                wrapUtilsImpl.isCallerCheckHitGray();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            wrapUtilsImpl.monitorSecurityAttack("Unauthorized access attempt to unwrap method (Hardware)", wrapUtilsImpl.getSecureStackTrace());
            if (wrapUtilsImpl.isCallerCheckHitGray()) {
                throw new SecurityException("Unauthorized caller for unwrap operation (Hardware)");
            }
        }
        try {
            return unwrapDirect(bArr);
        } catch (Exception e) {
            monitorHardwareOperationException("unwrap (Hardware)", e, "core_crypto_operation", C56423yEv.EZpvd(C56390yDp.OLrzqt("input_size", String.valueOf(bArr.length))));
            throw e;
        }
    }

    private final byte[] wrapDirect(byte[] bArr) throws Exception {
        int i = 2 % 2;
        int i2 = valueOf + 67;
        AhwBna = i2 % 128;
        int i3 = i2 % 2;
        byte[] cachesAtomically = readCachesAtomically();
        if (cachesAtomically == null) {
            int i4 = valueOf + 49;
            AhwBna = i4 % 128;
            int i5 = i4 % 2;
            cachesAtomically = retrieveWrappedSecretCache();
        }
        byte[] bArrUnwrapSecret = unwrapSecret(cachesAtomically);
        try {
            CryptoUtilities cryptoUtilities = CryptoUtilities.INSTANCE;
            byte[] bArrEncryptAESGCM = cryptoUtilities.encryptAESGCM(bArr, cryptoUtilities.createAESKey(bArrUnwrapSecret));
            cryptoUtilities.secureCleanup(bArrUnwrapSecret);
            int i6 = valueOf + 123;
            AhwBna = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 96 / 0;
            }
            return bArrEncryptAESGCM;
        } catch (Throwable th) {
            CryptoUtilities.INSTANCE.secureCleanup(bArrUnwrapSecret);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final byte[] unwrapDirect(byte[] bArr) throws Exception {
        int i = 2 % 2;
        int i2 = AhwBna + 117;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 65 / 0;
            if (!isCalledFromUnwrap()) {
                WrapUtilsImpl wrapUtilsImpl = WrapUtilsImpl.INSTANCE;
                wrapUtilsImpl.monitorSecurityAttack("Direct unauthorized access attempt to unwrapDirect method (Hardware)", wrapUtilsImpl.getSecureStackTrace());
                if (!wrapUtilsImpl.isCallerCheckHitGray()) {
                    int i4 = AhwBna + 89;
                    valueOf = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    throw new SecurityException("unwrapDirect can only be called from unwrap method (Hardware)");
                }
            }
        } else if (!isCalledFromUnwrap()) {
        }
        byte[] cachesAtomically = readCachesAtomically();
        if (cachesAtomically == null) {
            cachesAtomically = retrieveWrappedSecretCache();
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

    private final SecretKey getOrCreateAesKey() throws Throwable {
        int i = 2 % 2;
        int i2 = AhwBna + 47;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        SecretKey orCreateAesKeyDirect = getOrCreateAesKeyDirect();
        int i4 = AhwBna + 119;
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 40 / 0;
        }
        return orCreateAesKeyDirect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final SecretKey getOrCreateAesKeyDirect() throws Throwable {
        int i = 2 % 2;
        int i2 = valueOf + 1;
        AhwBna = i2 % 128;
        int i3 = i2 % 2;
        SupportLevel supportLevel = this.supportLevel;
        if (supportLevel == SupportLevel.STRONGBOX) {
            return getOrCreateHardwareKey(WRAP_ALIAS, true);
        }
        if (supportLevel == SupportLevel.TEE) {
            SecretKey orCreateHardwareKey = getOrCreateHardwareKey(WRAP_ALIAS, false);
            int i4 = AhwBna + 1;
            valueOf = i4 % 128;
            int i5 = i4 % 2;
            return orCreateHardwareKey;
        }
        throw new IllegalStateException("Invalid supportLevel for HardwareImpl: " + this.supportLevel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [674=4] */
    private final SecretKey getOrCreateHardwareKey(String str, boolean z) throws Throwable {
        int i = 2 % 2;
        try {
            Object[] objArr = new Object[1];
            a(1469541084, -88, (byte) -114, (short) 55, 1776811290, objArr);
            KeyStore keyStore = KeyStore.getInstance(((String) objArr[0]).intern());
            keyStore.load(null);
            if (!keyStore.containsAlias(str)) {
                SecretKey secretKeyCreateAesKey = createAesKey(str, z);
                int i2 = AhwBna + 77;
                valueOf = i2 % 128;
                int i3 = i2 % 2;
                return secretKeyCreateAesKey;
            }
            int i4 = AhwBna + 51;
            valueOf = i4 % 128;
            if (i4 % 2 != 0) {
                Key key = keyStore.getKey(str, null);
                Intrinsics.copydefault(key);
                return (SecretKey) key;
            }
            Key key2 = keyStore.getKey(str, null);
            Intrinsics.copydefault(key2);
            int i5 = 4 / 0;
            return (SecretKey) key2;
        } catch (Exception e) {
            monitorHardwareOperationException("getOrCreateHardwareKey (Hardware)", e, "hardware_key_management", C56424yEw.gEmmrt(C56390yDp.OLrzqt("key_alias", str), C56390yDp.OLrzqt("use_strongbox", String.valueOf(z)), C56390yDp.OLrzqt("support_level", this.supportLevel.toString())));
            throw new IllegalStateException("Failed to get or create hardware key: " + e.getMessage(), e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [711=4] */
    private final SecretKey createAesKey(String str, boolean z) throws Exception {
        int i = 2 % 2;
        try {
            KeyGenParameterSpec.Builder encryptionPaddings = new KeyGenParameterSpec.Builder(str, 3).setKeySize(256).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding");
            Intrinsics.checkNotNullExpressionValue(encryptionPaddings, "");
            if (z) {
                int i2 = valueOf + 15;
                AhwBna = i2 % 128;
                int i3 = i2 % 2;
                if (Build.VERSION.SDK_INT >= 28) {
                    encryptionPaddings.setIsStrongBoxBacked(true);
                }
            }
            KeyGenParameterSpec keyGenParameterSpecBuild = encryptionPaddings.build();
            Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "");
            Object[] objArr = new Object[1];
            a(1469541084, -88, (byte) -114, (short) 55, 1776811290, objArr);
            KeyGenerator keyGenerator = KeyGenerator.getInstance(BouncyCastleKeyManagementRepository.AES, ((String) objArr[0]).intern());
            keyGenerator.init(keyGenParameterSpecBuild);
            SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
            Intrinsics.checkNotNullExpressionValue(secretKeyGenerateKey, "");
            int i4 = valueOf + 25;
            AhwBna = i4 % 128;
            int i5 = i4 % 2;
            return secretKeyGenerateKey;
        } catch (Exception e) {
            monitorHardwareOperationException("createAesKey (Hardware)", e, "hardware_key_creation", C56424yEw.gEmmrt(C56390yDp.OLrzqt("key_alias", str), C56390yDp.OLrzqt("use_strongbox", String.valueOf(z)), C56390yDp.OLrzqt("support_level", this.supportLevel.toString()), C56390yDp.OLrzqt("api_level", String.valueOf(Build.VERSION.SDK_INT))));
            throw e;
        }
    }

    private final byte[] wrapSecret(byte[] bArr) throws Exception {
        int i = 2 % 2;
        int i2 = valueOf + 49;
        AhwBna = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrWrapSecretDirect = wrapSecretDirect(bArr);
        int i4 = AhwBna + 13;
        valueOf = i4 % 128;
        int i5 = i4 % 2;
        return bArrWrapSecretDirect;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final byte[] wrapSecretDirect(byte[] bArr) throws Exception {
        byte[] bArr2;
        String string;
        String string2;
        Cipher cipher;
        byte[] iv;
        int i = 2 % 2;
        int i2 = valueOf + 29;
        AhwBna = i2 % 128;
        int i3 = i2 % 2;
        SecretKey orCreateAesKey = getOrCreateAesKey();
        byte[] bArrDoFinal = null;
        try {
            cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, orCreateAesKey);
            iv = cipher.getIV();
        } catch (Exception e) {
            e = e;
            bArr2 = null;
        }
        try {
            bArrDoFinal = cipher.doFinal(bArr);
            Intrinsics.copydefault(iv);
            Intrinsics.copydefault(bArrDoFinal);
            return yDT.copydefault(iv, bArrDoFinal);
        } catch (Exception e2) {
            e = e2;
            byte[] bArr3 = bArrDoFinal;
            bArrDoFinal = iv;
            bArr2 = bArr3;
            Pair[] pairArr = new Pair[3];
            pairArr[0] = C56390yDp.OLrzqt("support_level", this.supportLevel.toString());
            String str = AbstractJsonLexerKt.NULL;
            if (bArrDoFinal != null) {
                int i4 = AhwBna + 55;
                valueOf = i4 % 128;
                if (i4 % 2 == 0) {
                    string = Integer.valueOf(bArrDoFinal.length).toString();
                    int i5 = 32 / 0;
                    if (string == null) {
                        string = AbstractJsonLexerKt.NULL;
                    }
                } else {
                    string = Integer.valueOf(bArrDoFinal.length).toString();
                    if (string == null) {
                    }
                }
            }
            pairArr[1] = C56390yDp.OLrzqt("iv_length", string);
            if (bArr2 != null && (string2 = Integer.valueOf(bArr2.length).toString()) != null) {
                str = string2;
            }
            pairArr[2] = C56390yDp.OLrzqt("ct_length", str);
            monitorHardwareOperationException("wrapSecretDirect", e, "secret_encryption", C56424yEw.gEmmrt(pairArr));
            throw e;
        }
    }

    private final byte[] unwrapSecret(byte[] bArr) throws Exception {
        int i = 2 % 2;
        int i2 = AhwBna + 27;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrUnwrapSecretDirect = unwrapSecretDirect(bArr);
        int i4 = valueOf + 35;
        AhwBna = i4 % 128;
        int i5 = i4 % 2;
        return bArrUnwrapSecretDirect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [785=4] */
    private final byte[] unwrapSecretDirect(byte[] bArr) throws Exception {
        Exception exc;
        byte[] bArr2;
        String string;
        SecretKey orCreateAesKeyDirect;
        Cipher cipher;
        byte[] bArrAEQbTJ;
        int i = 2 % 2;
        byte[] bArrAEQbTJ2 = null;
        try {
            orCreateAesKeyDirect = getOrCreateAesKeyDirect();
            cipher = Cipher.getInstance("AES/GCM/NoPadding");
            bArrAEQbTJ = yDT.AEQbTJ(bArr, 0, 12);
        } catch (Exception e) {
            exc = e;
            bArr2 = null;
        }
        try {
            bArrAEQbTJ2 = yDT.AEQbTJ(bArr, 12, bArr.length);
            cipher.init(2, orCreateAesKeyDirect, new GCMParameterSpec(128, bArrAEQbTJ));
            byte[] bArrDoFinal = cipher.doFinal(bArrAEQbTJ2);
            Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "");
            return bArrDoFinal;
        } catch (Exception e2) {
            exc = e2;
            bArr2 = bArrAEQbTJ2;
            bArrAEQbTJ2 = bArrAEQbTJ;
            Pair[] pairArr = new Pair[4];
            pairArr[0] = C56390yDp.OLrzqt("wrapped_size", String.valueOf(bArr.length));
            pairArr[1] = C56390yDp.OLrzqt("support_level", this.supportLevel.toString());
            String str = AbstractJsonLexerKt.NULL;
            if (bArrAEQbTJ2 == null || (string = Integer.valueOf(bArrAEQbTJ2.length).toString()) == null) {
                string = AbstractJsonLexerKt.NULL;
            }
            pairArr[2] = C56390yDp.OLrzqt("iv_length", string);
            if (bArr2 != null) {
                int i2 = AhwBna + 65;
                valueOf = i2 % 128;
                int i3 = i2 % 2;
                String string2 = Integer.valueOf(bArr2.length).toString();
                if (string2 == null) {
                    int i4 = valueOf + 61;
                    AhwBna = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 3 % 5;
                    }
                } else {
                    str = string2;
                }
            }
            pairArr[3] = C56390yDp.OLrzqt("ct_length", str);
            monitorHardwareOperationException("unwrapSecretDirect", exc, "secret_decryption", C56424yEw.gEmmrt(pairArr));
            throw exc;
        }
    }

    private final void updateCachesAtomically(byte[] bArr) {
        synchronized (this.mSecretCacheLock) {
            getOrCreateAesKeyDirect();
            this.wrappedSecretCache.set(bArr);
            pUU.EZpvd(TAG, "Caches updated atomically - AES key type: Hardware (level: " + this.supportLevel + ")");
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
                    pUU.valueOf(TAG, "Hardware AES key unavailable - this indicates hardware/keystore issues: " + e.getMessage());
                    monitorCacheInconsistency("readCachesAtomically", "HARDWARE_AES_KEY_UNAVAILABLE", "Hardware AES key not available during cache read: " + e.getMessage());
                    bArr2 = null;
                }
                bArr = bArr2;
            } else if (MemoryReclaimDetector.INSTANCE.isMemoryReclaimed()) {
                pUU.valueOf(TAG, "Memory reclaim detected - hardware cache is null");
                WrapUtilsImpl.INSTANCE.monitorCallError("hardware_memory_reclaim_detected", "Hardware wrappedSecretCache is null due to memory reclaim (" + this.supportLevel + ")");
            }
        }
        return bArr;
    }

    private final void getOrCreateSharedKey(String str, String str2) throws Throwable {
        int i = 2 % 2;
        int i2 = valueOf + 105;
        AhwBna = i2 % 128;
        if (i2 % 2 == 0) {
            KeyPair keyPairCreateHardwareKeyPair = createHardwareKeyPair(str, str2);
            if (keyPairCreateHardwareKeyPair != null) {
                updateCachesAtomically(deriveAndWrapSharedSecret(keyPairCreateHardwareKeyPair));
                try {
                    Object[] objArr = new Object[1];
                    a(1469541084, -88, (byte) -114, (short) 55, 1776811290, objArr);
                    KeyStore keyStore = KeyStore.getInstance(((String) objArr[0]).intern());
                    keyStore.load(null);
                    if (!keyStore.containsAlias(str)) {
                        return;
                    }
                    keyStore.deleteEntry(str);
                    int i3 = AhwBna + 117;
                    valueOf = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            throw new IllegalStateException("Failed to create hardware key pair for supportLevel: " + this.supportLevel);
        }
        createHardwareKeyPair(str, str2);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032 A[Catch: Exception -> 0x0122, TRY_LEAVE, TryCatch #2 {Exception -> 0x0122, blocks: (B:4:0x0021, B:22:0x008c, B:38:0x0105, B:32:0x00b6, B:36:0x00db, B:10:0x0032, B:17:0x003f, B:21:0x0064, B:8:0x002c, B:13:0x0038, B:24:0x00a2), top: B:55:0x001f, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0105 A[Catch: Exception -> 0x0122, TRY_LEAVE, TryCatch #2 {Exception -> 0x0122, blocks: (B:4:0x0021, B:22:0x008c, B:38:0x0105, B:32:0x00b6, B:36:0x00db, B:10:0x0032, B:17:0x003f, B:21:0x0064, B:8:0x002c, B:13:0x0038, B:24:0x00a2), top: B:55:0x001f, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final KeyPair createHardwareKeyPair(String str, String str2) throws Throwable {
        String str3 = str2;
        int i = 2 % 2;
        int i2 = valueOf + 13;
        AhwBna = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                int i3 = 11 / 0;
                if (this.supportLevel == SupportLevel.STRONGBOX) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        try {
                            return createEccKeyPair(str, str3, true);
                        } catch (Exception e) {
                            C43296rmc.AEQbTJ("EcdhHelper", "StrongBox ECC key generation failed, falling back to TEE: " + e.getMessage());
                            Pair[] pairArr = new Pair[4];
                            pairArr[0] = C56390yDp.OLrzqt("key_alias", str);
                            pairArr[1] = C56390yDp.OLrzqt("ec_curve", str3 == null ? "default" : str3);
                            pairArr[2] = C56390yDp.OLrzqt("support_level", this.supportLevel.toString());
                            pairArr[3] = C56390yDp.OLrzqt("fallback_reason", "strongbox_ecc_failed");
                            monitorHardwareOperationException("createHardwareKeyPair_strongbox_fallback", e, "ecc_strongbox_fallback", C56424yEw.gEmmrt(pairArr));
                            if (yDY.gEmmrt(SupportLevel.TEE, SupportLevel.STRONGBOX).contains(this.supportLevel)) {
                            }
                        }
                    }
                }
            } else if (this.supportLevel == SupportLevel.STRONGBOX) {
            }
            if (yDY.gEmmrt(SupportLevel.TEE, SupportLevel.STRONGBOX).contains(this.supportLevel)) {
                C43296rmc.AEQbTJ("EcdhHelper", "No hardware support available for ECC key generation (supportLevel: " + this.supportLevel + ")");
                return null;
            }
            try {
                KeyPair keyPairCreateEccKeyPair = createEccKeyPair(str, str3, false);
                int i4 = valueOf + 65;
                AhwBna = i4 % 128;
                if (i4 % 2 == 0) {
                    return keyPairCreateEccKeyPair;
                }
                throw null;
            } catch (Exception e2) {
                C43296rmc.AEQbTJ("EcdhHelper", "TEE ECC key generation failed: " + e2.getMessage());
                Pair[] pairArr2 = new Pair[4];
                pairArr2[0] = C56390yDp.OLrzqt("key_alias", str);
                pairArr2[1] = C56390yDp.OLrzqt("ec_curve", str3 == null ? "default" : str3);
                pairArr2[2] = C56390yDp.OLrzqt("support_level", this.supportLevel.toString());
                pairArr2[3] = C56390yDp.OLrzqt("failure_type", "tee_ecc_failed");
                monitorHardwareOperationException("createHardwareKeyPair_tee_failure", e2, "ecc_tee_failure", C56424yEw.gEmmrt(pairArr2));
                return null;
            }
        } catch (Exception e3) {
            Pair[] pairArr3 = new Pair[3];
            pairArr3[0] = C56390yDp.OLrzqt("key_alias", str);
            if (str3 == null) {
                int i5 = valueOf + 7;
                AhwBna = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                str3 = "default";
            }
            pairArr3[1] = C56390yDp.OLrzqt("ec_curve", str3);
            pairArr3[2] = C56390yDp.OLrzqt("support_level", this.supportLevel.toString());
            monitorHardwareOperationException("createHardwareKeyPair", e3, "ecc_key_generation", C56424yEw.gEmmrt(pairArr3));
            return null;
        }
    }

    private static final KeyPair createEccKeyPair$lambda$3(String str, String str2, boolean z) throws Throwable {
        int i = 2 % 2;
        KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder(str, 64).setAlgorithmParameterSpec(new ECGenParameterSpec(str2)).setDigests("SHA-256").setUserAuthenticationRequired(false);
        Intrinsics.checkNotNullExpressionValue(userAuthenticationRequired, "");
        if (z && Build.VERSION.SDK_INT >= 28) {
            int i2 = valueOf + 55;
            AhwBna = i2 % 128;
            int i3 = i2 % 2;
            userAuthenticationRequired.setIsStrongBoxBacked(true);
        }
        KeyGenParameterSpec keyGenParameterSpecBuild = userAuthenticationRequired.build();
        Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "");
        Object[] objArr = new Object[1];
        a(1469541084, -88, (byte) -114, (short) 55, 1776811290, objArr);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", ((String) objArr[0]).intern());
        keyPairGenerator.initialize(keyGenParameterSpecBuild);
        KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
        int i4 = valueOf + 69;
        AhwBna = i4 % 128;
        int i5 = i4 % 2;
        return keyPairGenerateKeyPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final boolean createEccKeyPair$lambda$4(Exception exc) {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(exc, "");
        Object obj = null;
        if ((exc instanceof KeyStoreException) || (exc instanceof ProviderException)) {
            z = true;
        } else {
            int i2 = valueOf + 93;
            AhwBna = i2 % 128;
            boolean z2 = exc instanceof InvalidAlgorithmParameterException;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (!z2) {
                z = false;
            }
        }
        int i3 = AhwBna + 21;
        valueOf = i3 % 128;
        if (i3 % 2 != 0) {
            return z;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [976=5] */
    private final KeyPair createEccKeyPair(final String str, final String str2, final boolean z) throws Exception {
        String str3;
        int i = 2 % 2;
        try {
            RetryUtils.Companion companion = RetryUtils.Companion;
            RetryConfig retryConfig = RetryConfig.Companion.getRetryConfig();
            if (z) {
                str3 = "StrongBox ECC KeyPair Generation";
            } else {
                int i2 = valueOf + 37;
                AhwBna = i2 % 128;
                int i3 = i2 % 2;
                str3 = "TEE ECC KeyPair Generation";
            }
            Object objExecuteWithRetry = companion.executeWithRetry(retryConfig, str3, new Function0() { // from class: com.okinc.web3.security.utils.internal.HardwareImpl$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HardwareImpl.m7166$r8$lambda$oHOC1iHkqJwT6c6HBhYo7AJd8s(str, str2, z);
                }
            }, new Function1() { // from class: com.okinc.web3.security.utils.internal.HardwareImpl$$ExternalSyntheticLambda1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(HardwareImpl.$r8$lambda$_0U8G_JdOnxxieraFYswhWDnsPc((Exception) obj));
                }
            });
            Intrinsics.checkNotNullExpressionValue(objExecuteWithRetry, "");
            return (KeyPair) objExecuteWithRetry;
        } catch (Exception e) {
            Pair[] pairArr = new Pair[5];
            pairArr[0] = C56390yDp.OLrzqt("key_alias", str);
            if (str2 == null) {
                int i4 = valueOf;
                int i5 = i4 + 45;
                AhwBna = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 60 / 0;
                }
                int i7 = i4 + 3;
                AhwBna = i7 % 128;
                int i8 = i7 % 2;
                str2 = "default";
            }
            pairArr[1] = C56390yDp.OLrzqt("ec_curve", str2);
            pairArr[2] = C56390yDp.OLrzqt("use_strongbox", String.valueOf(z));
            pairArr[3] = C56390yDp.OLrzqt("support_level", this.supportLevel.toString());
            pairArr[4] = C56390yDp.OLrzqt("retry_operation", "true");
            monitorHardwareOperationException("createEccKeyPair", e, "ecc_keypair_creation", C56424yEw.gEmmrt(pairArr));
            throw e;
        }
    }

    private final byte[] deriveAndWrapSharedSecret(final KeyPair keyPair) {
        int i = 2 % 2;
        byte[] bArr = (byte[]) RetryUtils.Companion.executeWithRetry(RetryConfig.Companion.getRetryConfig(), "Derive and Wrap Shared Secret", new Function0() { // from class: com.okinc.web3.security.utils.internal.HardwareImpl$$ExternalSyntheticLambda2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HardwareImpl.$r8$lambda$rMU7WHx5E1k9bELAJA6K1A_0zMs(this.f$0, keyPair);
            }
        }, new Function1() { // from class: com.okinc.web3.security.utils.internal.HardwareImpl$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(HardwareImpl.m7165$r8$lambda$npro0bDDFypAyRAe3CVl_nQIPc((Exception) obj));
            }
        });
        int i2 = valueOf + 117;
        AhwBna = i2 % 128;
        int i3 = i2 % 2;
        return bArr;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x000c */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: byte[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static final byte[] deriveAndWrapSharedSecret$lambda$5(HardwareImpl hardwareImpl, KeyPair keyPair) {
        byte[] bArrWrapSecret;
        byte[] bArr = 2;
        int i = 2 % 2;
        int i2 = AhwBna + 119;
        valueOf = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                byte[] encoded = hardwareImpl.deriveSharedSecretDirect(keyPair).getEncoded();
                Intrinsics.copydefault(encoded);
                bArrWrapSecret = hardwareImpl.wrapSecret(encoded);
                yDT.fill$default(encoded, (byte) 1, 0, 1, 82, (Object) null);
                bArr = encoded;
            } else {
                byte[] encoded2 = hardwareImpl.deriveSharedSecretDirect(keyPair).getEncoded();
                Intrinsics.copydefault(encoded2);
                bArrWrapSecret = hardwareImpl.wrapSecret(encoded2);
                yDT.fill$default(encoded2, (byte) 0, 0, 0, 6, (Object) null);
                bArr = encoded2;
            }
            return bArrWrapSecret;
        } catch (Throwable th) {
            Intrinsics.copydefault(bArr);
            yDT.fill$default(bArr, (byte) 0, 0, 0, 6, (Object) null);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final boolean deriveAndWrapSharedSecret$lambda$6(Exception exc) {
        boolean z;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(exc, "");
        if (exc instanceof GeneralSecurityException) {
            z = true;
        } else {
            int i2 = valueOf + 101;
            int i3 = i2 % 128;
            AhwBna = i3;
            int i4 = i2 % 2;
            if (exc instanceof IllegalStateException) {
                int i5 = i3 + 57;
                valueOf = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
        }
        int i7 = valueOf + 105;
        AhwBna = i7 % 128;
        int i8 = i7 % 2;
        return z;
    }

    private final String ecPublicKeyToHex(PublicKey publicKey) {
        int i = 2 % 2;
        int i2 = AhwBna + 45;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        String strEcPublicKeyToHex = CryptoUtilities.INSTANCE.ecPublicKeyToHex(publicKey);
        if (i3 == 0) {
            int i4 = 59 / 0;
        }
        return strEcPublicKeyToHex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PublicKey decodePublicKeyHex(@NotNull String str) {
        int i = 2 % 2;
        int i2 = AhwBna + 83;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        PublicKey publicKeyDecodePublicKeyHex = CryptoUtilities.INSTANCE.decodePublicKeyHex(str);
        int i4 = AhwBna + 79;
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return publicKeyDecodePublicKeyHex;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ SecretKeySpec hkdfDerivedSymmetricKey$default(HardwareImpl hardwareImpl, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = AhwBna;
        int i5 = i4 + 47;
        valueOf = i5 % 128;
        Object obj2 = null;
        if (i5 % 2 != 0 ? (i2 & 2) != 0 : (i2 & 3) != 0) {
            int i6 = i4 + 107;
            valueOf = i6 % 128;
            int i7 = i6 % 2;
            bArr2 = null;
        }
        if ((i2 & 4) != 0) {
            int i8 = valueOf + 83;
            AhwBna = i8 % 128;
            if (i8 % 2 != 0) {
                obj2.hashCode();
                throw null;
            }
            bArr3 = null;
        }
        if ((i2 & 8) != 0) {
            i = 32;
        }
        return hardwareImpl.hkdfDerivedSymmetricKey(bArr, bArr2, bArr3, i);
    }

    private final SecretKeySpec hkdfDerivedSymmetricKey(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        int i2 = 2 % 2;
        int i3 = valueOf + 61;
        AhwBna = i3 % 128;
        int i4 = i3 % 2;
        SecretKeySpec secretKeySpecHkdfDerivedSymmetricKey = CryptoUtilities.INSTANCE.hkdfDerivedSymmetricKey(bArr, bArr2, bArr3, i);
        if (i4 != 0) {
            int i5 = 79 / 0;
        }
        return secretKeySpecHkdfDerivedSymmetricKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final SecretKeySpec deriveSharedSecretDirect(KeyPair keyPair) throws Exception {
        String str;
        KeyAgreement keyAgreement;
        byte[] bytes;
        String str2 = "";
        int i = 2 % 2;
        int i2 = AhwBna + 33;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(1469541084, -88, (byte) -114, (short) 55, 1776811290, objArr);
        String strIntern = ((String) objArr[0]).intern();
        try {
            PublicKey publicKey = keyPair.getPublic();
            Intrinsics.checkNotNullExpressionValue(publicKey, "");
            String strEcPublicKeyToHex = ecPublicKeyToHex(publicKey);
            try {
                Object objDispatch$default = Web3SecurityBridge.dispatch$default(Web3SecurityBridge.INSTANCE, "init_get_comm_publickey", C56424yEw.gEmmrt(C56390yDp.OLrzqt("peerPublicKey", strEcPublicKeyToHex), C56390yDp.OLrzqt("forceRefresh", Boolean.TRUE)), false, 4, null);
                try {
                    if (objDispatch$default == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("Web3SecurityBridge.dispatch returned null response for init_get_comm_publickey");
                        StringBuilder sb = new StringBuilder();
                        sb.append("deriveSharedSecretDirect (Hardware) failed: " + illegalStateException.getMessage());
                        sb.append(" | mobilePubHexLength=" + strEcPublicKeyToHex.length());
                        sb.append(" | rawString=null");
                        WrapUtilsImpl.INSTANCE.monitorCallError("deriveSharedSecretDirect (Hardware)", sb.toString());
                        throw illegalStateException;
                    }
                    String string = objDispatch$default.toString();
                    if (StringsKt__StringsKt.fARcdN((CharSequence) string) || Intrinsics.EZpvd((Object) string, (Object) AbstractJsonLexerKt.NULL)) {
                        IllegalStateException illegalStateException2 = new IllegalStateException("Web3SecurityBridge.dispatch returned invalid response: '" + string + "'");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("deriveSharedSecretDirect (Hardware) failed: " + illegalStateException2.getMessage());
                        sb2.append(" | mobilePubHexLength=" + strEcPublicKeyToHex.length());
                        sb2.append(" | rawStringLength=" + string.length());
                        WrapUtilsImpl.INSTANCE.monitorCallError("deriveSharedSecretDirect (Hardware)", sb2.toString());
                        throw illegalStateException2;
                    }
                    try {
                        Json.Default r3 = Json.Default;
                        r3.getSerializersModule();
                        JsonElement jsonElement = (JsonElement) ((JsonObject) r3.decodeFromString(JsonObject.Companion.serializer(), string)).get((Object) "publicKey");
                        if (jsonElement != null) {
                            PublicKey publicKeyDecodePublicKeyHex = decodePublicKeyHex(JsonElementKt.getJsonPrimitive(jsonElement).getContent());
                            try {
                                String algorithm = keyPair.getPrivate().getAlgorithm();
                                Object[] objArr2 = new Object[1];
                                a(1469541084, -88, (byte) -114, (short) 55, 1776811290, objArr2);
                                KeyFactory.getInstance(algorithm, ((String) objArr2[0]).intern()).getKeySpec(keyPair.getPrivate(), KeyInfo.class);
                            } catch (Exception unused) {
                                strIntern = null;
                            }
                            if (strIntern == null || (keyAgreement = KeyAgreement.getInstance("ECDH", strIntern)) == null) {
                                keyAgreement = KeyAgreement.getInstance("ECDH");
                            }
                            keyAgreement.init(keyPair.getPrivate());
                            keyAgreement.doPhase(publicKeyDecodePublicKeyHex, true);
                            byte[] bArrGenerateSecret = keyAgreement.generateSecret();
                            try {
                                Intrinsics.copydefault(bArrGenerateSecret);
                                bytes = sharedMessage.getBytes(Charsets.UTF_8);
                                Intrinsics.checkNotNullExpressionValue(bytes, "");
                            } catch (Throwable th) {
                                th = th;
                            }
                            try {
                                SecretKeySpec secretKeySpecHkdfDerivedSymmetricKey$default = hkdfDerivedSymmetricKey$default(this, bArrGenerateSecret, null, bytes, 0, 10, null);
                                yDT.fill$default(bArrGenerateSecret, (byte) 0, 0, 0, 6, (Object) null);
                                int i4 = AhwBna + 119;
                                valueOf = i4 % 128;
                                int i5 = i4 % 2;
                                return secretKeySpecHkdfDerivedSymmetricKey$default;
                            } catch (Throwable th2) {
                                th = th2;
                                Intrinsics.copydefault(bArrGenerateSecret);
                                yDT.fill$default(bArrGenerateSecret, (byte) 0, 0, 0, 6, (Object) null);
                                throw th;
                            }
                        }
                        str = strEcPublicKeyToHex;
                        try {
                            IllegalStateException illegalStateException3 = new IllegalStateException("Response JSON missing 'publicKey' field: " + string);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("deriveSharedSecretDirect (Hardware) failed: " + illegalStateException3.getMessage());
                            sb3.append(" | mobilePubHexLength=" + str.length());
                            sb3.append(" | rawStringLength=" + string.length());
                            WrapUtilsImpl.INSTANCE.monitorCallError("deriveSharedSecretDirect (Hardware)", sb3.toString());
                            throw illegalStateException3;
                        } catch (Exception e) {
                            e = e;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str = strEcPublicKeyToHex;
                    }
                    IllegalStateException illegalStateException4 = new IllegalStateException("Failed to parse JSON response from Web3SecurityBridge: '" + string + "'", e);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("deriveSharedSecretDirect (Hardware) failed: " + illegalStateException4.getMessage());
                    sb4.append(" | mobilePubHexLength=" + str.length());
                    sb4.append(" | rawStringLength=" + string.length());
                    WrapUtilsImpl.INSTANCE.monitorCallError("deriveSharedSecretDirect (Hardware)", sb4.toString());
                    throw illegalStateException4;
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                e = e4;
            }
            str2 = strEcPublicKeyToHex;
        } catch (Exception e5) {
            e = e5;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("deriveSharedSecretDirect (Hardware) failed: " + e.getMessage());
        sb5.append(" | mobilePubHexLength=" + str2.length());
        sb5.append(" | rawStringLength=0");
        WrapUtilsImpl.INSTANCE.monitorCallError("deriveSharedSecretDirect (Hardware)", sb5.toString());
        Pair[] pairArr = new Pair[4];
        pairArr[0] = C56390yDp.OLrzqt("support_level", this.supportLevel.toString());
        pairArr[1] = C56390yDp.OLrzqt("has_keypair", String.valueOf(keyPair != null));
        pairArr[2] = C56390yDp.OLrzqt("mobile_pub_hex_length", String.valueOf(str2.length()));
        pairArr[3] = C56390yDp.OLrzqt("raw_string_length", String.valueOf(0));
        monitorHardwareOperationException("deriveSharedSecretDirect", e, "ecdh_key_agreement", C56424yEw.gEmmrt(pairArr));
        throw e;
    }

    private final byte[] retrieveWrappedSecretCache() throws Exception {
        try {
            pUU.KWHzl(TAG, "init getOrCreateSharedKey start[" + Thread.currentThread().getName() + "]");
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
        } catch (Exception e) {
            Pair[] pairArr = new Pair[5];
            pairArr[0] = C56390yDp.OLrzqt("support_level", this.supportLevel.toString());
            pairArr[1] = C56390yDp.OLrzqt(CrashHianalyticsData.THREAD_NAME, Thread.currentThread().getName());
            pairArr[2] = C56390yDp.OLrzqt("cache_available", String.valueOf(this.wrappedSecretCache.get() != null));
            pairArr[3] = C56390yDp.OLrzqt("ecc_alias", ECC_ALIAS);
            pairArr[4] = C56390yDp.OLrzqt("ec_curve", EC_CURVE);
            monitorHardwareOperationException("retrieveWrappedSecretCache (Hardware)", e, "cache_initialization", C56424yEw.gEmmrt(pairArr));
            throw e;
        }
    }

    private final boolean isCalledFromUnwrap() throws Throwable {
        int i = 2 % 2;
        int i2 = valueOf + 73;
        AhwBna = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsAuthorizedCaller = WrapUtilsImpl.INSTANCE.isAuthorizedCaller(C56402yEa.EZpvd("com.okinc.web3.security.utils.internal.HardwareImpl.unwrap"));
        int i4 = valueOf + 33;
        AhwBna = i4 % 128;
        int i5 = i4 % 2;
        return zIsAuthorizedCaller;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.okinc.web3.security.utils.internal.HardwareImpl */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void monitorHardwareOperationException$default(HardwareImpl hardwareImpl, String str, Throwable th, String str2, Map map, int i, Object obj) throws Throwable {
        int i2 = 2 % 2;
        int i3 = AhwBna + 37;
        int i4 = i3 % 128;
        valueOf = i4;
        if (i3 % 2 != 0 ? (i & 4) != 0 : (i & 2) != 0) {
            int i5 = i4 + 19;
            AhwBna = i5 % 128;
            int i6 = i5 % 2;
            str2 = "";
        }
        if ((i & 8) != 0) {
            map = C56424yEw.KWHzl();
            int i7 = valueOf + 77;
            AhwBna = i7 % 128;
            int i8 = i7 % 2;
        }
        hardwareImpl.monitorHardwareOperationException(str, th, str2, map);
    }

    private final void monitorHardwareOperationException(String str, Throwable th, String str2, Map<String, String> map) throws Throwable {
        int i = 2 % 2;
        try {
            EventData eventData = new EventData();
            eventData.setAct("web3_hardware_operation_exception");
            eventData.setMsg(str);
            Map mapOLrzqt = C56423yEv.OLrzqt();
            mapOLrzqt.put("operation", str);
            mapOLrzqt.put("support_level", this.supportLevel.toString());
            mapOLrzqt.put("exception_type", th.getClass().getSimpleName());
            String message = th.getMessage();
            if (message == null) {
                int i2 = valueOf + 79;
                AhwBna = i2 % 128;
                int i3 = i2 % 2;
                message = "No message";
            }
            mapOLrzqt.put("exception_message", message);
            mapOLrzqt.put("exception_stack", Companion.getSecureStackTrace$default(Companion, th, 0, 2, null));
            mapOLrzqt.put("context", str2);
            mapOLrzqt.put(CrashHianalyticsData.THREAD_NAME, Thread.currentThread().getName());
            mapOLrzqt.put("timestamp", String.valueOf(System.currentTimeMillis()));
            mapOLrzqt.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
            mapOLrzqt.put("device_model", Build.MODEL);
            Throwable cause = th.getCause();
            if (cause != null) {
                mapOLrzqt.put("cause_type", cause.getClass().getSimpleName());
                String message2 = cause.getMessage();
                if (message2 == null) {
                    message2 = "No cause message";
                }
            }
            mapOLrzqt.putAll(map);
            eventData.setAttrs(C56423yEv.AYXKKw(mapOLrzqt));
            pUU.copydefault(TAG, "monitorHardwareOperationException[" + Thread.currentThread().getName() + "]: " + str + " - " + th.getMessage());
            ReportManager.AEQbTJ.EZpvd(eventData);
        } catch (Exception e) {
            WrapUtilsImpl.INSTANCE.monitorCallError(str, "Enhanced monitoring failed: " + e.getMessage());
        }
        int i4 = valueOf + 45;
        AhwBna = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void monitorCacheInconsistency$default(HardwareImpl hardwareImpl, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = valueOf + 83;
        AhwBna = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 4) != 0) {
            str3 = "";
        }
        hardwareImpl.monitorCacheInconsistency(str, str2, str3);
        int i5 = valueOf + 45;
        AhwBna = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    private final void monitorCacheInconsistency(String str, String str2, String str3) {
        int i = 2 % 2;
        try {
            EventData eventData = new EventData();
            eventData.setAct("web3_cache_inconsistency");
            eventData.setMsg(str);
            eventData.setAttrs(C56424yEw.gEmmrt(C56390yDp.OLrzqt("operation", str), C56390yDp.OLrzqt("inconsistency_type", str2), C56390yDp.OLrzqt("details", str3), C56390yDp.OLrzqt("support_level", this.supportLevel.toString()), C56390yDp.OLrzqt(CrashHianalyticsData.THREAD_NAME, Thread.currentThread().getName()), C56390yDp.OLrzqt("timestamp", String.valueOf(System.currentTimeMillis()))));
            pUU.valueOf(TAG, "monitorCacheInconsistency: " + str + " - " + str2);
            ReportManager.AEQbTJ.EZpvd(eventData);
            int i2 = valueOf + 77;
            AhwBna = i2 % 128;
            int i3 = i2 % 2;
        } catch (Exception unused) {
        }
        int i4 = AhwBna + 65;
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void EZpvd() {
        KWHzl = -136896787;
        copydefault = 1640963180;
        OLrzqt = -911767186;
        EZpvd = new byte[]{77, 93, 53, 115, Ascii.SYN, 104, 86, 57, 53, 54, 55, 66, 74, 103, Ascii.VT};
    }
}
