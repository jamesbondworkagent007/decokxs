package org.spongycastle.i18n.filter;

/* JADX INFO: loaded from: classes25.dex */
public class UntrustedInput {
    protected Object input;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Object getInput() {
        return this.input;
    }

    public UntrustedInput(Object obj) {
        this.input = obj;
    }

    public String getString() {
        return this.input.toString();
    }

    public String toString() {
        return this.input.toString();
    }
}
