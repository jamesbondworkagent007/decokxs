package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58533zFx;
import o.zFC;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMfaOtpEventCallback extends BaseFfiConverterType<InterfaceC58533zFx> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaOtpEventCallback INSTANCE = new FfiConverterTypeMfaOtpEventCallback();

    private FfiConverterTypeMfaOtpEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58533zFx interfaceC58533zFx) {
        Intrinsics.checkNotNullParameter(interfaceC58533zFx, "");
        if (interfaceC58533zFx instanceof zFC) {
            return Long.valueOf(((zFC) interfaceC58533zFx).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58533zFx createFromHandle(long j) {
        return new zFC(C60184zxu.INSTANCE, j);
    }
}
