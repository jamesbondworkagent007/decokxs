package o;

import java.nio.ByteOrder;
import o.YM;

/* JADX INFO: loaded from: classes2.dex */
public class YR extends YM.TaskDescription {
    public YR(YP yp, YM.StateListAnimator stateListAnimator, long j) throws java.io.IOException {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(8);
        byteBufferAllocate.order(stateListAnimator.KWHzl ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = stateListAnimator.copydefault + (j * ((long) stateListAnimator.EZpvd));
        this.KWHzl = yp.copydefault(byteBufferAllocate, j2);
        this.EZpvd = yp.KWHzl(byteBufferAllocate, 8 + j2);
        this.OLrzqt = yp.KWHzl(byteBufferAllocate, 16 + j2);
        this.copydefault = yp.KWHzl(byteBufferAllocate, j2 + 40);
    }
}
