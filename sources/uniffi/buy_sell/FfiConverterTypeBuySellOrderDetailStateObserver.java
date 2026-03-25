package uniffi.buy_sell;

import kotlin.jvm.internal.Intrinsics;
import o.C3722ArM;
import o.C3761Arz;
import o.C60184zxu;
import o.InterfaceC3712ArC;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeBuySellOrderDetailStateObserver extends BaseFfiConverterType<InterfaceC3712ArC> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBuySellOrderDetailStateObserver INSTANCE = new FfiConverterTypeBuySellOrderDetailStateObserver();

    private FfiConverterTypeBuySellOrderDetailStateObserver() {
        super(C3722ArM.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3712ArC interfaceC3712ArC) {
        Intrinsics.checkNotNullParameter(interfaceC3712ArC, "");
        if (interfaceC3712ArC instanceof C3761Arz) {
            return Long.valueOf(((C3761Arz) interfaceC3712ArC).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3712ArC createFromHandle(long j) {
        return new C3761Arz(C60184zxu.INSTANCE, j);
    }
}
