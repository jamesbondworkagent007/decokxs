package uniffi.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import o.ASC;
import o.ASE;
import o.C2692AVo;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeCoreDeeplinkMetadata extends BaseFfiConverterType<ASC> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoreDeeplinkMetadata INSTANCE = new FfiConverterTypeCoreDeeplinkMetadata();

    private FfiConverterTypeCoreDeeplinkMetadata() {
        super(C2692AVo.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull ASC asc) {
        Intrinsics.checkNotNullParameter(asc, "");
        if (asc instanceof ASE) {
            return Long.valueOf(((ASE) asc).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public ASC createFromHandle(long j) {
        return new ASE(C60184zxu.INSTANCE, j);
    }
}
