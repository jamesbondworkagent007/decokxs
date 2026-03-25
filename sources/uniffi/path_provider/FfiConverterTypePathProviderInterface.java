package uniffi.path_provider;

import kotlin.jvm.internal.Intrinsics;
import o.BgC;
import o.BgF;
import o.BgU;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypePathProviderInterface extends BaseFfiConverterType<BgF> {
    public static final int $stable = 0;
    public static final FfiConverterTypePathProviderInterface INSTANCE = new FfiConverterTypePathProviderInterface();

    private FfiConverterTypePathProviderInterface() {
        super(BgU.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull BgF bgF) {
        Intrinsics.checkNotNullParameter(bgF, "");
        if (bgF instanceof BgC) {
            return Long.valueOf(((BgC) bgF).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public BgF createFromHandle(long j) {
        return new BgC(C60184zxu.INSTANCE, j);
    }
}
