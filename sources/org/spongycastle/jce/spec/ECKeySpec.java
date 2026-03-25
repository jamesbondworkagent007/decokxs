package org.spongycastle.jce.spec;

import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes25.dex */
public class ECKeySpec implements KeySpec {
    private ECParameterSpec spec;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ECParameterSpec getParams() {
        return this.spec;
    }

    public ECKeySpec(ECParameterSpec eCParameterSpec) {
        this.spec = eCParameterSpec;
    }
}
