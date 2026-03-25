package uniffi.buy_sell;

import kotlin.jvm.internal.Intrinsics;
import o.C3722ArM;
import o.C3953Avh;
import o.C60184zxu;
import o.InterfaceC3950Ave;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeRecurringBuyPlanOrderListLocalization extends BaseFfiConverterType<InterfaceC3950Ave> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanOrderListLocalization INSTANCE = new FfiConverterTypeRecurringBuyPlanOrderListLocalization();

    private FfiConverterTypeRecurringBuyPlanOrderListLocalization() {
        super(C3722ArM.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3950Ave interfaceC3950Ave) {
        Intrinsics.checkNotNullParameter(interfaceC3950Ave, "");
        if (interfaceC3950Ave instanceof C3953Avh) {
            return Long.valueOf(((C3953Avh) interfaceC3950Ave).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3950Ave createFromHandle(long j) {
        return new C3953Avh(C60184zxu.INSTANCE, j);
    }
}
