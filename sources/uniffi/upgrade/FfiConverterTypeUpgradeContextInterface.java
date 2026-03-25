package uniffi.upgrade;

import kotlin.jvm.internal.Intrinsics;
import o.BtU;
import o.BtV;
import o.BuB;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes14.dex */
public final class FfiConverterTypeUpgradeContextInterface extends BaseFfiConverterType<BtU> {
    public static final int $stable = 0;
    public static final FfiConverterTypeUpgradeContextInterface INSTANCE = new FfiConverterTypeUpgradeContextInterface();

    private FfiConverterTypeUpgradeContextInterface() {
        super(BuB.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull BtU btU) {
        Intrinsics.checkNotNullParameter(btU, "");
        if (btU instanceof BtV) {
            return Long.valueOf(((BtV) btU).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public BtU createFromHandle(long j) {
        return new BtV(C60184zxu.INSTANCE, j);
    }
}
