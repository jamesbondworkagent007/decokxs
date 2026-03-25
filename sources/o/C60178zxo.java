package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.InternalException;
import uniffi.RustBuffer;

/* JADX INFO: renamed from: o.zxo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C60178zxo implements InterfaceC60181zxr<InternalException> {
    public static final int $stable = 8;
    public final RustBuffer EZpvd;

    public C60178zxo(@NotNull RustBuffer rustBuffer) {
        Intrinsics.checkNotNullParameter(rustBuffer, "");
        this.EZpvd = rustBuffer;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Luniffi/RustBuffer$ByValue;)Ljava/lang/Object; */
    @Override // o.InterfaceC60181zxr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InternalException copydefault(@NotNull RustBuffer.ByValue byValue) {
        Intrinsics.checkNotNullParameter(byValue, "");
        this.EZpvd.free(byValue);
        return new InternalException("Unexpected CALL_ERROR");
    }
}
