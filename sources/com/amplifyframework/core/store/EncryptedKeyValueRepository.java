package com.amplifyframework.core.store;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKeys;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.logging.LoggingCategory;
import com.google.android.gms.stats.CodePackage;
import com.google.common.base.Ascii;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C56392yDr;
import o.C56524yIo;
import o.C59449zhJ;
import o.InterfaceC56387yDm;
import o.YY;
import o.Zh;
import o.yFI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class EncryptedKeyValueRepository implements KeyValueRepository {
    private static char AEQbTJ = 0;
    public static final Companion Companion;
    private static char EZpvd = 0;
    private static char KWHzl = 0;
    private static int OLrzqt = 0;
    public static final String amplifyIdentifierPrefix = "__amplify__";
    private static char copydefault;
    private static final Logger logger;
    private final KeyGenParameterSpec amplifyMasterKeySpec;
    private final Context context;
    private final KeyGenParameterSpec defaultMasterKeySpec;
    private final Function2<File, String, File> fileFactory;
    private final InterfaceC56387yDm sharedPreferences$delegate;
    private final String sharedPreferencesName;
    private static final byte[] $$a = {88, -88, -38, Ascii.SI};
    private static final int $$b = 235;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int valueOf = 0;
    private static int AYXKKw = 1;
    private static int gEmmrt = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, byte b2) {
        int i2;
        byte[] bArr = $$a;
        int i3 = b + 118;
        int i4 = 1 - (b2 * 4);
        int i5 = 4 - (i * 2);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i5;
            int i7 = i4;
            i2 = 0;
            int i8 = i5 + i7;
            i5 = i6 + 1;
            i3 = i8;
            bArr2[i2] = (byte) i3;
            i2++;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            i7 = bArr[i5];
            int i9 = i5;
            i5 = i3;
            i6 = i9;
            int i82 = i5 + i7;
            i5 = i6 + 1;
            i3 = i82;
            bArr2[i2] = (byte) i3;
            i2++;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i2++;
            if (i2 == i4) {
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function2<? super java.io.File, ? super java.lang.String, ? extends java.io.File> */
    /* JADX WARN: Multi-variable type inference failed */
    public EncryptedKeyValueRepository(@NotNull Context context, @NotNull String str, @NotNull KeyGenParameterSpec keyGenParameterSpec, @NotNull KeyGenParameterSpec keyGenParameterSpec2, @NotNull Function2<? super File, ? super String, ? extends File> function2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(keyGenParameterSpec, "");
        Intrinsics.checkNotNullParameter(keyGenParameterSpec2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        this.context = context;
        this.sharedPreferencesName = str;
        this.defaultMasterKeySpec = keyGenParameterSpec;
        this.amplifyMasterKeySpec = keyGenParameterSpec2;
        this.fileFactory = function2;
        this.sharedPreferences$delegate = C56392yDr.copydefault(new Function0<SharedPreferences>() { // from class: com.amplifyframework.core.store.EncryptedKeyValueRepository$sharedPreferences$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final SharedPreferences invoke() {
                return EncryptedKeyValueRepository.access$getOrCreateSharedPreferences(this.this$0);
            }
        });
    }

    public static final /* synthetic */ SharedPreferences access$getOrCreateSharedPreferences(EncryptedKeyValueRepository encryptedKeyValueRepository) throws Throwable {
        int i = 2 % 2;
        int i2 = AYXKKw + 103;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        SharedPreferences orCreateSharedPreferences = encryptedKeyValueRepository.getOrCreateSharedPreferences();
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        int i5 = valueOf + 7;
        AYXKKw = i5 % 128;
        int i6 = i5 % 2;
        return orCreateSharedPreferences;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EncryptedKeyValueRepository(@NotNull Context context, @NotNull String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Companion companion = Companion;
        this(context, str, companion.getDefaultMasterKeySpec(), companion.getAmplifyMasterKeySpec(), new Function2<File, String, File>() { // from class: com.amplifyframework.core.store.EncryptedKeyValueRepository.1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final File invoke(@NotNull File file, @NotNull String str2) {
                Intrinsics.checkNotNullParameter(file, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new File(file, str2);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final SharedPreferences getSharedPreferences() {
        int i = 2 % 2;
        int i2 = AYXKKw + WalletImportError.ERROR_CODE_HARDWARE_ACCOUNT_EXIST;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        SharedPreferences sharedPreferences = (SharedPreferences) this.sharedPreferences$delegate.getValue();
        int i4 = AYXKKw + 91;
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            return sharedPreferences;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.core.store.KeyValueRepository
    public String get(@NotNull String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        SharedPreferences sharedPreferences = getSharedPreferences();
        String string = null;
        if (sharedPreferences != null) {
            int i2 = AYXKKw + 71;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
            string = sharedPreferences.getString(str, null);
            int i4 = valueOf + 53;
            AYXKKw = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 3;
            }
        }
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [58=4] */
    private final void edit(Function1<? super SharedPreferences.Editor, Unit> function1) {
        int i = 2 % 2;
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences != null) {
            int i2 = AYXKKw + 11;
            valueOf = i2 % 128;
            int i3 = i2 % 2;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (editorEdit != null) {
                int i4 = AYXKKw + 119;
                valueOf = i4 % 128;
                int i5 = i4 % 2;
                function1.invoke(editorEdit);
                editorEdit.apply();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [69=4] */
    private final SharedPreferences getOrCreateSharedPreferences() throws Throwable {
        int i = 2 % 2;
        String installationIdentifier = getInstallationIdentifier();
        if (!C59449zhJ.startsWith$default(installationIdentifier, amplifyIdentifierPrefix, false, 2, null)) {
            return openKeystoreWithDefaultMasterKey(installationIdentifier);
        }
        int i2 = AYXKKw + 67;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            openKeystoreWithAmplifyMasterKey(installationIdentifier);
            throw null;
        }
        SharedPreferences sharedPreferencesOpenKeystoreWithAmplifyMasterKey = openKeystoreWithAmplifyMasterKey(installationIdentifier);
        int i3 = valueOf + 103;
        AYXKKw = i3 % 128;
        int i4 = i3 % 2;
        return sharedPreferencesOpenKeystoreWithAmplifyMasterKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final SharedPreferences openKeystoreWithAmplifyMasterKey(String str) throws Throwable {
        int i = 2 % 2;
        int i2 = AYXKKw + 55;
        valueOf = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getMasterKeyOrNull(this.amplifyMasterKeySpec);
            obj.hashCode();
            throw null;
        }
        String masterKeyOrNull = getMasterKeyOrNull(this.amplifyMasterKeySpec);
        if (masterKeyOrNull == null) {
            logger.warn("Unable to retrieve Amplify master key. Deleting invalid master key and creating new one");
            deleteAmplifyMasterKey();
            masterKeyOrNull = getMasterKeyOrNull(this.defaultMasterKeySpec);
            if (masterKeyOrNull == null) {
                masterKeyOrNull = "";
            }
        }
        String sharedPrefsFileName = getSharedPrefsFileName(str);
        SharedPreferences sharedPreferencesOrNull = getSharedPreferencesOrNull(sharedPrefsFileName, masterKeyOrNull);
        if (sharedPreferencesOrNull == null) {
            logger.warn("Cannot retrieve preferences encrypted with amplify master key. Deleting and recreating.");
            deleteSharedPreferences(sharedPrefsFileName);
            SharedPreferences sharedPreferencesOrNull2 = getSharedPreferencesOrNull(sharedPrefsFileName, masterKeyOrNull);
            int i3 = valueOf + 47;
            AYXKKw = i3 % 128;
            int i4 = i3 % 2;
            return sharedPreferencesOrNull2;
        }
        int i5 = AYXKKw + 71;
        int i6 = i5 % 128;
        valueOf = i6;
        int i7 = i5 % 2;
        int i8 = i6 + 87;
        AYXKKw = i8 % 128;
        if (i8 % 2 != 0) {
            return sharedPreferencesOrNull;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final SharedPreferences openKeystoreWithDefaultMasterKey(String str) {
        SharedPreferences sharedPreferencesOrNull;
        int i = 2 % 2;
        int i2 = valueOf + 59;
        AYXKKw = i2 % 128;
        int i3 = i2 % 2;
        String masterKeyOrNull = getMasterKeyOrNull(this.defaultMasterKeySpec);
        if (masterKeyOrNull == null || (sharedPreferencesOrNull = getSharedPreferencesOrNull(getSharedPrefsFileName(str), masterKeyOrNull)) == null) {
            logger.warn("Cannot retrieve preferences encrypted with default master key. Deleting and recreating.");
            deleteSharedPreferences(getSharedPrefsFileName(str));
            return openKeystoreWithAmplifyMasterKey(createInstallationIdentifier(getInstallationFile()));
        }
        int i4 = AYXKKw + 65;
        valueOf = i4 % 128;
        int i5 = i4 % 2;
        return sharedPreferencesOrNull;
    }

    private final SharedPreferences getSharedPreferencesOrNull(String str, String str2) {
        SharedPreferences sharedPreferencesOrThrow;
        int i = 2 % 2;
        int i2 = AYXKKw + 99;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        try {
            sharedPreferencesOrThrow = getSharedPreferencesOrThrow(str, str2);
            int i4 = valueOf + 9;
            AYXKKw = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 % 5;
            }
        } catch (Exception unused) {
            sharedPreferencesOrThrow = null;
        }
        int i6 = AYXKKw + 9;
        valueOf = i6 % 128;
        if (i6 % 2 == 0) {
            return sharedPreferencesOrThrow;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [111=4] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        Zh zh = new Zh();
        char[] cArr2 = new char[cArr.length];
        zh.EZpvd = 0;
        char[] cArr3 = new char[2];
        while (zh.EZpvd < cArr.length) {
            int i4 = $10 + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
            $11 = i4 % 128;
            int i5 = 58224;
            if (i4 % 2 == 0) {
                cArr3[0] = cArr[zh.EZpvd];
                cArr3[1] = cArr[zh.EZpvd - 1];
                i2 = 1;
            } else {
                cArr3[0] = cArr[zh.EZpvd];
                cArr3[1] = cArr[zh.EZpvd + 1];
                i2 = 0;
            }
            while (i2 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (((long) copydefault) ^ 6538634990023091910L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(EZpvd)};
                    Object objEZpvd = YY.EZpvd(-2045992360);
                    if (objEZpvd == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objEZpvd = YY.EZpvd(501, 5, (char) 0, -2111017180, false, $$c(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objEZpvd).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) KWHzl) ^ 6538634990023091910L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(AEQbTJ)};
                    Object objEZpvd2 = YY.EZpvd(-2045992360);
                    if (objEZpvd2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objEZpvd2 = YY.EZpvd(501, 5, (char) 0, -2111017180, false, $$c(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objEZpvd2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i2++;
                    int i6 = $10 + 65;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[zh.EZpvd] = cArr3[0];
            cArr2[zh.EZpvd + 1] = cArr3[1];
            Object[] objArr4 = {zh, zh};
            Object objEZpvd3 = YY.EZpvd(-549847163);
            if (objEZpvd3 == null) {
                byte b5 = (byte) ($$b & 5);
                byte b6 = (byte) (b5 - 1);
                objEZpvd3 = YY.EZpvd(615, 5, (char) 1207, -619105543, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objEZpvd3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final SharedPreferences getSharedPreferencesOrThrow(String str, String str2) throws GeneralSecurityException, IOException {
        int i = 2 % 2;
        int i2 = AYXKKw + 23;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        SharedPreferences sharedPreferencesCreate = EncryptedSharedPreferences.create(str, str2, this.context, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
        Intrinsics.checkNotNullExpressionValue(sharedPreferencesCreate, "");
        int i4 = valueOf + 29;
        AYXKKw = i4 % 128;
        int i5 = i4 % 2;
        return sharedPreferencesCreate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final boolean deleteSharedPreferences(String str) {
        int i = 2 % 2;
        int i2 = AYXKKw + 15;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            this.context.deleteSharedPreferences(str);
            throw null;
        }
        boolean zDeleteSharedPreferences = this.context.deleteSharedPreferences(str);
        int i3 = AYXKKw + 57;
        valueOf = i3 % 128;
        int i4 = i3 % 2;
        return zDeleteSharedPreferences;
    }

    private final void deleteAmplifyMasterKey() throws Throwable {
        int i = 2 % 2;
        int i2 = valueOf + 65;
        AYXKKw = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(new char[]{40349, 32507, 45535, 60378, 32186, 24421, 27122, 43948, 1062, 60667, 13156, 58707, 47258, 14490, 53878, 25716}, 15, objArr);
        KeyStore keyStore = KeyStore.getInstance(((String) objArr[0]).intern());
        keyStore.load(null);
        keyStore.deleteEntry(this.amplifyMasterKeySpec.getKeystoreAlias());
        int i4 = valueOf + 7;
        AYXKKw = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final String getMasterKeyOrNull(KeyGenParameterSpec keyGenParameterSpec) {
        int i = 2 % 2;
        int i2 = valueOf + 123;
        AYXKKw = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < 3) {
            int i5 = AYXKKw + WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY;
            valueOf = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    return getMasterKeyOrThrow(keyGenParameterSpec);
                }
                int i6 = 57 / 0;
                return getMasterKeyOrThrow(keyGenParameterSpec);
            } catch (Exception e) {
                i4++;
                logger.warn("Unable to retrieve master key, attempt " + i4 + " / 3", e);
            }
        }
        int i7 = valueOf + 45;
        AYXKKw = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final String getMasterKeyOrThrow(KeyGenParameterSpec keyGenParameterSpec) throws GeneralSecurityException, IOException {
        int i = 2 % 2;
        int i2 = AYXKKw + 9;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        String orCreate = MasterKeys.getOrCreate(keyGenParameterSpec);
        Intrinsics.checkNotNullExpressionValue(orCreate, "");
        int i4 = valueOf + 15;
        AYXKKw = i4 % 128;
        int i5 = i4 % 2;
        return orCreate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String getSharedPrefsFileName(String str) {
        int i = 2 % 2;
        String str2 = this.sharedPreferencesName + JwtUtilsKt.JWT_DELIMITER + str;
        int i2 = valueOf + 13;
        AYXKKw = i2 % 128;
        if (i2 % 2 != 0) {
            return str2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final File getInstallationFile() {
        int i = 2 % 2;
        Function2<File, String, File> function2 = this.fileFactory;
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "");
        File fileInvoke = function2.invoke(noBackupFilesDir, this.sharedPreferencesName + ".installationIdentifier");
        int i2 = AYXKKw + 53;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return fileInvoke;
        }
        throw null;
    }

    private final String getInstallationIdentifier() {
        String existingInstallationIdentifier;
        synchronized (this) {
            File installationFile = getInstallationFile();
            existingInstallationIdentifier = getExistingInstallationIdentifier(installationFile);
            if (existingInstallationIdentifier == null) {
                existingInstallationIdentifier = createInstallationIdentifier(installationFile);
            }
        }
        return existingInstallationIdentifier;
    }

    private final String getExistingInstallationIdentifier(File file) {
        int i = 2 % 2;
        if (!file.exists()) {
            return null;
        }
        int i2 = AYXKKw + 21;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        String text$default = yFI.readText$default(file, null, 1, null);
        if (i3 == 0 ? (!StringsKt__StringsKt.fARcdN((CharSequence) text$default)) : !StringsKt__StringsKt.fARcdN((CharSequence) text$default)) {
            return text$default;
        }
        int i4 = AYXKKw + 115;
        valueOf = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final String createInstallationIdentifier(File file) {
        int i = 2 % 2;
        String str = amplifyIdentifierPrefix + UUID.randomUUID();
        writeInstallationIdentifier(file, str);
        int i2 = AYXKKw + 17;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    private final void writeInstallationIdentifier(File file, String str) {
        int i = 2 % 2;
        int i2 = valueOf + 89;
        AYXKKw = i2 % 128;
        int i3 = i2 % 2;
        try {
            yFI.writeText$default(file, str, null, 2, null);
            int i4 = valueOf + 49;
            AYXKKw = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception unused) {
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.core.store.EncryptedKeyValueRepository.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getAmplifyIdentifierPrefix$com_amplifyframework_core_release$annotations() {
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final KeyGenParameterSpec getDefaultMasterKeySpec() {
            KeyGenParameterSpec keyGenParameterSpec = MasterKeys.AES256_GCM_SPEC;
            Intrinsics.checkNotNullExpressionValue(keyGenParameterSpec, "");
            return keyGenParameterSpec;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final KeyGenParameterSpec getAmplifyMasterKeySpec() {
            KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("amplify_master_key", 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build();
            Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "");
            return keyGenParameterSpecBuild;
        }
    }

    static {
        OLrzqt = 0;
        AEQbTJ();
        Companion = new Companion(null);
        LoggingCategory loggingCategory = Amplify.Logging;
        String strValueOf = C56524yIo.AEQbTJ(EncryptedKeyValueRepository.class).valueOf();
        Intrinsics.copydefault((Object) strValueOf);
        Logger loggerForNamespace = loggingCategory.forNamespace(strValueOf);
        Intrinsics.checkNotNullExpressionValue(loggerForNamespace, "");
        logger = loggerForNamespace;
        int i = gEmmrt + 61;
        OLrzqt = i % 128;
        if (i % 2 != 0) {
            int i2 = 47 / 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void put(@NotNull String str, String str2) {
        int i = 2 % 2;
        int i2 = AYXKKw + 121;
        valueOf = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences != null) {
            int i4 = valueOf + 19;
            AYXKKw = i4 % 128;
            if (i4 % 2 == 0) {
                sharedPreferences.edit();
                throw null;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (editorEdit != null) {
                Intrinsics.copydefault(editorEdit);
                editorEdit.putString(str, str2);
                editorEdit.apply();
            }
        }
        int i5 = valueOf + 3;
        AYXKKw = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void remove(@NotNull String str) {
        SharedPreferences.Editor editorEdit;
        int i = 2 % 2;
        int i2 = valueOf + 71;
        AYXKKw = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        int i4 = valueOf + 91;
        AYXKKw = i4 % 128;
        if (i4 % 2 != 0) {
            Intrinsics.copydefault(editorEdit);
            editorEdit.remove(str);
            editorEdit.apply();
        } else {
            Intrinsics.copydefault(editorEdit);
            editorEdit.remove(str);
            editorEdit.apply();
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [226=4] */
    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void removeAll() {
        int i = 2 % 2;
        SharedPreferences sharedPreferences = getSharedPreferences();
        if (sharedPreferences != null) {
            int i2 = AYXKKw + 69;
            valueOf = i2 % 128;
            if (i2 % 2 != 0) {
                sharedPreferences.edit();
                throw null;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (editorEdit != null) {
                int i3 = AYXKKw + 29;
                valueOf = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.copydefault(editorEdit);
                editorEdit.clear();
                editorEdit.apply();
                int i5 = AYXKKw + 33;
                valueOf = i5 % 128;
                int i6 = i5 % 2;
            }
        }
    }

    static void AEQbTJ() {
        KWHzl = (char) 26142;
        AEQbTJ = (char) 49037;
        copydefault = (char) 49623;
        EZpvd = (char) 25395;
    }
}
