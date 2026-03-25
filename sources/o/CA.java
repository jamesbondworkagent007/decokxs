package o;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CA extends AbstractC5050Cu {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CA(@NotNull BufferedSource bufferedSource) {
        super(bufferedSource);
        Intrinsics.checkNotNullParameter(bufferedSource, "");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull java.nio.ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "");
        return EZpvd().read(byteBuffer);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return EZpvd().isOpen();
    }
}
