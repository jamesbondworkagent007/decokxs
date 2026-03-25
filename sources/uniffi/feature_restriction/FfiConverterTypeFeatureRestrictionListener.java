package uniffi.feature_restriction;

import kotlin.jvm.internal.Intrinsics;
import o.ALB;
import o.C2443ALy;
import o.C60184zxu;
import o.InterfaceC2438ALt;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeFeatureRestrictionListener extends BaseFfiConverterType<InterfaceC2438ALt> {
    public static final int $stable = 0;
    public static final FfiConverterTypeFeatureRestrictionListener INSTANCE = new FfiConverterTypeFeatureRestrictionListener();

    private FfiConverterTypeFeatureRestrictionListener() {
        super(ALB.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2438ALt interfaceC2438ALt) {
        Intrinsics.checkNotNullParameter(interfaceC2438ALt, "");
        if (interfaceC2438ALt instanceof C2443ALy) {
            return Long.valueOf(((C2443ALy) interfaceC2438ALt).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2438ALt createFromHandle(long j) {
        return new C2443ALy(C60184zxu.INSTANCE, j);
    }
}
