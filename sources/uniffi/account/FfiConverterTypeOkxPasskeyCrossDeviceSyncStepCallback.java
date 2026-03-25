package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zQJ;
import o.zQM;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceSyncStepCallback extends BaseFfiConverterType<zQJ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceSyncStepCallback INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceSyncStepCallback();

    private FfiConverterTypeOkxPasskeyCrossDeviceSyncStepCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zQJ zqj) {
        Intrinsics.checkNotNullParameter(zqj, "");
        if (zqj instanceof zQM) {
            return Long.valueOf(((zQM) zqj).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zQJ createFromHandle(long j) {
        return new zQM(C60184zxu.INSTANCE, j);
    }
}
