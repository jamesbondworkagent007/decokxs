package org.spongycastle.crypto;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes25.dex */
public class KeyGenerationParameters {
    private SecureRandom random;
    private int strength;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SecureRandom getRandom() {
        return this.random;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getStrength() {
        return this.strength;
    }

    public KeyGenerationParameters(SecureRandom secureRandom, int i) {
        this.random = secureRandom;
        this.strength = i;
    }
}
