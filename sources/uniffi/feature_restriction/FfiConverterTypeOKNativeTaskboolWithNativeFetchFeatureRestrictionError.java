package uniffi.feature_restriction;

import kotlin.jvm.internal.Intrinsics;
import o.ALB;
import o.C2460AMp;
import o.C60184zxu;
import o.InterfaceC2462AMr;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKNativeTaskboolWithNativeFetchFeatureRestrictionError extends BaseFfiConverterType<InterfaceC2462AMr> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKNativeTaskboolWithNativeFetchFeatureRestrictionError INSTANCE = new FfiConverterTypeOKNativeTaskboolWithNativeFetchFeatureRestrictionError();

    private FfiConverterTypeOKNativeTaskboolWithNativeFetchFeatureRestrictionError() {
        super(ALB.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2462AMr interfaceC2462AMr) {
        Intrinsics.checkNotNullParameter(interfaceC2462AMr, "");
        if (interfaceC2462AMr instanceof C2460AMp) {
            return Long.valueOf(((C2460AMp) interfaceC2462AMr).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2462AMr createFromHandle(long j) {
        return new C2460AMp(C60184zxu.INSTANCE, j);
    }
}
