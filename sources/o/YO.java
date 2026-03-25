package o;

import java.nio.ByteOrder;
import o.YM;

/* JADX INFO: loaded from: classes2.dex */
public class YO extends YM.Activity {
    public YO(YP yp, YM.StateListAnimator stateListAnimator, long j, int i) throws java.io.IOException {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(4);
        byteBufferAllocate.order(stateListAnimator.KWHzl ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = j + ((long) (i * 8));
        this.copydefault = yp.copydefault(byteBufferAllocate, j2);
        this.AEQbTJ = yp.copydefault(byteBufferAllocate, j2 + 4);
    }
}
