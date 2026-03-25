package o;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: o.Ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5528Ve extends AbstractC5535Vl {
    public byte[] aKErDB;

    public C5528Ve(C5517Ut c5517Ut, int i, C5532Vi c5532Vi) {
        super(c5517Ut, i, c5532Vi);
        this.aKErDB = AbstractC5514Ur.QUSxYX;
    }

    @Override // o.AbstractC5535Vl
    public byte ffGIBT() {
        byte[] bArr = this.aKErDB;
        int i = this.fetchVPNInfo;
        this.fetchVPNInfo = i + 1;
        return bArr[i];
    }

    @Override // o.AbstractC5535Vl
    public int DCUTEI() {
        byte[] bArr = this.aKErDB;
        int i = this.fetchVPNInfo;
        this.fetchVPNInfo = i + 1;
        return bArr[i] & UnsignedBytes.MAX_VALUE;
    }

    @Override // o.AbstractC5535Vl
    public byte AhwBna(int i) {
        return this.aKErDB[i];
    }
}
