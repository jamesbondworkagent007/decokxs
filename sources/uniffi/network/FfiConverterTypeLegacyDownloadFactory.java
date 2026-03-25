package uniffi.network;

import kotlin.jvm.internal.Intrinsics;
import o.C2799AZr;
import o.C4298Bav;
import o.C60184zxu;
import o.InterfaceC2800AZs;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeLegacyDownloadFactory extends BaseFfiConverterType<InterfaceC2800AZs> {
    public static final int $stable = 0;
    public static final FfiConverterTypeLegacyDownloadFactory INSTANCE = new FfiConverterTypeLegacyDownloadFactory();

    private FfiConverterTypeLegacyDownloadFactory() {
        super(C4298Bav.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2800AZs interfaceC2800AZs) {
        Intrinsics.checkNotNullParameter(interfaceC2800AZs, "");
        if (interfaceC2800AZs instanceof C2799AZr) {
            return Long.valueOf(((C2799AZr) interfaceC2800AZs).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2800AZs createFromHandle(long j) {
        return new C2799AZr(C60184zxu.INSTANCE, j);
    }
}
