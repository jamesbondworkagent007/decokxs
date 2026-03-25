package org.spongycastle.pqc.crypto.rainbow;

import org.spongycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes25.dex */
public class RainbowKeyParameters extends AsymmetricKeyParameter {
    private int docLength;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getDocLength() {
        return this.docLength;
    }

    public RainbowKeyParameters(boolean z, int i) {
        super(z);
        this.docLength = i;
    }
}
