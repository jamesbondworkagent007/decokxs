package com.amplifyframework.auth.cognito.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.amplifyframework.core.store.KeyValueRepository;
import com.amplifyframework.statemachine.codegen.errors.CredentialStoreError;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LegacyKeyValueRepository implements KeyValueRepository {
    private static final int AWS_KEY_VALUE_STORE_VERSION = 1;
    private static final String AWS_KEY_VALUE_STORE_VERSION_1_KEY_STORE_ALIAS_FOR_AES_SUFFIX = ".aesKeyStoreAlias";
    private static final String CHARSET_NAME = "UTF-8";
    private static final String CIPHER_AES_GCM_NOPADDING = "AES/GCM/NoPadding";
    private static final int CIPHER_AES_GCM_NOPADDING_IV_LENGTH_IN_BYTES = 12;
    private static final int CIPHER_AES_GCM_NOPADDING_TAG_LENGTH_LENGTH_IN_BITS = 128;
    public static final Companion Companion = new Companion(null);
    private static final String SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX = ".encrypted";
    private static final String SHARED_PREFERENCES_IV_SUFFIX = ".iv";
    private static final String SHARED_PREFERENCES_STORE_VERSION_SUFFIX = ".keyvaluestoreversion";
    private final Map<String, String> cache;
    private final Map<String, Map<String, String>> cacheFactory;
    private boolean isPersistenceEnabled;
    private final SecureRandom secureRandom;
    private SharedPreferences sharedPreferencesForData;
    private final String sharedPreferencesName;

    public LegacyKeyValueRepository(@NotNull Context context, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.sharedPreferencesName = str;
        this.isPersistenceEnabled = z;
        this.secureRandom = new SecureRandom();
        this.cacheFactory = new LinkedHashMap();
        this.cache = getCacheForKey(str);
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "");
        this.sharedPreferencesForData = sharedPreferences;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (r2v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
 A[MD:(android.content.Context, java.lang.String, boolean):void (m)] (LINE:31) call: com.amplifyframework.auth.cognito.data.LegacyKeyValueRepository.<init>(android.content.Context, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ LegacyKeyValueRepository(Context context, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? true : z);
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void removeAll() {
        KeyValueRepository.DefaultImpls.removeAll(this);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.data.LegacyKeyValueRepository.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void put(@NotNull String str, String str2) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        if (str2 != null) {
            this.cache.put(str, str2);
        }
        if (this.isPersistenceEnabled) {
            if (str2 == null) {
                remove(str);
                return;
            }
            String dataKeyUsedInPersistentStore = getDataKeyUsedInPersistentStore(str);
            String encryptionKeyAlias = getEncryptionKeyAlias();
            Object objM5955retrieveEncryptionKeyIoAF18A = m5955retrieveEncryptionKeyIoAF18A(encryptionKeyAlias);
            if (Result.m7380exceptionOrNullimpl(objM5955retrieveEncryptionKeyIoAF18A) != null) {
                m5954generateEncryptionKeyIoAF18A(encryptionKeyAlias);
            }
            if (Result.m7380exceptionOrNullimpl(objM5955retrieveEncryptionKeyIoAF18A) != null) {
                return;
            }
            try {
                byte[] bArrGenerateInitializationVector = generateInitializationVector();
                C56391yDq.AEQbTJ(objM5955retrieveEncryptionKeyIoAF18A);
                String strEncrypt = encrypt((Key) objM5955retrieveEncryptionKeyIoAF18A, new GCMParameterSpec(128, bArrGenerateInitializationVector), str2);
                String strEncodeToString = Base64.encodeToString(bArrGenerateInitializationVector, 0);
                if (strEncodeToString == null) {
                    throw new Exception("Error in Base64 encoding the IV for dataKey = " + str);
                }
                this.sharedPreferencesForData.edit().putString(dataKeyUsedInPersistentStore, strEncrypt).putString(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_IV_SUFFIX, strEncodeToString).putInt(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_STORE_VERSION_SUFFIX, 1).apply();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public String get(@NotNull String str) {
        Integer numValueOf;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            if (!this.isPersistenceEnabled) {
                return this.cache.get(str);
            }
            String dataKeyUsedInPersistentStore = getDataKeyUsedInPersistentStore(str);
            Object objM5955retrieveEncryptionKeyIoAF18A = m5955retrieveEncryptionKeyIoAF18A(getEncryptionKeyAlias());
            String str2 = null;
            if (Result.m7380exceptionOrNullimpl(objM5955retrieveEncryptionKeyIoAF18A) != null) {
                return null;
            }
            if (!this.sharedPreferencesForData.contains(dataKeyUsedInPersistentStore)) {
                return null;
            }
            try {
                String string = this.sharedPreferencesForData.getString(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_STORE_VERSION_SUFFIX, MultiTransferSignData.DEFAULT_INTERVAL);
                numValueOf = string != null ? Integer.valueOf(Integer.parseInt(string)) : null;
            } catch (Exception unused) {
                remove(str);
            }
            if (numValueOf != null && numValueOf.intValue() == 1) {
                String string2 = this.sharedPreferencesForData.getString(dataKeyUsedInPersistentStore, null);
                C56391yDq.AEQbTJ(objM5955retrieveEncryptionKeyIoAF18A);
                String strDecrypt = decrypt((Key) objM5955retrieveEncryptionKeyIoAF18A, getInitializationVector(dataKeyUsedInPersistentStore), string2);
                if (strDecrypt != null) {
                    this.cache.put(str, strDecrypt);
                    str2 = strDecrypt;
                }
                return str2;
            }
            return null;
        }
    }

    private final AlgorithmParameterSpec getInitializationVector(String str) throws Exception {
        String str2 = str + SHARED_PREFERENCES_IV_SUFFIX;
        if (!this.sharedPreferencesForData.contains(str2)) {
            throw new Exception("Initialization vector for " + str + " is missing from the SharedPreferences.");
        }
        String string = this.sharedPreferencesForData.getString(str2, null);
        if (string == null) {
            throw new Exception("Cannot read the initialization vector for " + str + " from SharedPreferences.");
        }
        byte[] bArrDecode = Base64.decode(string, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
        if (bArrDecode.length == 0) {
            throw new Exception("Cannot base64 decode the initialization vector for " + str + " read from SharedPreferences.");
        }
        return new GCMParameterSpec(128, bArrDecode);
    }

    private final String decrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, String str) {
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
            Cipher cipher = Cipher.getInstance(CIPHER_AES_GCM_NOPADDING);
            cipher.init(2, key, algorithmParameterSpec);
            byte[] bArrDoFinal = cipher.doFinal(bArrDecode);
            Intrinsics.copydefault(bArrDoFinal);
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "");
            return new String(bArrDoFinal, charsetForName);
        } catch (Exception unused) {
            return null;
        }
    }

    private final byte[] generateInitializationVector() {
        byte[] bArr = new byte[12];
        this.secureRandom.nextBytes(bArr);
        return bArr;
    }

    private final String getEncryptionKeyAlias() {
        return this.sharedPreferencesName + AWS_KEY_VALUE_STORE_VERSION_1_KEY_STORE_ALIAS_FOR_AES_SUFFIX;
    }

    @Override // com.amplifyframework.core.store.KeyValueRepository
    public void remove(@NotNull String str) {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            this.cache.remove(str);
            if (this.isPersistenceEnabled) {
                String dataKeyUsedInPersistentStore = getDataKeyUsedInPersistentStore(str);
                this.sharedPreferencesForData.edit().remove(dataKeyUsedInPersistentStore).remove(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_IV_SUFFIX).remove(dataKeyUsedInPersistentStore + SHARED_PREFERENCES_STORE_VERSION_SUFFIX).apply();
            }
        }
    }

    private final String getDataKeyUsedInPersistentStore(String str) {
        return str + SHARED_PREFERENCES_DATA_IDENTIFIER_SUFFIX;
    }

    /* JADX INFO: renamed from: retrieveEncryptionKey-IoAF18A, reason: not valid java name */
    private final Object m5955retrieveEncryptionKeyIoAF18A(String str) {
        Object objM5953retrieveKeyIoAF18A;
        synchronized (this) {
            LegacyKeyProvider legacyKeyProvider = LegacyKeyProvider.INSTANCE;
            objM5953retrieveKeyIoAF18A = legacyKeyProvider.m5953retrieveKeyIoAF18A(str);
            if (Result.m7380exceptionOrNullimpl(objM5953retrieveKeyIoAF18A) != null) {
                legacyKeyProvider.deleteKey(str);
                Result.Application application = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(new CredentialStoreError("Key cannot be retrieved. Deleting the encryption key identified by the keyAlias: " + str, null, 2, null)));
            }
        }
        return objM5953retrieveKeyIoAF18A;
    }

    /* JADX INFO: renamed from: generateEncryptionKey-IoAF18A, reason: not valid java name */
    private final Object m5954generateEncryptionKeyIoAF18A(String str) {
        Object objM5952generateKeyIoAF18A;
        synchronized (this) {
            objM5952generateKeyIoAF18A = LegacyKeyProvider.INSTANCE.m5952generateKeyIoAF18A(str);
        }
        return objM5952generateKeyIoAF18A;
    }

    private final String encrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, String str) {
        try {
            Cipher cipher = Cipher.getInstance(CIPHER_AES_GCM_NOPADDING);
            cipher.init(1, key, algorithmParameterSpec);
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "");
            byte[] bytes = str.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            return Base64.encodeToString(cipher.doFinal(bytes), 0);
        } catch (Exception e) {
            e.toString();
            return null;
        }
    }

    private final Map<String, String> getCacheForKey(String str) {
        Map<String, Map<String, String>> map = this.cacheFactory;
        Map<String, String> linkedHashMap = map.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            map.put(str, linkedHashMap);
        }
        return linkedHashMap;
    }
}
