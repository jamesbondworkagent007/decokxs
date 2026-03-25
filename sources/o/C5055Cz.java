package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Cz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5055Cz implements InterfaceC5060De {
    public int AEQbTJ;
    public final byte[] OLrzqt;

    @Override // o.InterfaceC5060De, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public C5055Cz(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.OLrzqt = bArr;
    }

    @Override // o.InterfaceC5060De
    public long KWHzl(@NotNull CQ cq, long j) {
        Intrinsics.checkNotNullParameter(cq, "");
        int i = this.AEQbTJ;
        byte[] bArr = this.OLrzqt;
        if (i >= bArr.length) {
            return -1L;
        }
        long jMin = java.lang.Math.min(j, ((long) bArr.length) - ((long) i));
        int i2 = (int) jMin;
        cq.OLrzqt(this.OLrzqt, this.AEQbTJ, i2);
        this.AEQbTJ += i2;
        return jMin;
    }
}
