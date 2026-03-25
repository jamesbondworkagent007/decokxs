package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zMG;
import o.zMH;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceMultipleOtpStateCallback extends BaseFfiConverterType<zMH> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceMultipleOtpStateCallback INSTANCE = new FfiConverterTypeNewDeviceMultipleOtpStateCallback();

    private FfiConverterTypeNewDeviceMultipleOtpStateCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zMH zmh) {
        Intrinsics.checkNotNullParameter(zmh, "");
        if (zmh instanceof zMG) {
            return Long.valueOf(((zMG) zmh).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zMH createFromHandle(long j) {
        return new zMG(C60184zxu.INSTANCE, j);
    }
}
