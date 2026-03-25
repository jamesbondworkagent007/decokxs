package com.fasterxml.jackson.databind.node;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import o.C5537Vn;
import o.XM;

/* JADX INFO: loaded from: classes21.dex */
class NodeSerialization implements Serializable, Externalizable {
    protected static final int LONGEST_EAGER_ALLOC = 100000;
    private static final long serialVersionUID = 1;
    public byte[] json;

    public NodeSerialization() {
    }

    public NodeSerialization(byte[] bArr) {
        this.json = bArr;
    }

    public Object readResolve() {
        try {
            return XM.copydefault(this.json);
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to JDK deserialize `JsonNode` value: " + e.getMessage(), e);
        }
    }

    public static NodeSerialization from(Object obj) {
        try {
            return new NodeSerialization(XM.EZpvd(obj));
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to JDK serialize `" + obj.getClass().getSimpleName() + "` value: " + e.getMessage(), e);
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(this.json.length);
        objectOutput.write(this.json);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        this.json = _read(objectInput, objectInput.readInt());
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private byte[] _read(ObjectInput objectInput, int i) throws IOException {
        if (i <= 100000) {
            byte[] bArr = new byte[i];
            objectInput.readFully(bArr, 0, i);
            return bArr;
        }
        C5537Vn c5537Vn = new C5537Vn(100000);
        try {
            byte[] bArrValueOf = c5537Vn.valueOf();
            while (true) {
                int i2 = 0;
                do {
                    int iMin = Math.min(bArrValueOf.length - i2, i);
                    objectInput.readFully(bArrValueOf, 0, iMin);
                    i -= iMin;
                    i2 += iMin;
                    if (i == 0) {
                        byte[] bArrAEQbTJ = c5537Vn.AEQbTJ(i2);
                        c5537Vn.close();
                        return bArrAEQbTJ;
                    }
                } while (i2 != bArrValueOf.length);
                bArrValueOf = c5537Vn.KWHzl();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    c5537Vn.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
