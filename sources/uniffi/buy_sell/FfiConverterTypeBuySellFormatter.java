package uniffi.buy_sell;

import kotlin.jvm.internal.Intrinsics;
import o.C3697Aqo;
import o.C3722ArM;
import o.C60184zxu;
import o.InterfaceC3696Aqn;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeBuySellFormatter extends BaseFfiConverterType<InterfaceC3696Aqn> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBuySellFormatter INSTANCE = new FfiConverterTypeBuySellFormatter();

    private FfiConverterTypeBuySellFormatter() {
        super(C3722ArM.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3696Aqn interfaceC3696Aqn) {
        Intrinsics.checkNotNullParameter(interfaceC3696Aqn, "");
        if (interfaceC3696Aqn instanceof C3697Aqo) {
            return Long.valueOf(((C3697Aqo) interfaceC3696Aqn).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3696Aqn createFromHandle(long j) {
        return new C3697Aqo(C60184zxu.INSTANCE, j);
    }
}
