package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C60184zxu;
import o.C60230zyn;
import o.C60280zzk;
import o.InterfaceC60279zzj;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeBleDeviceDiscoveryCallback extends BaseFfiConverterType<InterfaceC60279zzj> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBleDeviceDiscoveryCallback INSTANCE = new FfiConverterTypeBleDeviceDiscoveryCallback();

    private FfiConverterTypeBleDeviceDiscoveryCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC60279zzj interfaceC60279zzj) {
        Intrinsics.checkNotNullParameter(interfaceC60279zzj, "");
        if (interfaceC60279zzj instanceof C60280zzk) {
            return Long.valueOf(((C60280zzk) interfaceC60279zzj).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC60279zzj createFromHandle(long j) {
        return new C60280zzk(C60184zxu.INSTANCE, j);
    }
}
