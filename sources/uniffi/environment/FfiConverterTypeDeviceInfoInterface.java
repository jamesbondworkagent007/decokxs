package uniffi.environment;

import kotlin.jvm.internal.Intrinsics;
import o.C2320AHf;
import o.C2338AHx;
import o.C60184zxu;
import o.InterfaceC2322AHh;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeDeviceInfoInterface extends BaseFfiConverterType<InterfaceC2322AHh> {
    public static final int $stable = 0;
    public static final FfiConverterTypeDeviceInfoInterface INSTANCE = new FfiConverterTypeDeviceInfoInterface();

    private FfiConverterTypeDeviceInfoInterface() {
        super(C2338AHx.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC2322AHh interfaceC2322AHh) {
        Intrinsics.checkNotNullParameter(interfaceC2322AHh, "");
        if (interfaceC2322AHh instanceof C2320AHf) {
            return Long.valueOf(((C2320AHf) interfaceC2322AHh).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC2322AHh createFromHandle(long j) {
        return new C2320AHf(C60184zxu.INSTANCE, j);
    }
}
