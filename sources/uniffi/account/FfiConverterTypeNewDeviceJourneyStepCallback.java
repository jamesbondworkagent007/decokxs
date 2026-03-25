package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58700zMb;
import o.zLZ;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceJourneyStepCallback extends BaseFfiConverterType<InterfaceC58700zMb> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceJourneyStepCallback INSTANCE = new FfiConverterTypeNewDeviceJourneyStepCallback();

    private FfiConverterTypeNewDeviceJourneyStepCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58700zMb interfaceC58700zMb) {
        Intrinsics.checkNotNullParameter(interfaceC58700zMb, "");
        if (interfaceC58700zMb instanceof zLZ) {
            return Long.valueOf(((zLZ) interfaceC58700zMb).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58700zMb createFromHandle(long j) {
        return new zLZ(C60184zxu.INSTANCE, j);
    }
}
