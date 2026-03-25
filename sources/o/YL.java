package o;

import java.nio.ByteOrder;
import o.YM;

/* JADX INFO: loaded from: classes2.dex */
public class YL extends YM.Activity {
    public YL(YP yp, YM.StateListAnimator stateListAnimator, long j, int i) throws java.io.IOException {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(8);
        byteBufferAllocate.order(stateListAnimator.KWHzl ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + ((long) (i * 16));
        this.copydefault = yp.KWHzl(byteBufferAllocate, j2);
        this.AEQbTJ = yp.KWHzl(byteBufferAllocate, j2 + 8);
    }
}
