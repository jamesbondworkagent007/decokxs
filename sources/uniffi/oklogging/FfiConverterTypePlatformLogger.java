package uniffi.oklogging;

import kotlin.jvm.internal.Intrinsics;
import o.BfX;
import o.C4493Bgc;
import o.C60184zxu;
import o.InterfaceC4494Bgd;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypePlatformLogger extends BaseFfiConverterType<InterfaceC4494Bgd> {
    public static final int $stable = 0;
    public static final FfiConverterTypePlatformLogger INSTANCE = new FfiConverterTypePlatformLogger();

    private FfiConverterTypePlatformLogger() {
        super(BfX.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC4494Bgd interfaceC4494Bgd) {
        Intrinsics.checkNotNullParameter(interfaceC4494Bgd, "");
        if (interfaceC4494Bgd instanceof C4493Bgc) {
            return Long.valueOf(((C4493Bgc) interfaceC4494Bgd).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC4494Bgd createFromHandle(long j) {
        return new C4493Bgc(C60184zxu.INSTANCE, j);
    }
}
