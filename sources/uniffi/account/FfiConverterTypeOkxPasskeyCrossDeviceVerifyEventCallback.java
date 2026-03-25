package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zQT;
import o.zQU;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceVerifyEventCallback extends BaseFfiConverterType<zQT> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceVerifyEventCallback INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceVerifyEventCallback();

    private FfiConverterTypeOkxPasskeyCrossDeviceVerifyEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zQT zqt) {
        Intrinsics.checkNotNullParameter(zqt, "");
        if (zqt instanceof zQU) {
            return Long.valueOf(((zQU) zqt).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zQT createFromHandle(long j) {
        return new zQU(C60184zxu.INSTANCE, j);
    }
}
