package uniffi.lifecycle;

import kotlin.jvm.internal.Intrinsics;
import o.ASU;
import o.ASV;
import o.C2692AVo;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeCoreDeeplinkParsedInfo extends BaseFfiConverterType<ASU> {
    public static final int $stable = 0;
    public static final FfiConverterTypeCoreDeeplinkParsedInfo INSTANCE = new FfiConverterTypeCoreDeeplinkParsedInfo();

    private FfiConverterTypeCoreDeeplinkParsedInfo() {
        super(C2692AVo.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull ASU asu) {
        Intrinsics.checkNotNullParameter(asu, "");
        if (asu instanceof ASV) {
            return Long.valueOf(((ASV) asu).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public ASU createFromHandle(long j) {
        return new ASV(C60184zxu.INSTANCE, j);
    }
}
