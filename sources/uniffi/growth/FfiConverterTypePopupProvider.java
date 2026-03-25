package uniffi.growth;

import kotlin.jvm.internal.Intrinsics;
import o.ANQ;
import o.AOQ;
import o.AOU;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypePopupProvider extends BaseFfiConverterType<AOQ> {
    public static final int $stable = 0;
    public static final FfiConverterTypePopupProvider INSTANCE = new FfiConverterTypePopupProvider();

    private FfiConverterTypePopupProvider() {
        super(ANQ.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull AOQ aoq) {
        Intrinsics.checkNotNullParameter(aoq, "");
        if (aoq instanceof AOU) {
            return Long.valueOf(((AOU) aoq).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public AOQ createFromHandle(long j) {
        return new AOU(C60184zxu.INSTANCE, j);
    }
}
