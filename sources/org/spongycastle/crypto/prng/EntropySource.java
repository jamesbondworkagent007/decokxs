package org.spongycastle.crypto.prng;

/* JADX INFO: loaded from: classes25.dex */
public interface EntropySource {
    int entropySize();

    byte[] getEntropy();

    boolean isPredictionResistant();
}
