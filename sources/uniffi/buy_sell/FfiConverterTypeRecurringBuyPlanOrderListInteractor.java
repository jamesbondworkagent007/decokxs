package uniffi.buy_sell;

import o.C3722ArM;
import o.C3879AuK;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeRecurringBuyPlanOrderListInteractor extends BaseFfiConverterTypeLong<C3879AuK> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanOrderListInteractor INSTANCE = new FfiConverterTypeRecurringBuyPlanOrderListInteractor();

    private FfiConverterTypeRecurringBuyPlanOrderListInteractor() {
        super(C3722ArM.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C3879AuK lift(long j) {
        return new C3879AuK(C60184zxu.INSTANCE, j);
    }
}
