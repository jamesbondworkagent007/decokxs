package uniffi.network;

import kotlin.jvm.internal.Intrinsics;
import o.AZA;
import o.AZE;
import o.C4298Bav;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeLegacyDownloadTask extends BaseFfiConverterType<AZE> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLegacyDownloadTask INSTANCE = new FfiConverterTypeLegacyDownloadTask();

    private FfiConverterTypeLegacyDownloadTask() {
        super(C4298Bav.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull AZE aze) {
        Intrinsics.checkNotNullParameter(aze, "");
        if (aze instanceof AZA) {
            return Long.valueOf(((AZA) aze).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public AZE createFromHandle(long j) {
        return new AZA(C60184zxu.INSTANCE, j);
    }
}
