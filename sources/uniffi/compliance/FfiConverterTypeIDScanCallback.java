package uniffi.compliance;

import kotlin.jvm.internal.Intrinsics;
import o.C3981AwI;
import o.C4052Axa;
import o.C60184zxu;
import o.InterfaceC4055Axd;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeIDScanCallback extends BaseFfiConverterType<InterfaceC4055Axd> {
    public static final int $stable = 0;
    public static final FfiConverterTypeIDScanCallback INSTANCE = new FfiConverterTypeIDScanCallback();

    private FfiConverterTypeIDScanCallback() {
        super(C3981AwI.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4055Axd interfaceC4055Axd) {
        Intrinsics.checkNotNullParameter(interfaceC4055Axd, "");
        if (interfaceC4055Axd instanceof C4052Axa) {
            return Long.valueOf(((C4052Axa) interfaceC4055Axd).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4055Axd createFromHandle(long j) {
        return new C4052Axa(C60184zxu.INSTANCE, j);
    }
}
