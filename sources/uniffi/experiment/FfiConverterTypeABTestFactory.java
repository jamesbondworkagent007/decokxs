package uniffi.experiment;

import kotlin.jvm.internal.Intrinsics;
import o.AHT;
import o.AHX;
import o.C2348AIh;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeABTestFactory extends BaseFfiConverterType<AHX> {
    public static final int $stable = 0;
    public static final FfiConverterTypeABTestFactory INSTANCE = new FfiConverterTypeABTestFactory();

    private FfiConverterTypeABTestFactory() {
        super(C2348AIh.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull AHX ahx) {
        Intrinsics.checkNotNullParameter(ahx, "");
        if (ahx instanceof AHT) {
            return Long.valueOf(((AHT) ahx).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public AHX createFromHandle(long j) {
        return new AHT(C60184zxu.INSTANCE, j);
    }
}
