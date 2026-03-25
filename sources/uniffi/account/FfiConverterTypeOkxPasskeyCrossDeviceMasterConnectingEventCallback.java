package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58776zOx;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58772zOt;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceMasterConnectingEventCallback extends BaseFfiConverterType<InterfaceC58772zOt> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceMasterConnectingEventCallback INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceMasterConnectingEventCallback();

    private FfiConverterTypeOkxPasskeyCrossDeviceMasterConnectingEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58772zOt interfaceC58772zOt) {
        Intrinsics.checkNotNullParameter(interfaceC58772zOt, "");
        if (interfaceC58772zOt instanceof C58776zOx) {
            return Long.valueOf(((C58776zOx) interfaceC58772zOt).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58772zOt createFromHandle(long j) {
        return new C58776zOx(C60184zxu.INSTANCE, j);
    }
}
