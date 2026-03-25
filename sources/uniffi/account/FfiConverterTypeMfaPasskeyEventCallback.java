package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58544zGh;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58545zGi;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMfaPasskeyEventCallback extends BaseFfiConverterType<InterfaceC58545zGi> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaPasskeyEventCallback INSTANCE = new FfiConverterTypeMfaPasskeyEventCallback();

    private FfiConverterTypeMfaPasskeyEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58545zGi interfaceC58545zGi) {
        Intrinsics.checkNotNullParameter(interfaceC58545zGi, "");
        if (interfaceC58545zGi instanceof C58544zGh) {
            return Long.valueOf(((C58544zGh) interfaceC58545zGi).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58545zGi createFromHandle(long j) {
        return new C58544zGh(C60184zxu.INSTANCE, j);
    }
}
