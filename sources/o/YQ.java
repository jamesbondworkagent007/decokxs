package o;

import java.nio.ByteOrder;
import o.YM;

/* JADX INFO: loaded from: classes2.dex */
public class YQ extends YM.Application {
    public YQ(YP yp, YM.StateListAnimator stateListAnimator, int i) throws java.io.IOException {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(4);
        byteBufferAllocate.order(stateListAnimator.KWHzl ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.OLrzqt = yp.copydefault(byteBufferAllocate, stateListAnimator.AhwBna + ((long) (i * stateListAnimator.OLrzqt)) + 28);
    }
}
