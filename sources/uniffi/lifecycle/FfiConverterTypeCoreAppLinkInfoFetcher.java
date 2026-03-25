package uniffi.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import o.ARA;
import o.ARC;
import o.C2692AVo;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeCoreAppLinkInfoFetcher extends BaseFfiConverterType<ARC> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoreAppLinkInfoFetcher INSTANCE = new FfiConverterTypeCoreAppLinkInfoFetcher();

    private FfiConverterTypeCoreAppLinkInfoFetcher() {
        super(C2692AVo.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull ARC arc) {
        Intrinsics.checkNotNullParameter(arc, "");
        if (arc instanceof ARA) {
            return Long.valueOf(((ARA) arc).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public ARC createFromHandle(long j) {
        return new ARA(C60184zxu.INSTANCE, j);
    }
}
