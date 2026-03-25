package o;

import java.nio.ByteOrder;
import o.YM;

/* JADX INFO: loaded from: classes2.dex */
public class YT extends YM.TaskDescription {
    public YT(YP yp, YM.StateListAnimator stateListAnimator, long j) throws java.io.IOException {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(4);
        byteBufferAllocate.order(stateListAnimator.KWHzl ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = stateListAnimator.copydefault + (j * ((long) stateListAnimator.EZpvd));
        this.KWHzl = yp.copydefault(byteBufferAllocate, j2);
        this.EZpvd = yp.copydefault(byteBufferAllocate, 4 + j2);
        this.OLrzqt = yp.copydefault(byteBufferAllocate, 8 + j2);
        this.copydefault = yp.copydefault(byteBufferAllocate, j2 + 20);
    }
}
