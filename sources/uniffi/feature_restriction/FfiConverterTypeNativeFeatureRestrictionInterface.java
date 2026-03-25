package uniffi.feature_restriction;

import kotlin.jvm.internal.Intrinsics;
import o.ALB;
import o.ALH;
import o.ALJ;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeNativeFeatureRestrictionInterface extends BaseFfiConverterType<ALH> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNativeFeatureRestrictionInterface INSTANCE = new FfiConverterTypeNativeFeatureRestrictionInterface();

    private FfiConverterTypeNativeFeatureRestrictionInterface() {
        super(ALB.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull ALH alh) {
        Intrinsics.checkNotNullParameter(alh, "");
        if (alh instanceof ALJ) {
            return Long.valueOf(((ALJ) alh).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public ALH createFromHandle(long j) {
        return new ALJ(C60184zxu.INSTANCE, j);
    }
}
