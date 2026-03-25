package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C3135AgI;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC3133AgG;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeTrustedDeviceVerifyCallback extends BaseFfiConverterType<InterfaceC3133AgG> {
    public static final int $stable = 0;
    public static final FfiConverterTypeTrustedDeviceVerifyCallback INSTANCE = new FfiConverterTypeTrustedDeviceVerifyCallback();

    private FfiConverterTypeTrustedDeviceVerifyCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3133AgG interfaceC3133AgG) {
        Intrinsics.checkNotNullParameter(interfaceC3133AgG, "");
        if (interfaceC3133AgG instanceof C3135AgI) {
            return Long.valueOf(((C3135AgI) interfaceC3133AgG).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3133AgG createFromHandle(long j) {
        return new C3135AgI(C60184zxu.INSTANCE, j);
    }
}
