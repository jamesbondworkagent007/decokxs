package uniffi.buy_sell;

import kotlin.jvm.internal.Intrinsics;
import o.C3722ArM;
import o.C3754Ars;
import o.C60184zxu;
import o.InterfaceC3752Arq;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeBuySellOrderDetailLocalization extends BaseFfiConverterType<InterfaceC3752Arq> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBuySellOrderDetailLocalization INSTANCE = new FfiConverterTypeBuySellOrderDetailLocalization();

    private FfiConverterTypeBuySellOrderDetailLocalization() {
        super(C3722ArM.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3752Arq interfaceC3752Arq) {
        Intrinsics.checkNotNullParameter(interfaceC3752Arq, "");
        if (interfaceC3752Arq instanceof C3754Ars) {
            return Long.valueOf(((C3754Ars) interfaceC3752Arq).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3752Arq createFromHandle(long j) {
        return new C3754Ars(C60184zxu.INSTANCE, j);
    }
}
