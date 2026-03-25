package uniffi.retail_trading;

import kotlin.jvm.internal.Intrinsics;
import o.BjF;
import o.BjI;
import o.BlA;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeDexListUpdateCallback extends BaseFfiConverterType<BjI> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDexListUpdateCallback INSTANCE = new FfiConverterTypeDexListUpdateCallback();

    private FfiConverterTypeDexListUpdateCallback() {
        super(BlA.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull BjI bjI) {
        Intrinsics.checkNotNullParameter(bjI, "");
        if (bjI instanceof BjF) {
            return Long.valueOf(((BjF) bjI).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public BjI createFromHandle(long j) {
        return new BjF(C60184zxu.INSTANCE, j);
    }
}
