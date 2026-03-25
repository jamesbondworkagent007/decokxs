package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes25.dex */
public class SupplementalDataEntry {
    protected byte[] data;
    protected int dataType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public byte[] getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getDataType() {
        return this.dataType;
    }

    public SupplementalDataEntry(int i, byte[] bArr) {
        this.dataType = i;
        this.data = bArr;
    }
}
