package o;

import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;
import com.okinc.wallet.core.encrypt.EncryptBean;
import com.okinc.wallet.core.encrypt.KeyCreationException;
import com.okinc.wallet.core.encrypt.KeyLostException;
import com.okinc.wallet.core.encrypt.KeyRetrievalException;
import com.okinc.wallet.core.encrypt.RandomSecretKey;
import com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.Security;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class xXZ {
    public static final xXZ EZpvd = new xXZ();

    private xXZ() {
    }

    public final EncryptBean KWHzl(@NotNull java.lang.String str, @NotNull java.security.Key key) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(key, "");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, key);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDoFinal = cipher.doFinal(bytes);
        if (cipher.getIV().length != 12) {
            throw new java.lang.IllegalArgumentException("Invalid iv length: + " + cipher.getIV().length);
        }
        javax.crypto.spec.GCMParameterSpec gCMParameterSpec = (javax.crypto.spec.GCMParameterSpec) cipher.getParameters().getParameterSpec(javax.crypto.spec.GCMParameterSpec.class);
        if (gCMParameterSpec.getTLen() != 128) {
            throw new java.lang.IllegalArgumentException("Invalid tag length: + " + gCMParameterSpec.getTLen());
        }
        java.lang.String strEncodeToString = android.util.Base64.encodeToString(bArrDoFinal, 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        java.lang.String strEncodeToString2 = android.util.Base64.encodeToString(cipher.getIV(), 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString2, "");
        return new EncryptBean(strEncodeToString, strEncodeToString2);
    }

    public final java.lang.String OLrzqt(@NotNull EncryptBean encryptBean, @NotNull java.security.Key key) throws javax.crypto.BadPaddingException, javax.crypto.NoSuchPaddingException, javax.crypto.IllegalBlockSizeException, java.security.NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Intrinsics.checkNotNullParameter(encryptBean, "");
        Intrinsics.checkNotNullParameter(key, "");
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, key, new javax.crypto.spec.GCMParameterSpec(128, android.util.Base64.decode(encryptBean.getIv(), 0)));
        byte[] bArrDoFinal = cipher.doFinal(android.util.Base64.decode(encryptBean.getEncryptedData(), 0));
        Intrinsics.copydefault(bArrDoFinal);
        return new java.lang.String(bArrDoFinal, Charsets.UTF_8);
    }

    public final KeyStore AEQbTJ() {
        KeyStore keyStoreCopydefault;
        synchronized (this) {
            try {
                keyStoreCopydefault = C47235tmH.OLrzqt.copydefault();
            } catch (java.lang.Exception e) {
                java.security.Provider[] providers = Security.getProviders();
                Intrinsics.checkNotNullExpressionValue(providers, "");
                java.util.ArrayList arrayList = new java.util.ArrayList(providers.length);
                for (java.security.Provider provider : providers) {
                    arrayList.add(provider.getName());
                }
                pUU.EZpvd("WalletEncryptionUtils", "supported providers: " + arrayList);
                pUU.AEQbTJ("WalletEncryptionUtils", "get key store failed", e);
                keyStoreCopydefault = null;
            }
        }
        return keyStoreCopydefault;
    }

    public final javax.crypto.SecretKey copydefault(@NotNull java.lang.String str, @NotNull KeyStore keyStore, boolean z) throws KeyLostException, KeyCreationException, KeyRetrievalException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(keyStore, "");
        try {
            java.security.Key key = keyStore.getKey(str, null);
            if (key != null) {
                return (javax.crypto.SecretKey) key;
            }
            if (z) {
                KeyLostException keyLostException = new KeyLostException(str);
                java.lang.String message = keyLostException.getMessage();
                pUU.copydefault("WalletEncryptionUtils", message != null ? message : "");
                throw keyLostException;
            }
            try {
                KeyGenParameterSpec.Builder encryptionPaddings = new KeyGenParameterSpec.Builder(str, 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding");
                Intrinsics.checkNotNullExpressionValue(encryptionPaddings, "");
                javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance(BouncyCastleKeyManagementRepository.AES, keyStore.getProvider());
                keyGenerator.init(encryptionPaddings.build());
                javax.crypto.SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
                pUU.KWHzl("WalletEncryptionUtils", "Key generated successfully.");
                Intrinsics.checkNotNullExpressionValue(secretKeyGenerateKey, "");
                return secretKeyGenerateKey;
            } catch (java.lang.Throwable th) {
                throw new KeyCreationException(str, th);
            }
        } catch (java.lang.Throwable th2) {
            throw new KeyRetrievalException(str, th2);
        }
    }

    public final javax.crypto.SecretKey OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        return new javax.crypto.spec.SecretKeySpec(bytes, BouncyCastleKeyManagementRepository.AES);
    }

    public final RandomSecretKey EZpvd() {
        java.lang.String strCopydefault = xXX.EZpvd.copydefault();
        while (strCopydefault.length() < 32) {
            strCopydefault = strCopydefault + strCopydefault;
        }
        java.lang.String strSubstring = strCopydefault.substring(0, 32);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        xXX xxx = xXX.EZpvd;
        java.lang.String strEZpvd = xxx.EZpvd(strSubstring);
        xXW xxw = xXW.OLrzqt;
        if (!xxw.AEQbTJ(strSubstring, strEZpvd)) {
            return null;
        }
        java.lang.String strEZpvd2 = xxx.EZpvd(strSubstring, strEZpvd);
        if (Intrinsics.EZpvd((java.lang.Object) strSubstring, (java.lang.Object) xxw.KWHzl(strEZpvd2, strEZpvd))) {
            return new RandomSecretKey(strSubstring, strEZpvd, strEZpvd2);
        }
        return null;
    }
}
