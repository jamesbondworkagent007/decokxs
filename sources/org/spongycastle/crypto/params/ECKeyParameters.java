package org.spongycastle.crypto.params;

/* JADX INFO: loaded from: classes25.dex */
public class ECKeyParameters extends AsymmetricKeyParameter {
    ECDomainParameters params;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ECDomainParameters getParameters() {
        return this.params;
    }

    public ECKeyParameters(boolean z, ECDomainParameters eCDomainParameters) {
        super(z);
        this.params = eCDomainParameters;
    }
}
