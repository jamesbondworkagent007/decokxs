package uniffi.retail_kline;

import o.BhB;
import o.C4578Bjg;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeMarketEventsWsManagerWrapper extends BaseFfiConverterTypeLong<BhB> {
    public static final int $stable = 0;
    public static final FfiConverterTypeMarketEventsWsManagerWrapper INSTANCE = new FfiConverterTypeMarketEventsWsManagerWrapper();

    private FfiConverterTypeMarketEventsWsManagerWrapper() {
        super(C4578Bjg.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public BhB lift(long j) {
        return new BhB(C60184zxu.INSTANCE, j);
    }
}
