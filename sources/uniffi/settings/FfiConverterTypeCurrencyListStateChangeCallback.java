package uniffi.settings;

import kotlin.jvm.internal.Intrinsics;
import o.BmG;
import o.BmH;
import o.BoN;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeCurrencyListStateChangeCallback extends BaseFfiConverterType<BmG> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCurrencyListStateChangeCallback INSTANCE = new FfiConverterTypeCurrencyListStateChangeCallback();

    private FfiConverterTypeCurrencyListStateChangeCallback() {
        super(BoN.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull BmG bmG) {
        Intrinsics.checkNotNullParameter(bmG, "");
        if (bmG instanceof BmH) {
            return Long.valueOf(((BmH) bmG).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public BmG createFromHandle(long j) {
        return new BmH(C60184zxu.INSTANCE, j);
    }
}
