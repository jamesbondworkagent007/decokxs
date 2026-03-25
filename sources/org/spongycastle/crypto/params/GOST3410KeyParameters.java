package org.spongycastle.crypto.params;

/* JADX INFO: loaded from: classes25.dex */
public class GOST3410KeyParameters extends AsymmetricKeyParameter {
    private GOST3410Parameters params;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GOST3410Parameters getParameters() {
        return this.params;
    }

    public GOST3410KeyParameters(boolean z, GOST3410Parameters gOST3410Parameters) {
        super(z);
        this.params = gOST3410Parameters;
    }
}
