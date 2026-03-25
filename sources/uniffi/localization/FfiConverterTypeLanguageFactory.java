package uniffi.localization;

import kotlin.jvm.internal.Intrinsics;
import o.C2761AYf;
import o.C2775AYt;
import o.C60184zxu;
import o.InterfaceC2760AYe;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeLanguageFactory extends BaseFfiConverterType<InterfaceC2760AYe> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLanguageFactory INSTANCE = new FfiConverterTypeLanguageFactory();

    private FfiConverterTypeLanguageFactory() {
        super(C2775AYt.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2760AYe interfaceC2760AYe) {
        Intrinsics.checkNotNullParameter(interfaceC2760AYe, "");
        if (interfaceC2760AYe instanceof C2761AYf) {
            return Long.valueOf(((C2761AYf) interfaceC2760AYe).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2760AYe createFromHandle(long j) {
        return new C2761AYf(C60184zxu.INSTANCE, j);
    }
}
