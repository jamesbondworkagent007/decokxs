package uniffi.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import o.AUE;
import o.AUI;
import o.C2692AVo;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeCoreLinkDependencyHelper extends BaseFfiConverterType<AUI> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoreLinkDependencyHelper INSTANCE = new FfiConverterTypeCoreLinkDependencyHelper();

    private FfiConverterTypeCoreLinkDependencyHelper() {
        super(C2692AVo.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull AUI aui) {
        Intrinsics.checkNotNullParameter(aui, "");
        if (aui instanceof AUE) {
            return Long.valueOf(((AUE) aui).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public AUI createFromHandle(long j) {
        return new AUE(C60184zxu.INSTANCE, j);
    }
}
