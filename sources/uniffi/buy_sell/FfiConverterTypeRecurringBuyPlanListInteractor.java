package uniffi.buy_sell;

import o.C3722ArM;
import o.C3833AtR;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeRecurringBuyPlanListInteractor extends BaseFfiConverterTypeLong<C3833AtR> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanListInteractor INSTANCE = new FfiConverterTypeRecurringBuyPlanListInteractor();

    private FfiConverterTypeRecurringBuyPlanListInteractor() {
        super(C3722ArM.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C3833AtR lift(long j) {
        return new C3833AtR(C60184zxu.INSTANCE, j);
    }
}
