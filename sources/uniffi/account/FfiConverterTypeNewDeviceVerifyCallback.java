package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58751zNz;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58746zNu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceVerifyCallback extends BaseFfiConverterType<InterfaceC58746zNu> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceVerifyCallback INSTANCE = new FfiConverterTypeNewDeviceVerifyCallback();

    private FfiConverterTypeNewDeviceVerifyCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58746zNu interfaceC58746zNu) {
        Intrinsics.checkNotNullParameter(interfaceC58746zNu, "");
        if (interfaceC58746zNu instanceof C58751zNz) {
            return Long.valueOf(((C58751zNz) interfaceC58746zNu).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58746zNu createFromHandle(long j) {
        return new C58751zNz(C60184zxu.INSTANCE, j);
    }
}
