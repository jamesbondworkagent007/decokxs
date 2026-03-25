package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58781zPc;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58780zPb;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceMasterConnectingStateCallback extends BaseFfiConverterType<InterfaceC58780zPb> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceMasterConnectingStateCallback INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceMasterConnectingStateCallback();

    private FfiConverterTypeOkxPasskeyCrossDeviceMasterConnectingStateCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58780zPb interfaceC58780zPb) {
        Intrinsics.checkNotNullParameter(interfaceC58780zPb, "");
        if (interfaceC58780zPb instanceof C58781zPc) {
            return Long.valueOf(((C58781zPc) interfaceC58780zPb).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58780zPb createFromHandle(long j) {
        return new C58781zPc(C60184zxu.INSTANCE, j);
    }
}
