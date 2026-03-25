package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zPL;
import o.zPO;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceSyncEventCallback extends BaseFfiConverterType<zPO> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceSyncEventCallback INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceSyncEventCallback();

    private FfiConverterTypeOkxPasskeyCrossDeviceSyncEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zPO zpo) {
        Intrinsics.checkNotNullParameter(zpo, "");
        if (zpo instanceof zPL) {
            return Long.valueOf(((zPL) zpo).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zPO createFromHandle(long j) {
        return new zPL(C60184zxu.INSTANCE, j);
    }
}
