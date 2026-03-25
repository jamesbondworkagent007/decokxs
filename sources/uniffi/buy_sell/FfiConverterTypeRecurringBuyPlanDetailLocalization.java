package uniffi.buy_sell;

import kotlin.jvm.internal.Intrinsics;
import o.C3722ArM;
import o.C3852Atk;
import o.C60184zxu;
import o.InterfaceC3849Ath;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeRecurringBuyPlanDetailLocalization extends BaseFfiConverterType<InterfaceC3849Ath> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanDetailLocalization INSTANCE = new FfiConverterTypeRecurringBuyPlanDetailLocalization();

    private FfiConverterTypeRecurringBuyPlanDetailLocalization() {
        super(C3722ArM.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3849Ath interfaceC3849Ath) {
        Intrinsics.checkNotNullParameter(interfaceC3849Ath, "");
        if (interfaceC3849Ath instanceof C3852Atk) {
            return Long.valueOf(((C3852Atk) interfaceC3849Ath).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3849Ath createFromHandle(long j) {
        return new C3852Atk(C60184zxu.INSTANCE, j);
    }
}
