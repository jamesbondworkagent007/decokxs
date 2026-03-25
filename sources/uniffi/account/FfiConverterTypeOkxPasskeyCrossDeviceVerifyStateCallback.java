package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zRN;
import o.zRO;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceVerifyStateCallback extends BaseFfiConverterType<zRO> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceVerifyStateCallback INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceVerifyStateCallback();

    private FfiConverterTypeOkxPasskeyCrossDeviceVerifyStateCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zRO zro) {
        Intrinsics.checkNotNullParameter(zro, "");
        if (zro instanceof zRN) {
            return Long.valueOf(((zRN) zro).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zRO createFromHandle(long j) {
        return new zRN(C60184zxu.INSTANCE, j);
    }
}
