package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58766zOn;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58767zOo;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeOkxPasskeyCrossDeviceMasterAuthenticateStateCallback extends BaseFfiConverterType<InterfaceC58767zOo> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOkxPasskeyCrossDeviceMasterAuthenticateStateCallback INSTANCE = new FfiConverterTypeOkxPasskeyCrossDeviceMasterAuthenticateStateCallback();

    private FfiConverterTypeOkxPasskeyCrossDeviceMasterAuthenticateStateCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58767zOo interfaceC58767zOo) {
        Intrinsics.checkNotNullParameter(interfaceC58767zOo, "");
        if (interfaceC58767zOo instanceof C58766zOn) {
            return Long.valueOf(((C58766zOn) interfaceC58767zOo).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58767zOo createFromHandle(long j) {
        return new C58766zOn(C60184zxu.INSTANCE, j);
    }
}
