package uniffi.buy_sell;

import kotlin.jvm.internal.Intrinsics;
import o.C3722ArM;
import o.C3964Avs;
import o.C60184zxu;
import o.InterfaceC3963Avr;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeRecurringBuyPlanOrderListStateObserver extends BaseFfiConverterType<InterfaceC3963Avr> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanOrderListStateObserver INSTANCE = new FfiConverterTypeRecurringBuyPlanOrderListStateObserver();

    private FfiConverterTypeRecurringBuyPlanOrderListStateObserver() {
        super(C3722ArM.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3963Avr interfaceC3963Avr) {
        Intrinsics.checkNotNullParameter(interfaceC3963Avr, "");
        if (interfaceC3963Avr instanceof C3964Avs) {
            return Long.valueOf(((C3964Avs) interfaceC3963Avr).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3963Avr createFromHandle(long j) {
        return new C3964Avs(C60184zxu.INSTANCE, j);
    }
}
