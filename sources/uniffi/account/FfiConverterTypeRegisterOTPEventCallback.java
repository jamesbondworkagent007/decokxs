package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C2965Acy;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC2962Acv;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRegisterOTPEventCallback extends BaseFfiConverterType<InterfaceC2962Acv> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterOTPEventCallback INSTANCE = new FfiConverterTypeRegisterOTPEventCallback();

    private FfiConverterTypeRegisterOTPEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2962Acv interfaceC2962Acv) {
        Intrinsics.checkNotNullParameter(interfaceC2962Acv, "");
        if (interfaceC2962Acv instanceof C2965Acy) {
            return Long.valueOf(((C2965Acy) interfaceC2962Acv).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2962Acv createFromHandle(long j) {
        return new C2965Acy(C60184zxu.INSTANCE, j);
    }
}
