package org.spongycastle.i18n.filter;

/* JADX INFO: loaded from: classes25.dex */
public class TrustedInput {
    protected Object input;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Object getInput() {
        return this.input;
    }

    public TrustedInput(Object obj) {
        this.input = obj;
    }

    public String toString() {
        return this.input.toString();
    }
}
