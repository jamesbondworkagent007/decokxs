package uniffi.buy_sell;

import kotlin.jvm.internal.Intrinsics;
import o.C3722ArM;
import o.C3918Auz;
import o.C60184zxu;
import o.InterfaceC3869AuA;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeRecurringBuyPlanListStateObserver extends BaseFfiConverterType<InterfaceC3869AuA> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanListStateObserver INSTANCE = new FfiConverterTypeRecurringBuyPlanListStateObserver();

    private FfiConverterTypeRecurringBuyPlanListStateObserver() {
        super(C3722ArM.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3869AuA interfaceC3869AuA) {
        Intrinsics.checkNotNullParameter(interfaceC3869AuA, "");
        if (interfaceC3869AuA instanceof C3918Auz) {
            return Long.valueOf(((C3918Auz) interfaceC3869AuA).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3869AuA createFromHandle(long j) {
        return new C3918Auz(C60184zxu.INSTANCE, j);
    }
}
