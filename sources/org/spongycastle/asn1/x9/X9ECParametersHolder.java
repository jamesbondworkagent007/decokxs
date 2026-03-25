package org.spongycastle.asn1.x9;

/* JADX INFO: loaded from: classes25.dex */
public abstract class X9ECParametersHolder {
    private X9ECParameters params;

    public abstract X9ECParameters createParameters();

    public X9ECParameters getParameters() {
        X9ECParameters x9ECParameters;
        synchronized (this) {
            if (this.params == null) {
                this.params = createParameters();
            }
            x9ECParameters = this.params;
        }
        return x9ECParameters;
    }
}
