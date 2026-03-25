package org.spongycastle.crypto.params;

/* JADX INFO: loaded from: classes25.dex */
public class DSAKeyParameters extends AsymmetricKeyParameter {
    private DSAParameters params;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DSAParameters getParameters() {
        return this.params;
    }

    public DSAKeyParameters(boolean z, DSAParameters dSAParameters) {
        super(z);
        this.params = dSAParameters;
    }
}
