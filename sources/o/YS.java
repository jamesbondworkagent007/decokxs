package o;

import java.nio.ByteOrder;
import o.YM;

/* JADX INFO: loaded from: classes2.dex */
public class YS extends YM.StateListAnimator {
    public final YP valueOf;

    public YS(boolean z, YP yp) throws java.io.IOException {
        this.KWHzl = z;
        this.valueOf = yp;
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(8);
        byteBufferAllocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.gEmmrt = yp.OLrzqt(byteBufferAllocate, 16L);
        this.copydefault = yp.KWHzl(byteBufferAllocate, 32L);
        this.AhwBna = yp.KWHzl(byteBufferAllocate, 40L);
        this.EZpvd = yp.OLrzqt(byteBufferAllocate, 54L);
        this.AEQbTJ = yp.OLrzqt(byteBufferAllocate, 56L);
        this.OLrzqt = yp.OLrzqt(byteBufferAllocate, 58L);
        this.djBIcL = yp.OLrzqt(byteBufferAllocate, 60L);
        this.AYXKKw = yp.OLrzqt(byteBufferAllocate, 62L);
    }

    @Override // o.YM.StateListAnimator
    public YM.Application AEQbTJ(int i) throws java.io.IOException {
        return new YV(this.valueOf, this, i);
    }

    @Override // o.YM.StateListAnimator
    public YM.TaskDescription AEQbTJ(long j) throws java.io.IOException {
        return new YR(this.valueOf, this, j);
    }

    @Override // o.YM.StateListAnimator
    public YM.Activity copydefault(long j, int i) throws java.io.IOException {
        return new YL(this.valueOf, this, j, i);
    }
}
