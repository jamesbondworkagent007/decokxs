package uniffi.environment;

import kotlin.jvm.internal.Intrinsics;
import o.AGR;
import o.AGS;
import o.C2338AHx;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeAppInfoInterface extends BaseFfiConverterType<AGR> {
    public static final int $stable = 0;
    public static final FfiConverterTypeAppInfoInterface INSTANCE = new FfiConverterTypeAppInfoInterface();

    private FfiConverterTypeAppInfoInterface() {
        super(C2338AHx.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull AGR agr) {
        Intrinsics.checkNotNullParameter(agr, "");
        if (agr instanceof AGS) {
            return Long.valueOf(((AGS) agr).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public AGR createFromHandle(long j) {
        return new AGS(C60184zxu.INSTANCE, j);
    }
}
