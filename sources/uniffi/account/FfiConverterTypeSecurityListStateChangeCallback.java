package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C3045AeY;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC3041AeU;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeSecurityListStateChangeCallback extends BaseFfiConverterType<InterfaceC3041AeU> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSecurityListStateChangeCallback INSTANCE = new FfiConverterTypeSecurityListStateChangeCallback();

    private FfiConverterTypeSecurityListStateChangeCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3041AeU interfaceC3041AeU) {
        Intrinsics.checkNotNullParameter(interfaceC3041AeU, "");
        if (interfaceC3041AeU instanceof C3045AeY) {
            return Long.valueOf(((C3045AeY) interfaceC3041AeU).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3041AeU createFromHandle(long j) {
        return new C3045AeY(C60184zxu.INSTANCE, j);
    }
}
