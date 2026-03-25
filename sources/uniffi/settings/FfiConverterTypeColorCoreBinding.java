package uniffi.settings;

import kotlin.jvm.internal.Intrinsics;
import o.BlN;
import o.BlQ;
import o.BoN;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeColorCoreBinding extends BaseFfiConverterType<BlN> {
    public static final int $stable = 0;
    public static final FfiConverterTypeColorCoreBinding INSTANCE = new FfiConverterTypeColorCoreBinding();

    private FfiConverterTypeColorCoreBinding() {
        super(BoN.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull BlN blN) {
        Intrinsics.checkNotNullParameter(blN, "");
        if (blN instanceof BlQ) {
            return Long.valueOf(((BlQ) blN).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public BlN createFromHandle(long j) {
        return new BlQ(C60184zxu.INSTANCE, j);
    }
}
