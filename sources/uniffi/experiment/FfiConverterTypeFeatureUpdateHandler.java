package uniffi.experiment;

import kotlin.jvm.internal.Intrinsics;
import o.C2348AIh;
import o.C2353AIm;
import o.C60184zxu;
import o.InterfaceC2350AIj;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeFeatureUpdateHandler extends BaseFfiConverterType<InterfaceC2350AIj> {
    public static final int $stable = 0;
    public static final FfiConverterTypeFeatureUpdateHandler INSTANCE = new FfiConverterTypeFeatureUpdateHandler();

    private FfiConverterTypeFeatureUpdateHandler() {
        super(C2348AIh.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2350AIj interfaceC2350AIj) {
        Intrinsics.checkNotNullParameter(interfaceC2350AIj, "");
        if (interfaceC2350AIj instanceof C2353AIm) {
            return Long.valueOf(((C2353AIm) interfaceC2350AIj).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2350AIj createFromHandle(long j) {
        return new C2353AIm(C60184zxu.INSTANCE, j);
    }
}
