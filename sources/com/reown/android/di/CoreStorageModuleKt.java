package com.reown.android.di;

import android.content.Context;
import android.content.SharedPreferences;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.gms.stats.CodePackage;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import com.reown.android.internal.common.di.AndroidCommonDITags;
import com.reown.android.internal.common.di.BaseStorageModuleKt;
import com.reown.android.internal.common.di.DatabaseConfig;
import com.reown.android.internal.common.di.DatabaseConfigKt;
import com.reown.android.sdk.core.AndroidCoreDatabase;
import com.reown.foundation.util.Logger;
import com.reown.util.UtilFunctionsKt;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.zetetic.database.sqlcipher.SQLiteDatabaseHook;
import net.zetetic.database.sqlcipher.SupportOpenHelperFactory;
import o.AbstractC59982ztK;
import o.C56524yIo;
import o.C56529yIt;
import o.C59930zsL;
import o.C59976ztE;
import o.C59978ztG;
import o.C59990ztS;
import o.C59991ztT;
import o.C60053zuc;
import o.C60055zue;
import o.C60058zuh;
import o.C60059zui;
import o.C60060zuj;
import o.C60064zun;
import o.ColorStateList;
import o.Cursor;
import o.IntentSender;
import o.InterfaceC59997ztZ;
import o.PackageManager;
import o.YG;
import o.YY;
import o.Zi;
import o.yDY;
import org.jetbrains.annotations.NotNull;
import org.koin.android.error.MissingAndroidContextException;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes12.dex */
public final class CoreStorageModuleKt {
    public static final String ANDROID_KEYSTORE = "AndroidKeyStore";
    private static int EZpvd = 0;
    public static final String KEYSTORE_ALIAS = "_wc_db_key_";
    public static final int KEY_SIZE = 256;
    private static long OLrzqt = 0;
    public static final String SHARED_PREFS_FILENAME = "db_key_store";
    public static final Cipher cipher;
    public static final KeyGenParameterSpec keyGenParameterSpec;
    public static final KeyStore keyStore;
    private static final byte[] $$a = {1, 37, -122, 42};
    private static final int $$b = 48;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int copydefault = 0;
    private static int KWHzl = 1;
    private static int AEQbTJ = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i) {
        int i2;
        int i3;
        int i4 = (s * 2) + 98;
        int i5 = 1 - (s2 * 4);
        int i6 = 4 - (i * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i4 += i6;
            i6 = i7 + 1;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            i7 = i6;
            i6 = bArr[i6];
            i4 += i6;
            i6 = i7 + 1;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            if (i3 == i5) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final /* synthetic */ SharedPreferences access$createSharedPreferences(C60060zuj c60060zuj) {
        int i = 2 % 2;
        int i2 = KWHzl + 39;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SharedPreferences sharedPreferencesCreateSharedPreferences = createSharedPreferences(c60060zuj);
        int i4 = copydefault + 103;
        KWHzl = i4 % 128;
        int i5 = i4 % 2;
        return sharedPreferencesCreateSharedPreferences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final /* synthetic */ void access$deleteSharedPreferences(C60060zuj c60060zuj) {
        int i = 2 % 2;
        int i2 = KWHzl + 51;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        deleteSharedPreferences(c60060zuj);
        int i4 = KWHzl + 61;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ Cipher access$getCipher$p() {
        int i = 2 % 2;
        int i2 = KWHzl;
        int i3 = i2 + 103;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Cipher cipher2 = cipher;
        int i5 = i2 + 121;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return cipher2;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final /* synthetic */ SecretKey access$getSecretKey() {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        KWHzl = i2 % 128;
        if (i2 % 2 == 0) {
            getSecretKey();
            throw null;
        }
        SecretKey secretKey = getSecretKey();
        int i3 = KWHzl + 123;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return secretKey;
        }
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final /* synthetic */ C59991ztT access$signingModule() {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        KWHzl = i2 % 128;
        int i3 = i2 % 2;
        C59991ztT c59991ztTSigningModule = signingModule();
        int i4 = copydefault + 57;
        KWHzl = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return c59991ztTSigningModule;
    }

    static {
        EZpvd = 0;
        AEQbTJ();
        Object[] objArr = new Object[1];
        a(new char[]{13613, 943, 22610, 37145, 61367, 9316, 32006, 19356, 32865, 55552, 6141, 27767, 42271, 62423, 51327}, 13997, objArr);
        KeyStore keyStore2 = KeyStore.getInstance(((String) objArr[0]).intern());
        keyStore2.load(null);
        Intrinsics.checkNotNullExpressionValue(keyStore2, "");
        keyStore = keyStore2;
        Cipher cipher2 = Cipher.getInstance("AES/GCM/NoPadding");
        Intrinsics.checkNotNullExpressionValue(cipher2, "");
        cipher = cipher2;
        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(KEYSTORE_ALIAS, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").setKeySize(256).build();
        Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "");
        keyGenParameterSpec = keyGenParameterSpecBuild;
        int i = AEQbTJ + 21;
        EZpvd = i % 128;
        int i2 = i % 2;
    }

    public static final SharedPreferences createSharedPreferences(C60060zuj c60060zuj) {
        SharedPreferences sharedPreferencesCreate;
        synchronized (CoreStorageModuleKt.class) {
            MasterKey masterKeyBuild = new MasterKey.Builder(C59930zsL.AEQbTJ(c60060zuj), KEYSTORE_ALIAS).setKeyGenParameterSpec(keyGenParameterSpec).build();
            Intrinsics.checkNotNullExpressionValue(masterKeyBuild, "");
            sharedPreferencesCreate = EncryptedSharedPreferences.create(C59930zsL.AEQbTJ(c60060zuj), SHARED_PREFS_FILENAME, masterKeyBuild, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesCreate, "");
        }
        return sharedPreferencesCreate;
    }

    public static final void deleteSharedPreferences(C60060zuj c60060zuj) {
        synchronized (CoreStorageModuleKt.class) {
            try {
                Context contextAEQbTJ = C59930zsL.AEQbTJ(c60060zuj);
                if (contextAEQbTJ.getSharedPreferences(SHARED_PREFS_FILENAME, 0) != null) {
                    contextAEQbTJ.deleteSharedPreferences(SHARED_PREFS_FILENAME);
                }
                keyStore.deleteEntry(KEYSTORE_ALIAS);
            } catch (Exception e) {
                ((Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null)).error("Occurred when trying to reset encrypted shared prefs: " + e);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [73=5, 77=4] */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        Zi zi = new Zi();
        zi.OLrzqt = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        zi.AEQbTJ = 0;
        while (zi.AEQbTJ < cArr.length) {
            int i3 = zi.AEQbTJ;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[zi.AEQbTJ]), zi, zi};
                Object objEZpvd = YY.EZpvd(-295504478);
                if (objEZpvd == null) {
                    byte b = $$a[0];
                    byte b2 = (byte) (b - 1);
                    objEZpvd = YY.EZpvd(217, 4, (char) 0, -364758818, false, $$c(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objEZpvd).invoke(null, objArr2)).longValue() ^ (OLrzqt ^ 5439468278228498061L);
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
            int i4 = $10 + 53;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
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
                    throw null;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2[zi.AEQbTJ] = (char) jArr[zi.AEQbTJ];
            Object[] objArr5 = {zi, zi};
            Object objEZpvd4 = YY.EZpvd(1444313200);
            if (objEZpvd4 == null) {
                byte b7 = (byte) ($$a[0] - 1);
                byte b8 = b7;
                objEZpvd4 = YY.EZpvd(615, 5, (char) 1207, 1379317004, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objEZpvd4).invoke(null, objArr5);
        }
        String str = new String(cArr2);
        int i5 = $11 + 81;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    public static final SecretKey getSecretKey() {
        SecretKey secretKey;
        synchronized (CoreStorageModuleKt.class) {
            KeyStore keyStore2 = keyStore;
            KeyGenParameterSpec keyGenParameterSpec2 = keyGenParameterSpec;
            KeyStore.Entry entry = keyStore2.getEntry(keyGenParameterSpec2.getKeystoreAlias(), null);
            KeyStore.SecretKeyEntry secretKeyEntry = entry instanceof KeyStore.SecretKeyEntry ? (KeyStore.SecretKeyEntry) entry : null;
            secretKey = secretKeyEntry != null ? secretKeyEntry.getSecretKey() : null;
            if (secretKey == null) {
                Object[] objArr = new Object[1];
                a(new char[]{13613, 943, 22610, 37145, 61367, 9316, 32006, 19356, 32865, 55552, 6141, 27767, 42271, 62423, 51327}, 13997, objArr);
                KeyGenerator keyGenerator = KeyGenerator.getInstance(BouncyCastleKeyManagementRepository.AES, ((String) objArr[0]).intern());
                keyGenerator.init(keyGenParameterSpec2);
                secretKey = keyGenerator.generateKey();
                Intrinsics.checkNotNullExpressionValue(secretKey, "");
            }
        }
        return secretKey;
    }

    public static final C59991ztT signingModule() {
        C59991ztT c59991ztTModule$default;
        synchronized (CoreStorageModuleKt.class) {
            c59991ztTModule$default = C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.di.CoreStorageModuleKt.signingModule.1
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
                    invoke2(c59991ztT);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C59991ztT c59991ztT) {
                    Intrinsics.checkNotNullParameter(c59991ztT, "");
                    InterfaceC59997ztZ interfaceC59997ztZOLrzqt = C60058zuh.OLrzqt(AndroidBuildVariantDITags.DB_PASSPHRASE);
                    C06871 c06871 = new Function2<C60060zuj, C60053zuc, byte[]>() { // from class: com.reown.android.di.CoreStorageModuleKt.signingModule.1.1
                        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                        @Override // kotlin.jvm.functions.Function2
                        public final byte[] invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
                            SharedPreferences sharedPreferencesAccess$createSharedPreferences;
                            byte[] bArrDoFinal;
                            Intrinsics.checkNotNullParameter(c60060zuj, "");
                            Intrinsics.checkNotNullParameter(c60053zuc, "");
                            try {
                                sharedPreferencesAccess$createSharedPreferences = CoreStorageModuleKt.access$createSharedPreferences(c60060zuj);
                            } catch (Exception unused) {
                                CoreStorageModuleKt.access$deleteSharedPreferences(c60060zuj);
                                DatabaseConfigKt.deleteDatabases(c60060zuj);
                                sharedPreferencesAccess$createSharedPreferences = CoreStorageModuleKt.access$createSharedPreferences(c60060zuj);
                            }
                            String string = sharedPreferencesAccess$createSharedPreferences.getString("encryptedDBKey", null);
                            byte[] bArrDecode = string != null ? Base64.decode(string, 0) : null;
                            if (bArrDecode == null) {
                                bArrDoFinal = UtilFunctionsKt.randomBytes(32);
                                CoreStorageModuleKt.access$getCipher$p().init(1, CoreStorageModuleKt.access$getSecretKey());
                                byte[] bArrDoFinal2 = CoreStorageModuleKt.access$getCipher$p().doFinal(bArrDoFinal);
                                Intrinsics.checkNotNullExpressionValue(bArrDoFinal2, "");
                                byte[] iv = CoreStorageModuleKt.access$getCipher$p().getIV();
                                Intrinsics.checkNotNullExpressionValue(iv, "");
                                byte[] bArr = new byte[iv.length + 4 + bArrDoFinal2.length];
                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                                byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
                                byteBufferWrap.putInt(iv.length);
                                byteBufferWrap.put(iv);
                                byteBufferWrap.put(bArrDoFinal2);
                                sharedPreferencesAccess$createSharedPreferences.edit().putString("encryptedDBKey", Base64.encodeToString(bArr, 2)).apply();
                            } else {
                                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(bArrDecode);
                                byteBufferWrap2.order(ByteOrder.BIG_ENDIAN);
                                int i = byteBufferWrap2.getInt();
                                byte[] bArr2 = new byte[i];
                                byteBufferWrap2.get(bArr2);
                                byte[] bArr3 = new byte[(bArrDecode.length - 4) - i];
                                byteBufferWrap2.get(bArr3);
                                CoreStorageModuleKt.access$getCipher$p().init(2, CoreStorageModuleKt.access$getSecretKey(), new GCMParameterSpec(128, bArr2));
                                bArrDoFinal = CoreStorageModuleKt.access$getCipher$p().doFinal(bArr3);
                            }
                            Intrinsics.copydefault(bArrDoFinal);
                            return bArrDoFinal;
                        }
                    };
                    C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(C60059zui.KWHzl.KWHzl(), C56524yIo.AEQbTJ(byte[].class), interfaceC59997ztZOLrzqt, c06871, Kind.Singleton, yDY.AhwBna()));
                    c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                    if (c59991ztT.OLrzqt()) {
                        c59991ztT.KWHzl(c59990ztS);
                    }
                    new C59976ztE(c59991ztT, c59990ztS);
                }
            }, 1, null);
        }
        return c59991ztTModule$default;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final SupportOpenHelperFactory getSupportFactory(@NotNull Context context, @NotNull byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        loadSqlCipherLibrary(context);
        SupportOpenHelperFactory supportOpenHelperFactory = new SupportOpenHelperFactory(bArr, sQLiteDatabaseHook, z);
        int i2 = copydefault + 17;
        KWHzl = i2 % 128;
        int i3 = i2 % 2;
        return supportOpenHelperFactory;
    }

    public static final void loadSqlCipherLibrary(Context context) {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        KWHzl = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                System.loadLibrary("sqlcipher");
                return;
            }
            System.loadLibrary("sqlcipher");
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (UnsatisfiedLinkError e) {
            YG.copydefault(context, "sqlcipher", new YG.Application() { // from class: com.reown.android.di.CoreStorageModuleKt.loadSqlCipherLibrary.1
                @Override // o.YG.Application
                public void success() {
                }

                @Override // o.YG.Application
                public void failure(Throwable th) {
                    throw e;
                }
            });
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final C59991ztT coreStorageModule(@NotNull final String str, @NotNull final String str2) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C59991ztT c59991ztTModule$default = C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.di.CoreStorageModuleKt.coreStorageModule.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
                invoke2(c59991ztT);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C59991ztT c59991ztT) {
                Intrinsics.checkNotNullParameter(c59991ztT, "");
                c59991ztT.OLrzqt(BaseStorageModuleKt.baseStorageModule(str, str2), CoreStorageModuleKt.access$signingModule());
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(C60059zui.KWHzl.KWHzl(), C56524yIo.AEQbTJ(PackageManager.class), C60058zuh.OLrzqt(AndroidBuildVariantDITags.ANDROID_CORE_DATABASE_DRIVER), new Function2<C60060zuj, C60053zuc, PackageManager>() { // from class: com.reown.android.di.CoreStorageModuleKt.coreStorageModule.1.1
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final PackageManager invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) throws MissingAndroidContextException {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new Cursor(AndroidCoreDatabase.Companion.getSchema(), C59930zsL.AEQbTJ(c60060zuj), ((DatabaseConfig) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(DatabaseConfig.class), null, null)).getANDROID_CORE_DB_NAME(), CoreStorageModuleKt.getSupportFactory(C59930zsL.AEQbTJ(c60060zuj), (byte[]) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(byte[].class), C60058zuh.OLrzqt(AndroidBuildVariantDITags.DB_PASSPHRASE), null), null, false), null, 0, false, null, PsExtractor.VIDEO_STREAM_MASK, null);
                    }
                }, Kind.Singleton, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
            }
        }, 1, null);
        int i2 = copydefault + 61;
        KWHzl = i2 % 128;
        int i3 = i2 % 2;
        return c59991ztTModule$default;
    }

    public static /* synthetic */ C59991ztT coreStorageModule$default(String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = KWHzl + 105;
        copydefault = i3 % 128;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            str = com.reown.utils.UtilFunctionsKt.getEmpty(C56529yIt.KWHzl);
        }
        C59991ztT c59991ztTCoreStorageModule = coreStorageModule(str, str2);
        int i4 = KWHzl + 47;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return c59991ztTCoreStorageModule;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final C59991ztT sdkBaseStorageModule(@NotNull final ColorStateList<IntentSender.Activity<Unit>> colorStateList, @NotNull final String str) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(colorStateList, "");
        Intrinsics.checkNotNullParameter(str, "");
        Object obj = null;
        C59991ztT c59991ztTModule$default = C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.di.CoreStorageModuleKt.sdkBaseStorageModule.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
                invoke2(c59991ztT);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C59991ztT c59991ztT) {
                Intrinsics.checkNotNullParameter(c59991ztT, "");
                C60055zue c60055zueAEQbTJ = C60058zuh.AEQbTJ(str);
                final ColorStateList<IntentSender.Activity<Unit>> colorStateList2 = colorStateList;
                final String str2 = str;
                Function2<C60060zuj, C60053zuc, PackageManager> function2 = new Function2<C60060zuj, C60053zuc, PackageManager>() { // from class: com.reown.android.di.CoreStorageModuleKt.sdkBaseStorageModule.1.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final PackageManager invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) throws MissingAndroidContextException {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new Cursor(colorStateList2, C59930zsL.AEQbTJ(c60060zuj), str2, CoreStorageModuleKt.getSupportFactory(C59930zsL.AEQbTJ(c60060zuj), (byte[]) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(byte[].class), C60058zuh.OLrzqt(AndroidBuildVariantDITags.DB_PASSPHRASE), null), null, false), null, 0, false, null, PsExtractor.VIDEO_STREAM_MASK, null);
                    }
                };
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(C60059zui.KWHzl.KWHzl(), C56524yIo.AEQbTJ(PackageManager.class), c60055zueAEQbTJ, function2, Kind.Singleton, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
            }
        }, 1, null);
        int i2 = copydefault + 107;
        KWHzl = i2 % 128;
        if (i2 % 2 != 0) {
            return c59991ztTModule$default;
        }
        obj.hashCode();
        throw null;
    }

    static void AEQbTJ() {
        OLrzqt = -8182136246580444191L;
    }
}
