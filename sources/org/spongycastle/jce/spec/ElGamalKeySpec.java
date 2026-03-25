package org.spongycastle.jce.spec;

import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes25.dex */
public class ElGamalKeySpec implements KeySpec {
    private ElGamalParameterSpec spec;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ElGamalParameterSpec getParams() {
        return this.spec;
    }

    public ElGamalKeySpec(ElGamalParameterSpec elGamalParameterSpec) {
        this.spec = elGamalParameterSpec;
    }
}
