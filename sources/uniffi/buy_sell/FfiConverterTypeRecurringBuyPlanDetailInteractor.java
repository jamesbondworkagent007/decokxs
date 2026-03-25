package uniffi.buy_sell;

import o.C3722ArM;
import o.C3766AsD;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeRecurringBuyPlanDetailInteractor extends BaseFfiConverterTypeLong<C3766AsD> {
    public static final int $stable = 0;
    public static final FfiConverterTypeRecurringBuyPlanDetailInteractor INSTANCE = new FfiConverterTypeRecurringBuyPlanDetailInteractor();

    private FfiConverterTypeRecurringBuyPlanDetailInteractor() {
        super(C3722ArM.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C3766AsD lift(long j) {
        return new C3766AsD(C60184zxu.INSTANCE, j);
    }
}
