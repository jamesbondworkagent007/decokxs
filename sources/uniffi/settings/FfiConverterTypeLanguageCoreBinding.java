package uniffi.settings;

import kotlin.jvm.internal.Intrinsics;
import o.BnI;
import o.BnN;
import o.BoN;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeLanguageCoreBinding extends BaseFfiConverterType<BnI> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLanguageCoreBinding INSTANCE = new FfiConverterTypeLanguageCoreBinding();

    private FfiConverterTypeLanguageCoreBinding() {
        super(BoN.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull BnI bnI) {
        Intrinsics.checkNotNullParameter(bnI, "");
        if (bnI instanceof BnN) {
            return Long.valueOf(((BnN) bnI).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public BnI createFromHandle(long j) {
        return new BnN(C60184zxu.INSTANCE, j);
    }
}
