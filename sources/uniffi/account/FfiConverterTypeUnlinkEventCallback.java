package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C3212Ahg;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC3213Ahh;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeUnlinkEventCallback extends BaseFfiConverterType<InterfaceC3213Ahh> {
    public static final int $stable = 0;
    public static final FfiConverterTypeUnlinkEventCallback INSTANCE = new FfiConverterTypeUnlinkEventCallback();

    private FfiConverterTypeUnlinkEventCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3213Ahh interfaceC3213Ahh) {
        Intrinsics.checkNotNullParameter(interfaceC3213Ahh, "");
        if (interfaceC3213Ahh instanceof C3212Ahg) {
            return Long.valueOf(((C3212Ahg) interfaceC3213Ahh).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3213Ahh createFromHandle(long j) {
        return new C3212Ahg(C60184zxu.INSTANCE, j);
    }
}
