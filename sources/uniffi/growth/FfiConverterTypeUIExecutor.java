package uniffi.growth;

import kotlin.jvm.internal.Intrinsics;
import o.ANQ;
import o.C2566AQr;
import o.C60184zxu;
import o.InterfaceC2568AQt;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeUIExecutor extends BaseFfiConverterType<InterfaceC2568AQt> {
    public static final int $stable = 0;
    public static final FfiConverterTypeUIExecutor INSTANCE = new FfiConverterTypeUIExecutor();

    private FfiConverterTypeUIExecutor() {
        super(ANQ.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2568AQt interfaceC2568AQt) {
        Intrinsics.checkNotNullParameter(interfaceC2568AQt, "");
        if (interfaceC2568AQt instanceof C2566AQr) {
            return Long.valueOf(((C2566AQr) interfaceC2568AQt).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2568AQt createFromHandle(long j) {
        return new C2566AQr(C60184zxu.INSTANCE, j);
    }
}
