package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C3167Ago;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC3163Agk;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeTrustedDeviceOtpEventCallback extends BaseFfiConverterType<InterfaceC3163Agk> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTrustedDeviceOtpEventCallback INSTANCE = new FfiConverterTypeTrustedDeviceOtpEventCallback();

    private FfiConverterTypeTrustedDeviceOtpEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3163Agk interfaceC3163Agk) {
        Intrinsics.checkNotNullParameter(interfaceC3163Agk, "");
        if (interfaceC3163Agk instanceof C3167Ago) {
            return Long.valueOf(((C3167Ago) interfaceC3163Agk).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3163Agk createFromHandle(long j) {
        return new C3167Ago(C60184zxu.INSTANCE, j);
    }
}
