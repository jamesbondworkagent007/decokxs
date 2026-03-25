package o;

import java.nio.ByteOrder;
import o.YM;

/* JADX INFO: loaded from: classes2.dex */
public class YK extends YM.StateListAnimator {
    public final YP valueOf;

    public YK(boolean z, YP yp) throws java.io.IOException {
        this.KWHzl = z;
        this.valueOf = yp;
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(4);
        byteBufferAllocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.gEmmrt = yp.OLrzqt(byteBufferAllocate, 16L);
        this.copydefault = yp.copydefault(byteBufferAllocate, 28L);
        this.AhwBna = yp.copydefault(byteBufferAllocate, 32L);
        this.EZpvd = yp.OLrzqt(byteBufferAllocate, 42L);
        this.AEQbTJ = yp.OLrzqt(byteBufferAllocate, 44L);
        this.OLrzqt = yp.OLrzqt(byteBufferAllocate, 46L);
        this.djBIcL = yp.OLrzqt(byteBufferAllocate, 48L);
        this.AYXKKw = yp.OLrzqt(byteBufferAllocate, 50L);
    }

    @Override // o.YM.StateListAnimator
    public YM.Application AEQbTJ(int i) throws java.io.IOException {
        return new YQ(this.valueOf, this, i);
    }

    @Override // o.YM.StateListAnimator
    public YM.TaskDescription AEQbTJ(long j) throws java.io.IOException {
        return new YT(this.valueOf, this, j);
    }

    @Override // o.YM.StateListAnimator
    public YM.Activity copydefault(long j, int i) throws java.io.IOException {
        return new YO(this.valueOf, this, j, i);
    }
}
