package uniffi.buy_sell;

import kotlin.jvm.internal.Intrinsics;
import o.C3722ArM;
import o.C3821AtF;
import o.C60184zxu;
import o.InterfaceC3825AtJ;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeRecurringBuyPlanDetailStateObserver extends BaseFfiConverterType<InterfaceC3825AtJ> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanDetailStateObserver INSTANCE = new FfiConverterTypeRecurringBuyPlanDetailStateObserver();

    private FfiConverterTypeRecurringBuyPlanDetailStateObserver() {
        super(C3722ArM.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3825AtJ interfaceC3825AtJ) {
        Intrinsics.checkNotNullParameter(interfaceC3825AtJ, "");
        if (interfaceC3825AtJ instanceof C3821AtF) {
            return Long.valueOf(((C3821AtF) interfaceC3825AtJ).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3825AtJ createFromHandle(long j) {
        return new C3821AtF(C60184zxu.INSTANCE, j);
    }
}
