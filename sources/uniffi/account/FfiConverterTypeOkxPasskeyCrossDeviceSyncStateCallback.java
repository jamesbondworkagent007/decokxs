package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zQA;
import o.zQB;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceSyncStateCallback extends BaseFfiConverterType<zQB> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceSyncStateCallback INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceSyncStateCallback();

    private FfiConverterTypeOkxPasskeyCrossDeviceSyncStateCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zQB zqb) {
        Intrinsics.checkNotNullParameter(zqb, "");
        if (zqb instanceof zQA) {
            return Long.valueOf(((zQA) zqb).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zQB createFromHandle(long j) {
        return new zQA(C60184zxu.INSTANCE, j);
    }
}
