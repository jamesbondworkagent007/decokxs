package uniffi.growth;

import kotlin.jvm.internal.Intrinsics;
import o.ANQ;
import o.APK;
import o.APR;
import o.C60184zxu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeSharePlatformManager extends BaseFfiConverterType<APK> {
    public static final int $stable = 0;
    public static final FfiConverterTypeSharePlatformManager INSTANCE = new FfiConverterTypeSharePlatformManager();

    private FfiConverterTypeSharePlatformManager() {
        super(ANQ.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull APK apk) {
        Intrinsics.checkNotNullParameter(apk, "");
        if (apk instanceof APR) {
            return Long.valueOf(((APR) apk).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public APK createFromHandle(long j) {
        return new APR(C60184zxu.INSTANCE, j);
    }
}
