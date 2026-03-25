package org.spongycastle.crypto.params;

import java.security.SecureRandom;
import org.spongycastle.crypto.KeyGenerationParameters;

/* JADX INFO: loaded from: classes25.dex */
public class ElGamalKeyGenerationParameters extends KeyGenerationParameters {
    private ElGamalParameters params;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ElGamalParameters getParameters() {
        return this.params;
    }

    public ElGamalKeyGenerationParameters(SecureRandom secureRandom, ElGamalParameters elGamalParameters) {
        super(secureRandom, getStrength(elGamalParameters));
        this.params = elGamalParameters;
    }

    public static int getStrength(ElGamalParameters elGamalParameters) {
        return elGamalParameters.getL() != 0 ? elGamalParameters.getL() : elGamalParameters.getP().bitLength();
    }
}
