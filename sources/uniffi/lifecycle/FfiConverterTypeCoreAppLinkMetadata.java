package uniffi.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import o.ARK;
import o.ARL;
import o.C2692AVo;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeCoreAppLinkMetadata extends BaseFfiConverterType<ARK> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoreAppLinkMetadata INSTANCE = new FfiConverterTypeCoreAppLinkMetadata();

    private FfiConverterTypeCoreAppLinkMetadata() {
        super(C2692AVo.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull ARK ark) {
        Intrinsics.checkNotNullParameter(ark, "");
        if (ark instanceof ARL) {
            return Long.valueOf(((ARL) ark).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public ARK createFromHandle(long j) {
        return new ARL(C60184zxu.INSTANCE, j);
    }
}
