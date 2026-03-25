package com.reown.android.internal.common.crypto.kmr;

import com.reown.android.internal.common.crypto.UtilsKt;
import com.reown.android.internal.common.model.MissingKeyException;
import com.reown.android.internal.common.model.SymmetricKey;
import com.reown.android.internal.common.storage.key_chain.KeyStore;
import com.reown.foundation.common.model.Key;
import com.reown.foundation.common.model.PrivateKey;
import com.reown.foundation.common.model.PublicKey;
import com.reown.foundation.common.model.Topic;
import com.reown.util.UtilFunctionsKt;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;
import javax.crypto.KeyGenerator;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.generators.HKDFBytesGenerator;
import org.bouncycastle.crypto.params.Ed25519PrivateKeyParameters;
import org.bouncycastle.crypto.params.HKDFParameters;
import org.bouncycastle.math.ec.rfc7748.X25519;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class BouncyCastleKeyManagementRepository implements KeyManagementRepository {

    @Deprecated
    public static final String AES = "AES";
    public static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_AGREEMENT_CONTEXT = "key_agreement/";

    @Deprecated
    public static final int KEY_SIZE = 32;

    @Deprecated
    public static final int SYM_KEY_SIZE = 256;
    public final KeyStore keyChain;

    public BouncyCastleKeyManagementRepository(@NotNull KeyStore keyStore) {
        Intrinsics.checkNotNullParameter(keyStore, "");
        this.keyChain = keyStore;
    }

    @Override // com.reown.android.internal.common.crypto.kmr.KeyManagementRepository
    public void setKey(@NotNull Key key, @NotNull String str) {
        Intrinsics.checkNotNullParameter(key, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.keyChain.setKey(str, key);
    }

    @Override // com.reown.android.internal.common.crypto.kmr.KeyManagementRepository
    /* JADX INFO: renamed from: getPublicKey-p9DwDrs, reason: not valid java name */
    public String mo7185getPublicKeyp9DwDrs(@NotNull String str) throws MissingKeyException {
        Intrinsics.checkNotNullParameter(str, "");
        String key = this.keyChain.getKey(str);
        if (key == null) {
            throw new MissingKeyException("No PublicKey for tag: " + str);
        }
        return PublicKey.m7317constructorimpl(key);
    }

    @Override // com.reown.android.internal.common.crypto.kmr.KeyManagementRepository
    /* JADX INFO: renamed from: getSymmetricKey-p84wnz8, reason: not valid java name */
    public String mo7187getSymmetricKeyp84wnz8(@NotNull String str) throws MissingKeyException {
        Intrinsics.checkNotNullParameter(str, "");
        String key = this.keyChain.getKey(str);
        if (key == null) {
            throw new MissingKeyException("No SymmetricKey for tag: " + str);
        }
        return SymmetricKey.m7239constructorimpl(key);
    }

    @Override // com.reown.android.internal.common.crypto.kmr.KeyManagementRepository
    /* JADX INFO: renamed from: getSelfPublicFromKeyAgreement-p9DwDrs, reason: not valid java name */
    public String mo7186getSelfPublicFromKeyAgreementp9DwDrs(@NotNull Topic topic) throws MissingKeyException {
        Intrinsics.checkNotNullParameter(topic, "");
        String str = KEY_AGREEMENT_CONTEXT + topic.getValue();
        Pair<String, String> keys = this.keyChain.getKeys(str);
        if (keys == null) {
            throw new MissingKeyException("No key pair for tag: " + str);
        }
        return PublicKey.m7317constructorimpl(keys.component1());
    }

    @Override // com.reown.android.internal.common.crypto.kmr.KeyManagementRepository
    /* JADX INFO: renamed from: setKeyAgreement-tzQMq24, reason: not valid java name */
    public void mo7188setKeyAgreementtzQMq24(@NotNull Topic topic, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(topic, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.keyChain.setKeys(KEY_AGREEMENT_CONTEXT + topic.getValue(), PublicKey.m7316boximpl(str), PublicKey.m7316boximpl(str2));
    }

    @Override // com.reown.android.internal.common.crypto.kmr.KeyManagementRepository
    /* JADX INFO: renamed from: generateAndStoreEd25519KeyPair-uN_RPug, reason: not valid java name */
    public String mo7179generateAndStoreEd25519KeyPairuN_RPug() {
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[32];
        Ed25519.generatePrivateKey(new SecureRandom(), bArr2);
        Ed25519.generatePublicKey(bArr2, 0, bArr, 0);
        String strBytesToHex = UtilFunctionsKt.bytesToHex(bArr);
        Locale locale = Locale.ROOT;
        String lowerCase = strBytesToHex.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String strM7317constructorimpl = PublicKey.m7317constructorimpl(lowerCase);
        String lowerCase2 = UtilFunctionsKt.bytesToHex(bArr2).toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        mo7189setKeyPairTSAVemk(strM7317constructorimpl, PrivateKey.m7309constructorimpl(lowerCase2));
        String lowerCase3 = UtilFunctionsKt.bytesToHex(bArr).toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
        return PublicKey.m7317constructorimpl(lowerCase3);
    }

    @Override // com.reown.android.internal.common.crypto.kmr.KeyManagementRepository
    /* JADX INFO: renamed from: deriveAndStoreEd25519KeyPair--tqZPjU, reason: not valid java name */
    public String mo7178deriveAndStoreEd25519KeyPairtqZPjU(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        byte[] encoded = new Ed25519PrivateKeyParameters(UtilFunctionsKt.hexToBytes(str), 0).generatePublicKey().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "");
        String lowerCase = UtilFunctionsKt.bytesToHex(encoded).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String strM7317constructorimpl = PublicKey.m7317constructorimpl(lowerCase);
        mo7189setKeyPairTSAVemk(strM7317constructorimpl, str);
        return strM7317constructorimpl;
    }

    @Override // com.reown.android.internal.common.crypto.kmr.KeyManagementRepository
    /* JADX INFO: renamed from: generateAndStoreX25519KeyPair-uN_RPug, reason: not valid java name */
    public String mo7181generateAndStoreX25519KeyPairuN_RPug() {
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[32];
        X25519.generatePrivateKey(new SecureRandom(), bArr2);
        X25519.generatePublicKey(bArr2, 0, bArr, 0);
        String strBytesToHex = UtilFunctionsKt.bytesToHex(bArr);
        Locale locale = Locale.ROOT;
        String lowerCase = strBytesToHex.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        String strM7317constructorimpl = PublicKey.m7317constructorimpl(lowerCase);
        String lowerCase2 = UtilFunctionsKt.bytesToHex(bArr2).toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        mo7189setKeyPairTSAVemk(strM7317constructorimpl, PrivateKey.m7309constructorimpl(lowerCase2));
        String lowerCase3 = UtilFunctionsKt.bytesToHex(bArr).toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
        return PublicKey.m7317constructorimpl(lowerCase3);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.reown.android.internal.common.model.SymmetricKey.box-impl(java.lang.String):com.reown.android.internal.common.model.SymmetricKey */
    @Override // com.reown.android.internal.common.crypto.kmr.KeyManagementRepository
    /* JADX INFO: renamed from: generateAndStoreSymmetricKey-p84wnz8, reason: not valid java name */
    public String mo7180generateAndStoreSymmetricKeyp84wnz8(@NotNull Topic topic) {
        Intrinsics.checkNotNullParameter(topic, "");
        String strM7239constructorimpl = SymmetricKey.m7239constructorimpl(UtilFunctionsKt.bytesToHex(createSymmetricKey()));
        this.keyChain.setKey(topic.getValue(), SymmetricKey.m7238boximpl(strM7239constructorimpl));
        return strM7239constructorimpl;
    }

    @Override // com.reown.android.internal.common.crypto.kmr.KeyManagementRepository
    /* JADX INFO: renamed from: generateSymmetricKeyFromKeyAgreement-rMsFr_I, reason: not valid java name */
    public String mo7182generateSymmetricKeyFromKeyAgreementrMsFr_I(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bArr = new byte[32];
        X25519.scalarMult(UtilFunctionsKt.hexToBytes(mo7184getKeyPairwSlyqho(str).component2().m7315unboximpl()), 0, UtilFunctionsKt.hexToBytes(str2), 0, bArr, 0);
        return SymmetricKey.m7239constructorimpl(UtilFunctionsKt.bytesToHex(deriveHKDFKey(UtilFunctionsKt.bytesToHex(bArr))));
    }

    @Override // com.reown.android.internal.common.crypto.kmr.KeyManagementRepository
    /* JADX INFO: renamed from: generateTopicFromKeyAgreement-V_lFtQw, reason: not valid java name */
    public Topic mo7183generateTopicFromKeyAgreementV_lFtQw(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String strMo7182generateSymmetricKeyFromKeyAgreementrMsFr_I = mo7182generateSymmetricKeyFromKeyAgreementrMsFr_I(str, str2);
        Topic topic = new Topic(UtilsKt.sha256(SymmetricKey.m7242getKeyAsBytesimpl(strMo7182generateSymmetricKeyFromKeyAgreementrMsFr_I)));
        KeyStore keyStore = this.keyChain;
        String lowerCase = topic.getValue().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        keyStore.setKey(lowerCase, SymmetricKey.m7238boximpl(strMo7182generateSymmetricKeyFromKeyAgreementrMsFr_I));
        mo7188setKeyAgreementtzQMq24(topic, str, str2);
        return topic;
    }

    @Override // com.reown.android.internal.common.crypto.kmr.KeyManagementRepository
    public Topic getTopicFromKey(@NotNull Key key) {
        Intrinsics.checkNotNullParameter(key, "");
        return new Topic(UtilsKt.sha256(key.getKeyAsBytes()));
    }

    @Override // com.reown.android.internal.common.crypto.kmr.KeyManagementRepository
    public void removeKeys(@NotNull String str) throws MissingKeyException {
        Intrinsics.checkNotNullParameter(str, "");
        Pair<String, String> keys = this.keyChain.getKeys(str);
        if (keys == null) {
            throw new MissingKeyException("No key pair for tag: " + str);
        }
        String strComponent1 = keys.component1();
        KeyStore keyStore = this.keyChain;
        String lowerCase = strComponent1.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        keyStore.deleteKeys(lowerCase);
        keyStore.deleteKeys(str);
    }

    @Override // com.reown.android.internal.common.crypto.kmr.KeyManagementRepository
    /* JADX INFO: renamed from: setKeyPair-TSAVemk, reason: not valid java name */
    public void mo7189setKeyPairTSAVemk(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.keyChain.setKeys(str, PublicKey.m7316boximpl(str), PrivateKey.m7308boximpl(str2));
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.reown.foundation.common.model.PrivateKey.box-impl(java.lang.String):com.reown.foundation.common.model.PrivateKey */
    /* JADX DEBUG: Class process forced to load method for inline: com.reown.foundation.common.model.PublicKey.box-impl(java.lang.String):com.reown.foundation.common.model.PublicKey */
    @Override // com.reown.android.internal.common.crypto.kmr.KeyManagementRepository
    /* JADX INFO: renamed from: getKeyPair-wSlyqho, reason: not valid java name */
    public Pair<PublicKey, PrivateKey> mo7184getKeyPairwSlyqho(@NotNull String str) throws MissingKeyException {
        Intrinsics.checkNotNullParameter(str, "");
        Pair<String, String> keys = this.keyChain.getKeys(str);
        if (keys == null) {
            throw new MissingKeyException("No key pair for tag: " + str);
        }
        return new Pair<>(PublicKey.m7316boximpl(PublicKey.m7317constructorimpl(keys.component1())), PrivateKey.m7308boximpl(PrivateKey.m7309constructorimpl(keys.component2())));
    }

    public final byte[] createSymmetricKey() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(AES);
        Intrinsics.checkNotNullExpressionValue(keyGenerator, "");
        keyGenerator.init(256);
        byte[] encoded = keyGenerator.generateKey().getEncoded();
        Intrinsics.checkNotNullExpressionValue(encoded, "");
        return encoded;
    }

    public final byte[] deriveHKDFKey(String str) {
        HKDFBytesGenerator hKDFBytesGenerator = new HKDFBytesGenerator(new SHA256Digest());
        byte[] bArr = new byte[32];
        hKDFBytesGenerator.init(new HKDFParameters(UtilFunctionsKt.hexToBytes(str), new byte[0], new byte[0]));
        hKDFBytesGenerator.generateBytes(bArr, 0, 32);
        return bArr;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.internal.common.crypto.kmr.BouncyCastleKeyManagementRepository.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }
}
