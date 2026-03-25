package uniffi.upgrade;

import kotlin.jvm.internal.Intrinsics;
import o.BtM;
import o.BtN;
import o.BuB;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOKUserFactory extends BaseFfiConverterType<BtM> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKUserFactory INSTANCE = new FfiConverterTypeOKUserFactory();

    private FfiConverterTypeOKUserFactory() {
        super(BuB.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull BtM btM) {
        Intrinsics.checkNotNullParameter(btM, "");
        if (btM instanceof BtN) {
            return Long.valueOf(((BtN) btM).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public BtM createFromHandle(long j) {
        return new BtN(C60184zxu.INSTANCE, j);
    }
}
