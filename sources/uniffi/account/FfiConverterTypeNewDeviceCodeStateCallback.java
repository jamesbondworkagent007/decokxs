package uniffi.account;

import kotlin.jvm.internal.Intrinsics;
import o.C58653zKi;
import o.C60184zxu;
import o.C60230zyn;
import o.InterfaceC58652zKh;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes17.dex */
public final class FfiConverterTypeNewDeviceCodeStateCallback extends BaseFfiConverterType<InterfaceC58652zKh> {
    public static final int $stable = 0;
    public static final FfiConverterTypeNewDeviceCodeStateCallback INSTANCE = new FfiConverterTypeNewDeviceCodeStateCallback();

    private FfiConverterTypeNewDeviceCodeStateCallback() {
        super(C60230zyn.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC58652zKh interfaceC58652zKh) {
        Intrinsics.checkNotNullParameter(interfaceC58652zKh, "");
        if (interfaceC58652zKh instanceof C58653zKi) {
            return Long.valueOf(((C58653zKi) interfaceC58652zKh).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC58652zKh createFromHandle(long j) {
        return new C58653zKi(C60184zxu.INSTANCE, j);
    }
}
