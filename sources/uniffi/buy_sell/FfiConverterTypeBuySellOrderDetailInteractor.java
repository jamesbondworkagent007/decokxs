package uniffi.buy_sell;

import o.C3722ArM;
import o.C3738Arc;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeBuySellOrderDetailInteractor extends BaseFfiConverterTypeLong<C3738Arc> {
    public static final int $stable = 0;
    public static final FfiConverterTypeBuySellOrderDetailInteractor INSTANCE = new FfiConverterTypeBuySellOrderDetailInteractor();

    private FfiConverterTypeBuySellOrderDetailInteractor() {
        super(C3722ArM.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public C3738Arc lift(long j) {
        return new C3738Arc(C60184zxu.INSTANCE, j);
    }
}
