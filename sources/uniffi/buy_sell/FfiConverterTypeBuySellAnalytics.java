package uniffi.buy_sell;

import o.C3609ApF;
import o.C3722ArM;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeBuySellAnalytics extends BaseFfiConverterTypeLong<C3609ApF> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBuySellAnalytics INSTANCE = new FfiConverterTypeBuySellAnalytics();

    private FfiConverterTypeBuySellAnalytics() {
        super(C3722ArM.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C3609ApF lift(long j) {
        return new C3609ApF(C60184zxu.INSTANCE, j);
    }
}
