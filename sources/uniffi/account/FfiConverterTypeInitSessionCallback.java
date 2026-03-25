package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58405zBd;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58402zBa;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeInitSessionCallback extends BaseFfiConverterType<InterfaceC58402zBa> {
    public static final int $stable = 0;
    public static final FfiConverterTypeInitSessionCallback INSTANCE = new FfiConverterTypeInitSessionCallback();

    private FfiConverterTypeInitSessionCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58402zBa interfaceC58402zBa) {
        Intrinsics.checkNotNullParameter(interfaceC58402zBa, "");
        if (interfaceC58402zBa instanceof C58405zBd) {
            return Long.valueOf(((C58405zBd) interfaceC58402zBa).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58402zBa createFromHandle(long j) {
        return new C58405zBd(C60184zxu.INSTANCE, j);
    }
}
