package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58940zVc;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58939zVb;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOtpStateCallback extends BaseFfiConverterType<InterfaceC58939zVb> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOtpStateCallback INSTANCE = new FfiConverterTypeOtpStateCallback();

    private FfiConverterTypeOtpStateCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58939zVb interfaceC58939zVb) {
        Intrinsics.checkNotNullParameter(interfaceC58939zVb, "");
        if (interfaceC58939zVb instanceof C58940zVc) {
            return Long.valueOf(((C58940zVc) interfaceC58939zVb).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58939zVb createFromHandle(long j) {
        return new C58940zVc(C60184zxu.INSTANCE, j);
    }
}
