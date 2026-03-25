package com.reown.android.internal.common.jwt.clientid;

import com.reown.android.internal.common.exception.CannotFindKeyPairException;
import com.reown.android.internal.common.storage.key_chain.KeyStore;
import com.reown.foundation.common.model.PrivateKey;
import com.reown.foundation.common.model.PublicKey;
import com.reown.foundation.crypto.data.repository.BaseClientIdJwtRepository;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ClientIdJwtRepositoryAndroid extends BaseClientIdJwtRepository {
    public final KeyStore keyChain;

    public ClientIdJwtRepositoryAndroid(@NotNull KeyStore keyStore) {
        Intrinsics.checkNotNullParameter(keyStore, "");
        this.keyChain = keyStore;
    }

    @Override // com.reown.foundation.crypto.data.repository.BaseClientIdJwtRepository
    /* JADX INFO: renamed from: setKeyPair-FCmjpgM, reason: not valid java name */
    public void mo7198setKeyPairFCmjpgM(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.keyChain.setKeys(BaseClientIdJwtRepository.CLIENT_ID_KEYPAIR_TAG, PrivateKey.m7308boximpl(str2), PublicKey.m7316boximpl(str3));
    }

    @Override // com.reown.foundation.crypto.data.repository.BaseClientIdJwtRepository
    public Pair<String, String> getKeyPair() throws CannotFindKeyPairException {
        if (doesKeyPairExist()) {
            Pair<String, String> keys = this.keyChain.getKeys(BaseClientIdJwtRepository.CLIENT_ID_KEYPAIR_TAG);
            if (keys == null) {
                throw new CannotFindKeyPairException("No key pair for given tag: key_did_keypair");
            }
            return C56390yDp.OLrzqt(keys.component2(), keys.component1());
        }
        return generateAndStoreClientIdKeyPair();
    }

    public final boolean doesKeyPairExist() {
        return this.keyChain.checkKeys(BaseClientIdJwtRepository.CLIENT_ID_KEYPAIR_TAG);
    }
}
