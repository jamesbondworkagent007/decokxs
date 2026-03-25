package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zKK;
import o.zKN;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceConfirmStateCallback extends BaseFfiConverterType<zKK> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceConfirmStateCallback INSTANCE = new FfiConverterTypeNewDeviceConfirmStateCallback();

    private FfiConverterTypeNewDeviceConfirmStateCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zKK zkk) {
        Intrinsics.checkNotNullParameter(zkk, "");
        if (zkk instanceof zKN) {
            return Long.valueOf(((zKN) zkk).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zKK createFromHandle(long j) {
        return new zKN(C60184zxu.INSTANCE, j);
    }
}
