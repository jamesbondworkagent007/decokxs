package o;

import aws.smithy.kotlin.runtime.auth.awssigning.AwsChunkedSource$read$isChunkValid$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C55126xe implements InterfaceC5060De {
    public final InterfaceC5060De AEQbTJ;
    public final C56080xw EZpvd;

    public C55126xe(@NotNull InterfaceC5060De interfaceC5060De, @NotNull InterfaceC55285xh interfaceC55285xh, @NotNull C55338xi c55338xi, @NotNull byte[] bArr, @NotNull InterfaceC58536zG interfaceC58536zG) {
        Intrinsics.checkNotNullParameter(interfaceC5060De, "");
        Intrinsics.checkNotNullParameter(interfaceC55285xh, "");
        Intrinsics.checkNotNullParameter(c55338xi, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(interfaceC58536zG, "");
        this.AEQbTJ = interfaceC5060De;
        this.EZpvd = new C56080xw(C55179xf.AEQbTJ(interfaceC5060De), interfaceC55285xh, c55338xi, bArr, interfaceC58536zG);
    }

    @Override // o.InterfaceC5060De
    public long KWHzl(@NotNull CQ cq, long j) {
        Intrinsics.checkNotNullParameter(cq, "");
        if (j >= 0) {
            if (((java.lang.Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new AwsChunkedSource$read$isChunkValid$1(this, null), 1, null)).booleanValue()) {
                return this.EZpvd.KWHzl().KWHzl(cq, j);
            }
            return -1L;
        }
        throw new java.lang.IllegalArgumentException(("Invalid limit (" + j + ") must be >= 0L").toString());
    }

    @Override // o.InterfaceC5060De, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.AEQbTJ.close();
    }
}
