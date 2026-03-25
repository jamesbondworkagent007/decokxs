package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58572zHi;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58571zHh;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMfaServiceTrait extends BaseFfiConverterType<InterfaceC58571zHh> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaServiceTrait INSTANCE = new FfiConverterTypeMfaServiceTrait();

    private FfiConverterTypeMfaServiceTrait() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58571zHh interfaceC58571zHh) {
        Intrinsics.checkNotNullParameter(interfaceC58571zHh, "");
        if (interfaceC58571zHh instanceof C58572zHi) {
            return Long.valueOf(((C58572zHi) interfaceC58571zHh).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58571zHh createFromHandle(long j) {
        return new C58572zHi(C60184zxu.INSTANCE, j);
    }
}
