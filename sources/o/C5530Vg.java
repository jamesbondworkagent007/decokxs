package o;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: o.Vg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5530Vg extends AbstractC5535Vl {
    public java.nio.ByteBuffer djSkpj;

    public C5530Vg(C5517Ut c5517Ut, int i, C5532Vi c5532Vi) {
        super(c5517Ut, i, c5532Vi);
        this.djSkpj = java.nio.ByteBuffer.wrap(AbstractC5514Ur.QUSxYX);
    }

    @Override // o.AbstractC5535Vl
    public byte ffGIBT() {
        java.nio.ByteBuffer byteBuffer = this.djSkpj;
        int i = this.fetchVPNInfo;
        this.fetchVPNInfo = i + 1;
        return byteBuffer.get(i);
    }

    @Override // o.AbstractC5535Vl
    public int DCUTEI() {
        java.nio.ByteBuffer byteBuffer = this.djSkpj;
        int i = this.fetchVPNInfo;
        this.fetchVPNInfo = i + 1;
        return byteBuffer.get(i) & UnsignedBytes.MAX_VALUE;
    }

    @Override // o.AbstractC5535Vl
    public byte AhwBna(int i) {
        return this.djSkpj.get(i);
    }
}
