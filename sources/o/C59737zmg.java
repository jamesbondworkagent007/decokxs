package o;

import com.amplifyframework.core.model.ModelIdentifier;

/* JADX INFO: renamed from: o.zmg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59737zmg {
    public final java.lang.String AEQbTJ;
    public final InterfaceC59499ziG copydefault;

    public C59737zmg(InterfaceC59499ziG interfaceC59499ziG, java.lang.String str) {
        this.copydefault = interfaceC59499ziG;
        this.AEQbTJ = str;
    }

    public C59737zmg(InterfaceC59499ziG interfaceC59499ziG) {
        this(interfaceC59499ziG, "");
    }

    public final void copydefault(java.lang.String str, java.io.InputStream inputStream) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            int i = inputStream.read();
            if (i == -1) {
                break;
            }
            if (i == 13) {
                sb.append("[\\r]");
            } else if (i == 10) {
                sb.append("[\\n]\"");
                sb.insert(0, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
                sb.insert(0, str);
                this.copydefault.debug(this.AEQbTJ + " " + sb.toString());
                sb.setLength(0);
            } else if (i < 32 || i > 127) {
                sb.append("[0x");
                sb.append(java.lang.Integer.toHexString(i));
                sb.append("]");
            } else {
                sb.append((char) i);
            }
        }
        if (sb.length() > 0) {
            sb.append('\"');
            sb.insert(0, '\"');
            sb.insert(0, str);
            this.copydefault.debug(this.AEQbTJ + " " + sb.toString());
        }
    }

    public boolean AEQbTJ() {
        return this.copydefault.isDebugEnabled();
    }

    public void EZpvd(byte[] bArr, int i, int i2) throws java.io.IOException {
        C59851zoo.AEQbTJ(bArr, "Output");
        copydefault(">> ", new java.io.ByteArrayInputStream(bArr, i, i2));
    }

    public void KWHzl(byte[] bArr, int i, int i2) throws java.io.IOException {
        C59851zoo.AEQbTJ(bArr, "Input");
        copydefault("<< ", new java.io.ByteArrayInputStream(bArr, i, i2));
    }

    public void AEQbTJ(byte[] bArr) throws java.io.IOException {
        C59851zoo.AEQbTJ(bArr, "Output");
        copydefault(">> ", new java.io.ByteArrayInputStream(bArr));
    }

    public void copydefault(byte[] bArr) throws java.io.IOException {
        C59851zoo.AEQbTJ(bArr, "Input");
        copydefault("<< ", new java.io.ByteArrayInputStream(bArr));
    }

    public void EZpvd(int i) throws java.io.IOException {
        AEQbTJ(new byte[]{(byte) i});
    }

    public void OLrzqt(int i) throws java.io.IOException {
        copydefault(new byte[]{(byte) i});
    }
}
