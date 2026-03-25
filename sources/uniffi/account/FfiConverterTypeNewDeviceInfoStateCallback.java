package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58695zLx;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58691zLt;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceInfoStateCallback extends BaseFfiConverterType<InterfaceC58691zLt> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceInfoStateCallback INSTANCE = new FfiConverterTypeNewDeviceInfoStateCallback();

    private FfiConverterTypeNewDeviceInfoStateCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58691zLt interfaceC58691zLt) {
        Intrinsics.checkNotNullParameter(interfaceC58691zLt, "");
        if (interfaceC58691zLt instanceof C58695zLx) {
            return Long.valueOf(((C58695zLx) interfaceC58691zLt).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58691zLt createFromHandle(long j) {
        return new C58695zLx(C60184zxu.INSTANCE, j);
    }
}
