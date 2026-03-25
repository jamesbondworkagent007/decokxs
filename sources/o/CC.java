package o;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CC extends AbstractC5049Ct {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CC(@NotNull BufferedSink bufferedSink) {
        super(bufferedSink);
        Intrinsics.checkNotNullParameter(bufferedSink, "");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull java.nio.ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return KWHzl().write(byteBuffer);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return KWHzl().isOpen();
    }
}
