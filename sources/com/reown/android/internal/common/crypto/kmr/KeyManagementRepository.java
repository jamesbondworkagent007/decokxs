package com.reown.android.internal.common.crypto.kmr;

import com.reown.android.internal.common.model.MissingKeyException;
import com.reown.foundation.common.model.Key;
import com.reown.foundation.common.model.PrivateKey;
import com.reown.foundation.common.model.PublicKey;
import com.reown.foundation.common.model.Topic;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface KeyManagementRepository {
    /* JADX INFO: renamed from: deriveAndStoreEd25519KeyPair--tqZPjU */
    String mo7178deriveAndStoreEd25519KeyPairtqZPjU(@NotNull String str);

    /* JADX INFO: renamed from: generateAndStoreEd25519KeyPair-uN_RPug */
    String mo7179generateAndStoreEd25519KeyPairuN_RPug();

    /* JADX INFO: renamed from: generateAndStoreSymmetricKey-p84wnz8 */
    String mo7180generateAndStoreSymmetricKeyp84wnz8(@NotNull Topic topic);

    /* JADX INFO: renamed from: generateAndStoreX25519KeyPair-uN_RPug */
    String mo7181generateAndStoreX25519KeyPairuN_RPug();

    /* JADX INFO: renamed from: generateSymmetricKeyFromKeyAgreement-rMsFr_I */
    String mo7182generateSymmetricKeyFromKeyAgreementrMsFr_I(@NotNull String str, @NotNull String str2);

    /* JADX INFO: renamed from: generateTopicFromKeyAgreement-V_lFtQw */
    Topic mo7183generateTopicFromKeyAgreementV_lFtQw(@NotNull String str, @NotNull String str2);

    /* JADX INFO: renamed from: getKeyPair-wSlyqho */
    Pair<PublicKey, PrivateKey> mo7184getKeyPairwSlyqho(@NotNull String str);

    /* JADX INFO: renamed from: getPublicKey-p9DwDrs */
    String mo7185getPublicKeyp9DwDrs(@NotNull String str);

    /* JADX INFO: renamed from: getSelfPublicFromKeyAgreement-p9DwDrs */
    String mo7186getSelfPublicFromKeyAgreementp9DwDrs(@NotNull Topic topic);

    /* JADX INFO: renamed from: getSymmetricKey-p84wnz8 */
    String mo7187getSymmetricKeyp84wnz8(@NotNull String str);

    Topic getTopicFromKey(@NotNull Key key);

    void removeKeys(@NotNull String str) throws MissingKeyException;

    void setKey(@NotNull Key key, @NotNull String str);

    /* JADX INFO: renamed from: setKeyAgreement-tzQMq24 */
    void mo7188setKeyAgreementtzQMq24(@NotNull Topic topic, @NotNull String str, @NotNull String str2);

    /* JADX INFO: renamed from: setKeyPair-TSAVemk */
    void mo7189setKeyPairTSAVemk(@NotNull String str, @NotNull String str2);
}
