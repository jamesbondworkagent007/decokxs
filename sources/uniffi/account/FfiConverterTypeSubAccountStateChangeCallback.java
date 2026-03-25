package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C3079AfF;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC3074AfA;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeSubAccountStateChangeCallback extends BaseFfiConverterType<InterfaceC3074AfA> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSubAccountStateChangeCallback INSTANCE = new FfiConverterTypeSubAccountStateChangeCallback();

    private FfiConverterTypeSubAccountStateChangeCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3074AfA interfaceC3074AfA) {
        Intrinsics.checkNotNullParameter(interfaceC3074AfA, "");
        if (interfaceC3074AfA instanceof C3079AfF) {
            return Long.valueOf(((C3079AfF) interfaceC3074AfA).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3074AfA createFromHandle(long j) {
        return new C3079AfF(C60184zxu.INSTANCE, j);
    }
}
