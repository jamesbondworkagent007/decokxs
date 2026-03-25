package uniffi.buy_sell;

import kotlin.jvm.internal.Intrinsics;
import o.C3722ArM;
import o.C3909Aup;
import o.C60184zxu;
import o.InterfaceC3910Auq;
import org.jetbrains.annotations.NotNull;
import uniffi.BaseFfiConverterType;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeRecurringBuyPlanListLocalization extends BaseFfiConverterType<InterfaceC3910Auq> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanListLocalization INSTANCE = new FfiConverterTypeRecurringBuyPlanListLocalization();

    private FfiConverterTypeRecurringBuyPlanListLocalization() {
        super(C3722ArM.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method merged with bridge method: getRustHandle(Ljava/lang/Object;)Ljava/lang/Long; */
    @Override // uniffi.BaseFfiConverterType
    public Long getRustHandle(@NotNull InterfaceC3910Auq interfaceC3910Auq) {
        Intrinsics.checkNotNullParameter(interfaceC3910Auq, "");
        if (interfaceC3910Auq instanceof C3909Aup) {
            return Long.valueOf(((C3909Aup) interfaceC3910Auq).uniffiCloneHandle());
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: createFromHandle(J)Ljava/lang/Object; */
    @Override // uniffi.BaseFfiConverterType
    public InterfaceC3910Auq createFromHandle(long j) {
        return new C3909Aup(C60184zxu.INSTANCE, j);
    }
}
