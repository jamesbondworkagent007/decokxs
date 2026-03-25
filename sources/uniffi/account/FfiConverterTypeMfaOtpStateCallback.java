package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zFU;
import o.zFX;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeMfaOtpStateCallback extends BaseFfiConverterType<zFU> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMfaOtpStateCallback INSTANCE = new FfiConverterTypeMfaOtpStateCallback();

    private FfiConverterTypeMfaOtpStateCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zFU zfu) {
        Intrinsics.checkNotNullParameter(zfu, "");
        if (zfu instanceof zFX) {
            return Long.valueOf(((zFX) zfu).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zFU createFromHandle(long j) {
        return new zFX(C60184zxu.INSTANCE, j);
    }
}
