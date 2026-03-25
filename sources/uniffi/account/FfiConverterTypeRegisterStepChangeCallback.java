package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C3062Aep;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC3054Aeh;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRegisterStepChangeCallback extends BaseFfiConverterType<InterfaceC3054Aeh> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterStepChangeCallback INSTANCE = new FfiConverterTypeRegisterStepChangeCallback();

    private FfiConverterTypeRegisterStepChangeCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3054Aeh interfaceC3054Aeh) {
        Intrinsics.checkNotNullParameter(interfaceC3054Aeh, "");
        if (interfaceC3054Aeh instanceof C3062Aep) {
            return Long.valueOf(((C3062Aep) interfaceC3054Aeh).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3054Aeh createFromHandle(long j) {
        return new C3062Aep(C60184zxu.INSTANCE, j);
    }
}
