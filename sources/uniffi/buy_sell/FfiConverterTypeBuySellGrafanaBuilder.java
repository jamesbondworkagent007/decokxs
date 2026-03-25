package uniffi.buy_sell;

import o.C3668AqL;
import o.C3722ArM;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes25.dex */
public final class FfiConverterTypeBuySellGrafanaBuilder extends BaseFfiConverterTypeLong<C3668AqL> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBuySellGrafanaBuilder INSTANCE = new FfiConverterTypeBuySellGrafanaBuilder();

    private FfiConverterTypeBuySellGrafanaBuilder() {
        super(C3722ArM.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C3668AqL lift(long j) {
        return new C3668AqL(C60184zxu.INSTANCE, j);
    }
}
