package uniffi.growth;

import kotlin.jvm.internal.Intrinsics;
import o.ANQ;
import o.C2507AOk;
import o.C60184zxu;
import o.InterfaceC2502AOf;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypePlatformPackageCallback extends BaseFfiConverterType<InterfaceC2502AOf> {
    public static final int $stable = 0;
    public static final FfiConverterTypePlatformPackageCallback INSTANCE = new FfiConverterTypePlatformPackageCallback();

    private FfiConverterTypePlatformPackageCallback() {
        super(ANQ.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2502AOf interfaceC2502AOf) {
        Intrinsics.checkNotNullParameter(interfaceC2502AOf, "");
        if (interfaceC2502AOf instanceof C2507AOk) {
            return Long.valueOf(((C2507AOk) interfaceC2502AOf).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2502AOf createFromHandle(long j) {
        return new C2507AOk(C60184zxu.INSTANCE, j);
    }
}
