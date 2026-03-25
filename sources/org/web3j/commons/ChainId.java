package org.web3j.commons;

/* JADX INFO: loaded from: classes25.dex */
public enum ChainId {
    MAIN_NET(1);

    private int id;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getId() {
        return this.id;
    }

    ChainId(int i) {
        this.id = i;
    }
}
