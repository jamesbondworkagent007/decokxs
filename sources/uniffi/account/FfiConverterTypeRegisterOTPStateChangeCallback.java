package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C2938AcX;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC2933AcS;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRegisterOTPStateChangeCallback extends BaseFfiConverterType<InterfaceC2933AcS> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterOTPStateChangeCallback INSTANCE = new FfiConverterTypeRegisterOTPStateChangeCallback();

    private FfiConverterTypeRegisterOTPStateChangeCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2933AcS interfaceC2933AcS) {
        Intrinsics.checkNotNullParameter(interfaceC2933AcS, "");
        if (interfaceC2933AcS instanceof C2938AcX) {
            return Long.valueOf(((C2938AcX) interfaceC2933AcS).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2933AcS createFromHandle(long j) {
        return new C2938AcX(C60184zxu.INSTANCE, j);
    }
}
