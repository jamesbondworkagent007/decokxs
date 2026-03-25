package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58662zKr;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58663zKs;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceConfirmEventCallback extends BaseFfiConverterType<InterfaceC58663zKs> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceConfirmEventCallback INSTANCE = new FfiConverterTypeNewDeviceConfirmEventCallback();

    private FfiConverterTypeNewDeviceConfirmEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58663zKs interfaceC58663zKs) {
        Intrinsics.checkNotNullParameter(interfaceC58663zKs, "");
        if (interfaceC58663zKs instanceof C58662zKr) {
            return Long.valueOf(((C58662zKr) interfaceC58663zKs).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58663zKs createFromHandle(long j) {
        return new C58662zKr(C60184zxu.INSTANCE, j);
    }
}
