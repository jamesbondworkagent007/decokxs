package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.zLJ;
import o.zLM;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceJourneyEventCallback extends BaseFfiConverterType<zLM> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceJourneyEventCallback INSTANCE = new FfiConverterTypeNewDeviceJourneyEventCallback();

    private FfiConverterTypeNewDeviceJourneyEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull zLM zlm) {
        Intrinsics.checkNotNullParameter(zlm, "");
        if (zlm instanceof zLJ) {
            return Long.valueOf(((zLJ) zlm).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public zLM createFromHandle(long j) {
        return new zLJ(C60184zxu.INSTANCE, j);
    }
}
