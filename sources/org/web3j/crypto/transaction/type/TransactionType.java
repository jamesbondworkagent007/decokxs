package org.web3j.crypto.transaction.type;

/* JADX INFO: loaded from: classes25.dex */
public enum TransactionType {
    LEGACY(null),
    EIP2930((byte) 1),
    EIP1559((byte) 2);

    Byte type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Byte getRlpType() {
        return this.type;
    }

    TransactionType(Byte b) {
        this.type = b;
    }

    public boolean isLegacy() {
        return equals(LEGACY);
    }

    public boolean isEip1559() {
        return equals(EIP1559);
    }

    public boolean isEip2930() {
        return equals(EIP2930);
    }
}
