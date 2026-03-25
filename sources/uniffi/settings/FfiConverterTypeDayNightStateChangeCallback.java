package uniffi.settings;

import kotlin.jvm.internal.Intrinsics;
import o.BnF;
import o.BnG;
import o.BoN;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeDayNightStateChangeCallback extends BaseFfiConverterType<BnG> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDayNightStateChangeCallback INSTANCE = new FfiConverterTypeDayNightStateChangeCallback();

    private FfiConverterTypeDayNightStateChangeCallback() {
        super(BoN.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull BnG bnG) {
        Intrinsics.checkNotNullParameter(bnG, "");
        if (bnG instanceof BnF) {
            return Long.valueOf(((BnF) bnG).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public BnG createFromHandle(long j) {
        return new BnF(C60184zxu.INSTANCE, j);
    }
}
