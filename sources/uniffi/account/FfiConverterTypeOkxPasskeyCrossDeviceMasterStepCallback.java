package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zPB;
import o.zPJ;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceMasterStepCallback extends BaseFfiConverterType<zPB> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceMasterStepCallback INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceMasterStepCallback();

    private FfiConverterTypeOkxPasskeyCrossDeviceMasterStepCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zPB zpb) {
        Intrinsics.checkNotNullParameter(zpb, "");
        if (zpb instanceof zPJ) {
            return Long.valueOf(((zPJ) zpb).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zPB createFromHandle(long j) {
        return new zPJ(C60184zxu.INSTANCE, j);
    }
}
