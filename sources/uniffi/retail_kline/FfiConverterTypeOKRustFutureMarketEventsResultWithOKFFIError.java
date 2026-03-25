package uniffi.retail_kline;

import o.BiL;
import o.C4578Bjg;
import o.C60184zxu;
import uniffi.BaseFfiConverterTypeLong;

/* JADX INFO: loaded from: classes13.dex */
public final class FfiConverterTypeOKRustFutureMarketEventsResultWithOKFFIError extends BaseFfiConverterTypeLong<BiL> {
    public static final int $stable = 0;
    public static final FfiConverterTypeOKRustFutureMarketEventsResultWithOKFFIError INSTANCE = new FfiConverterTypeOKRustFutureMarketEventsResultWithOKFFIError();

    private FfiConverterTypeOKRustFutureMarketEventsResultWithOKFFIError() {
        super(C4578Bjg.uniffiRustBuffer);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // uniffi.FfiConverter
    /* JADX INFO: renamed from: lift */
    public /* synthetic */ Object lift2(Long l) {
        return lift(l.longValue());
    }

    public BiL lift(long j) {
        return new BiL(C60184zxu.INSTANCE, j);
    }
}
