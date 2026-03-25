package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58933zUv;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58929zUr;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOtpEventCallback extends BaseFfiConverterType<InterfaceC58929zUr> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOtpEventCallback INSTANCE = new FfiConverterTypeOtpEventCallback();

    private FfiConverterTypeOtpEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58929zUr interfaceC58929zUr) {
        Intrinsics.checkNotNullParameter(interfaceC58929zUr, "");
        if (interfaceC58929zUr instanceof C58933zUv) {
            return Long.valueOf(((C58933zUv) interfaceC58929zUr).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58929zUr createFromHandle(long j) {
        return new C58933zUv(C60184zxu.INSTANCE, j);
    }
}
