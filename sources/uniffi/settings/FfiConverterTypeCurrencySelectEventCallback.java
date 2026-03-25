package uniffi.settings;

import kotlin.jvm.internal.Intrinsics;
import o.BmQ;
import o.BmS;
import o.BoN;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeCurrencySelectEventCallback extends BaseFfiConverterType<BmS> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCurrencySelectEventCallback INSTANCE = new FfiConverterTypeCurrencySelectEventCallback();

    private FfiConverterTypeCurrencySelectEventCallback() {
        super(BoN.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull BmS bmS) {
        Intrinsics.checkNotNullParameter(bmS, "");
        if (bmS instanceof BmQ) {
            return Long.valueOf(((BmQ) bmS).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public BmS createFromHandle(long j) {
        return new BmQ(C60184zxu.INSTANCE, j);
    }
}
