package uniffi.buy_sell;

import kotlin.jvm.internal.Intrinsics;
import o.C3722ArM;
import o.C3793Ase;
import o.C60184zxu;
import o.InterfaceC3796Ash;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeInputValidationLocalization extends BaseFfiConverterType<InterfaceC3796Ash> {
    public static final int $stable = 0;
    public static final FfiConverterTypeInputValidationLocalization INSTANCE = new FfiConverterTypeInputValidationLocalization();

    private FfiConverterTypeInputValidationLocalization() {
        super(C3722ArM.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3796Ash interfaceC3796Ash) {
        Intrinsics.checkNotNullParameter(interfaceC3796Ash, "");
        if (interfaceC3796Ash instanceof C3793Ase) {
            return Long.valueOf(((C3793Ase) interfaceC3796Ash).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3796Ash createFromHandle(long j) {
        return new C3793Ase(C60184zxu.INSTANCE, j);
    }
}
