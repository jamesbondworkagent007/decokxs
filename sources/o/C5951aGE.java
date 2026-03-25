package o;

import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import androidx.biometric.BiometricManager;
import androidx.biometric.BiometricPrompt;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import com.okinc.auth.impl.passkey.provider.NativePasskeyKeyProviderImpl$authenticateWithBiometric$2;
import com.okinc.auth.impl.passkey.provider.NativePasskeyKeyProviderImpl$decryptWithProtectionKey$1;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import java.security.KeyStore;
import java.security.PrivateKey;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import o.C34701nh;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;
import uniffi.account.OkxPasskeyException;

/* JADX INFO: renamed from: o.aGE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5951aGE implements zIR {
    private static char AhwBna;
    public static final StateListAnimator Companion;
    private static int DbNXlk;
    public static final int OLrzqt;
    private static char djBIcL;
    private static char gEmmrt;
    private static char valueOf;
    public final InterfaceC5995aGw AEQbTJ;
    public final InterfaceC56387yDm EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final android.content.Context copydefault;
    private static final byte[] $$a = {110, 65, 124, -53};
    private static final int $$b = CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AkhnZx = 1;
    private static int AYXKKw = 0;
    private static int fetchVPNInfo = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(int i, int i2, int i3) {
        int i4;
        int i5;
        byte[] bArr = $$a;
        int i6 = i + 118;
        int i7 = 4 - (i3 * 2);
        int i8 = (i2 * 3) + 1;
        byte[] bArr2 = new byte[i8];
        if (bArr == null) {
            int i9 = i8;
            int i10 = i7;
            i5 = 0;
            int i11 = i7 + (-i9);
            i4 = i5;
            i7 = i10 + 1;
            i6 = i11;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i6;
            if (i5 == i8) {
                return new java.lang.String(bArr2, 0);
            }
            i9 = bArr[i7];
            int i12 = i7;
            i7 = i6;
            i10 = i12;
            int i112 = i7 + (-i9);
            i4 = i5;
            i7 = i10 + 1;
            i6 = i112;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i6;
            if (i5 == i8) {
            }
        } else {
            i4 = 0;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i6;
            if (i5 == i8) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    static {
        DbNXlk = 0;
        copydefault();
        Companion = new StateListAnimator(null);
        OLrzqt = 8;
        int i = AkhnZx + 57;
        DbNXlk = i % 128;
        if (i % 2 != 0) {
            int i2 = 51 / 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5951aGE() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ java.lang.Object EZpvd(int i, int i2, int i3, int i4, int i5, int i6, java.lang.Object[] objArr) {
        int i7 = ~i5;
        int i8 = ~i3;
        int i9 = (~(i7 | i8 | (~i))) | (~(i5 | i3 | i));
        int i10 = (~(i8 | i)) | (~(i8 | i5));
        int i11 = (~(i | i3)) | i5;
        int i12 = i5 + i3 + i6 + (1661237432 * i4) + (961048624 * i2);
        int i13 = i12 * i12;
        int i14 = ((119520104 * i5) - 281083904) + ((-1329838950) * i3) + (i9 * 724679527) + (724679527 * i10) + ((-724679527) * i11) + ((-605159424) * i6) + ((-1559232512) * i4) + (1553989632 * i2) + (2020540416 * i13);
        int i15 = (i5 * (-2040814728)) + 92927091 + (i3 * (-2040813538)) + (i9 * (-595)) + (i10 * (-595)) + (i11 * 595) + (i6 * (-2040814133)) + (i4 * (-1614655000)) + (i2 * 500164112) + (i13 * 184877056);
        int i16 = i14 + (i15 * i15 * 1800994816);
        if (i16 != 1) {
            return i16 != 2 ? i16 != 3 ? OLrzqt(objArr) : EZpvd(objArr) : KWHzl(objArr);
        }
        C5951aGE c5951aGE = (C5951aGE) objArr[0];
        int i17 = 2 % 2;
        int i18 = AYXKKw + 35;
        fetchVPNInfo = i18 % 128;
        int i19 = i18 % 2;
        android.content.SharedPreferences sharedPreferencesEZpvd = Companion.EZpvd(c5951aGE.copydefault, "com.okx.passkey.v2.storage.encrypted");
        int i20 = AYXKKw + 27;
        fetchVPNInfo = i20 % 128;
        int i21 = i20 % 2;
        return sharedPreferencesEZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ android.content.SharedPreferences KWHzl(C5951aGE c5951aGE) {
        int i = 2 % 2;
        int i2 = fetchVPNInfo + 77;
        AYXKKw = i2 % 128;
        int i3 = i2 % 2;
        int iEZpvd = C33514mxr.EZpvd();
        int iEZpvd2 = C33514mxr.EZpvd();
        int iEZpvd3 = C33514mxr.EZpvd();
        android.content.SharedPreferences sharedPreferences = (android.content.SharedPreferences) EZpvd(iEZpvd, C33514mxr.EZpvd(), -1520222211, iEZpvd3, 1520222212, iEZpvd2, new java.lang.Object[]{c5951aGE});
        int i4 = AYXKKw + 47;
        fetchVPNInfo = i4 % 128;
        if (i4 % 2 != 0) {
            return sharedPreferences;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ android.content.SharedPreferences OLrzqt(C5951aGE c5951aGE) {
        int i = 2 % 2;
        int i2 = AYXKKw + 81;
        fetchVPNInfo = i2 % 128;
        int i3 = i2 % 2;
        android.content.SharedPreferences sharedPreferencesEZpvd = EZpvd(c5951aGE);
        int i4 = AYXKKw + 61;
        fetchVPNInfo = i4 % 128;
        if (i4 % 2 != 0) {
            return sharedPreferencesEZpvd;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    public C5951aGE(@NotNull android.content.Context context, InterfaceC5995aGw interfaceC5995aGw) {
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = context;
        this.AEQbTJ = interfaceC5995aGw;
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.aGH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C5951aGE.KWHzl(this.KWHzl);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.aGF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C5951aGE.OLrzqt(this.OLrzqt);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [61=4] */
    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C5951aGE(android.content.Context context, InterfaceC5995aGw interfaceC5995aGw, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = fetchVPNInfo + 23;
            AYXKKw = i2 % 128;
            if (i2 % 2 != 0) {
                context = C32979mnm.EZpvd.OLrzqt();
                int i3 = 23 / 0;
            } else {
                context = C32979mnm.EZpvd.OLrzqt();
            }
            int i4 = 2 % 2;
        }
        if ((i & 2) != 0) {
            int i5 = fetchVPNInfo + 11;
            AYXKKw = i5 % 128;
            if (i5 % 2 != 0) {
                C5948aGB c5948aGB = C5948aGB.EZpvd;
                throw null;
            }
            interfaceC5995aGw = C5948aGB.EZpvd;
            int i6 = AYXKKw + 35;
            fetchVPNInfo = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
        }
        this(context, interfaceC5995aGw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static /* synthetic */ java.lang.Object OLrzqt(java.lang.Object[] objArr) {
        C5951aGE c5951aGE = (C5951aGE) objArr[0];
        int i = 2 % 2;
        int i2 = fetchVPNInfo + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        AYXKKw = i2 % 128;
        java.lang.Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        android.content.SharedPreferences sharedPreferences = (android.content.SharedPreferences) c5951aGE.EZpvd.getValue();
        int i3 = fetchVPNInfo + 9;
        AYXKKw = i3 % 128;
        if (i3 % 2 == 0) {
            return sharedPreferences;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final android.content.SharedPreferences AhwBna() {
        int i = 2 % 2;
        int i2 = AYXKKw + 71;
        fetchVPNInfo = i2 % 128;
        int i3 = i2 % 2;
        android.content.SharedPreferences sharedPreferences = (android.content.SharedPreferences) this.KWHzl.getValue();
        int i4 = fetchVPNInfo + 77;
        AYXKKw = i4 % 128;
        if (i4 % 2 == 0) {
            return sharedPreferences;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final android.content.SharedPreferences EZpvd(C5951aGE c5951aGE) {
        int i = 2 % 2;
        int i2 = AYXKKw + 27;
        fetchVPNInfo = i2 % 128;
        int i3 = i2 % 2;
        android.content.SharedPreferences sharedPreferencesEZpvd = Companion.EZpvd(c5951aGE.copydefault, "com.okx.passkey.v2.metadata.encrypted");
        int i4 = fetchVPNInfo + 49;
        AYXKKw = i4 % 128;
        int i5 = i4 % 2;
        return sharedPreferencesEZpvd;
    }

    /* JADX INFO: renamed from: o.aGE$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aGE.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ void registerWithRust$default(StateListAnimator stateListAnimator, android.content.Context context, InterfaceC5995aGw interfaceC5995aGw, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                interfaceC5995aGw = null;
            }
            stateListAnimator.OLrzqt(context, interfaceC5995aGw);
        }

        public final void OLrzqt(@NotNull android.content.Context context, InterfaceC5995aGw interfaceC5995aGw) {
            Intrinsics.checkNotNullParameter(context, "");
            pUU.KWHzl("NativePasskeyKeyProviderImpl", "registerWithRust");
            if (interfaceC5995aGw == null) {
                interfaceC5995aGw = C5948aGB.EZpvd;
            }
            C60230zyn.registerNativePasskeyKeyProvider(new C5951aGE(context, interfaceC5995aGw));
        }

        public final android.content.SharedPreferences EZpvd(android.content.Context context, java.lang.String str) {
            try {
                MasterKey masterKeyBuild = new MasterKey.Builder(context).setKeyScheme(MasterKey.KeyScheme.AES256_GCM).build();
                Intrinsics.checkNotNullExpressionValue(masterKeyBuild, "");
                android.content.SharedPreferences sharedPreferencesCreate = EncryptedSharedPreferences.create(context, str, masterKeyBuild, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
                Intrinsics.copydefault(sharedPreferencesCreate);
                return sharedPreferencesCreate;
            } catch (java.lang.Exception e) {
                pUU.copydefault("NativePasskeyKeyProviderImpl", "Failed to create EncryptedSharedPreferences for " + str + ", fallback: " + e.getMessage());
                android.content.SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                Intrinsics.copydefault(sharedPreferences);
                return sharedPreferences;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [111=4] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(char[] cArr, int i, java.lang.Object[] objArr) throws java.lang.Throwable {
        int i2 = 2 % 2;
        Zh zh = new Zh();
        char[] cArr2 = new char[cArr.length];
        zh.EZpvd = 0;
        char[] cArr3 = new char[2];
        while (zh.EZpvd < cArr.length) {
            int i3 = $11 + 7;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                cArr3[0] = cArr[zh.EZpvd];
                cArr3[0] = cArr[zh.EZpvd];
            } else {
                cArr3[0] = cArr[zh.EZpvd];
                cArr3[1] = cArr[zh.EZpvd + 1];
            }
            int i4 = 58224;
            for (int i5 = 0; i5 < 16; i5++) {
                int i6 = $11 + 47;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(c), java.lang.Integer.valueOf((c2 + i4) ^ ((c2 << 4) + ((char) (((long) valueOf) ^ 6538634990023091910L)))), java.lang.Integer.valueOf(c2 >>> 5), java.lang.Integer.valueOf(gEmmrt)};
                    java.lang.Object objEZpvd = YY.EZpvd(-2045992360);
                    if (objEZpvd == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objEZpvd = YY.EZpvd(501, 5, (char) 0, -2111017180, false, $$c(b, b2, b2), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    char cCharValue = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr3[0]), java.lang.Integer.valueOf((cCharValue + i4) ^ ((cCharValue << 4) + ((char) (((long) djBIcL) ^ 6538634990023091910L)))), java.lang.Integer.valueOf(cCharValue >>> 5), java.lang.Integer.valueOf(AhwBna)};
                    java.lang.Object objEZpvd2 = YY.EZpvd(-2045992360);
                    if (objEZpvd2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objEZpvd2 = YY.EZpvd(501, 5, (char) 0, -2111017180, false, $$c(b3, b4, b4), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr3[0] = ((java.lang.Character) ((java.lang.reflect.Method) objEZpvd2).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[zh.EZpvd] = cArr3[0];
            cArr2[zh.EZpvd + 1] = cArr3[1];
            java.lang.Object[] objArr4 = {zh, zh};
            java.lang.Object objEZpvd3 = YY.EZpvd(-549847163);
            if (objEZpvd3 == null) {
                byte b5 = (byte) ($$b & 1);
                byte b6 = (byte) (b5 - 1);
                objEZpvd3 = YY.EZpvd(615, 5, (char) 1207, -619105543, false, $$c(b5, b6, b6), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
            }
            ((java.lang.reflect.Method) objEZpvd3).invoke(null, objArr4);
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    @Override // o.zIR
    public void OLrzqt() throws OkxPasskeyException.NoDevicePasscode {
        int i = 2 % 2;
        int i2 = fetchVPNInfo + 57;
        AYXKKw = i2 % 128;
        int i3 = i2 % 2;
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "checkDevicePasscode");
        KWHzl();
        int i4 = AYXKKw + 63;
        fetchVPNInfo = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zIR
    public void djBIcL(@NotNull java.lang.String str, @NotNull java.lang.String str2) throws java.lang.Throwable {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "removeProtectionKey " + str + " " + str2);
        int iValueOf = C34701nh.TaskDescription.valueOf();
        int iValueOf2 = C34701nh.TaskDescription.valueOf();
        java.lang.String str3 = (java.lang.String) C5955aGI.EZpvd(C34701nh.TaskDescription.valueOf(), iValueOf, new java.lang.Object[]{str, str2}, C34701nh.TaskDescription.valueOf(), -1540279698, iValueOf2, 1540279698);
        C5955aGI.EZpvd(this, str, str2);
        OLrzqt(str, str2);
        EZpvd(str, str2);
        valueOf(str3);
        int i2 = fetchVPNInfo + 75;
        AYXKKw = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [161=5] */
    @Override // o.zIR
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        java.lang.String str3;
        KeyStore keyStore;
        int i = 2 % 2;
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "isProtectionKeyAvailable " + str + " " + str2);
        boolean z = false;
        try {
            str3 = (java.lang.String) C5955aGI.EZpvd(C34701nh.TaskDescription.valueOf(), C34701nh.TaskDescription.valueOf(), new java.lang.Object[]{this, str, str2}, C34701nh.TaskDescription.valueOf(), 830828767, C34701nh.TaskDescription.valueOf(), -830828766);
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new char[]{57214, 32189, 43335, 6784, 56152, 26101, 44263, 38296, 28216, 54935, 664, 53340, 54441, 28769, 17817, 31153}, 15, objArr);
            keyStore = KeyStore.getInstance(((java.lang.String) objArr[0]).intern());
            keyStore.load(null);
        } catch (java.lang.Exception e) {
            pUU.copydefault("NativePasskeyKeyProviderImpl", "isProtectionKeyAvailable e:" + e.getMessage());
        }
        if (!keyStore.containsAlias(str3)) {
            pUU.copydefault("NativePasskeyKeyProviderImpl", "isProtectionKeyAvailable: key not found for alias=" + str3);
            throw new OkxPasskeyException.KeyNotFound();
        }
        int i2 = fetchVPNInfo + 117;
        AYXKKw = i2 % 128;
        if (i2 % 2 != 0) {
            boolean z2 = keyStore.getEntry(str3, null) instanceof KeyStore.PrivateKeyEntry;
            throw null;
        }
        KeyStore.Entry entry = keyStore.getEntry(str3, null);
        KeyStore.PrivateKeyEntry privateKeyEntry = entry instanceof KeyStore.PrivateKeyEntry ? (KeyStore.PrivateKeyEntry) entry : null;
        if (privateKeyEntry == null) {
            return C56443yFo.KWHzl(false);
        }
        java.security.cert.Certificate certificate = privateKeyEntry.getCertificate();
        if (certificate != null) {
            if (certificate.getPublicKey() != null) {
                z = true;
                return C56443yFo.KWHzl(z);
            }
            int i3 = AYXKKw + 101;
            fetchVPNInfo = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 % 4;
            }
        }
        return C56443yFo.KWHzl(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [171=5] */
    @Override // o.zIR
    public void EZpvd() throws OkxPasskeyException.NoDevicePasscode, OkxPasskeyException.InternalException {
        FragmentActivity fragmentActivityKWHzl;
        int i = 2 % 2;
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "showDevicePasscodeForLockout");
        KWHzl();
        InterfaceC5995aGw interfaceC5995aGw = this.AEQbTJ;
        if (interfaceC5995aGw == null || (fragmentActivityKWHzl = interfaceC5995aGw.KWHzl()) == null) {
            pUU.copydefault("NativePasskeyKeyProviderImpl", "showDevicePasscodeForLockout: no current activity");
            throw new OkxPasskeyException.InternalException();
        }
        int i2 = fetchVPNInfo + 37;
        AYXKKw = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Object systemService = this.copydefault.getSystemService("keyguard");
        Intrinsics.copydefault(systemService, "");
        android.content.Intent intentCreateConfirmDeviceCredentialIntent = ((android.app.KeyguardManager) systemService).createConfirmDeviceCredentialIntent(" ", " ");
        if (intentCreateConfirmDeviceCredentialIntent == null) {
            pUU.copydefault("NativePasskeyKeyProviderImpl", "showDevicePasscodeForLockout: failed to create confirm credential intent");
            throw new OkxPasskeyException.InternalException();
        }
        int i4 = AYXKKw + 63;
        fetchVPNInfo = i4 % 128;
        int i5 = i4 % 2;
        fragmentActivityKWHzl.startActivity(intentCreateConfirmDeviceCredentialIntent.addFlags(268435456));
        int i6 = fetchVPNInfo + 35;
        AYXKKw = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // o.zIR
    public java.lang.Object AEQbTJ(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        int i = 2 % 2;
        int i2 = AYXKKw + 119;
        fetchVPNInfo = i2 % 128;
        int i3 = i2 % 2;
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "verifyUserPresence");
        KWHzl();
        java.lang.Object objCopydefault = copydefault(continuation);
        if (objCopydefault == C56442yFn.copydefault()) {
            return objCopydefault;
        }
        Unit unit = Unit.INSTANCE;
        int i4 = fetchVPNInfo + 25;
        AYXKKw = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    @Override // o.zIR
    public java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super byte[]> continuation) throws OkxPasskeyException.KeyExportFailed {
        int i = 2 % 2;
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "getProtectionPublicKey " + str + " " + str2);
        byte[] bArrCopydefault = C5955aGI.copydefault(this, C5955aGI.AEQbTJ(this, str, str2));
        int i2 = AYXKKw + 117;
        fetchVPNInfo = i2 % 128;
        int i3 = i2 % 2;
        return bArrCopydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    @Override // o.zIR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull byte[] bArr, @NotNull Continuation<? super byte[]> continuation) throws java.lang.Throwable {
        NativePasskeyKeyProviderImpl$decryptWithProtectionKey$1 nativePasskeyKeyProviderImpl$decryptWithProtectionKey$1;
        PrivateKey privateKeyKWHzl;
        byte[] bArrAEQbTJ;
        C5951aGE c5951aGE;
        byte[] bArr2;
        byte[] bArr3;
        int i = 2 % 2;
        int i2 = fetchVPNInfo + 63;
        int i3 = i2 % 128;
        AYXKKw = i3;
        int i4 = i2 % 2;
        if (!(!(continuation instanceof NativePasskeyKeyProviderImpl$decryptWithProtectionKey$1))) {
            int i5 = i3 + 41;
            fetchVPNInfo = i5 % 128;
            int i6 = i5 % 2;
            nativePasskeyKeyProviderImpl$decryptWithProtectionKey$1 = (NativePasskeyKeyProviderImpl$decryptWithProtectionKey$1) continuation;
            int i7 = nativePasskeyKeyProviderImpl$decryptWithProtectionKey$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                int i8 = AYXKKw + 1;
                fetchVPNInfo = i8 % 128;
                int i9 = i8 % 2;
                nativePasskeyKeyProviderImpl$decryptWithProtectionKey$1.label = i7 - Integer.MIN_VALUE;
            } else {
                nativePasskeyKeyProviderImpl$decryptWithProtectionKey$1 = new NativePasskeyKeyProviderImpl$decryptWithProtectionKey$1(this, continuation);
            }
        }
        java.lang.Object obj = nativePasskeyKeyProviderImpl$decryptWithProtectionKey$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i10 = nativePasskeyKeyProviderImpl$decryptWithProtectionKey$1.label;
        if (i10 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("NativePasskeyKeyProviderImpl", "decryptWithProtectionKey " + str + " " + str2);
            KWHzl();
            privateKeyKWHzl = C5955aGI.KWHzl(this, str, str2);
            if (!(!C5955aGI.EZpvd(privateKeyKWHzl))) {
                pUU.copydefault("NativePasskeyKeyProviderImpl", "decryptWithProtectionKey: key requires per-use auth, cannot use for ECDH");
                throw new OkxPasskeyException.KeyDataInvalid();
            }
            int i11 = fetchVPNInfo + 119;
            AYXKKw = i11 % 128;
            int i12 = i11 % 2;
            if (bArr.length <= 93) {
                pUU.copydefault("NativePasskeyKeyProviderImpl", "decryptWithProtectionKey: encrypted data too short (" + bArr.length + " <= 93)");
                throw new OkxPasskeyException.KeyDataInvalid();
            }
            byte[] bArrAEQbTJ2 = yDT.AEQbTJ(bArr, 0, 65);
            java.lang.Byte bGEmmrt = yDV.gEmmrt(bArrAEQbTJ2);
            if (bGEmmrt == null || bGEmmrt.byteValue() != 4) {
                pUU.copydefault("NativePasskeyKeyProviderImpl", "decryptWithProtectionKey: invalid ephemeral public key prefix");
                throw new OkxPasskeyException.KeyDataInvalid();
            }
            byte[] bArrAEQbTJ3 = yDT.AEQbTJ(bArr, 65, 77);
            bArrAEQbTJ = yDT.AEQbTJ(bArr, 77, bArr.length);
            nativePasskeyKeyProviderImpl$decryptWithProtectionKey$1.L$0 = this;
            nativePasskeyKeyProviderImpl$decryptWithProtectionKey$1.L$1 = privateKeyKWHzl;
            nativePasskeyKeyProviderImpl$decryptWithProtectionKey$1.L$2 = bArrAEQbTJ2;
            nativePasskeyKeyProviderImpl$decryptWithProtectionKey$1.L$3 = bArrAEQbTJ3;
            nativePasskeyKeyProviderImpl$decryptWithProtectionKey$1.L$4 = bArrAEQbTJ;
            nativePasskeyKeyProviderImpl$decryptWithProtectionKey$1.label = 1;
            if (copydefault(nativePasskeyKeyProviderImpl$decryptWithProtectionKey$1) == objCopydefault) {
                int i13 = AYXKKw + 25;
                fetchVPNInfo = i13 % 128;
                if (i13 % 2 != 0) {
                    return objCopydefault;
                }
                java.lang.Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            c5951aGE = this;
            bArr2 = bArrAEQbTJ2;
            bArr3 = bArrAEQbTJ3;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i14 = fetchVPNInfo + 39;
            AYXKKw = i14 % 128;
            int i15 = i14 % 2;
            bArrAEQbTJ = (byte[]) nativePasskeyKeyProviderImpl$decryptWithProtectionKey$1.L$4;
            bArr3 = (byte[]) nativePasskeyKeyProviderImpl$decryptWithProtectionKey$1.L$3;
            bArr2 = (byte[]) nativePasskeyKeyProviderImpl$decryptWithProtectionKey$1.L$2;
            privateKeyKWHzl = (PrivateKey) nativePasskeyKeyProviderImpl$decryptWithProtectionKey$1.L$1;
            c5951aGE = (C5951aGE) nativePasskeyKeyProviderImpl$decryptWithProtectionKey$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        try {
            byte[] bArrKWHzl = C5955aGI.KWHzl(c5951aGE, C5955aGI.AEQbTJ(c5951aGE, privateKeyKWHzl, bArr2));
            try {
                javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
                cipher.init(2, new javax.crypto.spec.SecretKeySpec(bArrKWHzl, BouncyCastleKeyManagementRepository.AES), new javax.crypto.spec.GCMParameterSpec(128, bArr3));
                byte[] bArrDoFinal = cipher.doFinal(bArrAEQbTJ);
                Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "");
                return bArrDoFinal;
            } catch (java.lang.Exception e) {
                pUU.copydefault("NativePasskeyKeyProviderImpl", "decryptWithProtectionKey: AES decrypt error: " + e.getMessage());
                throw new OkxPasskeyException.KeyDataInvalid();
            }
        } catch (java.lang.Exception e2) {
            pUU.copydefault("NativePasskeyKeyProviderImpl", "decryptWithProtectionKey: sharedSecret error: " + e2.getMessage());
            C6689aUA.addEventOfSdkError$default(C6689aUA.KWHzl, "okx_passkey", "okx_passkey_decrypt", null, "sharedSecret error: " + e2.getMessage(), null, 20, null);
            throw new OkxPasskeyException.KeyDataInvalid();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zIR
    public void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull byte[] bArr) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "storeEncryptedPasskey " + str + " " + str2 + " " + str3);
        int iValueOf = C34701nh.TaskDescription.valueOf();
        int iValueOf2 = C34701nh.TaskDescription.valueOf();
        java.lang.String str5 = (java.lang.String) C5955aGI.EZpvd(C34701nh.TaskDescription.valueOf(), iValueOf, new java.lang.Object[]{str, str2}, C34701nh.TaskDescription.valueOf(), -1540279698, iValueOf2, 1540279698);
        java.lang.String strDjBIcL = djBIcL(str5);
        java.lang.String strAYXKKw = AYXKKw(str3);
        int iEZpvd = C33514mxr.EZpvd();
        int iEZpvd2 = C33514mxr.EZpvd();
        SharedPreferences.Editor editorRemove = ((android.content.SharedPreferences) EZpvd(iEZpvd, C33514mxr.EZpvd(), 990950625, C33514mxr.EZpvd(), -990950625, iEZpvd2, new java.lang.Object[]{this})).edit().remove(strDjBIcL);
        int iEZpvd3 = C33514mxr.EZpvd();
        int iEZpvd4 = C33514mxr.EZpvd();
        SharedPreferences.Editor editorPutString = editorRemove.putString(strDjBIcL, (java.lang.String) EZpvd(iEZpvd3, C33514mxr.EZpvd(), -1454807856, C33514mxr.EZpvd(), 1454807859, iEZpvd4, new java.lang.Object[]{this, bArr}));
        int iEZpvd5 = C33514mxr.EZpvd();
        int iEZpvd6 = C33514mxr.EZpvd();
        editorPutString.putString(strAYXKKw, (java.lang.String) EZpvd(iEZpvd5, C33514mxr.EZpvd(), -1454807856, C33514mxr.EZpvd(), 1454807859, iEZpvd6, new java.lang.Object[]{this, bArr})).apply();
        EZpvd(str3, str, str2, str4, java.lang.System.currentTimeMillis() / 1000.0d);
        gEmmrt(str5, str3);
        int i2 = fetchVPNInfo + 37;
        AYXKKw = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zIR
    public byte[] AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) throws OkxPasskeyException.KeyNotFound {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "loadEncryptedPasskey " + str + " " + str2);
        int iValueOf = C34701nh.TaskDescription.valueOf();
        int iValueOf2 = C34701nh.TaskDescription.valueOf();
        java.lang.String strDjBIcL = djBIcL((java.lang.String) C5955aGI.EZpvd(C34701nh.TaskDescription.valueOf(), iValueOf, new java.lang.Object[]{str, str2}, C34701nh.TaskDescription.valueOf(), -1540279698, iValueOf2, 1540279698));
        int iEZpvd = C33514mxr.EZpvd();
        int iEZpvd2 = C33514mxr.EZpvd();
        java.lang.String string = ((android.content.SharedPreferences) EZpvd(iEZpvd, C33514mxr.EZpvd(), 990950625, C33514mxr.EZpvd(), -990950625, iEZpvd2, new java.lang.Object[]{this})).getString(strDjBIcL, null);
        if (string == null) {
            pUU.copydefault("NativePasskeyKeyProviderImpl", "loadEncryptedPasskey: not found for " + str + " " + str2);
            throw new OkxPasskeyException.KeyNotFound();
        }
        int i2 = fetchVPNInfo + 67;
        AYXKKw = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArrCopydefault = copydefault(string);
        int i4 = fetchVPNInfo + 107;
        AYXKKw = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 10 / 0;
        }
        return bArrCopydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zIR
    public byte[] OLrzqt(@NotNull java.lang.String str) throws OkxPasskeyException.KeyNotFound {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "loadEncryptedPasskeyByCredentialId " + str);
        java.lang.String strAYXKKw = AYXKKw(str);
        int iEZpvd = C33514mxr.EZpvd();
        int iEZpvd2 = C33514mxr.EZpvd();
        java.lang.String string = ((android.content.SharedPreferences) EZpvd(iEZpvd, C33514mxr.EZpvd(), 990950625, C33514mxr.EZpvd(), -990950625, iEZpvd2, new java.lang.Object[]{this})).getString(strAYXKKw, null);
        if (string == null) {
            pUU.copydefault("NativePasskeyKeyProviderImpl", "loadEncryptedPasskeyByCredentialId: not found for " + str);
            throw new OkxPasskeyException.KeyNotFound();
        }
        int i2 = AYXKKw + 29;
        fetchVPNInfo = i2 % 128;
        if (i2 % 2 != 0) {
            return copydefault(string);
        }
        int i3 = 8 / 0;
        return copydefault(string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zIR
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "removeEncryptedPasskey " + str + " " + str2);
        int iValueOf = C34701nh.TaskDescription.valueOf();
        int iValueOf2 = C34701nh.TaskDescription.valueOf();
        java.lang.String str3 = (java.lang.String) C5955aGI.EZpvd(C34701nh.TaskDescription.valueOf(), iValueOf, new java.lang.Object[]{str, str2}, C34701nh.TaskDescription.valueOf(), -1540279698, iValueOf2, 1540279698);
        java.lang.String strEZpvd = EZpvd(str3);
        if (strEZpvd != null) {
            int i2 = fetchVPNInfo + 55;
            AYXKKw = i2 % 128;
            int i3 = i2 % 2;
            int iEZpvd = C33514mxr.EZpvd();
            int iEZpvd2 = C33514mxr.EZpvd();
            ((android.content.SharedPreferences) EZpvd(iEZpvd, C33514mxr.EZpvd(), 990950625, C33514mxr.EZpvd(), -990950625, iEZpvd2, new java.lang.Object[]{this})).edit().remove(AYXKKw(strEZpvd)).apply();
            int iEZpvd3 = C33514mxr.EZpvd();
            int iEZpvd4 = C33514mxr.EZpvd();
            EZpvd(iEZpvd3, C33514mxr.EZpvd(), -1904256008, C33514mxr.EZpvd(), 1904256010, iEZpvd4, new java.lang.Object[]{this, strEZpvd});
        }
        int iEZpvd5 = C33514mxr.EZpvd();
        int iEZpvd6 = C33514mxr.EZpvd();
        ((android.content.SharedPreferences) EZpvd(iEZpvd5, C33514mxr.EZpvd(), 990950625, C33514mxr.EZpvd(), -990950625, iEZpvd6, new java.lang.Object[]{this})).edit().remove(djBIcL(str3)).apply();
        int i4 = AYXKKw + 43;
        fetchVPNInfo = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.zIR
    public boolean KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "hasEncryptedPasskey " + str + " " + str2);
        int iValueOf = C34701nh.TaskDescription.valueOf();
        int iValueOf2 = C34701nh.TaskDescription.valueOf();
        java.lang.String str3 = (java.lang.String) C5955aGI.EZpvd(C34701nh.TaskDescription.valueOf(), iValueOf, new java.lang.Object[]{str, str2}, C34701nh.TaskDescription.valueOf(), -1540279698, iValueOf2, 1540279698);
        int iEZpvd = C33514mxr.EZpvd();
        int iEZpvd2 = C33514mxr.EZpvd();
        boolean zContains = ((android.content.SharedPreferences) EZpvd(iEZpvd, C33514mxr.EZpvd(), 990950625, C33514mxr.EZpvd(), -990950625, iEZpvd2, new java.lang.Object[]{this})).contains(djBIcL(str3));
        int i2 = AYXKKw + 115;
        fetchVPNInfo = i2 % 128;
        if (i2 % 2 != 0) {
            return zContains;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        r0 = null;
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        o.pUU.copydefault("NativePasskeyKeyProviderImpl", "ensureDevicePasscodeAvailable: device is not secure");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        throw new uniffi.account.OkxPasskeyException.NoDevicePasscode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
    
        if (((android.app.KeyguardManager) r1).isDeviceSecure() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0041, code lost:
    
        if (((android.app.KeyguardManager) r1).isDeviceSecure() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        r1 = o.C5951aGE.fetchVPNInfo + 69;
        o.C5951aGE.AYXKKw = r1 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl() throws OkxPasskeyException.NoDevicePasscode {
        int i = 2 % 2;
        int i2 = AYXKKw + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
        fetchVPNInfo = i2 % 128;
        if (i2 % 2 == 0) {
            pUU.KWHzl("NativePasskeyKeyProviderImpl", "ensureDevicePasscodeAvailable");
            java.lang.Object systemService = this.copydefault.getSystemService("keyguard");
            Intrinsics.copydefault(systemService, "");
            int i3 = 41 / 0;
        } else {
            pUU.KWHzl("NativePasskeyKeyProviderImpl", "ensureDevicePasscodeAvailable");
            java.lang.Object systemService2 = this.copydefault.getSystemService("keyguard");
            Intrinsics.copydefault(systemService2, "");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BiometricPrompt.CryptoObject AEQbTJ() throws java.lang.Throwable {
        int i = 2 % 2;
        int i2 = AYXKKw + 75;
        fetchVPNInfo = i2 % 128;
        int i3 = i2 % 2;
        int iCanAuthenticate = BiometricManager.from(this.copydefault).canAuthenticate(15);
        if (iCanAuthenticate != 0) {
            pUU.KWHzl("NativePasskeyKeyProviderImpl", "createAuthGateCryptoObject: BIOMETRIC_STRONG not available (" + iCanAuthenticate + ")");
            return null;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new char[]{57214, 32189, 43335, 6784, 56152, 26101, 44263, 38296, 28216, 54935, 664, 53340, 54441, 28769, 17817, 31153}, 15, objArr);
            KeyStore keyStore = KeyStore.getInstance(((java.lang.String) objArr[0]).intern());
            keyStore.load(null);
            if (!keyStore.containsAlias("com.okx.passkey.v2.auth_gate")) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(new char[]{57214, 32189, 43335, 6784, 56152, 26101, 44263, 38296, 28216, 54935, 664, 53340, 54441, 28769, 17817, 31153}, 15, objArr2);
                javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance(BouncyCastleKeyManagementRepository.AES, ((java.lang.String) objArr2[0]).intern());
                KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder("com.okx.passkey.v2.auth_gate", 3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").setKeySize(256).setUserAuthenticationRequired(true);
                if (Build.VERSION.SDK_INT >= 30) {
                    int i4 = AYXKKw + 103;
                    fetchVPNInfo = i4 % 128;
                    if (i4 % 2 == 0) {
                        userAuthenticationRequired.setUserAuthenticationParameters(1, 2);
                    } else {
                        userAuthenticationRequired.setUserAuthenticationParameters(0, 2);
                    }
                } else {
                    userAuthenticationRequired.setUserAuthenticationValidityDurationSeconds(-1);
                }
                KeyGenParameterSpec keyGenParameterSpecBuild = userAuthenticationRequired.build();
                Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "");
                keyGenerator.init(keyGenParameterSpecBuild);
                keyGenerator.generateKey();
            }
            java.security.Key key = keyStore.getKey("com.okx.passkey.v2.auth_gate", null);
            if (key == null) {
                return null;
            }
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, key);
            BiometricPrompt.CryptoObject cryptoObject = new BiometricPrompt.CryptoObject(cipher);
            int i5 = AYXKKw + 15;
            fetchVPNInfo = i5 % 128;
            int i6 = i5 % 2;
            return cryptoObject;
        } catch (java.lang.Exception e) {
            pUU.valueOf("NativePasskeyKeyProviderImpl", "createAuthGateCryptoObject failed: " + e.getMessage());
            try {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                a(new char[]{57214, 32189, 43335, 6784, 56152, 26101, 44263, 38296, 28216, 54935, 664, 53340, 54441, 28769, 17817, 31153}, 15, objArr3);
                KeyStore keyStore2 = KeyStore.getInstance(((java.lang.String) objArr3[0]).intern());
                keyStore2.load(null);
                keyStore2.deleteEntry("com.okx.passkey.v2.auth_gate");
                return null;
            } catch (java.lang.Exception unused) {
                return null;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [751=5] */
    public final java.lang.Object copydefault(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        int i = 2 % 2;
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "authenticateWithBiometric");
        InterfaceC5995aGw interfaceC5995aGw = this.AEQbTJ;
        if (interfaceC5995aGw != null) {
            int i2 = fetchVPNInfo + 109;
            AYXKKw = i2 % 128;
            int i3 = i2 % 2;
            FragmentActivity fragmentActivityKWHzl = interfaceC5995aGw.KWHzl();
            if (fragmentActivityKWHzl != null) {
                java.util.concurrent.Executor mainExecutor = ContextCompat.getMainExecutor(this.copydefault);
                Intrinsics.checkNotNullExpressionValue(mainExecutor, "");
                BiometricPrompt.CryptoObject cryptoObjectAEQbTJ = AEQbTJ();
                BiometricPrompt.PromptInfo promptInfoBuild = cryptoObjectAEQbTJ != null ? new BiometricPrompt.PromptInfo.Builder().setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.fGQ)).setNegativeButtonText(C33070mpX.AYXKKw(C8206ayP.Dialog.zSsVtY)).setAllowedAuthenticators(15).build() : new BiometricPrompt.PromptInfo.Builder().setTitle(C33070mpX.AYXKKw(C8206ayP.Dialog.fGQ)).setAllowedAuthenticators(32783).build();
                int i4 = fetchVPNInfo + 125;
                AYXKKw = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.copydefault(promptInfoBuild);
                java.lang.Object objWithContext = BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new NativePasskeyKeyProviderImpl$authenticateWithBiometric$2(fragmentActivityKWHzl, mainExecutor, cryptoObjectAEQbTJ, promptInfoBuild, null), continuation);
                if (objWithContext != C56442yFn.copydefault()) {
                    return Unit.INSTANCE;
                }
                int i6 = fetchVPNInfo + 47;
                AYXKKw = i6 % 128;
                if (i6 % 2 == 0) {
                    return objWithContext;
                }
                throw null;
            }
        }
        pUU.copydefault("NativePasskeyKeyProviderImpl", "authenticateWithBiometric: no current activity");
        throw new OkxPasskeyException.KeyDataInvalid();
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        int i = 2 % 2;
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "removePasskeyKey " + str + " " + str2);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new char[]{57214, 32189, 43335, 6784, 56152, 26101, 44263, 38296, 28216, 54935, 664, 53340, 54441, 28769, 17817, 31153}, 15, objArr);
        KeyStore keyStore = KeyStore.getInstance(((java.lang.String) objArr[0]).intern());
        keyStore.load(null);
        java.lang.String strCopydefault = copydefault(str, str2);
        if (keyStore.containsAlias(strCopydefault)) {
            int i2 = AYXKKw + 85;
            fetchVPNInfo = i2 % 128;
            int i3 = i2 % 2;
            keyStore.deleteEntry(strCopydefault);
        }
        int i4 = fetchVPNInfo + 25;
        AYXKKw = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void gEmmrt(java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "storeCredentialMapping " + str + " " + str2);
        AhwBna().edit().putString(AEQbTJ(str), str2).apply();
        int i2 = fetchVPNInfo + 71;
        AYXKKw = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void valueOf(java.lang.String str) {
        int i = 2 % 2;
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "removeCredentialMapping " + str);
        AhwBna().edit().remove(AEQbTJ(str)).apply();
        int i2 = fetchVPNInfo + 3;
        AYXKKw = i2 % 128;
        int i3 = i2 % 2;
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        int i = 2 % 2;
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "loadCredentialIdByUserRp " + str);
        java.lang.String string = AhwBna().getString(AEQbTJ(str), null);
        int i2 = fetchVPNInfo + 71;
        AYXKKw = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, double d) {
        int i = 2 % 2;
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "storeCredentialMetadata " + str + " " + str2 + " " + str3);
        AhwBna().edit().putString(KWHzl(str), new C5997aGy(str, str2, str3, str4, d).copydefault()).apply();
        int i2 = AYXKKw + 31;
        fetchVPNInfo = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ java.lang.Object KWHzl(java.lang.Object[] objArr) {
        C5951aGE c5951aGE = (C5951aGE) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = 2 % 2;
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "removeCredentialMetadata " + str);
        c5951aGE.AhwBna().edit().remove(c5951aGE.KWHzl(str)).apply();
        int i2 = AYXKKw + 117;
        fetchVPNInfo = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 22 / 0;
        }
        return null;
    }

    public final java.lang.String djBIcL(java.lang.String str) {
        int i = 2 % 2;
        java.lang.String str2 = "label:" + str;
        int i2 = fetchVPNInfo + 5;
        AYXKKw = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 75 / 0;
        }
        return str2;
    }

    public final java.lang.String AYXKKw(java.lang.String str) {
        int i = 2 % 2;
        java.lang.String str2 = "account:" + str;
        int i2 = fetchVPNInfo + 69;
        AYXKKw = i2 % 128;
        if (i2 % 2 == 0) {
            return str2;
        }
        throw null;
    }

    public final java.lang.String AEQbTJ(java.lang.String str) {
        int i = 2 % 2;
        java.lang.String str2 = "mapping:" + str;
        int i2 = AYXKKw + 21;
        fetchVPNInfo = i2 % 128;
        if (i2 % 2 != 0) {
            return str2;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        int i = 2 % 2;
        java.lang.String str2 = "meta:" + str;
        int i2 = fetchVPNInfo + 39;
        AYXKKw = i2 % 128;
        int i3 = i2 % 2;
        return str2;
    }

    private static /* synthetic */ java.lang.Object EZpvd(java.lang.Object[] objArr) {
        byte[] bArr = (byte[]) objArr[1];
        int i = 2 % 2;
        java.lang.String strEncodeToString = android.util.Base64.encodeToString(bArr, 11);
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "base64Encode bytes=" + bArr.length);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        int i2 = AYXKKw + 13;
        fetchVPNInfo = i2 % 128;
        int i3 = i2 % 2;
        return strEncodeToString;
    }

    public final byte[] copydefault(java.lang.String str) {
        int i = 2 % 2;
        byte[] bArrDecode = android.util.Base64.decode(str, 11);
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "base64Decode len=" + str.length());
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
        int i2 = fetchVPNInfo + 61;
        AYXKKw = i2 % 128;
        int i3 = i2 % 2;
        return bArrDecode;
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "passkeyKeyAlias " + str + " " + str2);
        int iValueOf = C34701nh.TaskDescription.valueOf();
        int iValueOf2 = C34701nh.TaskDescription.valueOf();
        java.lang.String str3 = "com.okx.passkey.v2.passkey:" + ((java.lang.String) C5955aGI.EZpvd(C34701nh.TaskDescription.valueOf(), iValueOf, new java.lang.Object[]{str, str2}, C34701nh.TaskDescription.valueOf(), -1540279698, iValueOf2, 1540279698));
        int i2 = fetchVPNInfo + 99;
        AYXKKw = i2 % 128;
        int i3 = i2 % 2;
        return str3;
    }

    static void copydefault() {
        djBIcL = (char) 32216;
        AhwBna = (char) 48246;
        valueOf = (char) 29864;
        gEmmrt = (char) 51156;
    }

    public final void AhwBna(java.lang.String str) {
        int iEZpvd = C33514mxr.EZpvd();
        int iEZpvd2 = C33514mxr.EZpvd();
        int iEZpvd3 = C33514mxr.EZpvd();
        EZpvd(iEZpvd, C33514mxr.EZpvd(), -1904256008, iEZpvd3, 1904256010, iEZpvd2, new java.lang.Object[]{this, str});
    }

    public final java.lang.String AEQbTJ(byte[] bArr) {
        int iEZpvd = C33514mxr.EZpvd();
        int iEZpvd2 = C33514mxr.EZpvd();
        int iEZpvd3 = C33514mxr.EZpvd();
        return (java.lang.String) EZpvd(iEZpvd, C33514mxr.EZpvd(), -1454807856, iEZpvd3, 1454807859, iEZpvd2, new java.lang.Object[]{this, bArr});
    }

    public static final android.content.SharedPreferences AEQbTJ(C5951aGE c5951aGE) {
        int iEZpvd = C33514mxr.EZpvd();
        int iEZpvd2 = C33514mxr.EZpvd();
        int iEZpvd3 = C33514mxr.EZpvd();
        return (android.content.SharedPreferences) EZpvd(iEZpvd, C33514mxr.EZpvd(), -1520222211, iEZpvd3, 1520222212, iEZpvd2, new java.lang.Object[]{c5951aGE});
    }

    private final android.content.SharedPreferences AYXKKw() {
        int iEZpvd = C33514mxr.EZpvd();
        int iEZpvd2 = C33514mxr.EZpvd();
        int iEZpvd3 = C33514mxr.EZpvd();
        return (android.content.SharedPreferences) EZpvd(iEZpvd, C33514mxr.EZpvd(), 990950625, iEZpvd3, -990950625, iEZpvd2, new java.lang.Object[]{this});
    }
}
