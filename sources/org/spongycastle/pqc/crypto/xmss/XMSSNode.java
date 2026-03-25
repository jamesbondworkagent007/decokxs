package org.spongycastle.pqc.crypto.xmss;

import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class XMSSNode implements Serializable {
    private static final long serialVersionUID = 1;
    private final int height;
    private final byte[] value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getHeight() {
        return this.height;
    }

    public XMSSNode(int i, byte[] bArr) {
        this.height = i;
        this.value = bArr;
    }

    public byte[] getValue() {
        return XMSSUtil.cloneArray(this.value);
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    public XMSSNode clone() {
        return new XMSSNode(getHeight(), getValue());
    }
}
