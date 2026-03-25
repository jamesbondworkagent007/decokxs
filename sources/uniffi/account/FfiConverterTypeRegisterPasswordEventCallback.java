package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C2996Adc;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC2939AcY;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRegisterPasswordEventCallback extends BaseFfiConverterType<InterfaceC2939AcY> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterPasswordEventCallback INSTANCE = new FfiConverterTypeRegisterPasswordEventCallback();

    private FfiConverterTypeRegisterPasswordEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2939AcY interfaceC2939AcY) {
        Intrinsics.checkNotNullParameter(interfaceC2939AcY, "");
        if (interfaceC2939AcY instanceof C2996Adc) {
            return Long.valueOf(((C2996Adc) interfaceC2939AcY).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2939AcY createFromHandle(long j) {
        return new C2996Adc(C60184zxu.INSTANCE, j);
    }
}
