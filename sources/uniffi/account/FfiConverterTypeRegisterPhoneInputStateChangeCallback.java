package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C3049Aec;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC3052Aef;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeRegisterPhoneInputStateChangeCallback extends BaseFfiConverterType<InterfaceC3052Aef> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRegisterPhoneInputStateChangeCallback INSTANCE = new FfiConverterTypeRegisterPhoneInputStateChangeCallback();

    private FfiConverterTypeRegisterPhoneInputStateChangeCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3052Aef interfaceC3052Aef) {
        Intrinsics.checkNotNullParameter(interfaceC3052Aef, "");
        if (interfaceC3052Aef instanceof C3049Aec) {
            return Long.valueOf(((C3049Aec) interfaceC3052Aef).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3052Aef createFromHandle(long j) {
        return new C3049Aec(C60184zxu.INSTANCE, j);
    }
}
