package uniffi.wallet;

import kotlin.jvm.internal.Intrinsics;
import o.BCE;
import o.BCt;
import o.BCu;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes14.dex */
public final class FfiConverterTypeWalletHeaderProvider extends BaseFfiConverterType<BCu> {
    public static final int $stable = 0;
    public static final FfiConverterTypeWalletHeaderProvider INSTANCE = new FfiConverterTypeWalletHeaderProvider();

    private FfiConverterTypeWalletHeaderProvider() {
        super(BCE.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull BCu bCu) {
        Intrinsics.checkNotNullParameter(bCu, "");
        if (bCu instanceof BCt) {
            return Long.valueOf(((BCt) bCu).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public BCu createFromHandle(long j) {
        return new BCt(C60184zxu.INSTANCE, j);
    }
}
