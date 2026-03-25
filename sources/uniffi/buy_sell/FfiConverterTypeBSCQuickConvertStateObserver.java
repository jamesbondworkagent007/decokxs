package uniffi.buy_sell;

import kotlin.jvm.internal.Intrinsics;
import o.C3653Apx;
import o.C3722ArM;
import o.C60184zxu;
import o.InterfaceC3650Apu;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeBSCQuickConvertStateObserver extends BaseFfiConverterType<InterfaceC3650Apu> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBSCQuickConvertStateObserver INSTANCE = new FfiConverterTypeBSCQuickConvertStateObserver();

    private FfiConverterTypeBSCQuickConvertStateObserver() {
        super(C3722ArM.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3650Apu interfaceC3650Apu) {
        Intrinsics.checkNotNullParameter(interfaceC3650Apu, "");
        if (interfaceC3650Apu instanceof C3653Apx) {
            return Long.valueOf(((C3653Apx) interfaceC3650Apu).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3650Apu createFromHandle(long j) {
        return new C3653Apx(C60184zxu.INSTANCE, j);
    }
}
