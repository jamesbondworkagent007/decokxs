package uniffi.network;

import kotlin.jvm.internal.Intrinsics;
import o.AZX;
import o.AZY;
import o.C4298Bav;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNativeWsConnection extends BaseFfiConverterType<AZX> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativeWsConnection INSTANCE = new FfiConverterTypeNativeWsConnection();

    private FfiConverterTypeNativeWsConnection() {
        super(C4298Bav.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull AZX azx) {
        Intrinsics.checkNotNullParameter(azx, "");
        if (azx instanceof AZY) {
            return Long.valueOf(((AZY) azx).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public AZX createFromHandle(long j) {
        return new AZY(C60184zxu.INSTANCE, j);
    }
}
