package org.spongycastle.crypto.ec;

import org.spongycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes25.dex */
public interface ECPairTransform {
    void init(CipherParameters cipherParameters);

    ECPair transform(ECPair eCPair);
}
