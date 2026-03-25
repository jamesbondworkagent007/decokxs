package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58707zMi;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58701zMc;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceMultipleOtpEventCallback extends BaseFfiConverterType<InterfaceC58701zMc> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceMultipleOtpEventCallback INSTANCE = new FfiConverterTypeNewDeviceMultipleOtpEventCallback();

    private FfiConverterTypeNewDeviceMultipleOtpEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58701zMc interfaceC58701zMc) {
        Intrinsics.checkNotNullParameter(interfaceC58701zMc, "");
        if (interfaceC58701zMc instanceof C58707zMi) {
            return Long.valueOf(((C58707zMi) interfaceC58701zMc).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58701zMc createFromHandle(long j) {
        return new C58707zMi(C60184zxu.INSTANCE, j);
    }
}
